package dev.lpsmods.morefood;

import dev.lpsmods.morefood.block.cauldron.MoreFoodCauldronBehavior;
import dev.lpsmods.morefood.core.*;
import dev.lpsmods.morefood.world.gen.MoreFoodWorldGeneration;

public class Bootstrap {
    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModCreativeModeTabs.init();
        MoreFoodCauldronBehavior.register();

        ModBlockEntityType.register();
        ModComposting.register();
        MoreFoodWorldGeneration.generateModWorldGen();

        // TODO: Modify grass loot to drop custom seed.
    }
}