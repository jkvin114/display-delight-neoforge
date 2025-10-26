package com.jkvin114.displaydelight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class FieryPlatedFoodBlock extends StackablePlateFoodBlock{
    public FieryPlatedFoodBlock(Properties props, int stacks) {
        super(props, stacks);
    }

    @Override
    public void animateTick(BlockState stateIn, Level level, BlockPos pos, RandomSource rand) {
        super.animateTick(stateIn, level, pos, rand);
        RandomSource random = level.random;
        if (random.nextFloat() < 0.3F) {
            double x = (double) pos.getX() + 0.5D + (random.nextDouble() * 0.7D - 0.35D);
            double y = (double) pos.getY() + 0.45D;
            double z = (double) pos.getZ() + 0.5D + (random.nextDouble() * 0.7D - 0.35D);
            level.addParticle(ParticleTypes.FLAME, x, y, z, 0.0D, 0.0D, 0.0D);

            //   double x1 = (double) pos.getX() + 0.5D;
            //   double y1 = pos.getY();
            //   double z1 = (double) pos.getZ() + 0.5D;
        }
    }
}
