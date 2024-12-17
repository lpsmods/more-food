# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 10 Items ##
execute at @p[gamemode=creative] run function give:morefood/food/custard
execute at @p[gamemode=creative] run function give:morefood/food/flour
execute at @p[gamemode=creative] run function give:morefood/food/gelatin
execute at @p[gamemode=creative] run function give:morefood/food/noodles
execute at @p[gamemode=creative] run function give:morefood/food/oil
execute at @p[gamemode=creative] run function give:morefood/food/orange_jelly
execute at @p[gamemode=creative] run function give:morefood/food/pasta
execute at @p[gamemode=creative] run function give:morefood/food/rice
execute at @p[gamemode=creative] run function give:morefood/food/rice_pudding
execute at @p[gamemode=creative] run function give:morefood/food/salt
execute at @p[gamemode=creative] run function give:morefood/food/pancakes
execute at @p[gamemode=creative] run function give:morefood/food/other/onigiri
execute at @p[gamemode=creative] run function give:morefood/food/other/sashimi
execute at @p[gamemode=creative] run function give:morefood/food/nether/cooked_hoglin_meat
execute at @p[gamemode=creative] run function give:morefood/food/nether/fungus_stew
execute at @p[gamemode=creative] run function give:morefood/food/nether/hoglin_meat
execute at @p[gamemode=creative] run function give:morefood/food/nether/nether_cookie
execute at @p[gamemode=creative] run function give:morefood/food/nether/netherwart_chicken_soup
execute at @p[gamemode=creative] run function give:morefood/food/nether/netherwart_mushroom_soup
execute at @p[gamemode=creative] run function give:morefood/food/nether/rotten_porkchop
execute at @p[gamemode=creative] run function give:morefood/food/nether/shroomlight_slices
execute at @p[gamemode=creative] run function give:morefood/food/nether/wart_berries
execute at @p[gamemode=creative] run function give:morefood/food/nether/wart_pie
execute at @p[gamemode=creative] run function give:morefood/food/nether/netherite_apple