package com.jkvin114.displaydelight.block.fiery;

import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class FierySmallPlatedFoodBlock extends SmallPlatedFoodBlock {
    public FierySmallPlatedFoodBlock(Properties props) {
        super(props);
    }
    @Override
    public void animateTick(BlockState stateIn, Level level, BlockPos pos, RandomSource rand) {
        super.animateTick(stateIn, level, pos, rand);
        RandomSource random = level.random;
        if (random.nextFloat() < 0.25F) {
            double x = (double) pos.getX() + 0.5D + (random.nextDouble() * 0.5D - 0.25D);
            double y = (double) pos.getY() + 0.35D;
            double z = (double) pos.getZ() + 0.5D + (random.nextDouble() * 0.5D - 0.25D);
            level.addParticle(ParticleTypes.FLAME, x, y, z, 0.0D, 0.0D, 0.0D);

            //   double x1 = (double) pos.getX() + 0.5D;
            //   double y1 = pos.getY();
            //   double z1 = (double) pos.getZ() + 0.5D;
        }
    }
}
