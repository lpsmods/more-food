# Desc: credits ui 2/5
#
# Called by: morefood:load

tellraw @a {"text":"\n\n\n\n\n\n\n\n\n\n\n\n\n\n"}
tellraw @a ["",{"text":"    Credits\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n","bold":true,"color":"gray"},{"text":"\n  Legopitstop","bold":true,"color":"gold","clickEvent":{"action":"open_url","value":"https://legopitstop.weebly.com/"}},{"text":"\n"},{"text":"   Pack Creator","italic":"true","color":"yellow","clickEvent":{"action":"open_url","value":"https://legopitstop.weebly.com/"}},{"text":"\n\n\n<<<","color":"gray","clickEvent":{"action":"run_command","value":"/function morefood:credits/pg1"}},{"text":"   pg:2/5   ","color":"gray"},{"text":">>>","color":"gray","clickEvent":{"action":"run_command","value":"/function morefood:credits/pg3"}}]
