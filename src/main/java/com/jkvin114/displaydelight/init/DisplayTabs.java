package com.jkvin114.displaydelight.init;
import com.jkvin114.displaydelight.DisplayDelight;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;

public class DisplayTabs {

    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisplayDelight.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DISPLAYED = REGISTRY.register("display",
            () -> CreativeModeTab.builder().title(Component.literal("Display Delight"))
                    .icon(() -> new ItemStack(DisplayItems.PLATE.get()))
                    .displayItems((parameters, tabData) -> {
                        tabData.accept(DisplayItems.PLATE.get());
                        tabData.accept(DisplayItems.SMALL_PLATE.get());

                      /*  if (!ModList.get().isLoaded("farmersdelight")){

                        }*/
            }).build());
}
