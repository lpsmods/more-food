# Desc: run all give functions to recive all items
#
# Called by: Player

tellraw @p[gamemode=creative] {"text":"Make sure that your inventory is cleared of all items.","color":"gold"}
tellraw @p[gamemode=!creative] {"text":"Creative Mode Only!","color":"red"}
## 36 Items ##
execute at @p[gamemode=creative] run function give:morefood/food/strawberry_jelly
execute at @p[gamemode=creative] run function give:morefood/food/jelly_sandwich
execute at @p[gamemode=creative] run function give:morefood/food/kebab
execute at @p[gamemode=creative] run function give:morefood/food/turkish_delight
execute at @p[gamemode=creative] run function give:morefood/food/milk_carton
execute at @p[gamemode=creative] run function give:morefood/food/muffin_bun
execute at @p[gamemode=creative] run function give:morefood/food/vegi/pickles
execute at @p[gamemode=creative] run function give:morefood/food/pizza
execute at @p[gamemode=creative] run function give:morefood/food/pizza_slice
execute at @p[gamemode=creative] run function give:morefood/food/popcorn
execute at @p[gamemode=creative] run function give:morefood/food/popcorn_bucket
execute at @p[gamemode=creative] run function give:morefood/food/ramen_noodles
execute at @p[gamemode=creative] run function give:morefood/food/raw_hamburger_patty
execute at @p[gamemode=creative] run function give:morefood/food/raw_squid
execute at @p[gamemode=creative] run function give:morefood/food/raw_veganburger_patty
execute at @p[gamemode=creative] run function give:morefood/food/raw_wedges
execute at @p[gamemode=creative] run function give:morefood/food/round_cheese
execute at @p[gamemode=creative] run function give:morefood/food/spaghetti
execute at @p[gamemode=creative] run function give:morefood/food/sparkling_water_bucket
execute at @p[gamemode=creative] run function give:morefood/food/beef_sub
execute at @p[gamemode=creative] run function give:morefood/food/sub_bun
execute at @p[gamemode=creative] run function give:morefood/food/taco
execute at @p[gamemode=creative] run function give:morefood/food/tea_leaves
execute at @p[gamemode=creative] run function give:morefood/food/toast
execute at @p[gamemode=creative] run function give:morefood/food/toffee
execute at @p[gamemode=creative] run function give:morefood/food/tomato_ketchup
execute at @p[gamemode=creative] run function give:morefood/food/tortilla
execute at @p[gamemode=creative] run function give:morefood/food/veganburger
execute at @p[gamemode=creative] run function give:morefood/food/veganburger_patty
execute at @p[gamemode=creative] run function give:morefood/food/waffle
execute at @p[gamemode=creative] run function give:morefood/food/wedges_pot
execute at @p[gamemode=creative] run function give:morefood/food/alcohol/beer
execute at @p[gamemode=creative] run function give:morefood/food/alcohol/cider
execute at @p[gamemode=creative] run function give:morefood/food/alcohol/red_wine
execute at @p[gamemode=creative] run function give:morefood/food/alcohol/white_wine
execute at @p[gamemode=creative] run function give:morefood/food/sushi