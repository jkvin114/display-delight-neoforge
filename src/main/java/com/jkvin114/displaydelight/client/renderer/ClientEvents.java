package com.jkvin114.displaydelight.client.renderer;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.ModelEvent;

import java.util.Map;



@EventBusSubscriber(modid = DisplayDelight.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    public static void init(final FMLClientSetupEvent event) {
    }
//
//        @SubscribeEvent // on the mod event bus only on the physical client
//        public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
//            event.registerBlockEntityRenderer(
//                    ShowcaseBlocks.SHOWCASE_BLOCK_ENTITY.get(),
//                    ShowcaseRenderer::new
//            );
//        }
    @SubscribeEvent
    public static void onModifyBakingResult(ModelEvent.ModifyBakingResult event) {
            Map<ModelResourceLocation, BakedModel> models = event.getModels();

            models.replaceAll((loc, model) -> {
                if (loc.id().getNamespace().equals(DisplayDelight.MODID))  {
                  //  DisplayDelight.LOGGER.info("path: "+loc.id().getPath());

                    return new PlateHidingBakedModel(model);
                }
                return model;
            });

        }


}
