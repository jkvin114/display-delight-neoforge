package com.jkvin114.displaydelight.events;

import com.jkvin114.displaydelight.block.AbstractStackablePlatedFoodBlock;
import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;
import com.jkvin114.displaydelight.init.BlockAssociations;
import com.jkvin114.displaydelight.init.DisplayBlocks;
import com.jkvin114.displaydelight.init.DisplayConfig;
import com.jkvin114.displaydelight.init.DisplayTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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

import java.util.HashSet;
import java.util.Set;

public class InterationManager {
    public static boolean tryTakeItemWithBareHand(Player player, ServerLevel world, BlockHitResult rez) {
        InteractionHand handy = InteractionHand.MAIN_HAND;

        BlockPos pos = rez.getBlockPos();
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() instanceof AbstractStackablePlatedFoodBlock target) {
            Item plateItem = BlockAssociations.getPlatedItemFor(target);
            int count = 1;
            if(player.isShiftKeyDown()){
                count = target.getStacks(state);
                world.setBlock(pos, DisplayBlocks.PLATE.get().defaultBlockState(), 2);
            }
            else{

                if (target.getStacks(state) > 1) {

                    BlockState newState = target.getDecrementedState(state);
                    world.setBlock(pos, newState, 2);
                } else {

                    world.setBlock(pos, DisplayBlocks.PLATE.get().defaultBlockState(), 2);
                }
            }
            world.playSound(null, pos, SoundEvents.CHICKEN_EGG, SoundSource.PLAYERS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
            // player.setItemInHand(handy, new ItemStack(plateItem,count));
           // player.getInventory().add(new ItemStack(plateItem,count));

            HashSet<Item> set = new HashSet<>();
            set.add(plateItem);

            if(player.getInventory().hasAnyOf(set)){
                player.getInventory().add(new ItemStack(plateItem,count));
            }
            else{
                player.setItemInHand(handy, new ItemStack(plateItem,count));
            }

            player.swing(handy, true);
            return true;
        }
        else if(state.getBlock() instanceof SmallPlatedFoodBlock target){
            Item plateItem = BlockAssociations.getSmallPlatedItemFor(target);
            world.setBlock(pos, DisplayBlocks.SMALL_PLATE.get().defaultBlockState(), 2);

            world.playSound(null, pos, SoundEvents.CHICKEN_EGG, SoundSource.PLAYERS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
            HashSet<Item> set = new HashSet<>();
            set.add(plateItem);

            if(player.getInventory().hasAnyOf(set)){
                player.getInventory().add(new ItemStack(plateItem,1));
            }
            else{
                player.setItemInHand(handy, new ItemStack(plateItem,1));
            }

            player.swing(handy, true);
            return true;
        }

        return false;
    }

    public static boolean tryPlaceItemOnSmallPlate(Player player, ServerLevel world, BlockHitResult rez, boolean isMainHand) {
        InteractionHand handy = (isMainHand ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
        ItemStack stack = player.getItemInHand(handy);
        if (!stack.is(DisplayTags.SMALL_PLATE_DISPLAYABLE)) return false;

        BlockPos pos = rez.getBlockPos();
        BlockState state = world.getBlockState(pos);

        if (!state.is(DisplayBlocks.SMALL_PLATE.get())) return false;

        Block plateBlock = BlockAssociations.getSmallPlateBlockFor(stack.getItem());
        if (!(plateBlock instanceof SmallPlatedFoodBlock food)) return false;

        UseOnContext ctx = new UseOnContext(player, handy, rez);
        BlockState newstate = food.getStateFrom(state, ctx.getHorizontalDirection());
        world.setBlock(pos, newstate, 2);
        world.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
        if (!player.isCreative()) {
            stack.shrink(1);
        }
        player.swing(handy, true);

        return true;
    }
    public static boolean tryPlaceItemOnPlate(Player player, ServerLevel world, BlockHitResult rez, boolean isMainHand) {
        InteractionHand handy = (isMainHand ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
        ItemStack handStack = player.getItemInHand(handy);
        if (!handStack.is(DisplayTags.PLATE_DISPLAYABLE)) return false;

        BlockPos pos = rez.getBlockPos();
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() instanceof AbstractStackablePlatedFoodBlock target) {

            if (handStack.is(target.getStackFor().getItem()) && target.getStacks(state) < target.getMaxStackable()) {
                int count = 1;
                if (player.isShiftKeyDown()) {
                    int stacksLeft = target.getMaxStackable() - target.getStacks(state);
                    count = player.isCreative() ? stacksLeft : Math.min(stacksLeft, handStack.getCount());
                }
                world.setBlock(pos, target.getIncrementedState(state, count), 2);
                world.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
                if (!player.isCreative()) {
                    handStack.shrink(count);
                }
                player.swing(handy, true);
                return true;
            }
        } else if (state.is(DisplayBlocks.PLATE.get())) {
            Block plateBlock = BlockAssociations.getPlateBlockFor(handStack.getItem());
            if (!(plateBlock instanceof AbstractStackablePlatedFoodBlock target)) return false;
            int count = 1;

            if (player.isShiftKeyDown()) {
                int stacksLeft = target.getMaxStackable();
                count = player.isCreative() ? stacksLeft : Math.min(stacksLeft, handStack.getCount());
            }

            UseOnContext ctx = new UseOnContext(player, handy, rez);
            BlockState newstate = target.getStateFrom(state, ctx.getHorizontalDirection(), count);

            world.setBlock(pos, newstate, 2);
            world.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
            if (!player.isCreative()) {
                handStack.shrink(count);
            }
            player.swing(handy, true);
            return true;
        }

        return false;
    }

    public static boolean tryPlaceItem(Player player, ServerLevel world, BlockHitResult rez, boolean isMainHand) {
        InteractionHand handy = (isMainHand ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
        ItemStack stack = player.getItemInHand(handy);
        if (!stack.is(DisplayTags.DISPLAYABLE)) return false;
        BlockPos pos = rez.getBlockPos();

        if (player.isShiftKeyDown()) {

            Block target = BlockAssociations.getBlockFor(stack.getItem());
            if (target.asItem().useOn(new UseOnContext(player, handy, rez)) == InteractionResult.CONSUME) {
                world.playSound(null, pos.above(), target.defaultBlockState().getSoundType(world, pos.above(), player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
                player.swing(handy, true);
                return true;
            }

        } else if(world.getBlockState(pos).isFaceSturdy(world,pos, Direction.UP) && rez.getDirection() == Direction.UP) {
            if (DisplayConfig.MESSAGE.get())
                player.displayClientMessage(Component.translatable("item.displaydelight.tooltip.displayable"), true);
        }

        return false;
    }
}
