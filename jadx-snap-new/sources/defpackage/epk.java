package defpackage;

import com.snap.camera.api.CameraFragment;

/* renamed from: epk */
public final class epk implements dnv {
    final ajws<ebj> a;
    final ajws<ebo> b;
    final ajwy<achb<zjm, zjk>> c;
    private final ajxe d = ajxh.a(new d(this));
    private final ajxe e = ajxh.a(new c(this));
    private zgb f;
    private final dnu g;

    /* renamed from: epk$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ epk a;

        d(epk epk) {
            this.a = epk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(dnh.f, "StackedCameraLauncherImpl");
        }
    }

    /* renamed from: epk$c */
    static final class c extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ epk a;

        c(epk epk) {
            this.a = epk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.c.get();
        }
    }

    /* renamed from: epk$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ epk a;

        a(epk epk) {
            this.a = epk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            CameraFragment cameraFragment = (CameraFragment) obj;
            akcr.b(cameraFragment, "it");
            cameraFragment.b().a((ajdv) this.a.a);
            return cameraFragment;
        }
    }

    /* renamed from: epk$b */
    static final class b<T> implements ajfb<ajxm<? extends CameraFragment, ? extends ajxm<? extends acgu<zjm>, ? extends acgu<zjm>>>> {
        private /* synthetic */ epk a;
        private /* synthetic */ aciv b;

        b(epk epk, aciv aciv) {
            this.a = epk;
            this.b = aciv;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            CameraFragment cameraFragment = (CameraFragment) ajxm.a;
            ajxm = (ajxm) ajxm.b;
            if (akcr.a(this.b, this.a.c().i())) {
                cameraFragment.b().a((ajdv) this.a.a);
                cameraFragment.a().a((ajdv) this.a.b);
                this.a.c().a((achd) new zjf(dnh.c, cameraFragment, acgv.a().a((acgu) ajxm.b).a()), (acgu) ajxm.a, null);
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(epk.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(epk.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;")};
    }

    public epk(ajws<ebj> ajws, ajws<ebo> ajws2, ajwy<achb<zjm, zjk>> ajwy, zgb zgb, dnu dnu) {
        akcr.b(ajws, "captureStartEventSubject");
        akcr.b(ajws2, "mediaCreationEventSubject");
        akcr.b(ajwy, "navigationHostLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(dnu, "stackedCameraConfigProvider");
        this.a = ajws;
        this.b = ajws2;
        this.c = ajwy;
        this.f = zgb;
        this.g = dnu;
    }

    private final zfw d() {
        return (zfw) this.d.b();
    }

    public final ajcx a() {
        Object e = ajwd.a(b(), this.g.b()).b((ajdw) d().f()).a((ajdw) d().l()).c((ajfb) new b(this, c().i())).e();
        akcr.a(e, "createStackedCameraFragm…        }.ignoreElement()");
        return e;
    }

    public final ajdx<CameraFragment> b() {
        Object f = this.g.a().f(new a(this));
        akcr.a(f, "stackedCameraConfigProvi…      }\n                }");
        return f;
    }

    /* Access modifiers changed, original: final */
    public final achb<zjm, zjk> c() {
        return (achb) this.e.b();
    }
}
