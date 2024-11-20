package com.jkvin114.displaydelight.init;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class FoodItem extends BlockItem {
    public FoodItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        tooltipComponents.add(Component.translatable("item.items_displayed.tooltip.item_display_1").withStyle(ChatFormatting.GRAY));
        tooltipComponents.add(Component.translatable("item.items_displayed.tooltip.item_display_2").withStyle(ChatFormatting.GRAY));
        tooltipComponents.add(Component.translatable("item.items_displayed.tooltip.item_display_0").withStyle(ChatFormatting.GRAY));
    }

}
