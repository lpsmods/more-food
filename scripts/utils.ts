import { Entity } from "@minecraft/server";
import { Gender, PROJECT_ID } from "./constants";

export function makeId(path: string): string {
  return `${PROJECT_ID}:${path}`;
}

export class AdvancedFoodUtils {
  /**
   * Calculate blood alcohol content.
   * @param {Entity} entity
   * @returns {number}
   */
  static calculateBAC(entity: Entity): number {
    const proof = (entity.getDynamicProperty(makeId("proof")) as number) ?? 0;
    const volumeOz = (entity.getDynamicProperty(makeId("volume_oz")) as number) ?? 0;
    const hoursSinceFirstDrink = (entity.getDynamicProperty(makeId("last_drink_time")) as number) ?? 0;
    const gender = (entity.getDynamicProperty(makeId("gender")) as Gender) ?? "male";
    const bodyWeightLb = gender === Gender.Male ? 180 : (gender === Gender.Female ? 160 : 165 ); // other
    const abv = proof / 2 / 100;
    const alcoholOz = volumeOz * abv;
    const r = gender === Gender.Male ? 0.73 : (gender === Gender.Female ? 0.66 : 0.695);
    const bac = (alcoholOz * 5.14) / (bodyWeightLb * r) - 0.015 * hoursSinceFirstDrink;
    return Math.max(0, Number(bac.toFixed(4)));
  }
}
