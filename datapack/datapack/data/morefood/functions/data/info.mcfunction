# Desc: gives the player info about the datapack
#
# Called by: morefood:tick

# reset trigger
scoreboard players set @a MorefoodInfo 0
scoreboard players enable @a MorefoodInfo

# message
tellraw @p {"text":"\n\n\n\n\n\n\n\n\n\n\n\n\n"}
tellraw @p [{"translate":"lps.gui.line_separator"}]
tellraw @p [{"translate":"info.icon.backNo"},{"translate":"info.generalmf.title.1"},{"translate":"info.icon.next","clickEvent":{"action":"run_command","value":"/function morefood:data/info_1"}}]
tellraw @p [{"translate":"lps.gui.line_separator"}]
tellraw @p [{"translate":"info.generalmf.text.2"}]
tellraw @p [{"translate":"info.generalmf.text.3"}]

tellraw @p [{"translate":"lps.gui.line_separator"}]