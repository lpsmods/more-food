/**
 * Support for Storage Drawers
 */
import { world, system } from "@minecraft/server";
import { makeId } from "../utils";

interface CompactingRecipe {
  topSlot: string;
  bottomSlot: string;
  bottomSlotCount: number;
}

function registerRecipe(recipe: CompactingRecipe): void {
  system.sendScriptEvent("ftb_sd:register_compacting_recipe", JSON.stringify(recipe));
}

world.afterEvents.worldLoad.subscribe((event) => {
  registerRecipe({ topSlot: makeId("almond_bushel"), bottomSlot: makeId("almond"), bottomSlotCount: 9 });
});
