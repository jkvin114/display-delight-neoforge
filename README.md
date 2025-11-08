# display delight neoforge 1.21+

<a href="https://www.curseforge.com/minecraft/mc-mods/display-delight">
  <img src="https://cf.way2muchnoise.eu/full_1144296_downloads.svg" alt="Curseforge Downloads">
</a>

[![Modrinth Downloads](https://img.shields.io/modrinth/dt/display-delight)](https://modrinth.com/mod/display-delight)

### [Forge/Neoforge 1.20.1 version](https://github.com/jkvin114/displaydelight-1.20.1-neoforge)

---
## Addon Namespace Abbreviations

- corn_delight : CD
- delightful : DF
- expandeddelight : ED
- oceansdelight : OD
- pineapple_delight : PD
- alexdelight : AD
- culturaldelights : CTD
- festive_delight : FD
- my nethers delight : MND
- end's delight: EDD
- ender delight : ERD
- Brewin and chewin : BNC
- large meals : LM
- aquaculture delight : ACD
- nether's delight : ND
- crabber's delight : CRD
## Naming rules
--- 
- Naming rules for all food blocks/items in this mod :
  - Normal foods: `[addon namespace abbereviation]_[actual food item id from the addon]`
  - Plated foods: `[addon namespace abbereviation]_plated_[actual food item id from the addon]`
  - Small plated foods: `[addon namespace abbereviation]_small_plated_[actual food item id from the addon]`
  - Vanila MC and vanila Farmer's Delight foods have addon namespace abbereviation omitted
  - Examples:
    - Vanila rabbit stew : `rabbit_stew`
    - Plated chicken sandwich from Farmer's Delight : `plated_chicken_sandwich`
    - Egg soup from My Nether's Delight : `mnd_egg_soup`

## Patch notes

### 1.1.0

---
- Addition (Vanila)
  - plated cookie
  - plated pumpkin pie
  - mushroom stew
  - rabbit stew
  - beetroot soup
- Addition (Farmer's Delight)
  - honey cookie
  - sweet berry cookie
- Added 8 foods from Corn Delight
- Added 26 foods from Expanded Delight
- Tweaked models for
    - Plated bacon sandwich
    - Noodle soup
    - Mixed salad
- New Interaction with plates
  - Shift click to place all items at once
  - Click with bare hand to take items
  - Shift click with bare hand to take all items
- Translations
  - zh_cn (Thanks, UserRooster)
  - ru_ru (Thanks, Korben)


### 1.2.0
---
- Added 22 foods from Delightful
- Added 5 foods from Pineapple Delight
- Added 9 foods from Ocean's Delight
- Added 8 foods from Alex's Delight
- Added 23 foods from Cultural Delights
- Added 13 foods from Large Meals
- Added 3 foods from Festive Delight
- Fixed texture glitch in bowl foods
- Tweaked texture for mutton wrap
- Added config to disable vanilla item placement

### 1.3.0

---

- Added creative tab
- You can grab any displayed food block item you want, even if the required mod/addon is not installed.
  - displayed food block items are not obtainable in survival
  - If required mod/addon is not installed, displayed food block item will drop the item itself
- Added all item models
- Technical changes
  - EmptyPlateBlock and EmptySmallPlateBlock no longer extends HorizontalDirectionBlock
  - default stack of StackablePlateFoodBlock is set to 6

### 1.4.0

--- 

- Breaking placed foods using silk touch tools drops the food block item itself
  - For plated foods, they should be in maximum stack to drop the food block item
- Wandering trader sells food block item. The items without compat installed will be priotized
  - This is the only way to obtain food block items in survival that does not have their compat installed
- Some food blocks emit particles
- Updated models for "plate of feast" foods
---

- Added 8 foods from Brewin' and Chewin'
- Added 15 foods from End's Delight
- Added 17 foods from Ender's Delight
- Added 15 foods from Crabber's Delight
- Added 18 foods from Aquaculture Delight
- Added 37 foods from My Nether's Delight
- Added 8 foods from Nether's Delight
  - Because Nether's Delight is discontinued, the food models reuse My Nether's Delight's models, and they do not apprear in the creative tab, and unobtainable through wandering trader
- Added 7 more foods from Expanded Delight
- Added 2 more foods from Cultural Delights

- Technical changes
  - Displayed food blocks no longer uses loot table, and instead utilizes block associations to generate the drops, which solely rely on item names
  - Fixed loot table log spamming issue for 1.20.1 version
  - Corrected block id : pd_small_plated_pineapple_pie_slice -> pd_small_plated_pineapple_pie_side




