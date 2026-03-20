package com.jkvin114.displaydelight.block;

import com.jkvin114.displaydelight.init.DisplayProperties;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import static com.jkvin114.displaydelight.block.BlockHelper.needSupport;

public class EmptySmallPlateBlock  extends Block {
    public static final MapCodec<EmptySmallPlateBlock> CODEC = simpleCodec(EmptySmallPlateBlock::new);
    public static final BooleanProperty SUPPORT = DisplayProperties.SUPPORT;
    public EmptySmallPlateBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(SUPPORT, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SUPPORT);
    }
    @Override
    protected MapCodec<? extends Block> codec() {
        return CODEC;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return  true;
        //return world.getBlockState(pos.below()).isFaceSturdy(world, pos.below(), Direction.UP, SupportType.CENTER);
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();

        return this.defaultBlockState()
                .setValue(SUPPORT,needSupport(level,context.getClickedPos()));
    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, Direction direction,
                                           BlockState neighborState, LevelAccessor level,
                                           BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.DOWN) {
            return state.setValue(SUPPORT, needSupport(level,neighborPos,neighborState));
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(4, 0, 4, 12, 2, 12);
    }
}
