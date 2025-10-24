package com.jkvin114.displaydelight.events;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.init.DisplayConfig;
import com.jkvin114.displaydelight.init.DisplayItems;
import com.jkvin114.displaydelight.trades.DisplayItemListing;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@EventBusSubscriber(modid = DisplayDelight.MODID)
@ParametersAreNonnullByDefault
public class DisplayVillagerEvents {

    @SubscribeEvent
    public static void onWandererTrades(WandererTradesEvent event) {

        if(DisplayConfig.WANDERING_TRADER_FOOD_BLOCK_ITEMS.get()){
            List<VillagerTrades.ItemListing> common =  event.getGenericTrades();

            common.add(new DisplayItemListing.FoodItemListing(2,4,24,0.05F) );
            common.add(new DisplayItemListing.FoodItemListing(2,4,24,0.05F) );
            common.add(new DisplayItemListing.DrinkItemListing(1,4,12,0.05F) );
            common.add(new DisplayItemListing.PlatedFoodItemListing(2,4,24,0.05F) );
            common.add(new DisplayItemListing.PlatedFoodItemListing(2,4,24,0.05F) );
            common.add(new DisplayItemListing.SmallPlatedItemListing(1,4,12,0.05F) );

            List<VillagerTrades.ItemListing> rare =  event.getRareTrades();

            rare.add(new DisplayItemListing.FoodItemListing(2,4,24,0.05F) );
            rare.add(new DisplayItemListing.FoodItemListing(2,4,24,0.05F) );
            rare.add(new DisplayItemListing.PlatedFoodItemListing(2,4,24,0.05F) );
            rare.add(new DisplayItemListing.PlatedFoodItemListing(2,4,24,0.05F) );

        }

    }
}
