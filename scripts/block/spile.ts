import {
  Block,
  BlockComponentPlayerInteractEvent,
  BlockComponentPlayerPlaceBeforeEvent,
  BlockComponentRandomTickEvent,
  BlockComponentTickEvent,
  CustomComponentParameters,
  EquipmentSlot,
  ItemStack,
} from "@minecraft/server";
import { BlockStateSuperset } from "@minecraft/vanilla-data";
import { replaceStack } from "../classes/utils";
import { create, defaulted, number, object, string, Struct } from "superstruct";
import { makeId } from "../utils";
import { DirectionUtils } from "@lpsmods/mc-utils";

export interface SpileOptions {
  sap_state: keyof BlockStateSuperset;
  max_level: number;
  bucket: string;
}

export class SpileComponent {
  static componentId = makeId("spile");
  struct: Struct<any, any> = object({
    sap_state: defaulted(string(), makeId("sap_level")),
    max_level: defaulted(number(), 5),
    bucket: defaulted(string(), makeId("maple_sap_bucket")),
  });
  constructor() {
    this.onPlayerInteract = this.onPlayerInteract.bind(this);
    this.onRandomTick = this.onRandomTick.bind(this);
    this.beforeOnPlayerPlace = this.beforeOnPlayerPlace.bind(this);
    this.onTick = this.onTick.bind(this);
  }

  validLog(block: Block): boolean {
    const axis = block.permutation.getState("pillar_axis");
    return (
      axis == "y" && (block.hasTag("log") || block.typeId.endsWith("_log"))
    );
  }

  canPlace(block: Block): boolean {
    const above = block.above();
    if (!above) return false;
    const below = block.below();
    if (!below) return false;
    return (
      this.validLog(block) && (this.validLog(above) || this.validLog(below))
    );
  }

  isAttachedToTree(block: Block): boolean {
    const facing = block.permutation.getState("minecraft:facing_direction");
    const facingBlock = block.offset(
      DirectionUtils.toOffset(DirectionUtils.getOpposite(facing)),
    );
    if (!facingBlock) return false;
    return this.canPlace(facingBlock);
  }

  // EVENTS

  beforeOnPlayerPlace(
    event: BlockComponentPlayerPlaceBeforeEvent,
    args: CustomComponentParameters,
  ): void {
    const options = create(args.params, this.struct) as SpileOptions;
    if (!event.player) return;
    const hit = event.player.getBlockFromViewDirection({
      includePassableBlocks: true,
    });
    if (!hit) return;
    event.cancel =
      ["Up", "Down"].includes(hit.face) || !this.canPlace(hit.block);
    if (event.cancel) {
      event.player.onScreenDisplay.setActionBar({
        translate: "action.morefood.must_be_tree",
      });
    }
  }

  onPlayerInteract(
    event: BlockComponentPlayerInteractEvent,
    args: CustomComponentParameters,
  ): void {
    const options = create(args.params, this.struct) as SpileOptions;
    if (!event.player) return;
    var level = event.block.permutation.getState(options.sap_state) as number;
    if (level == options.max_level) {
      const equ = event.player.getComponent("equippable");
      if (!equ) return;
      const mainhand = equ.getEquipment(EquipmentSlot.Mainhand);
      if (mainhand && mainhand.typeId == "minecraft:bucket") {
        replaceStack(
          event.player,
          EquipmentSlot.Mainhand,
          new ItemStack(options.bucket),
        );
        event.block.setPermutation(
          event.block.permutation.withState(options.sap_state, level - 1),
        );
      }
    }
  }

  onRandomTick(
    event: BlockComponentRandomTickEvent,
    args: CustomComponentParameters,
  ): void {
    const options = create(args.params, this.struct) as SpileOptions;
    var level = event.block.permutation.getState(options.sap_state) as number;
    // Sap cauldron
    const cauldron = event.block.below();
    if (
      cauldron &&
      cauldron.typeId == "minecraft:cauldron" &&
      level == options.max_level
    ) {
      event.dimension.setBlockType(cauldron.location, makeId("sap_cauldron"));
      event.block.setPermutation(
        event.block.permutation.withState(options.sap_state, 0),
      );
    }
    // Increase level
    if (level < options.max_level && this.isAttachedToTree(event.block)) {
      level += 1;
      event.block.setPermutation(
        event.block.permutation.withState(options.sap_state, level),
      );
    }
  }

  onTick(
    event: BlockComponentTickEvent,
    args: CustomComponentParameters,
  ): void {
    const options = create(args.params, this.struct) as SpileOptions;
    const facing = event.block.permutation.getState(
      "minecraft:facing_direction",
    );
    const block = event.block.offset(
      DirectionUtils.toOffset(DirectionUtils.getOpposite(facing)),
    );
    if (block && block.isAir) {
      event.block.dimension.runCommand(
        `setblock ${event.block.x} ${event.block.y} ${event.block.z} air destroy`,
      );
    }
  }
}
