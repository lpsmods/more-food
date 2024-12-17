import { Fertilizable } from "../classes/Fertilizable";
import { clamp, randomInt } from "../classes/utils";

export class CropComponent extends Fertilizable {
  static typeId = "morefood:crop";

  constructor(stateName = "morefood:stage", maxStage = 7) {
    super(stateName);
    this.maxStage = maxStage;
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
    this.onRandomTick = this.onRandomTick.bind(this);
  }

  onPlayerInteract(e) {
    this.onFertilize(e);
  }
  onRandomTick(e) {
    if (this.canGrow(e)) {
      this.grow(e);
    }
  }

  // Fertilizable
  canGrow(e) {
    const STAGE = e.block.permutation.getState(this.stateName);
    return STAGE < this.maxStage;
  }

  getGrowthAmount(e) {
    return randomInt(2, 5);
  }

  applyGrowth(e) {
    var i =
      e.block.permutation.getState(this.stateName) + this.getGrowthAmount(e);
    e.block.setPermutation(
      e.block.permutation.withState(this.stateName, clamp(i, 0, this.maxStage))
    );
    this.update(e);
  }

  grow(e) {
    this.applyGrowth(e);
  }
}
