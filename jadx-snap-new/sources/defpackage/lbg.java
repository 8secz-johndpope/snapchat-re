package defpackage;

import defpackage.mnk.b;
import defpackage.mnk.c;

/* renamed from: lbg */
public final class lbg implements ajdu<mmt, mmt> {
    final ajxe a;
    final akbk<mmt> b;
    private final mni c;

    /* renamed from: lbg$1 */
    static final class 1 extends akcs implements akbk<mot> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new mot();
        }
    }

    /* renamed from: lbg$b */
    static final class b extends akcs implements akbk<ajdp<mmt>> {
        private /* synthetic */ lbg a;

        b(lbg lbg) {
            this.a = lbg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b(this.a.b.invoke());
        }
    }

    /* renamed from: lbg$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lbg a;
        private /* synthetic */ ajdp b;

        a(lbg lbg, ajdp ajdp) {
            this.a = lbg;
            this.b = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mnk mnk = (mnk) obj;
            akcr.b(mnk, "status");
            if (mnk instanceof b) {
                return this.b;
            }
            if ((mnk instanceof defpackage.mnk.a) || (mnk instanceof c)) {
                obj = (ajdp) this.a.a.b();
                akcr.a(obj, "stubLensCore");
                return obj;
            }
            throw new ajxk();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lbg.class), "stubLensCore", "getStubLensCore()Lio/reactivex/Observable;");
    }

    public /* synthetic */ lbg(mni mni) {
        this(mni, 1.a);
    }

    private lbg(mni mni, akbk<? extends mmt> akbk) {
        akcr.b(mni, "nativeSupportAssessor");
        akcr.b(akbk, "stubLensCoreProvider");
        this.c = mni;
        this.b = akbk;
        this.a = ajxh.a(new b(this));
    }

    public final ajdt<mmt> apply(ajdp<mmt> ajdp) {
        akcr.b(ajdp, "upstream");
        Object d = this.c.a().d((ajfc) new a(this, ajdp));
        akcr.a(d, "nativeSupportAssessor.as…      }\n                }");
        return (ajdt) d;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.lbg;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.lbg) r3;
        r0 = r2.c;
        r1 = r3.c;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        mni mni = this.c;
        int i = 0;
        int hashCode = (mni != null ? mni.hashCode() : 0) * 31;
        akbk akbk = this.b;
        if (akbk != null) {
            i = akbk.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StubIfNativeSupportNotAvailableLensCoreObservableTransformer(nativeSupportAssessor=");
        stringBuilder.append(this.c);
        stringBuilder.append(", stubLensCoreProvider=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
