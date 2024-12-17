# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 36 Items ##
execute at @p[gamemode=creative] run function give:morefood/food/bacon
execute at @p[gamemode=creative] run function give:morefood/food/bacon_egg_muffin
execute at @p[gamemode=creative] run function give:morefood/food/bat_meat
execute at @p[gamemode=creative] run function give:morefood/food/burger_bun
execute at @p[gamemode=creative] run function give:morefood/food/burrito
execute at @p[gamemode=creative] run function give:morefood/food/butter
execute at @p[gamemode=creative] run function give:morefood/food/cereal
execute at @p[gamemode=creative] run function give:morefood/food/cheese_bucket
execute at @p[gamemode=creative] run function give:morefood/food/cheese_toastie
execute at @p[gamemode=creative] run function give:morefood/food/cheese_wedge
execute at @p[gamemode=creative] run function give:morefood/food/chicken_fajita
execute at @p[gamemode=creative] run function give:morefood/food/chicken_select
execute at @p[gamemode=creative] run function give:morefood/food/chicken_sub
execute at @p[gamemode=creative] run function give:morefood/food/coconut_meat
execute at @p[gamemode=creative] run function give:morefood/food/coconut_milk
execute at @p[gamemode=creative] run function give:morefood/food/cooked_bacon
execute at @p[gamemode=creative] run function give:morefood/food/cooked_bat
execute at @p[gamemode=creative] run function give:morefood/food/cooked_hotdog_sausage
execute at @p[gamemode=creative] run function give:morefood/food/vegi/corn_on_cob
execute at @p[gamemode=creative] run function give:morefood/food/cut_bread
execute at @p[gamemode=creative] run function give:morefood/food/cut_fries
execute at @p[gamemode=creative] run function give:morefood/food/dough
execute at @p[gamemode=creative] run function give:morefood/food/fried_egg
execute at @p[gamemode=creative] run function give:morefood/food/fried_squid
execute at @p[gamemode=creative] run function give:morefood/food/fries
execute at @p[gamemode=creative] run function give:morefood/food/hamburger
execute at @p[gamemode=creative] run function give:morefood/food/hamburger_patty
execute at @p[gamemode=creative] run function give:morefood/food/hot_cocoa
execute at @p[gamemode=creative] run function give:morefood/food/coffee/hot_coffee
execute at @p[gamemode=creative] run function give:morefood/food/hot_tea
execute at @p[gamemode=creative] run function give:morefood/food/hotdog_bun
execute at @p[gamemode=creative] run function give:morefood/food/hotdog_sausage
execute at @p[gamemode=creative] run function give:morefood/food/hotdog
execute at @p[gamemode=creative] run function give:morefood/food/jam
execute at @p[gamemode=creative] run function give:morefood/food/tomato_puree
execute at @p[gamemode=creative] run function give:morefood/food/vegi/gherkin