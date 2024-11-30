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
    public static final DeferredHolder<Item,Item> FRUIT_SALAD = block(DisplayBlocks.FRUIT_SALAD);;
    public static final DeferredHolder<Item,Item> GLOW_BERRY_CUSTARD = block(DisplayBlocks.GLOW_BERRY_CUSTARD);

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

    //VANILA
    public static final DeferredHolder<Item,Item> MUSHROOM_STEW = block(DisplayBlocks.MUSHROOM_STEW);
    public static final DeferredHolder<Item,Item> RABBIT_STEW = block(DisplayBlocks.RABBIT_STEW);
    public static final DeferredHolder<Item,Item> BEETROOT_STEW = block(DisplayBlocks.BEETROOT_STEW);

    //CORN DELIGHT

    public static final DeferredHolder<Item,Item> CD_NACHOS_BOWL = block(DisplayBlocks.CD_NACHOS_BOWL);
    public static final DeferredHolder<Item,Item> CD_CREAMY_COR_DRINK = block(DisplayBlocks.CD_CREAMY_COR_DRINK);

    public static final DeferredHolder<Item,Item> CD_CORNBREAD_STUFFING = block(DisplayBlocks.CD_CORNBREAD_STUFFING);
    public static final DeferredHolder<Item,Item> CD_CORN_SOUP = block(DisplayBlocks.CD_CORN_SOUP);
    public static final DeferredHolder<Item,Item> CD_CREAMED_CORN = block(DisplayBlocks.CD_CREAMED_CORN);

    //Expanded delight
    public static final DeferredHolder<Item,Item> ED_ASPARAGUS_SOUP = block(DisplayBlocks.ED_ASPARAGUS_SOUP);
    public static final DeferredHolder<Item,Item> ED_ASPARAGUS_SOUP_CREAMY = block(DisplayBlocks.ED_ASPARAGUS_SOUP_CREAMY);
    public static final DeferredHolder<Item,Item> ED_ASPARAGUS_AND_BACON_CHEESY = block(DisplayBlocks.ED_ASPARAGUS_AND_BACON_CHEESY);
    public static final DeferredHolder<Item,Item> ED_PEPERONATA = block(DisplayBlocks.ED_PEPERONATA);
    public static final DeferredHolder<Item,Item> ED_PEANUT_HONEY_SOUP = block(DisplayBlocks.ED_PEANUT_HONEY_SOUP);
    public static final DeferredHolder<Item,Item> ED_MAC_AND_CHEESE = block(DisplayBlocks.ED_MAC_AND_CHEESE);
    public static final DeferredHolder<Item,Item> ED_PEANUT_SALAD = block(DisplayBlocks.ED_PEANUT_SALAD);
    public static final DeferredHolder<Item,Item> ED_SWEET_POTTATO_SALAD = block(DisplayBlocks.ED_SWEET_POTTATO_SALAD);

    public static final DeferredHolder<Item,Item> ED_CINNAMON_RICE = block(DisplayBlocks.ED_CINNAMON_RICE);
    public static final DeferredHolder<Item,Item> ED_CINNAMON_APPLES = block(DisplayBlocks.ED_CINNAMON_APPLES);

    public static final DeferredHolder<Item,Item> ED_APPLE_JUICE = block(DisplayBlocks.ED_APPLE_JUICE);
    public static final DeferredHolder<Item,Item> ED_SWEET_BERRY_JUICE = block(DisplayBlocks.ED_SWEET_BERRY_JUICE);
    public static final DeferredHolder<Item,Item> ED_GLOW_BERRY_JUICE = block(DisplayBlocks.ED_GLOW_BERRY_JUICE);


    //delightful
    public static final DeferredHolder<Item,Item> DF_MATCHA_ICE_CREAM = block(DisplayBlocks.DF_MATCHA_ICE_CREAM);
    public static final DeferredHolder<Item,Item> DF_MATCHA_MILKSHAKE = block(DisplayBlocks.DF_MATCHA_MILKSHAKE);
    public static final DeferredHolder<Item,Item> DF_SALMONBERRY_ICE_CREAM = block(DisplayBlocks.DF_SALMONBERRY_ICE_CREAM);
    public static final DeferredHolder<Item,Item> DF_SALMONBERRY_MILKSHAKE = block(DisplayBlocks.DF_SALMONBERRY_MILKSHAKE);
    public static final DeferredHolder<Item,Item> DF_MATCHA_LATTE = block(DisplayBlocks.DF_MATCHA_LATTE);
    public static final DeferredHolder<Item,Item> DF_ENDER_NECTAR = block(DisplayBlocks.DF_ENDER_NECTAR);
    public static final DeferredHolder<Item,Item> DF_BERRY_MATCHA_LATTE = block(DisplayBlocks.DF_BERRY_MATCHA_LATTE);
    public static final DeferredHolder<Item,Item> DF_CACTUS_CHILI = block(DisplayBlocks.DF_CACTUS_CHILI);
    public static final DeferredHolder<Item,Item> DF_FIELD_SALAD = block(DisplayBlocks.DF_FIELD_SALAD);
    public static final DeferredHolder<Item,Item> DF_STUFFED_CANTALOUPE = block(DisplayBlocks.DF_STUFFED_CANTALOUPE);
    public static final DeferredHolder<Item,Item> DF_SINIGANG = block(DisplayBlocks.DF_SINIGANG);


    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_FRIED_RICE = block(DisplayBlocks.PD_PINEAPPLE_FRIED_RICE);
    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_ICE_CREAM = block(DisplayBlocks.PD_PINEAPPLE_ICE_CREAM);
    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_MILK_SHAKE = block(DisplayBlocks.PD_PINEAPPLE_MILK_SHAKE);
    public static final DeferredHolder<Item,Item> PD_PINEAPPLE_JUICE = block(DisplayBlocks.PD_PINEAPPLE_JUICE);


    //ocean delight
    public static final DeferredHolder<Item,Item> OD_BOWL_OF_GUARDIAN_SOUP = block(DisplayBlocks.OD_BOWL_OF_GUARDIAN_SOUP);
    public static final DeferredHolder<Item,Item> OD_BRAISED_SEA_PICKLE = block(DisplayBlocks.OD_BRAISED_SEA_PICKLE);
    public static final DeferredHolder<Item,Item> OD_SEAGRASS_SALAD = block(DisplayBlocks.OD_SEAGRASS_SALAD);
    public static final DeferredHolder<Item,Item> OD_SQUID_RINGS = block(DisplayBlocks.OD_SQUID_RINGS);

    private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block)block.get(), new Item.Properties());
        });
    }

}
