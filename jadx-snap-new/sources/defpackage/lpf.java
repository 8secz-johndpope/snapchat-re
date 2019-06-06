package defpackage;

import defpackage.lqh.b;

/* renamed from: lpf */
public final class lpf implements mhi<mha> {
    private final lpj a;
    private final mhi<may> b;

    /* renamed from: lpf$a */
    public static final class a implements mha {
        final /* synthetic */ ajdp a;
        private /* synthetic */ lqh b;
        private /* synthetic */ mbg c;

        /* renamed from: lpf$a$b */
        public static final class b<T1, T2> implements ajey<defpackage.lqh.b, defpackage.lqh.b> {
            public static final b a = new b();

            public final /* synthetic */ boolean test(Object obj, Object obj2) {
                defpackage.lqh.b bVar = (defpackage.lqh.b) obj;
                obj2 = (defpackage.lqh.b) obj2;
                akcr.b(bVar, "old");
                akcr.b(obj2, "new");
                if (bVar instanceof defpackage.lqh.b.a) {
                    return obj2 instanceof defpackage.lqh.b.a;
                }
                if (bVar instanceof defpackage.lqh.b.b) {
                    return akcr.a(obj2, defpackage.lqh.b.b.a);
                }
                throw new ajxk();
            }
        }

        /* renamed from: lpf$a$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            c(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                b bVar = (b) obj;
                akcr.b(bVar, "it");
                if (bVar instanceof defpackage.lqh.b.a) {
                    return ajdp.b(defpackage.mbg.a.b.a);
                }
                if (bVar instanceof b.b) {
                    return this.a.a.a((ajfc) lpg.a);
                }
                throw new ajxk();
            }
        }

        /* renamed from: lpf$a$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof mbg.b.b;
            }
        }

        /* renamed from: lpf$a$d */
        static final class d<T, R> implements ajfc<T, R> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((mbg.b.b) obj, "it");
                return new defpackage.lqh.a.a.b("AttachLensButtonToCamera", 3);
            }
        }

        a(lqh lqh, ajdp ajdp, mbg mbg) {
            this.b = lqh;
            this.a = ajdp;
            this.c = mbg;
        }

        public final ajej a() {
            ajei ajei = new ajei();
            Object a = this.b.b().a((ajey) b.a);
            akcr.a(a, "distinctUntilChanged { o…activated\n        }\n    }");
            ajei.a(a.u(new c(this)).f(this.c.a()));
            a = this.c.b().a((ajfl) a.a).a(mbg.b.b.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            ajei.a(a.p(d.a).f(this.b.a()));
            return ajei;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public lpf(lpj lpj, mhi<may> mhi) {
        akcr.b(lpj, "cameraComponent");
        akcr.b(mhi, "lensButtonBuilder");
        this.a = lpj;
        this.b = mhi;
    }

    public final /* synthetic */ Object a() {
        may may = (may) this.b.a();
        return new a(this.a.c(), may.b(), may.i());
    }
}
