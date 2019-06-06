package com.brightcove.player.render;

import com.brightcove.player.display.ExoPlayerVideoDisplayComponent.RendererBuilder;
import com.brightcove.player.model.RendererConfig;

public abstract class AbstractRendererBuilder implements RendererBuilder {
    private RendererConfig a;

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        RendererConfig rendererConfig = this.a;
        return (rendererConfig == null || rendererConfig.getHttpReadTimeoutMillis() <= 0) ? 8000 : this.a.getHttpReadTimeoutMillis();
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        RendererConfig rendererConfig = this.a;
        return (rendererConfig == null || rendererConfig.getHttpConnectTimeoutMillis() <= 0) ? 8000 : this.a.getHttpConnectTimeoutMillis();
    }

    public void setRendererConfig(RendererConfig rendererConfig) {
        this.a = rendererConfig;
    }
}
