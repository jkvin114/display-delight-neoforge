package com.jkvin114.displaydelight.client.renderer;

import com.jkvin114.displaydelight.blockentity.ShowcaseBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.Random;

public class ShowcaseRenderer implements BlockEntityRenderer<ShowcaseBlockEntity> {

    public ShowcaseRenderer(BlockEntityRendererProvider.Context pContext) {
    }

    /*
    @Override
    public void render(ShowcaseBlockEntity be, float partialTick, PoseStack ps,
                       MultiBufferSource buffers, int light, int overlay) {
        BlockState stateToRender = be.getStoredState();
        if (stateToRender == null || stateToRender.isAir()) return;

        Minecraft mc = Minecraft.getInstance();

        ps.pushPose();
        ps.translate(0, 0, 0);

        // Use a separate BufferSource that includes the translucent sheet
        MultiBufferSource.BufferSource bufferSource = mc.renderBuffers().bufferSource();

        mc.getBlockRenderer().renderSingleBlock(
                stateToRender,
                ps,
                bufferSource,   // <-- use bufferSource, NOT the passed-in buffers
                light,
                overlay
        );

        // Must end the batch immediately, otherwise translucent geometry
        // gets deferred and may never flush inside a BER context
        bufferSource.endLastBatch();

        ps.popPose();

    }*/
    private static final RandomSource RANDOM = RandomSource.create();

    private BlockState cachedState = null;
    private BakedModel cachedModel = null;

    private BakedModel getModel(BlockState state) {
        if (state != cachedState) {
            cachedState = state;
            cachedModel = Minecraft.getInstance()
                    .getBlockRenderer()
                    .getBlockModelShaper()
                    .getBlockModel(state);
        }
        return cachedModel;
    }

    @Override
    public void render(ShowcaseBlockEntity be, float partialTick, PoseStack ps,
                       MultiBufferSource buffers, int light, int overlay) {

        BlockState state = be.getStoredState();
        if (state == null || state.isAir()) return;

        BakedModel model = getModel(state);
        Minecraft mc = Minecraft.getInstance();
        MultiBufferSource.BufferSource bufferSource = mc.renderBuffers().bufferSource();

        ps.pushPose();
        ps.translate(0.0, 0, 0.0);

        PoseStack.Pose pose = ps.last();
        BlockColors blockColors = mc.getBlockColors();


        for (Direction dir : Direction.values()) {
            RANDOM.setSeed(42L);
            renderQuads(model.getQuads(state, dir, RANDOM), state, pose,
                    bufferSource, blockColors, light, overlay);
        }
        RANDOM.setSeed(42L);
        // null direction = unculled quads
        renderQuads(model.getQuads(state, null, RANDOM), state, pose,
                bufferSource, blockColors, light, overlay);

  //      bufferSource.endLastBatch();
        ps.popPose();
    }
    private void renderQuads(List<BakedQuad> quads, BlockState state,
                             PoseStack.Pose pose, MultiBufferSource bufferSource,
                             BlockColors blockColors, int light, int overlay) {
        if (quads.isEmpty()) return;

        VertexConsumer consumer = bufferSource.getBuffer(ItemBlockRenderTypes.getRenderType(state,true));

        for (BakedQuad quad : quads) {
            int color = quad.isTinted()
                    ? blockColors.getColor(state, null, null, quad.getTintIndex())
                    : 0xFFFFFF;

            float r = (color >> 16 & 255) / 255f;
            float g = (color >> 8  & 255) / 255f;
            float b = (color       & 255) / 255f;

            consumer.putBulkData(pose, quad, r, g, b, 1.0f, light, overlay);
        }
    }

}
