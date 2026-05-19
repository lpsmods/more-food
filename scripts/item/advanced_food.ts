import { number, object, optional, Struct } from "superstruct";
import { makeId } from "../utils";
import { CustomComponentParameters, ItemComponentConsumeEvent, ItemCustomComponent } from "@minecraft/server";

export interface AdvancedFoodOptions {
  /**
   * alcohol proof
   */
  alcohol_proof?: number;

  /**
   * Size in fluid ounces
   */
  fluid_oz?: number;

  /**
   * Heat rating
   */
  scoville?: number;

  //   brix?: number; // sugar content (°Bx)
  //   salinity?: number; // salt % by weight
  //   ph?: number; // acidity
  //   bitterness_units?: number; // like IBU for beer
  //   toxicity?: number; // risk factor
  //   hydration?: number; // hydration effect
  //   shelf_life?: number; // How long it lasts on shelfs.
}

export class AdvancedFoodComponent implements ItemCustomComponent {
  static componentId = makeId("advanced_food");
  struct: Struct<any, any> = object({
    alcohol_proof: optional(number()),
    volume_oz: optional(number()),
    scoville: optional(number()),
  });

  constructor() {
    this.onConsume = this.onConsume.bind(this);
  }

  onConsume(event: ItemComponentConsumeEvent, args: CustomComponentParameters) {
    const options = this.struct.create(args.params) as AdvancedFoodOptions;
    console.warn("Consume!");
  }
}
