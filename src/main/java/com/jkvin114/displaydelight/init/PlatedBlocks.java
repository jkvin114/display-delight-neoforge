package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.FieryPlatedFoodBlock;
import com.jkvin114.displaydelight.block.SimplePlatedFoodBlock;
import com.jkvin114.displaydelight.block.StackablePlateFoodBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PlatedBlocks {
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DisplayDelight.MODID);
    public static final DeferredBlock<Block> PLATED_DUMPLINGS = createStackablePlatedBlock("plated_dumplings",2);
    public static final DeferredBlock<Block> PLATED_HAMBURGER= createPlatedBlock("plated_hamburger");
    public static final DeferredBlock<Block> PLATED_BARBECUE_STICK= createStackablePlatedBlock("plated_barbecue_stick",3);
    public static final DeferredBlock<Block> PLATED_CHICKEN_SANDWICH= createStackablePlatedBlock("plated_chicken_sandwich",2);
    public static final DeferredBlock<Block> PLATED_EGG_SANDWICH= createStackablePlatedBlock("plated_egg_sandwich",2);
    public static final DeferredBlock<Block> PLATED_KELP_ROLL= createStackablePlatedBlock("plated_kelp_roll",3);
    public static final DeferredBlock<Block> PLATED_MELON_POPSICLE= createStackablePlatedBlock("plated_melon_popsicle",2);
    public static final DeferredBlock<Block> PLATED_STUFFED_POTATO= createStackablePlatedBlock("plated_stuffed_potato",3);
    public static final DeferredBlock<Block> PLATED_MUTTON_WRAP= createStackablePlatedBlock("plated_mutton_wrap",2);
    public static final DeferredBlock<Block> PLATED_BACON_SANDWICH= createPlatedBlock("plated_bacon_sandwich");

    public static final DeferredBlock<Block> PLATED_CABBAGE_ROLL= createStackablePlatedBlock("plated_cabbage_rolls",3);

    public static final DeferredBlock<Block> PLATED_COD_ROLL= createStackablePlatedBlock("plated_cod_roll",6);
    public static final DeferredBlock<Block> PLATED_KELP_ROLL_SLICE= createStackablePlatedBlock("plated_kelp_roll_slice",6);
    public static final DeferredBlock<Block> PLATED_SALMON_ROLL= createStackablePlatedBlock("plated_salmon_roll",6);

    public static final DeferredBlock<Block> PLATED_SWEET_BERRY_COOKIE = createStackablePlatedBlock("plated_sweet_berry_cookie",4);
    public static final DeferredBlock<Block> PLATED_HONEY_COOKIE = createStackablePlatedBlock("plated_honey_cookie",4);

    //VANILA
    public static final DeferredBlock<Block> PLATED_COOKIE = createStackablePlatedBlock("plated_cookie",4);
    public static final DeferredBlock<Block> PLATED_PUMPKIN_PIE = createPlatedBlock("plated_pumpkin_pie");


    //corn delight
    public static final DeferredBlock<Block> CD_GRILLED_CORN = createStackablePlatedBlock("cd_plated_grilled_corn",2);
    public static final DeferredBlock<Block> CD_CLASSIC_CORN_DOG = createStackablePlatedBlock("cd_plated_classic_corn_dog",2);
    public static final DeferredBlock<Block> CD_TACO = createStackablePlatedBlock("cd_plated_taco",2);


//EXPANDED DELIGHT
    public static final DeferredBlock<Block> ED_PEANUT_BUTTER_SANDWICH = createPlatedBlock("ed_plated_peanut_butter_sandwich");
    public static final DeferredBlock<Block> ED_PEANUT_BUTTER_AND_HONEY_SANDWICH = createPlatedBlock("ed_plated_peanut_butter_honey_sandwich");
    public static final DeferredBlock<Block> ED_GLOW_BERRY_JELLY_SANDWICH = createPlatedBlock("ed_plated_glow_berry_jelly_sandwich");
    public static final DeferredBlock<Block> ED_SWEET_BERRY_JELLY_SANDWICH = createPlatedBlock("ed_plated_sweet_berry_jelly_sandwich");
    public static final DeferredBlock<Block> ED_CHEESE_SANDWICH = createPlatedBlock("ed_plated_cheese_sandwich");
    public static final DeferredBlock<Block> ED_GRILLED_CHEESE = createPlatedBlock("ed_plated_grilled_cheese");

    public static final DeferredBlock<Block> ED_CHOCOLATE_COOKIE = createStackablePlatedBlock("ed_plated_chocolate_cookie",4);
    public static final DeferredBlock<Block> ED_SUGAR_COOKIE = createStackablePlatedBlock("ed_plated_sugar_cookie",4);
    public static final DeferredBlock<Block> ED_SNICKERDOODLE = createStackablePlatedBlock("ed_plated_snickerdoodle",4);

    public static final DeferredBlock<Block> ED_SWEET_ROLL =  createStackablePlatedBlock("ed_plated_sweet_roll",4);
    public static final DeferredBlock<Block> ED_BERRY_SWEET_ROLL =  createStackablePlatedBlock("ed_plated_berry_sweet_roll",4);
    public static final DeferredBlock<Block> ED_GLOW_BERRY_SWEET_ROLL =  createStackablePlatedBlock("ed_plated_glow_berry_sweet_roll",4);
    //DELIGHTFUL
    public static final DeferredBlock<Block> DF_SMORE = createPlatedBlock("df_plated_smore");
    public static final DeferredBlock<Block> DF_CHEESEBURGER = createPlatedBlock("df_plated_cheeseburger");
    public static final DeferredBlock<Block> DF_DELUXE_CHEESEBURGER = createPlatedBlock("df_plated_deluxe_cheeseburger");
    public static final DeferredBlock<Block> DF_NUT_BUTTER_AND_JELLY_SANDWICH = createPlatedBlock("df_plated_nut_butter_and_jelly_sandwich");

    public static final DeferredBlock<Block> DF_COOKED_MARSHMELLOW_STICK = createStackablePlatedBlock("df_plated_cooked_marshmallow_stick",3);
    public static final DeferredBlock<Block> DF_CANTALOUPE_POPSICLE = createStackablePlatedBlock("df_plated_cantaloupe_popsicle",2);
    public static final DeferredBlock<Block> DF_CANTALOUPE_BREAD = createStackablePlatedBlock("df_plated_cantaloupe_bread",2);
    public static final DeferredBlock<Block> DF_WRAPPED_CANTALOUPE = createStackablePlatedBlock("df_plated_wrapped_cantaloupe",2);


    //OCEAN DELIGHT
    public static final DeferredBlock<Block> OD_BACKED_TENTACLE_ON_A_STICK = createStackablePlatedBlock("od_plated_baked_tentacle_on_a_stick",2);
    public static final DeferredBlock<Block> OD_ELDER_GUARDIAN_ROLL = createStackablePlatedBlock("od_plated_elder_guardian_roll",6);
    public static final DeferredBlock<Block> OD_FUGU_ROLL = createStackablePlatedBlock("od_plated_fugu_roll",6);
    public static final DeferredBlock<Block> OD_HONEY_FRIED_KELP = createPlatedBlock("od_plated_honey_fried_kelp");
    public static final DeferredBlock<Block> OD_COOKED_STUFFED_COD = createStackablePlatedBlock("od_plated_cooked_stuffed_cod",2);



    //ALEX DELIGHT
    public static final DeferredBlock<Block> AD_BUNFUNBUS_SANDWICH = createPlatedBlock("ad_plated_bunfungus_sandwich");
    public static final DeferredBlock<Block> AD_BISON_BURGER = createPlatedBlock("ad_plated_bison_burger");
    public static final DeferredBlock<Block> AD_GONGYLIDIA_BRUSCHETTA = createStackablePlatedBlock("ad_plated_gongylidia_bruschetta", 2);

    //cultural delight
    public static final DeferredBlock<Block> CTD_ELOTE = createStackablePlatedBlock("ctd_plated_elote",2);
    public static final DeferredBlock<Block> CTD_EMPANADA = createStackablePlatedBlock("ctd_plated_empanada",2);
    public static final DeferredBlock<Block> CTD_BEEF_BURITO = createStackablePlatedBlock("ctd_plated_beef_burrito",2);
    public static final DeferredBlock<Block> CTD_MUTTON_SANDWICH = createPlatedBlock("ctd_plated_mutton_sandwich");
    public static final DeferredBlock<Block> CTD_EGGPLANT_BURGER = createPlatedBlock("ctd_plated_eggplant_burger");
    public static final DeferredBlock<Block> CTD_AVOCADO_TOAST = createPlatedBlock("ctd_plated_avocado_toast");
    public static final DeferredBlock<Block> CTD_CHICKEN_TACO = createStackablePlatedBlock("ctd_plated_chicken_taco",2);
    public static final DeferredBlock<Block> CTD_PORK_WRAP = createStackablePlatedBlock("ctd_plated_pork_wrap",2);
    public static final DeferredBlock<Block> CTD_FISH_TACO = createStackablePlatedBlock("ctd_plated_fish_taco",2);
    public static final DeferredBlock<Block> CTD_CHICKEN_ROLL = createStackablePlatedBlock("ctd_plated_chicken_roll",3);
    public static final DeferredBlock<Block> CTD_MIDORI_ROLL = createStackablePlatedBlock("ctd_plated_midori_roll",3);
    public static final DeferredBlock<Block> CTD_CHICKEN_ROLL_SLICE = createStackablePlatedBlock("ctd_plated_chicken_roll_slice",6);
    public static final DeferredBlock<Block> CTD_MIDORI_ROLL_SLICE = createStackablePlatedBlock("ctd_plated_midori_roll_slice",6);
    public static final DeferredBlock<Block> CTD_PUFFERFISH_ROLL = createStackablePlatedBlock("ctd_plated_pufferfish_roll",6);
    public static final DeferredBlock<Block> CTD_TROPICAL_ROLL = createStackablePlatedBlock("ctd_plated_tropical_roll",6);
    public static final DeferredBlock<Block> CTD_RICE_BALL = createStackablePlatedBlock("ctd_plated_rice_ball",4);
    public static final DeferredBlock<Block> CTD_EGG_ROLL = createStackablePlatedBlock("ctd_plated_egg_roll",6);
    public static final DeferredBlock<Block> CTD_CALAMARI_ROLL = createStackablePlatedBlock("ctd_plated_calamari_roll",6);

    public static final DeferredBlock<Block> ACD_PLATED_CATFISH_BARBECUE = createStackablePlatedBlock("acd_plated_catfish_barbecue",3);
    public static final DeferredBlock<Block> BNC_PLATED_HAM_AND_CHEESE_SANDWICH = createPlatedBlock("bnc_plated_ham_and_cheese_sandwich");
    public static final DeferredBlock<Block> ED_PLATED_CRANBERRY_GOAT_CHEESE_TOAST = createPlatedBlock("ed_plated_cranberry_goat_cheese_toast");
    public static final DeferredBlock<Block> ERD_PLATED_UNCANNY_COOKIES = createStackablePlatedBlock("erd_plated_uncanny_cookies",4);
    public static final DeferredBlock<Block> ERD_PLATED_CRISPY_SKEWER = createStackablePlatedBlock("erd_plated_crispy_skewer",3);
    public static final DeferredBlock<Block> ERD_PLATED_STRANGE_ECLAIR = createStackablePlatedBlock("erd_plated_strange_eclair",3);
    public static final DeferredBlock<Block> ERD_PLATED_CRAWLING_SANDWICH = createStackablePlatedBlock("erd_plated_crawling_sandwich",2);
    public static final DeferredBlock<Block> EDD_PLATED_STUFFED_RICE_CAKE = createStackablePlatedBlock("edd_plated_stuffed_rice_cake",3);
    public static final DeferredBlock<Block> EDD_PLATED_CHORUS_FLOWER_PIE = createPlatedBlock("edd_plated_chorus_flower_pie");
    public static final DeferredBlock<Block> EDD_PLATED_ENDER_BAMBOO_RICE = createStackablePlatedBlock("edd_plated_ender_bamboo_rice",2);
    public static final DeferredBlock<Block> EDD_PLATED_CHORUS_FRUIT_POPSICLE = createStackablePlatedBlock("edd_plated_chorus_fruit_popsicle",2);
    public static final DeferredBlock<Block> EDD_PLATED_END_BARBECUE_STICK = createStackablePlatedBlock("edd_plated_end_barbecue_stick",3);

    public static final DeferredBlock<Block> MND_PLATED_STUFFED_PEPPER = createStackablePlatedBlock("mnd_plated_stuffed_pepper",2);
    public static final DeferredBlock<Block> MND_PLATED_HOTDOG_WITH_MIXED_SALAD = createStackablePlatedBlock("mnd_plated_hotdog_with_mixed_salad",2);
    public static final DeferredBlock<Block> MND_PLATED_HOTDOG_WITH_NETHER_SALAD = createStackablePlatedBlock("mnd_plated_hotdog_with_nether_salad",2);
    public static final DeferredBlock<Block> MND_PLATED_CHILIDOG = createFieryStackablePlatedBlock("mnd_plated_chilidog",2);
    public static final DeferredBlock<Block> MND_PLATED_SPICY_COTTON = createPlatedBlock("mnd_plated_spicy_cotton");
    public static final DeferredBlock<Block> MND_PLATED_FRIES_GHASTA = createStackablePlatedBlock("mnd_plated_fries_ghasta",2);
    public static final DeferredBlock<Block> MND_PLATED_SPICY_SKEWER = createStackablePlatedBlock("mnd_plated_spicy_skewer",2);
    public static final DeferredBlock<Block> MND_PLATED_RED_LOIN_ON_A_STICK = createStackablePlatedBlock("mnd_plated_red_loin_on_a_stick",3);
    public static final DeferredBlock<Block> MND_PLATED_NETHER_BURGER = createPlatedBlock("mnd_plated_nether_burger");
    public static final DeferredBlock<Block> MND_PLATED_BACON_WRAPPED_SAUSAGE_STICK = createStackablePlatedBlock("mnd_plated_bacon-wrapped_sausage_on_a_stick",2);

    private static BlockBehaviour.Properties baseProps(){
        return BlockBehaviour.Properties.of().noOcclusion()
                .noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN);
    }

    private static DeferredBlock<Block> createFieryStackablePlatedBlock(String name,int maxStacks){
        return  REGISTRY.register(name,
                ()->new FieryPlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD),maxStacks));
    }
    private static DeferredBlock<Block> createStackablePlatedBlock(String name,int maxStacks){
        return  REGISTRY.register(name,
                ()->new StackablePlateFoodBlock(baseProps()
                        .sound(SoundType.WOOD),maxStacks));
    }
    private static DeferredBlock<Block> createPlatedBlock(String name){
        return  REGISTRY.register(name,
                ()->new SimplePlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }
    public static Block[] getAll() {
        return new Block[]{
                PLATED_DUMPLINGS.get(),
                PLATED_HAMBURGER.get(),
                PLATED_BARBECUE_STICK.get(),
                PLATED_CHICKEN_SANDWICH.get(),
                PLATED_EGG_SANDWICH.get(),
                PLATED_KELP_ROLL.get(),
                PLATED_MELON_POPSICLE.get(),
                PLATED_STUFFED_POTATO.get(),
                PLATED_MUTTON_WRAP.get(),
                PLATED_BACON_SANDWICH.get(),
                PLATED_CABBAGE_ROLL.get(),
                PLATED_COD_ROLL.get(),
                PLATED_KELP_ROLL_SLICE.get(),
                PLATED_SALMON_ROLL.get(),

                PLATED_SWEET_BERRY_COOKIE.get(),
                PLATED_HONEY_COOKIE.get(),PLATED_COOKIE.get(),PLATED_PUMPKIN_PIE.get(),

                CD_GRILLED_CORN.get(),CD_CLASSIC_CORN_DOG.get(),
                CD_TACO.get(),

                ED_PEANUT_BUTTER_SANDWICH.get(),
                ED_CHEESE_SANDWICH.get(),
                ED_PEANUT_BUTTER_AND_HONEY_SANDWICH.get(),
                ED_GLOW_BERRY_JELLY_SANDWICH.get(),
                ED_SWEET_BERRY_JELLY_SANDWICH.get(),
                ED_GRILLED_CHEESE.get(),ED_CHOCOLATE_COOKIE.get(),
                ED_SNICKERDOODLE.get(),ED_SUGAR_COOKIE.get(),
                ED_SWEET_ROLL.get(),ED_GLOW_BERRY_SWEET_ROLL.get(),ED_BERRY_SWEET_ROLL.get(),

                DF_SMORE.get(),DF_CHEESEBURGER.get(),DF_DELUXE_CHEESEBURGER.get(),
                DF_NUT_BUTTER_AND_JELLY_SANDWICH.get(),DF_COOKED_MARSHMELLOW_STICK.get(),DF_CANTALOUPE_BREAD.get(),DF_WRAPPED_CANTALOUPE.get(),
                DF_CANTALOUPE_POPSICLE.get(),

                OD_COOKED_STUFFED_COD.get(),OD_HONEY_FRIED_KELP.get(),OD_ELDER_GUARDIAN_ROLL.get(),
                OD_FUGU_ROLL.get(),OD_BACKED_TENTACLE_ON_A_STICK.get(),
                AD_BISON_BURGER.get(), AD_BUNFUNBUS_SANDWICH.get(), AD_GONGYLIDIA_BRUSCHETTA.get(),

                CTD_ELOTE.get(),CTD_EMPANADA.get(),CTD_BEEF_BURITO.get(),CTD_MUTTON_SANDWICH.get(),CTD_EGGPLANT_BURGER.get(),CTD_AVOCADO_TOAST.get(),
                CTD_CHICKEN_TACO.get(),CTD_PORK_WRAP.get(),CTD_FISH_TACO.get(),CTD_CHICKEN_ROLL.get(),CTD_MIDORI_ROLL.get(),
                CTD_CHICKEN_ROLL_SLICE.get(),CTD_MIDORI_ROLL_SLICE.get(),CTD_PUFFERFISH_ROLL.get(),CTD_TROPICAL_ROLL.get(),
                CTD_RICE_BALL.get(),CTD_EGG_ROLL.get(),CTD_CALAMARI_ROLL.get(),

                ACD_PLATED_CATFISH_BARBECUE.get(),BNC_PLATED_HAM_AND_CHEESE_SANDWICH.get(),ED_PLATED_CRANBERRY_GOAT_CHEESE_TOAST.get(),ERD_PLATED_UNCANNY_COOKIES.get(),
                ERD_PLATED_CRISPY_SKEWER.get(),ERD_PLATED_STRANGE_ECLAIR.get(),ERD_PLATED_CRAWLING_SANDWICH.get(),EDD_PLATED_STUFFED_RICE_CAKE.get(),EDD_PLATED_CHORUS_FLOWER_PIE.get(),
                EDD_PLATED_ENDER_BAMBOO_RICE.get(),EDD_PLATED_CHORUS_FRUIT_POPSICLE.get(),EDD_PLATED_END_BARBECUE_STICK.get(),MND_PLATED_STUFFED_PEPPER.get(),MND_PLATED_HOTDOG_WITH_MIXED_SALAD.get(),
                MND_PLATED_HOTDOG_WITH_NETHER_SALAD.get(),MND_PLATED_CHILIDOG.get(),MND_PLATED_SPICY_COTTON.get(),MND_PLATED_FRIES_GHASTA.get(),MND_PLATED_SPICY_SKEWER.get(),
                MND_PLATED_RED_LOIN_ON_A_STICK.get(),MND_PLATED_NETHER_BURGER.get(),MND_PLATED_BACON_WRAPPED_SAUSAGE_STICK.get()

        };
    };

}
