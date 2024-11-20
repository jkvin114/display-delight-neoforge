package com.jkvin114.displaydelight.events;

import com.jkvin114.displaydelight.block.AbstractStackablePlatedFoodBlock;
import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;
import com.jkvin114.displaydelight.init.BlockAssociations;
import com.jkvin114.displaydelight.init.DisplayBlocks;
import com.jkvin114.displaydelight.init.DisplayTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class InterationManager {
    public static boolean tryTakeItem(Player player, ServerLevel world, BlockHitResult rez, ItemStack itemStack) {
        InteractionHand handy = InteractionHand.MAIN_HAND;

        BlockPos pos = rez.getBlockPos();
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() instanceof AbstractStackablePlatedFoodBlock target) {
            Item plateItem = BlockAssociations.getPlatedItemFor(target);
            if (itemStack.isEmpty() ||
                    (plateItem.equals(itemStack.getItem()) && itemStack.getCount() < plateItem.getDefaultMaxStackSize())) {

                if (target.getStacks(state) > 1) {
                    BlockState newState = target.getDecrementedState(state);
                    world.setBlock(pos, newState, 2);
                } else {

                    world.setBlock(pos, DisplayBlocks.PLATE.get().defaultBlockState(), 2);
                }
                world.playSound(null, pos, SoundEvents.CHICKEN_EGG, SoundSource.PLAYERS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));

                if (itemStack.isEmpty()) {
                    player.setItemInHand(handy, new ItemStack(plateItem));
                } else {
                    itemStack.grow(1);
                }

                player.swing(handy, true);
                return true;
            } else {
                player.displayClientMessage(Component.literal("Use your bare hand or hold same item to take the item"), true);
            }

        }

        return false;
    }

    public static boolean tryPlaceItemOnSmallPlate(Player player, ServerLevel world, BlockHitResult rez, boolean isMainHand) {
        InteractionHand handy = (isMainHand ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
        ItemStack stack = player.getItemInHand(handy);
        if (stack.is(DisplayTags.SMALL_PLATE_DISPLAYABLE)) {
            BlockPos pos = rez.getBlockPos();
            BlockState state = world.getBlockState(pos);

            if (!state.is(DisplayBlocks.SMALL_PLATE.get())) return false;

            Block plateBlock = BlockAssociations.getSmallPlateBlockFor(stack.getItem());
            if (!(plateBlock instanceof SmallPlatedFoodBlock food)) return false;

            UseOnContext ctx = new UseOnContext(player, handy, rez);
            BlockState newstate = food.getStateFrom(state,ctx.getHorizontalDirection());
            world.setBlock(pos, newstate, 2);
            world.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
            if (!player.isCreative()) {
                stack.shrink(1);
            }
            player.swing(handy, true);
            return true;

        }
        return false;
    }
    public static boolean tryPlaceItemOnPlate(Player player, ServerLevel world, BlockHitResult rez, boolean isMainHand) {
        InteractionHand handy = (isMainHand ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
        ItemStack stack = player.getItemInHand(handy);
        if (stack.is(DisplayTags.PLATE_DISPLAYABLE)) {
            BlockPos pos = rez.getBlockPos();
            BlockState state = world.getBlockState(pos);
            if (state.getBlock() instanceof AbstractStackablePlatedFoodBlock target) {

                if (stack.is(target.getStackFor().getItem()) && target.getStacks(state) < target.getMaxStackable()) {
                    world.setBlock(pos, target.getIncrementedState(state), 2);
                    world.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
                    if (!player.isCreative()) {
                        stack.shrink(1);
                    }
                    player.swing(handy, true);
                    return true;
                }
            } else if (state.is(DisplayBlocks.PLATE.get())) {
                Block plateBlock = BlockAssociations.getPlateBlockFor(stack.getItem());
                if (!(plateBlock instanceof AbstractStackablePlatedFoodBlock food)) return false;
                UseOnContext ctx = new UseOnContext(player, handy, rez);
                BlockState newstate = food.getStateFrom(state,ctx.getHorizontalDirection());

                world.setBlock(pos, newstate, 2);
                world.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
                if (!player.isCreative()) {
                    stack.shrink(1);
                }
                player.swing(handy, true);
                return true;
            }

        }
        return false;
    }

    public static boolean tryPlaceItem(Player player, ServerLevel world, BlockHitResult rez, boolean isMainHand) {
        InteractionHand handy = (isMainHand ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
        ItemStack stack = player.getItemInHand(handy);
        if (stack.is(DisplayTags.DISPLAYABLE)) {
            if (player.isCrouching()) {
                    BlockPos pos = rez.getBlockPos();
                    Block target = BlockAssociations.getBlockFor(stack.getItem());
                    if (target.asItem().useOn(new UseOnContext(player, handy, rez)) == InteractionResult.CONSUME) {
                        world.playSound(null, pos.above(), target.defaultBlockState().getSoundType(world, pos.above(), player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
                        player.swing(handy, true);
                        return true;
                    }

            } else {
                player.displayClientMessage(Component.literal("Hold shift to place the item"), true);
            }
        }
        return false;
    }
}
