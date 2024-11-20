package com.jkvin114.displaydelight.events;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.init.*;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.level.LevelEvent;

import java.awt.event.TextEvent;
import java.util.List;



@EventBusSubscriber(modid = DisplayDelight.MODID)
public class DisplayEvents {


    @SubscribeEvent
    public static void onCheck(PlayerInteractEvent.RightClickBlock event) {
        if(!(event.getLevel() instanceof ServerLevel level)) return;
        boolean placed = false;

        if(event.getItemStack().is(DisplayTags.SMALL_PLATE_DISPLAYABLE)){
            placed=InterationManager.tryPlaceItemOnSmallPlate(event.getEntity(), level, event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
        }
        if(!placed && event.getItemStack().is(DisplayTags.PLATE_DISPLAYABLE)){
            placed=InterationManager.tryPlaceItemOnPlate(event.getEntity(), level, event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
        }
/*
        if (!placed && event.getHand() == InteractionHand.MAIN_HAND) {
            placed= InterationManager.tryTakeItem(event.getEntity(), level, event.getHitVec(),event.getItemStack());
        }
*/
        if (!placed && event.getItemStack().is(DisplayTags.DISPLAYABLE)) {
         placed=   InterationManager.tryPlaceItem(event.getEntity(), level, event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
        }
        if(placed) event.setCanceled(true);

    }

    @SubscribeEvent
    public static void onWorldLoad(LevelEvent.Load event) {
        if (event.getLevel() instanceof ServerLevel lvl) {
            Block[] array = DisplayBlocks.getAll();
            for (Block target : array) {
                List<ItemStack> drops = Block.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
                if (!drops.isEmpty() && drops.getFirst().is(DisplayTags.DISPLAYABLE)) {
                    BlockAssociations.addToMap(drops.getFirst().getItem(), target, false);
                }
            }

            for(Block target: PlatedBlocks.getAll()){
                List<ItemStack> drops = Block.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
                 if (!drops.isEmpty() && drops.getFirst().is(DisplayTags.PLATE_DISPLAYABLE)) {
                    BlockAssociations.addToMap(drops.getFirst().getItem(), target, true);
                }
            }
            for(Block target: SmallPlatedBlocks.getAll()){
                List<ItemStack> drops = Block.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
                if (!drops.isEmpty() && drops.getFirst().is(DisplayTags.SMALL_PLATE_DISPLAYABLE)) {
                    BlockAssociations.addSmallPlateToMap(drops.getFirst().getItem(), target);
                }
            }
        }
    }

}
