package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class DisplayTags {
    public static final TagKey<Item> PLATE_DISPLAYABLE = ItemTags.create(ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "plate_displayable"));
    public static final TagKey<Item> SMALL_PLATE_DISPLAYABLE = ItemTags.create(ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "small_plate_displayable"));

    public static final TagKey<Item> DISPLAYABLE = ItemTags.create(ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "displayable"));
}