# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 32 Items ##
execute at @p[gamemode=creative] run function give:morefood/item/bottled_beer/100
execute at @p[gamemode=creative] run function give:morefood/item/bottled_beer/25
execute at @p[gamemode=creative] run function give:morefood/item/bottled_beer/50
execute at @p[gamemode=creative] run function give:morefood/item/bottled_beer/75
execute at @p[gamemode=creative] run function give:morefood/item/bottled_beer/0
execute at @p[gamemode=creative] run function give:morefood/item/bottled_cider/100
execute at @p[gamemode=creative] run function give:morefood/item/bottled_cider/25
execute at @p[gamemode=creative] run function give:morefood/item/bottled_cider/50
execute at @p[gamemode=creative] run function give:morefood/item/bottled_cider/75
execute at @p[gamemode=creative] run function give:morefood/item/bottled_cider/0
execute at @p[gamemode=creative] run function give:morefood/item/bottled_red_wine/100
execute at @p[gamemode=creative] run function give:morefood/item/bottled_red_wine/25
execute at @p[gamemode=creative] run function give:morefood/item/bottled_red_wine/50
execute at @p[gamemode=creative] run function give:morefood/item/bottled_red_wine/75
execute at @p[gamemode=creative] run function give:morefood/item/bottled_red_wine/0
execute at @p[gamemode=creative] run function give:morefood/item/bottled_white_wine/100
execute at @p[gamemode=creative] run function give:morefood/item/bottled_white_wine/25
execute at @p[gamemode=creative] run function give:morefood/item/bottled_white_wine/50
execute at @p[gamemode=creative] run function give:morefood/item/bottled_white_wine/75
execute at @p[gamemode=creative] run function give:morefood/item/bottled_white_wine/0
execute at @p[gamemode=creative] run function give:morefood/item/carton
execute at @p[gamemode=creative] run function give:morefood/item/chicken_select_box
execute at @p[gamemode=creative] run function give:morefood/item/fry_wrapping
execute at @p[gamemode=creative] run function give:morefood/item/icing
execute at @p[gamemode=creative] run function give:morefood/item/recipe_book
execute at @p[gamemode=creative] run function give:morefood/item/soda_can_empty
execute at @p[gamemode=creative] run function give:morefood/item/starch
execute at @p[gamemode=creative] run function give:morefood/item/sub_wrapping
execute at @p[gamemode=creative] run function give:morefood/item/cups/beer_glass
execute at @p[gamemode=creative] run function give:morefood/item/cups/beverage_cup
execute at @p[gamemode=creative] run function give:morefood/item/cups/wine_glass
execute at @p[gamemode=creative] run function give:morefood/item/cups/empty_icecrush_glass
execute at @p[gamemode=creative] run function give:morefood/item/cups/empty_tumbler_glass
execute at @p[gamemode=creative] run function give:morefood/item/cups/hot_beverage_cup
execute at @p[gamemode=creative] run function give:morefood/item/empty_popcorn_bucket
execute at @p[gamemode=creative] run function give:morefood/item/empty_wedges_pot
execute at @p[gamemode=creative] run function give:morefood/item/bottle