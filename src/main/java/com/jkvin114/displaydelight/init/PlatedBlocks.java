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
   // public static final DeferredBlock<Block> PLATED_CAKE_SLICE =  createStackablePlatedBlock("plated_cake_slice",4);

    public static final DeferredBlock<Block> PLATED_COD_ROLL= createStackablePlatedBlock("plated_cod_roll",6);
    public static final DeferredBlock<Block> PLATED_KELP_ROLL_SLICE= createStackablePlatedBlock("plated_kelp_roll_slice",6);
    public static final DeferredBlock<Block> PLATED_SALMON_ROLL= createStackablePlatedBlock("plated_salmon_roll",6);

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
            //    PLATED_CAKE_SLICE.get(),
                PLATED_COD_ROLL.get(),
                PLATED_KELP_ROLL_SLICE.get(),
                PLATED_SALMON_ROLL.get()
        };
    };

}
