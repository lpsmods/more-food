# Desc: player food effect, will give/remove effects
#
# Called by: morefood:tick

# exsample: execute as @a[nbt={SelectedItem:{id:"minecraft:apple",tag:{CustomModelData:50}}}] run effect give @p hunger 100 1

# netherite apple = remove vanilla effects add instant_health & other effects
effect clear @p minecraft:absorption
effect clear @p minecraft:regeneration
effect give @p minecraft:instant_health 60 0
effect give @p minecraft:resistance 240 0
effect give @p minecraft:absorption 240 3
effect give @p minecraft:strength 240 1
effect give @p minecraft:haste 240 2