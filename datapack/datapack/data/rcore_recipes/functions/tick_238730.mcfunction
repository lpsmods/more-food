# Desc: Runs other RcoreAPI functions
#
# Called by: #minecraft:tick

# Crafting Table
execute at @e[type=armor_stand,name="Crafting Table"] run function rcore_recipes:function/recipe_tick_216601

# Recipe Book Table
execute at @e[type=armor_stand,name="Recipe Book Table"] if score boolean recipebookcheck matches 1.. run function rcore_recipes:recipe_book/pages_581334