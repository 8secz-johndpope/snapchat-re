package defpackage;

import defpackage.lqh.b;

/* renamed from: lph */
public final class lph implements mhi<mha> {
    private static /* synthetic */ aken[] b = new aken[]{new akda(akde.a(lph.class), "observable", "<v#0>")};
    final mhi<? extends mha> a;
    private final lpj c;

    /* renamed from: lph$b */
    static final class b extends akcs implements akbk<ajdp<Object>> {
        private /* synthetic */ lph a;

        b(lph lph) {
            this.a = lph;
            super(0);
        }

        private ajdp<Object> a() {
            return ajpy.k(((mha) this.a.a.a()).b()).a();
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: lph$a */
    public static final class a implements mha {
        final /* synthetic */ ajxe a;
        private /* synthetic */ lqh b;
        private /* synthetic */ aken c;

        /* renamed from: lph$a$a */
        public static final class a<T1, T2> implements ajey<b, b> {
            public static final a a = new a();

            public final /* synthetic */ boolean test(Object obj, Object obj2) {
                b bVar = (b) obj;
                obj2 = (b) obj2;
                akcr.b(bVar, "old");
                akcr.b(obj2, "new");
                if (bVar instanceof defpackage.lqh.b.a) {
                    return obj2 instanceof defpackage.lqh.b.a;
                }
                if (bVar instanceof b.b) {
                    return akcr.a(obj2, b.b.a);
                }
                throw new ajxk();
            }
        }

        /* renamed from: lph$a$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.lqh.b bVar = (defpackage.lqh.b) obj;
                akcr.b(bVar, "result");
                if (bVar instanceof defpackage.lqh.b.a) {
                    return (ajdp) this.a.a.b();
                }
                if (bVar instanceof defpackage.lqh.b.b) {
                    return ajvo.a(ajot.a);
                }
                throw new ajxk();
            }
        }

        a(lqh lqh, ajxe ajxe, aken aken) {
            this.b = lqh;
            this.a = ajxe;
            this.c = aken;
        }

        public final ajej a() {
            Object a = this.b.b().a((ajey) a.a);
            akcr.a(a, "distinctUntilChanged { o…activated\n        }\n    }");
            a = a.u(new b(this)).l();
            akcr.a(a, "cameraUseCase.whenActiva…             .subscribe()");
            return a;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public lph(lpj lpj, mhi<? extends mha> mhi) {
        akcr.b(lpj, "component");
        akcr.b(mhi, "attachableBuilder");
        this.c = lpj;
        this.a = mhi;
    }

    public final /* synthetic */ Object a() {
        return new a(this.c.c(), ajxh.a(new b(this)), b[0]);
    }
}
