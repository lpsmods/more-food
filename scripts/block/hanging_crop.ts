import { CropComponent, CropOptions, ItemUtils } from "@lpsmods/mc-utils";
import {
  BlockComponentPlayerInteractEvent,
  CustomComponentParameters,
  ItemStack,
} from "@minecraft/server";
import { makeId } from "../utils";

export interface HangingCropOptions extends CropOptions {
  item?: string;
}

export class HangingCropComponent extends CropComponent {
  static componentId = makeId("hanging_crop");

  constructor() {
    super();
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
  }

  pickItem(
    event: BlockComponentPlayerInteractEvent,
    options: HangingCropOptions,
  ): void {
    const POS = event.block.location;
    const WORLD = event.dimension;
    WORLD.spawnItem(
      new ItemStack(options.item ?? "sweet_berries", 1),
      event.block.bottomCenter(),
    );
    WORLD.playSound("block.sweet_berry_bush.pick", POS);
    event.block.setPermutation(
      event.block.permutation.withState(options.growth_state, 0),
    );
  }

  // EVENTS

  onPlayerInteract(
    event: BlockComponentPlayerInteractEvent,
    args: CustomComponentParameters,
  ): void {
    const options = args.params as HangingCropOptions;
    if (!event.player || ItemUtils.holding(event.player, "bone_meal")) return;
    this.pickItem(event, options);
  }
}
