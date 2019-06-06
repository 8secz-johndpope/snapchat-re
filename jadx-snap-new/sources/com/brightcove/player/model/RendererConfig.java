package com.brightcove.player.model;

public class RendererConfig {
    int a;
    int b;

    public static final class Builder {
        private int a;
        private int b;

        public final RendererConfig build() {
            RendererConfig rendererConfig = new RendererConfig();
            rendererConfig.a = this.a;
            rendererConfig.b = this.b;
            return rendererConfig;
        }

        public final Builder setHttpConnectTimeoutMillis(int i) {
            this.b = i;
            return this;
        }

        public final Builder setHttpReadTimeoutMillis(int i) {
            this.a = i;
            return this;
        }
    }

    private RendererConfig() {
    }

    /* synthetic */ RendererConfig(byte b) {
        this();
    }

    public int getHttpConnectTimeoutMillis() {
        return this.b;
    }

    public int getHttpReadTimeoutMillis() {
        return this.a;
    }
}
