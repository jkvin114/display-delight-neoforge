package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class DisplayItems {
    public static final DeferredRegister<Item> REGISTRY= DeferredRegister.create(Registries.ITEM, DisplayDelight.MODID);;
    public static final DeferredHolder<Item, Item> PLATE = block(DisplayBlocks.PLATE);;

    public static final DeferredHolder<Item,Item> SMALL_PLATE =  block(DisplayBlocks.SMALL_PLATE);

   // public static final DeferredHolder<Item, Item> BOWL= block(DisplayBlocks.BOWL);;
    public static final DeferredHolder<Item,Item> FRUIT_SALAD = block(DisplayBlocks.FRUIT_SALAD);;
    public static final DeferredHolder<Item,Item> GLOW_BERRY_CUSTARD = block(DisplayBlocks.GLOW_BERRY_CUSTARD);

    public static final DeferredHolder<Item,Item> COOKED_RICE = block(DisplayBlocks.COOKED_RICE);
    public static final DeferredHolder<Item,Item> MIXED_SALAD = block(DisplayBlocks.MIXED_SALAD);
    public static final DeferredHolder<Item,Item> BEEF_STEW = block(DisplayBlocks.BEEF_STEW);
    public static final DeferredHolder<Item,Item> CHICKEN_SOUP = block(DisplayBlocks.CHICKEN_SOUP);
    public static final DeferredHolder<Item,Item> VEGETABLE_SOUP = block(DisplayBlocks.VEGETABLE_SOUP);
    public static final DeferredHolder<Item,Item> FISH_STEW = block(DisplayBlocks.FISH_STEW);
    public static final DeferredHolder<Item,Item> FRIED_RICE = block(DisplayBlocks.FRIED_RICE);
    public static final DeferredHolder<Item,Item> PUMPKIN_SOUP = block(DisplayBlocks.PUMPKIN_SOUP);
    public static final DeferredHolder<Item,Item> BAKED_COD_STEW = block(DisplayBlocks.BAKED_COD_STEW);
    public static final DeferredHolder<Item,Item> NOODLE_SOUP = block(DisplayBlocks.NOODLE_SOUP);
    public static final DeferredHolder<Item,Item> BONE_BROTH = block(DisplayBlocks.BONE_BROTH);
    public static final DeferredHolder<Item,Item> BACON_AND_EGGS = block(DisplayBlocks.BACON_AND_EGGS);
    public static final DeferredHolder<Item,Item> PASTA_WITH_MEATBALLS = block(DisplayBlocks.PASTA_WITH_MEATBALLS);
    public static final DeferredHolder<Item,Item> PASTA_WITH_MUTTON_CHOP = block(DisplayBlocks.PASTA_WITH_MUTTON_CHOP);
    public static final DeferredHolder<Item,Item> ROASTED_MUTTON_CHOPS = block(DisplayBlocks.ROASTED_MUTTON_CHOPS);
    public static final DeferredHolder<Item,Item> STEAK_AND_POTATOES = block(DisplayBlocks.STEAK_AND_POTATOES);
    public static final DeferredHolder<Item,Item> VEGETABLE_NOODLES = block(DisplayBlocks.VEGETABLE_NOODLES);
    public static final DeferredHolder<Item,Item> RATATOUILLE = block(DisplayBlocks.RATATOUILLE);
    public static final DeferredHolder<Item,Item> SQUID_INK_PASTA = block(DisplayBlocks.SQUID_INK_PASTA);
    public static final DeferredHolder<Item,Item> GRILLED_SALMON = block(DisplayBlocks.GRILLED_SALMON);
    public static final DeferredHolder<Item,Item> MUSHROOM_RICE = block(DisplayBlocks.MUSHROOM_RICE);
    public static final DeferredHolder<Item,Item> ROAST_CHICKEN = block(DisplayBlocks.ROAST_CHICKEN);
    public static final DeferredHolder<Item,Item> STUFFED_PUMPKIN = block(DisplayBlocks.STUFFED_PUMPKIN);
    public static final DeferredHolder<Item,Item> HONEY_GLAZED_HAM = block(DisplayBlocks.HONEY_GLAZED_HAM);
    public static final DeferredHolder<Item,Item> SHEPHEREDS_PIE = block(DisplayBlocks.SHEPHEREDS_PIE);
    public static final DeferredHolder<Item,Item> APPLE_CIDER = block(DisplayBlocks.APPLE_CIDER);
    public static final DeferredHolder<Item,Item> MELON_JUICE = block(DisplayBlocks.MELON_JUICE);
    public static final DeferredHolder<Item,Item> HOT_COCOA = block(DisplayBlocks.HOT_COCOA);

    public static final DeferredHolder<Item,Item> PLATED_HAMBURGER= block(PlatedBlocks.PLATED_HAMBURGER);
    public static final DeferredHolder<Item,Item> PLATED_KELP_ROLL_SLICE= block(PlatedBlocks.PLATED_KELP_ROLL_SLICE);

    public static final DeferredHolder<Item,Item> PLATED_DUMPLINGS = block(PlatedBlocks.PLATED_DUMPLINGS);

    public static final DeferredHolder<Item,Item> PLATED_BARBECUE_STICK= block(PlatedBlocks.PLATED_BARBECUE_STICK);
//
    public static final DeferredHolder<Item,Item> PLATED_CHICKEN_SANDWICH= block(PlatedBlocks.PLATED_CHICKEN_SANDWICH);
    public static final DeferredHolder<Item,Item> PLATED_COD_ROLL= block(PlatedBlocks.PLATED_COD_ROLL);
    public static final DeferredHolder<Item,Item> PLATED_EGG_SANDWICH= block(PlatedBlocks.PLATED_EGG_SANDWICH);
    public static final DeferredHolder<Item,Item> PLATED_KELP_ROLL= block(PlatedBlocks.PLATED_KELP_ROLL);

    public static final DeferredHolder<Item,Item> PLATED_SALMON_ROLL= block(PlatedBlocks.PLATED_SALMON_ROLL);
    public static final DeferredHolder<Item,Item> PLATED_MELON_POPSICLE= block(PlatedBlocks.PLATED_MELON_POPSICLE);
    public static final DeferredHolder<Item,Item> PLATED_STUFFED_POTATO= block(PlatedBlocks.PLATED_STUFFED_POTATO);
     public static final DeferredHolder<Item,Item> PLATED_CABBAGE_ROLLS= block(PlatedBlocks.PLATED_CABBAGE_ROLL);
     public static final DeferredHolder<Item,Item> PLATED_BACON_SANDWICH= block(PlatedBlocks.PLATED_BACON_SANDWICH);
     public static final DeferredHolder<Item,Item> PLATED_MUTTON_WRAP= block(PlatedBlocks.PLATED_MUTTON_WRAP);

    public static final DeferredHolder<Item,Item> PLATED_CAKE_SLICE =  block(SmallPlatedBlocks.PLATED_CAKE_SLICE);
    public static final DeferredHolder<Item,Item> PLATED_APPLE_PIE_SLICE =  block(SmallPlatedBlocks.PLATED_APPLE_PIE_SLICE);
    public static final DeferredHolder<Item,Item> PLATED_CHOCOLATE_PIE_SLICE =  block(SmallPlatedBlocks.PLATED_CHOCOLATE_PIE_SLICE);
    public static final DeferredHolder<Item,Item> PLATED_SWEET_BERRY_CHEESECAKE_SLICE =  block(SmallPlatedBlocks.PLATED_SWEET_BERRY_CHEESECAKE_SLICE);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_STUFFED_POTATO =  block(SmallPlatedBlocks.PLATED_STUFFED_POTATO);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_COD_ROLL =  block(SmallPlatedBlocks.PLATED_COD_ROLL);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_SALMON_ROLL =  block(SmallPlatedBlocks.PLATED_SALMON_ROLL);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_KELP_ROLL_SLICE =  block(SmallPlatedBlocks.PLATED_KELP_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_CABBAGE_ROLLS =  block(SmallPlatedBlocks.PLATED_CABBAGE_ROLLS);
//

    //VANILA
    public static final DeferredHolder<Item,Item> MUSHROOM_STEW = block(DisplayBlocks.MUSHROOM_STEW);
    public static final DeferredHolder<Item,Item> RABBIT_STEW = block(DisplayBlocks.RABBIT_STEW);
    public static final DeferredHolder<Item,Item> BEETROOT_STEW = block(DisplayBlocks.BEETROOT_STEW);

    //CORN DELIGHT

    public static final DeferredHolder<Item,Item> CD_NACHOS_BOWL = block(DisplayBlocks.CD_NACHOS_BOWL);
    public static final DeferredHolder<Item,Item> CD_CREAMY_COR_DRINK = block(DisplayBlocks.CD_CREAMY_COR_DRINK);

    public static final DeferredHolder<Item,Item> CD_CORNBREAD_STUFFING = block(DisplayBlocks.CD_CORNBREAD_STUFFING);
    public static final DeferredHolder<Item,Item> CD_CORN_SOUP = block(DisplayBlocks.CD_CORN_SOUP);
    public static final DeferredHolder<Item,Item> CD_CREAMED_CORN = block(DisplayBlocks.CD_CREAMED_CORN);

    //Expanded delight
    public static final DeferredHolder<Item,Item> ED_ASPARAGUS_SOUP = block(DisplayBlocks.ED_ASPARAGUS_SOUP);
    public static final DeferredHolder<Item,Item> ED_ASPARAGUS_SOUP_CREAMY = block(DisplayBlocks.ED_ASPARAGUS_SOUP_CREAMY);
    public static final DeferredHolder<Item,Item> ED_ASPARAGUS_AND_BACON_CHEESY = block(DisplayBlocks.ED_ASPARAGUS_AND_BACON_CHEESY);
    public static final DeferredHolder<Item,Item> ED_PEPERONATA = block(DisplayBlocks.ED_PEPERONATA);
    public static final DeferredHolder<Item,Item> ED_PEANUT_HONEY_SOUP = block(DisplayBlocks.ED_PEANUT_HONEY_SOUP);
    public static final DeferredHolder<Item,Item> ED_MAC_AND_CHEESE = block(DisplayBlocks.ED_MAC_AND_CHEESE);
    public static final DeferredHolder<Item,Item> ED_PEANUT_SALAD = block(DisplayBlocks.ED_PEANUT_SALAD);
    public static final DeferredHolder<Item,Item> ED_SWEET_POTTATO_SALAD = block(DisplayBlocks.ED_SWEET_POTTATO_SALAD);

    public static final DeferredHolder<Item,Item> ED_CINNAMON_RICE = block(DisplayBlocks.ED_CINNAMON_RICE);
    public static final DeferredHolder<Item,Item> ED_CINNAMON_APPLES = block(DisplayBlocks.ED_CINNAMON_APPLES);

    public static final DeferredHolder<Item,Item> ED_APPLE_JUICE = block(DisplayBlocks.ED_APPLE_JUICE);
    public static final DeferredHolder<Item,Item> ED_SWEET_BERRY_JUICE = block(DisplayBlocks.ED_SWEET_BERRY_JUICE);
    public static final DeferredHolder<Item,Item> ED_GLOW_BERRY_JUICE = block(DisplayBlocks.ED_GLOW_BERRY_JUICE);


    //delightful
    public static final DeferredHolder<Item,Item> DF_MATCHA_ICE_CREAM = block(DisplayBlocks.DF_MATCHA_ICE_CREAM);
    public static final DeferredHolder<Item,Item> DF_MATCHA_MILKSHAKE = block(DisplayBlocks.DF_MATCHA_MILKSHAKE);
    public static final DeferredHolder<Item,Item> DF_SALMONBERRY_ICE_CREAM = block(DisplayBlocks.DF_SALMONBERRY_ICE_CREAM);
    public static final DeferredHolder<Item,Item> DF_SALMONBERRY_MILKSHAKE = block(DisplayBlocks.DF_SALMONBERRY_MILKSHAKE);
    public static final DeferredHolder<Item,Item> DF_MATCHA_LATTE = block(DisplayBlocks.DF_MATCHA_LATTE);
    public static final DeferredHolder<Item,Item> DF_ENDER_NECTAR = block(DisplayBlocks.DF_ENDER_NECTAR);
    public static final DeferredHolder<Item,Item> DF_BERRY_MATCHA_LATTE = block(DisplayBlocks.DF_BERRY_MATCHA_LATTE);
    public static final DeferredHolder<Item,Item> DF_CACTUS_CHILI = block(DisplayBlocks.DF_CACTUS_CHILI);
    public static final DeferredHolder<Item,Item> DF_FIELD_SALAD = block(DisplayBlocks.DF_FIELD_SALAD);
    public static final DeferredHolder<Item,Item> DF_STUFFED_CANTALOUPE = block(DisplayBlocks.DF_STUFFED_CANTALOUPE);
    public static final DeferredHolder<Item,Item> DF_SINIGANG = block(DisplayBlocks.DF_SINIGANG);
    public static final DeferredHolder<Item,Item> DF_CACTUS_SOUP = block(DisplayBlocks.DF_CACTUS_SOUP);

    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_FRIED_RICE = block(DisplayBlocks.PD_PINEAPPLE_FRIED_RICE);
    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_ICE_CREAM = block(DisplayBlocks.PD_PINEAPPLE_ICE_CREAM);
    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_MILK_SHAKE = block(DisplayBlocks.PD_PINEAPPLE_MILK_SHAKE);
    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_JUICE = block(DisplayBlocks.PD_PINEAPPLE_JUICE);


    //ocean delight
    public static final DeferredHolder<Item,Item> OD_BOWL_OF_GUARDIAN_SOUP = block(DisplayBlocks.OD_BOWL_OF_GUARDIAN_SOUP);
    public static final DeferredHolder<Item,Item> OD_BRAISED_SEA_PICKLE = block(DisplayBlocks.OD_BRAISED_SEA_PICKLE);
    public static final DeferredHolder<Item,Item> OD_SEAGRASS_SALAD = block(DisplayBlocks.OD_SEAGRASS_SALAD);
    public static final DeferredHolder<Item,Item> OD_SQUID_RINGS = block(DisplayBlocks.OD_SQUID_RINGS);


    //alex delight
    public static final DeferredHolder<Item,Item> AD_MAGGOT_SALAD = block(DisplayBlocks.AD_MAGGOT_SALAD);
    public static final DeferredHolder<Item,Item> AD_KANGAROO_STEW = block(DisplayBlocks.AD_KANGAROO_STEW);
    public static final DeferredHolder<Item,Item> AD_ACACIA_BLOSSOM_SOUP = block(DisplayBlocks.AD_ACACIA_BLOSSOM_SOUP);
    public static final DeferredHolder<Item,Item> AD_LOBSTER_PASTA = block(DisplayBlocks.AD_LOBSTER_PASTA);
    public static final DeferredHolder<Item,Item> AD_KANGAROO_PASTA = block(DisplayBlocks.AD_KANGAROO_PASTA);

    //cultural delights
    public static final DeferredHolder<Item,Item> CTD_HEARTY_SALAD = block(DisplayBlocks.CTD_HEARTY_SALAD);
    public static final DeferredHolder<Item,Item> CTD_CREAMED_CORN = block(DisplayBlocks.CTD_CREAMED_CORN);
    public static final DeferredHolder<Item,Item> CTD_SPICY_CURRY = block(DisplayBlocks.CTD_SPICY_CURRY);
    public static final DeferredHolder<Item,Item> CTD_FRIED_EGGPLANT_PASTA = block(DisplayBlocks.CTD_FRIED_EGGPLANT_PASTA);

    //large meals
    public static final DeferredHolder<Item,Item> LM_PUFFERFISH_BROTH = block(DisplayBlocks.LM_PUFFERFISH_BROTH);
    public static final DeferredHolder<Item,Item> LM_POTATO_SOUP = block(DisplayBlocks.LM_POTATO_SOUP);
    public static final DeferredHolder<Item,Item> LM_RED_SOUP = block(DisplayBlocks.LM_RED_SOUP);
    public static final DeferredHolder<Item,Item> LM_TOMATO_EGG_SOUP = block(DisplayBlocks.LM_TOMATO_EGG_SOUP);
    public static final DeferredHolder<Item,Item> LM_COD_DELUXE= block(DisplayBlocks.LM_COD_DELUXE);
    public static final DeferredHolder<Item,Item> LM_HEARTY_LUNCH = block(DisplayBlocks.LM_HEARTY_LUNCH);
    public static final DeferredHolder<Item,Item> LM_CHICKEN_CURRY = block(DisplayBlocks.LM_CHICKEN_CURRY);
    public static final DeferredHolder<Item,Item> LM_PASTA_WITH_MUSHROOM_SAUCE = block(DisplayBlocks.LM_PASTA_WITH_MUSHROOM_SAUCE);
    public static final DeferredHolder<Item,Item> LM_OMURICE = block(DisplayBlocks.LM_OMURICE);
    public static final DeferredHolder<Item,Item> LM_MUSHROOM_POT_PIE = block(DisplayBlocks.LM_MUSHROOM_POT_PIE);
    public static final DeferredHolder<Item,Item> LM_ROASTED_MUTTOH_RACK = block(DisplayBlocks.LM_ROASTED_MUTTOH_RACK);
    public static final DeferredHolder<Item,Item> LM_SWEET_BERRY_CUSTARD = block(DisplayBlocks.LM_SWEET_BERRY_CUSTARD);
    public static final DeferredHolder<Item,Item> LM_RICE_PUDDING = block(DisplayBlocks.LM_RICE_PUDDING);

    //festive delight
    public static final DeferredHolder<Item,Item> FD_FESTIVE_CHICKEN = block(DisplayBlocks.FD_FESTIVE_CHICKEN);
    public static final DeferredHolder<Item,Item> FD_CHRISTMAS_TEA = block(DisplayBlocks.FD_CHRISTMAS_TEA);
    public static final DeferredHolder<Item,Item> FD_SALMON_VERRINES = block(DisplayBlocks.FD_SALMON_VERRINES);

    public static final DeferredHolder<Item,Item> PLATED_SWEET_BERRY_COOKIE = block(PlatedBlocks.PLATED_SWEET_BERRY_COOKIE);
    public static final DeferredHolder<Item,Item> PLATED_HONEY_COOKIE = block(PlatedBlocks.PLATED_HONEY_COOKIE);

    //VANILA
    public static final DeferredHolder<Item,Item> PLATED_COOKIE = block(PlatedBlocks.PLATED_COOKIE);
    public static final DeferredHolder<Item,Item> PLATED_PUMPKIN_PIE = block(PlatedBlocks.PLATED_PUMPKIN_PIE);

    //plated items
    public static final DeferredHolder<Item,Item> CD_GRILLED_CORN = block(PlatedBlocks.CD_GRILLED_CORN);
    public static final DeferredHolder<Item,Item> CD_CLASSIC_CORN_DOG = block(PlatedBlocks.CD_CLASSIC_CORN_DOG);
    public static final DeferredHolder<Item,Item> CD_TACO = block(PlatedBlocks.CD_TACO);


    //EXPANDED DELIGHT
    public static final DeferredHolder<Item,Item> ED_PEANUT_BUTTER_SANDWICH = block(PlatedBlocks.ED_PEANUT_BUTTER_SANDWICH);
    public static final DeferredHolder<Item,Item> ED_PEANUT_BUTTER_AND_HONEY_SANDWICH = block(PlatedBlocks.ED_PEANUT_BUTTER_AND_HONEY_SANDWICH);
    public static final DeferredHolder<Item,Item> ED_GLOW_BERRY_JELLY_SANDWICH = block(PlatedBlocks.ED_GLOW_BERRY_JELLY_SANDWICH);
    public static final DeferredHolder<Item,Item> ED_SWEET_BERRY_JELLY_SANDWICH = block(PlatedBlocks.ED_SWEET_BERRY_JELLY_SANDWICH);
    public static final DeferredHolder<Item,Item> ED_CHEESE_SANDWICH = block(PlatedBlocks.ED_CHEESE_SANDWICH);
    public static final DeferredHolder<Item,Item> ED_GRILLED_CHEESE = block(PlatedBlocks.ED_GRILLED_CHEESE);

    public static final DeferredHolder<Item,Item> ED_CHOCOLATE_COOKIE = block(PlatedBlocks.ED_CHOCOLATE_COOKIE);
    public static final DeferredHolder<Item,Item> ED_SUGAR_COOKIE = block(PlatedBlocks.ED_SUGAR_COOKIE);
    public static final DeferredHolder<Item,Item> ED_SNICKERDOODLE = block(PlatedBlocks.ED_SNICKERDOODLE);

    public static final DeferredHolder<Item,Item> ED_SWEET_ROLL =  block(PlatedBlocks.ED_SWEET_ROLL);
    public static final DeferredHolder<Item,Item> ED_BERRY_SWEET_ROLL =  block(PlatedBlocks.ED_BERRY_SWEET_ROLL);
    public static final DeferredHolder<Item,Item> ED_GLOW_BERRY_SWEET_ROLL =  block(PlatedBlocks.ED_GLOW_BERRY_SWEET_ROLL);
    //DELIGHTFUL
    public static final DeferredHolder<Item,Item> DF_SMORE = block(PlatedBlocks.DF_SMORE);
    public static final DeferredHolder<Item,Item> DF_CHEESEBURGER = block(PlatedBlocks.DF_CHEESEBURGER);
    public static final DeferredHolder<Item,Item> DF_DELUXE_CHEESEBURGER = block(PlatedBlocks.DF_DELUXE_CHEESEBURGER);
    public static final DeferredHolder<Item,Item> DF_NUT_BUTTER_AND_JELLY_SANDWICH = block(PlatedBlocks.DF_NUT_BUTTER_AND_JELLY_SANDWICH);

    public static final DeferredHolder<Item,Item> DF_COOKED_MARSHMELLOW_STICK = block(PlatedBlocks.DF_COOKED_MARSHMELLOW_STICK);
    public static final DeferredHolder<Item,Item> DF_CANTALOUPE_POPSICLE = block(PlatedBlocks.DF_CANTALOUPE_POPSICLE);
    public static final DeferredHolder<Item,Item> DF_CANTALOUPE_BREAD = block(PlatedBlocks.DF_CANTALOUPE_BREAD);
    public static final DeferredHolder<Item,Item> DF_WRAPPED_CANTALOUPE = block(PlatedBlocks.DF_WRAPPED_CANTALOUPE);


    //OCEAN DELIGHT
    public static final DeferredHolder<Item,Item> OD_BACKED_TENTACLE_ON_A_STICK = block(PlatedBlocks.OD_BACKED_TENTACLE_ON_A_STICK);
    public static final DeferredHolder<Item,Item> OD_ELDER_GUARDIAN_ROLL = block(PlatedBlocks.OD_ELDER_GUARDIAN_ROLL);
    public static final DeferredHolder<Item,Item> OD_FUGU_ROLL = block(PlatedBlocks.OD_FUGU_ROLL);
    public static final DeferredHolder<Item,Item> OD_HONEY_FRIED_KELP = block(PlatedBlocks.OD_HONEY_FRIED_KELP);
    public static final DeferredHolder<Item,Item> OD_COOKED_STUFFED_COD = block(PlatedBlocks.OD_COOKED_STUFFED_COD);



    //ALEX DELIGHT
    public static final DeferredHolder<Item,Item> AD_BUNFUNBUS_SANDWICH = block(PlatedBlocks.AD_BUNFUNBUS_SANDWICH);
    public static final DeferredHolder<Item,Item> AD_BISON_BURGER = block(PlatedBlocks.AD_BISON_BURGER);
    public static final DeferredHolder<Item,Item> AD_GONGYLIDIA_BRUSCHETTA = block(PlatedBlocks.AD_GONGYLIDIA_BRUSCHETTA);

    //cultural delight
    public static final DeferredHolder<Item,Item> CTD_ELOTE = block(PlatedBlocks.CTD_ELOTE);
    public static final DeferredHolder<Item,Item> CTD_EMPANADA = block(PlatedBlocks.CTD_EMPANADA);
    public static final DeferredHolder<Item,Item> CTD_BEEF_BURITO = block(PlatedBlocks.CTD_BEEF_BURITO);
    public static final DeferredHolder<Item,Item> CTD_MUTTON_SANDWICH = block(PlatedBlocks.CTD_MUTTON_SANDWICH);
    public static final DeferredHolder<Item,Item> CTD_EGGPLANT_BURGER = block(PlatedBlocks.CTD_EGGPLANT_BURGER);
    public static final DeferredHolder<Item,Item> CTD_AVOCADO_TOAST = block(PlatedBlocks.CTD_AVOCADO_TOAST);
    public static final DeferredHolder<Item,Item> CTD_CHICKEN_TACO = block(PlatedBlocks.CTD_CHICKEN_TACO);
    public static final DeferredHolder<Item,Item> CTD_PORK_WRAP = block(PlatedBlocks.CTD_PORK_WRAP);
    public static final DeferredHolder<Item,Item> CTD_FISH_TACO = block(PlatedBlocks.CTD_FISH_TACO);
    public static final DeferredHolder<Item,Item> CTD_CHICKEN_ROLL = block(PlatedBlocks.CTD_CHICKEN_ROLL);
    public static final DeferredHolder<Item,Item> CTD_MIDORI_ROLL = block(PlatedBlocks.CTD_MIDORI_ROLL);
    public static final DeferredHolder<Item,Item> CTD_CHICKEN_ROLL_SLICE = block(PlatedBlocks.CTD_CHICKEN_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> CTD_MIDORI_ROLL_SLICE = block(PlatedBlocks.CTD_MIDORI_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> CTD_PUFFERFISH_ROLL = block(PlatedBlocks.CTD_PUFFERFISH_ROLL);
    public static final DeferredHolder<Item,Item> CTD_TROPICAL_ROLL = block(PlatedBlocks.CTD_TROPICAL_ROLL);
    public static final DeferredHolder<Item,Item> CTD_RICE_BALL = block(PlatedBlocks.CTD_RICE_BALL);
    public static final DeferredHolder<Item,Item> CTD_EGG_ROLL = block(PlatedBlocks.CTD_EGG_ROLL);
    public static final DeferredHolder<Item,Item> CTD_CALAMARI_ROLL = block(PlatedBlocks.CTD_CALAMARI_ROLL);




    //EXPANDED DELIGHT
    public static final DeferredHolder<Item,Item> ED_SWEET_ROLL_SMALL = block(SmallPlatedBlocks.ED_SWEET_ROLL);
    public static final DeferredHolder<Item,Item> ED_BERRY_SWEET_ROLL_SMALL = block(SmallPlatedBlocks.ED_BERRY_SWEET_ROLL);
    public static final DeferredHolder<Item,Item> ED_GLOW_BERRY_SWEET_ROLL_SMALL = block(SmallPlatedBlocks.ED_GLOW_BERRY_SWEET_ROLL);
    public static final DeferredHolder<Item,Item> ED_CHEESE_SLICE = block(SmallPlatedBlocks.ED_CHEESE_SLICE);


    //DELIGHTFUL
    public static final DeferredHolder<Item,Item> DF_SALMONBERRY_PIE_SLICE = block(SmallPlatedBlocks.DF_SALMONBERRY_PIE_SLICE);
    public static final DeferredHolder<Item,Item> DF_PUMPKIN_PIE_SLICE = block(SmallPlatedBlocks.DF_PUMPKIN_PIE_SLICE);

    //pineapple delight
    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_PIE_SLICE = block(SmallPlatedBlocks.PD_PINEAPPLE_PIE_SLICE);


    public static final DeferredHolder<Item,Item> OD_ELDER_GUARDIAN_ROLL_SMALL = block(SmallPlatedBlocks.OD_ELDER_GUARDIAN_ROLL);
    public static final DeferredHolder<Item,Item> OD_FUGU_ROLL_SMALL = block(SmallPlatedBlocks.OD_FUGU_ROLL);


    //cultural delight
    public static final DeferredHolder<Item,Item> CTD_CHICKEN_ROLL_SLICE_SMALL = block(SmallPlatedBlocks.CTD_CHICKEN_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> CTD_MIDORI_ROLL_SLICE_SMALL = block(SmallPlatedBlocks.CTD_MIDORI_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> CTD_PUFFERFISH_ROLL_SMALL = block(SmallPlatedBlocks.CTD_PUFFERFISH_ROLL);
    public static final DeferredHolder<Item,Item> CTD_TROPICAL_ROLL_SMALL = block(SmallPlatedBlocks.CTD_TROPICAL_ROLL);
    public static final DeferredHolder<Item,Item> CTD_RICE_BALL_SMALL = block(SmallPlatedBlocks.CTD_RICE_BALL);
    public static final DeferredHolder<Item,Item> CTD_EGG_ROLL_SMALL = block(SmallPlatedBlocks.CTD_EGG_ROLL);
    public static final DeferredHolder<Item,Item> CTD_CALAMARI_ROLL_SMALL = block(SmallPlatedBlocks.CTD_CALAMARI_ROLL);
    public static final DeferredHolder<Item,Item> CTD_CUT_PICKLE = block(SmallPlatedBlocks.CTD_CUT_PICKLE);


    public static final DeferredHolder<Item,Item> BNC_FIERY_FONDUE = block(DisplayBlocks.BNC_FIERY_FONDUE);
    public static final DeferredHolder<Item,Item> BNC_SCARLET_PIEROGI = block(DisplayBlocks.BNC_SCARLET_PIEROGI);
    public static final DeferredHolder<Item,Item> BNC_HORROR_LASAGNA = block(DisplayBlocks.BNC_HORROR_LASAGNA);
    public static final DeferredHolder<Item,Item> BNC_CHEESY_PASTA = block(DisplayBlocks.BNC_CHEESY_PASTA);
    public static final DeferredHolder<Item,Item> BNC_CREAMY_ONION_SOUP = block(DisplayBlocks.BNC_CREAMY_ONION_SOUP);
    public static final DeferredHolder<Item,Item> BNC_VEGETABLE_OMELET = block(DisplayBlocks.BNC_VEGETABLE_OMELET);
    public static final DeferredHolder<Item,Item> ED_CRANBERRY_JUICE = block(DisplayBlocks.ED_CRANBERRY_JUICE);
    public static final DeferredHolder<Item,Item> ED_CRANBERRY_CHICKEN = block(DisplayBlocks.ED_CRANBERRY_CHICKEN);
    public static final DeferredHolder<Item,Item> ED_ASPARAGUS_MUSHROOM_PASTA = block(DisplayBlocks.ED_ASPARAGUS_MUSHROOM_PASTA);
    public static final DeferredHolder<Item,Item> ED_SWEET_POTATO_CASSEROLE = block(DisplayBlocks.ED_SWEET_POTATO_CASSEROLE);
    public static final DeferredHolder<Item,Item> CTD_POACHED_EGGPLANTS = block(DisplayBlocks.CTD_POACHED_EGGPLANTS);
    public static final DeferredHolder<Item,Item> CTD_EGGPLANT_PARMESAN = block(DisplayBlocks.CTD_EGGPLANT_PARMESAN);
    public static final DeferredHolder<Item,Item> ACD_POOR_FISHER_CHOWDER = block(DisplayBlocks.ACD_POOR_FISHER_CHOWDER);
    public static final DeferredHolder<Item,Item> ACD_JELLYFISH_JELLY = block(DisplayBlocks.ACD_JELLYFISH_JELLY);
    public static final DeferredHolder<Item,Item> ACD_UNUSUAL_FISH_SOUP = block(DisplayBlocks.ACD_UNUSUAL_FISH_SOUP);
    public static final DeferredHolder<Item,Item> ACD_BASS_STEW = block(DisplayBlocks.ACD_BASS_STEW);
    public static final DeferredHolder<Item,Item> ACD_FISH_CHORBA = block(DisplayBlocks.ACD_FISH_CHORBA);
    public static final DeferredHolder<Item,Item> ACD_FISH_AND_CHIPS = block(DisplayBlocks.ACD_FISH_AND_CHIPS);
    public static final DeferredHolder<Item,Item> ACD_HALASZLE = block(DisplayBlocks.ACD_HALASZLE);
    public static final DeferredHolder<Item,Item> ACD_CRISPY_NORI_KELP = block(DisplayBlocks.ACD_CRISPY_NORI_KELP);
    public static final DeferredHolder<Item,Item> ACD_BAKED_POLLOCK_WITH_CARROTS = block(DisplayBlocks.ACD_BAKED_POLLOCK_WITH_CARROTS);
    public static final DeferredHolder<Item,Item> ACD_LARGE_FISH_WITH_VEGETABLES = block(DisplayBlocks.ACD_LARGE_FISH_WITH_VEGETABLES);
    public static final DeferredHolder<Item,Item> ACD_ROLLMOPS = block(DisplayBlocks.ACD_ROLLMOPS);
    public static final DeferredHolder<Item,Item> ACD_TUNA_SPAGHETTI = block(DisplayBlocks.ACD_TUNA_SPAGHETTI);
    public static final DeferredHolder<Item,Item> ACD_HALIBUT_WITH_TARTAR_SAUCE = block(DisplayBlocks.ACD_HALIBUT_WITH_TARTAR_SAUCE);
    public static final DeferredHolder<Item,Item> ACD_BUCKLING = block(DisplayBlocks.ACD_BUCKLING);
    public static final DeferredHolder<Item,Item> ACD_TURTLE_MEAT_DISH = block(DisplayBlocks.ACD_TURTLE_MEAT_DISH);
    public static final DeferredHolder<Item,Item> ERD_CHORUS_JUICE = block(DisplayBlocks.ERD_CHORUS_JUICE);
    public static final DeferredHolder<Item,Item> ERD_AMBERVEIL_STEW = block(DisplayBlocks.ERD_AMBERVEIL_STEW);
    public static final DeferredHolder<Item,Item> ERD_AMBERVEILED_CURRY = block(DisplayBlocks.ERD_AMBERVEILED_CURRY);
    public static final DeferredHolder<Item,Item> ERD_CHORUS_STEW = block(DisplayBlocks.ERD_CHORUS_STEW);
    public static final DeferredHolder<Item,Item> ERD_TWISTED_CEREAL = block(DisplayBlocks.ERD_TWISTED_CEREAL);
    public static final DeferredHolder<Item,Item> ERD_ENDERMITE_STEW = block(DisplayBlocks.ERD_ENDERMITE_STEW);
    public static final DeferredHolder<Item,Item> ERD_ENDER_PAELLA = block(DisplayBlocks.ERD_ENDER_PAELLA);
    public static final DeferredHolder<Item,Item> ERD_CHICKEN_CURRY = block(DisplayBlocks.ERD_CHICKEN_CURRY);
    public static final DeferredHolder<Item,Item> ERD_STEAK_FRIES = block(DisplayBlocks.ERD_STEAK_FRIES);
    public static final DeferredHolder<Item,Item> ERD_VEIL_OF_FLAMES_RISOTTO = block(DisplayBlocks.ERD_VEIL_OF_FLAMES_RISOTTO);
    public static final DeferredHolder<Item,Item> ERD_PEARL_PASTA = block(DisplayBlocks.ERD_PEARL_PASTA);
    public static final DeferredHolder<Item,Item> ERD_STUFFED_SHULKER_BOWL = block(DisplayBlocks.ERD_STUFFED_SHULKER_BOWL);
    public static final DeferredHolder<Item,Item> EDD_DRAGON_BREATH_AND_CHORUS_SOUP = block(DisplayBlocks.EDD_DRAGON_BREATH_AND_CHORUS_SOUP);
    public static final DeferredHolder<Item,Item> EDD_SHULKER_SOUP = block(DisplayBlocks.EDD_SHULKER_SOUP);
    public static final DeferredHolder<Item,Item> EDD_ENDER_NOODLE = block(DisplayBlocks.EDD_ENDER_NOODLE);
    public static final DeferredHolder<Item,Item> EDD_ENDERMAN_GRISTLE_STEW = block(DisplayBlocks.EDD_ENDERMAN_GRISTLE_STEW);
    public static final DeferredHolder<Item,Item> EDD_STIR_FRIED_SHULKER_MEAT = block(DisplayBlocks.EDD_STIR_FRIED_SHULKER_MEAT);
    public static final DeferredHolder<Item,Item> EDD_ROASTED_DRAGON_STEAK = block(DisplayBlocks.EDD_ROASTED_DRAGON_STEAK);
    public static final DeferredHolder<Item,Item> EDD_END_MIXED_SALAD = block(DisplayBlocks.EDD_END_MIXED_SALAD);
    public static final DeferredHolder<Item,Item> EDD_ASSORTED_SALAD = block(DisplayBlocks.EDD_ASSORTED_SALAD);
    public static final DeferredHolder<Item,Item> EDD_ENDER_CONGEE = block(DisplayBlocks.EDD_ENDER_CONGEE);
    public static final DeferredHolder<Item,Item> EDD_CHORUS_FRUIT_MILK_TEA = block(DisplayBlocks.EDD_CHORUS_FRUIT_MILK_TEA);
    public static final DeferredHolder<Item,Item> EDD_CHORUS_FRUIT_WINE = block(DisplayBlocks.EDD_CHORUS_FRUIT_WINE);
    public static final DeferredHolder<Item,Item> EDD_BUBBLE_TEA = block(DisplayBlocks.EDD_BUBBLE_TEA);
    public static final DeferredHolder<Item,Item> EDD_DRAGON_BREATH_SODA = block(DisplayBlocks.EDD_DRAGON_BREATH_SODA);
    public static final DeferredHolder<Item,Item> EDD_CHORUS_FLOWER_TEA = block(DisplayBlocks.EDD_CHORUS_FLOWER_TEA);
    public static final DeferredHolder<Item,Item> EDD_GRILLED_SHULKER = block(DisplayBlocks.EDD_GRILLED_SHULKER);
    public static final DeferredHolder<Item,Item> EDD_STEAMED_DRAGON_EGG_BLOCK = block(DisplayBlocks.EDD_STEAMED_DRAGON_EGG_BLOCK);
    public static final DeferredHolder<Item,Item> EDD_DRAGON_MEAT_STEW = block(DisplayBlocks.EDD_DRAGON_MEAT_STEW);
    public static final DeferredHolder<Item,Item> EDD_STEAMED_DRAGON_EGG = block(DisplayBlocks.EDD_STEAMED_DRAGON_EGG);
    public static final DeferredHolder<Item,Item> EDD_DRAGON_LEG_WITH_SAUCE = block(DisplayBlocks.EDD_DRAGON_LEG_WITH_SAUCE);
    public static final DeferredHolder<Item,Item> MND_SIZZLING_PUDDING = block(DisplayBlocks.MND_SIZZLING_PUDDING);
    public static final DeferredHolder<Item,Item> MND_ROCK_SOUP = block(DisplayBlocks.MND_ROCK_SOUP);
    public static final DeferredHolder<Item,Item> MND_SPICY_NOODLE_SOUP = block(DisplayBlocks.MND_SPICY_NOODLE_SOUP);
    public static final DeferredHolder<Item,Item> MND_STRIDER_STEW = block(DisplayBlocks.MND_STRIDER_STEW);
    public static final DeferredHolder<Item,Item> MND_GHAST_SALAD = block(DisplayBlocks.MND_GHAST_SALAD);
    public static final DeferredHolder<Item,Item> MND_DRIED_GHAST_WITH_MILK = block(DisplayBlocks.MND_DRIED_GHAST_WITH_MILK);
    public static final DeferredHolder<Item,Item> MND_SAUSAGE_AND_POTATOES = block(DisplayBlocks.MND_SAUSAGE_AND_POTATOES);
    public static final DeferredHolder<Item,Item> MND_SPICY_HOGLIN_STEW = block(DisplayBlocks.MND_SPICY_HOGLIN_STEW);
    public static final DeferredHolder<Item,Item> MND_EGG_SOUP = block(DisplayBlocks.MND_EGG_SOUP);
    public static final DeferredHolder<Item,Item> MND_BREAKFAST_SAMPLER = block(DisplayBlocks.MND_BREAKFAST_SAMPLER);
    public static final DeferredHolder<Item,Item> MND_FRIED_HOGLIN_CHOP = block(DisplayBlocks.MND_FRIED_HOGLIN_CHOP);
    public static final DeferredHolder<Item,Item> MND_TWISTED_GHASTA = block(DisplayBlocks.MND_TWISTED_GHASTA);
    public static final DeferredHolder<Item,Item> MND_STRIDER_WITH_GRILLED_FUNGUS = block(DisplayBlocks.MND_STRIDER_WITH_GRILLED_FUNGUS);
    public static final DeferredHolder<Item,Item> MND_SCOTCH_EGGS = block(DisplayBlocks.MND_SCOTCH_EGGS);
    public static final DeferredHolder<Item,Item> MND_GIANT_TAKOYAKI = block(DisplayBlocks.MND_GIANT_TAKOYAKI);
    public static final DeferredHolder<Item,Item> MND_BLUE_TENDERLOIN_STEAK = block(DisplayBlocks.MND_BLUE_TENDERLOIN_STEAK);
    public static final DeferredHolder<Item,Item> MND_CRIMSON_STROGANOFF = block(DisplayBlocks.MND_CRIMSON_STROGANOFF);
    public static final DeferredHolder<Item,Item> MND_SPICY_CURRY = block(DisplayBlocks.MND_SPICY_CURRY);
    public static final DeferredHolder<Item,Item> MND_BLEEDING_TARTAR = block(DisplayBlocks.MND_BLEEDING_TARTAR);
    public static final DeferredHolder<Item,Item> MND_HOT_WINGS = block(DisplayBlocks.MND_HOT_WINGS);
    public static final DeferredHolder<Item,Item> MND_PLATE_OF_GHASTA_WITH_CREAM = block(DisplayBlocks.MND_PLATE_OF_GHASTA_WITH_CREAM);
    public static final DeferredHolder<Item,Item> MND_PLATE_OF_STUFFED_HOGLIN_SNOUT = block(DisplayBlocks.MND_PLATE_OF_STUFFED_HOGLIN_SNOUT);
    public static final DeferredHolder<Item,Item> MND_PLATE_OF_STUFFED_HOGLIN_HAM = block(DisplayBlocks.MND_PLATE_OF_STUFFED_HOGLIN_HAM);
    public static final DeferredHolder<Item,Item> MND_PLATE_OF_STUFFED_HOGLIN = block(DisplayBlocks.MND_PLATE_OF_STUFFED_HOGLIN);
    public static final DeferredHolder<Item,Item> MND_PLATE_OF_COLD_STRIDERLOAF = block(DisplayBlocks.MND_PLATE_OF_COLD_STRIDERLOAF);
    public static final DeferredHolder<Item,Item> MND_PLATE_OF_STRIDERLOAF = block(DisplayBlocks.MND_PLATE_OF_STRIDERLOAF);



    public static final DeferredHolder<Item,Item> ACD_PLATED_CATFISH_BARBECUE = block(PlatedBlocks.ACD_PLATED_CATFISH_BARBECUE);
    public static final DeferredHolder<Item,Item> BNC_PLATED_HAM_AND_CHEESE_SANDWICH = block(PlatedBlocks.BNC_PLATED_HAM_AND_CHEESE_SANDWICH);
    public static final DeferredHolder<Item,Item> ED_PLATED_CRANBERRY_GOAT_CHEESE_TOAST = block(PlatedBlocks.ED_PLATED_CRANBERRY_GOAT_CHEESE_TOAST);
    public static final DeferredHolder<Item,Item> ERD_PLATED_UNCANNY_COOKIES = block(PlatedBlocks.ERD_PLATED_UNCANNY_COOKIES);
    public static final DeferredHolder<Item,Item> ERD_PLATED_CRISPY_SKEWER = block(PlatedBlocks.ERD_PLATED_CRISPY_SKEWER);
    public static final DeferredHolder<Item,Item> ERD_PLATED_STRANGE_ECLAIR = block(PlatedBlocks.ERD_PLATED_STRANGE_ECLAIR);
    public static final DeferredHolder<Item,Item> ERD_PLATED_CRAWLING_SANDWICH = block(PlatedBlocks.ERD_PLATED_CRAWLING_SANDWICH);
    public static final DeferredHolder<Item,Item> EDD_PLATED_STUFFED_RICE_CAKE = block(PlatedBlocks.EDD_PLATED_STUFFED_RICE_CAKE);
    public static final DeferredHolder<Item,Item> EDD_PLATED_CHORUS_FLOWER_PIE = block(PlatedBlocks.EDD_PLATED_CHORUS_FLOWER_PIE);
    public static final DeferredHolder<Item,Item> EDD_PLATED_ENDER_BAMBOO_RICE = block(PlatedBlocks.EDD_PLATED_ENDER_BAMBOO_RICE);
    public static final DeferredHolder<Item,Item> EDD_PLATED_CHORUS_FRUIT_POPSICLE = block(PlatedBlocks.EDD_PLATED_CHORUS_FRUIT_POPSICLE);
    public static final DeferredHolder<Item,Item> EDD_PLATED_END_BARBECUE_STICK = block(PlatedBlocks.EDD_PLATED_END_BARBECUE_STICK);
    public static final DeferredHolder<Item,Item> MND_PLATED_STUFFED_PEPPER = block(PlatedBlocks.MND_PLATED_STUFFED_PEPPER);
    public static final DeferredHolder<Item,Item> MND_PLATED_HOTDOG_WITH_MIXED_SALAD = block(PlatedBlocks.MND_PLATED_HOTDOG_WITH_MIXED_SALAD);
    public static final DeferredHolder<Item,Item> MND_PLATED_HOTDOG_WITH_NETHER_SALAD = block(PlatedBlocks.MND_PLATED_HOTDOG_WITH_NETHER_SALAD);
    public static final DeferredHolder<Item,Item> MND_PLATED_CHILIDOG = block(PlatedBlocks.MND_PLATED_CHILIDOG);
    public static final DeferredHolder<Item,Item> MND_PLATED_SPICY_COTTON = block(PlatedBlocks.MND_PLATED_SPICY_COTTON);
    public static final DeferredHolder<Item,Item> MND_PLATED_FRIES_GHASTA = block(PlatedBlocks.MND_PLATED_FRIES_GHASTA);
    public static final DeferredHolder<Item,Item> MND_PLATED_DEVILED_EGG = block(PlatedBlocks.MND_PLATED_DEVILED_EGG);
    public static final DeferredHolder<Item,Item> MND_PLATED_SPICY_SKEWER = block(PlatedBlocks.MND_PLATED_SPICY_SKEWER);
    public static final DeferredHolder<Item,Item> MND_PLATED_RED_LOIN_ON_A_STICK = block(PlatedBlocks.MND_PLATED_RED_LOIN_ON_A_STICK);
    public static final DeferredHolder<Item,Item> MND_PLATED_NETHER_BURGER = block(PlatedBlocks.MND_PLATED_NETHER_BURGER);
    public static final DeferredHolder<Item,Item> MND_PLATED_BURNT_ROLL = block(PlatedBlocks.MND_PLATED_BURNT_ROLL);
    public static final DeferredHolder<Item,Item> MND_PLATED_HOT_CREAM_CONE = block(PlatedBlocks.MND_PLATED_HOT_CREAM_CONE);


    public static final DeferredHolder<Item,Item> BNC_SMALL_PLATED_QUICHE_SLICE = block(SmallPlatedBlocks.BNC_SMALL_PLATED_QUICHE_SLICE);
    public static final DeferredHolder<Item,Item> ED_SMALL_PLATED_CRANBERRY_COBBLER_SLICE = block(SmallPlatedBlocks.ED_SMALL_PLATED_CRANBERRY_COBBLER_SLICE);
    public static final DeferredHolder<Item,Item> ED_SMALL_PLATED_HONEYED_GOAT_CHEESE_TART_SLICE = block(SmallPlatedBlocks.ED_SMALL_PLATED_HONEYED_GOAT_CHEESE_TART_SLICE);
    public static final DeferredHolder<Item,Item> ACD_SMALL_PLATED_RAW_FISH_FILLET_ROLL = block(SmallPlatedBlocks.ACD_SMALL_PLATED_RAW_FISH_FILLET_ROLL);
    public static final DeferredHolder<Item,Item> ACD_SMALL_PLATED_FRIED_PERCH_ROLL = block(SmallPlatedBlocks.ACD_SMALL_PLATED_FRIED_PERCH_ROLL);
    public static final DeferredHolder<Item,Item> ERD_SMALL_PLATED_CHORUS_PIE_SLICE = block(SmallPlatedBlocks.ERD_SMALL_PLATED_CHORUS_PIE_SLICE);
    public static final DeferredHolder<Item,Item> EDD_SMALL_PLATED_CHORUS_FRUIT_PIE_SLICE = block(SmallPlatedBlocks.EDD_SMALL_PLATED_CHORUS_FRUIT_PIE_SLICE);
    public static final DeferredHolder<Item,Item> MND_SMALL_PLATED_MAGMA_CAKE_SLICE = block(SmallPlatedBlocks.MND_SMALL_PLATED_MAGMA_CAKE_SLICE);

    private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block)block.get(), new Item.Properties());
        });
    }

    public static Iterable<Item> GetAll(){
        return List.of(new Item[]{
                DisplayItems.PLATE.get(),
        DisplayItems.SMALL_PLATE.get(),
        DisplayItems.MUSHROOM_STEW.get(),
        DisplayItems.RABBIT_STEW.get(),
        DisplayItems.BEETROOT_STEW.get(),
        DisplayItems.PLATED_COOKIE.get(),
        DisplayItems.PLATED_PUMPKIN_PIE.get(),

        DisplayItems.FRUIT_SALAD.get(),
        DisplayItems.GLOW_BERRY_CUSTARD.get(),
        DisplayItems.COOKED_RICE.get(),
        DisplayItems.MIXED_SALAD.get(),
        DisplayItems.BEEF_STEW.get(),
        DisplayItems.CHICKEN_SOUP.get(),
        DisplayItems.VEGETABLE_SOUP.get(),
        DisplayItems.FISH_STEW.get(),
        DisplayItems.FRIED_RICE.get(),
        DisplayItems.PUMPKIN_SOUP.get(),
        DisplayItems.BAKED_COD_STEW.get(),
        DisplayItems.NOODLE_SOUP.get(),
        DisplayItems.BONE_BROTH.get(),
        DisplayItems.BACON_AND_EGGS.get(),
        DisplayItems.PASTA_WITH_MEATBALLS.get(),
        DisplayItems.PASTA_WITH_MUTTON_CHOP.get(),
        DisplayItems.ROASTED_MUTTON_CHOPS.get(),
        DisplayItems.STEAK_AND_POTATOES.get(),
        DisplayItems.VEGETABLE_NOODLES.get(),
        DisplayItems.RATATOUILLE.get(),
        DisplayItems.SQUID_INK_PASTA.get(),
        DisplayItems.GRILLED_SALMON.get(),
        DisplayItems.MUSHROOM_RICE.get(),
        DisplayItems.ROAST_CHICKEN.get(),
        DisplayItems.STUFFED_PUMPKIN.get(),
        DisplayItems.HONEY_GLAZED_HAM.get(),
        DisplayItems.SHEPHEREDS_PIE.get(),
        DisplayItems.APPLE_CIDER.get(),
        DisplayItems.MELON_JUICE.get(),
        DisplayItems.HOT_COCOA.get(),
        DisplayItems.PLATED_HAMBURGER.get(),
        DisplayItems.PLATED_KELP_ROLL_SLICE.get(),
        DisplayItems.PLATED_DUMPLINGS.get(),
        DisplayItems.PLATED_BARBECUE_STICK.get(),
        DisplayItems.PLATED_CHICKEN_SANDWICH.get(),
        DisplayItems.PLATED_COD_ROLL.get(),
        DisplayItems.PLATED_EGG_SANDWICH.get(),
        DisplayItems.PLATED_KELP_ROLL.get(),
        DisplayItems.PLATED_SALMON_ROLL.get(),
        DisplayItems.PLATED_MELON_POPSICLE.get(),
        DisplayItems.PLATED_STUFFED_POTATO.get(),
        DisplayItems.PLATED_CABBAGE_ROLLS.get(),
        DisplayItems.PLATED_BACON_SANDWICH.get(),
        DisplayItems.PLATED_MUTTON_WRAP.get(),
        DisplayItems.PLATED_SWEET_BERRY_COOKIE.get(),
        DisplayItems.PLATED_HONEY_COOKIE.get(),

        DisplayItems.PLATED_CAKE_SLICE.get(),
        DisplayItems.PLATED_APPLE_PIE_SLICE.get(),
        DisplayItems.PLATED_CHOCOLATE_PIE_SLICE.get(),
        DisplayItems.PLATED_SWEET_BERRY_CHEESECAKE_SLICE.get(),
        DisplayItems.SMALL_PLATED_STUFFED_POTATO.get(),
        DisplayItems.SMALL_PLATED_COD_ROLL.get(),
        DisplayItems.SMALL_PLATED_SALMON_ROLL.get(),
        DisplayItems.SMALL_PLATED_KELP_ROLL_SLICE.get(),
        DisplayItems.SMALL_PLATED_CABBAGE_ROLLS.get(),


        DisplayItems.AD_MAGGOT_SALAD.get(),
        DisplayItems.AD_KANGAROO_STEW.get(),
        DisplayItems.AD_ACACIA_BLOSSOM_SOUP.get(),
        DisplayItems.AD_LOBSTER_PASTA.get(),
        DisplayItems.AD_KANGAROO_PASTA.get(),
        DisplayItems.AD_BUNFUNBUS_SANDWICH.get(),
        DisplayItems.AD_BISON_BURGER.get(),
        DisplayItems.AD_GONGYLIDIA_BRUSCHETTA.get(),
        DisplayItems.CD_NACHOS_BOWL.get(),
        DisplayItems.CD_CREAMY_COR_DRINK.get(),
        DisplayItems.CD_CORNBREAD_STUFFING.get(),
        DisplayItems.CD_CORN_SOUP.get(),
        DisplayItems.CD_CREAMED_CORN.get(),
        DisplayItems.CD_GRILLED_CORN.get(),
        DisplayItems.CD_CLASSIC_CORN_DOG.get(),
        DisplayItems.CD_TACO.get(),
        DisplayItems.CTD_HEARTY_SALAD.get(),
        DisplayItems.CTD_CREAMED_CORN.get(),
        DisplayItems.CTD_SPICY_CURRY.get(),
        DisplayItems.CTD_FRIED_EGGPLANT_PASTA.get(),
        DisplayItems.CTD_POACHED_EGGPLANTS.get(),
        DisplayItems.CTD_EGGPLANT_PARMESAN.get(),


        DisplayItems.CTD_ELOTE.get(),
        DisplayItems.CTD_EMPANADA.get(),
        DisplayItems.CTD_BEEF_BURITO.get(),
        DisplayItems.CTD_MUTTON_SANDWICH.get(),
        DisplayItems.CTD_EGGPLANT_BURGER.get(),
        DisplayItems.CTD_AVOCADO_TOAST.get(),
        DisplayItems.CTD_CHICKEN_TACO.get(),
        DisplayItems.CTD_PORK_WRAP.get(),
        DisplayItems.CTD_FISH_TACO.get(),
        DisplayItems.CTD_CHICKEN_ROLL.get(),
        DisplayItems.CTD_MIDORI_ROLL.get(),
        DisplayItems.CTD_CHICKEN_ROLL_SLICE.get(),
        DisplayItems.CTD_MIDORI_ROLL_SLICE.get(),
        DisplayItems.CTD_PUFFERFISH_ROLL.get(),
        DisplayItems.CTD_TROPICAL_ROLL.get(),
        DisplayItems.CTD_RICE_BALL.get(),
        DisplayItems.CTD_EGG_ROLL.get(),
        DisplayItems.CTD_CALAMARI_ROLL.get(),
        DisplayItems.CTD_CHICKEN_ROLL_SLICE_SMALL.get(),
        DisplayItems.CTD_MIDORI_ROLL_SLICE_SMALL.get(),
        DisplayItems.CTD_PUFFERFISH_ROLL_SMALL.get(),
        DisplayItems.CTD_TROPICAL_ROLL_SMALL.get(),
        DisplayItems.CTD_EGG_ROLL_SMALL.get(),
        DisplayItems.CTD_CALAMARI_ROLL_SMALL.get(),
        DisplayItems.CTD_CUT_PICKLE.get(),

        DisplayItems.DF_MATCHA_ICE_CREAM.get(),
        DisplayItems.DF_MATCHA_MILKSHAKE.get(),
        DisplayItems.DF_SALMONBERRY_ICE_CREAM.get(),
        DisplayItems.DF_SALMONBERRY_MILKSHAKE.get(),
        DisplayItems.DF_MATCHA_LATTE.get(),
        DisplayItems.DF_ENDER_NECTAR.get(),
        DisplayItems.DF_BERRY_MATCHA_LATTE.get(),
        DisplayItems.DF_CACTUS_CHILI.get(),
        DisplayItems.DF_FIELD_SALAD.get(),
        DisplayItems.DF_STUFFED_CANTALOUPE.get(),
        DisplayItems.DF_SINIGANG.get(),
        DisplayItems.DF_CACTUS_SOUP.get(),
        DisplayItems.DF_SMORE.get(),
        DisplayItems.DF_CHEESEBURGER.get(),
        DisplayItems.DF_DELUXE_CHEESEBURGER.get(),
        DisplayItems.DF_NUT_BUTTER_AND_JELLY_SANDWICH.get(),
        DisplayItems.DF_COOKED_MARSHMELLOW_STICK.get(),
        DisplayItems.DF_CANTALOUPE_POPSICLE.get(),
        DisplayItems.DF_CANTALOUPE_BREAD.get(),
        DisplayItems.DF_WRAPPED_CANTALOUPE.get(),
        DisplayItems.DF_SALMONBERRY_PIE_SLICE.get(),
        DisplayItems.DF_PUMPKIN_PIE_SLICE.get(),
        DisplayItems.ED_ASPARAGUS_SOUP.get(),
        DisplayItems.ED_ASPARAGUS_SOUP_CREAMY.get(),
        DisplayItems.ED_ASPARAGUS_AND_BACON_CHEESY.get(),
        DisplayItems.ED_PEPERONATA.get(),
        DisplayItems.ED_PEANUT_HONEY_SOUP.get(),
        DisplayItems.ED_MAC_AND_CHEESE.get(),
        DisplayItems.ED_PEANUT_SALAD.get(),
        DisplayItems.ED_SWEET_POTTATO_SALAD.get(),
        DisplayItems.ED_CINNAMON_RICE.get(),
        DisplayItems.ED_CINNAMON_APPLES.get(),
        DisplayItems.ED_APPLE_JUICE.get(),
        DisplayItems.ED_SWEET_BERRY_JUICE.get(),
        DisplayItems.ED_GLOW_BERRY_JUICE.get(),
        DisplayItems.ED_CRANBERRY_JUICE.get(),
        DisplayItems.ED_PEANUT_BUTTER_SANDWICH.get(),
        DisplayItems.ED_PEANUT_BUTTER_AND_HONEY_SANDWICH.get(),
        DisplayItems.ED_GLOW_BERRY_JELLY_SANDWICH.get(),
        DisplayItems.ED_SWEET_BERRY_JELLY_SANDWICH.get(),
        DisplayItems.ED_CHEESE_SANDWICH.get(),
        DisplayItems.ED_GRILLED_CHEESE.get(),
        DisplayItems.ED_CHOCOLATE_COOKIE.get(),
        DisplayItems.ED_SUGAR_COOKIE.get(),
        DisplayItems.ED_SNICKERDOODLE.get(),
        DisplayItems.ED_SWEET_ROLL.get(),
        DisplayItems.ED_BERRY_SWEET_ROLL.get(),
        DisplayItems.ED_GLOW_BERRY_SWEET_ROLL.get(),
        DisplayItems.ED_SWEET_ROLL_SMALL.get(),
        DisplayItems.ED_BERRY_SWEET_ROLL_SMALL.get(),
        DisplayItems.ED_GLOW_BERRY_SWEET_ROLL_SMALL.get(),
        DisplayItems.ED_CHEESE_SLICE.get(),
        DisplayItems.ED_CRANBERRY_CHICKEN.get(),
        DisplayItems.ED_ASPARAGUS_MUSHROOM_PASTA.get(),
        DisplayItems.ED_SWEET_POTATO_CASSEROLE.get(),
        DisplayItems.ED_PLATED_CRANBERRY_GOAT_CHEESE_TOAST.get(),
        DisplayItems.ED_SMALL_PLATED_CRANBERRY_COBBLER_SLICE.get(),
        DisplayItems.ED_SMALL_PLATED_HONEYED_GOAT_CHEESE_TART_SLICE.get(),

        DisplayItems.FD_FESTIVE_CHICKEN.get(),
        DisplayItems.FD_CHRISTMAS_TEA.get(),
        DisplayItems.FD_SALMON_VERRINES.get(),
        DisplayItems.PD_PINEAPPLE_FRIED_RICE.get(),
        DisplayItems.PD_PINEAPPLE_ICE_CREAM.get(),
        DisplayItems.PD_PINEAPPLE_MILK_SHAKE.get(),
        DisplayItems.PD_PINEAPPLE_JUICE.get(),
        DisplayItems.PD_PINEAPPLE_PIE_SLICE.get(),
        DisplayItems.LM_PUFFERFISH_BROTH.get(),
        DisplayItems.LM_POTATO_SOUP.get(),
        DisplayItems.LM_RED_SOUP.get(),
        DisplayItems.LM_TOMATO_EGG_SOUP.get(),
        DisplayItems.LM_COD_DELUXE.get(),
        DisplayItems.LM_HEARTY_LUNCH.get(),
        DisplayItems.LM_CHICKEN_CURRY.get(),
        DisplayItems.LM_PASTA_WITH_MUSHROOM_SAUCE.get(),
        DisplayItems.LM_OMURICE.get(),
        DisplayItems.LM_MUSHROOM_POT_PIE.get(),
        DisplayItems.LM_ROASTED_MUTTOH_RACK.get(),
        DisplayItems.LM_SWEET_BERRY_CUSTARD.get(),
        DisplayItems.LM_RICE_PUDDING.get(),
        DisplayItems.OD_BOWL_OF_GUARDIAN_SOUP.get(),
        DisplayItems.OD_BRAISED_SEA_PICKLE.get(),
        DisplayItems.OD_SEAGRASS_SALAD.get(),
        DisplayItems.OD_SQUID_RINGS.get(),
        DisplayItems.OD_BACKED_TENTACLE_ON_A_STICK.get(),
        DisplayItems.OD_ELDER_GUARDIAN_ROLL.get(),
        DisplayItems.OD_FUGU_ROLL.get(),
        DisplayItems.OD_HONEY_FRIED_KELP.get(),
        DisplayItems.OD_COOKED_STUFFED_COD.get(),
        DisplayItems.OD_ELDER_GUARDIAN_ROLL_SMALL.get(),
        DisplayItems.OD_FUGU_ROLL_SMALL.get(),

        DisplayItems.BNC_FIERY_FONDUE.get(),
        DisplayItems.BNC_SCARLET_PIEROGI.get(),
        DisplayItems.BNC_HORROR_LASAGNA.get(),
        DisplayItems.BNC_CHEESY_PASTA.get(),
        DisplayItems.BNC_CREAMY_ONION_SOUP.get(),
        DisplayItems.BNC_VEGETABLE_OMELET.get(),
        DisplayItems.BNC_PLATED_HAM_AND_CHEESE_SANDWICH.get(),
        DisplayItems.BNC_SMALL_PLATED_QUICHE_SLICE.get(),

        DisplayItems.ACD_POOR_FISHER_CHOWDER.get(),
        DisplayItems.ACD_JELLYFISH_JELLY.get(),
        DisplayItems.ACD_UNUSUAL_FISH_SOUP.get(),
        DisplayItems.ACD_BASS_STEW.get(),
        DisplayItems.ACD_FISH_CHORBA.get(),
        DisplayItems.ACD_FISH_AND_CHIPS.get(),
        DisplayItems.ACD_HALASZLE.get(),
        DisplayItems.ACD_CRISPY_NORI_KELP.get(),
        DisplayItems.ACD_BAKED_POLLOCK_WITH_CARROTS.get(),
        DisplayItems.ACD_LARGE_FISH_WITH_VEGETABLES.get(),
        DisplayItems.ACD_ROLLMOPS.get(),
        DisplayItems.ACD_TUNA_SPAGHETTI.get(),
        DisplayItems.ACD_HALIBUT_WITH_TARTAR_SAUCE.get(),
        DisplayItems.ACD_BUCKLING.get(),
        DisplayItems.ACD_TURTLE_MEAT_DISH.get(),
        DisplayItems.ACD_PLATED_CATFISH_BARBECUE.get(),

        DisplayItems.ACD_SMALL_PLATED_RAW_FISH_FILLET_ROLL.get(),
        DisplayItems.ACD_SMALL_PLATED_FRIED_PERCH_ROLL.get(),

        DisplayItems.ERD_CHORUS_JUICE.get(),
        DisplayItems.ERD_AMBERVEIL_STEW.get(),
        DisplayItems.ERD_AMBERVEILED_CURRY.get(),
        DisplayItems.ERD_CHORUS_STEW.get(),
        DisplayItems.ERD_TWISTED_CEREAL.get(),
        DisplayItems.ERD_ENDERMITE_STEW.get(),
        DisplayItems.ERD_ENDER_PAELLA.get(),
        DisplayItems.ERD_CHICKEN_CURRY.get(),
        DisplayItems.ERD_STEAK_FRIES.get(),
        DisplayItems.ERD_VEIL_OF_FLAMES_RISOTTO.get(),
        DisplayItems.ERD_PEARL_PASTA.get(),
        DisplayItems.ERD_STUFFED_SHULKER_BOWL.get(),
        DisplayItems.ERD_PLATED_UNCANNY_COOKIES.get(),
        DisplayItems.ERD_PLATED_CRISPY_SKEWER.get(),
        DisplayItems.ERD_PLATED_STRANGE_ECLAIR.get(),
        DisplayItems.ERD_PLATED_CRAWLING_SANDWICH.get(),
        DisplayItems.ERD_SMALL_PLATED_CHORUS_PIE_SLICE.get(),

        DisplayItems.EDD_DRAGON_BREATH_AND_CHORUS_SOUP.get(),
        DisplayItems.EDD_SHULKER_SOUP.get(),
        DisplayItems.EDD_ENDER_NOODLE.get(),
        DisplayItems.EDD_ENDERMAN_GRISTLE_STEW.get(),
        DisplayItems.EDD_STIR_FRIED_SHULKER_MEAT.get(),
        DisplayItems.EDD_ROASTED_DRAGON_STEAK.get(),
        DisplayItems.EDD_END_MIXED_SALAD.get(),
        DisplayItems.EDD_ASSORTED_SALAD.get(),
        DisplayItems.EDD_ENDER_CONGEE.get(),
        DisplayItems.EDD_CHORUS_FRUIT_MILK_TEA.get(),
        DisplayItems.EDD_CHORUS_FRUIT_WINE.get(),
        DisplayItems.EDD_BUBBLE_TEA.get(),
        DisplayItems.EDD_DRAGON_BREATH_SODA.get(),
        DisplayItems.EDD_CHORUS_FLOWER_TEA.get(),
        DisplayItems.EDD_GRILLED_SHULKER.get(),
        DisplayItems.EDD_STEAMED_DRAGON_EGG_BLOCK.get(),
        DisplayItems.EDD_DRAGON_MEAT_STEW.get(),
        DisplayItems.EDD_STEAMED_DRAGON_EGG.get(),
        DisplayItems.EDD_DRAGON_LEG_WITH_SAUCE.get(),
        DisplayItems.EDD_PLATED_STUFFED_RICE_CAKE.get(),
        DisplayItems.EDD_PLATED_CHORUS_FLOWER_PIE.get(),
        DisplayItems.EDD_PLATED_ENDER_BAMBOO_RICE.get(),
        DisplayItems.EDD_PLATED_CHORUS_FRUIT_POPSICLE.get(),
        DisplayItems.EDD_PLATED_END_BARBECUE_STICK.get(),
        DisplayItems.EDD_SMALL_PLATED_CHORUS_FRUIT_PIE_SLICE.get(),

        DisplayItems.MND_SIZZLING_PUDDING.get(),
        DisplayItems.MND_ROCK_SOUP.get(),
        DisplayItems.MND_SPICY_NOODLE_SOUP.get(),
        DisplayItems.MND_STRIDER_STEW.get(),
        DisplayItems.MND_GHAST_SALAD.get(),
        DisplayItems.MND_DRIED_GHAST_WITH_MILK.get(),
        DisplayItems.MND_SAUSAGE_AND_POTATOES.get(),
        DisplayItems.MND_SPICY_HOGLIN_STEW.get(),
        DisplayItems.MND_EGG_SOUP.get(),
        DisplayItems.MND_BREAKFAST_SAMPLER.get(),
        DisplayItems.MND_FRIED_HOGLIN_CHOP.get(),
        DisplayItems.MND_TWISTED_GHASTA.get(),
        DisplayItems.MND_STRIDER_WITH_GRILLED_FUNGUS.get(),
        DisplayItems.MND_SCOTCH_EGGS.get(),
        DisplayItems.MND_GIANT_TAKOYAKI.get(),
        DisplayItems.MND_BLUE_TENDERLOIN_STEAK.get(),
        DisplayItems.MND_CRIMSON_STROGANOFF.get(),
        DisplayItems.MND_SPICY_CURRY.get(),
        DisplayItems.MND_BLEEDING_TARTAR.get(),
        DisplayItems.MND_HOT_WINGS.get(),
        DisplayItems.MND_PLATE_OF_GHASTA_WITH_CREAM.get(),
        DisplayItems.MND_PLATE_OF_STUFFED_HOGLIN_SNOUT.get(),
        DisplayItems.MND_PLATE_OF_STUFFED_HOGLIN_HAM.get(),
        DisplayItems.MND_PLATE_OF_STUFFED_HOGLIN.get(),
        DisplayItems.MND_PLATE_OF_COLD_STRIDERLOAF.get(),
        DisplayItems.MND_PLATE_OF_STRIDERLOAF.get(),

        DisplayItems.MND_PLATED_STUFFED_PEPPER.get(),
        DisplayItems.MND_PLATED_HOTDOG_WITH_MIXED_SALAD.get(),
        DisplayItems.MND_PLATED_HOTDOG_WITH_NETHER_SALAD.get(),
        DisplayItems.MND_PLATED_CHILIDOG.get(),
        DisplayItems.MND_PLATED_SPICY_COTTON.get(),
        DisplayItems.MND_PLATED_FRIES_GHASTA.get(),
        DisplayItems.MND_PLATED_DEVILED_EGG.get(),
        DisplayItems.MND_PLATED_SPICY_SKEWER.get(),
        DisplayItems.MND_PLATED_RED_LOIN_ON_A_STICK.get(),
        DisplayItems.MND_PLATED_NETHER_BURGER.get(),
        DisplayItems.MND_PLATED_BURNT_ROLL.get(),
        DisplayItems.MND_PLATED_HOT_CREAM_CONE.get(),

        DisplayItems.MND_SMALL_PLATED_MAGMA_CAKE_SLICE.get(),
        });
    }


}
