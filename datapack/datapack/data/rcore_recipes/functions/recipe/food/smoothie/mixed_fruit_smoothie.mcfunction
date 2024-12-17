# Desc: this is the function that will give you your output item and clear the table
#
# Called By: rcore_recipes:function/recipe_tick_123456

# clears the table
execute at @e[type=armor_stand,name="Crafting Table"] run setblock ~ ~ ~ dropper[facing=down]{CustomName:"\"Crafting Table\""} replace
# plays crafted sound, leave blank for no sound. available custom sounds: (sound:table.custom.bang) (sound:table.custom.electric_zap) (sound:table.custom.steel_grind) (sound:table.custom.stone_grind) (sound:table.custom.ting) (sound:table.custom.wood_saw)
function sound:table.success

# you can change the give command(s), you can also change it to a function command like my other datapacks.
function give:morefood/food/smoothie/mixed_fruit_smoothie