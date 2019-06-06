package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: gog */
public final class gog implements gnj {
    final ajwl<Boolean> a;
    final ajwl<Boolean> b;
    final ajwl<Boolean> c;
    final ajxe d;
    final zfw e = zgb.a(gef.a.callsite(goh.a));
    private final ajxe f;

    /* renamed from: gog$e */
    static final class e extends akcs implements akbk<idm> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (idm) this.a.get();
        }
    }

    /* renamed from: gog$a */
    static final class a extends akcs implements akbk<gni> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gni) this.a.get();
        }
    }

    /* renamed from: gog$d */
    static final class d implements Runnable {
        private /* synthetic */ gog a;

        d(gog gog) {
            this.a = gog;
        }

        public final void run() {
            this.a.a.a(Boolean.FALSE);
        }
    }

    /* renamed from: gog$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ gog a;
        private /* synthetic */ idl b;

        b(gog gog, idl idl) {
            this.a = gog;
            this.b = idl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            gog gog = this.a;
            idl idl = this.b;
            if (!booleanValue) {
                obj = gog.a().c > 0 ? gog.b.c((long) gog.a().c, TimeUnit.SECONDS, gog.e.b()) : gog.b;
                akcr.a(obj, "when {\n                /… neverReady\n            }");
                return obj;
            } else if (gog.a().a) {
                return gog.c;
            } else {
                obj = ((idm) gog.d.b()).a().p(new c(idl));
                akcr.a(obj, "uiPageManager.observeAct…== targetPage.hierarchy }");
                return obj;
            }
        }
    }

    /* renamed from: gog$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ idl a;

        c(idl idl) {
            this.a = idl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            idl idl = (idl) obj;
            akcr.b(idl, "it");
            return Boolean.valueOf(akcr.a(idl.getHierarchy(), this.a.getHierarchy()));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gog.class), "uiPageManager", "getUiPageManager()Lcom/snap/framework/attribution/UiPageManager;"), new akdc(akde.a(gog.class), "config", "getConfig()Lcom/snap/core/prefetch/api/ForegroundPrefetchConfiguration;")};
    }

    public gog(ajwy<idm> ajwy, ajwy<gni> ajwy2, zgb zgb) {
        akcr.b(ajwy, "uiPageManagerProvider");
        akcr.b(ajwy2, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Boolean>()");
        this.a = ajwl;
        ajwl = ajwl.i(Boolean.FALSE);
        akcr.a(ajwl, "BehaviorSubject.createDefault<Boolean>(false)");
        this.b = ajwl;
        ajwl = ajwl.i(Boolean.TRUE);
        akcr.a(ajwl, "BehaviorSubject.createDefault<Boolean>(true)");
        this.c = ajwl;
        this.d = ajxh.a(new e(ajwy));
        this.f = ajxh.a(new a(ajwy2));
    }

    public final ajdp<Boolean> a(ide ide, idl idl) {
        akcr.b(ide, "feature");
        akcr.b(idl, "targetPage");
        Object j = this.a.j().u(new b(this, idl)).j(ajfu.a);
        akcr.a(j, "onForegroundSubject.seri…  .distinctUntilChanged()");
        return j;
    }

    /* Access modifiers changed, original: final */
    public final gni a() {
        return (gni) this.f.b();
    }
}
