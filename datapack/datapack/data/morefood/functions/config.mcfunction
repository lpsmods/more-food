# Desc: opens config
#
# Called by: Player & morefood:config

tellraw @s [{"text":"\n\n\n\n\n\n"}]
tellraw @s [{"translate":"morefood.config.title"}]

tellraw @s [{"translate":"morefood.config.weapons.desc"}]
execute unless score weapons mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.weapons"},{"translate":"morefood.config.true","clickEvent":{"action":"run_command","value":"/function morefood:config/weapons_off"}}]
execute if score weapons mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.weapons"},{"translate":"morefood.config.false","clickEvent":{"action":"run_command","value":"/function morefood:config/weapons_on"}}]

tellraw @s [{"translate":"morefood.config.alcohol.desc"}]
execute unless score alcohol mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.alcohol"},{"translate":"morefood.config.true","clickEvent":{"action":"run_command","value":"/function morefood:config/alcohol_off"}}]
execute if score alcohol mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.alcohol"},{"translate":"morefood.config.false","clickEvent":{"action":"run_command","value":"/function morefood:config/alcohol_on"}}]

tellraw @s [{"translate":"morefood.config.craftable.desc"}]
execute unless score craftable mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.craftable"},{"translate":"morefood.config.true","clickEvent":{"action":"run_command","value":"/function morefood:config/craftable_off"}}]
execute if score craftable mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.craftable"},{"translate":"morefood.config.false","clickEvent":{"action":"run_command","value":"/function morefood:config/craftable_on"}}]

tellraw @s [{"translate":"morefood.config.opitems.desc"}]
execute unless score opitems mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.opitems"},{"translate":"morefood.config.true","clickEvent":{"action":"run_command","value":"/function morefood:config/opitems_off"}}]
execute if score opitems mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.opitems"},{"translate":"morefood.config.false","clickEvent":{"action":"run_command","value":"/function morefood:config/opitems_on"}}]

tellraw @s [{"translate":"morefood.config.itemeffects.desc"}]
execute unless score itemeffects mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.itemeffects"},{"translate":"morefood.config.true","clickEvent":{"action":"run_command","value":"/function morefood:config/itemeffects_off"}}]
execute if score itemeffects mf.config matches 1.. run tellraw @s [{"translate":"morefood.config.itemeffects"},{"translate":"morefood.config.false","clickEvent":{"action":"run_command","value":"/function morefood:config/itemeffects_on"}}]

tellraw @s [{"translate":"morefood.config.alcohollore.desc"}]
execute if score alcohollore mf.config matches 0 run tellraw @s [{"translate":"morefood.config.alcohollore.option_0","clickEvent":{"action":"run_command","value":"/function morefood:config/alcohollore"}}]
execute if score alcohollore mf.config matches 1 run tellraw @s [{"translate":"morefood.config.alcohollore.option_1","clickEvent":{"action":"run_command","value":"/function morefood:config/alcohollore"}}]
execute if score alcohollore mf.config matches 2 run tellraw @s [{"translate":"morefood.config.alcohollore.option_2","clickEvent":{"action":"run_command","value":"/function morefood:config/alcohollore"}}]

gamerule sendCommandFeedback false