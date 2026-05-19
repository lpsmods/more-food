import {
  CustomComponentParameters,
  ItemComponentConsumeEvent,
  ItemCustomComponent,
} from "@minecraft/server";
import { create, object, Struct } from "superstruct";
import { makeId } from "../utils";

export interface MintyOptions {}

export class MintyComponent implements ItemCustomComponent {
  static componentId = makeId("minty");
  struct: Struct<any, any> = object({});

  constructor() {
    // this.onConsume = this.onConsume.bind(this);
  }

  onConsume(
    event: ItemComponentConsumeEvent,
    args: CustomComponentParameters,
  ): void {
    const options = create(args.params, this.struct) as MintyOptions;
    console.warn(event);
  }
}
