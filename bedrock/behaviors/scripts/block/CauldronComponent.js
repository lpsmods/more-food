import { ItemStack, EquipmentSlot } from "@minecraft/server";
import { replaceStack } from "../classes/utils";

export class CauldronComponent {
  constructor() {
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
    this.items = {};
  }
  onPlayerInteract(e) {
    const equ = e.player.getComponent("equippable");
    const mainhand = equ.getEquipment(EquipmentSlot.Mainhand);
    if (this.items[mainhand.typeId]) {
      const stack = new ItemStack(this.items[mainhand.typeId]);
      replaceStack(e.player, EquipmentSlot.Mainhand, stack);
      e.block.setType("minecraft:cauldron");
      this.update(e);
    }
  }
  addBucket(bucket, filledBucket) {
    this.items[bucket] = filledBucket;
  }

  update(e) {}
}
