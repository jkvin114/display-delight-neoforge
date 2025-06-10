package com.jkvin114.displaydelight;

import com.jkvin114.displaydelight.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.minecraft.commands.arguments.selector.options.EntitySelectorOptions;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.function.Supplier;


// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(DisplayDelight.MODID)
public class DisplayDelight {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "displaydelight";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    /*
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.examplemod")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());

     */
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisplayDelight.MODID);


    public static final Supplier<CreativeModeTab> DISPLAY_DELIGHT_TAB = CREATIVE_TABS.register(DisplayDelight.MODID, () -> CreativeModeTab.builder()
            //Set the title of the tab. Don't forget to add a translation!
            .title(Component.literal("Display Delight"))
            //Set the icon of the tab.
            .icon(() -> new ItemStack(DisplayItems.GRILLED_SALMON))
            //Add your items to the tab.
            .displayItems((params, output) -> {
                output.accept(DisplayItems.PLATE.get());
                output.accept(DisplayItems.SMALL_PLATE.get());
                output.accept(DisplayItems.MUSHROOM_STEW.get());
                output.accept(DisplayItems.RABBIT_STEW.get());
                output.accept(DisplayItems.BEETROOT_STEW.get());
                output.accept(DisplayItems.PLATED_COOKIE.get());
                output.accept(DisplayItems.PLATED_PUMPKIN_PIE.get());

                output.accept(DisplayItems.FRUIT_SALAD.get());
                output.accept(DisplayItems.GLOW_BERRY_CUSTARD.get());
                output.accept(DisplayItems.COOKED_RICE.get());
                output.accept(DisplayItems.MIXED_SALAD.get());
                output.accept(DisplayItems.BEEF_STEW.get());
                output.accept(DisplayItems.CHICKEN_SOUP.get());
                output.accept(DisplayItems.VEGETABLE_SOUP.get());
                output.accept(DisplayItems.FISH_STEW.get());
                output.accept(DisplayItems.FRIED_RICE.get());
                output.accept(DisplayItems.PUMPKIN_SOUP.get());
                output.accept(DisplayItems.BAKED_COD_STEW.get());
                output.accept(DisplayItems.NOODLE_SOUP.get());
                output.accept(DisplayItems.BONE_BROTH.get());
                output.accept(DisplayItems.BACON_AND_EGGS.get());
                output.accept(DisplayItems.PASTA_WITH_MEATBALLS.get());
                output.accept(DisplayItems.PASTA_WITH_MUTTON_CHOP.get());
                output.accept(DisplayItems.ROASTED_MUTTON_CHOPS.get());
                output.accept(DisplayItems.STEAK_AND_POTATOES.get());
                output.accept(DisplayItems.VEGETABLE_NOODLES.get());
                output.accept(DisplayItems.RATATOUILLE.get());
                output.accept(DisplayItems.SQUID_INK_PASTA.get());
                output.accept(DisplayItems.GRILLED_SALMON.get());
                output.accept(DisplayItems.MUSHROOM_RICE.get());
                output.accept(DisplayItems.ROAST_CHICKEN.get());
                output.accept(DisplayItems.STUFFED_PUMPKIN.get());
                output.accept(DisplayItems.HONEY_GLAZED_HAM.get());
                output.accept(DisplayItems.SHEPHEREDS_PIE.get());
                output.accept(DisplayItems.APPLE_CIDER.get());
                output.accept(DisplayItems.MELON_JUICE.get());
                output.accept(DisplayItems.HOT_COCOA.get());
                output.accept(DisplayItems.PLATED_HAMBURGER.get());
                output.accept(DisplayItems.PLATED_KELP_ROLL_SLICE.get());
                output.accept(DisplayItems.PLATED_DUMPLINGS.get());
                output.accept(DisplayItems.PLATED_BARBECUE_STICK.get());
                output.accept(DisplayItems.PLATED_CHICKEN_SANDWICH.get());
                output.accept(DisplayItems.PLATED_COD_ROLL.get());
                output.accept(DisplayItems.PLATED_EGG_SANDWICH.get());
                output.accept(DisplayItems.PLATED_KELP_ROLL.get());
                output.accept(DisplayItems.PLATED_SALMON_ROLL.get());
                output.accept(DisplayItems.PLATED_MELON_POPSICLE.get());
                output.accept(DisplayItems.PLATED_STUFFED_POTATO.get());
                output.accept(DisplayItems.PLATED_CABBAGE_ROLLS.get());
                output.accept(DisplayItems.PLATED_BACON_SANDWICH.get());
                output.accept(DisplayItems.PLATED_MUTTON_WRAP.get());
                output.accept(DisplayItems.PLATED_SWEET_BERRY_COOKIE.get());
                output.accept(DisplayItems.PLATED_HONEY_COOKIE.get());

                output.accept(DisplayItems.PLATED_CAKE_SLICE.get());
                output.accept(DisplayItems.PLATED_APPLE_PIE_SLICE.get());
                output.accept(DisplayItems.PLATED_CHOCOLATE_PIE_SLICE.get());
                output.accept(DisplayItems.PLATED_SWEET_BERRY_CHEESECAKE_SLICE.get());
                output.accept(DisplayItems.SMALL_PLATED_STUFFED_POTATO.get());
                output.accept(DisplayItems.SMALL_PLATED_COD_ROLL.get());
                output.accept(DisplayItems.SMALL_PLATED_SALMON_ROLL.get());
                output.accept(DisplayItems.SMALL_PLATED_KELP_ROLL_SLICE.get());
                output.accept(DisplayItems.SMALL_PLATED_CABBAGE_ROLLS.get());


                output.accept(DisplayItems.AD_MAGGOT_SALAD.get());
                output.accept(DisplayItems.AD_KANGAROO_STEW.get());
                output.accept(DisplayItems.AD_ACACIA_BLOSSOM_SOUP.get());
                output.accept(DisplayItems.AD_LOBSTER_PASTA.get());
                output.accept(DisplayItems.AD_KANGAROO_PASTA.get());
                output.accept(DisplayItems.AD_BUNFUNBUS_SANDWICH.get());
                output.accept(DisplayItems.AD_BISON_BURGER.get());
                output.accept(DisplayItems.AD_GONGYLIDIA_BRUSCHETTA.get());
                output.accept(DisplayItems.CD_NACHOS_BOWL.get());
                output.accept(DisplayItems.CD_CREAMY_COR_DRINK.get());
                output.accept(DisplayItems.CD_CORNBREAD_STUFFING.get());
                output.accept(DisplayItems.CD_CORN_SOUP.get());
                output.accept(DisplayItems.CD_CREAMED_CORN.get());
                output.accept(DisplayItems.CD_GRILLED_CORN.get());
                output.accept(DisplayItems.CD_CLASSIC_CORN_DOG.get());
                output.accept(DisplayItems.CD_TACO.get());
                output.accept(DisplayItems.CTD_HEARTY_SALAD.get());
                output.accept(DisplayItems.CTD_CREAMED_CORN.get());
                output.accept(DisplayItems.CTD_SPICY_CURRY.get());
                output.accept(DisplayItems.CTD_FRIED_EGGPLANT_PASTA.get());
                output.accept(DisplayItems.CTD_ELOTE.get());
                output.accept(DisplayItems.CTD_EMPANADA.get());
                output.accept(DisplayItems.CTD_BEEF_BURITO.get());
                output.accept(DisplayItems.CTD_MUTTON_SANDWICH.get());
                output.accept(DisplayItems.CTD_EGGPLANT_BURGER.get());
                output.accept(DisplayItems.CTD_AVOCADO_TOAST.get());
                output.accept(DisplayItems.CTD_CHICKEN_TACO.get());
                output.accept(DisplayItems.CTD_PORK_WRAP.get());
                output.accept(DisplayItems.CTD_FISH_TACO.get());
                output.accept(DisplayItems.CTD_CHICKEN_ROLL.get());
                output.accept(DisplayItems.CTD_MIDORI_ROLL.get());
                output.accept(DisplayItems.CTD_CHICKEN_ROLL_SLICE.get());
                output.accept(DisplayItems.CTD_MIDORI_ROLL_SLICE.get());
                output.accept(DisplayItems.CTD_PUFFERFISH_ROLL.get());
                output.accept(DisplayItems.CTD_TROPICAL_ROLL.get());
                output.accept(DisplayItems.CTD_RICE_BALL.get());
                output.accept(DisplayItems.CTD_EGG_ROLL.get());
                output.accept(DisplayItems.CTD_CALAMARI_ROLL.get());
                output.accept(DisplayItems.CTD_CHICKEN_ROLL_SLICE_SMALL.get());
                output.accept(DisplayItems.CTD_MIDORI_ROLL_SLICE_SMALL.get());
                output.accept(DisplayItems.CTD_PUFFERFISH_ROLL_SMALL.get());
                output.accept(DisplayItems.CTD_TROPICAL_ROLL_SMALL.get());
                output.accept(DisplayItems.CTD_EGG_ROLL_SMALL.get());
                output.accept(DisplayItems.CTD_CALAMARI_ROLL_SMALL.get());
                output.accept(DisplayItems.CTD_CUT_PICKLE.get());
                output.accept(DisplayItems.DF_MATCHA_ICE_CREAM.get());
                output.accept(DisplayItems.DF_MATCHA_MILKSHAKE.get());
                output.accept(DisplayItems.DF_SALMONBERRY_ICE_CREAM.get());
                output.accept(DisplayItems.DF_SALMONBERRY_MILKSHAKE.get());
                output.accept(DisplayItems.DF_MATCHA_LATTE.get());
                output.accept(DisplayItems.DF_ENDER_NECTAR.get());
                output.accept(DisplayItems.DF_BERRY_MATCHA_LATTE.get());
                output.accept(DisplayItems.DF_CACTUS_CHILI.get());
                output.accept(DisplayItems.DF_FIELD_SALAD.get());
                output.accept(DisplayItems.DF_STUFFED_CANTALOUPE.get());
                output.accept(DisplayItems.DF_SINIGANG.get());
                output.accept(DisplayItems.DF_CACTUS_SOUP.get());
                output.accept(DisplayItems.DF_SMORE.get());
                output.accept(DisplayItems.DF_CHEESEBURGER.get());
                output.accept(DisplayItems.DF_DELUXE_CHEESEBURGER.get());
                output.accept(DisplayItems.DF_NUT_BUTTER_AND_JELLY_SANDWICH.get());
                output.accept(DisplayItems.DF_COOKED_MARSHMELLOW_STICK.get());
                output.accept(DisplayItems.DF_CANTALOUPE_POPSICLE.get());
                output.accept(DisplayItems.DF_CANTALOUPE_BREAD.get());
                output.accept(DisplayItems.DF_WRAPPED_CANTALOUPE.get());
                output.accept(DisplayItems.DF_SALMONBERRY_PIE_SLICE.get());
                output.accept(DisplayItems.DF_PUMPKIN_PIE_SLICE.get());
                output.accept(DisplayItems.ED_ASPARAGUS_SOUP.get());
                output.accept(DisplayItems.ED_ASPARAGUS_SOUP_CREAMY.get());
                output.accept(DisplayItems.ED_ASPARAGUS_AND_BACON_CHEESY.get());
                output.accept(DisplayItems.ED_PEPERONATA.get());
                output.accept(DisplayItems.ED_PEANUT_HONEY_SOUP.get());
                output.accept(DisplayItems.ED_MAC_AND_CHEESE.get());
                output.accept(DisplayItems.ED_PEANUT_SALAD.get());
                output.accept(DisplayItems.ED_SWEET_POTTATO_SALAD.get());
                output.accept(DisplayItems.ED_CINNAMON_RICE.get());
                output.accept(DisplayItems.ED_CINNAMON_APPLES.get());
                output.accept(DisplayItems.ED_APPLE_JUICE.get());
                output.accept(DisplayItems.ED_SWEET_BERRY_JUICE.get());
                output.accept(DisplayItems.ED_GLOW_BERRY_JUICE.get());
                output.accept(DisplayItems.ED_PEANUT_BUTTER_SANDWICH.get());
                output.accept(DisplayItems.ED_PEANUT_BUTTER_AND_HONEY_SANDWICH.get());
                output.accept(DisplayItems.ED_GLOW_BERRY_JELLY_SANDWICH.get());
                output.accept(DisplayItems.ED_SWEET_BERRY_JELLY_SANDWICH.get());
                output.accept(DisplayItems.ED_CHEESE_SANDWICH.get());
                output.accept(DisplayItems.ED_GRILLED_CHEESE.get());
                output.accept(DisplayItems.ED_CHOCOLATE_COOKIE.get());
                output.accept(DisplayItems.ED_SUGAR_COOKIE.get());
                output.accept(DisplayItems.ED_SNICKERDOODLE.get());
                output.accept(DisplayItems.ED_SWEET_ROLL.get());
                output.accept(DisplayItems.ED_BERRY_SWEET_ROLL.get());
                output.accept(DisplayItems.ED_GLOW_BERRY_SWEET_ROLL.get());
                output.accept(DisplayItems.ED_SWEET_ROLL_SMALL.get());
                output.accept(DisplayItems.ED_BERRY_SWEET_ROLL_SMALL.get());
                output.accept(DisplayItems.ED_GLOW_BERRY_SWEET_ROLL_SMALL.get());
                output.accept(DisplayItems.ED_CHEESE_SLICE.get());
                output.accept(DisplayItems.FD_FESTIVE_CHICKEN.get());
                output.accept(DisplayItems.FD_CHRISTMAS_TEA.get());
                output.accept(DisplayItems.FD_SALMON_VERRINES.get());
                output.accept(DisplayItems.PD_PINEAPPLE_FRIED_RICE.get());
                output.accept(DisplayItems.PD_PINEAPPLE_ICE_CREAM.get());
                output.accept(DisplayItems.PD_PINEAPPLE_MILK_SHAKE.get());
                output.accept(DisplayItems.PD_PINEAPPLE_JUICE.get());
                output.accept(DisplayItems.PD_PINEAPPLE_PIE_SLICE.get());
                output.accept(DisplayItems.LM_PUFFERFISH_BROTH.get());
                output.accept(DisplayItems.LM_POTATO_SOUP.get());
                output.accept(DisplayItems.LM_RED_SOUP.get());
                output.accept(DisplayItems.LM_TOMATO_EGG_SOUP.get());
                output.accept(DisplayItems.LM_COD_DELUXE.get());
                output.accept(DisplayItems.LM_HEARTY_LUNCH.get());
                output.accept(DisplayItems.LM_CHICKEN_CURRY.get());
                output.accept(DisplayItems.LM_PASTA_WITH_MUSHROOM_SAUCE.get());
                output.accept(DisplayItems.LM_OMURICE.get());
                output.accept(DisplayItems.LM_MUSHROOM_POT_PIE.get());
                output.accept(DisplayItems.LM_ROASTED_MUTTOH_RACK.get());
                output.accept(DisplayItems.LM_SWEET_BERRY_CUSTARD.get());
                output.accept(DisplayItems.LM_RICE_PUDDING.get());
                output.accept(DisplayItems.OD_BOWL_OF_GUARDIAN_SOUP.get());
                output.accept(DisplayItems.OD_BRAISED_SEA_PICKLE.get());
                output.accept(DisplayItems.OD_SEAGRASS_SALAD.get());
                output.accept(DisplayItems.OD_SQUID_RINGS.get());
                output.accept(DisplayItems.OD_BACKED_TENTACLE_ON_A_STICK.get());
                output.accept(DisplayItems.OD_ELDER_GUARDIAN_ROLL.get());
                output.accept(DisplayItems.OD_FUGU_ROLL.get());
                output.accept(DisplayItems.OD_HONEY_FRIED_KELP.get());
                output.accept(DisplayItems.OD_COOKED_STUFFED_COD.get());
                output.accept(DisplayItems.OD_ELDER_GUARDIAN_ROLL_SMALL.get());
                output.accept(DisplayItems.OD_FUGU_ROLL_SMALL.get());

            })
            .build()
    );



    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public DisplayDelight(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        DisplayBlocks.REGISTRY.register(modEventBus);
        DisplayItems.REGISTRY.register(modEventBus);
        PlatedBlocks.REGISTRY.register(modEventBus);
        SmallPlatedBlocks.REGISTRY.register(modEventBus);
     //   DisplayTabs.REGISTRY.register(modEventBus);

        // Register the Deferred Register to the mod event bus so items get registered
      //  ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, DisplayConfig.CONFIG, "displaydelight-common.toml");

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
       // modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS
            || event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(DisplayItems.PLATE.get());
            event.accept(DisplayItems.SMALL_PLATE.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
