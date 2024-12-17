# Desc: credits ui 5/5
#
# Called by: morefood:load

tellraw @a {"text":"\n\n\n\n\n\n\n\n\n\n\n\n\n\n"}
tellraw @a ["",{"text":"    Credits\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n","bold":true,"color":"gray"},{"text":"\n  FreePhotoTool","color":"dark_purple","clickEvent":{"action":"open_url","value":"https://www.freephototool.com/"}},{"text":"\n","clickEvent":{"action":"open_url","value":"https://www.freephototool.com/"}},{"text":"    Photoshop","italic":true,"color":"light_purple","clickEvent":{"action":"open_url","value":"https://www.freephototool.com/"}},{"text":"\n\n\n<<<","color":"gray","clickEvent":{"action":"run_command","value":"/function morefood:credits/pg4"}},{"text":"   pg:5/5   >>>","color":"gray"}]