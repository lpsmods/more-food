import { ItemStack } from "@minecraft/server";
import { inRange, randomInt } from "../classes/utils";
import { CropComponent } from "./CropComponent";

export class BushComponent extends CropComponent {
  constructor(cropItem, stateName = "morefood:stage", maxStage = 7) {
    super(stateName, maxStage);
    this.cropItem = cropItem;
  }

  onPlayerInteract(e) {
    if (!this.onFertilize(e)) {
      const STAGE = e.block.permutation.getState(this.stateName);
      if (inRange(STAGE, 4, this.maxStage)) {
        this.pickBush(e, STAGE);
      }
    }
  }

  pickBush(e, stage) {
    const POS = e.block.location;
    const WORLD = e.dimension;
    if (inRange(stage, 4, 5)) {
      WORLD.spawnItem(
        new ItemStack(this.cropItem, randomInt(1, 2)),
        e.block.bottomCenter()
      );
    }
    if (inRange(stage, 6, this.maxStage)) {
      WORLD.spawnItem(
        new ItemStack(this.cropItem, randomInt(2, 3)),
        e.block.bottomCenter()
      );
    }
    WORLD.playSound("block.sweet_berry_bush.pick", POS);
    e.block.setPermutation(e.block.permutation.withState(this.stateName, 2));
  }
}
