package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: leo */
final class leo {
    final ajdj<miq> a;
    final ajej b;
    final moc c;
    final AtomicReference<miq> d;

    public leo(ajdj<miq> ajdj, ajej ajej, moc moc, AtomicReference<miq> atomicReference) {
        akcr.b(ajdj, "uriResolve");
        akcr.b(ajej, "upstreamDisposable");
        akcr.b(moc, "request");
        akcr.b(atomicReference, "uriReference");
        this.a = ajdj;
        this.b = ajej;
        this.c = moc;
        this.d = atomicReference;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.leo;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.leo) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ajdj ajdj = this.a;
        int i = 0;
        int hashCode = (ajdj != null ? ajdj.hashCode() : 0) * 31;
        ajej ajej = this.b;
        hashCode = (hashCode + (ajej != null ? ajej.hashCode() : 0)) * 31;
        moc moc = this.c;
        hashCode = (hashCode + (moc != null ? moc.hashCode() : 0)) * 31;
        AtomicReference atomicReference = this.d;
        if (atomicReference != null) {
            i = atomicReference.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestHolder(uriResolve=");
        stringBuilder.append(this.a);
        stringBuilder.append(", upstreamDisposable=");
        stringBuilder.append(this.b);
        stringBuilder.append(", request=");
        stringBuilder.append(this.c);
        stringBuilder.append(", uriReference=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
