# Desc: cleanup world from all datapack settings/functions
#
# Called by: Player

# drink_noise scoreboard #
scoreboard objectives remove drink_noise

## uninstalled Message ##
tellraw @p {"text":"Successfully Uninstalled, do /reload if this was a misstake.","color":"red"}
