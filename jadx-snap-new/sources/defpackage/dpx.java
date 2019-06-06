package defpackage;

import com.snap.core.db.record.StorySnapModel;

/* renamed from: dpx */
public final class dpx {
    public final dpw a;
    public final aepx b;

    public dpx(dpw dpw, aepx aepx) {
        akcr.b(dpw, "lensesCameraLifecycle");
        akcr.b(aepx, StorySnapModel.LENSMETADATA);
        this.a = dpw;
        this.b = aepx;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.dpx;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.dpx) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        dpw dpw = this.a;
        int i = 0;
        int hashCode = (dpw != null ? dpw.hashCode() : 0) * 31;
        aepx aepx = this.b;
        if (aepx != null) {
            i = aepx.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensesCameraLifecycleWithAnalytics(lensesCameraLifecycle=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lensMetadata=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
