package dev.lpsmods.morefood.world;

import dev.lpsmods.morefood.MoreFood;
import dev.lpsmods.morefood.block.HangingCropBlock;
import dev.lpsmods.morefood.block.MoreFoodBushBlock;
import dev.lpsmods.morefood.core.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Collections;
import java.util.List;

public class MoreFoodConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALMOND = registerKey("almond");
    public static final RegistryKey<ConfiguredFeature<?, ?>> APPLE = registerKey("apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AVOCADO = registerKey("avocado");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BANANA = registerKey("banana");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEMON = registerKey("lemon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE = registerKey("olive");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE = registerKey("orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM = registerKey("palm");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM = registerKey("plum");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ALMOND_BEES_005 = registerKey("almond_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> APPLE_BEES_005 = registerKey("apple_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AVOCADO_BEES_005 = registerKey("avocado_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BANANA_BEES_005 = registerKey("banana_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEMON_BEES_005 = registerKey("lemon_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_BEES_005 = registerKey("olive_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_BEES_005 = registerKey("orange_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_BEES_005 = registerKey("palm_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_BEES_005 = registerKey("plum_bees_005");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_BEAN_BUSH = registerKey("patch_bean_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_BLUEBERRY_BUSH = registerKey("patch_blueberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_COFFEE_BUSH = registerKey("patch_coffee_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_CRANBERRY_BUSH = registerKey("patch_cranberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_EGGPLANT_BUSH = registerKey("patch_eggplant_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_GHERKIN_BUSH = registerKey("patch_gherkin_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_GRAPE_BUSH = registerKey("patch_grape_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_PEPPER_BUSH = registerKey("patch_pepper_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_POISON_BERRY_BUSH = registerKey("patch_poison_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_RASPBERRY_BUSH = registerKey("patch_raspberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_SOYBEAN_BUSH = registerKey("patch_soybean_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_STRAWBERRY_BUSH = registerKey("patch_strawberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_TEA_BUSH = registerKey("patch_tea_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_TOMATO_BUSH = registerKey("patch_tomato_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_VANILLA_BUSH = registerKey("patch_vanilla_bush");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        // NORMAL

        register(context, ALMOND, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.SPRUCE_LOG), // log
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.AZALEA_LEAVES), // leaves
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(5,0,2)).decorators(Collections.singletonList(
                        new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_ALMOND.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, APPLE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.DARK_OAK_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_APPLE.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, AVOCADO, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_AVOCADO.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, LEMON, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_LEMON.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, OLIVE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_OLIVE.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, ORANGE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_ORANGE.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, PLUM, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(5,1,0),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_PLUM.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, BANANA, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.SPRUCE_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.JUNGLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_BANANA.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        register(context, PALM, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.STRIPPED_BIRCH_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), 1),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                    new AttachedToLeavesTreeDecorator(1.0F, 1,0, BlockStateProvider.of(ModBlocks.HANGING_COCONUT.getDefaultState().with(HangingCropBlock.AGE, 0)), 1, Collections.singletonList(Direction.DOWN)))).build());

        // BEES_005

        register(context, ALMOND_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.SPRUCE_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.AZALEA_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(5,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, APPLE_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.DARK_OAK_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, AVOCADO_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, LEMON_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, OLIVE_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, ORANGE_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, PLUM_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(5,1,0),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, BANANA_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.SPRUCE_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.JUNGLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        register(context, PALM_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.STRIPPED_BIRCH_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), 1),
                new TwoLayersFeatureSize(1,0,2)).decorators(Collections.singletonList(
                        new BeehiveTreeDecorator(0.05F))).build());

        // BUSHES
        register(context, PATCH_BEAN_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.BEAN_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_BLUEBERRY_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.BLUEBERRY_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_COFFEE_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.COFFEE_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_CRANBERRY_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.CRANBERRY_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_EGGPLANT_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.EGGPLANT_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_GHERKIN_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.GHERKIN_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_GRAPE_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.GRAPE_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_PEPPER_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.PEPPER_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_POISON_BERRY_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.POISON_BERRY_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_RASPBERRY_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.RASPBERRY_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_SOYBEAN_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.SOYBEAN_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_STRAWBERRY_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.STRAWBERRY_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_TEA_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.TEA_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_TOMATO_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.TOMATO_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, PATCH_VANILLA_BUSH, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState) ModBlocks.VANILLA_BUSH.getDefaultState().with(MoreFoodBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreFood.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
