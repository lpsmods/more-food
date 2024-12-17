# Desc: weapons on
#
# Called by: moreplant:config


scoreboard players add alcohollore mf.config 1

execute if score alcohollore mf.config matches 3 run scoreboard players set alcohollore mf.config 0

function morefood:config
playsound minecraft:ui.button.click master @s ~ ~ ~ .2 1.9 .2
gamerule sendCommandFeedback false