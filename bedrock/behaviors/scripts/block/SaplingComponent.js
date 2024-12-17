import { system } from "@minecraft/server";
import { Fertilizable } from "../classes/Fertilizable";

export class SaplingComponent extends Fertilizable {
  constructor(generator, stateName = "morefood:stage") {
    super(stateName);
    this.stateName = stateName;
    this.generator = generator;
    this.onRandomTick = this.onRandomTick.bind(this);
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
  }
  onPlayerInteract(e) {
    this.onFertilize(e);
  }

  onRandomTick(e) {
    // this.generate(e);
  }

  generate(e) {
    const STAGE = e.block.permutation.getState(this.stateName);
    if (STAGE == 0) {
      //   e.block.permutation.setState(this.stateName, STAGE + 1);
      e.block.setPermutation(
        e.block.permutation.withState(this.stateName, STAGE + 1)
      );
      this.update(e);
      return;
    }
    system.runJob(this.generator.generate(e));
  }

  // Fertilizable

  canGrow(e) {
    return true; // random.nextFloat() > 0.45;
  }

  grow(e) {
    this.generate(e);
  }
}
