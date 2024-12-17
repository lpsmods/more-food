export class ConfiguredFeature {
  constructor(feature, config = { x: -2, z: -2 }) {
    this.feature = feature;
    this.config = config;
  }

  generate(e, pos, baseBlock) {
    const dim = e.dimension;
    const X = pos.x;
    const Y = pos.y;
    const Z = pos.z;

    dim.runCommand(
      `structure load ${this.feature} ${X + this.config.x} ${Y} ${
        Z + this.config.z
      }`
    );
    dim.setBlockType({ x: X, y: Y - 1, z: Z }, baseBlock);
    return false;
  }
}
