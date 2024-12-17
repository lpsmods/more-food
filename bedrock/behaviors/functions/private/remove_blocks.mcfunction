# Made by: @Legopitstop
# Desc: Removes all illegal block items from the players inventory
#
# Called By: tick.json

# Remove command output
# gamerule sendcommandfeedback false
gamerule commandblockoutput false

# Pickblock
execute as @a[hasitem={item=morefood:potted_almond_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:almond_sapling
execute as @a[hasitem={item=morefood:potted_apple_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:apple_sapling
execute as @a[hasitem={item=morefood:potted_avocado_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:avocado_sapling
execute as @a[hasitem={item=morefood:potted_banana_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:banana_sapling
execute as @a[hasitem={item=morefood:potted_lemon_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:lemon_sapling
execute as @a[hasitem={item=morefood:potted_olive_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:olive_sapling
execute as @a[hasitem={item=morefood:potted_orange_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:orange_sapling
execute as @a[hasitem={item=morefood:potted_palm_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:palm_sapling
execute as @a[hasitem={item=morefood:potted_plum_sapling,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:plum_sapling
execute as @a[hasitem={item=morefood:potted_spearmint,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:spearmint
execute as @a[hasitem={item=morefood:potted_watermint,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:watermint

execute as @a[hasitem={item=morefood:sap_cauldron,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 minecraft:cauldron

execute as @a[hasitem={item=morefood:sweet_corn_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:sweet_corn
execute as @a[hasitem={item=morefood:barley_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:barley_seeds
execute as @a[hasitem={item=morefood:hops_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:hops_seeds
execute as @a[hasitem={item=morefood:lettuce_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:lettuce_seeds
execute as @a[hasitem={item=morefood:onion_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:onion_seeds
execute as @a[hasitem={item=morefood:rice_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rice_seeds
execute as @a[hasitem={item=morefood:coffee_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:coffee_beans
execute as @a[hasitem={item=morefood:gherkin_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:gherkin_seeds
execute as @a[hasitem={item=morefood:grape_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:grape_seeds
execute as @a[hasitem={item=morefood:pepper_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pepper_seeds
execute as @a[hasitem={item=morefood:raspberry_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:raspberry_seeds
execute as @a[hasitem={item=morefood:strawberry_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:strawberry_seeds
execute as @a[hasitem={item=morefood:tea_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:tea_seeds
execute as @a[hasitem={item=morefood:tomato_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:tomato_seeds
execute as @a[hasitem={item=morefood:vanilla_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:vanilla_seeds
execute as @a[hasitem={item=morefood:blueberry_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:blueberry_seeds
execute as @a[hasitem={item=morefood:buckwheat_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:buckwheat
execute as @a[hasitem={item=morefood:cabbage_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cabbage_seeds
execute as @a[hasitem={item=morefood:eggplant_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:eggplant_seeds
execute as @a[hasitem={item=morefood:oat_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:oat_seeds
execute as @a[hasitem={item=morefood:peanut_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:peanut_seeds
execute as @a[hasitem={item=morefood:poison_berry_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:poison_berries
execute as @a[hasitem={item=morefood:soybean_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:soybeans
execute as @a[hasitem={item=morefood:spinach_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:spinach_seeds
execute as @a[hasitem={item=morefood:sweet_potatoes,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:sweet_potato

execute as @a[hasitem={item=morefood:bean_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:bean_seeds
execute as @a[hasitem={item=morefood:cranberry_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cranberry_seeds
execute as @a[hasitem={item=morefood:garlic_crop,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:garlic_bulb
execute as @a[hasitem={item=morefood:peppermint_bush,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:peppermint_seeds
execute as @a[hasitem={item=morefood:watermint_plant,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:watermint
execute as @a[hasitem={item=morefood:spearmint_plant,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:spearmint

execute as @a[hasitem={item=morefood:chocolate_cake_block,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:black_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:blue_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:brown_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:cyan_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:gray_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:green_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:light_blue_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:light_gray_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:lime_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:magenta_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:orange_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:pink_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:purple_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:red_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:white_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake
execute as @a[hasitem={item=morefood:yellow_candle_chocolate_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:chocolate_cake

execute as @a[hasitem={item=morefood:rainbow_cake_block,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:black_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:blue_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:brown_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:cyan_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:gray_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:green_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:light_blue_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:light_gray_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:lime_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:magenta_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:orange_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:pink_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:purple_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:red_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:white_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake
execute as @a[hasitem={item=morefood:yellow_candle_rainbow_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:rainbow_cake

execute as @a[hasitem={item=morefood:redwhiteblue_cake_block,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:black_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:blue_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:brown_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:cyan_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:gray_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:green_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:light_blue_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:light_gray_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:lime_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:magenta_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:orange_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:pink_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:purple_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:red_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:white_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake
execute as @a[hasitem={item=morefood:yellow_candle_redwhiteblue_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:redwhiteblue_cake

execute as @a[hasitem={item=morefood:pound_cake_block,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:black_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:blue_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:brown_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:cyan_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:gray_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:green_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:light_blue_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:light_gray_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:lime_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:magenta_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:orange_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:pink_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:purple_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:red_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:white_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake
execute as @a[hasitem={item=morefood:yellow_candle_pound_cake,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:pound_cake

execute as @a[hasitem={item=morefood:cake_with_cherries_block,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:black_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:blue_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:brown_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:cyan_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:gray_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:green_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:light_blue_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:light_gray_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:lime_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:magenta_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:orange_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:pink_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:purple_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:red_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:white_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries
execute as @a[hasitem={item=morefood:yellow_candle_cake_with_cherries,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:cake_with_cherries

execute as @a[hasitem={item=morefood:hanging_plum,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:plum_sapling
execute as @a[hasitem={item=morefood:hanging_coconut,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:palm_sapling
execute as @a[hasitem={item=morefood:hanging_orange,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:orange_sapling
execute as @a[hasitem={item=morefood:hanging_olives,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:olive_sapling
execute as @a[hasitem={item=morefood:hanging_lemon,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:lemon_sapling
execute as @a[hasitem={item=morefood:hanging_banana,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:banana_sapling
execute as @a[hasitem={item=morefood:hanging_apple,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:apple_sapling
execute as @a[hasitem={item=morefood:hanging_avocado,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:avocado_sapling
execute as @a[hasitem={item=morefood:hanging_almond,location=slot.weapon.mainhand}] run replaceitem entity @s slot.weapon.mainhand 0 morefood:almond_sapling
