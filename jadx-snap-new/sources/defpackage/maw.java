package defpackage;

import defpackage.lqf.b.b.c;
import defpackage.mbh.b;

/* renamed from: maw */
public final class maw implements ajdu<b, b> {
    final ajxe a = ajxh.a(new b(this));
    final ajdp<lqf> b;

    /* renamed from: maw$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.lqf.b>> {
        private /* synthetic */ maw a;

        /* renamed from: maw$b$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lqf.b;
            }
        }

        b(maw maw) {
            this.a = maw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.a.b.a((ajfl) a.a).a(defpackage.lqf.b.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            return a;
        }
    }

    /* renamed from: maw$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ maw a;

        a(maw maw) {
            this.a = maw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (b) obj;
            akcr.b(obj, "viewModel");
            if (obj instanceof b.b) {
                return ((ajdp) this.a.a.b()).p(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        lqf.b bVar = (lqf.b) obj;
                        akcr.b(bVar, "cameraLifecycle");
                        if ((bVar instanceof c) || (bVar instanceof defpackage.lqf.b.b.a) || (bVar instanceof defpackage.lqf.b.a)) {
                            return defpackage.mbh.b.a.a;
                        }
                        obj = obj;
                        akcr.a(obj, "viewModel");
                        return obj;
                    }
                });
            }
            if (akcr.a(obj, defpackage.mbh.b.a.a)) {
                return ajdp.b(obj);
            }
            throw new ajxk();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(maw.class), "openedCamera", "getOpenedCamera()Lio/reactivex/Observable;");
    }

    public maw(ajdp<lqf> ajdp) {
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
