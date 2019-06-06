package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.akcr;

@Keep
public final class OverlayContent {
    @SerializedName("docking")
    private final String docking;
    @SerializedName("overlay")
    private final String overlay;
    @SerializedName("z_index")
    private final int zIndex;

    public OverlayContent(String str, int i, String str2) {
        this.docking = str;
        this.zIndex = i;
        this.overlay = str2;
    }

    public static /* synthetic */ OverlayContent copy$default(OverlayContent overlayContent, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = overlayContent.docking;
        }
        if ((i2 & 2) != 0) {
            i = overlayContent.zIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = overlayContent.overlay;
        }
        return overlayContent.copy(str, i, str2);
    }

    public final String component1() {
        return this.docking;
    }

    public final int component2() {
        return this.zIndex;
    }

    public final String component3() {
        return this.overlay;
    }

    public final OverlayContent copy(String str, int i, String str2) {
        return new OverlayContent(str, i, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OverlayContent) {
                OverlayContent overlayContent = (OverlayContent) obj;
                if (akcr.a(this.docking, overlayContent.docking)) {
                    if ((this.zIndex == overlayContent.zIndex ? 1 : null) == null || !akcr.a(this.overlay, overlayContent.overlay)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getDocking() {
        return this.docking;
    }

    public final String getOverlay() {
        return this.overlay;
    }

    public final int getZIndex() {
        return this.zIndex;
    }

    public final int hashCode() {
        String str = this.docking;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.zIndex) * 31;
        String str2 = this.overlay;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OverlayContent(docking=");
        stringBuilder.append(this.docking);
        stringBuilder.append(", zIndex=");
        stringBuilder.append(this.zIndex);
        stringBuilder.append(", overlay=");
        stringBuilder.append(this.overlay);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
