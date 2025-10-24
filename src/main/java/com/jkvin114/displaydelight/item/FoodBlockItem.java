package com.jkvin114.displaydelight.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FoodBlockItem extends BlockItem {

    String requiredModName = "";

    public final boolean isDrink;

    public FoodBlockItem(Block pBlock, Item.Properties pProperties) {
        super(pBlock, pProperties);
        isDrink = false;
    }
    public FoodBlockItem(Block pBlock, Item.Properties pProperties,boolean isDrink) {
        super(pBlock, pProperties);
        this.isDrink=isDrink;
    }

    public void setRequiredModName(String modname){
        requiredModName=modname;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(!requiredModName.isEmpty())
            tooltipComponents.add(Component.translatable("item.displaydelight.tooltip.from_mod",requiredModName).withStyle(ChatFormatting.GOLD));

        super.appendHoverText(stack, context,tooltipComponents,tooltipFlag);
    }

}
