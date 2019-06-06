package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;

@Keep
public final class RichMediaItemProperties {
    private final boolean shareable;

    public RichMediaItemProperties(boolean z) {
        this.shareable = z;
    }

    public static /* synthetic */ RichMediaItemProperties copy$default(RichMediaItemProperties richMediaItemProperties, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = richMediaItemProperties.shareable;
        }
        return richMediaItemProperties.copy(z);
    }

    public final boolean component1() {
        return this.shareable;
    }

    public final RichMediaItemProperties copy(boolean z) {
        return new RichMediaItemProperties(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RichMediaItemProperties) {
                if ((this.shareable == ((RichMediaItemProperties) obj).shareable ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getShareable() {
        return this.shareable;
    }

    public final int hashCode() {
        boolean z = this.shareable;
        return z ? 1 : z;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RichMediaItemProperties(shareable=");
        stringBuilder.append(this.shareable);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
