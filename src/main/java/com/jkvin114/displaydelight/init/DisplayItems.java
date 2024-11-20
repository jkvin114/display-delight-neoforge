package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DisplayItems {
    public static final DeferredRegister<Item> REGISTRY= DeferredRegister.create(Registries.ITEM, DisplayDelight.MODID);;
    public static final DeferredHolder<Item, Item> PLATE = block(DisplayBlocks.PLATE);;


   // public static final DeferredHolder<Item, Item> BOWL= block(DisplayBlocks.BOWL);;
    public static final DeferredHolder<Item,Item> CAKE_SLICE = block(DisplayBlocks.CAKE_SLICE);;
    public static final DeferredHolder<Item,Item> APPLE_PIE_SLICE = block(DisplayBlocks.APPLE_PIE_SLICE);;
    public static final DeferredHolder<Item,Item> SWEET_BERRY_CHEESECAKE_SLICE = block(DisplayBlocks.SWEET_BERRY_CHEESECAKE_SLICE);;
    public static final DeferredHolder<Item,Item> CHOCOLATE_PIE_SLICE = block(DisplayBlocks.CHOCOLATE_PIE_SLICE);
    public static final DeferredHolder<Item,Item> FRUIT_SALAD = block(DisplayBlocks.FRUIT_SALAD);;
    public static final DeferredHolder<Item,Item> MELON_POPSICLE = block(DisplayBlocks.MELON_POPSICLE);;
    public static final DeferredHolder<Item,Item> GLOW_BERRY_CUSTARD = block(DisplayBlocks.GLOW_BERRY_CUSTARD);
    public static final DeferredHolder<Item,Item> BARBECUE_STICK = block(DisplayBlocks.BARBECUE_STICK);
    public static final DeferredHolder<Item,Item> EGG_SANDWICH = block(DisplayBlocks.EGG_SANDWICH);
    public static final DeferredHolder<Item,Item> CHICKEN_SANDWICH = block(DisplayBlocks.CHICKEN_SANDWICH);
    public static final DeferredHolder<Item,Item> HAMBURGER = block(DisplayBlocks.HAMBURGER);
    public static final DeferredHolder<Item,Item> DUMPLINGS = block(DisplayBlocks.DUMPLINGS);

    public static final DeferredHolder<Item,Item> BACON_SANDWICH = block(DisplayBlocks.BACON_SANDWICH);
    public static final DeferredHolder<Item,Item> MUTTON_WRAP = block(DisplayBlocks.MUTTON_WRAP);
    public static final DeferredHolder<Item,Item> STUFFED_POTATO = block(DisplayBlocks.STUFFED_POTATO);
    public static final DeferredHolder<Item,Item> CABBAGE_ROLLS = block(DisplayBlocks.CABBAGE_ROLLS);
    public static final DeferredHolder<Item,Item> SALMON_ROLL = block(DisplayBlocks.SALMON_ROLL);
    public static final DeferredHolder<Item,Item> COD_ROLL = block(DisplayBlocks.COD_ROLL);
    public static final DeferredHolder<Item,Item> KELP_ROLL = block(DisplayBlocks.KELP_ROLL);
    public static final DeferredHolder<Item,Item> KELP_ROLL_SLICE = block(DisplayBlocks.KELP_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> NETHER_SALAD = block(DisplayBlocks.NETHER_SALAD);

    public static final DeferredHolder<Item,Item> COOKED_RICE = block(DisplayBlocks.COOKED_RICE);
    public static final DeferredHolder<Item,Item> MIXED_SALAD = block(DisplayBlocks.MIXED_SALAD);
    public static final DeferredHolder<Item,Item> BEEF_STEW = block(DisplayBlocks.BEEF_STEW);
    public static final DeferredHolder<Item,Item> CHICKEN_SOUP = block(DisplayBlocks.CHICKEN_SOUP);
    public static final DeferredHolder<Item,Item> VEGETABLE_SOUP = block(DisplayBlocks.VEGETABLE_SOUP);
    public static final DeferredHolder<Item,Item> FISH_STEW = block(DisplayBlocks.FISH_STEW);
    public static final DeferredHolder<Item,Item> FRIED_RICE = block(DisplayBlocks.FRIED_RICE);
    public static final DeferredHolder<Item,Item> PUMPKIN_SOUP = block(DisplayBlocks.PUMPKIN_SOUP);
    public static final DeferredHolder<Item,Item> BAKED_COD_STEW = block(DisplayBlocks.BAKED_COD_STEW);
    public static final DeferredHolder<Item,Item> NOODLE_SOUP = block(DisplayBlocks.NOODLE_SOUP);
    public static final DeferredHolder<Item,Item> BONE_BROTH = block(DisplayBlocks.BONE_BROTH);
    public static final DeferredHolder<Item,Item> BACON_AND_EGGS = block(DisplayBlocks.BACON_AND_EGGS);
    public static final DeferredHolder<Item,Item> PASTA_WITH_MEATBALLS = block(DisplayBlocks.PASTA_WITH_MEATBALLS);
    public static final DeferredHolder<Item,Item> PASTA_WITH_MUTTON_CHOP = block(DisplayBlocks.PASTA_WITH_MUTTON_CHOP);
    public static final DeferredHolder<Item,Item> ROASTED_MUTTON_CHOPS = block(DisplayBlocks.ROASTED_MUTTON_CHOPS);
    public static final DeferredHolder<Item,Item> STEAK_AND_POTATOES = block(DisplayBlocks.STEAK_AND_POTATOES);
    public static final DeferredHolder<Item,Item> VEGETABLE_NOODLES = block(DisplayBlocks.VEGETABLE_NOODLES);
    public static final DeferredHolder<Item,Item> RATATOUILLE = block(DisplayBlocks.RATATOUILLE);
    public static final DeferredHolder<Item,Item> SQUID_INK_PASTA = block(DisplayBlocks.SQUID_INK_PASTA);
    public static final DeferredHolder<Item,Item> GRILLED_SALMON = block(DisplayBlocks.GRILLED_SALMON);
    public static final DeferredHolder<Item,Item> MUSHROOM_RICE = block(DisplayBlocks.MUSHROOM_RICE);
    public static final DeferredHolder<Item,Item> ROAST_CHICKEN = block(DisplayBlocks.ROAST_CHICKEN);
    public static final DeferredHolder<Item,Item> STUFFED_PUMPKIN = block(DisplayBlocks.STUFFED_PUMPKIN);
    public static final DeferredHolder<Item,Item> HONEY_GLAZED_HAM = block(DisplayBlocks.HONEY_GLAZED_HAM);
    public static final DeferredHolder<Item,Item> SHEPHEREDS_PIE = block(DisplayBlocks.SHEPHEREDS_PIE);
    public static final DeferredHolder<Item,Item> DOG_FOOD = block(DisplayBlocks.DOG_FOOD );
    public static final DeferredHolder<Item,Item> HORSE_FEED = block(DisplayBlocks.HORSE_FEED);
    public static final DeferredHolder<Item,Item> APPLE_CIDER = block(DisplayBlocks.APPLE_CIDER);
    public static final DeferredHolder<Item,Item> MELON_JUICE = block(DisplayBlocks.MELON_JUICE);
    public static final DeferredHolder<Item,Item> HOT_COCOA = block(DisplayBlocks.HOT_COCOA);

    public static final DeferredHolder<Item,Item> PLATED_DUMPLINGS = block(PlatedBlocks.PLATED_DUMPLINGS);
    public static final DeferredHolder<Item,Item> PLATED_HAMBURGER= block(PlatedBlocks.PLATED_HAMBURGER);
    public static final DeferredHolder<Item,Item> PLATED_BARBECUE_STICK= block(PlatedBlocks.PLATED_BARBECUE_STICK);
//
    public static final DeferredHolder<Item,Item> PLATED_CHICKEN_SANDWICH= block(PlatedBlocks.PLATED_CHICKEN_SANDWICH);
    public static final DeferredHolder<Item,Item> PLATED_COD_ROLL= block(PlatedBlocks.PLATED_COD_ROLL);
    public static final DeferredHolder<Item,Item> PLATED_EGG_SANDWICH= block(PlatedBlocks.PLATED_EGG_SANDWICH);
    public static final DeferredHolder<Item,Item> PLATED_KELP_ROLL= block(PlatedBlocks.PLATED_KELP_ROLL);
    public static final DeferredHolder<Item,Item> PLATED_KELP_ROLL_SLICE= block(PlatedBlocks.PLATED_KELP_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> PLATED_SALMON_ROLL= block(PlatedBlocks.PLATED_SALMON_ROLL);
    public static final DeferredHolder<Item,Item> PLATED_MELON_POPSICLE= block(PlatedBlocks.PLATED_MELON_POPSICLE);
    public static final DeferredHolder<Item,Item> PLATED_STUFFED_POTATO= block(PlatedBlocks.PLATED_STUFFED_POTATO);
     public static final DeferredHolder<Item,Item> PLATED_CABBAGE_ROLLS= block(PlatedBlocks.PLATED_CABBAGE_ROLL);
     public static final DeferredHolder<Item,Item> PLATED_BACON_SANDWICH= block(PlatedBlocks.PLATED_BACON_SANDWICH);
     public static final DeferredHolder<Item,Item> PLATED_MUTTON_WRAP= block(PlatedBlocks.PLATED_MUTTON_WRAP);

    public static final DeferredHolder<Item,Item> PLATED_CAKE_SLICE =  block(SmallPlatedBlocks.PLATED_CAKE_SLICE);
    public static final DeferredHolder<Item,Item> PLATED_APPLE_PIE_SLICE =  block(SmallPlatedBlocks.PLATED_APPLE_PIE_SLICE);
    public static final DeferredHolder<Item,Item> PLATED_CHOCOLATE_PIE_SLICE =  block(SmallPlatedBlocks.PLATED_CHOCOLATE_PIE_SLICE);
    public static final DeferredHolder<Item,Item> PLATED_SWEET_BERRY_CHEESECAKE_SLICE =  block(SmallPlatedBlocks.PLATED_SWEET_BERRY_CHEESECAKE_SLICE);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_STUFFED_POTATO =  block(SmallPlatedBlocks.PLATED_STUFFED_POTATO);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_COD_ROLL =  block(SmallPlatedBlocks.PLATED_COD_ROLL);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_SALMON_ROLL =  block(SmallPlatedBlocks.PLATED_SALMON_ROLL);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_KELP_ROLL_SLICE =  block(SmallPlatedBlocks.PLATED_KELP_ROLL_SLICE);
    public static final DeferredHolder<Item,Item> SMALL_PLATED_CABBAGE_ROLLS =  block(SmallPlatedBlocks.PLATED_CABBAGE_ROLLS);
    public static final DeferredHolder<Item,Item> SMALL_PLATE =  block(DisplayBlocks.SMALL_PLATE);

    private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block)block.get(), new Item.Properties());
        });
    }

}
