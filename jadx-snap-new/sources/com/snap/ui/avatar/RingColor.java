package com.snap.ui.avatar;

import defpackage.akco;

public final class RingColor {
    private final int endColor;
    private final int startColor;

    public RingColor(int i, int i2) {
        this.startColor = i;
        this.endColor = i2;
    }

    public /* synthetic */ RingColor(int i, int i2, int i3, akco akco) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        this(i, i2);
    }

    public static /* synthetic */ RingColor copy$default(RingColor ringColor, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ringColor.startColor;
        }
        if ((i3 & 2) != 0) {
            i2 = ringColor.endColor;
        }
        return ringColor.copy(i, i2);
    }

    public final int component1() {
        return this.startColor;
    }

    public final int component2() {
        return this.endColor;
    }

    public final RingColor copy(int i, int i2) {
        return new RingColor(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RingColor) {
                RingColor ringColor = (RingColor) obj;
                if ((this.startColor == ringColor.startColor ? 1 : null) != null) {
                    if ((this.endColor == ringColor.endColor ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final int hashCode() {
        return (this.startColor * 31) + this.endColor;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RingColor(startColor=");
        stringBuilder.append(this.startColor);
        stringBuilder.append(", endColor=");
        stringBuilder.append(this.endColor);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
