package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.DispenserBlock;
import java.util.function.Supplier;

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


    public static final DeferredHolder<Item,Item> OD_ELDER_QUARDIAN_ROLL = block(SmallPlatedBlocks.OD_ELDER_QUARDIAN_ROLL);
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


    private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block)block.get(), new Item.Properties());
        });
    }

}
