import { ConfiguredFeature } from "./ConfiguredFeature";

export class SaplingGenerator {
  static typeId = "morefood:sapling";

  constructor(
    rareChance = 0.0,
    megaVariant = undefined,
    rareMegaVariant = undefined,
    regularVariant = undefined,
    rareRegularVariant = undefined,
    beesVariant = undefined,
    rareBeesVariant = undefined
  ) {
    this.rareChance = rareChance;
    this.megaVariant = megaVariant;
    this.rareMegaVariant = rareMegaVariant;
    this.regularVariant = regularVariant;
    this.rareRegularVariant = rareRegularVariant;
    this.beesVariant = beesVariant;
    this.rareBeesVariant = rareBeesVariant;
  }

  canGenerateLargeTree(e, x, z) {
    const world = e.dimension;
    const block = e.block.type;
    return (
      world.getBlock(pos.offset({ x: x, y: 0, z: z })).type == block &&
      world.getBlock(pos.offset({ x: x + 1, y: 0, z: z })).type == block &&
      world.getBlock(pos.offset({ x: x, y: 0, z: z + 1 })).type == block &&
      world.getBlock(pos.offset({ x: x + 1, y: 0, z: z + 1 })).type == block
    );
  }
  getSmallTreeFeature(flowersNearby) {
    if (Math.random() < this.rareChance) {
      if (flowersNearby && this.rareBeesVariant) {
        return this.rareBeesVariant;
      }
      if (this.rareRegularVariant) {
        return this.rareRegularVariant;
      }
    }
    if (flowersNearby && this.beesVariant) {
      return this.beesVariant;
    }
    return this.regularVariant;
  }
  getMegaTreeFeature() {
    if (this.rareMegaVariant && new Math.random() < this.rareChance) {
      return this.rareMegaVariant;
    }
    return this.megaVariant;
  }
  areFlowersNearby(e) {
    return false;
  }

  *generate(e, baseBlock = "dirt") {
    const tree1 = this.getMegaTreeFeature();
    const world = e.dimension;
    const pos = e.block.location;
    // Large tree
    if (tree1) {
      for (let i = 0; i >= -1; --i) {
        for (let j = 0; j >= -1; --j) {
          if (!this.canGenerateLargeTree(e, i, j)) continue;
          world.setBlockType(pos.offset({ x: i, y: 0, z: j }), "air");
          world.setBlockType(pos.offset({ x: i + 1, y: 0, z: j }), "air");
          world.setBlockType(pos.offset({ x: i, y: 0, z: j + 1 }), "air");
          world.setBlockType(pos.offset({ x: i + 1, y: 0, z: j + 1 }), "air");
          if (tree1.generate(e, pos.offset(i, 0, j), baseBlock)) {
            return true;
          }
          world.setBlockType(pos.offset({ x: i, y: 0, z: j }), e.block.type);
          world.setBlockType(
            pos.offset({ x: i + 1, y: 0, z: j }),
            e.block.type
          );
          world.setBlockType(
            pos.offset({ x: i, y: 0, z: j + 1 }),
            e.block.type
          );
          world.setBlockType(
            pos.offset({ x: i + 1, y: 0, z: j + 1 }),
            e.block.type
          );
          return false;
        }
      }
    }
    const tree2 = this.getSmallTreeFeature(this.areFlowersNearby(e));
    if (!tree2) return false;
    if (tree2.generate(e, pos, baseBlock)) {
      return true;
    }
    return false;
  }
}

export const APPLE_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:apple_tree"),
  undefined,
  undefined,
  undefined
);
export const ALMOND_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:almond_tree"),
  undefined,
  undefined,
  undefined
);
export const AVOCADO_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:avocado_tree"),
  undefined,
  undefined,
  undefined
);
export const BANANA_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:banana_tree", {x:-1, z:-1}),
  undefined,
  undefined,
  undefined
);
export const LEMON_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:lemon_tree"),
  undefined,
  undefined,
  undefined
);
export const OLIVE_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:olive_tree"),
  undefined,
  undefined,
  undefined
);
export const ORANGE_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:orange_tree"),
  undefined,
  undefined,
  undefined
);
export const PALM_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:palm_tree", {x:-3, z:-3}),
  undefined,
  undefined,
  undefined
);
export const PLUM_SAPLING = new SaplingGenerator(
  undefined,
  undefined,
  undefined,
  new ConfiguredFeature("morefoodtree:plum_tree"),
  undefined,
  undefined,
  undefined
);
