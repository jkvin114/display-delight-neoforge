package com.jkvin114.displaydelight.block;

import com.jkvin114.displaydelight.blockentity.ShowcaseBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ShowcaseBlock extends Block implements EntityBlock {

    public ShowcaseBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new ShowcaseBlockEntity(blockPos,blockState);
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos,
                              BlockState state, @Nullable BlockEntity be,
                              ItemStack tool) {
        if (!level.isClientSide && be instanceof ShowcaseBlockEntity myBE) {
            BlockState storedState = myBE.getStoredState();

            if (!storedState.isAir()) {
                List<ItemStack> drops = Block.getDrops(
                        storedState,
                        (ServerLevel) level,
                        pos,              // position of your block entity
                        myBE              // the block entity itself (for loot context, can be null)
                );
                for(ItemStack drop :drops){
                    // This bypasses creative mode suppression
                    Block.popResource(level, pos, drop);
                }
            }
        }

        super.playerDestroy(level, player, pos, state, be, tool);
    }
/*
    @Override
    protected @NotNull List<ItemStack> getDrops(BlockState state, LootParams.Builder params){
        List<ItemStack> droppedStacks = super.getDrops(state, params);
        BlockEntity blockEntity = params.getOptionalParameter(LootContextParams.BLOCK_ENTITY);

        // Get the level and position via ORIGIN parameter
        Vec3 origin = params.getParameter(LootContextParams.ORIGIN);
        BlockPos pos = BlockPos.containing(origin);


        // Cast to your specific block entity type safely
        if (blockEntity instanceof ShowcaseBlockEntity myBE) {
            BlockState storedState = myBE.getStoredState();
            // do whatever with it
            List<ItemStack> drops = Block.getDrops(
                    storedState,
                    (ServerLevel) params.getLevel(),
                    pos,              // position of your block entity
                    myBE              // the block entity itself (for loot context, can be null)
            );
            droppedStacks.addAll(drops);
        }

        return droppedStacks;



    }
    */

}
