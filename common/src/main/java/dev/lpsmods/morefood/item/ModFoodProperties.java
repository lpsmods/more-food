package dev.lpsmods.morefood.item;

import dev.lpsmods.morefood.core.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    // CUSTOM
    public static final FoodProperties CREATIVE_HUNGER = new FoodProperties.Builder().alwaysEdible().nutrition(0).saturationModifier(0.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 40, 1000), 1.0F).build();

    // APPLE 4 0.3F
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties GRAPE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties TEA_LEAVES = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties PLUM = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties OLIVES = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties RASPBERRY = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties OIL = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties MILK_CARTON = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties CREAM_CARTON = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties CHOCOLATE_COVERED = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties CRANBERRIES = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties DRIED_CRANBERRIES = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties DRIED_RAISENS = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties EGGPLANT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties GARLIC = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties POISON_BERRIES = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build();

    // BAKED_POTATO 5 0.6F
    public static final FoodProperties CUT_FRIES = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties WEDGES_POT = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties COOKED_WEDGES = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties BEVERAGE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();

    // BEEF 3 0.3F
    public static final FoodProperties HAMBURGER_PATTY = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodProperties VEGANBURGER_PATTY = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    
    // BEETROOT 1 0.6F
    public static final FoodProperties FRIES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties CORN_COB = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties DOUGH = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties KETCHUP = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties HOPS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties VANILLA_EXTRACT = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties YEAST = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties TOMATO_PUREE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties GHERKIN = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties PEPPER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties BEANS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties CUT_SWEET_POTATO = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties SWEET_POTATO = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();
    public static final FoodProperties PEPPERMINT_EXTRACT = new FoodProperties.Builder().nutrition(1).saturationModifier(0.6F).build();

    // BEETROOT_SOUP 6 0.6F
    public static final FoodProperties JUICE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SODA = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties MILKSHAKE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SMOOTHIE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties ICECRUSH = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties HOT_BEVERAGE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties COCONUT_MILK = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties CEREAL = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties BREADSTICKS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties APPLESAUCE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties BAKED_SWEET_POTATO = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties CHOCOLATE_BANANA_MUFFIN = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties MAPLE_MUFFIN = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties MARSHMALLOW = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties OATMEAL_COOKIE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties PEPPERMINT_RING = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties ALMONDS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties AVOCADO = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties BLUEBERRIES = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties CABBAGE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties PEANUT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties PRETZEL = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties PRETZEL_NUGGETS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties PRETZEL_STICKS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties ROASTED_PEANUT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SMOKED_ALMONDS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SPINACH = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties TORTILLA_CHIPS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties TRAIL_MIX = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties BEEF_GOULASH = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties BEEF_RAVIOLI = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties BEEF_STEW = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SPINACH_FETTUCCINE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SWEET_MASHED_POTATOES = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties CHEESE_TORTELLINI = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties CHICKEN_SOUP = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties CHILI = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties PUDDING = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties GARLIC_MASHED_POTATOES = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties GUACAMOLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties HASH_BROWNS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties MASHED_POTATOES = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties OATMEAL = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties ONION_RINGS = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SYRUP = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties MARSHMALLOW_ON_A_STICK = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties CANDY_CORN_BOWL = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    
    // BREAD 5 0.6F
    public static final FoodProperties TOAST = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties SUB_BUN = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties CUT_BREAD = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties HOT_DOG_BUN = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties TORTILLA = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties MUFFIN_BUN = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties BURGER_BUN = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties PITTA_BREAD = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties PIZZA_BASE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties BREAD_LOAF = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties CRACKERS = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties CORNBREAD = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();

    // CARROT 3 0.6F
    // CHICKEN 2 0.3F
    public static final FoodProperties BAT_MEAT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();

    // CHORUS_FRUIT 4 0.3F
    // COD 2 0.1F
    public static final FoodProperties SQUID = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();

    // COOKED_BEEF 8 0.8F
    public static final FoodProperties COOKED_HAMBURGER_PATTY = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final FoodProperties COOKED_VEGANBURGER_PATTY = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();

    // COOKED_CHICKEN 6 0.6F
    public static final FoodProperties CHICKEN_SELECT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties COOKED_BAT_MEAT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties COOKED_CHICKEN_PIECE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();

    // COOKED_COD 5 0.6F
    public static final FoodProperties TOFFEE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties FRIED_SQUID = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties SUSHI = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties ONIGIRI = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties SASHIMI = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();


    // COOKED_MUTTON 6 0.8F
    // COOKED_PORKCHOP 8 0.8F 
    public static final FoodProperties COOKED_BACON = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final FoodProperties SUB = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final FoodProperties COOKED_HOT_DOG_SAUSAGE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final FoodProperties COOKED_SAUSAGE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();
    public static final FoodProperties COOKED_HOGLIN_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build();

    // COOKED_RABBIT 5 0.6F
    // COOKED_SALMON 6 0.8F
    public static final FoodProperties CHEESE_WEDGE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build();

    // COOKIE 2 0.1F
    public static final FoodProperties CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties ICE_CREAM_CONE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties JELLY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties TURKISH_DELIGHT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties ICE_CREAM = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties DONUT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties CUPCAKE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties WAFFLE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties PANCAKES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties NETHER_COOKIE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties CHOCOLATE_CHUNK_OATMEAL_COOKIE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties PEANUT_BUTTER_JELLY_SANDWICH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties OATS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties ROASTED_SOYBEANS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties SUGAR_COOKIE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties PEPPERMINT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties CANDY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties CANDY_CORN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties COOKED_PUMPKIN_SEEDS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties GHAST_COOKIE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();

    // DRIED_KELP 1 0.3F
    public static final FoodProperties PICKLES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).snack().build();
    public static final FoodProperties POPCORN = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).snack().build();
    public static final FoodProperties WARPED_BERRIES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).snack().build();
    public static final FoodProperties CHICKEN_NUGGET = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).snack().build();
    public static final FoodProperties COOKED_CHICKEN_NUGGET = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).snack().build();
    public static final FoodProperties ROASTED_SUNFLOWER_SEEDS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).snack().build();

    // ENCHANTED_GOLDEN_APPLE 4 1.2F
    // GOLDEN_APPLE 4 1.2F
    public static final FoodProperties HAMBURGER = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodProperties VEGANBURGER = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodProperties JELLY_SANDWICH = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodProperties ROUND_CHEESE = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodProperties BACON_EGG_MUFFIN = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodProperties NETHERITE_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build();
    public static final FoodProperties PORK_SAUSAGE_BURGER = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodProperties PULLED_BEEF_BURGER = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodProperties TUNA_SANDWICH = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodProperties GLOWBERRY_JELLY_SANDWICH = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).build();
    
    // GOLDEN_CARROT 6 1.2F
    public static final FoodProperties RICE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties PIZZA_SLICE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties PIZZA = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties HOT_DOG = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties POPCORN_BUCKET = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties TACO = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties CHICKEN_FAJITA = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties BURRITO = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties KEBAB = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties BACON_EGG_SANDWICH = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties BREAKFAST_SUB = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties SAUSAGE_EGG_MUFFIN = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties SAUSAGE_EGG_SANDWICH = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();

    // HONEY_BOTTLE 6 0.1F
    // MELON_SLICE 2 0.3F
    public static final FoodProperties FRIED_EGG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties CHEESE_TOASTIE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties BUTTER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties SHROOMLIGHT_SLICES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties CHERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();

    // MUSHROOM_STEW 6 0.6F
    public static final FoodProperties NETHERWART_CHICKEN_SOUP = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties NETHERWART_MUSHROOM_SOUP = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    public static final FoodProperties SPARKLING_WATER_BOTTLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();

    // MUTTON 2 0.3F
    // POISONOUS_POTATO 2 0.3F
    public static final FoodProperties POISONOUS_SWEET_POTATO = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f).effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 0.6F).build();

    // PORKCHOP 3 0.3F
    public static final FoodProperties BACON = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodProperties HOT_DOG_SAUSAGE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodProperties SAUSAGE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodProperties HOGLIN_MEAT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();

    // POTATO 1 0.3F
    public static final FoodProperties WEDGES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final FoodProperties COCONUT_MEAT = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();

    // PUFFERFISH 1 0.1F
    public static final FoodProperties CIDER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).effect(new MobEffectInstance(MobEffects.POISON, 1200, 1), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 2), 1.0F).effect(new MobEffectInstance(MobEffects.NAUSEA, 300, 0), 1.0F).usingConvertsTo(ModItems.TUMBLER_GLASS).build();
    public static final FoodProperties WINE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).effect(new MobEffectInstance(MobEffects.POISON, 1200, 1), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 2), 1.0F).effect(new MobEffectInstance(MobEffects.NAUSEA, 300, 0), 1.0F).usingConvertsTo(ModItems.WINE_GLASS).build();
    public static final FoodProperties BEER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).effect(new MobEffectInstance(MobEffects.POISON, 1200, 1), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 2), 1.0F).effect(new MobEffectInstance(MobEffects.NAUSEA, 300, 0), 1.0F).usingConvertsTo(ModItems.BEER_GLASS).build();
    
    // PUMPKIN_PIE 8 0.3F
    public static final FoodProperties PIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.3F).build();

    // RABBIT 3 0.3F
    // RABBIT_STEW 10 0.6F
    public static final FoodProperties SPAGHETTI = new FoodProperties.Builder().nutrition(10).saturationModifier(0.6F).build();
    public static final FoodProperties ICE_CREAM_BOWL = new FoodProperties.Builder().nutrition(10).saturationModifier(0.6F).build();
    public static final FoodProperties RAMEN_NOODLES = new FoodProperties.Builder().nutrition(10).saturationModifier(0.6F).build();
    public static final FoodProperties CUSTARD = new FoodProperties.Builder().nutrition(10).saturationModifier(0.6F).build();
    public static final FoodProperties SPAGHETTI_WITH_MEATBALLS = new FoodProperties.Builder().nutrition(10).saturationModifier(0.6F).build();

    // ROTTEN_FLESH 4 0.1F
    public static final FoodProperties ROTTEN_PORKCHOP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build();

    // SALMON 2 0.1F
    // SPIDER_EYE 2 0.8F
    // SUSPICIOUS_STEW 6 0.6F
    public static final FoodProperties FUNGUS_STEW = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build();
    
    // SWEET_BERRIES 2 0.1F
    // GLOW_BERRIES 2 0.1F
    // TROPICAL_FISH 1 0.1F

}
