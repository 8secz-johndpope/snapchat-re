package defpackage;

import com.snap.core.db.column.FeatureType;

/* renamed from: gyv */
public final class gyv {
    final gyt a;
    private final FeatureType b;

    public gyv(FeatureType featureType, gyt gyt) {
        akcr.b(featureType, "type");
        akcr.b(gyt, "strategy");
        this.b = featureType;
        this.a = gyt;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.a, r3.a) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.gyv;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.gyv) r3;
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.a;
        r3 = r3.a;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        FeatureType featureType = this.b;
        int i = 0;
        int hashCode = (featureType != null ? featureType.hashCode() : 0) * 31;
        gyt gyt = this.a;
        if (gyt != null) {
            i = gyt.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackCleanupJobMetadata(type=");
        stringBuilder.append(this.b);
        stringBuilder.append(", strategy=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
