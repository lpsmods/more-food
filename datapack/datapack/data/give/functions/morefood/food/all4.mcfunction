# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 36 Items ##
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/apple_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/berry_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/grape_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/lemon_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/melon_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/mixed_fruit_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/orange_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/icecrush/strawberry_icecrush
execute at @p[gamemode=creative] run function give:morefood/food/juice/apple_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/berry_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/grape_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/lemon_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/melon_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/mixed_fruit_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/orange_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/strawberry_juice
execute at @p[gamemode=creative] run function give:morefood/food/juice/tomato_juice
execute at @p[gamemode=creative] run function give:morefood/food/pie/apple_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/berry_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/cheese_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/chicken_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/chocolate_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/golden_apple_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/plum_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/lemon_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie_base
execute at @p[gamemode=creative] run function give:morefood/food/pie/pork_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/steak_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/strawberry_pie
execute at @p[gamemode=creative] run function give:morefood/food/pie/toffee_pie
execute at @p[gamemode=creative] run function give:morefood/food/soda/apple_soda
execute at @p[gamemode=creative] run function give:morefood/food/soda/berry_soda
execute at @p[gamemode=creative] run function give:morefood/food/soda/grape_soda
execute at @p[gamemode=creative] run function give:morefood/food/soda/lemon_soda
execute at @p[gamemode=creative] run function give:morefood/food/soda/orange_soda
execute at @p[gamemode=creative] run function give:morefood/food/soda/strawberry_soda