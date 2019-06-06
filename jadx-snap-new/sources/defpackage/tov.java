package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: tov */
public final class tov {
    @SerializedName("paletteType")
    public final tou a;
    @SerializedName("colorPosition")
    public final float b;

    private /* synthetic */ tov() {
        this(tou.DEFAULT, -1.0f);
    }

    public tov(tou tou, float f) {
        akcr.b(tou, "paletteType");
        this.a = tou;
        this.b = f;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (java.lang.Float.compare(r2.b, r3.b) == 0) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.tov;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.tov) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tov.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        tou tou = this.a;
        return ((tou != null ? tou.hashCode() : 0) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ColorState(paletteType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", colorPosition=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
