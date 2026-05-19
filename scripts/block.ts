import { BlockComponentRegistry } from "@minecraft/server";
import {
  BushComponent,
  CakeComponent,
  CandleCakeComponent,
  CropComponent,
  FertilizableComponent,
  LayeredCauldronComponent,
  LeavesComponent,
  MultiblockComponent,
  SaplingComponent,
} from "@lpsmods/mc-utils";

import { SpileComponent } from "./block/spile";
import { HangingCropComponent } from "./block/hanging_crop";
import { makeId } from "./utils";

export function registerBlockComponents(registry: BlockComponentRegistry): void {
  // Custom
  registry.registerCustomComponent(SpileComponent.componentId, new SpileComponent());
  registry.registerCustomComponent(HangingCropComponent.componentId, new HangingCropComponent());

  // mc-utils
  registry.registerCustomComponent(makeId("bush"), new BushComponent());
  registry.registerCustomComponent(makeId("crop"), new CropComponent());
  registry.registerCustomComponent(makeId("sapling"), new SaplingComponent());
  registry.registerCustomComponent(makeId("fertilizable"), new FertilizableComponent());
  registry.registerCustomComponent(makeId("multiblock"), new MultiblockComponent());
  registry.registerCustomComponent(makeId("cake"), new CakeComponent());
  registry.registerCustomComponent(makeId("candle_cake"), new CandleCakeComponent());
  registry.registerCustomComponent(makeId("layered_cauldron"), new LayeredCauldronComponent());
  registry.registerCustomComponent(makeId("leaves"), new LeavesComponent());
}
