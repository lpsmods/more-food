import { BlockPermutation, EquipmentSlot, ItemStack } from "@minecraft/server";

export class CandleCakeComponent {
  constructor(
    candleItem = "minecraft:candle",
    cakeBlock = "minecraft:cake",
    stateName = "morefood:lit",
    sliceName = "morefood:slice"
  ) {
    this.stateName = stateName;
    this.candleItem = candleItem;
    this.cakeBlock = cakeBlock;
    this.sliceName = sliceName;
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
  }

  onPlayerInteract(e) {
    const LIT = e.block.permutation.getState(this.stateName);
    if (this.hasLightable(e)) {
      this.setLit(e);
      return true;
    }
    if (LIT && !this.hasLightable(e)) {
      this.setLit(e, false);
    } else {
      this.eat(e);
    }
  }

  setLit(e, value = true) {
    console.warn("LIT " + value.toString());
    e.block.setPermutation(
      e.block.permutation.withState(this.stateName, value)
    );
  }

  eat(e) {
    e.player.addEffect('saturation', 100, {amplifier: 0, showParticles: false});
    e.block.dimension.spawnItem(new ItemStack(this.candleItem), e.block.center());
    const BLOCK = BlockPermutation.resolve(this.cakeBlock);
    e.block.setPermutation(BLOCK.withState(this.sliceName, 1));
  }

  hasLightable(e) {
    const equ = e.player.getComponent("equippable");
    const mainhand = equ.getEquipment(EquipmentSlot.Mainhand);
    if (!mainhand) {
      return false;
    }
    if (
      mainhand.typeId == "minecraft:flint_and_steel" ||
      mainhand.typeId == "minecraft:fire_charge"
    ) {
      return true;
    }
    return false;
  }
}
