# Desc: alcohol on
#
# Called by: moreplant:config

scoreboard players set alcohol mf.config 0
function morefood:config
playsound minecraft:ui.button.click master @s ~ ~ ~ .2 1.9 .2
gamerule sendCommandFeedback false