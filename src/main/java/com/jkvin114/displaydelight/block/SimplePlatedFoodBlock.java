package com.jkvin114.displaydelight.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SimplePlatedFoodBlock extends AbstractStackablePlatedFoodBlock{
    public static final MapCodec<SimplePlatedFoodBlock> CODEC = simpleCodec(SimplePlatedFoodBlock::new);


    public SimplePlatedFoodBlock(Properties props) {
        super(props);
    }

    @Override
    public MapCodec<SimplePlatedFoodBlock> codec() {
        return CODEC;
    }


    @Override
    public int getMaxStackable() {
        return 1;
    }
}
