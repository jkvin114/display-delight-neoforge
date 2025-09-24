package com.jkvin114.displaydelight.events;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.init.*;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.level.LevelEvent;

import java.util.List;



@EventBusSubscriber(modid = DisplayDelight.MODID)
public class DisplayEvents {


    @SubscribeEvent
    public static void onCheck(PlayerInteractEvent.RightClickBlock event) {
        if(!(event.getLevel() instanceof ServerLevel level)) return;
        boolean placed = false;

        if (event.getHand() == InteractionHand.MAIN_HAND && event.getItemStack().isEmpty()) {
            placed= InterationManager.tryTakeItemWithBareHand(event.getEntity(), level, event.getHitVec());
        }

        if(!placed && event.getItemStack().is(DisplayTags.SMALL_PLATE_DISPLAYABLE)){
            placed=InterationManager.tryPlaceItemOnSmallPlate(event.getEntity(), level, event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
        }

        if(!placed && event.getItemStack().is(DisplayTags.PLATE_DISPLAYABLE)){
            placed=InterationManager.tryPlaceItemOnPlate(event.getEntity(), level, event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
        }

        if (!placed && event.getItemStack().is(DisplayTags.DISPLAYABLE)) {
            placed=   InterationManager.tryPlaceItem(event.getEntity(), level, event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
        }
        if(placed) event.setCanceled(true);

    }
    @SubscribeEvent
    public static void onWorldLoad(LevelEvent.Load event) {
        if (event.getLevel() instanceof ServerLevel lvl) {
            BlockAssociations.initialize(DisplayItems.GetAll());
        }
    }

}
