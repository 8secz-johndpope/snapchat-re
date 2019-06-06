package defpackage;

import defpackage.mil.a;
import defpackage.mmi.d;

/* renamed from: kxp */
public final class kxp implements ajdu<mmt, mmt> {
    final ajec<d, d> a;

    /* renamed from: kxp$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ kxp a;

        a(kxp kxp) {
            this.a = kxp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            return new kxy(mmt, this.a.a);
        }
    }

    private /* synthetic */ kxp() {
        this(a.a);
    }

    public kxp(ajec<d, d> ajec) {
        akcr.b(ajec, "filterRequestTransformer");
        this.a = ajec;
    }

    public final ajdt<mmt> apply(ajdp<mmt> ajdp) {
        akcr.b(ajdp, "upstream");
        Object p = ajdp.p(new a(this));
        akcr.a(p, "upstream.map { lensCore …lterRequestTransformer) }");
        return (ajdt) p;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.kxp) r2).a) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof defpackage.kxp;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (defpackage.kxp) r2;
        r0 = r1.a;
        r2 = r2.a;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ajec ajec = this.a;
        return ajec != null ? ajec.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DelegateLensCoreObservableTransformer(filterRequestTransformer=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
