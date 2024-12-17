package dev.lpsmods.morefood.world.gen;

import dev.lpsmods.morefood.world.MoreFoodPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class MoreFoodGeneration {
    public static void generate() {

        // NORMAL
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_ALMOND);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_APPLE);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_AVOCADO);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_BANANA);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_LEMON);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_OLIVE);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_ORANGE);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_PLUM);

        // BEES
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.ALMOND_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.APPLE_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.AVOCADO_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.BANANA_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.LEMON_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.OLIVE_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.ORANGE_BEES_005_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PLUM_BEES_005_PLACED);

        // SPECIAL
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.TREES_PALM);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PALM_BEES_005_PLACED);

        // BUSHES
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_BEAN_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_BLUEBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_COFFEE_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_CRANBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_EGGPLANT_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_GHERKIN_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_GRAPE_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_PEPPER_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_POISON_BERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_RASPBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_SOYBEAN_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_STRAWBERRY_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_TEA_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_TOMATO_BUSH);
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.OCEAN, BiomeKeys.RIVER, BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, MoreFoodPlacedFeatures.PATCH_VANILLA_BUSH);

    }
}
