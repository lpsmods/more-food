import { world } from "@minecraft/server";
import { registerBlockComponents, registerItemComponents } from "./registry";

function worldInitialize(e) {
  registerBlockComponents(e.blockComponentRegistry);
  registerItemComponents(e.itemComponentRegistry);
}

// TODO
// function playerSpawn(e) {
//   if (e.initialSpawn && !e.player.hasTag("morefoodSpawn")) {
//     const inv = e.player.getComponent("minecraft:inventory");
//     inv.container.addItem(new ItemStack("minecraft:book"));
//     e.player.addTag("morefoodSpawn");
//   }
// }
// world.afterEvents.playerSpawn.subscribe(playerSpawn);
world.beforeEvents.worldInitialize.subscribe(worldInitialize);
