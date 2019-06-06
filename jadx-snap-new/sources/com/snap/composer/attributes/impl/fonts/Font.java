package com.snap.composer.attributes.impl.fonts;

import android.graphics.Typeface;
import defpackage.akcr;

public final class Font {
    private final Typeface a;
    private final float b;

    public Font(Typeface typeface, float f) {
        akcr.b(typeface, "typeface");
        this.a = typeface;
        this.b = f;
    }

    public static /* synthetic */ Font copy$default(Font font, Typeface typeface, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            typeface = font.a;
        }
        if ((i & 2) != 0) {
            f = font.b;
        }
        return font.copy(typeface, f);
    }

    public final Typeface component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final Font copy(Typeface typeface, float f) {
        akcr.b(typeface, "typeface");
        return new Font(typeface, f);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (java.lang.Float.compare(r2.b, r3.b) == 0) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.attributes.impl.fonts.Font;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.composer.attributes.impl.fonts.Font) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
        r3 = java.lang.Float.compare(r0, r3);
        if (r3 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.fonts.Font.equals(java.lang.Object):boolean");
    }

    public final float getSize() {
        return this.b;
    }

    public final Typeface getTypeface() {
        return this.a;
    }

    public final int hashCode() {
        Typeface typeface = this.a;
        return ((typeface != null ? typeface.hashCode() : 0) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Font(typeface=");
        stringBuilder.append(this.a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
