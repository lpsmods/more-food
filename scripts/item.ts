import { ItemComponentRegistry } from "@minecraft/server";
import { GuideBookComponent } from "@lpsmods/mc-utils";

import { MREComponent } from "./item/mre";
import { PourableComponent } from "./item/pourable";
import { MintyComponent } from "./item/minty";
import { pages } from "./guide/main";
import { makeId } from "./utils";
import { AdvancedFoodComponent } from "./item/advanced_food";

export function registerItemComponents(registry: ItemComponentRegistry): void {
  // Custom
  registry.registerCustomComponent(MintyComponent.componentId, new MintyComponent());
  registry.registerCustomComponent(PourableComponent.componentId, new PourableComponent());
  registry.registerCustomComponent(MREComponent.componentId, new MREComponent());
  registry.registerCustomComponent(AdvancedFoodComponent.componentId, new AdvancedFoodComponent());

  // mc-utils
  registry.registerCustomComponent(makeId("guide_book"), new GuideBookComponent(pages));
  GuideBookComponent.setup(makeId("guide_book"));
}
