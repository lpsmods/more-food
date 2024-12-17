# Desc: credits ui 1/5
#
# Called by: morefood:load

tellraw @a {"text":"\n\n\n\n\n\n\n\n\n\n\n\n\n\n"}
tellraw @a ["",{"text":"    Credits\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n","bold":true,"color":"gray"},{"text":"\n   More Food","bold":true,"color":"dark_blue","clickEvent":{"action":"open_url","value":"https://www.planetminecraft.com/mod/more-food-1-14-datapack/"}},{"text":"\n","clickEvent":{"action":"open_url","value":"https://www.planetminecraft.com/mod/more-food-1-14-datapack/"}},{"text":"     Datapack","italic":true,"color":"blue","clickEvent":{"action":"open_url","value":"https://www.planetminecraft.com/mod/more-food-1-14-datapack/"}},{"text":"\n\n\n<<<   pg:1/5   ","color":"gray"},{"text":">>>","color":"gray","clickEvent":{"action":"run_command","value":"/function morefood:credits/pg2"}}]