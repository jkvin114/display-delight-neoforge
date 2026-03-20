package com.jkvin114.displaydelight.client.renderer;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.AbstractStackablePlatedFoodBlock;
import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.BakedModelWrapper;
import net.neoforged.neoforge.client.model.data.ModelData;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class PlateHidingBakedModel extends BakedModelWrapper<BakedModel> {
    public PlateHidingBakedModel(BakedModel wrapped) {
        super(wrapped);
    }
    private static final Set<ResourceLocation> EXCLUDED_SPRITES = Set.of(
            ResourceLocation.fromNamespaceAndPath(DisplayDelight.MODID, "block/wood_support_oak")
    );

    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state,
                                    @Nullable Direction side,
                                    RandomSource rand, ModelData modelData,
                                    @Nullable RenderType renderType) {
        List<BakedQuad> original = super.getQuads(state, side, rand);

        float dy = 0;
        if(state==null) return  original;

      //  DisplayDelight.LOGGER.info("state: "+state.getBlock());

        Predicate<BakedQuad> quadFilter;

        if(state.getBlock() instanceof SmallPlatedFoodBlock && state.getValue(SmallPlatedFoodBlock.PLATE_HIDDEN)){
            dy = -0.0625f;
            quadFilter = quad -> !isFromElement(quad, 4, 0, 4, 12, 1, 12);
        }
        else if(state.getBlock() instanceof AbstractStackablePlatedFoodBlock && state.getValue(AbstractStackablePlatedFoodBlock.PLATE_HIDDEN)){
            dy = -0.125f;
            quadFilter = quad -> !isFromElement(quad, 1,0,1,15,2,15);
        }
        else return original;

        final  float dy2 =  dy;

        return original.stream()
                .filter(quadFilter)
                .map(quad -> translateQuad(quad,  dy2))
                .toList();
    }

    private boolean isFromElement(BakedQuad quad,
                                  float fromX, float fromY, float fromZ,
                                  float toX, float toY, float toZ) {
        float minX = fromX / 16f, minY = fromY / 16f, minZ = fromZ / 16f;
        float maxX = toX / 16f,   maxY = toY / 16f,   maxZ = toZ / 16f;

        int[] verts = quad.getVertices();
        for (int i = 0; i < 4; i++) {
            int base = i * 8;
            float x = Float.intBitsToFloat(verts[base]);
            float y = Float.intBitsToFloat(verts[base + 1]);
            float z = Float.intBitsToFloat(verts[base + 2]);

            // Check if this vertex is outside the element's bounds
            if (x < minX - 0.001f || x > maxX + 0.001f ||
                    y < minY - 0.001f || y > maxY + 0.001f ||
                    z < minZ - 0.001f || z > maxZ + 0.001f) {
                return false;
            }
        }
        return true;
    }

    private BakedQuad translateQuad(BakedQuad quad,  float dy) {
        ResourceLocation spriteName = quad.getSprite().contents().name();
        if (EXCLUDED_SPRITES.contains(spriteName)) {
            return quad;
        }

        int[] vertices = quad.getVertices().clone();
        // Vertex format: x, y, z, color, u, v, light (7 ints per vertex, 4 vertices)
        for (int i = 0; i < 4; i++) {
            int base = i * 8; // stride is 8 ints in modern format
            float y = Float.intBitsToFloat(vertices[base + 1]);
            vertices[base + 1] = Float.floatToRawIntBits(y + dy);
        }
        return new BakedQuad(vertices, quad.getTintIndex(), quad.getDirection(),
                quad.getSprite(), quad.isShade());
    }

}