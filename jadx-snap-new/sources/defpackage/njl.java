package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.j.a;
import defpackage.njj.c;
import defpackage.njj.i;
import defpackage.nke.e;
import defpackage.nki.d;

/* renamed from: njl */
public final class njl extends zgi {
    a a = a.ON_CREATE;
    boolean b;
    final Object c = new Object();
    final ajwl<a> d;
    final ajwy<njj> e;
    final ajwy<nke> f;
    final ajwy<nki> g;
    private final ajxe h = ajxh.a(new b(this));
    private final ajxe i = ajxh.a(new c(this));
    private final ajxe j = ajxh.a(new d(this));
    private final ajwy<nkn> k;
    private final ajwy<gpb> l;
    private final zgb m;

    /* renamed from: njl$h */
    static final class h extends akcq implements akbl<abkq, ajxw> {
        h(nkn nkn) {
            super(1, nkn);
        }

        public final String getName() {
            return "onSessionChanged";
        }

        public final akej getOwner() {
            return akde.a(nkn.class);
        }

        public final String getSignature() {
            return "onSessionChanged(Lcom/snapchat/android/core/user/UserSession;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((nkn) this.receiver).a((abkq) obj);
            return ajxw.a;
        }
    }

    /* renamed from: njl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: njl$b */
    static final class b extends akcs implements akbk<njj> {
        private /* synthetic */ njl a;

        b(njl njl) {
            this.a = njl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (njj) this.a.e.get();
        }
    }

    /* renamed from: njl$c */
    static final class c extends akcs implements akbk<nke> {
        private /* synthetic */ njl a;

        c(njl njl) {
            this.a = njl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nke) this.a.f.get();
        }
    }

    /* renamed from: njl$d */
    static final class d extends akcs implements akbk<nki> {
        private /* synthetic */ njl a;

        d(njl njl) {
            this.a = njl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nki) this.a.g.get();
        }
    }

    /* renamed from: njl$f */
    static final class f implements ajev {
        private /* synthetic */ njl a;

        f(njl njl) {
            this.a = njl;
        }

        public final void run() {
            synchronized (this.a.c) {
                if (this.a.a == a.ON_RESUME) {
                    this.a.d.a(a.ON_RESUME);
                }
                this.a.b = true;
            }
        }
    }

    /* renamed from: njl$g */
    static final class g implements ajev {
        private /* synthetic */ njl a;
        private /* synthetic */ ajei b;

        g(njl njl, ajei ajei) {
            this.a = njl;
            this.b = ajei;
        }

        public final void run() {
            this.a.d.a(a.ON_DESTROY);
            this.a.d.a();
            this.b.dispose();
        }
    }

    /* renamed from: njl$e */
    static final class e implements ajev {
        private /* synthetic */ njl a;

        e(njl njl) {
            this.a = njl;
        }

        public final void run() {
            synchronized (this.a.c) {
                if (this.a.a == a.ON_RESUME && this.a.b) {
                    this.a.d.a(a.ON_PAUSE);
                }
                this.a.a = a.ON_PAUSE;
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(njl.class), "locationLifecycleManager", "getLocationLifecycleManager()Lcom/snap/map/core/LocationLifecycleManager;"), new akdc(akde.a(njl.class), "mapLifecycleManager", "getMapLifecycleManager()Lcom/snap/map/core/MapLifecycleManager;"), new akdc(akde.a(njl.class), "mapStartupConfigurationProvider", "getMapStartupConfigurationProvider()Lcom/snap/map/core/MapStartupConfigurationProvider;")};
        a aVar = new a();
    }

    public njl(ajwl<a> ajwl, ajwy<njj> ajwy, ajwy<nke> ajwy2, ajwy<nki> ajwy3, zgk<b> zgk, ajwy<nkn> ajwy4, ajwy<gpb> ajwy5, zgb zgb) {
        akcr.b(ajwl, "activityLifecycleSubject");
        akcr.b(ajwy, "locationLifecycleManagerProvider");
        akcr.b(ajwy2, "mapLifecycleManagerProvider");
        akcr.b(ajwy3, "mapStartupConfigurationProviderProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(ajwy4, "userDataProvider");
        akcr.b(ajwy5, "userAuthStore");
        akcr.b(zgb, "schedulersProvider");
        super(zgk);
        this.d = ajwl;
        this.e = ajwy;
        this.f = ajwy2;
        this.g = ajwy3;
        this.k = ajwy4;
        this.l = ajwy5;
        this.m = zgb;
    }

    private final njj c() {
        return (njj) this.h.b();
    }

    public final ajej a() {
        synchronized (this.c) {
            if (this.b) {
                this.d.a(a.ON_RESUME);
            }
            this.a = a.ON_RESUME;
        }
        Object a = ajek.a((ajev) new e(this));
        akcr.a(a, "Disposables.fromAction {…E\n            }\n        }");
        return a;
    }

    public final ajej b() {
        ajei ajei = new ajei();
        nke nke = (nke) this.i.b();
        ajej f = nke.f.a((ajdw) nke.a.j()).f((ajfb) new e(nke));
        akcr.a((Object) f, "activityLifecycleObserva…e -> Unit\n        }\n    }");
        ajvv.a(f, ajei);
        njj c = c();
        f = c.e.a((ajdw) c.a.j()).f((ajfb) new i(c));
        akcr.a((Object) f, "activityLifecycleObserva…          }\n            }");
        ajvv.a(f, ajei);
        c = c();
        ((achb) c.i.get()).a((achk) new c(c));
        f = ((gpb) this.l.get()).c().e().c((ajfb) new njm(new h((nkn) this.k.get()))).e().a((ajdw) zgb.a(adcw.b.callsite("MapActivityObserver")).l()).g(new f(this));
        akcr.a((Object) f, "userStoreFirstSessionEmi…      }\n                }");
        ajvv.a(f, ajei);
        nki nki = (nki) this.j.b();
        f = ((ftl) nki.l.get()).p(adew.MAP_USAGE_DATA_SHARING_ENABLED).b((ajdw) nki.a().b()).a((ajfb) new nki.c(nki), (ajfb) d.a);
        akcr.a((Object) f, "configProvider.get()\n   …it\n                }, {})");
        ajvv.a(f, ajei);
        this.d.a(a.ON_CREATE);
        Object a = ajek.a((ajev) new g(this, ajei));
        akcr.a(a, "Disposables.fromAction {…sable.dispose()\n        }");
        return a;
    }
}
