import { CropComponent } from "./CropComponent";

export class TallCropComponent extends CropComponent {
  static typeId = "morefood:tall_crop";
  constructor(
    stateName = "morefood:stage",
    halfName = "morefood:half",
    maxStage = 7
  ) {
    super(stateName, maxStage);
    this.halfName = halfName;
    this.beforeOnPlayerPlace = this.beforeOnPlayerPlace.bind(this);
    this.onPlace = this.onPlace.bind(this);
    this.onPlayerDestroy = this.onPlayerDestroy.bind(this);
  }

  canPlace(e) {
    const ABOVE = e.block.above();
    return ABOVE.typeId === "minecraft:air";
  }

  beforeOnPlayerPlace(e) {
    const baseBlock = e.block.below();
    e.cancel =
      !this.canPlace(e) ||
      (baseBlock.typeId === "minecraft:farmland" &&
        baseBlock.typeId === "minecraft:fertile_soil");
  }

  onPlace(e) {
    const HALF = e.block.permutation.getState(this.halfName);
    if (HALF == "top") {
      return false;
    }
    const ABOVE = e.block.above();
    if (ABOVE.typeId === "minecraft:air") {
      return ABOVE.setPermutation(
        e.block.permutation.withState(this.halfName, "top")
      );
    }
    this.destroy(e);
  }

  update(e) {
    const HALF = e.block.permutation.getState(this.halfName);
    if (HALF == "top") {
      e.block
        .below()
        .setPermutation(e.block.permutation.withState(this.halfName, "bottom"));
    }
    if (HALF == "bottom") {
      e.block
        .above()
        .setPermutation(e.block.permutation.withState(this.halfName, "top"));
    }
  }

  canGrow(e) {
    const stage = e.block.permutation.getState(this.stateName);
    const half = e.block.permutation.getState(this.halfName);
    return stage < this.maxStage && half == "bottom";
  }

  onPlayerDestroy(e) {
    const half = e.destroyedBlockPermutation.getState(this.halfName);
    if (half === "top") {
      this.destroy(e.block.below());
    }
  }

  destroy(block) {
    block.dimension.runCommand(`setblock ${ block.location.x } ${block.location.y } ${block.location.z} air destroy`)
  }
}
