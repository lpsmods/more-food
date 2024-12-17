# Desc: Setup for the datapack
#
# Called by: #minecraft:load

tellraw @p {"translate":"morefood.reload.message"}
tellraw @p {"translate":"Missing datapack! - LPS Rcore API","color":"red"}
# drink_noise scoreboard #
scoreboard objectives add drink_noise minecraft.used:minecraft.beetroot_soup
scoreboard players set @p drink_noise 0

# turns off command feedback #
gamerule sendCommandFeedback false

# info trigger /trigger MorefoodInfo
scoreboard objectives add MorefoodInfo trigger "MorefoodInfo"
scoreboard players set @a MorefoodInfo 0
scoreboard players enable @a MorefoodInfo

# config scores
scoreboard objectives add mf.config dummy
scoreboard players set weapons mf.config 0
scoreboard players set alcohol mf.config 0
scoreboard players set craftable mf.config 0
scoreboard players set opitems mf.config 0
scoreboard players set itemeffects mf.config 0
execute unless score alcohollore mf.config matches 0.. run scoreboard players set alcohollore mf.config 0


# eaten scoreboards
scoreboard objectives add AteApple minecraft.used:minecraft.apple
scoreboard objectives add AteMushroom minecraft.used:minecraft.mushroom_stew
scoreboard objectives add AteBread minecraft.used:minecraft.bread
scoreboard objectives add AtePorkchop minecraft.used:minecraft.porkchop
scoreboard objectives add AteCPorkchop minecraft.used:minecraft.cooked_porkchop
scoreboard objectives add AteGApple minecraft.used:minecraft.golden_apple
scoreboard objectives add AteEGApple minecraft.used:minecraft.enchanted_golden_apple
scoreboard objectives add AteCod minecraft.used:minecraft.cod
scoreboard objectives add AteSalmon minecraft.used:minecraft.salmon
scoreboard objectives add AteTropical minecraft.used:minecraft.tropical_fish
scoreboard objectives add AtePuffer minecraft.used:minecraft.pufferfish
scoreboard objectives add AteCCod minecraft.used:minecraft.cooked_cod
scoreboard objectives add AteCSalmon minecraft.used:minecraft.cooked_salmon
scoreboard objectives add AteCake minecraft.used:minecraft.cake
scoreboard objectives add AteCookie minecraft.used:minecraft.cookie
scoreboard objectives add AteMelon minecraft.used:minecraft.melon_slice
scoreboard objectives add Atekelp minecraft.used:minecraft.dried_kelp
scoreboard objectives add AteBeef minecraft.used:minecraft.beef
scoreboard objectives add AteCBeef minecraft.used:minecraft.cooked_beef
scoreboard objectives add AteChicken minecraft.used:minecraft.chicken
scoreboard objectives add AteCChicken minecraft.used:minecraft.cooked_chicken
scoreboard objectives add AteRottenF minecraft.used:minecraft.rotten_flesh
scoreboard objectives add AteEye minecraft.used:minecraft.spider_eye
scoreboard objectives add AteCarrot minecraft.used:minecraft.carrot
scoreboard objectives add AtePotato minecraft.used:minecraft.potato
scoreboard objectives add AteBpotato minecraft.used:minecraft.baked_potato
scoreboard objectives add AtePPotato minecraft.used:minecraft.poisonous_potato
scoreboard objectives add AtePie minecraft.used:minecraft.pumpkin_pie
scoreboard objectives add AteRabbit minecraft.used:minecraft.rabbit
scoreboard objectives add AteCRabbit minecraft.used:minecraft.cooked_rabbit
scoreboard objectives add AteRabbitS minecraft.used:minecraft.rabbit_stew
scoreboard objectives add AteMutton minecraft.used:minecraft.mutton
scoreboard objectives add AteCMutton minecraft.used:minecraft.cooked_mutton
scoreboard objectives add AteBeet minecraft.used:minecraft.beetroot
scoreboard objectives add AteBeetS minecraft.used:minecraft.beetroot_soup
scoreboard objectives add AteBerries minecraft.used:minecraft.sweet_berries
scoreboard objectives add AteHoney minecraft.used:minecraft.honey_bottle
scoreboard objectives add AteGCarrot minecraft.used:minecraft.golden_carrot

# PlayerHealth scoreboard
scoreboard objectives add PlayerHealth dummy