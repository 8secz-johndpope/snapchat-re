package defpackage;

import defpackage.mid.a;
import defpackage.mmi.d;
import java.util.concurrent.TimeUnit;

/* renamed from: kwx */
final class kwx implements mid<d, Boolean> {
    final mmt a;
    private final ajec<d, d> b;

    /* renamed from: kwx$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ kwx a;

        a(kwx kwx) {
            this.a = kwx;
        }

        private ajdx<Boolean> a(d dVar) {
            akcr.b(dVar, "request");
            return this.a.a.a().a().b(dVar);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((d) obj);
        }
    }

    public kwx(mmt mmt, ajec<d, d> ajec) {
        akcr.b(mmt, "lensCore");
        akcr.b(ajec, "transformer");
        this.a = mmt;
        this.b = ajec;
    }

    private ajdx<Boolean> a(d dVar) {
        akcr.b(dVar, "input");
        Object a = ajdx.b((Object) dVar).a(this.b).a((ajfc) new a(this));
        akcr.a(a, "Single.just(input)\n     …uest)\n                } }");
        return a;
    }

    public final ajdp<min> a(long j, TimeUnit timeUnit) {
        akcr.b(timeUnit, "timeUnit");
        return a.a(timeUnit);
    }

    public final /* synthetic */ ajdx b(Object obj) {
        return a((d) obj);
    }

    public final /* synthetic */ ajdp c(Object obj) {
        d dVar = (d) obj;
        akcr.b(dVar, "input");
        return a.a(this, dVar);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.kwx;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.kwx) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        mmt mmt = this.a;
        int i = 0;
        int hashCode = (mmt != null ? mmt.hashCode() : 0) * 31;
        ajec ajec = this.b;
        if (ajec != null) {
            i = ajec.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApplyFilterWithTransformer(lensCore=");
        stringBuilder.append(this.a);
        stringBuilder.append(", transformer=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
