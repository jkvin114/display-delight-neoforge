package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.item.FoodBlockItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.neoforged.fml.ModList;

import java.util.*;
import java.util.stream.Stream;

import static com.jkvin114.displaydelight.DisplayDelight.LOGGER;

public class BlockAssociations {
    public static Map<Item, Block> blockMap = new HashMap<>();
    public static Map<Block, Item> itemMap = new HashMap<>();

    public static Map<Item, Block> plateBlockMap = new HashMap<>();
    public static Map<Block, Item> plateItemMap = new HashMap<>();

    public static Map<Item, Block> smallplateBlockMap = new HashMap<>();
    public static Map<Block, Item> smallplateItemMap = new HashMap<>();
    private static final String FARMERSDELIGHT = "farmersdelight";
    private static final String MINECRAFT = "minecraft";

    private static final String[] TypePrefixes = new String[]{
            "plated_","small_plated_",""
    };
    private static final Set<String> VanilaFoods = Set.of(
            "mushroom_stew", "rabbit_stew", "beetroot_soup",
            "pumpkin_pie", "cookie"
    );
    private static final Map<String, String> COMPAT_NAMESPACES = new HashMap<>() {{
        put("", "");
        put("cd_", "corn_delight");
        put("ed_", "expandeddelight");
        put("df_", "delightful");
        put("pd_", "pineapple_delight");
        put("od_", "oceansdelight");
        put("ad_", "alexsdelight");
        put("ctd_", "culturaldelights");
        put("lm_", "largemeals");
        put("fd_", "festive_delight");
        put("bnc_", "brewinandchewin");
        put("acd_", "aquaculturedelight");
        put("erd_", "endersdelight");
        put("edd_", "ends_delight");
        put("mnd_", "mynethersdelight");
    }};

    private static final Map<String, String> FULL_MODNAMES = new HashMap<>() {{
        put(FARMERSDELIGHT, "Farmer's Delight");
        put("corn_delight", "Corn Delight");
        put("expandeddelight", "Expanded Delight");
        put("delightful", "Delightful");
        put("pineapple_delight", "Pineapple Delight");
        put("oceansdelight", "Ocean's Delight");
        put("alexsdelight", "Alex's Delight");

        put("culturaldelights", "Cultural Delights");
        put("largemeals", "Large Meals");
        put("festive_delight", "Festive Delight");
        put("brewinandchewin", "Brewin' and Chewin'");
        put("aquaculturedelight", "Aquaculture Delight");
        put("endersdelight", "Ender's Delight");
        put("ends_delight", "End's Delight");
        put("mynethersdelight", "My Nether's Delight");
    }};

    public static final List<Item> TRADEABLE_DRINKS = new ArrayList<>();
    public static final List<Item> TRADEABLE_FOODS = new ArrayList<>();
    public static final List<Item> TRADEABLE_PLATES = new ArrayList<>();
    public static final List<Item> TRADEABLE_SMALL_PLATES = new ArrayList<>();

    private static Item[] ALL_ITEMS = new Item[]{};

    public static Item getRandomItem(RandomSource random){
        return ALL_ITEMS[random.nextInt(ALL_ITEMS.length)];
    }


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


    private static String getNamespace(String s){
        for (String key : COMPAT_NAMESPACES.keySet()) {
            //skip the first empty prefix
            if(!key.isEmpty() && s.startsWith(key)){
                return COMPAT_NAMESPACES.get(key);
            }
        }
        //if prefix is empty or not found return empty string
        return  "";
    }


    private static String removeFirstPrefix(String s, Iterable<String> prefixes) {
        for (String prefix : prefixes) {
            if (!prefix.isEmpty() && s.startsWith(prefix)) {
                return s.substring(prefix.length());
            }
        }
        return s; // no prefix found
    }

    private  static String removePrefix(String s, String prefix){
        if (s.startsWith(prefix)) {
            return s.substring(prefix.length());
        }
        return  s;
    }
    public static boolean isItemInTag(Item item, TagKey<Item> tag) {
        ItemStack s = new ItemStack(item);
        return s.is(tag);
    }

    public static void initialize(Iterable<Item> allItems){
        ArrayList<String> allPrefixes = new ArrayList<>();
        for(String cp:COMPAT_NAMESPACES.keySet()){
            for (String tp : TypePrefixes){
                allPrefixes.add(cp+tp);
            }
        }

        for (Item item: allItems){
            if(!(item instanceof FoodBlockItem)) continue;;
            if(item.equals(DisplayItems.PLATE.get() )|| item.equals(DisplayItems.SMALL_PLATE.get() )) continue;


            try{
                String itemId = BuiltInRegistries.ITEM.getKey(item).getPath();

                String foodName = removeFirstPrefix(itemId,allPrefixes);
                String foodNameWithPlate = removeFirstPrefix(itemId, COMPAT_NAMESPACES.keySet());
                String fullNamespace = getNamespace(itemId);
                boolean isVanila = false;

                if(fullNamespace.isEmpty()){
                    if(VanilaFoods.contains(foodName)){
                        fullNamespace = MINECRAFT;
                        isVanila = true;
                    }
                    else {
                        fullNamespace = FARMERSDELIGHT;
                    }
                }

                if(!isVanila && !ModList.get().isLoaded(fullNamespace)){
                    String name = FULL_MODNAMES.getOrDefault(fullNamespace,"");
                    ((FoodBlockItem) item).setRequiredModName(name);

                    if(((FoodBlockItem) item).isDrink){
                        TRADEABLE_DRINKS.add(item);
                    }
                    else if(foodNameWithPlate.startsWith("plated_")){
                        TRADEABLE_PLATES.add(item);
                    }else if(foodNameWithPlate.startsWith("small_plated_")){
                        TRADEABLE_SMALL_PLATES.add(item);
                    }
                    else{
                        TRADEABLE_FOODS.add(item);
                    }

                }

                LOGGER.info("Registering {} as {} from {}", itemId, foodName, fullNamespace);

                Item registeredFoodItem = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(fullNamespace,foodName));
                if(registeredFoodItem == Items.AIR) {
                    LOGGER.warn("{}:{} is not found from registry", fullNamespace, foodName);
                    continue;
                }

                if(foodNameWithPlate.startsWith("plated_")){
                    if(isItemInTag(registeredFoodItem,DisplayTags.PLATE_DISPLAYABLE)){
                        BlockAssociations.addToMap(registeredFoodItem, ((BlockItem) item).getBlock(), true);
                    }
                }
                else if(foodNameWithPlate.startsWith("small_plated_")){
                    if(isItemInTag(registeredFoodItem,DisplayTags.SMALL_PLATE_DISPLAYABLE)){
                        BlockAssociations.addSmallPlateToMap(registeredFoodItem, ((BlockItem) item).getBlock());
                    }
                }
                else{
                    if(isItemInTag(registeredFoodItem,DisplayTags.DISPLAYABLE)){
                        if(DisplayConfig.DISABLE_VANILLA_FOODS.get() && isVanila) continue;
                        BlockAssociations.addToMap(registeredFoodItem, ((BlockItem) item).getBlock(), false);
                    }
                }
            }
            catch (Exception e){
                LOGGER.error("Failed to set block association for {}", BuiltInRegistries.ITEM.getKey(item).getPath(), e);
            }
        }

        List<Item> combined = new ArrayList<>();
        combined.addAll(blockMap.keySet());
        combined.addAll(plateBlockMap.keySet());
        combined.addAll(smallplateBlockMap.keySet());
        ALL_ITEMS = combined.toArray(Item[]::new);
//
//
//        Block[] array = DisplayBlocks.getAll();
//        for (Block target : array) {
//            List<ItemStack> drops = Block.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
//            if (!drops.isEmpty() && drops.getFirst().is(DisplayTags.DISPLAYABLE)) {
//
//                if(DisplayConfig.DISABLE_VANILLA_FOODS.get() && isVanilaFood(drops.getFirst())) continue;
//
//                BlockAssociations.addToMap(drops.getFirst().getItem(), target, false);
//            }
//        }
//
//        for(Block target: PlatedBlocks.getAll()){
//            List<ItemStack> drops = Block.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
//            if (!drops.isEmpty() && drops.getFirst().is(DisplayTags.PLATE_DISPLAYABLE)) {
//                BlockAssociations.addToMap(drops.getFirst().getItem(), target, true);
//            }
//        }
//        for(Block target: SmallPlatedBlocks.getAll()){
//            List<ItemStack> drops = Block.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
//            if (!drops.isEmpty() && drops.getFirst().is(DisplayTags.SMALL_PLATE_DISPLAYABLE)) {
//                BlockAssociations.addSmallPlateToMap(drops.getFirst().getItem(), target);
//            }
//        }
    }
}
