import { EquipmentSlot } from "@minecraft/server";
import { decreasementStack } from "./utils";

export class Fertilizable {
  constructor(stateName = "morefood:stage") {
    this.stateName = stateName;
  }
  onFertilize(e) {
    const equp = e.player.getComponent("equippable");
    if (equp && this.isFertilizable(e)) {
      const mainhand = equp.getEquipment(EquipmentSlot.Mainhand);
      if (mainhand && mainhand.typeId == "minecraft:bone_meal") {
        if (this.canGrow(e)) {
          var pos = e.block.location; // Fix pos
          pos.x += 0.5;
          pos.y += 0.5;
          pos.z += 0.5;
          e.dimension.spawnParticle("minecraft:crop_growth_emitter", pos);
          e.dimension.playSound("item.bone_meal.use", pos);
          this.grow(e);
          if (e.player.getGameMode() === "survival") {
            decreasementStack(e.player, EquipmentSlot.Mainhand);
          }
          return true;
        }
      }
    }
    return false;
  }

  isFertilizable(e) {
    return e.block.hasTag("fertilizable");
  }
  canGrow(e) {
    return false;
  }
  grow(e) {}

  update(e) {}
}
