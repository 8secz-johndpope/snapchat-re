package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.zzabh;

@zzabh
public final class NativeAdOptions {
    private final boolean zzamf;
    private final int zzamg;
    private final boolean zzamh;
    private final int zzami;
    private final VideoOptions zzamj;

    public static final class Builder {
        private boolean zzamf = false;
        private int zzamg = -1;
        private boolean zzamh = false;
        private int zzami = 1;
        private VideoOptions zzamj;

        public final NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public final Builder setAdChoicesPlacement(int i) {
            this.zzami = i;
            return this;
        }

        public final Builder setImageOrientation(int i) {
            this.zzamg = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.zzamh = z;
            return this;
        }

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.zzamf = z;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.zzamj = videoOptions;
            return this;
        }
    }

    private NativeAdOptions(Builder builder) {
        this.zzamf = builder.zzamf;
        this.zzamg = builder.zzamg;
        this.zzamh = builder.zzamh;
        this.zzami = builder.zzami;
        this.zzamj = builder.zzamj;
    }

    /* synthetic */ NativeAdOptions(Builder builder, zza zza) {
        this(builder);
    }

    public final int getAdChoicesPlacement() {
        return this.zzami;
    }

    public final int getImageOrientation() {
        return this.zzamg;
    }

    public final VideoOptions getVideoOptions() {
        return this.zzamj;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.zzamh;
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.zzamf;
    }
}
