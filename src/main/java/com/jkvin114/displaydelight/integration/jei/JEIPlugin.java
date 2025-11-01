package com.jkvin114.displaydelight.integration.jei;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.init.DisplayItems;
import com.jkvin114.displaydelight.item.FoodBlockItem;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.*;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

@JeiPlugin
public class JEIPlugin implements IModPlugin{
    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }


    @Override
    public void registerRecipes(IRecipeRegistration registration) {

        List<ItemStack> stacks = new ArrayList<>();
        for (Item item : DisplayItems.GetAll()) {
            if(item instanceof FoodBlockItem)
                stacks.add(new ItemStack(item));
        }
        registration.addIngredientInfo(stacks, VanillaTypes.ITEM_STACK, Component.translatable(DisplayDelight.MODID + ".jei.info.foodblockitems"));
        registration.addIngredientInfo(new ItemStack(DisplayItems.PLATE), VanillaTypes.ITEM_STACK, Component.translatable(DisplayDelight.MODID + ".jei.info.food_plate"));
        registration.addIngredientInfo(new ItemStack(DisplayItems.SMALL_PLATE), VanillaTypes.ITEM_STACK, Component.translatable(DisplayDelight.MODID + ".jei.info.small_food_plate"));
    }
}
