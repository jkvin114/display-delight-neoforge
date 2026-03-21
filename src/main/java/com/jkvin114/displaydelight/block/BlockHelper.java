package com.jkvin114.displaydelight.block;

import com.jkvin114.displaydelight.init.DisplayTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;

import static net.minecraft.world.level.block.SlabBlock.TYPE;
import static net.minecraft.world.level.block.TrapDoorBlock.OPEN;

public class BlockHelper {

    protected static boolean needSupport(LevelAccessor level, BlockPos current){

        BlockState stateBelow = level.getBlockState(current.below());

        if(stateBelow.is(DisplayTags.SUPPORT_EXCEPTIONS)){
            return  false;
        }

        if(stateBelow.getBlock() instanceof  TrapDoorBlock && stateBelow.getValue(OPEN)) return  false;

        if(stateBelow.getBlock() instanceof  AbstractItemBlock) return  true;
        return !stateBelow.isFaceSturdy(level, current.below(), Direction.UP, SupportType.CENTER);
    }

    protected static boolean needSupport(LevelAccessor level,BlockPos below,BlockState stateBelow){

        if(stateBelow.is(DisplayTags.SUPPORT_EXCEPTIONS)){
            return  false;
        }

        if(stateBelow.getBlock() instanceof  TrapDoorBlock && stateBelow.getValue(OPEN)) return  false;

        if(stateBelow.getBlock() instanceof  AbstractItemBlock) return  true;
        return !stateBelow.isFaceSturdy(level, below, Direction.UP, SupportType.CENTER);
    }

}
