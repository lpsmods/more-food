# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 36 Items ##
execute at @p[gamemode=creative] run function give:morefood/food/milkshake/banana_milkshake
execute at @p[gamemode=creative] run function give:morefood/food/milkshake/chocolate_milkshake
execute at @p[gamemode=creative] run function give:morefood/food/milkshake/strawberry_milkshake
execute at @p[gamemode=creative] run function give:morefood/food/vegi/lettuce
execute at @p[gamemode=creative] run function give:morefood/food/vegi/onion
execute at @p[gamemode=creative] run function give:morefood/food/fruit/tomato
execute at @p[gamemode=creative] run function give:morefood/food/coffee/americano
execute at @p[gamemode=creative] run function give:morefood/food/coffee/cappuccino
execute at @p[gamemode=creative] run function give:morefood/food/coffee/macchiato
execute at @p[gamemode=creative] run function give:morefood/food/coffee/mocha
execute at @p[gamemode=creative] run function give:morefood/food/coffee/toffee_latte
execute at @p[gamemode=creative] run function give:morefood/food/coffee/vanilla_latte
execute at @p[gamemode=creative] run function give:morefood/food/bacon_egg_sandwich
execute at @p[gamemode=creative] run function give:morefood/food/breakfast_sub
execute at @p[gamemode=creative] run function give:morefood/food/hops
execute at @p[gamemode=creative] run function give:morefood/food/pitta_bread
execute at @p[gamemode=creative] run function give:morefood/food/pizza_base
execute at @p[gamemode=creative] run function give:morefood/food/sausage_egg_muffin
execute at @p[gamemode=creative] run function give:morefood/food/sausage_egg_sandwich
execute at @p[gamemode=creative] run function give:morefood/food/vanilla_extract
execute at @p[gamemode=creative] run function give:morefood/food/vanilla_pod
execute at @p[gamemode=creative] run function give:morefood/food/yeast
execute at @p[gamemode=creative] run function give:morefood/food/cream_carton
execute at @p[gamemode=creative] run function give:morefood/food/donut/toffee_donut
execute at @p[gamemode=creative] run function give:morefood/food/icecream/toffee_icecream
execute at @p[gamemode=creative] run function give:morefood/food/icecream/vanilla_icecream
execute at @p[gamemode=creative] run function give:morefood/food/raw_sausage
execute at @p[gamemode=creative] run function give:morefood/food/cooked_sausage
execute at @p[gamemode=creative] run function give:morefood/food/fruit/plum
execute at @p[gamemode=creative] run function give:morefood/food/fruit/olives
execute at @p[gamemode=creative] run function give:morefood/food/fruit/raspberry
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/apple_raspberry_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/smoothie/raspberry_smoothie
execute at @p[gamemode=creative] run function give:morefood/food/pie/apple_raspberry_pie
execute at @p[gamemode=creative] run function give:morefood/food/bread_loaf
execute at @p[gamemode=creative] run function give:morefood/food/cornflour