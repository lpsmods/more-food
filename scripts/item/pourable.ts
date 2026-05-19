import {
  CustomComponentParameters,
  EquipmentSlot,
  ItemComponentUseEvent,
  ItemCustomComponent,
  ItemStack,
} from "@minecraft/server";
import { create, defaulted, object, string, Struct } from "superstruct";
import { makeId } from "../utils";

export interface PourableOptions {
  empty_item: string;
  filled_item: string;
}

export class PourableComponent implements ItemCustomComponent {
  static componentId = makeId("pourable");
  struct: Struct<any, any> = object({
    empty_item: defaulted(string(), "glass_bottle"),
    filled_item: defaulted(string(), "potion"),
  });

  constructor() {
    this.onUse = this.onUse.bind(this);
  }

  canPour(event: ItemComponentUseEvent, options: PourableOptions): boolean {
    if (!event.itemStack) return false;
    const emptyItem = options.empty_item ?? "glass_bottle";
    const inv = event.source.getComponent("inventory");
    const dur = event.itemStack.getComponent("durability");
    const equ = event.source.getComponent("equippable");
    if (!equ) {
      return false;
    }
    const offhand = equ.getEquipment(EquipmentSlot.Offhand);
    if (!inv || !dur || !offhand) return false;
    return offhand.typeId === emptyItem && dur.damage < dur.maxDurability;
  }

  pour(event: ItemComponentUseEvent, options: PourableOptions): boolean {
    console.warn("pour");
    if (!event.itemStack) return false;
    const filledItem = options.filled_item;
    const emptyItem = options.empty_item;
    const inv = event.source.getComponent("inventory");
    const equ = event.source.getComponent("equippable");
    const dur = event.itemStack.getComponent("durability");
    if (!inv || !equ || !dur) return false;
    const offhand = equ.getEquipment(EquipmentSlot.Offhand);
    if (!offhand) return false;
    const stack = new ItemStack(filledItem);
    inv.container.addItem(stack);
    if (offhand.amount === 1) {
      return equ.setEquipment(EquipmentSlot.Offhand);
    }
    equ.setEquipment(
      EquipmentSlot.Offhand,
      new ItemStack(emptyItem, offhand.amount - 1),
    );
    dur.damage += 1;
    equ.setEquipment(EquipmentSlot.Mainhand, event.itemStack);
    return true;
  }

  // EVENTS

  onUse(event: ItemComponentUseEvent, args: CustomComponentParameters): void {
    const options = create(args.params, this.struct) as PourableOptions;
    if (!this.canPour(event, options)) {
      return;
    }
    this.pour(event, options);
  }
}
