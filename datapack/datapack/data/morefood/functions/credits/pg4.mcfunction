# Desc: credits ui 4/5
#
# Called by: morefood:load

tellraw @a {"text":"\n\n\n\n\n\n\n\n\n\n\n\n\n\n"}
tellraw @a ["",{"text":"    Credits\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n","bold":true,"color":"gray"},{"text":"\n   MrCrayfish","bold":true,"color":"dark_red","clickEvent":{"action":"open_url","value":"https://mrcrayfish.com/mods"}},{"text":"\n","clickEvent":{"action":"open_url","value":"https://mrcrayfish.com/mods"}},{"text":"  Model Creator","italic":true,"color":"red","clickEvent":{"action":"open_url","value":"https://mrcrayfish.com/mods"}},{"text":" ","bold":true,"color":"dark_green","clickEvent":{"action":"open_url","value":"https://mrcrayfish.com/mods"}},{"text":"\n\n\n<<<","color":"gray","clickEvent":{"action":"run_command","value":"/function morefood:credits/pg3"}},{"text":"   pg:4/5   ","color":"gray"},{"text":">>>","color":"gray","clickEvent":{"action":"run_command","value":"/function morefood:credits/pg5"}}]