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

    //public static final DeferredBlock<Block> BOWL = createFoodBlock("bowl",SoundType.WOOD);

    public static final DeferredBlock<Block> CAKE_SLICE = createPieSliceFoodBlock("cake_slice");
    public static final DeferredBlock<Block> APPLE_PIE_SLICE = createPieSliceFoodBlock("apple_pie_slice");
    public static final DeferredBlock<Block> SWEET_BERRY_CHEESECAKE_SLICE = createPieSliceFoodBlock("sweet_berry_cheesecake_slice");
    public static final DeferredBlock<Block> CHOCOLATE_PIE_SLICE = createPieSliceFoodBlock("chocolate_pie_slice");
    public static final DeferredBlock<Block> FRUIT_SALAD = createFoodBlock("fruit_salad",SoundType.WOOD);
    public static final DeferredBlock<Block> MELON_POPSICLE = createFoodBlock("melon_popsicle",SoundType.CANDLE);
    public static final DeferredBlock<Block> GLOW_BERRY_CUSTARD = createDrinkFoodBlock("glow_berry_custard");
    public static final DeferredBlock<Block> BARBECUE_STICK = createFoodBlock("barbecue_stick",SoundType.WOOD);
    public static final DeferredBlock<Block> EGG_SANDWICH = createFoodBlock("egg_sandwich",SoundType.WOOL);
    public static final DeferredBlock<Block> CHICKEN_SANDWICH = createFoodBlock("chicken_sandwich",SoundType.WOOL);
    public static final DeferredBlock<Block> HAMBURGER = createFoodBlock("hamburger",SoundType.WOOL);
    public static final DeferredBlock<Block> DUMPLINGS = createFoodBlock("dumplings",SoundType.WOOL);



    public static final DeferredBlock<Block> BACON_SANDWICH = createFoodBlock("bacon_sandwich",SoundType.WOOL);
    public static final DeferredBlock<Block> MUTTON_WRAP = createFoodBlock("mutton_wrap",SoundType.WOOL);
    public static final DeferredBlock<Block> STUFFED_POTATO = createFoodBlock("stuffed_potato",SoundType.FROGSPAWN);
    public static final DeferredBlock<Block> CABBAGE_ROLLS = createFoodBlock("cabbage_rolls",SoundType.FROGSPAWN);
    public static final DeferredBlock<Block> SALMON_ROLL = createFoodBlock("salmon_roll",SoundType.FROGSPAWN);
    public static final DeferredBlock<Block> COD_ROLL = createFoodBlock("cod_roll",SoundType.FROGSPAWN);
    public static final DeferredBlock<Block> KELP_ROLL = createFoodBlock("kelp_roll",SoundType.WET_GRASS);
    public static final DeferredBlock<Block> KELP_ROLL_SLICE = createFoodBlock("kelp_roll_slice",SoundType.WET_GRASS);
    public static final DeferredBlock<Block> NETHER_SALAD = createFoodBlock("nether_salad",SoundType.WOOD);

    public static final DeferredBlock<Block> COOKED_RICE = createFoodBlock("cooked_rice",SoundType.WOOD);
    public static final DeferredBlock<Block> MIXED_SALAD = createFoodBlock("mixed_salad",SoundType.WOOD);
    public static final DeferredBlock<Block> BEEF_STEW = createFoodBlock("beef_stew",SoundType.WOOD);
    public static final DeferredBlock<Block> CHICKEN_SOUP = createFoodBlock("chicken_soup",SoundType.WOOD);
    public static final DeferredBlock<Block> VEGETABLE_SOUP = createFoodBlock("vegetable_soup",SoundType.WOOD);
    public static final DeferredBlock<Block> FISH_STEW = createFoodBlock("fish_stew",SoundType.WOOD);
    public static final DeferredBlock<Block> FRIED_RICE = createFoodBlock("fried_rice",SoundType.WOOD);
    public static final DeferredBlock<Block> PUMPKIN_SOUP = createFoodBlock("pumpkin_soup",SoundType.WOOD);
    public static final DeferredBlock<Block> BAKED_COD_STEW = createFoodBlock("baked_cod_stew",SoundType.WOOD);
    public static final DeferredBlock<Block> NOODLE_SOUP = createFoodBlock("noodle_soup",SoundType.WOOD);
    public static final DeferredBlock<Block> BONE_BROTH = createFoodBlock("bone_broth",SoundType.WOOD);
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
    public static final DeferredBlock<Block> ROAST_CHICKEN = createFoodBlock("roast_chicken",SoundType.WOOD);
    public static final DeferredBlock<Block> STUFFED_PUMPKIN = createFoodBlock("stuffed_pumpkin",SoundType.WOOD);
    public static final DeferredBlock<Block> HONEY_GLAZED_HAM = createFoodBlock("honey_glazed_ham",SoundType.WOOD);
    public static final DeferredBlock<Block> SHEPHEREDS_PIE = createFoodBlock("shepherds_pie",SoundType.WOOD);
    public static final DeferredBlock<Block> DOG_FOOD = createFoodBlock("dog_food",SoundType.WOOD);
    public static final DeferredBlock<Block> HORSE_FEED = createFoodBlock("horse_feed",SoundType.CROP);
    public static final DeferredBlock<Block> APPLE_CIDER = createDrinkFoodBlock("apple_cider");
    public static final DeferredBlock<Block> MELON_JUICE = createDrinkFoodBlock("melon_juice");
    public static final DeferredBlock<Block> HOT_COCOA = createDrinkFoodBlock("hot_cocoa");


    public static Block[] getAll() {
        return new Block[]{
             //   CAKE_SLICE.get(), APPLE_PIE_SLICE.get(), SWEET_BERRY_CHEESECAKE_SLICE.get(), CHOCOLATE_PIE_SLICE.get(),
                FRUIT_SALAD.get(), MELON_POPSICLE.get(), GLOW_BERRY_CUSTARD.get(), BARBECUE_STICK.get(), EGG_SANDWICH.get(),
                CHICKEN_SANDWICH.get(), HAMBURGER.get(), DUMPLINGS.get(),COOKED_RICE.get(), MIXED_SALAD.get(),
                //BACON_SANDWICH.get(), MUTTON_WRAP.get(), STUFFED_POTATO.get(),
                //CABBAGE_ROLLS.get(), SALMON_ROLL.get(), COD_ROLL.get(), KELP_ROLL.get(),KELP_ROLL_SLICE.get(),
                //NETHER_SALAD.get(),

                BEEF_STEW.get(), CHICKEN_SOUP.get(), VEGETABLE_SOUP.get(), FISH_STEW.get(), FRIED_RICE.get(), PUMPKIN_SOUP.get(),
                BAKED_COD_STEW.get(), NOODLE_SOUP.get(), BONE_BROTH.get(), BACON_AND_EGGS.get(), PASTA_WITH_MEATBALLS.get(),
                PASTA_WITH_MUTTON_CHOP.get(), ROASTED_MUTTON_CHOPS.get(), STEAK_AND_POTATOES.get(), VEGETABLE_NOODLES.get(), RATATOUILLE.get(),
                SQUID_INK_PASTA.get(), GRILLED_SALMON.get(), MUSHROOM_RICE.get(), ROAST_CHICKEN.get(), STUFFED_PUMPKIN.get(), HONEY_GLAZED_HAM.get(),
                SHEPHEREDS_PIE.get(), DOG_FOOD.get(), HORSE_FEED.get(), APPLE_CIDER.get(), MELON_JUICE.get(), HOT_COCOA.get(),
        };
    }
    private  static BlockBehaviour.Properties baseProps(){
      return   BlockBehaviour.Properties.of().noOcclusion().noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.NONE);
    }
    private static DeferredBlock<Block> createPieSliceFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new FoodBlock(
                        baseProps().sound(SoundType.WOOL)));
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
    private static DeferredBlock<Block> createFoodBlock(String name,SoundType soundType){
        return  REGISTRY.register(name,
                ()->new FoodBlock(baseProps()
                        .sound(soundType)));
    }
}
