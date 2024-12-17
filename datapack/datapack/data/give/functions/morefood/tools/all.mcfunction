# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 7 Items ##
execute at @p[gamemode=creative] run function give:morefood/tools/wooden_spoon
execute at @p[gamemode=creative] run function give:morefood/tools/knife/emerald
execute at @p[gamemode=creative] run function give:morefood/tools/knife/diamond
execute at @p[gamemode=creative] run function give:morefood/tools/knife/golden
execute at @p[gamemode=creative] run function give:morefood/tools/knife/iron
execute at @p[gamemode=creative] run function give:morefood/tools/knife/stone
execute at @p[gamemode=creative] run function give:morefood/tools/knife/wooden
execute at @p[gamemode=creative] run function give:morefood/tools/knife/netherite