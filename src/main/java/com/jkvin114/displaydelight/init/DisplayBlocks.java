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
    public static final DeferredBlock<Block> HOT_COCOA = createHotDrinkFoodBlock("hot_cocoa");

    //VANILA
    public static final DeferredBlock<Block> MUSHROOM_STEW = createFoodBlock("mushroom_stew");
    public static final DeferredBlock<Block> RABBIT_STEW = createFoodBlock("rabbit_stew");
    public static final DeferredBlock<Block> BEETROOT_STEW = createFoodBlock("beetroot_soup");

    //CORN DELIGHT

    public static final DeferredBlock<Block> CD_NACHOS_BOWL = createFoodBlock("cd_nachos_bowl");
    public static final DeferredBlock<Block> CD_CREAMY_COR_DRINK = createHotDrinkFoodBlock("cd_creamy_corn_drink");

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
    public static final DeferredBlock<Block> DF_MATCHA_LATTE = createHotDrinkFoodBlock("df_matcha_latte");
    public static final DeferredBlock<Block> DF_ENDER_NECTAR = createHotDrinkFoodBlock("df_ender_nectar");
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
    public static final DeferredBlock<Block> FD_CHRISTMAS_TEA = createHotDrinkFoodBlock("fd_christmas_tea");
    public static final DeferredBlock<Block> FD_SALMON_VERRINES = createDrinkFoodBlock("fd_salmon_verrines");

    public static final DeferredBlock<Block> BNC_FIERY_FONDUE = createFoodBlock("bnc_fiery_fondue");
    public static final DeferredBlock<Block> BNC_SCARLET_PIEROGI = createWideFoodBlock("bnc_scarlet_pierogi");
    public static final DeferredBlock<Block> BNC_HORROR_LASAGNA = createWideFoodBlock("bnc_horror_lasagna");
    public static final DeferredBlock<Block> BNC_CHEESY_PASTA = createWideFoodBlock("bnc_cheesy_pasta");
    public static final DeferredBlock<Block> BNC_CREAMY_ONION_SOUP = createFoodBlock("bnc_creamy_onion_soup");
    public static final DeferredBlock<Block> BNC_VEGETABLE_OMELET = createFoodBlock("bnc_vegetable_omelet");

    public static final DeferredBlock<Block> ED_CRANBERRY_JUICE = createDrinkFoodBlock("ed_cranberry_juice");
    public static final DeferredBlock<Block> ED_CRANBERRY_CHICKEN = createWideFoodBlock("ed_cranberry_chicken");
    public static final DeferredBlock<Block> ED_ASPARAGUS_MUSHROOM_PASTA = createWideFoodBlock("ed_asparagus_mushroom_pasta");
    public static final DeferredBlock<Block> ED_SWEET_POTATO_CASSEROLE = createWideFoodBlock("ed_sweet_potato_casserole");

    public static final DeferredBlock<Block> CTD_POACHED_EGGPLANTS = createFoodBlock("ctd_poached_eggplants");
    public static final DeferredBlock<Block> CTD_EGGPLANT_PARMESAN = createFoodBlock("ctd_eggplant_parmesan");

    public static final DeferredBlock<Block> ACD_POOR_FISHER_CHOWDER = createFoodBlock("acd_poor_fisher_chowder");
    public static final DeferredBlock<Block> ACD_JELLYFISH_JELLY = createFoodBlock("acd_jellyfish_jelly");
    public static final DeferredBlock<Block> ACD_UNUSUAL_FISH_SOUP = createFoodBlock("acd_unusual_fish_soup");
    public static final DeferredBlock<Block> ACD_BASS_STEW = createFoodBlock("acd_bass_stew");
    public static final DeferredBlock<Block> ACD_FISH_CHORBA = createFoodBlock("acd_fish_chorba");
    public static final DeferredBlock<Block> ACD_FISH_AND_CHIPS = createFoodBlock("acd_fish_and_chips");
    public static final DeferredBlock<Block> ACD_HALASZLE = createFoodBlock("acd_halaszle");
    public static final DeferredBlock<Block> ACD_CRISPY_NORI_KELP = createFoodBlock("acd_crispy_nori_kelp");
    public static final DeferredBlock<Block> ACD_BAKED_POLLOCK_WITH_CARROTS = createWideFoodBlock("acd_baked_pollock_with_carrots");
    public static final DeferredBlock<Block> ACD_LARGE_FISH_WITH_VEGETABLES = createWideFoodBlock("acd_large_fish_with_vegetables");
    public static final DeferredBlock<Block> ACD_ROLLMOPS = createWideFoodBlock("acd_rollmops");
    public static final DeferredBlock<Block> ACD_TUNA_SPAGHETTI = createWideFoodBlock("acd_tuna_spaghetti");
    public static final DeferredBlock<Block> ACD_HALIBUT_WITH_TARTAR_SAUCE = createWideFoodBlock("acd_halibut_with_tartar_sauce");
    public static final DeferredBlock<Block> ACD_BUCKLING = createWideFoodBlock("acd_buckling");
    public static final DeferredBlock<Block> ACD_TURTLE_MEAT_DISH = createWideFoodBlock("acd_turtle_meat_dish");

    public static final DeferredBlock<Block> ERD_CHORUS_JUICE = createDrinkFoodBlock("erd_chorus_juice");
    public static final DeferredBlock<Block> ERD_AMBERVEIL_STEW = createFoodBlock("erd_amberveil_stew");
    public static final DeferredBlock<Block> ERD_AMBERVEILED_CURRY = createFoodBlock("erd_amberveiled_curry");
    public static final DeferredBlock<Block> ERD_CHORUS_STEW = createFoodBlock("erd_chorus_stew");
    public static final DeferredBlock<Block> ERD_TWISTED_CEREAL = createFoodBlock("erd_twisted_cereal");
    public static final DeferredBlock<Block> ERD_ENDERMITE_STEW = createFoodBlock("erd_endermite_stew");
    public static final DeferredBlock<Block> ERD_ENDER_PAELLA = createWideFoodBlock("erd_ender_paella");
    public static final DeferredBlock<Block> ERD_CHICKEN_CURRY = createWideFoodBlock("erd_chicken_curry");
    public static final DeferredBlock<Block> ERD_STEAK_FRIES = createWideFoodBlock("erd_steak_fries");
    public static final DeferredBlock<Block> ERD_VEIL_OF_FLAMES_RISOTTO = createWideFoodBlock("erd_veil_of_flames_risotto");
    public static final DeferredBlock<Block> ERD_PEARL_PASTA = createWideFoodBlock("erd_pearl_pasta");
    public static final DeferredBlock<Block> ERD_STUFFED_SHULKER_BOWL = createFoodBlock("erd_stuffed_shulker_bowl");

    public static final DeferredBlock<Block> EDD_DRAGON_BREATH_AND_CHORUS_SOUP = createFoodBlock("edd_dragon_breath_and_chorus_soup");
    public static final DeferredBlock<Block> EDD_SHULKER_SOUP = createFoodBlock("edd_shulker_soup");
    public static final DeferredBlock<Block> EDD_ENDER_NOODLE = createFoodBlock("edd_ender_noodle");
    public static final DeferredBlock<Block> EDD_ENDERMAN_GRISTLE_STEW = createFoodBlock("edd_enderman_gristle_stew");
    public static final DeferredBlock<Block> EDD_STIR_FRIED_SHULKER_MEAT = createWideFoodBlock("edd_stir_fried_shulker_meat");
    public static final DeferredBlock<Block> EDD_ROASTED_DRAGON_STEAK = createWideFoodBlock("edd_roasted_dragon_steak");
    public static final DeferredBlock<Block> EDD_END_MIXED_SALAD = createFoodBlock("edd_end_mixed_salad");
    public static final DeferredBlock<Block> EDD_ASSORTED_SALAD = createFoodBlock("edd_assorted_salad");
    public static final DeferredBlock<Block> EDD_ENDER_CONGEE = createFoodBlock("edd_ender_congee");
    public static final DeferredBlock<Block> EDD_CHORUS_FRUIT_MILK_TEA = createHotDrinkFoodBlock("edd_chorus_fruit_milk_tea");
    public static final DeferredBlock<Block> EDD_CHORUS_FRUIT_WINE = createDrinkFoodBlock("edd_chorus_fruit_wine");
    public static final DeferredBlock<Block> EDD_BUBBLE_TEA = createHotDrinkFoodBlock("edd_bubble_tea");
    public static final DeferredBlock<Block> EDD_DRAGON_BREATH_SODA = createDrinkFoodBlock("edd_dragon_breath_soda");
    public static final DeferredBlock<Block> EDD_CHORUS_FLOWER_TEA = createHotDrinkFoodBlock("edd_chorus_flower_tea");
    public static final DeferredBlock<Block> EDD_GRILLED_SHULKER = createFoodBlock("edd_grilled_shulker");
    public static final DeferredBlock<Block> EDD_DRAGON_MEAT_STEW = createFoodBlock("edd_dragon_meat_stew");
    public static final DeferredBlock<Block> EDD_STEAMED_DRAGON_EGG = createFoodBlock("edd_steamed_dragon_egg");
    public static final DeferredBlock<Block> EDD_DRAGON_LEG_WITH_SAUCE = createFoodBlock("edd_dragon_leg_with_sauce");

    public static final DeferredBlock<Block> MND_SIZZLING_PUDDING = createFoodBlock("mnd_sizzling_pudding");
    public static final DeferredBlock<Block> MND_ROCK_SOUP = createFoodBlock("mnd_rock_soup");
    public static final DeferredBlock<Block> MND_SPICY_NOODLE_SOUP = createFoodBlock("mnd_spicy_noodle_soup");
    public static final DeferredBlock<Block> MND_STRIDER_STEW = createFoodBlock("mnd_strider_stew");
    public static final DeferredBlock<Block> MND_GHAST_SALAD = createFoodBlock("mnd_ghast_salad");
    public static final DeferredBlock<Block> MND_DRIED_GHAST_WITH_MILK = createFoodBlock("mnd_dried_ghast_with_milk");
    public static final DeferredBlock<Block> MND_SAUSAGE_AND_POTATOES = createFoodBlock("mnd_sausage_and_potatoes");
    public static final DeferredBlock<Block> MND_SPICY_HOGLIN_STEW = createFoodBlock("mnd_spicy_hoglin_stew");
    public static final DeferredBlock<Block> MND_EGG_SOUP = createFoodBlock("mnd_egg_soup");
    public static final DeferredBlock<Block> MND_BREAKFAST_SAMPLER = createWideFoodBlock("mnd_breakfast_sampler");
    public static final DeferredBlock<Block> MND_FRIED_HOGLIN_CHOP = createWideFoodBlock("mnd_fried_hoglin_chop");
    public static final DeferredBlock<Block> MND_TWISTED_GHASTA = createWideFoodBlock("mnd_twisted_ghasta");
    public static final DeferredBlock<Block> MND_STRIDER_WITH_GRILLED_FUNGUS = createWideFoodBlock("mnd_strider_with_grilled_fungus");
    public static final DeferredBlock<Block> MND_SCOTCH_EGGS = createWideFoodBlock("mnd_scotch_eggs");
    public static final DeferredBlock<Block> MND_GIANT_TAKOYAKI = createWideFoodBlock("mnd_giant_takoyaki");
    public static final DeferredBlock<Block> MND_BLUE_TENDERLOIN_STEAK = createWideFoodBlock("mnd_blue_tenderloin_steak");
    public static final DeferredBlock<Block> MND_CRIMSON_STROGANOFF = createWideFoodBlock("mnd_crimson_stroganoff");
    public static final DeferredBlock<Block> MND_SPICY_CURRY = createWideFoodBlock("mnd_spicy_curry");
    public static final DeferredBlock<Block> MND_BLEEDING_TARTAR = createWideFoodBlock("mnd_bleeding_tartar");
    public static final DeferredBlock<Block> MND_HOT_WINGS = createWideFoodBlock("mnd_hot_wings");

    public static final DeferredBlock<Block> MND_PLATE_OF_GHASTA_WITH_CREAM = createFoodBlock("mnd_plate_of_ghasta_with_cream");
    public static final DeferredBlock<Block> MND_PLATE_OF_STUFFED_HOGLIN_SNOUT = createFoodBlock("mnd_plate_of_stuffed_hoglin_snout");
    public static final DeferredBlock<Block> MND_PLATE_OF_STUFFED_HOGLIN_HAM = createFoodBlock("mnd_plate_of_stuffed_hoglin_ham");
    public static final DeferredBlock<Block> MND_PLATE_OF_STUFFED_HOGLIN = createFoodBlock("mnd_plate_of_stuffed_hoglin");
    public static final DeferredBlock<Block> MND_PLATE_OF_COLD_STRIDERLOAF = createFoodBlock("mnd_plate_of_cold_striderloaf");
    public static final DeferredBlock<Block> MND_PLATE_OF_STRIDERLOAF = createFoodBlock("mnd_plate_of_striderloaf");

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

                FD_CHRISTMAS_TEA.get(),FD_FESTIVE_CHICKEN.get(),FD_SALMON_VERRINES.get(),BNC_FIERY_FONDUE.get(),BNC_SCARLET_PIEROGI.get(),BNC_HORROR_LASAGNA.get(),
                BNC_CHEESY_PASTA.get(),BNC_CREAMY_ONION_SOUP.get(),BNC_VEGETABLE_OMELET.get(),ED_CRANBERRY_JUICE.get(),ED_CRANBERRY_CHICKEN.get(),
                ED_ASPARAGUS_MUSHROOM_PASTA.get(),ED_SWEET_POTATO_CASSEROLE.get(),CTD_POACHED_EGGPLANTS.get(),CTD_EGGPLANT_PARMESAN.get(),
                ACD_POOR_FISHER_CHOWDER.get(),ACD_JELLYFISH_JELLY.get(),ACD_UNUSUAL_FISH_SOUP.get(),ACD_BASS_STEW.get(),ACD_FISH_CHORBA.get(),
                ACD_FISH_AND_CHIPS.get(),ACD_HALASZLE.get(),ACD_CRISPY_NORI_KELP.get(),ACD_BAKED_POLLOCK_WITH_CARROTS.get(),ACD_LARGE_FISH_WITH_VEGETABLES.get()
                ,ACD_ROLLMOPS.get(),ACD_TUNA_SPAGHETTI.get(),ACD_HALIBUT_WITH_TARTAR_SAUCE.get(),ACD_BUCKLING.get(),ACD_TURTLE_MEAT_DISH.get(),
                ERD_CHORUS_JUICE.get(),ERD_AMBERVEIL_STEW.get(),ERD_AMBERVEILED_CURRY.get(),ERD_CHORUS_STEW.get(),ERD_TWISTED_CEREAL.get(),
                ERD_ENDERMITE_STEW.get(),ERD_ENDER_PAELLA.get(),ERD_CHICKEN_CURRY.get(),ERD_STEAK_FRIES.get(),ERD_VEIL_OF_FLAMES_RISOTTO.get(),
                ERD_PEARL_PASTA.get(),ERD_STUFFED_SHULKER_BOWL.get(),EDD_DRAGON_BREATH_AND_CHORUS_SOUP.get(),EDD_SHULKER_SOUP.get(),EDD_ENDER_NOODLE.get(),
                EDD_ENDERMAN_GRISTLE_STEW.get(),EDD_STIR_FRIED_SHULKER_MEAT.get(),EDD_ROASTED_DRAGON_STEAK.get(),EDD_END_MIXED_SALAD.get(),
                EDD_ASSORTED_SALAD.get(),EDD_ENDER_CONGEE.get(),EDD_CHORUS_FRUIT_MILK_TEA.get(),EDD_CHORUS_FRUIT_WINE.get(),EDD_BUBBLE_TEA.get(),
                EDD_DRAGON_BREATH_SODA.get(),EDD_CHORUS_FLOWER_TEA.get(),EDD_GRILLED_SHULKER.get(),
                EDD_DRAGON_MEAT_STEW.get(),EDD_STEAMED_DRAGON_EGG.get(),EDD_DRAGON_LEG_WITH_SAUCE.get(),MND_SIZZLING_PUDDING.get(),MND_ROCK_SOUP.get(),
                MND_SPICY_NOODLE_SOUP.get(),MND_STRIDER_STEW.get(),MND_GHAST_SALAD.get(),MND_DRIED_GHAST_WITH_MILK.get(),MND_SAUSAGE_AND_POTATOES.get(),
                MND_SPICY_HOGLIN_STEW.get(),MND_EGG_SOUP.get(),MND_BREAKFAST_SAMPLER.get(),MND_FRIED_HOGLIN_CHOP.get(),MND_TWISTED_GHASTA.get(),
                MND_STRIDER_WITH_GRILLED_FUNGUS.get(),MND_SCOTCH_EGGS.get(),MND_GIANT_TAKOYAKI.get(),MND_BLUE_TENDERLOIN_STEAK.get(),
                MND_CRIMSON_STROGANOFF.get(),MND_SPICY_CURRY.get(),MND_BLEEDING_TARTAR.get(),MND_HOT_WINGS.get(),MND_PLATE_OF_GHASTA_WITH_CREAM.get(),
                MND_PLATE_OF_STUFFED_HOGLIN_SNOUT.get(),MND_PLATE_OF_STUFFED_HOGLIN_HAM.get(),MND_PLATE_OF_STUFFED_HOGLIN.get(),
                MND_PLATE_OF_COLD_STRIDERLOAF.get(),MND_PLATE_OF_STRIDERLOAF.get()

        };
    }
    private  static BlockBehaviour.Properties baseProps(){
      return   BlockBehaviour.Properties.of().noOcclusion().noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.NONE);
    }
    private static DeferredBlock<Block> createHotDrinkFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new HotDrinkBlock(baseProps()
                        .sound(SoundType.GLASS)));
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
