# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 34 Items ##
execute at @p[gamemode=creative] run function give:morefood/food/chocolate_bar/dark_chocolate
execute at @p[gamemode=creative] run function give:morefood/food/chocolate_bar/milk_chocolate
execute at @p[gamemode=creative] run function give:morefood/food/chocolate_bar/white_chocolate
execute at @p[gamemode=creative] run function give:morefood/food/cupcake/blue_cupcake
execute at @p[gamemode=creative] run function give:morefood/food/cupcake/pink_cupcake
execute at @p[gamemode=creative] run function give:morefood/food/donut/chocolate_donut
execute at @p[gamemode=creative] run function give:morefood/food/donut/coffee_donut
execute at @p[gamemode=creative] run function give:morefood/food/donut/golden_donut
execute at @p[gamemode=creative] run function give:morefood/food/donut/iced_donut
execute at @p[gamemode=creative] run function give:morefood/food/donut/pink_ice_donut
execute at @p[gamemode=creative] run function give:morefood/food/donut/plain_donut
execute at @p[gamemode=creative] run function give:morefood/food/donut/strawberry_donut
execute at @p[gamemode=creative] run function give:morefood/food/fruit/apple
execute at @p[gamemode=creative] run function give:morefood/food/fruit/banana
execute at @p[gamemode=creative] run function give:morefood/food/fruit/grape
execute at @p[gamemode=creative] run function give:morefood/food/fruit/lemon
execute at @p[gamemode=creative] run function give:morefood/food/fruit/orange
execute at @p[gamemode=creative] run function give:morefood/food/fruit/strawberry
execute at @p[gamemode=creative] run function give:morefood/food/icecream/banana_icecream
execute at @p[gamemode=creative] run function give:morefood/food/icecream/chocolate_icecream
execute at @p[gamemode=creative] run function give:morefood/food/icecream/ice_bowl
execute at @p[gamemode=creative] run function give:morefood/food/icecream_cone
execute at @p[gamemode=creative] run function give:morefood/food/icecream/strawberry_icecream
execute at @p[gamemode=creative] run function give:morefood/food/smoothie/banana_smoothie
execute at @p[gamemode=creative] run function give:morefood/food/smoothie/berry_smoothie
execute at @p[gamemode=creative] run function give:morefood/food/smoothie/grape_smoothie
execute at @p[gamemode=creative] run function give:morefood/food/smoothie/mixed_fruit_smoothie
execute at @p[gamemode=creative] run function give:morefood/food/smoothie/strawberry_smoothie