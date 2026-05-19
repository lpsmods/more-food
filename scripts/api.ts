import { Bridge } from "@lpsmods/mcaddon-bridge";
import { world } from "@minecraft/server";
import { AdvancedFoodUtils } from "./utils";

const api = new Bridge("lpsm_morefood");

api.defineProperty(world, "getBAC", {
  value: AdvancedFoodUtils.calculateBAC,
  writeable: false,
});
