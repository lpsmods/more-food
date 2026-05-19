import { StartupEvent, system } from "@minecraft/server";
import { registerItemComponents } from "./item";
import { registerBlockComponents } from "./block";
import "./registry";
import "./api";
import './integration/index';

function startup(event: StartupEvent): void {
  registerBlockComponents(event.blockComponentRegistry);
  registerItemComponents(event.itemComponentRegistry);
}

system.beforeEvents.startup.subscribe(startup);
