package defpackage;

import android.location.Location;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ncz */
public final class ncz implements nbl {
    final ajxe a;
    final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private final ajxe e;
    private final ndg f;
    private final ajei g;

    /* renamed from: ncz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ncz$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(nbz.a.callsite("CurrentLocationManagerImpl"));
        }
    }

    /* renamed from: ncz$f */
    static final class f extends akcs implements akbk<ncc> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ncc) this.a.get();
        }
    }

    /* renamed from: ncz$b */
    static final class b extends akcs implements akbk<ndz> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ndz) this.a.get();
        }
    }

    /* renamed from: ncz$d */
    static final class d extends akcs implements akbk<ajei> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajei) this.a.get();
        }
    }

    /* renamed from: ncz$e */
    static final class e extends akcs implements akbk<nfx> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nfx) this.a.get();
        }
    }

    /* renamed from: ncz$h */
    static final class h<V> implements Callable<T> {
        private /* synthetic */ ncz a;

        h(ncz ncz) {
            this.a = ncz;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(((ncc) this.a.a.b()).a());
        }
    }

    /* renamed from: ncz$i */
    static final class i<T> implements ajfl<Boolean> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: ncz$j */
    static final class j<T> implements ajfb<Boolean> {
        private /* synthetic */ ncz a;

        j(ncz ncz) {
            this.a = ncz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.e().c();
        }
    }

    /* renamed from: ncz$k */
    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ncz$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ ncz a;

        c(ncz ncz) {
            this.a = ncz;
        }

        public final /* synthetic */ Object call() {
            Object e = this.a.e();
            akcr.a(e, "currentLocationProvider");
            return e.a();
        }
    }

    /* renamed from: ncz$l */
    static final class l<V> implements Callable<T> {
        private /* synthetic */ ncz a;

        l(ncz ncz) {
            this.a = ncz;
        }

        public final /* synthetic */ Object call() {
            this.a.e().d();
            this.a.f().a();
            ((nfx) this.a.b.b()).a();
            return ajxw.a;
        }
    }

    /* renamed from: ncz$m */
    static final class m<T> implements ajfb<ajxw> {
        public static final m a = new m();

        m() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ncz$n */
    static final class n<T> implements ajfb<Throwable> {
        public static final n a = new n();

        n() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ncz.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ncz.class), "locationPermissionsProvider", "getLocationPermissionsProvider()Lcom/snap/location/LocationPermissionsProvider;"), new akdc(akde.a(ncz.class), "currentLocationProvider", "getCurrentLocationProvider()Lcom/snap/location/app/UserCurrentLocationProvider;"), new akdc(akde.a(ncz.class), "locationCompositeDisposable", "getLocationCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(ncz.class), "locationNetworkRequestMaker", "getLocationNetworkRequestMaker()Lcom/snap/location/map/LocationNetworkRequestMaker;")};
        a aVar = new a();
    }

    public ncz(ajwy<ncc> ajwy, ajwy<zgb> ajwy2, ajwy<ndz> ajwy3, ajwy<ajei> ajwy4, ajwy<nfx> ajwy5, ndg ndg, ajei ajei) {
        akcr.b(ajwy, "baseCanUseLocationProvider");
        akcr.b(ajwy2, "schedulersProviderProvider");
        akcr.b(ajwy3, "currentLocationProviderProvider");
        akcr.b(ajwy4, "compositeDisposableProvider");
        akcr.b(ajwy5, "locationNetworkRequestMakerProvider");
        akcr.b(ndg, "gpsPoller");
        akcr.b(ajei, "userCompositeDisposable");
        this.f = ndg;
        this.g = ajei;
        this.c = ajxh.a(new g(ajwy2));
        this.a = ajxh.a(new f(ajwy));
        this.d = ajxh.a(new b(ajwy3));
        this.e = ajxh.a(new d(ajwy4));
        this.b = ajxh.a(new e(ajwy5));
    }

    private final zfw g() {
        return (zfw) this.c.b();
    }

    public final ajdp<Location> a(ncf ncf) {
        akcr.b(ncf, "locationRequirements");
        Object e = e();
        akcr.a(e, "currentLocationProvider");
        Object a = ajdp.a((ajdr) new nda(e, new ndw(ncf), this.f));
        akcr.a(a, "Observable.create(Curren…equirements), gpsPoller))");
        return a;
    }

    public final ImmutableList<Location> a(TimeUnit timeUnit) {
        akcr.b(timeUnit, "timeUnit");
        return e().a(timeUnit);
    }

    public final void a() {
        ajej a = ajdx.c((Callable) new h(this)).a((ajfl) i.a).b((ajdw) g().j()).a((ajfb) new j(this), (ajfb) k.a);
        akcr.a((Object) a, "Single.fromCallable {\n  …ation update\")\n        })");
        ajei f = f();
        akcr.a((Object) f, "locationCompositeDisposable");
        ajvv.a(a, f);
    }

    public final ajdj<Location> b() {
        Object b = ajdj.b((Callable) new c(this));
        akcr.a(b, "Maybe.fromCallable { cur…onProvider.lastLocation }");
        return b;
    }

    public final ajdp<Location> c() {
        Object e = e();
        akcr.a(e, "currentLocationProvider");
        Object a = ajdp.a((ajdr) new nda(e, null, this.f));
        akcr.a(a, "Observable.create(Curren…ovider, null, gpsPoller))");
        return a;
    }

    public final void d() {
        ajej a = ajdx.c((Callable) new l(this)).b((ajdw) g().b()).a((ajfb) m.a, (ajfb) n.a);
        akcr.a((Object) a, "Single.fromCallable {\n  …izedMessage}\")\n        })");
        ajvv.a(a, this.g);
    }

    /* Access modifiers changed, original: final */
    public final ndz e() {
        return (ndz) this.d.b();
    }

    /* Access modifiers changed, original: final */
    public final ajei f() {
        return (ajei) this.e.b();
    }
}
