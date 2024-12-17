# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [bedrock-1.7.0-rc2] - unreleased

### General

- Updated for 1.21.21
- Legacy blocks and items have been removed.
- No longer requires experimental features.
- Renamed `morefood:wooden_tree_tap` to `morefood:wooden_spile`
- Blocks and items now use custom components.
- Merged Halloween items and removed subpacks.
- Wooden Spile changes:
  - Will send a message when you don't place it on a tree
- Bottled beer, cider, red wine and white wine now use durability to show how many uses are left.

## [bedrock-1.7.0-rc1] (1.6.8) - 1/29/2024

If no issues arise this will be 1.7.0

### General

- Updated for Assets+ 1.6.0
- Reverted shroomlight and warped wart block changes from previous previews.

### Fixes

- #89 Sweet Corn Plants Unknown Blocks
- Poison berries now use the bush placing and breaking sounds
- Picking any hanging crop will give the player a sapling when in creative.
- Fixed cake with cherries having an invisible texture.
- MRE will now use a loot table instead of pre-defined meals.
- Fixed pancake and waffle recipes.
- You can now craft Sweet Corn Sacks using Sweet Corn.

### Added/Changes

- Added Cherry Leaves to Cherries recipe.
- Sweet Corn Crop is now 2 blocks tall.
- Fertile soil will now drop dirt when broken.
- The pancake mix recipe now gives 8 pancake mix.
- You can now get fried eggs from cooking turtle eggs.
- Changed knife recipes to match the new textures. Uses one stick instead of 2 black concrete.
- You can now craft stone knifes using blackstone and cobbled deepslate

## [bedrock-1.7.0-pre7] (1.6.7) - 12/22/2023

Hello, Hope you all have a great Christmas and New Year! This is the last preview for 1.7.0 which will be released in early 2024 🎆🎆🎆.

### General

- Added more textures by SuperSonic
  - Noodles
  - Oat Seeds
  - Oatmeal
  - Oatmeal Cookie
  - Olive Sapling
  - Onigiri
- Renamed more item ID's
  - corn -> sweet_corn
  - cut_sweet_fries -> sweet_french_fries
  - corn_flour -> corn_starch
  - milk_carton -> milk_bottle
  - cream_carton -> cream_bottle
- Added Pancake recipe
- Beverage recipes now only accept Water bottles instead of all potions.
- Jam and Glowberry Jam is no longer eatable and can't be stacked

### Items

- Removed Carton
- Added Smoothie Cup

### Recipes

Tweaked recipes: See Wiki for new recipes

- Waffle
- Jelly Sandwich
- Glowberry Jelly Sandwich
- Pasta
- Americano
- Beef Ravioli
- Beef Stew
- Beef Submarine Sandwich
- Bottled Beer
- Bottled White Wine
- Bottled Cider
- Breakfast Submarine Sandwich
- Burrito
- Cappuccino
- Cheese Tortellini
- Chicken Fajita
- Box of Chicken
- Chicken Soup
- Chicken Sub
- Vanilla Pudding
- Chocolate Pudding
- Sweet Corn
- Dark Chocolate
- Milk Chocolate
- White Chocolate
- Dough
- Milk Bottle
- Cream Bottle
- French Fry Pot
- Sweet French Fry Pot
- Ice Crush
- Pie
- Tumbler Glass
- Jar
- Wine Glass
- Beer Mug
- Ice Crush Glass
- Hot Cocoa
- Hot Coffee
- Hot Tea
- Ice Cream
- Macchiato
- Marshmallow
- Milkshake
- Mocha
- Onion Rings
- Jelly
- Pitta Bread
- Pretzel
- Ramen Noodles
- Round Cheese
- Salt
- Sausage Egg Muffin
- Sausage Egg Sandwich
- Toffee Latte
- Vanilla Latte
- Tortilla
- Trail Mix
- Wedges Pot
- Yeast
- Soda

## [bedrock-1.7.0-pre6] (1.6.6) - 10/31/2023

### Before Updating

- Make sure to create a backup of your world before updating. This update renames some block and item IDs that could be lost.

### General

- Updated for 1.20.40
- Add unlock data to recipes.
- Squids should now only drop one squid item.
- Glow Squids will now drop squid
- Hanging crops can now be placed on mangroves and cherry leaves (won't pop off when updated).
- Wooden Tree Tap can now be placed on mangrove and cherry logs.
- #81 Update block and item IDs.
- Outdated items will show up as dirt with "legacy"

### Fixed

- Fixed a handful of food items that are not using the eating animation.
- World gen is now working and doesn't require "Creation of Custom Biomes"
- #78 Saplings Disappearing
- #72 Chicken Soup doesn't return a bucket.

### Added

- Cherry Sack
- Hanging Cherry
- Missing recipes that are on the Wiki

### Removed

- Sub Wrapper

## [bedrock-1.7.0-pre5] (1.6.5) - 7-21-2023

### Known Issues

The following are issues with Minecraft that cannot be fixed.

- Diamond knives cannot be placed inside the smithing table to upgrade to netherite.
- The wooden tree tap has shading issues.
- To fill a cauldron using a maple sap bucket you will need to SNEAK + CLICK on the empty cauldron.

### General

- Updated for 1.20.21
- MRE is no longer stackable
- Resrouce and Behavior pack now uses translations and shows the version number.
- Netherite knife now requres a smithing template like all other netherite tools.
- You can now place a cauldron underneath a wooden tree tap and it will fill the cauldron.
- Alhocol bottles now have "uses" instead of percentage.
- Added potted watermint, spearmint and saplings.
- Pick-block should now give you the correct item.
- You can get dye from crops by placing 2 crop items anywhere in the crafting table.
- You can now obtain Shroomlight Slices and Warped Berries by breaking Shroomlight and Warped Wart Blocks. Use silk touch to obtain the block.

### Fixes/Removed

- MRE will now work when you click while holding it.
- Fixed text issues with the behavior, resource pack, and holiday features showing an `A`
- Covered apples now show the eating animation.
- Saplings will now fail to grow trees if a block is directly above the sapling.
- Saplings will now break blocks that are in the way instead of replacing them.
- Removed test "diamond" tree.
- Removed the farmhouse until jigsaws are working [MCPE-155321](https://bugs.mojang.com/browse/MCPE-155321)
- Removed the cherry on the Minecraft cake
- Removed legacy textures toggle from the resource pack
- Wooden Tree Taps can now only be placed on logs and will break when the log has been broken.

### New Items

- Cherries
- Cake with Cherry

## [bedrock-1.7.0-pre4] (1.6.4) - 4-11-2023

- Updated for 1.19.73
- Requires Experimental Molang
- Uses v1.2.0 of assets plus
- More textures from SuperSonic
- Any blocks that run commands will no longer send feedback in chat.
- Removed legacy blocks.
- Fertile soil now uses the dirt texture for the side.

### Fixed

- #42 Palm Tree Leaves Disappearing
- #39 Wooden Tree Tap Not Working
- #56 Vanilla extract consumes a bottle when used
- #40 Missing or broken recipes
- The wooden spoon should now properly break shovel-like blocks
- The wooden spoon should get damaged when it breaks blocks
- Wooden Tree Tap should now properly give the player a maple sap bucket when collected.
- Fixed large bowl recipe.
- The Macchiato recipe now matches the wiki
- Added eating animation for some items

### Changes

- The wooden tree tap will now only increase its sap level when it is on a 2-log-high tree
- Adjusted after consumed item to better match the texture.
  - Hoglin Meat -> Bone
  - Cooked Hoglin Meat -> Bone
  - Onion Rings -> none
  - Orange & Strawberry Jelly -> none
  - Pasta -> Bowl
  - Peppermint Extract -> Glass Bottle
  - Popcorn Bucket -> Bucket
  - Syrup -> Glass Bottle
  - Ramen Noodles -> Large Bowl
  - Spaghetti -> none
  - Spaghetti w/ Meatballs -> none
  - Spinach Fettuccine -> none
  - Sweet Mashed Potatoes -> none
  - Tomato Puree -> none
  - Sweet Potato Wedges Pot -> Flower Pot
  - Potato Wedges Pot -> Flower Pot

### Removed

- Empty Wedges Pot (uses Flower Pot)
- Empty Popcorn Bucket (uses Bucket)

## [bedrock-1.7.0-pre3] (1.6.3) - 5-17-2022

Lot's More Food 1.7.0 for 1.18.3 is just around the corner! This update introduces a handful of new items, blocks, structures, recipes, and more for the final few changes before this update is finally released.

- More new textures from SuperSonic.

### **Requirements**

- Assets Plus RP
- Experiments
  - Holiday Creator Features
  - Molang Features
  - Custom Biomes (for custom world generation)

### General

- Updated for 1.18.30
- Removed Soy Milk
- Hanging plants can now be placed on azalea and flowering azalea leaves.
- All Plants now use random tick speed. Increasing the tick speed will make plants grow faster.
- Garlic texture is now used for Garlic Bulb texture
- Changed Garlic texture to look like garlic cloves
- Mature (last stage) crops should now drop 1 crop item, and 1-2 seeds when broken.
- Improved plant stage increment, now uses MoLang instead of lots of event conditions, decreases file size and is more human-readable.
- Peanut Bush is now a crop, click on the "update" block to help it convert, or destroy it to drop one seed.
- Hanging Avocado now has a proper texture.
- All crops, bushes, and hanging plants now have 7 total stages but have the same number of visual stages. Check the wiki for more info
- Lighting a candle cake will now damage it.
- You can now light a candle cake with a fire charge.
- You can place any more food crops on Fertile Soil to prevent them from popping off when re-logging.
- Saplings can now be placed on dirt with roots (Rooted Dirt)
- Removed give functions, You can obtain all items, and blocks through /give or through creative inventory.
- Fixed an issue that when Holiday features are off console will print errors.
- Some hanging plants have updated textures to match their item form.
- MRE will no longer show the contents of the received menu.
- Cheese Spread is now stackable
- Removed custom UI
- Updated pack description.

### Wooden Tree Tap

- Uses `transform_item` event instead of the /give command.
- It will now use random tick speed instead of a set number of ticks to increase the sap level
- Placing a new tree tap will now have a sap level of 0 instead of 5.

### New Items

- Almond Sapling
- Garlic Bulb -> Garlic Crop
- Bean Seeds -> Bean Bush
- Cranberry Seeds -> Cranberry Bush
- Peppermint Seeds -> Peppermint Bush
- Watermint
- Spearmint
- Peppermint Extract
- Pulp
- Glass Shard
- Pretzel
- Fertile Soil

### Generation

- Almond Tree
- Bean Plot
- Cranberry Plot
- Watermint
- Spearmint
- Removed barns

### New Recipes

- Milk Bucket from Soybeans
- Gelatin
- Mashed Potatoes
- Sweet Mashed Potatoes
- Maple Muffin
- Maple Syrup Bucket
- Meal Ready To Eat
- Oatmeal
- Oatmeal Cookie
- Onion Rings
- Pancake Mix
- Peanut Butter Jelly Sandwich
- Pork Sausage Burger
- Pound Cake
- Pretzel Nuggets
- Pretzel Sticks
- Pulled Beef Burger
- Spaghetti With Meatballs
- Spinach Fettuccine
- Sugar Cookie
- Sweet Potato Fries
- Trail Mix
- Tortilla With Cheese
- Tortilla With Jalapeno Cheese
- Tortilla Chips
- Peppermint Ring
- Pretzel
- Glass from Glass Shard
- Glass Shard from Jar
- Glass Shard from Wine Glass
- Glass Shard from Beer Glass
- Glass Shard from Bottle
- Glass Shard from Empty Icecrush Glass
- Glass Shard from Empty Tumbler Glass
- Paper from Pulp
- Iron Nugget from Empty Soda Can
- Pulp from Hot Beverage Cup
- Pulp from Sub Wrapper
- Pulp from Fry Wrapper
- Pulp from Beverage Cup
- Pulp from Carton
- Garlic from Garlic Bulb

### Known Issues

- Tree Tap has a funky-looking texture

### Note

This preview version introduces a world generation that is subject to change. It is recommended to create a backup of your world before adding this add-on to your world.

---

## [bedrock-1.7.0-pre2] (1.6.2) - 2-10-2022

### General

- Updated for 1.18.10
- Removed emerald knife
- All foods should be eatable
- cornflour is not eatable.
- You can now use the smithing table to upgrade your diamond knife to a netherite knife.

### Fixes

- Crop and tree tap blocks use the updated texture and have no model.
- Certain items have the same textures. [#35](https://github.com/legopitstop/Lots-More-Food-Mods/issues/35)

### Known Issues

- Crops pop off farmland in some cases. This is an issue that is not fixable through add-ons. (Mojang will have to fix it.)
- Tree taps behave and look weird.

---

## [bedrock-1.7.0-pre1] (1.6.1) - 5-17-2021

### General

- min Minecraft version ( 1.17.30 )
- Blocks will now show up in the creative inventory.
- Added copper knife
- Added texture toggle to a resource pack. Default, The new textures by [SuperSonic](URL). Legacy, textures before v1.6.0. Legacy dev art, Textures that were used when More food was first released to the public.
- You can view all the new items, blocks, and recipes via the new Google Sheet. [View Recipes](https://docs.google.com/spreadsheets/d/e/2PACX-1vS6vSEl2wLOzFk6hr15sV3QYFTPIUGMFx_Z0Oyeux36ta970iYemqWMpkKJEl8hDKZjtnGLd_nl-g0P/pubhtml)
- Blocks now have tags. ie; all plants have 'non_full' tag. all bushes can be placed on blocks with tags 'grass' and/or 'dirt' etc.
- You can now place candles on cakes.
- Added links to resource and behavior pack's description.
- All plants will now emit growth particles and use the bonemeal sound when bonemeal
- Bushes can now be bonemeal to stage 3 (last stage) without harvesting, You must not be holding bonemeal to harvest.

### New Stuff

#### 1.17 only

- breadsticks with glowberry jam
- crackers with glowberry jam
- cut bread with glowberry jam
- glowberry ice crush
- glowberry pie
- glowberry smoothie
- glowberry soda
- glowberry jam
- glowberry juice
- glowberry jelly sandwich

#### Plants

- avocado tree
- blueberry bush
- poison berry bush
- sweet potatoes, crop
- buckwheat, crop
- cabbage, crop
- eggplant, crop
- oat, crop
- soybeans, crop
- spinach, crop

#### Items

- applesauce
- baked sweet potato
- beef ravioli
- beef stew
- blueberries
- blueberry seeds (bush)
- blueberry syrup
- buckwheat (crop)
- cabbage seeds (crop)
- chili
- cut sweet potato
- dark chocolate-covered apple
- eggplant
- eggplant seeds (crop)
- garlic
- guacamole
- large bowl
- maple sap bucket
- maple syrup
- maple syrup bucket
- mashed potatoes
- milk chocolate-covered apple
- oat seeds (crop)
- oatmeal
- oatmeal cookie
- oats
- pancake mix
- peanut butter
- peanut butter jelly sandwich
- poison berries (bush)
- poisonous sweet potato
- pulled beef burger
- raspberry syrup
- roasted soybeans
- soy flour
- soy milk
- soy oil
- soybeans (crop)
- spinach seeds (crop)
- strawberry syrup
- sunflower oil
- sweet mashed potatoes
- sweet potato (crop)
- sweet potato fries
- tortilla chips
- white chocolate-covered apple
- almonds
- beef goulash
- breadsticks
- breadsticks with peanut butter
- breadsticks with jam
- cappuccino drink mix
- cheese spread
- cheese tortellini
- chicken soup
- chocolate banana muffin
- chocolate chunk oatmeal cookie
- chocolate peanut butter
- chocolate protein drink
- chocolate protein drink mix
- chocolate pudding
- cocoa beverage
- cocoa beverage powder
- cornbread
- crackers
- crackers with cheese
- crackers with chocolate peanut butter
- crackers with jalapeno cheese
- crackers with jam
- crackers with peanut butter
- cut bread with cheese
- cut bread with chocolate peanut butter
- cut bread with jalapeno cheese
- cut bread with jam
- cut bread with peanut butter
- dried cranberries
- dried raisins
- garlic mashed potatoes
- grape beverage
- grape beverage powder
- hash browns
- jalapeno cheese bucket
- jalapeno cheese pie
- jalapeno cheese spread
- jalapeno cheese toastie
- jalapeno cheese wedge
- jalapeno round cheese
- lemon-lime beverage
- lemon-lime beverage powder
- maple muffin
- orange beverage
- orange beverage powder
- peanut butter
- peppermint ring
- pork sausage burger
- pound cake
- pretzel nuggets
- pretzel sticks
- roasted peanuts
- smoked almonds
- spaghetti with meatballs
- spinach fettuccine
- sugar cookies
- tortilla with cheese
- tortilla with jalapeno cheese
- trail mix
- tropical-punch beverage
- tropical-punch beverage powder
- tuna sandwich
- vanilla pudding
- wooden tree tap
  - Used to gather tree sap. Place on any log.
- meal ready-to-eat (MRE)
  - when you click on the MRE it will give you one meal, check wiki for more.

#### Blocks

- Tree tap
- Sack of almond
- Sack of avocado
- Sack of banana
- Sack of barley
- Sack of bean
- Sack of blueberry
- Sack of blueberry seed
- Sack of buckwheat
- Sack of cabbage
- Sack of cabbage seed
- Sack of chocolate chunk oatmeal cookie
- Sack of coconut
- Sack of coffee bean
- Sack of corn cob
- Sack of corn
- Sack of cornflour
- Sack of cranberry
- Sack of eggplant
- Sack of eggplant seed
- Sack of flour
- Sack of garlic
- Sack of gherkin
- Sack of gherkin seed
- Sack of grape
- Sack of grape seed
- Sack of hops
- Sack of hops seed
- Sack of lemon
- Sack of lettuce
- Sack of lettuce seed
- Sack of nether cookie
- Sack of oat
- Sack of oat seed
- Sack of oatmeal cookie
- Sack of olives
- Sack of onion
- Sack of onion seed
- Sack of orange
- Sack of peanut
- Sack of peanut seed
- Sack of pepper
- Sack of pepper seed
- Sack of plum
- Sack of poison berry
- Sack of poisonous sweet potato
- Sack of raspberry
- Sack of raspberry seed
- Sack of rice
- Sack of rice seed
- Sack of soybean
- Sack of spinach
- Sack of spinach seed
- Sack of strawberry
- Sack of strawberry seed
- Sack of sugar cookie
- Sack of sweet potato
- Sack of tea leaf
- Sack of tea seed
- Sack of tomato
- Sack of tomato seed
- Sack of vanilla pod
- Sack of vanilla seed
- Sack of yeast

### Recipes

- recipes for all new items
- Added jam recipe.
- Added shroomlight slices to shroomlight recipe.

### Fixes

- fixed spamming of invalid var "varable.worldx" in console.

If you find any bugs with this update or any future updates please properly fill out a bug report. [Github Bug Tracker](https://github.com/legopitstop/Lots-More-Food-Mods/issues)

## [fabric-0.0.5] - unreleased

### General

- Updated for 1.21
- Now uses Java 21

## [fabric-0.0.4] - 2/7/2024

### General

- Updated for 1.20.4
- Short and Tall grass loot tables now inject LMF seeds instead of overriding them.
- Made "c:knives" item tag which contains all LMF knives.
- Changed knife recipe to match the new textures.

### Bug Fixes

- #90 Berry Bushes Do Not Affect Mob Pathfinding
- Knife recipes should now work.
- #76 Peanut crop doesn't drop Peanuts
- #75 Peanut crop uses the wrong model
- #74 Some crops don't look fully grown
- #73 Spearmint and Watermint have black backgrounds
- #82 Coffee beans give nothing upon harvest
- #84 Both Raw hamburger and Vegan burger patties are not cooked

### New/Changes

- Corn is now 2 blocks tall
- Added shroomlight recipe from shroomlight slices.

## [fabric-0.0.3] - 9-21-2023

### General

- Updated for 1.20.2
- Fixed a crash that would occor when attempting to bone meal hanging fruits.

## [fabric-0.0.2] - 8-9-2023

### General

- Saplings, Crops, and Seeds are now compostable.

### Bug Fixes

- #69 Plants have black & white backgrounds
- #70 Issues with Candle Cakes

### New

Added holiday themed items.

- Candy (all 16 colors)
- Candy Corn
- Candy Corn Bowl
- Cooked Pumpkin Seeds
- Cooked Salted Pumpkin Seeds
- Small Pumpkin Pale
- Large Pumpkin Pale
- Ghast Cookie

## [fabric-0.0.1] - 7-26-2023

### Known Issues

- Plants are not transparent. (They have white & black backgrounds)
- Holiday features (candy, ghast cookies, etc) are not added yet.
- Candle Cakes cannot be lit using Flint and Steel.

### General

- Initial Release

## [forge-1.3.0-beta1] - nov/25/2021

### Known Issues

- Compressed blocks have not been added.
- Chocolate, Rainbow, and red white blue candle cakes have issues.

### General

- Updated for 1.17.1 and uses Java 16
- Added Copper Knife
- Removed Emerald Knife
- Updated some item id's
- Added new textures by SuperSonic
- Removed Stove Block

### Fixes

- Items should now have their proper max stack size.
- #22 Hamburger and veganburger cooked patties use the wrong texture.

## [forge-1.2.0] - nov/10/2020

### New

- Recipes!!! all recipes are added!!
- Sub Wrapper Item for sub recipes
- Temp coconut item for recipes
- Added pepper bush texture Fixes
- Fixed all data and asset errors
- Changed mod banner in mod description.

### Other

- Updated for 1.16.4 Minecraft and 35 Forge.
- Removed exotic trader, no longer needed.

## [forge-1.0.0-pre1] - sep/5/2020

### General

- New Fluids; cheese & sparkling water (WIP)
- New Sounds for consuming certain foods/drinks
- New Crops & bushes! (world generation not added yet)
- New Items!
  - Sparkling Water Bottle
  - Pepper
  - Cooked Chicken Piece
  - Cooked Wedges
  - Creative Hunger item (will give you hunger, can be useful when testing foods)

### Fixes

- stove flame has black around it.

### Other

- Updated for 1.16.2 Forge
- Added issue tracker URL
- The stove model uses/has a parent file (in case if it is needed or other variants are added)

## [forge-1.0.1] - aug/11/2020

### New Blocks

- Added stove (no functions rn)
- Tons of compressed food blocks

### New Items

- Added all food items

### Loot Tables

- some entities drop food (bats=batmeat, hoglin=hoglin meat)

### Other

- Updated to forge 1.16.1 - 32.0.108
- Added update JSON

(NOT all recipes are added, but are coming soon!)

## [forge-1.0.0] - jul/27/2020

Initial release, Not all food items are added.

## [datapack-3.1] - aug/12/2020

### General

- lang.json has been moved to morefood asset folder.
- Alcohol bottles now have a percentage Lore.
- Added alcohol lore option to config.
- Recipe folders have been moved around.
- Added 0% alcohol bottles.
- Bottled beer to glass recipes work, check recipe doc
- changed up resourcepack texture & model locations
- knifes use parent model in template folder, same for the spoon
- Updated pack format to 6 for 1.16.2
- New Chicken Nugget (cooked & raw) Place one cooked/raw chicken in the middle of the custom crafting table.

## [datapack-3.0] - jun/22/2020

### General

- Updated for 1.16 Snapshots
- random number name for rcore_recipe: tick, pages, and recipe tick
- items that drop from entities (bat & squid) now have lore and stack with other items
- changed bat and squid loot tables, both will drop between 0-2 of the item or 1-3 with looting

and don't need to be killed by a player to drop (can be farmable)

- Fixed - squid not dropping ink sac
- New Nether Foods! Scary!
- zoglin and zombified piglin drop Rotten Porkchop, not rotten flesh
- Warped Berries drop from warped wart block, and Shroomlight Slices drop from shroomlight
- added eaten scoreboard for all eatable items (can be used to add/remove effects)
- removed some unneeded function files
- added Desc: and Called By: in each function file for better understanding for me and others.
- changed resourcepack assets around, models and textures now use morefood: instead of Minecraft:
- Updated to work with LPS_Recipe_API v2.5-pre2+
- Changed up some item names (ex: Icecream (chocolate) = Chocolate Icecream)
- Resourcepack: fixed some errors that came up in-game output log.
- fixed: Villager spawn egg texture
- Items that have give effects have Lore underneath the name.

### Get new foods?

- Shroomlight Slices - shroomlight now acts like melons, break to get slices. use silk touch to get the block
- Warped Berries - sometimes drops instead of Warped Wart block
- Hoglin Meat - Drops from Hollins. replaces porkchop drop
- Rotten Porkchop - Drops from Zoglin & Zombified Piglin. replaces rotten flesh drop

All the rest are made by recipes. Find a text-based doc here and image-based doc here

## [datapack-2.9] - apr/25/2020

### General

- updated for v2.4+ LPS Rcore category system
- removed Recipe Book (item)

## [datapack-2.8] - apr/19/2020

### General

- added moreplants textures.
- Fixed & Tested all recipes! Make sure to install LPS Rcore API and use the custom crafting table.

## [datapack-2.7] - apr/11/2020

### General

Today (April 11) is morefood’s birthday! The morefood pack is now one year old. The pack was uploaded to PMC on April 11th, 2019 and since then it has gone through a bunch of updates and even a port to bedrock edition. Thanks for coming on this journey with us bugs and all!

- 🎂🎂Added cakes🎂🎂!
- Added plant cross/crop models for the latest moreplants version.
- Added more recipes to recipe table book (yes, recipes are buggy rn)

You can find a video of the cake recipes on my twitter: https://twitter.com/i/status/1249000328827199488

## [datapack-2.6] - feb/28/2020

- Added Onigiri and Sashimi (thanks to Contributors#Raihan-Art27 for suggestion & textures)
- Added "Lots More Food" text on MoJang loading screen and under Minecraft menu screen
- New display name system (support for more lang)
- Support for "LPS RCore API" recipe book table.
- Hopefully fixed recipes, Report any recipes that are'nt working.
- added netherite Knife for 1.16 (untested, but should work)

## [datapack-2.5] - nov/12/2019

### New Textures

- icecream cone(s)
- Hotdog

## [datapack-2.4] - nov/8/2019

### General

- fixed textures
- fixed bookshelf texture
- Make sure to Download LPS Core API (MAKE SURE TO INSTALL RECENT VERSION V1.8)
- new table model

## [datapack-2.3] - nov/2/2019

### General

- fixed textures
- fixed bookshelf texture

## [datapack-2.2] - oct/14/2019

### General

- Recipes should now work, download the latest version of 'Legopitstop's Recipe Core'
- Make sure to also install the newest version of More Food texture pack (In download)
- all textures in resource pack are in one folder named 'morefood' useful for combining other packs.

## [datapack-2.1] - oct/8/2019

### General

NOW SURVIVAL COMPATIBLE!!! Recipes are added. thanks to Sir_Craftypants

## [datapack-2.0] - sep/16/2019

This adds soo many items and food items I don't know how to add all of it here, soo... Just download and check it out! Many many thanks to Sir_craftypants for helping, (I have recently started school.)

## [datapack-1.9] - aug/5/2019

### General

- added recipes for all the coffees, hot cocoa, and hot tea.
- fixed smoothie recipe.
- added mixed fruit recipes.

## [datapack-1.8] - jul/29/2019

### General

- Trees and plants have been moved to their own pack make sure to download if you want the plants
- trader spawn egg
- trader now will except five emeralds instead of one.
- Fixed cold drinks recipes
- Trader is now called exotic_trader
- Trader will now lock out after 16 trades
- Fruit trees will drop golden fruit after 2 Mc days (48000 ticks/40 min)
- added more 'function debug:' commands
- Cleaned up tree files (deleted 4 lines of code for each plant file. reduced file size)
- Trees will give you their items if they don't place. unless you are in creative then you will not recive the item.
- Added Credit pages with links apon reload.
- You can rename a crafting table to "Morefood Crafting Table" to get the custom crafting table via (LPS_Rcore)
- Cleared recipe book for new recipes coming in the future.
- added tools and item recipes.

## [datapack-1.7] - jul/22/2019

### General

- If you rename a wandering trader it will change all the trades (do this by renaming a name tag using a anvil or renaming the spawn egg)
- took out Cold Table, Hot Table, and Alcohol Table.
- bats drop their Raw Bat Meat
- squid drop their Raw Squid

### Added

- Sushi
- Cream Carton
- Toffee Donut
- Toffee Icecream
- Vanilla Icecream

## [datapack-1.6] - jul/16/2019

This update adds 3 new crafting benches. That are used for crafting. these tables include new blocks and block models, new sounds, new timer and more!

### Cold Table

- cold table for the cold drinks
- custom sound
- particle emitting
- custom recipes

### Hot Table

- hot table for the hot drinks
- custom sound
- particle emitting
- custom recipes

### Alcohol Table

- alcohol table for the alcohol
- custom sound
- particle emitting
- custom recipes

### New Items/Foods

- Americano
- Cappuccino
- Toffee Latte
- Vanilla Latte
- Macchiato
- Hops
- Breakfast Sub
- Pitta Bread
- Pizza Base
- Sausage Egg Muffin
- Sausage Egg Sandwich

### Changed/Fixed

- removed Brown Sugar
- removed Beer Barrel and gave Bottled Beer durability
- changed some item names and spelling errors
- fixed Cut Fries now have their texture
- removed Blender on and off
- removed Pizza Box only have Pizza Box Opened

## [datapack-1.5-fix] - jul/11/2019

- Forgot to add the hotbar.nbt file now added.

## [datapack-1.5] - jul/8/2019

### Food

- lots of Juices
- lots of Smoothies
- lots of Icecrushes
- Hot Cocoa
- Hot Coffee
- Hot Tea
- golden fruit
- golden donut
- Berry Pie
- Brown Sugar
- Coconut Milk
- Coconut Meat
- Milk Carton

### Items

- Hot Beverage Cup
- Tumbler Glass
- Icecrush Glass

### Plants

- cocoanut tree
- Tomato Bush
- Corn
- Lettuce
- Coffee Beans
- Strawberry Seeds

### Functions

- new creative tool/functions (function debug:)

## [datapack-1.4] - jul/1/2019

### Sir_Craftypants

#### Food

- Raw Hamburger Patty
- Raw patty
- Hotdog Sausage
- Cooked Hotdog Sausage
- Hotdog Bun
- Muffin Bun
- Bacon Egg Muffin
- Cheese Toastie
- Pot of wedges
- Kebab
- Tortilla
- Taco
- Chicken Fajita
- Burrito
- Bowl of Cereal
- Tomato Ketchup bottle
- Blue Cupcake
- Pink Cupcake
- White wine bottle
- Bottle of beer
- Beer
- Hot Beverage Cup
- New soda can
- 6 flavors of soda can
- Chocolate, Strawberry, Banana Milkshakes

#### Texture Fixes

- Pizza
- Lettuce
- Sliced Lettuce
- Round Cheese

### legopitstop

#### Food

- Bat Meat
- Cooked Bat Meat
- Jam
- Toffee
- Waffle
- Butter
- Chicken Sub
- Fried Squid
- Raw Squid
- Raw Wedges
- Wedges Pot

#### Items

- Beer Barrel (Durability:0,100,25,50,75)
- Beer Glass
- Cider Glass
- Icing pink and white
- Starch
- Wine Glass
- Pizza Box
- Pizza Box Opened

#### Other

- Grapes now grow on bushes
- grape sapling is now Grape Seeds (texture by legopitstop)
- trees and bushes will now drop fruit less often
- give functions are now organized

#### Changed

- some alcohol have durability (Durability:0,100,25,50,75) now are called ITEMS

## [datapack-1.3-fix] - jun/25/2019

### General

This version adds one more item Bottled White Wine and also fixed some textures.

## [datapack-1.3] - jun/24/2019

### New Items

#### Tools

- Emerald Knife

#### Items

- Blender
- blender on

#### Food

- Icecream Cone
- Chocolate Icecream
- Banana Icecream
- Strawberry Icecream
- Chocolate Donut
- Coffee Donut
- Plain Donut
- Pink Ice Donut
- Iced Donut
- Strawberry Donut
- Apple Pie
- Cheese Pie
- Chicken Pie
- Golden Apple Pie
- Lemon Pie
- Pie Base
- Pork Pie
- Steak Pie
- Strawberry Pie
- Grape Pie
- Toffee Pie
- Chicken Select
- Lemon
- Strawberry
- Sliced Tomato
- Sliced Lettuce
- Red Wine
- White Wine
- Bottled Red Wine
- Bottled Cider
- Cider

### New Textures

- Jelly Sandwich
- Jello
- Sliced Bread
- Toast
- Hamburger
- Veganburger
- White Chocolate
- Milk Chocolate
- Dark Chocolate
- sub
- Pizza Slice
- Hotdog With Bun

## [datapack-1.2] - may/29/2019

### General

Shhh... secret Wendsday update.

No new items - Just added new Creative Tab (saved toolbars)

## [datapack-1.1] - may/27/2019

### General

- Popcorn
- Popcorn Bucket
- Ramen Noodles
- Sparkling Water Bucket (animated texture)
- Apple
- Apple Slice
- Orange Slice
- Dough
- Jelly Sandwich
- Jello
- Loukoum
- Cut Fries
- Sliced Bread
- Corn On The Cob
- Recipe Book (added recipes: items, tools, and plants. Need Legopitstop's Recipe Core)
- Soda Can (empty)

## [datapack-update-2] - may/20/2019

### Added

- Apple Sapling and tree [plant]
- Banana Sapling and tree [plant]
- grape sapling and tree [plant]
- Orange Sapling and tree [plant]
- Banana
- Grape
- Orange
- Tomato
- Icecream Cone
- Ice Cream Bowl
- Pizza Slice
- Pizza
- Hotdog
- Dark Chocolate
- Spaghetti
- Sliced Lettuce

### Edited/Changed

- Sliced Pickles, new texture
- Sub Wrapper, new texture
- Sub Bun, new texture
- sub, new texture

All "Tools" items are craftable via LPS recipe core (recipe screenshots coming soon!)

## [datapack-beta] - unknown

### New

- all types of Knifes
- Mixing Spoon
- subs
- Sub Bun
- Pickles
- Sub Wrapper
