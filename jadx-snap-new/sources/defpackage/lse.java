package defpackage;

import defpackage.lsa.a;
import java.util.List;

/* renamed from: lse */
final class lse {
    final akbl<mux, Boolean> a = a.a;
    final akbl<mux, Boolean> b = b.a;
    final lrd c;
    final a d;
    final List<mux> e;

    /* renamed from: lse$a */
    static final class a extends akcs implements akbl<mux, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            return Boolean.valueOf(mux.i.a.a(mvb.FRONT_FACING));
        }
    }

    /* renamed from: lse$b */
    static final class b extends akcs implements akbl<mux, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            return Boolean.valueOf(mux.i.a.a(mvb.REAR_FACING));
        }
    }

    public lse(lrd lrd, a aVar, List<mux> list) {
        akcr.b(lrd, "cameraFlipEvent");
        akcr.b(aVar, "action");
        akcr.b(list, "lenses");
        this.c = lrd;
        this.d = aVar;
        this.e = list;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.lse;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.lse) r3;
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.e;
        r3 = r3.e;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        lrd lrd = this.c;
        int i = 0;
        int hashCode = (lrd != null ? lrd.hashCode() : 0) * 31;
        a aVar = this.d;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompositeEvent(cameraFlipEvent=");
        stringBuilder.append(this.c);
        stringBuilder.append(", action=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lenses=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
