# Desc: itemeffects off
#
# Called by: moreplant:config

scoreboard players set itemeffects mf.config 1
function morefood:config
playsound minecraft:ui.button.click master @s ~ ~ ~ .2 1.3 .2
gamerule sendCommandFeedback false