package defpackage;

import android.util.AndroidRuntimeException;
import com.brightcove.player.event.EventType;
import com.snap.ads.network.SnapAdsHttpInterface;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cng */
public final class cng implements ckv {
    final ajxe a;
    AtomicBoolean b = new AtomicBoolean(false);
    final ajxe c = ajxh.a(b.a);
    final ajxe d;
    final ajxe e;
    final ftl f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;

    /* renamed from: cng$p */
    static final class p extends akcq implements akbk<cnf> {
        p(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (cnf) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: cng$k */
    static final class k extends akcq implements akbk<cjt> {
        k(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (cjt) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: cng$r */
    static final class r extends akcq implements akbk<cnh> {
        r(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (cnh) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: cng$c */
    static final class c extends akcq implements akbk<cjo> {
        c(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (cjo) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: cng$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cng$d */
    static final class d extends akcs implements akbk<SnapAdsHttpInterface> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SnapAdsHttpInterface) this.a.get();
        }
    }

    /* renamed from: cng$f */
    static final class f extends akcs implements akbk<cii> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cii) this.a.get();
        }
    }

    /* renamed from: cng$s */
    static final class s extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        s(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(ckz.a, "PixelTrackImp");
        }
    }

    /* renamed from: cng$q */
    static final class q extends akcs implements akbk<Long> {
        private /* synthetic */ cng a;

        q(cng cng) {
            this.a = cng;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.f.h(cld.MUSHROOM_PIXEL_TRACK_NETWORK_REQUEST_TIMEOUT_SECONDS));
        }
    }

    /* renamed from: cng$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ cng a;

        e(cng cng) {
            this.a = cng;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.c().b());
        }
    }

    /* renamed from: cng$n */
    static final class n<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ cng a;
        private /* synthetic */ String b;

        n(cng cng, String str) {
            this.a = cng;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "hasValidCookie");
            if (bool.booleanValue()) {
                a = ajvo.a(ajhn.a);
            } else {
                cng cng = this.a;
                String str = this.b;
                akcr.b(str, "urlEncodedPixelToken");
                obj = ajdx.c((Callable) new g(cng, str)).a((ajfc) new h(cng)).b((ajdw) cng.b().g()).a((ajdw) cng.b().b()).c((ajfb) new i(cng)).d((ajfb) j.a);
                akcr.a(obj, "Single.fromCallable {\n  … $it \")\n                }");
                a = obj.e();
            }
            return a;
        }
    }

    /* renamed from: cng$o */
    static final class o implements ajev {
        private /* synthetic */ cng a;

        o(cng cng) {
            this.a = cng;
        }

        public final void run() {
            this.a.b.set(false);
        }
    }

    /* renamed from: cng$m */
    static final class m extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ cng a;

        m(cng cng) {
            this.a = cng;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            this.a.d().a(ckt.NORMAL, (idd) this.a.c.b(), "pixel_track_error", th, false);
            return ajxw.a;
        }
    }

    /* renamed from: cng$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("PixelTrackImp");
        }
    }

    /* renamed from: cng$l */
    static final class l extends akcs implements akbk<ajxw> {
        public static final l a = new l();

        l() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: cng$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ cng a;
        private /* synthetic */ String b;

        g(cng cng, String str) {
            this.a = cng;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            cyr cyr = cyr.PIXEL_TRACK;
            cnh cnh = (cnh) this.a.d.b();
            akcr.b(this.b, "pixelToken");
            Object[] objArr = new Object[]{cnh.b, "scut", r2};
            Object format = String.format("%s?%s=%s", Arrays.copyOf(objArr, 3));
            akcr.a(format, "java.lang.String.format(format, *args)");
            return new cys(cyr, format, ajzl.a(ajxs.a("Accept", "text/html")), new byte[0], sac.GET, ((Number) this.a.e.b()).longValue(), null, 64);
        }
    }

    /* renamed from: cng$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ cng a;

        h(cng cng) {
            this.a = cng;
        }

        public final /* synthetic */ Object apply(Object obj) {
            cys cys = (cys) obj;
            akcr.b(cys, "it");
            return ((SnapAdsHttpInterface) this.a.a.b()).issueRequest(cys, new igo(igq.b, 0, 0, 0, null, 30));
        }
    }

    /* renamed from: cng$i */
    static final class i<T> implements ajfb<cyt> {
        private /* synthetic */ cng a;

        i(cng cng) {
            this.a = cng;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (cyt) obj;
            cng cng = this.a;
            akcr.a(obj, "it");
            if (obj.a()) {
                cnf c = cng.c();
                akcr.b(obj, EventType.RESPONSE);
                obj = obj.f.b("set-cookie");
                akcr.a(obj, "response.headers.values(…ookieKeyResponseHeader())");
                for (String str : (Iterable) obj) {
                    if (cnf.a(ajyl.a(str), ajzs.a(c.b.c))) {
                        try {
                            c.a.setCookie(c.b.a, str);
                            c.a.setCookie(c.b.a, c.b.e);
                        } catch (AndroidRuntimeException e) {
                            c.c.a(ckt.NORMAL, c.a(), "cookie_save_error", e, false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: cng$j */
    static final class j<T> implements ajfb<Throwable> {
        public static final j a = new j();

        j() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cng.class), "adNetworkApi", "getAdNetworkApi()Lcom/snap/ads/network/SnapAdsHttpInterface;"), new akdc(akde.a(cng.class), "deviceInfoSupplierApi", "getDeviceInfoSupplierApi()Lcom/snap/adinfo/api/DeviceInfoSupplierApi;"), new akdc(akde.a(cng.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(cng.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(cng.class), "pixelCookieManager", "getPixelCookieManager()Lcom/snap/ads/core/lib/adprovider/PixelCookieManager;"), new akdc(akde.a(cng.class), "issuesReporter", "getIssuesReporter()Lcom/snap/ads/api/AdIssuesReporterApi;"), new akdc(akde.a(cng.class), "pixelTrackingConfig", "getPixelTrackingConfig()Lcom/snap/ads/core/lib/adprovider/PixelTrackingConfig;"), new akdc(akde.a(cng.class), "adDisposableManager", "getAdDisposableManager()Lcom/snap/ads/api/AdDisposableManagerApi;"), new akdc(akde.a(cng.class), "pixelRequestTimeoutSeconds", "getPixelRequestTimeoutSeconds()J")};
        a aVar = new a();
    }

    public cng(ajwy<SnapAdsHttpInterface> ajwy, ajwy<cii> ajwy2, ajwy<zgb> ajwy3, ajwy<cnh> ajwy4, ajwy<cnf> ajwy5, ajwy<cjt> ajwy6, ajwy<cjo> ajwy7, ftl ftl) {
        akcr.b(ajwy, "adNetworkApi");
        akcr.b(ajwy2, "deviceInfoSupplierApi");
        akcr.b(ajwy3, "schedulerProvider");
        akcr.b(ajwy4, "pixelTrackingConfig");
        akcr.b(ajwy5, "pixelCookieManagerProvider");
        akcr.b(ajwy6, "issuesReporterProvider");
        akcr.b(ajwy7, "adDisposableManagerProvider");
        akcr.b(ftl, "configProvider");
        this.f = ftl;
        this.a = ajxh.a(new d(ajwy));
        this.g = ajxh.a(new f(ajwy2));
        this.h = ajxh.a(new s(ajwy3));
        this.i = ajxh.a(new p(ajwy5));
        this.j = ajxh.a(new k(ajwy6));
        this.d = ajxh.a(new r(ajwy4));
        this.k = ajxh.a(new c(ajwy7));
        this.e = ajxh.a(new q(this));
    }

    public final void a() {
        ajcx f;
        String str = "Completable.complete()";
        if (this.b.compareAndSet(false, true)) {
            String k = ((cii) this.g.b()).k();
            if (k == null) {
                k = null;
            }
            if (k == null) {
                d().a(ckt.HIGH, "pixel_token_is_null");
                this.b.set(false);
            } else {
                Object c = ajdx.c((Callable) new e(this));
                akcr.a(c, "Single.fromCallable { pi…anager.hasValidCookie() }");
                f = c.e((ajfc) new n(this, k)).f(new o(this));
                akcr.a((Object) f, "checkValidCookie().flatM…oadingCookie.set(false) }");
                f = f.b((ajdw) b().b());
                akcr.a((Object) f, "loadPixelCookieInternal(…schedulers.computation())");
                cjl.a(igs.a(f, "loadPixelCookie"), (akbk) l.a, (akbl) new m(this), (cjo) this.k.b());
            }
        }
        f = ajvo.a(ajhn.a);
        akcr.a((Object) f, str);
        f = f.b((ajdw) b().b());
        akcr.a((Object) f, "loadPixelCookieInternal(…schedulers.computation())");
        cjl.a(igs.a(f, "loadPixelCookie"), (akbk) l.a, (akbl) new m(this), (cjo) this.k.b());
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.h.b();
    }

    /* Access modifiers changed, original: final */
    public final cnf c() {
        return (cnf) this.i.b();
    }

    /* Access modifiers changed, original: final */
    public final cjt d() {
        return (cjt) this.j.b();
    }
}
