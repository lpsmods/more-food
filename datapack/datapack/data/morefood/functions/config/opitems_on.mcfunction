# Desc: opitems on
#
# Called by: moreplant:config

scoreboard players set opitems mf.config 0
function morefood:config
playsound minecraft:ui.button.click master @s ~ ~ ~ .2 1.9 .2
gamerule sendCommandFeedback false