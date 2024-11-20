package com.jkvin114.displaydelight.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import java.util.Map;
import java.util.HashMap;

public class BlockAssociations {
    public static Map<Item, Block> blockMap = new HashMap<>();
    public static Map<Block, Item> itemMap = new HashMap<>();

    public static Map<Item, Block> plateBlockMap = new HashMap<>();
    public static Map<Block, Item> plateItemMap = new HashMap<>();

    public static Map<Item, Block> smallplateBlockMap = new HashMap<>();
    public static Map<Block, Item> smallplateItemMap = new HashMap<>();

    public static Block getBlockFor(Item i) {
        return blockMap.getOrDefault(i, Blocks.AIR);
    }

    public static Item getItemFor(Block b) {
        return itemMap.getOrDefault(b, Items.AIR);
    }

    public static Block getPlateBlockFor(Item i) {
        return plateBlockMap.getOrDefault(i, Blocks.AIR);
    }

    public static Item getPlatedItemFor(Block b) {
        return plateItemMap.getOrDefault(b, Items.AIR);
    }
    public static Block getSmallPlateBlockFor(Item i) {
        return smallplateBlockMap.getOrDefault(i, Blocks.AIR);
    }

    public static Item getSmallPlatedItemFor(Block b) {
        return smallplateItemMap.getOrDefault(b, Items.AIR);
    }
    public static void addSmallPlateToMap(Item i, Block b) {

        smallplateBlockMap.putIfAbsent(i, b);
        smallplateItemMap.putIfAbsent(b, i);
    }
    public static void addToMap(Item i, Block b,boolean isPlated) {

        if(isPlated){
            plateBlockMap.putIfAbsent(i, b);
            plateItemMap.putIfAbsent(b, i);
        }else{
            blockMap.putIfAbsent(i, b);
            itemMap.putIfAbsent(b, i);
        }
    }
}
