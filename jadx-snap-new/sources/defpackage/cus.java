package defpackage;

import com.snap.ads.core.ui.adinfo.AdInfoFragment;
import java.util.concurrent.Callable;

/* renamed from: cus */
public final class cus implements cjp {
    static final zjm c = new zjm(ckz.a, "AdInfo", false, false, false, false, null, false, false, false, false, null, 4092);
    static final acgu<zjm> d;
    final ajxe a;
    final ajxe b = ajxh.a(c.a);
    private final ajxe e;
    private final ajxe f;

    /* renamed from: cus$c */
    static final class c extends akcs implements akbk<zjf> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zjf(cus.c, new AdInfoFragment());
        }
    }

    /* renamed from: cus$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cus$g */
    static final class g extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    /* renamed from: cus$h */
    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(ckz.a, "AdInfo");
        }
    }

    /* renamed from: cus$b */
    static final class b extends akcs implements akbk<cmd> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cmd) this.a.get();
        }
    }

    /* renamed from: cus$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ cus a;
        private /* synthetic */ cvf b;

        d(cus cus, cvf cvf) {
            this.a = cus;
            this.b = cvf;
        }

        public final /* synthetic */ Object call() {
            ((achb) this.a.a.b()).a((achd) (zjf) this.a.b.b(), cus.d, (acih) this.b);
            return ajxw.a;
        }
    }

    /* renamed from: cus$e */
    static final class e extends akcs implements akbl<ajxw, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    /* renamed from: cus$f */
    static final class f extends akcs implements akbl<Throwable, ajxw> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cus.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(cus.class), "schedulersProvider", "getSchedulersProvider()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(cus.class), "adInfoPageController", "getAdInfoPageController()Lcom/snap/ui/deck/FragmentMainPageController;"), new akdc(akde.a(cus.class), "adDisposableManager", "getAdDisposableManager()Lcom/snap/ads/core/lib/addisposable/AdDisposableManager;")};
        a aVar = new a();
        acgu a = acgu.a(acis.b, (achg) c, true);
        if (a == null) {
            akcr.a();
        }
        d = a;
    }

    public cus(ajwy<achb<zjm, zjk>> ajwy, ajwy<zgb> ajwy2, ajwy<cmd> ajwy3) {
        akcr.b(ajwy, "navigationHostProvider");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(ajwy3, "adDisposableManager");
        this.a = ajxh.a(new g(ajwy));
        this.e = ajxh.a(new h(ajwy2));
        this.f = ajxh.a(new b(ajwy3));
    }

    public final void a(cvf cvf) {
        akcr.b(cvf, "adInfoNavigablePayload");
        ajdx b = ajdx.c((Callable) new d(this, cvf)).b((ajdw) ((zfw) this.e.b()).l());
        akcr.a((Object) b, "Single.fromCallable {\n  …ersProvider.mainThread())");
        akbl akbl = e.a;
        akbl akbl2 = f.a;
        Object obj = (cmd) this.f.b();
        akcr.a(obj, "adDisposableManager");
        cjl.a(b, akbl, akbl2, (cjo) obj);
    }
}
