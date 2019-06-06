package com.snap.composer.attributes.conversions;

import android.graphics.Color;
import defpackage.akco;

public final class ColorConversions {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final int fromRGBA(long j) {
            return Color.argb((int) (j & 255), (int) ((j >> 24) & 255), (int) ((j >> 16) & 255), (int) ((j >> 8) & 255));
        }
    }
}
