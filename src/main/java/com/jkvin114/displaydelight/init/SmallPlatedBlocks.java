package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.SimplePlatedFoodBlock;
import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SmallPlatedBlocks {
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DisplayDelight.MODID);

    public static final DeferredBlock<Block> PLATED_CAKE_SLICE =  createPlatedBlock("small_plated_cake_slice");
    public static final DeferredBlock<Block> PLATED_APPLE_PIE_SLICE=  createPlatedBlock("small_plated_apple_pie_slice");
    public static final DeferredBlock<Block> PLATED_CHOCOLATE_PIE_SLICE =  createPlatedBlock("small_plated_chocolate_pie_slice");
    public static final DeferredBlock<Block> PLATED_SWEET_BERRY_CHEESECAKE_SLICE =  createPlatedBlock("small_plated_sweet_berry_cheesecake_slice");
    public static final DeferredBlock<Block> PLATED_STUFFED_POTATO =  createPlatedBlock("small_plated_stuffed_potato");
    public static final DeferredBlock<Block> PLATED_COD_ROLL =  createPlatedBlock("small_plated_cod_roll");
    public static final DeferredBlock<Block> PLATED_SALMON_ROLL =  createPlatedBlock("small_plated_salmon_roll");
    public static final DeferredBlock<Block> PLATED_KELP_ROLL_SLICE =  createPlatedBlock("small_plated_kelp_roll_slice");
    public static final DeferredBlock<Block> PLATED_CABBAGE_ROLLS =  createPlatedBlock("small_plated_cabbage_rolls");


    //EXPANDED DELIGHT
    public static final DeferredBlock<Block> ED_SWEET_ROLL =  createPlatedBlock("ed_small_plated_sweet_roll");
    public static final DeferredBlock<Block> ED_BERRY_SWEET_ROLL =  createPlatedBlock("ed_small_plated_berry_sweet_roll");
    public static final DeferredBlock<Block> ED_GLOW_BERRY_SWEET_ROLL =  createPlatedBlock("ed_small_plated_glow_berry_sweet_roll");
    public static final DeferredBlock<Block> ED_CHEESE_SLICE =  createPlatedBlock("ed_small_plated_cheese_slice");

    private static BlockBehaviour.Properties baseProps(){
        return BlockBehaviour.Properties.of().noOcclusion()
                .noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN);
    }
    private static DeferredBlock<Block> createPlatedBlock(String name){
        return  REGISTRY.register(name,
                ()->new SmallPlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }public static Block[] getAll() {
        return new Block[]{PLATED_APPLE_PIE_SLICE.get(),PLATED_CAKE_SLICE.get(),
        PLATED_CHOCOLATE_PIE_SLICE.get(),PLATED_SWEET_BERRY_CHEESECAKE_SLICE.get(),
        PLATED_STUFFED_POTATO.get(),PLATED_COD_ROLL.get(),PLATED_SALMON_ROLL.get(),
        PLATED_KELP_ROLL_SLICE.get(),PLATED_CABBAGE_ROLLS.get(),

        ED_SWEET_ROLL.get(),ED_BERRY_SWEET_ROLL.get(),ED_GLOW_BERRY_SWEET_ROLL.get(),ED_CHEESE_SLICE.get()

        };}
}
