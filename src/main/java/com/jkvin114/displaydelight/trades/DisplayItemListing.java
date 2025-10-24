package com.jkvin114.displaydelight.trades;

import com.jkvin114.displaydelight.init.BlockAssociations;
import net.minecraft.core.component.DataComponentPredicate;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class DisplayItemListing {
    public abstract static class DisplayFoodItemListing implements VillagerTrades.ItemListing{
        protected final int price;

        protected final int maxTrades;
        protected final int xp;
        protected final float priceMult;
        public DisplayFoodItemListing(int price, int maxTrades, int xp, float priceMult){
            this.price = price;
            this.maxTrades= maxTrades;
            this.xp = xp;
            this.priceMult=priceMult;
        }
        public abstract ItemStack ForSaleItem(Entity entity, RandomSource randomSource);

        @Override
        public @Nullable MerchantOffer getOffer(Entity entity, RandomSource randomSource) {
            ItemStack forsale = ForSaleItem(entity,randomSource);
            ItemStack tobuy = new ItemStack(Items.EMERALD,price);

            ItemCost cost = new ItemCost(tobuy.getItemHolder(), tobuy.getCount(), DataComponentPredicate.EMPTY, tobuy);

            return new MerchantOffer(cost, Optional.empty(), forsale, this.maxTrades, this.xp, this.priceMult);
        }
    }



    public static class FoodItemListing extends DisplayFoodItemListing {


        public FoodItemListing(int price, int maxTrades, int xp, float priceMult) {
            super(price, maxTrades, xp, priceMult);
        }

        @Override
        public ItemStack ForSaleItem(Entity entity, RandomSource random) {
            Item randomItem;
            if(BlockAssociations.TRADEABLE_FOODS.isEmpty()){
                randomItem = BlockAssociations.getRandomItem(random);
            }
            else{
                randomItem = BlockAssociations.TRADEABLE_FOODS.get(random.nextInt(BlockAssociations.TRADEABLE_FOODS.size()));
            }

            return new ItemStack(randomItem);
        }
    }
    public static class PlatedFoodItemListing extends DisplayFoodItemListing {

        public PlatedFoodItemListing(int price, int maxTrades, int xp, float priceMult) {
            super(price, maxTrades, xp, priceMult);
        }

        @Override
        public ItemStack ForSaleItem(Entity entity, RandomSource random) {
            Item randomItem;
            if(BlockAssociations.TRADEABLE_PLATES.isEmpty()){
                randomItem = BlockAssociations.getRandomItem(random);
            }
            else{
                randomItem = BlockAssociations.TRADEABLE_PLATES.get(random.nextInt(BlockAssociations.TRADEABLE_PLATES.size()));
            }

            return new ItemStack(randomItem);
        }
    }
    public static class SmallPlatedItemListing extends DisplayFoodItemListing {

        public SmallPlatedItemListing(int price, int maxTrades, int xp, float priceMult) {
            super(price, maxTrades, xp, priceMult);
        }

        @Override
        public ItemStack ForSaleItem(Entity entity, RandomSource random) {
            Item randomItem;
            if(BlockAssociations.TRADEABLE_SMALL_PLATES.isEmpty()){
                randomItem = BlockAssociations.getRandomItem(random);
            }
            else{
                randomItem = BlockAssociations.TRADEABLE_SMALL_PLATES.get(random.nextInt(BlockAssociations.TRADEABLE_SMALL_PLATES.size()));
            }

            return new ItemStack(randomItem);
        }
    }
    public static class DrinkItemListing extends DisplayFoodItemListing {

        public DrinkItemListing(int price, int maxTrades, int xp, float priceMult) {
            super(price, maxTrades, xp, priceMult);
        }

        @Override
        public ItemStack ForSaleItem(Entity entity, RandomSource random) {
            Item randomItem;
            if(BlockAssociations.TRADEABLE_DRINKS.isEmpty()){
                randomItem = BlockAssociations.getRandomItem(random);
            }
            else{
                randomItem = BlockAssociations.TRADEABLE_DRINKS.get(random.nextInt(BlockAssociations.TRADEABLE_DRINKS.size()));
            }

            return new ItemStack(randomItem);
        }
    }
}
