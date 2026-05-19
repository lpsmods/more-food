import {
  CustomComponentParameters,
  EquipmentSlot,
  ItemComponentUseEvent,
  ItemCustomComponent,
} from "@minecraft/server";
import { create, defaulted, object, string, Struct } from "superstruct";
import { makeId } from "../utils";

export interface MREOptions {
  table: string;
}

export class MREComponent implements ItemCustomComponent {
  static componentId = makeId("meal_ready_to_eat");
  struct: Struct<any, any> = object({
    table: defaulted(string(), "mre"),
  });

  constructor() {
    this.onUse = this.onUse.bind(this);
  }

  // EVENTS

  onUse(event: ItemComponentUseEvent, args: CustomComponentParameters): void {
    const options = create(args.params, this.struct) as MREOptions;
    const e = event.source.getComponent("equippable");
    e &&
      (e.setEquipment(EquipmentSlot.Mainhand),
      event.source.runCommand("loot give @s loot " + options.table));
  }
}
