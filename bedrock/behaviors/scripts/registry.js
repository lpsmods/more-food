import { CropComponent } from "./block/CropComponent";
import { SpileComponent } from "./block/SpileComponent";
import { BushComponent } from "./block/BushComponent";
import { SaplingComponent } from "./block/SaplingComponent";
import * as gen from "./classes/SaplingGenerator";
import { CauldronComponent } from "./block/CauldronComponent";
import { HangingCropComponent } from "./block/HangingCropComponent";
import { CakeComponent } from "./block/CakeComponent";
import { CandleCakeComponent } from "./block/CandleCakeComponent";
import { TallCropComponent } from "./block/TallCropComponent";

import { PourableComponent } from "./item/PourableComponent";
import { MREComponent } from "./item/MREComponent";
import { MintyComponent } from "./item/MintyComponent";
import { PottableComponent } from "./item/PottableComponent";
import { PottedFlowerComponent } from "./block/PottedFlowerComponent";
import { CANDLES } from "./classes/utils";

function registerCakes(registry, name) {
    const chocolateCake = new CakeComponent();
    for (const candle of CANDLES) {
        chocolateCake.addCandleCake('minecraft:'+candle, `morefood:${ candle }_${ name }`);
        registry.registerCustomComponent(`morefood:${candle}_${ name }`, new CandleCakeComponent('minecraft:'+candle, `morefood:${name}_block`));
    }
    registry.registerCustomComponent("morefood:"+name, chocolateCake);
}

export function registerBlockComponents(registry) {
    registry.registerCustomComponent("morefood:bean_bush", new BushComponent('morefood:beans'));
    registry.registerCustomComponent("morefood:raspberry_bush", new BushComponent('morefood:raspberry'));
    registry.registerCustomComponent("morefood:poison_berry_bush", new BushComponent('morefood:poison_berries'));
    registry.registerCustomComponent("morefood:soybean_bush", new BushComponent('morefood:soybeans'));
    registry.registerCustomComponent("morefood:strawberry_bush", new BushComponent('morefood:strawberry'));
    registry.registerCustomComponent("morefood:tea_bush", new BushComponent('morefood:tea_leaves'));
    registry.registerCustomComponent("morefood:tomato_bush", new BushComponent('morefood:tomato'));
    registry.registerCustomComponent("morefood:vanilla_bush", new BushComponent('morefood:vanilla_pod'));
    registry.registerCustomComponent("morefood:pepper_bush", new BushComponent('morefood:pepper'));
    registry.registerCustomComponent("morefood:peppermint_bush", new BushComponent('morefood:peppermint'));
    registry.registerCustomComponent("morefood:coffee_bush", new BushComponent('morefood:coffee_beans'));
    registry.registerCustomComponent("morefood:cranberry_bush", new BushComponent('morefood:cranberries'));
    registry.registerCustomComponent("morefood:eggplant_bush", new BushComponent('morefood:eggplant'));
    registry.registerCustomComponent("morefood:gherkin_bush", new BushComponent('morefood:gherkin'));
    registry.registerCustomComponent("morefood:grape_bush", new BushComponent('morefood:grape'));
    registry.registerCustomComponent("morefood:blueberry_bush", new BushComponent('morefood:blueberries'));
    registry.registerCustomComponent("morefood:hanging_apple", new HangingCropComponent('minecraft:apple'));
    registry.registerCustomComponent("morefood:hanging_orange", new HangingCropComponent('morefood:orange'));
    registry.registerCustomComponent("morefood:hanging_olive", new HangingCropComponent('morefood:olives'));
    registry.registerCustomComponent("morefood:hanging_lemon", new HangingCropComponent('morefood:lemon'));
    registry.registerCustomComponent("morefood:hanging_coconut", new HangingCropComponent('morefood:coconut'));
    registry.registerCustomComponent("morefood:hanging_cherry", new HangingCropComponent('morefood:cherry'));
    registry.registerCustomComponent("morefood:hanging_avocado", new HangingCropComponent('morefood:avocado'));
    registry.registerCustomComponent("morefood:hanging_banana", new HangingCropComponent('morefood:banana'));
    registry.registerCustomComponent("morefood:hanging_plum", new HangingCropComponent('morefood:plum'));
    registry.registerCustomComponent("morefood:hanging_almond", new HangingCropComponent('morefood:almonds'));
    registry.registerCustomComponent(CropComponent.typeId, new CropComponent());
    registry.registerCustomComponent(TallCropComponent.typeId, new TallCropComponent());
    registry.registerCustomComponent(SpileComponent.typeId,new SpileComponent());

    registry.registerCustomComponent("morefood:apple_sapling",new SaplingComponent(gen.APPLE_SAPLING));
    registry.registerCustomComponent("morefood:almond_sapling",new SaplingComponent(gen.ALMOND_SAPLING));
    registry.registerCustomComponent("morefood:avocado_sapling",new SaplingComponent(gen.AVOCADO_SAPLING));
    registry.registerCustomComponent("morefood:banana_sapling",new SaplingComponent(gen.BANANA_SAPLING));
    registry.registerCustomComponent("morefood:lemon_sapling",new SaplingComponent(gen.LEMON_SAPLING));
    registry.registerCustomComponent("morefood:olive_sapling",new SaplingComponent(gen.OLIVE_SAPLING));
    registry.registerCustomComponent("morefood:orange_sapling",new SaplingComponent(gen.ORANGE_SAPLING));
    registry.registerCustomComponent("morefood:palm_sapling",new SaplingComponent(gen.PALM_SAPLING));
    registry.registerCustomComponent("morefood:plum_sapling",new SaplingComponent(gen.PLUM_SAPLING));
  
    const sapCauldron = new CauldronComponent();
    sapCauldron.addBucket("minecraft:bucket", "morefood:maple_sap_bucket");
    registry.registerCustomComponent("morefood:sap_cauldron",sapCauldron);

    registerCakes(registry, 'chocolate_cake');
    registerCakes(registry, 'rainbow_cake');
    registerCakes(registry, 'pound_cake');
    registerCakes(registry, 'redwhiteblue_cake');
    registerCakes(registry, 'cake_with_cherries');
    
    registry.registerCustomComponent("morefood:potted_almond_sapling", new PottedFlowerComponent('morefood:almond_sapling'));
    registry.registerCustomComponent("morefood:potted_avocado_sapling", new PottedFlowerComponent('morefood:avocado_sapling'));
    registry.registerCustomComponent("morefood:potted_lemon_sapling", new PottedFlowerComponent('morefood:lemon_sapling'));
    registry.registerCustomComponent("morefood:potted_apple_sapling", new PottedFlowerComponent('morefood:apple_sapling'));
    registry.registerCustomComponent("morefood:potted_banana_sapling", new PottedFlowerComponent('morefood:banana_sapling'));
    registry.registerCustomComponent("morefood:potted_olive_sapling", new PottedFlowerComponent('morefood:olive_sapling'));
    registry.registerCustomComponent("morefood:potted_orange_sapling", new PottedFlowerComponent('morefood:orange_sapling'));
    registry.registerCustomComponent("morefood:potted_palm_sapling", new PottedFlowerComponent('morefood:palm_sapling'));
    registry.registerCustomComponent("morefood:potted_plum_sapling", new PottedFlowerComponent('morefood:plum_sapling'));
    registry.registerCustomComponent("morefood:potted_spearmint", new PottedFlowerComponent('morefood:spearmint'));
    registry.registerCustomComponent("morefood:potted_watermint", new PottedFlowerComponent('morefood:watermint'));
}

export function registerItemComponents(registry) {
    registry.registerCustomComponent(MintyComponent.typeId, new MintyComponent());
    registry.registerCustomComponent('morefood:bottled_beer', new PourableComponent("morefood:beer_mug", "morefood:beer"));
    registry.registerCustomComponent('morefood:bottled_cider', new PourableComponent("morefood:tumbler_glass", "morefood:cider"));
    registry.registerCustomComponent('morefood:bottled_red_wine', new PourableComponent("morefood:wine_glass", "morefood:red_wine"));
    registry.registerCustomComponent('morefood:bottled_white_wine', new PourableComponent("morefood:wine_glass", "morefood:white_wine"));
    registry.registerCustomComponent(MREComponent.typeId, new MREComponent());
    registry.registerCustomComponent("morefood:pottable_almond_sapling", new PottableComponent('morefood:potted_almond_sapling'));
    registry.registerCustomComponent("morefood:pottable_avocado_sapling", new PottableComponent('morefood:potted_avocado_sapling'));
    registry.registerCustomComponent("morefood:pottable_lemon_sapling", new PottableComponent('morefood:potted_lemon_sapling'));
    registry.registerCustomComponent("morefood:pottable_apple_sapling", new PottableComponent('morefood:potted_apple_sapling'));
    registry.registerCustomComponent("morefood:pottable_banana_sapling", new PottableComponent('morefood:potted_banana_sapling'));
    registry.registerCustomComponent("morefood:pottable_olive_sapling", new PottableComponent('morefood:potted_olive_sapling'));
    registry.registerCustomComponent("morefood:pottable_orange_sapling", new PottableComponent('morefood:potted_orange_sapling'));
    registry.registerCustomComponent("morefood:pottable_palm_sapling", new PottableComponent('morefood:potted_palm_sapling'));
    registry.registerCustomComponent("morefood:pottable_plum_sapling", new PottableComponent('morefood:potted_plum_sapling'));
    registry.registerCustomComponent("morefood:pottable_spearmint", new PottableComponent('morefood:potted_spearmint'));
    registry.registerCustomComponent("morefood:pottable_watermint", new PottableComponent('morefood:potted_watermint'));
}
