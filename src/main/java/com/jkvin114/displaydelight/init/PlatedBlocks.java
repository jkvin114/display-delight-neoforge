package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
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

    private static BlockBehaviour.Properties baseProps(){
        return BlockBehaviour.Properties.of().noOcclusion()
                .noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN);
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
                OD_FUGU_ROLL.get(),OD_BACKED_TENTACLE_ON_A_STICK.get()

        };
    };

}
