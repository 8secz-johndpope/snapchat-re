package defpackage;

import defpackage.mhs.b;

/* renamed from: mjg */
final class mjg {
    private final b a;
    private final lny b;
    private final mhs c;

    public mjg(b bVar, lny lny, mhs mhs) {
        akcr.b(bVar, "assetId");
        akcr.b(lny, "type");
        akcr.b(mhs, "avatarId");
        this.a = bVar;
        this.b = lny;
        this.c = mhs;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.mjg;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.mjg) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.c;
        r3 = r3.c;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        b bVar = this.a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        lny lny = this.b;
        hashCode = (hashCode + (lny != null ? lny.hashCode() : 0)) * 31;
        mhs mhs = this.c;
        if (mhs != null) {
            i = mhs.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AssetCacheKey(assetId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.b);
        stringBuilder.append(", avatarId=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
