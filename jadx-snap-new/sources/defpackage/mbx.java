package defpackage;

import defpackage.lqf.b.b.c;
import defpackage.mbw.a;
import defpackage.mbw.a.b;

/* renamed from: mbx */
public final class mbx implements ajdu<a, a> {
    final ajxe a = ajxh.a(new b(this));
    final ajdp<lqf> b;

    /* renamed from: mbx$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.lqf.b>> {
        private /* synthetic */ mbx a;

        /* renamed from: mbx$b$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lqf.b;
            }
        }

        b(mbx mbx) {
            this.a = mbx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.a.b.a((ajfl) a.a).a(defpackage.lqf.b.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            return a;
        }
    }

    /* renamed from: mbx$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mbx a;

        a(mbx mbx) {
            this.a = mbx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (defpackage.mbw.a) obj;
            akcr.b(obj, "viewModel");
            if (obj instanceof b) {
                return ((ajdp) this.a.a.b()).p(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        lqf.b bVar = (lqf.b) obj;
                        akcr.b(bVar, "cameraLifecycle");
                        if ((bVar instanceof c) || (bVar instanceof defpackage.lqf.b.b.a) || (bVar instanceof defpackage.lqf.b.a)) {
                            return defpackage.mbw.a.a.a;
                        }
                        obj = obj;
                        akcr.a(obj, "viewModel");
                        return obj;
                    }
                });
            }
            if (akcr.a(obj, defpackage.mbw.a.a.a)) {
                return ajdp.b(obj);
            }
            throw new ajxk();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mbx.class), "openedCamera", "getOpenedCamera()Lio/reactivex/Observable;");
    }

    public mbx(ajdp<lqf> ajdp) {
        akcr.b(ajdp, "cameraLifecycle");
        this.b = ajdp;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object u = ajdp.u(new a(this));
        akcr.a(u, "upstream.switchMap { vie…)\n            }\n        }");
        return (ajdt) u;
    }
}
