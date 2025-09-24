package com.jkvin114.displaydelight.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.ParticleStatus;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SimpleAnimatedParticle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DrinkBlock extends AbstractItemBlock {
    public DrinkBlock(Properties props) {
        super(props);
    }


    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(4, 0, 4, 12, 10, 12);
    }


}
