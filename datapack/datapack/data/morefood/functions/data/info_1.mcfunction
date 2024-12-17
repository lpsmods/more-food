# Desc: gives the player info about the datapack
#
# Called by: morefood:tick

# message
tellraw @p {"text":"\n\n\n\n\n\n\n\n\n\n\n\n\n"}
tellraw @p [{"translate":"lps.gui.line_separator"}]
tellraw @p [{"translate":"info.icon.back","clickEvent":{"action":"run_command","value":"/function morefood:data/info"}},{"translate":"info.how_to_get.title.1"},{"translate":"info.icon.next","clickEvent":{"action":"run_command","value":"/function morefood:data/info_2"}}]
tellraw @p [{"translate":"lps.gui.line_separator"}]

tellraw @p [{"translate":"info.how_to_get.text.2"}]
tellraw @p [{"translate":"info.how_to_get.text.3"}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.4"}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.5"}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.6","clickEvent":{"action":"suggest_command","value":"/function give:morefood/food/all1"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.7","clickEvent":{"action":"suggest_command","value":"/function give:morefood/food/all2"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.8","clickEvent":{"action":"suggest_command","value":"/function give:morefood/food/all3"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.9","clickEvent":{"action":"suggest_command","value":"/function give:morefood/food/all4"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.10","clickEvent":{"action":"suggest_command","value":"/function give:morefood/food/al5"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.11","clickEvent":{"action":"suggest_command","value":"/function give:morefood/food/all6"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.12","clickEvent":{"action":"suggest_command","value":"/function give:morefood/item/all1"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.13","clickEvent":{"action":"suggest_command","value":"/function give:morefood/item/all2"}}]
tellraw @p[gamemode=creative] [{"translate":"info.how_to_get.text.14","clickEvent":{"action":"suggest_command","value":"/function give:morefood/tools/all"}}]
tellraw @p[gamemode=!creative] [{"translate":"info.how_to_get.text.15"}]
tellraw @p[gamemode=!creative] [{"translate":"info.how_to_get.text.16"}]

tellraw @p [{"translate":"lps.gui.line_separator"}]