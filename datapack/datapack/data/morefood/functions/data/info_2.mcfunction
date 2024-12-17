# Desc: gives the player info about the datapack
#
# Called by: morefood:tick

# message
tellraw @p {"text":"\n\n\n\n\n\n\n\n\n\n\n\n\n"}
tellraw @p [{"translate":"lps.gui.line_separator"}]
tellraw @p [{"translate":"info.icon.back","clickEvent":{"action":"run_command","value":"/function morefood:data/info_1"}},{"translate":"info.tools.title.1"},{"translate":"info.icon.next","clickEvent":{"action":"run_command","value":"/function morefood:data/info_3"}}]
tellraw @p [{"translate":"lps.gui.line_separator"}]

tellraw @p [{"translate":"info.tools.text.1"}]
tellraw @p [{"translate":"info.tools.text.2"}]
tellraw @p [{"translate":"info.tools.text.3"}]
tellraw @p [{"translate":"info.tools.text.4"}]
tellraw @p [{"translate":"info.tools.text.5"}]
tellraw @p [{"translate":"info.tools.text.6"}]
tellraw @p [{"translate":"info.tools.text.7"}]
tellraw @p [{"translate":"info.tools.text.8"}]
tellraw @p [{"translate":"info.tools.text.9"}]
tellraw @p [{"translate":"info.tools.text.10"}]
tellraw @p [{"translate":"info.tools.text.11"}]
tellraw @p [{"translate":"info.tools.text.12"}]
tellraw @p [{"translate":"info.tools.text.13"}]

tellraw @p [{"translate":"lps.gui.line_separator"}]