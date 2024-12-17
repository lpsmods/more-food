import { ItemStack } from "@minecraft/server";
import { CropComponent } from "./CropComponent";

export class HangingCropComponent extends CropComponent {
  constructor(cropItem, stateName = "morefood:stage", maxStage = 7) {
    super(stateName, maxStage);
    this.cropItem = cropItem;
  }

  onPlayerInteract(e) {
    if (!this.onFertilize(e)) {
      const STAGE = e.block.permutation.getState(this.stateName);
      if (STAGE == this.maxStage) {
        this.pickItem(e, STAGE);
      }
    }
  }

  pickItem(e, stage) {
    const POS = e.block.location;
    const WORLD = e.dimension;
    WORLD.spawnItem(new ItemStack(this.cropItem, 1), e.block.bottomCenter());
    WORLD.playSound("block.sweet_berry_bush.pick", POS);
    e.block.setPermutation(e.block.permutation.withState(this.stateName, 0));
    this.update(e);
  }
}
