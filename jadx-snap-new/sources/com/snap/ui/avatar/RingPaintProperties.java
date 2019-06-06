package com.snap.ui.avatar;

import android.graphics.Paint.Style;
import defpackage.akcr;

public final class RingPaintProperties {
    private final RingColor ringColor;
    private final float strokeWidth;
    private final Style style;

    public RingPaintProperties(Style style, float f, RingColor ringColor) {
        akcr.b(style, "style");
        akcr.b(ringColor, "ringColor");
        this.style = style;
        this.strokeWidth = f;
        this.ringColor = ringColor;
    }

    public static /* synthetic */ RingPaintProperties copy$default(RingPaintProperties ringPaintProperties, Style style, float f, RingColor ringColor, int i, Object obj) {
        if ((i & 1) != 0) {
            style = ringPaintProperties.style;
        }
        if ((i & 2) != 0) {
            f = ringPaintProperties.strokeWidth;
        }
        if ((i & 4) != 0) {
            ringColor = ringPaintProperties.ringColor;
        }
        return ringPaintProperties.copy(style, f, ringColor);
    }

    public final Style component1() {
        return this.style;
    }

    public final float component2() {
        return this.strokeWidth;
    }

    public final RingColor component3() {
        return this.ringColor;
    }

    public final RingPaintProperties copy(Style style, float f, RingColor ringColor) {
        akcr.b(style, "style");
        akcr.b(ringColor, "ringColor");
        return new RingPaintProperties(style, f, ringColor);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.ringColor, r3.ringColor) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.ui.avatar.RingPaintProperties;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.ui.avatar.RingPaintProperties) r3;
        r0 = r2.style;
        r1 = r3.style;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.strokeWidth;
        r1 = r3.strokeWidth;
        r0 = java.lang.Float.compare(r0, r1);
        if (r0 != 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.ringColor;
        r3 = r3.ringColor;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.avatar.RingPaintProperties.equals(java.lang.Object):boolean");
    }

    public final RingColor getRingColor() {
        return this.ringColor;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final int hashCode() {
        Style style = this.style;
        int i = 0;
        int hashCode = (((style != null ? style.hashCode() : 0) * 31) + Float.floatToIntBits(this.strokeWidth)) * 31;
        RingColor ringColor = this.ringColor;
        if (ringColor != null) {
            i = ringColor.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RingPaintProperties(style=");
        stringBuilder.append(this.style);
        stringBuilder.append(", strokeWidth=");
        stringBuilder.append(this.strokeWidth);
        stringBuilder.append(", ringColor=");
        stringBuilder.append(this.ringColor);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
