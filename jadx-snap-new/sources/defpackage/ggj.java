package defpackage;

import defpackage.gdx.c;

/* renamed from: ggj */
public final class ggj implements gea {
    private final ygh a;
    private final ged b;
    private final gen c;
    private final c d;

    public ggj(ygh ygh, ged ged, gen gen, c cVar) {
        akcr.b(ygh, "contentFileGroup");
        akcr.b(ged, "contentFileType");
        akcr.b(gen, "contentTtl");
        akcr.b(cVar, "cacheKeyTransformer");
        this.a = ygh;
        this.b = ged;
        this.c = gen;
        this.d = cVar;
    }

    public final ygh a() {
        return this.a;
    }

    public final ygk b() {
        return this.b;
    }

    public final c c() {
        return this.d;
    }

    public final boolean d() {
        return this.c.b;
    }

    public final long e() {
        return this.c.a;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.ggj;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.ggj) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.d;
        r3 = r3.d;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggj.equals(java.lang.Object):boolean");
    }

    public final long f() {
        return this.c.c;
    }

    public final int hashCode() {
        ygh ygh = this.a;
        int i = 0;
        int hashCode = (ygh != null ? ygh.hashCode() : 0) * 31;
        ged ged = this.b;
        hashCode = (hashCode + (ged != null ? ged.hashCode() : 0)) * 31;
        gen gen = this.c;
        hashCode = (hashCode + (gen != null ? gen.hashCode() : 0)) * 31;
        c cVar = this.d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentCachePolicy(contentFileGroup=");
        stringBuilder.append(this.a);
        stringBuilder.append(", contentFileType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", contentTtl=");
        stringBuilder.append(this.c);
        stringBuilder.append(", cacheKeyTransformer=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
