package com.jkvin114.displaydelight.client.renderer;

import com.mojang.blaze3d.vertex.VertexConsumer;

public class AlphaOverrideVertexConsumer implements VertexConsumer {

    private final VertexConsumer delegate;
    private final float alpha;

    public AlphaOverrideVertexConsumer(VertexConsumer delegate, float alpha) {
        this.delegate = delegate;
        this.alpha = alpha;
    }

    @Override
    public VertexConsumer setColor(int r, int g, int b, int a) {
        // Override alpha, keep RGB intact
        return delegate.setColor(r, g, b, (int)(alpha * 255));
    }

    // Delegate everything else unchanged
    @Override public VertexConsumer addVertex(float x, float y, float z) { return delegate.addVertex(x, y, z); }
    @Override public VertexConsumer setUv(float u, float v) { return delegate.setUv(u, v); }
    @Override public VertexConsumer setUv1(int u, int v) { return delegate.setUv1(u, v); }
    @Override public VertexConsumer setUv2(int u, int v) { return delegate.setUv2(u, v); }
    @Override public VertexConsumer setNormal(float x, float y, float z) { return delegate.setNormal(x, y, z); }
    @Override public VertexConsumer setWhiteAlpha(int alpha) { return delegate.setWhiteAlpha(alpha); }
}