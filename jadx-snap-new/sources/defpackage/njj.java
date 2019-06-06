package defpackage;

import defpackage.j.a;
import defpackage.ncn.c;
import java.lang.ref.WeakReference;

/* renamed from: njj */
public final class njj {
    final zfw a = zgb.a(adcw.b.callsite("LocationLifecycleManager"));
    final ajwy<Boolean> b = new d(this);
    b c;
    boolean d;
    final ajdp<a> e;
    final ajwy<niw> f;
    final niu g;
    final adcu h;
    final aipn<achb<zjm, zjk>> i;
    final aipn<ncn> j;
    final nki k;
    final aipn<nfw> l;
    private final ajxe m = ajxh.a(new e(this));
    private final ajwy<abrk> n;

    /* renamed from: njj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: njj$d */
    static final class d<T> implements ajwy<Boolean> {
        private /* synthetic */ njj a;

        d(njj njj) {
            this.a = njj;
        }

        public final /* synthetic */ Object get() {
            Object obj = this.a.i.get();
            akcr.a(obj, "navigationHost.get()");
            return Boolean.valueOf(adcx.a((achb) obj));
        }
    }

    /* renamed from: njj$e */
    static final class e extends akcs implements akbk<niw> {
        private /* synthetic */ njj a;

        e(njj njj) {
            this.a = njj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (niw) this.a.f.get();
        }
    }

    /* renamed from: njj$i */
    static final class i<T> implements ajfb<a> {
        private /* synthetic */ njj a;

        i(njj njj) {
            this.a = njj;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            if (aVar != null) {
                int i = njk.a[aVar.ordinal()];
                boolean z = true;
                if (i == 1) {
                    return;
                }
                if (i == 2) {
                    njj njj = this.a;
                    nfw nfw = (nfw) njj.l.get();
                    if (njj.h.b()) {
                        if (njj.h.a()) {
                            njj.g.a(true);
                            if (njj.a().b() == null) {
                                z = false;
                            }
                            nfw.a(z, njj.d);
                            if (z) {
                                b bVar = new b(new WeakReference(nfw), new WeakReference(njj.b));
                                njj.c = bVar;
                                ((ncn) njj.j.get()).a((c) bVar);
                                nfw.b();
                            }
                            if (njj.k.c()) {
                                ((ncn) njj.j.get()).a((Runnable) g.a, (Runnable) h.a);
                            }
                            return;
                        }
                    }
                    njj.a.j().a((Runnable) new f(njj, nfw));
                } else if (i == 3) {
                    njj.a(this.a);
                }
            }
        }
    }

    /* renamed from: njj$c */
    public static final class c implements achk<zjm, zjk> {
        private /* synthetic */ njj a;

        c(njj njj) {
            this.a = njj;
        }

        public final void a(achi<zjm, zjk> achi) {
        }

        public final void b(achi<zjm, zjk> achi) {
            Object obj;
            njj njj = this.a;
            if (achi != null) {
                aciv aciv = achi.f;
                if (aciv != null) {
                    obj = (zjm) aciv.e();
                    njj.d = akcr.a(obj, adcw.a);
                }
            }
            obj = null;
            njj.d = akcr.a(obj, adcw.a);
        }

        public final void c(achi<zjm, zjk> achi) {
        }
    }

    /* renamed from: njj$b */
    public static final class b implements c {
        private final WeakReference<nfw> a;
        private final WeakReference<ajwy<Boolean>> b;

        /* renamed from: njj$b$a */
        static final class a extends akcs implements akbk<ajxw> {
            private /* synthetic */ nfw a;
            private /* synthetic */ ajwy b;

            a(nfw nfw, ajwy ajwy) {
                this.a = nfw;
                this.b = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                nfw nfw = this.a;
                Object obj = this.b.get();
                akcr.a(obj, "isOnMainPageProvider.get()");
                nfw.b(((Boolean) obj).booleanValue());
                return ajxw.a;
            }
        }

        public b(WeakReference<nfw> weakReference, WeakReference<ajwy<Boolean>> weakReference2) {
            akcr.b(weakReference, "locationActivityMixin");
            akcr.b(weakReference2, "isOnMainPageProvider");
            this.a = weakReference;
            this.b = weakReference2;
        }

        public final void a() {
            Object obj = this.b.get();
            Object obj2 = this.a.get();
            if (obj != null && obj2 != null) {
                a aVar = new a((nfw) obj2, (ajwy) obj);
            }
        }

        public final void b() {
            nfw nfw = (nfw) this.a.get();
            if (nfw != null) {
                nfw.c();
            }
        }
    }

    /* renamed from: njj$f */
    static final class f implements Runnable {
        private /* synthetic */ njj a;
        private /* synthetic */ nfw b;

        f(njj njj, nfw nfw) {
            this.a = njj;
            this.b = nfw;
        }

        public final void run() {
            this.b.a(this.a.a().b() != null);
        }
    }

    /* renamed from: njj$g */
    static final class g implements Runnable {
        public static final g a = new g();

        g() {
        }

        public final void run() {
        }
    }

    /* renamed from: njj$h */
    static final class h implements Runnable {
        public static final h a = new h();

        h() {
        }

        public final void run() {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(njj.class), "mapUserDataProvider", "getMapUserDataProvider()Lcom/snap/map/MapUserDataProvider;");
        a aVar = new a();
    }

    public njj(zgb zgb, ajdp<a> ajdp, ajwy<niw> ajwy, ajwy<abrk> ajwy2, niu niu, adcu adcu, aipn<achb<zjm, zjk>> aipn, aipn<ncn> aipn2, nki nki, aipn<nfw> aipn3) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdp, "activityLifecycleObservable");
        akcr.b(ajwy, "mapUserDataProviderProvider");
        akcr.b(ajwy2, "propertiesStore");
        akcr.b(niu, "mMapActivityVisibilityProvider");
        akcr.b(adcu, "mapConfigurationProvider");
        akcr.b(aipn, "navigationHost");
        akcr.b(aipn2, "nycSharingManager");
        akcr.b(nki, "mapStartupConfigurationProvider");
        akcr.b(aipn3, "mLocationMixin");
        this.e = ajdp;
        this.f = ajwy;
        this.n = ajwy2;
        this.g = niu;
        this.h = adcu;
        this.i = aipn;
        this.j = aipn2;
        this.k = nki;
        this.l = aipn3;
    }

    public static final /* synthetic */ void a(njj njj) {
        if (njj.h.b() && njj.h.a()) {
            njj.g.a(false);
            b bVar = njj.c;
            if (bVar != null) {
                ((ncn) njj.j.get()).b((c) bVar);
                njj.c = null;
            }
            ((nfw) njj.l.get()).a();
        }
    }

    /* Access modifiers changed, original: final */
    public final niw a() {
        return (niw) this.m.b();
    }
}
