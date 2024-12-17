# Desc: makes drinking noise when a player has eaten a drink
#
# Called by: #minecraft:tick

execute at @p[scores={drink_noise=1}] as @e[nbt={SelectedItem:{id:"minecraft:bowl"}}] run playsound minecraft:item.honey_bottle.drink player @p
execute at @p[scores={drink_noise=..1}] run scoreboard players set @p drink_noise 0