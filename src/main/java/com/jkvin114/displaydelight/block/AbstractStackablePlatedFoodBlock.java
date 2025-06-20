package com.jkvin114.displaydelight.block;

import com.jkvin114.displaydelight.init.BlockAssociations;
import com.jkvin114.displaydelight.init.DisplayBlocks;
import com.jkvin114.displaydelight.init.DisplayProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class AbstractStackablePlatedFoodBlock extends AbstractItemBlock {
    public static final IntegerProperty STACKS = DisplayProperties.STACKS;

    public AbstractStackablePlatedFoodBlock(BlockBehaviour.Properties props) {
        super(props);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(STACKS, 6));
    }

    public BlockState getStateFrom(BlockState plate,Direction direction,int count) {
        if (plate.is(DisplayBlocks.PLATE.get())) {
            return this.defaultBlockState().setValue(FACING, direction.getOpposite()).setValue(STACKS, Math.min(count,getMaxStackable()));
        } else return this.defaultBlockState();
    }
    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader world, BlockPos pos, Player player) {
        return this.getStackFor();
    }

    public ItemStack getStackFor() {
        return new ItemStack(BlockAssociations.getPlatedItemFor(this));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(STACKS);
    }

    public int getStacks(BlockState state) {
        return state.getValue(STACKS);
    }
    public BlockState getDecrementedState(BlockState state) {
        return state.setValue(STACKS, Math.max(this.getStacks(state) - 1,1));
    }

    public BlockState getIncrementedState(BlockState state,int count) {
        return state.setValue(STACKS, Math.min(this.getStacks(state) +count,this.getMaxStackable()));
    }

    public abstract int getMaxStackable();

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(1, 0, 1, 15, 6, 15);
    }
}