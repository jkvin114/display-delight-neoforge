package com.jkvin114.displaydelight.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class FoodBlock extends AbstractItemBlock {
    public static final MapCodec<FoodBlock> CODEC = simpleCodec(FoodBlock::new);

    public FoodBlock(BlockBehaviour.Properties props) {
        super(props);
    }

    @Override
    public MapCodec<FoodBlock> codec() {
        return CODEC;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(3, 0, 3, 13, 6, 13);
    }
}
