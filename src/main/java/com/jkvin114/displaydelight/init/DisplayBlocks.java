package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DisplayBlocks {
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DisplayDelight.MODID);

    public static final DeferredBlock<Block> PLATE = REGISTRY.register("food_plate",
            ()-> new EmptyPlateBlock(
            BlockBehaviour.Properties.of().noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> SMALL_PLATE = REGISTRY.register("small_food_plate",
            ()-> new EmptySmallPlateBlock(
                    BlockBehaviour.Properties.of().noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN)
                            .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> GLOW_BERRY_CUSTARD = createDrinkFoodBlock("glow_berry_custard");
    public static final DeferredBlock<Block> FRUIT_SALAD = createFoodBlock("fruit_salad");
    public static final DeferredBlock<Block> COOKED_RICE = createFoodBlock("cooked_rice");
    public static final DeferredBlock<Block> MIXED_SALAD = createFoodBlock("mixed_salad");
    public static final DeferredBlock<Block> BEEF_STEW = createFoodBlock("beef_stew");
    public static final DeferredBlock<Block> CHICKEN_SOUP = createFoodBlock("chicken_soup");
    public static final DeferredBlock<Block> VEGETABLE_SOUP = createFoodBlock("vegetable_soup");
    public static final DeferredBlock<Block> FISH_STEW = createFoodBlock("fish_stew");
    public static final DeferredBlock<Block> FRIED_RICE = createFoodBlock("fried_rice");
    public static final DeferredBlock<Block> PUMPKIN_SOUP = createFoodBlock("pumpkin_soup");
    public static final DeferredBlock<Block> BAKED_COD_STEW = createFoodBlock("baked_cod_stew");
    public static final DeferredBlock<Block> NOODLE_SOUP = createFoodBlock("noodle_soup");
    public static final DeferredBlock<Block> BONE_BROTH = createFoodBlock("bone_broth");
    public static final DeferredBlock<Block> BACON_AND_EGGS = createWideFoodBlock("bacon_and_eggs");
    public static final DeferredBlock<Block> PASTA_WITH_MEATBALLS = createWideFoodBlock("pasta_with_meatballs");
    public static final DeferredBlock<Block> PASTA_WITH_MUTTON_CHOP = createWideFoodBlock("pasta_with_mutton_chop");
    public static final DeferredBlock<Block> ROASTED_MUTTON_CHOPS = createWideFoodBlock("roasted_mutton_chops");
    public static final DeferredBlock<Block> STEAK_AND_POTATOES = createWideFoodBlock("steak_and_potatoes");
    public static final DeferredBlock<Block> VEGETABLE_NOODLES = createWideFoodBlock("vegetable_noodles");
    public static final DeferredBlock<Block> RATATOUILLE = createWideFoodBlock("ratatouille");
    public static final DeferredBlock<Block> SQUID_INK_PASTA = createWideFoodBlock("squid_ink_pasta");
    public static final DeferredBlock<Block> GRILLED_SALMON = createWideFoodBlock("grilled_salmon");
    public static final DeferredBlock<Block> MUSHROOM_RICE = createWideFoodBlock("mushroom_rice");
    public static final DeferredBlock<Block> ROAST_CHICKEN = createFoodBlock("roast_chicken");
    public static final DeferredBlock<Block> STUFFED_PUMPKIN = createFoodBlock("stuffed_pumpkin");
    public static final DeferredBlock<Block> HONEY_GLAZED_HAM = createFoodBlock("honey_glazed_ham");
    public static final DeferredBlock<Block> SHEPHEREDS_PIE = createFoodBlock("shepherds_pie");
    public static final DeferredBlock<Block> APPLE_CIDER = createDrinkFoodBlock("apple_cider");
    public static final DeferredBlock<Block> MELON_JUICE = createDrinkFoodBlock("melon_juice");
    public static final DeferredBlock<Block> HOT_COCOA = createDrinkFoodBlock("hot_cocoa");

    //VANILA
    public static final DeferredBlock<Block> MUSHROOM_STEW = createFoodBlock("mushroom_stew");
    public static final DeferredBlock<Block> RABBIT_STEW = createFoodBlock("rabbit_stew");
    public static final DeferredBlock<Block> BEETROOT_STEW = createFoodBlock("beetroot_soup");

    //CORN DELIGHT

    public static final DeferredBlock<Block> CD_NACHOS_BOWL = createFoodBlock("cd_nachos_bowl");
    public static final DeferredBlock<Block> CD_CREAMY_COR_DRINK = createDrinkFoodBlock("cd_creamy_corn_drink");

    public static final DeferredBlock<Block> CD_CORNBREAD_STUFFING = createFoodBlock("cd_cornbread_stuffing");
    public static final DeferredBlock<Block> CD_CORN_SOUP = createFoodBlock("cd_corn_soup");
    public static final DeferredBlock<Block> CD_CREAMED_CORN = createFoodBlock("cd_creamed_corn");

    //Expanded delight
    public static final DeferredBlock<Block> ED_ASPARAGUS_SOUP = createFoodBlock("ed_asparagus_soup");
    public static final DeferredBlock<Block> ED_ASPARAGUS_SOUP_CREAMY = createFoodBlock("ed_asparagus_soup_creamy");
    public static final DeferredBlock<Block> ED_ASPARAGUS_AND_BACON_CHEESY = createWideFoodBlock("ed_asparagus_and_bacon_cheesy");
    public static final DeferredBlock<Block> ED_PEPERONATA = createWideFoodBlock("ed_peperonata");
    public static final DeferredBlock<Block> ED_PEANUT_HONEY_SOUP = createFoodBlock("ed_peanut_honey_soup");
    public static final DeferredBlock<Block> ED_MAC_AND_CHEESE = createFoodBlock("ed_mac_and_cheese");
    public static final DeferredBlock<Block> ED_PEANUT_SALAD = createFoodBlock("ed_peanut_salad");
    public static final DeferredBlock<Block> ED_SWEET_POTTATO_SALAD = createFoodBlock("ed_sweet_potato_salad");

    public static final DeferredBlock<Block> ED_CINNAMON_RICE = createFoodBlock("ed_cinnamon_rice");
    public static final DeferredBlock<Block> ED_CINNAMON_APPLES = createFoodBlock("ed_cinnamon_apples");

    public static final DeferredBlock<Block> ED_APPLE_JUICE = createDrinkFoodBlock("ed_apple_juice");
    public static final DeferredBlock<Block> ED_SWEET_BERRY_JUICE = createDrinkFoodBlock("ed_sweet_berry_juice");
    public static final DeferredBlock<Block> ED_GLOW_BERRY_JUICE = createDrinkFoodBlock("ed_glow_berry_juice");
//delightful

    public static final DeferredBlock<Block> DF_MATCHA_ICE_CREAM = createFoodBlock("df_matcha_ice_cream");
    public static final DeferredBlock<Block> DF_MATCHA_MILKSHAKE= createDrinkFoodBlock("df_matcha_milkshake");
    public static final DeferredBlock<Block> DF_SALMONBERRY_ICE_CREAM = createFoodBlock("df_salmonberry_ice_cream");
    public static final DeferredBlock<Block> DF_SALMONBERRY_MILKSHAKE = createDrinkFoodBlock("df_salmonberry_milkshake");
    public static final DeferredBlock<Block> DF_MATCHA_LATTE = createDrinkFoodBlock("df_matcha_latte");
    public static final DeferredBlock<Block> DF_ENDER_NECTAR = createDrinkFoodBlock("df_ender_nectar");
    public static final DeferredBlock<Block> DF_BERRY_MATCHA_LATTE = createDrinkFoodBlock("df_berry_matcha_latte");
    public static final DeferredBlock<Block> DF_CACTUS_CHILI = createFoodBlock("df_cactus_chili");
    public static final DeferredBlock<Block> DF_FIELD_SALAD = createFoodBlock("df_field_salad");
    public static final DeferredBlock<Block> DF_STUFFED_CANTALOUPE = createFoodBlock("df_stuffed_cantaloupe");
    public static final DeferredBlock<Block> DF_SINIGANG = createFoodBlock("df_sinigang");
    public static final DeferredBlock<Block> DF_CACTUS_SOUP = createFoodBlock("df_cactus_soup");
    
    //pineapple delight
    public static final DeferredBlock<Block> PD_PINEAPPLE_FRIED_RICE = createFoodBlock("pd_pineapple_fried_rice");
    public static final DeferredBlock<Block> PD_PINEAPPLE_ICE_CREAM = createDrinkFoodBlock("pd_pineapple_ice_cream");
    public static final DeferredBlock<Block> PD_PINEAPPLE_MILK_SHAKE = createDrinkFoodBlock("pd_pineapple_milk_shake");
    public static final DeferredBlock<Block> PD_PINEAPPLE_JUICE = createDrinkFoodBlock("pd_pineapple_juice");



    //ocean delight
    public static final DeferredBlock<Block> OD_BOWL_OF_GUARDIAN_SOUP = createFoodBlock("od_bowl_of_guardian_soup");
    public static final DeferredBlock<Block> OD_BRAISED_SEA_PICKLE = createFoodBlock("od_braised_sea_pickle");
    public static final DeferredBlock<Block> OD_SEAGRASS_SALAD = createFoodBlock("od_seagrass_salad");
    public static final DeferredBlock<Block> OD_SQUID_RINGS = createFoodBlock("od_squid_rings");


    //alex delight
    public static final DeferredBlock<Block> AD_MAGGOT_SALAD = createFoodBlock("ad_maggot_salad");
    public static final DeferredBlock<Block> AD_KANGAROO_STEW = createFoodBlock("ad_kangaroo_stew");
    public static final DeferredBlock<Block> AD_ACACIA_BLOSSOM_SOUP = createFoodBlock("ad_acacia_blossom_soup");
    public static final DeferredBlock<Block> AD_LOBSTER_PASTA = createWideFoodBlock("ad_lobster_pasta");
    public static final DeferredBlock<Block> AD_KANGAROO_PASTA = createWideFoodBlock("ad_kangaroo_pasta");

    //cultural delight
    public static final DeferredBlock<Block> CTD_HEARTY_SALAD = createFoodBlock("ctd_hearty_salad");
    public static final DeferredBlock<Block> CTD_CREAMED_CORN = createFoodBlock("ctd_creamed_corn");
    public static final DeferredBlock<Block> CTD_SPICY_CURRY = createFoodBlock("ctd_spicy_curry");
    public static final DeferredBlock<Block> CTD_FRIED_EGGPLANT_PASTA = createWideFoodBlock("ctd_fried_eggplant_pasta");

    //large meals
    public static final DeferredBlock<Block> LM_PUFFERFISH_BROTH = createFoodBlock("lm_pufferfish_broth");
    public static final DeferredBlock<Block> LM_POTATO_SOUP = createFoodBlock("lm_potato_soup");
    public static final DeferredBlock<Block> LM_RED_SOUP = createFoodBlock("lm_red_soup");
    public static final DeferredBlock<Block> LM_TOMATO_EGG_SOUP = createFoodBlock("lm_tomato_egg_soup");
    public static final DeferredBlock<Block> LM_COD_DELUXE= createWideFoodBlock("lm_cod_deluxe");
    public static final DeferredBlock<Block> LM_HEARTY_LUNCH = createWideFoodBlock("lm_hearty_lunch");
    public static final DeferredBlock<Block> LM_CHICKEN_CURRY = createWideFoodBlock("lm_chicken_curry");
    public static final DeferredBlock<Block> LM_PASTA_WITH_MUSHROOM_SAUCE = createWideFoodBlock("lm_pasta_with_mushroom_sauce");
    public static final DeferredBlock<Block> LM_OMURICE = createFoodBlock("lm_omurice");
    public static final DeferredBlock<Block> LM_MUSHROOM_POT_PIE = createFoodBlock("lm_mushroom_pot_pie");
    public static final DeferredBlock<Block> LM_ROASTED_MUTTOH_RACK = createFoodBlock("lm_roasted_mutton_rack");
    public static final DeferredBlock<Block> LM_SWEET_BERRY_CUSTARD = createDrinkFoodBlock("lm_sweet_berry_custard");
    public static final DeferredBlock<Block> LM_RICE_PUDDING = createFoodBlock("lm_rice_pudding");

    //festive delight
    public static final DeferredBlock<Block> FD_FESTIVE_CHICKEN = createFoodBlock("fd_festive_chicken");
    public static final DeferredBlock<Block> FD_CHRISTMAS_TEA = createDrinkFoodBlock("fd_christmas_tea");
    public static final DeferredBlock<Block> FD_SALMON_VERRINES = createDrinkFoodBlock("fd_salmon_verrines");

    public static Block[] getAll() {
        return new Block[]{
                FRUIT_SALAD.get(),  GLOW_BERRY_CUSTARD.get(), COOKED_RICE.get(), MIXED_SALAD.get(),
                BEEF_STEW.get(), CHICKEN_SOUP.get(), VEGETABLE_SOUP.get(), FISH_STEW.get(), FRIED_RICE.get(), PUMPKIN_SOUP.get(),
                BAKED_COD_STEW.get(), NOODLE_SOUP.get(), BONE_BROTH.get(), BACON_AND_EGGS.get(), PASTA_WITH_MEATBALLS.get(),
                PASTA_WITH_MUTTON_CHOP.get(), ROASTED_MUTTON_CHOPS.get(), STEAK_AND_POTATOES.get(), VEGETABLE_NOODLES.get(), RATATOUILLE.get(),
                SQUID_INK_PASTA.get(), GRILLED_SALMON.get(), MUSHROOM_RICE.get(), ROAST_CHICKEN.get(), STUFFED_PUMPKIN.get(), HONEY_GLAZED_HAM.get(),
                SHEPHEREDS_PIE.get(), APPLE_CIDER.get(), MELON_JUICE.get(), HOT_COCOA.get(),

                MUSHROOM_STEW.get(),RABBIT_STEW.get(),BEETROOT_STEW.get(),

                CD_NACHOS_BOWL.get(),CD_CREAMY_COR_DRINK.get(),CD_CORN_SOUP.get(),CD_CORNBREAD_STUFFING.get(),CD_CREAMED_CORN.get(),

                ED_ASPARAGUS_SOUP.get(),ED_ASPARAGUS_SOUP_CREAMY.get(),ED_ASPARAGUS_AND_BACON_CHEESY.get(),
                ED_PEPERONATA.get(),ED_PEANUT_HONEY_SOUP.get(),ED_MAC_AND_CHEESE.get(),ED_PEANUT_SALAD.get(),
                ED_SWEET_POTTATO_SALAD.get(),ED_CINNAMON_RICE.get(),ED_CINNAMON_APPLES.get(),
                ED_APPLE_JUICE.get(),ED_SWEET_BERRY_JUICE.get(),ED_GLOW_BERRY_JUICE.get(),

                DF_MATCHA_ICE_CREAM.get(),DF_MATCHA_LATTE.get(),DF_MATCHA_MILKSHAKE.get(),
                DF_SALMONBERRY_ICE_CREAM.get(),DF_SALMONBERRY_MILKSHAKE.get(),DF_ENDER_NECTAR.get(),
                DF_BERRY_MATCHA_LATTE.get(),DF_CACTUS_CHILI.get(),DF_FIELD_SALAD.get(),DF_STUFFED_CANTALOUPE.get(),
                DF_SINIGANG.get(), DF_CACTUS_SOUP.get(),


                PD_PINEAPPLE_FRIED_RICE.get(), PD_PINEAPPLE_JUICE.get(),PD_PINEAPPLE_ICE_CREAM.get(),PD_PINEAPPLE_MILK_SHAKE.get(),

                OD_SQUID_RINGS.get(),OD_BRAISED_SEA_PICKLE.get(),OD_SEAGRASS_SALAD.get(),OD_BOWL_OF_GUARDIAN_SOUP.get(),

                AD_ACACIA_BLOSSOM_SOUP.get(), AD_KANGAROO_PASTA.get(), AD_KANGAROO_STEW.get(), AD_MAGGOT_SALAD.get(),
                AD_LOBSTER_PASTA.get(),


                CTD_HEARTY_SALAD.get(), CTD_CREAMED_CORN.get(), CTD_SPICY_CURRY.get(), CTD_FRIED_EGGPLANT_PASTA.get(),
                LM_PUFFERFISH_BROTH.get(), LM_POTATO_SOUP.get(), LM_RED_SOUP.get(), LM_TOMATO_EGG_SOUP.get(),
                LM_COD_DELUXE.get(), LM_HEARTY_LUNCH.get(), LM_CHICKEN_CURRY.get(), LM_PASTA_WITH_MUSHROOM_SAUCE.get(),
                LM_OMURICE.get(), LM_MUSHROOM_POT_PIE.get(), LM_ROASTED_MUTTOH_RACK.get(), LM_SWEET_BERRY_CUSTARD.get(),
                LM_RICE_PUDDING.get(),

                FD_CHRISTMAS_TEA.get(),FD_FESTIVE_CHICKEN.get(),FD_SALMON_VERRINES.get()

        };
    }
    private  static BlockBehaviour.Properties baseProps(){
      return   BlockBehaviour.Properties.of().noOcclusion().noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.NONE);
    }

    private static DeferredBlock<Block> createDrinkFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new DrinkBlock(baseProps()
                        .sound(SoundType.GLASS)));
    }
    private static DeferredBlock<Block> createWideFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new WideFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }
    private static DeferredBlock<Block> createFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new FoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }
}
