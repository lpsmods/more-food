# tree_apple
tellraw @a[scores={fooddev=1}] {"rawtext":[{"text":"<dev> summoned: tree_apple"}]}
# Logs
fill ~ ~ ~ ~ ~4 ~ log2 1 keep
# Leaves
fill ~2 ~2 ~2 ~-2 ~3 ~-2 leaves 0 keep
fill ~1 ~4 ~1 ~-1 ~5 ~-1 leaves 0 keep
# Fix
setblock ~-2 ~2 ~2 air
setblock ~-2 ~3 ~-2 air
fill ~2 ~2 ~2 ~2 ~3 ~2 air
setblock ~1 ~5 ~1 air
setblock ~1 ~5 ~-1 air
setblock ~-1 ~5 ~-1 air
fill ~-1 ~4 ~1 ~-1 ~5 ~1 air
# fruit Leaves
setblock ~2 ~3 ~-2 morefood:tree_apple
setblock ~-1 ~3 ~2 morefood:tree_apple
setblock ~1 ~5 ~ morefood:tree_apple