import { EquipmentSlot } from "@minecraft/server";
import { decreasementStack } from "../classes/utils";

export class CakeComponent {
  constructor(stateName = "morefood:slice", maxSlices = 6) {
    this.stateName = stateName;
    this.maxSlices = maxSlices;
    this.candleCakes = {};
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
  }

  onPlayerInteract(e) {
    if (!this.placeCandle(e)) {
      this.eat(e);
    }
  }

  placeCandle(e) {
    const SLICES = e.block.permutation.getState(this.stateName);
    if (SLICES != 0) {
      return false;
    }
    const equ = e.player.getComponent("equippable");
    const mainhand = equ.getEquipment(EquipmentSlot.Mainhand);
    if (!mainhand) {
      return false;
    }
    const cake = this.candleCakes[mainhand.typeId];
    if (cake) {
      e.dimension.playSound("cake.add_candle", e.block.location);
      e.dimension.setBlockType(e.block.location, cake);
      decreasementStack(e.player, EquipmentSlot.Mainhand);
      return true;
    }
    return false;
  }

  eat(e) {
    e.player.addEffect('saturation', 100, {amplifier: 0, showParticles: false});
    var slice = e.block.permutation.getState(this.stateName);
    if (slice == this.maxSlices) {
      return e.dimension.setBlockType(e.block.location, "air");
    }
    // Decrease slice
    e.block.setPermutation(
      e.block.permutation.withState(this.stateName, slice + 1)
    );
  }

  addCandleCake(candleItem, cakeBlock) {
    this.candleCakes[candleItem] = cakeBlock;
    return this;
  }
}
