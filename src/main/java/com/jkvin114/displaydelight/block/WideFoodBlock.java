package com.jkvin114.displaydelight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WideFoodBlock extends  FoodBlock {

    public WideFoodBlock(Properties props) {
        super(props);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
      //  if(state.getValue(AbstractItemBlock.SUPPORT)) return box(0,0,0,16,16,16);
        return box(1, 0, 1, 15, 4, 15);
    }
}
