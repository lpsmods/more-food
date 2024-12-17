package dev.lpsmods.morefood.world;

import dev.lpsmods.morefood.MoreFood;
import dev.lpsmods.morefood.core.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class MoreFoodPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TREES_ALMOND = registerKey("trees_almond");
    public static final RegistryKey<PlacedFeature> TREES_APPLE = registerKey("trees_apple");
    public static final RegistryKey<PlacedFeature> TREES_AVOCADO = registerKey("trees_avocado");
    public static final RegistryKey<PlacedFeature> TREES_BANANA= registerKey("trees_banana");
    public static final RegistryKey<PlacedFeature> TREES_LEMON = registerKey("trees_lemon");
    public static final RegistryKey<PlacedFeature> TREES_OLIVE = registerKey("trees_olive");
    public static final RegistryKey<PlacedFeature> TREES_ORANGE = registerKey("trees_orange");
    public static final RegistryKey<PlacedFeature> TREES_PALM = registerKey("trees_palm");
    public static final RegistryKey<PlacedFeature> TREES_PLUM = registerKey("trees_plum");

    public static final RegistryKey<PlacedFeature> ALMOND_BEES_005_PLACED = registerKey("almond_bees_005");
    public static final RegistryKey<PlacedFeature> APPLE_BEES_005_PLACED = registerKey("apple_bees_005");
    public static final RegistryKey<PlacedFeature> AVOCADO_BEES_005_PLACED = registerKey("avocado_bees_005");
    public static final RegistryKey<PlacedFeature> BANANA_BEES_005_PLACED = registerKey("banana_bees_005");
    public static final RegistryKey<PlacedFeature> LEMON_BEES_005_PLACED = registerKey("lemon_bees_005");
    public static final RegistryKey<PlacedFeature> OLIVE_BEES_005_PLACED = registerKey("olive_bees_005");
    public static final RegistryKey<PlacedFeature> ORANGE_BEES_005_PLACED = registerKey("orange_bees_005");
    public static final RegistryKey<PlacedFeature> PALM_BEES_005_PLACED = registerKey("palm_bees_005");
    public static final RegistryKey<PlacedFeature> PLUM_BEES_005_PLACED = registerKey("plum_bees_005");

    public static final RegistryKey<PlacedFeature> PATCH_BEAN_BUSH = registerKey("patch_bean_bush");
    public static final RegistryKey<PlacedFeature> PATCH_BLUEBERRY_BUSH = registerKey("patch_blueberry_bush");
    public static final RegistryKey<PlacedFeature> PATCH_COFFEE_BUSH = registerKey("patch_coffee_bush");
    public static final RegistryKey<PlacedFeature> PATCH_CRANBERRY_BUSH = registerKey("patch_cranberry_bush");
    public static final RegistryKey<PlacedFeature> PATCH_EGGPLANT_BUSH = registerKey("patch_eggplant_bush");
    public static final RegistryKey<PlacedFeature> PATCH_GHERKIN_BUSH = registerKey("patch_gherkin_bush");
    public static final RegistryKey<PlacedFeature> PATCH_GRAPE_BUSH = registerKey("patch_grape_bush");
    public static final RegistryKey<PlacedFeature> PATCH_PEPPER_BUSH = registerKey("patch_pepper_bush");
    public static final RegistryKey<PlacedFeature> PATCH_POISON_BERRY_BUSH = registerKey("patch_poison_berry_bush");
    public static final RegistryKey<PlacedFeature> PATCH_RASPBERRY_BUSH = registerKey("patch_raspberry_bush");
    public static final RegistryKey<PlacedFeature> PATCH_SOYBEAN_BUSH = registerKey("patch_soybean_bush");
    public static final RegistryKey<PlacedFeature> PATCH_STRAWBERRY_BUSH = registerKey("patch_strawberry_bush");
    public static final RegistryKey<PlacedFeature> PATCH_TEA_BUSH = registerKey("patch_tea_bush");
    public static final RegistryKey<PlacedFeature> PATCH_TOMATO_BUSH = registerKey("patch_tomato_bush");
    public static final RegistryKey<PlacedFeature> PATCH_VANILLA_BUSH = registerKey("patch_vanilla_bush");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // NORMAL
        register(context, TREES_ALMOND, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.ALMOND),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.ALMOND_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_APPLE, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.APPLE),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.APPLE_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_AVOCADO, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.AVOCADO),
                RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.AVOCADO_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_BANANA, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.BANANA),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.BANANA_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_LEMON, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.LEMON),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.LEMON_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_OLIVE, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.OLIVE),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.OLIVE_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_ORANGE, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.ORANGE),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.ORANGE_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_PALM, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PALM),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.PALM_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, TREES_PLUM, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PLUM),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.PLUM_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        // BEES
        register(context, ALMOND_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.ALMOND_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.ALMOND_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, APPLE_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.APPLE_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.APPLE_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, AVOCADO_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.AVOCADO_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.AVOCADO_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, BANANA_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.BANANA_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.BANANA_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, LEMON_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.LEMON_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.LEMON_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, OLIVE_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.OLIVE_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.OLIVE_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, ORANGE_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.ORANGE_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.ORANGE_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, PALM_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PALM_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.PALM_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        register(context, PLUM_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PLUM_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.PLUM_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        // BUSHES
        register(context, PATCH_BEAN_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_BEAN_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_BLUEBERRY_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_BLUEBERRY_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_COFFEE_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_COFFEE_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_CRANBERRY_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_CRANBERRY_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_EGGPLANT_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_EGGPLANT_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_GHERKIN_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_GHERKIN_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_GRAPE_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_GRAPE_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_PEPPER_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_PEPPER_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_POISON_BERRY_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_POISON_BERRY_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_RASPBERRY_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_RASPBERRY_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_SOYBEAN_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_SOYBEAN_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_STRAWBERRY_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_STRAWBERRY_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_TEA_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_TEA_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_TOMATO_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_TOMATO_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PATCH_VANILLA_BUSH, configuredFeatureRegistryEntryLookup.getOrThrow(MoreFoodConfiguredFeatures.PATCH_VANILLA_BUSH),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MoreFood.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
