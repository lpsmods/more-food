# Desc: player food effect, will give/remove effects
#
# Called by: morefood:tick

# exsample: execute as @a[nbt={SelectedItem:{id:"minecraft:apple",tag:{CustomModelData:50}}}] run effect give @p hunger 100 1

# white_wine = clears all effects
execute as @a[nbt={SelectedItem:{id:"minecraft:pufferfish",tag:{CustomModelData:54}}}] run effect give @p minecraft:speed 60 1