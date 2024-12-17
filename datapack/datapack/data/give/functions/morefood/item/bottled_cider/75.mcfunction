# Desc: Give player the item
#
# Called by: Player and rcore_recipes:recipe/item/bottled_cider/75

execute if score alcohollore mf.config matches 0 run give @p minecraft:glass_bottle{cider:75,CustomModelData:50,display:{Name:"{\"translate\":\"item.morefood:bottled_cider\"}",Lore:["{\"translate\":\"lore.lps:item\"}","{\"translate\":\"lore.use.percent.75\"}"]}} 1

execute if score alcohollore mf.config matches 1 run give @p minecraft:glass_bottle{cider:75,CustomModelData:50,display:{Name:"{\"translate\":\"item.morefood:bottled_cider\"}",Lore:["{\"translate\":\"lore.lps:item\"}","{\"translate\":\"lore.uses_left\",\"with\":[{\"translate\":\"lore.uses_left.3\",\"italic\":\"false\"},{\"translate\":\"lore.uses_left.4\",\"italic\":\"false\"}]}"]}} 1

execute if score alcohollore mf.config matches 2 run give @p minecraft:glass_bottle{cider:75,CustomModelData:50,display:{Name:"{\"translate\":\"item.morefood:bottled_cider\"}",Lore:["{\"translate\":\"lore.lps:item\"}","{\"translate\":\"lore.use.percent_bar.75\"}"]}} 1