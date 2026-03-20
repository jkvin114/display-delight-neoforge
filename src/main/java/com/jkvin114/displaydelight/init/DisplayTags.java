package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

public class DisplayTags {
    public static final TagKey<Item> PLATE_DISPLAYABLE = ItemTags.create(ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "plate_displayable"));
    public static final TagKey<Item> SMALL_PLATE_DISPLAYABLE = ItemTags.create(ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "small_plate_displayable"));



    public static final TagKey<Item> DISPLAYABLE = ItemTags.create(ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "displayable"));

    public static final TagKey<Block> FOOD_DISPLAY_PLATES = commonBlockTag("food_display_plate");
    public static final TagKey<Block> SMALL_FOOD_DISPLAY_PLATES = commonBlockTag("small_food_display_plate");

    public static final TagKey<Item> FOOD_DISPLAY_PLATES_ITEM = commonItemTag("food_display_plate");
    public static final TagKey<Item> SMALL_FOOD_DISPLAY_PLATES_ITEM = commonItemTag("small_food_display_plate");

    private static TagKey<Item> commonItemTag(String path) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
    }

    private static TagKey<Block> commonBlockTag(String path) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
    }

}