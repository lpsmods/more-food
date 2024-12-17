package dev.lpsmods.morefood.block;

import dev.lpsmods.morefood.world.MoreFoodConfiguredFeatures;

import java.util.Optional;

public class MoreFoodSaplingGenerator {
    public static final SaplingGenerator AVOCADO;
    public static final SaplingGenerator ALMOND;
    public static final SaplingGenerator PLUM;
    public static final SaplingGenerator BANANA;
    public static final SaplingGenerator LEMON;
    public static final SaplingGenerator PALM;
    public static final SaplingGenerator OLIVE;
    public static final SaplingGenerator ORANGE;
    public static final SaplingGenerator APPLE;

    static {
        AVOCADO = new SaplingGenerator("avocado", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.AVOCADO), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.AVOCADO_BEES_005), Optional.empty());
        ALMOND = new SaplingGenerator("almond", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.ALMOND), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.ALMOND_BEES_005), Optional.empty());
        PLUM = new SaplingGenerator("plum", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.PLUM), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.PLUM_BEES_005), Optional.empty());
        BANANA = new SaplingGenerator("banana", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.BANANA), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.BANANA_BEES_005), Optional.empty());
        LEMON = new SaplingGenerator("lemon", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.LEMON), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.LEMON_BEES_005), Optional.empty());
        PALM = new SaplingGenerator("palm", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.PALM), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.PALM_BEES_005), Optional.empty());
        OLIVE = new SaplingGenerator("olive", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.OLIVE), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.OLIVE_BEES_005), Optional.empty());
        ORANGE = new SaplingGenerator("orange", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.ORANGE), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.ORANGE_BEES_005), Optional.empty());
        APPLE = new SaplingGenerator("apple", 0.1F,Optional.empty(), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.APPLE), Optional.empty(), Optional.of(MoreFoodConfiguredFeatures.APPLE_BEES_005), Optional.empty());
    }
}
