# Desc: player food effect, will give/remove effects
#
# Called by: morefood:tick

# exsample: execute as @a[nbt={SelectedItem:{id:"minecraft:apple",tag:{CustomModelData:50}}}] run effect give @p hunger 100 1

# bacon egg sandwich = clears all effects
effect clear @p minecraft:regeneration
effect clear @p minecraft:absorption