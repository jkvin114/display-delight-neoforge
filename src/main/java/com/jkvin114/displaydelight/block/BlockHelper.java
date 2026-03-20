package com.jkvin114.displaydelight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;

public class BlockHelper {

    protected static boolean needSupport(LevelAccessor level, BlockPos current){

        BlockState stateBelow = level.getBlockState(current.below());

        if(stateBelow.isAir()) return true;

        if(stateBelow.getBlock() instanceof  AbstractItemBlock) return  true;

        if(stateBelow.getBlock() instanceof  StairBlock && stateBelow.getValue(StairBlock.HALF) == Half.BOTTOM){
            return  false;
        }
        return !stateBelow.isFaceSturdy(level, current.below(), Direction.UP, SupportType.CENTER);
    }

    protected static boolean needSupport(LevelAccessor level,BlockPos below,BlockState stateBelow){
        if(stateBelow.isAir()) return true;

        if(stateBelow.getBlock() instanceof  AbstractItemBlock) return  true;

        if(stateBelow.getBlock() instanceof  StairBlock && stateBelow.getValue(StairBlock.HALF) == Half.BOTTOM){
            return  false;
        }
        return !stateBelow.isFaceSturdy(level, below, Direction.UP, SupportType.CENTER);
    }

}
