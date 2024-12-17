import { EquipmentSlot, ItemStack } from "@minecraft/server";
import {
  replaceStack,
  oppositeDirection,
  directionToOffset,
} from "../classes/utils";

export class SpileComponent {
  static typeId = "morefood:spile";

  constructor(
    stateName = "morefood:sap_level",
    maxLevel = 5,
    bucket = "morefood:maple_sap_bucket"
  ) {
    this.stateName = stateName;
    this.maxLevel = maxLevel;
    this.bucket = bucket;
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
    this.onRandomTick = this.onRandomTick.bind(this);
    this.beforeOnPlayerPlace = this.beforeOnPlayerPlace.bind(this);
    this.onTick = this.onTick.bind(this);
  }

  validLog(block) {
    const axis = block.permutation.getState("pillar_axis");
    return (
      axis == "y" && (block.hasTag("log") || block.typeId.endsWith("_log"))
    );
  }

  canPlace(block) {
    return (
      this.validLog(block) &&
      (this.validLog(block.above()) || this.validLog(block.below()))
    );
  }

  beforeOnPlayerPlace(e) {
    const hit = e.player.getBlockFromViewDirection({
      includePassableBlocks: true,
    });
    e.cancel = ["Up", "Down"].includes(hit.face) || !this.canPlace(hit.block);
    if (e.cancel) {
      e.player.onScreenDisplay.setActionBar({
        translate: "action.morefood.must_be_tree",
      });
    }
  }

  onPlayerInteract(e) {
    var level = e.block.permutation.getState(this.stateName);
    if (level == this.maxLevel) {
      const equ = e.player.getComponent("equippable");
      const mainhand = equ.getEquipment(EquipmentSlot.Mainhand);
      if (mainhand && mainhand.typeId == "minecraft:bucket") {
        replaceStack(
          e.player,
          EquipmentSlot.Mainhand,
          new ItemStack(this.bucket)
        );
        e.block.setPermutation(
          e.block.permutation.withState(this.stateName, level - 1)
        );
      }
    }
  }

  isAttachedToTree(block) {
    const f = block.permutation.getState("minecraft:facing_direction");
    const b = block.offset(directionToOffset(oppositeDirection(f)));
    return this.canPlace(b);
  }

  onRandomTick(e) {
    var level = e.block.permutation.getState(this.stateName);
    // Sap cauldron
    const cauldron = e.block.below();
    if (cauldron.typeId == "minecraft:cauldron" && level == this.maxLevel) {
      e.dimension.setBlockType(cauldron.location, "morefood:sap_cauldron");
      e.block.setPermutation(e.block.permutation.withState(this.stateName, 0));
    }
    // Increase level
    if (level < this.maxLevel && this.isAttachedToTree(e.block)) {
      level += 1;
      e.block.setPermutation(
        e.block.permutation.withState(this.stateName, level)
      );
    }
  }

  onTick(e) {
    const f = e.block.permutation.getState("minecraft:facing_direction");
    const b = e.block.offset(directionToOffset(oppositeDirection(f)));
    if (b.isAir) {
      e.block.dimension.runCommand(
        `setblock ${e.block.x} ${e.block.y} ${e.block.z} air destroy`
      );
    }
  }
}
