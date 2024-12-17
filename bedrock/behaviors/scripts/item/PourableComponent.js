import { EquipmentSlot, ItemStack } from "@minecraft/server";

export class PourableComponent {
  constructor(emptyItem, filledItem) {
    this.emptyItem = emptyItem;
    this.filledItem = filledItem;
    this.onUse = this.onUse.bind(this);
  }

  canPour(e) {
    const inv = e.source.getComponent("inventory");
    const dur = e.itemStack.getComponent("durability");
    const equ = e.source.getComponent("equippable");
    if (!equ) {
      return false;
    }
    const offhand = equ.getEquipment(EquipmentSlot.Offhand);
    return (
      inv &&
      dur &&
      offhand &&
      offhand.typeId === this.emptyItem &&
      dur.damage < dur.maxDurability
    );
  }

  pour(e) {
    console.warn("pour");
    const inv = e.source.getComponent("inventory");
    const equ = e.source.getComponent("equippable");
    const dur = e.itemStack.getComponent("durability");
    const offhand = equ.getEquipment(EquipmentSlot.Offhand);
    const stack = new ItemStack(this.filledItem);
    inv.container.addItem(stack);
    if (offhand.amount === 1) {
      return equ.setEquipment(EquipmentSlot.Offhand);
    }
    equ.setEquipment(
      EquipmentSlot.Offhand,
      new ItemStack(this.emptyItem, offhand.amount - 1)
    );
    dur.damage += 1;
    equ.setEquipment(EquipmentSlot.Mainhand, e.itemStack);
  }

  onUse(e) {
    if (!this.canPour(e)) {
      return;
    }
    this.pour(e);
  }
}
