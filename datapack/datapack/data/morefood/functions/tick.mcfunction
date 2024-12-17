# Desc: runs all files (looping)
#
# Called by: #minecraft:tick

# trigger MorefoodInfo
execute if score @p MorefoodInfo matches 1.. run function morefood:data/info

## rename item to "Food Crafting Table"
execute as @a[nbt={SelectedItem:{id:"minecraft:crafting_table",tag:{display:{Name:"{\"text\":\"Food Crafting Table\"}"}}}}] run replaceitem entity @p weapon.mainhand armor_stand{display:{Name:"{\"text\":\"Crafting Table\",\"italic\":false}",Lore:["{\"text\":\"[Block]\",\"color\":\"dark_gray\",\"italic\":false}"]},CustomModelData:666,Craftingtable:1,EntityTag:{NoGravity:1b,Small:1b,Invisible:1b,CustomName:"{\"text\":\"LPS_Table\"}"}} 1

# Illegal items (clears items from !creative players)
function rcore_recipes:recipe_book/illegal_items

# cake functions
function morefood:cake/choc_cake
function morefood:cake/rainbow_cake
function morefood:cake/redwhiteblue_cake

#> eaten scoreboards
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:golden_apple",tag:{CustomModelData:62}}}] AteGApple matches 1.. run function morefood:food_effects/netherite_apple
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:golden_apple",tag:{CustomModelData:53}}}] AteGApple matches 1.. run function morefood:food_effects/round_cheese
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:golden_apple",tag:{CustomModelData:51}}}] AteGApple matches 1.. run function morefood:food_effects/veganburger
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:golden_apple",tag:{CustomModelData:50}}}] AteGApple matches 1.. run function morefood:food_effects/hamburger
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:golden_apple",tag:{CustomModelData:54}}}] AteGApple matches 1.. run function morefood:food_effects/bacon_egg_sandwich
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:golden_apple",tag:{CustomModelData:52}}}] AteGApple matches 1.. run function morefood:food_effects/jelly_sandwich
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:melon_slice",tag:{CustomModelData:53}}}] AteMelon matches 1.. run function morefood:food_effects/shroomlight
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:dried_kelp",tag:{CustomModelData:54}}}] Atekelp matches 1.. run function morefood:food_effects/warped_berries
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:pufferfish",tag:{CustomModelData:54}}}] AtePuffer matches 1.. run function morefood:food_effects/white_wine
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:pufferfish",tag:{CustomModelData:57}}}] AtePuffer matches 1.. run function morefood:food_effects/beer
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:pufferfish",tag:{CustomModelData:52}}}] AtePuffer matches 1.. run function morefood:food_effects/cider
execute if score @a[limit=1,nbt={SelectedItem:{id:"minecraft:pufferfish",tag:{CustomModelData:53}}}] AtePuffer matches 1.. run function morefood:food_effects/red_wine

# premade scoreboards
#execute if score @a[nbt=] AteApple matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteMushroom matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteBread matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AtePorkchop matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCPorkchop matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteGApple matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteEGApple matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCod matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteSalmon matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteTropical matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AtePuffer matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCCod matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCSalmon matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCake matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCookie matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteMelon matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] Atekelp matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteBeef matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCBeef matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteChicken matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCChicken matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteRottenF matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteEye matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCarrot matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AtePotato matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteBpotato matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AtePPotato matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AtePie matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteRabbit matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCRabbit matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteRabbitS matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteMutton matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteCMutton matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteBeet matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteBeetS matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteBerries matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteHoney matches 1.. run function morefood:food_effects
#execute if score @a[nbt=] AteGCarrot matches 1.. run function morefood:food_effects

# reset eaten scoreboard
execute if score @p AteApple matches 1.. run scoreboard players reset @p AteApple
execute if score @p AteMushroom matches 1.. run scoreboard players reset @p AteMushroom
execute if score @p AteBread matches 1.. run scoreboard players reset @p AteBread
execute if score @p AtePorkchop matches 1.. run scoreboard players reset @p AtePorkchop
execute if score @p AteCPorkchop matches 1.. run scoreboard players reset @p AteCPorkchop
execute if score @p AteGApple matches 1.. run scoreboard players reset @p AteGApple
execute if score @p AteEGApple matches 1.. run scoreboard players reset @p AteEGApple
execute if score @p AteCod matches 1.. run scoreboard players reset @p AteCod
execute if score @p AteSalmon matches 1.. run scoreboard players reset @p AteSalmon
execute if score @p AteTropical matches 1.. run scoreboard players reset @p AteTropical
execute if score @p AtePuffer matches 1.. run scoreboard players reset @p AtePuffer
execute if score @p AteCCod matches 1.. run scoreboard players reset @p AteCCod
execute if score @p AteCSalmon matches 1.. run scoreboard players reset @p AteCSalmon
execute if score @p AteCake matches 1.. run scoreboard players reset @p AteCake
execute if score @p AteCookie matches 1.. run scoreboard players reset @p AteCookie
execute if score @p AteMelon matches 1.. run scoreboard players reset @p AteMelon
execute if score @p Atekelp matches 1.. run scoreboard players reset @p Atekelp
execute if score @p AteBeef matches 1.. run scoreboard players reset @p AteBeef
execute if score @p AteCBeef matches 1.. run scoreboard players reset @p AteCBeef
execute if score @p AteChicken matches 1.. run scoreboard players reset @p AteChicken
execute if score @p AteCChicken matches 1.. run scoreboard players reset @p AteCChicken
execute if score @p AteRottenF matches 1.. run scoreboard players reset @p AteRottenF
execute if score @p AteEye matches 1.. run scoreboard players reset @p AteEye
execute if score @p AteCarrot matches 1.. run scoreboard players reset @p AteCarrot
execute if score @p AtePotato matches 1.. run scoreboard players reset @p AtePotato
execute if score @p AteBpotato matches 1.. run scoreboard players reset @p AteBpotato
execute if score @p AtePPotato matches 1.. run scoreboard players reset @p AtePPotato
execute if score @p AtePie matches 1.. run scoreboard players reset @p AtePie
execute if score @p AteRabbit matches 1.. run scoreboard players reset @p AteRabbit
execute if score @p AteCRabbit matches 1.. run scoreboard players reset @p AteCRabbit
execute if score @p AteRabbitS matches 1.. run scoreboard players reset @p AteRabbitS
execute if score @p AteMutton matches 1.. run scoreboard players reset @p AteMutton
execute if score @p AteCMutton matches 1.. run scoreboard players reset @p AteCMutton
execute if score @p AteBeet matches 1.. run scoreboard players reset @p AteBeet
execute if score @p AteBeetS matches 1.. run scoreboard players reset @p AteBeetS
execute if score @p AteBerries matches 1.. run scoreboard players reset @p AteBerries
execute if score @p AteHoney matches 1.. run scoreboard players reset @p AteHoney
execute if score @p AteGCarrot matches 1.. run scoreboard players reset @p AteGCarrot

# add player health to PlayerHealth to scoreboard
#execute as @e[type=player,distance=..1] store result score @s PlayerHealth run data get entity @s Health