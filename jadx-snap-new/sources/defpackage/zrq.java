package defpackage;

import android.location.Location;
import defpackage.zrj.e;
import defpackage.zrj.f;
import defpackage.zrj.g;
import defpackage.zrj.h;
import java.util.concurrent.Callable;

/* renamed from: zrq */
public final class zrq implements zrs {
    private final ajxe a;
    private final ajxe b;
    private final ajdx<ncf> c;

    /* renamed from: zrq$d */
    static final class d extends akcq implements akbk<nbl> {
        d(ajwy ajwy) {
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
            return (nbl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: zrq$a */
    static final class a extends akcq implements akbk<ftl> {
        a(ajwy ajwy) {
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
            return (ftl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: zrq$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zpy.a.callsite("UnlockablesDefaultLocProvider"));
        }
    }

    /* renamed from: zrq$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ftl ftl = (ftl) obj;
            akcr.b(ftl, "it");
            return new ncf(ftl.h(zpt.LOCATION_UPDATE_FRESHNESS_THRESHOLD_MS), ftl.c(zpt.LOCATION_UPDATE_PROXIMITY_THRESHOLD_METER), ftl.c(zpt.LOCATION_UPDATE_ACCURACY_FACTOR));
        }
    }

    /* renamed from: zrq$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ zrq a;

        c(zrq zrq) {
            this.a = zrq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ncf ncf = (ncf) obj;
            akcr.b(ncf, "requirements");
            return this.a.a().a(ncf).j(ajfu.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zrq.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(zrq.class), "locProvider", "getLocProvider()Lcom/snap/location/CurrentLocationManager;")};
    }

    public zrq(zgb zgb, ajwy<ftl> ajwy, ajwy<nbl> ajwy2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "configurationProvider");
        akcr.b(ajwy2, "locationManagerProvider");
        this.a = ajxh.a(new e(zgb));
        this.b = ajxh.a(new d(ajwy2));
        Object a = ajdx.c((Callable) new zrr(new a(ajwy))).a((ajdw) ((zfw) this.a.b()).f()).f(b.a).a();
        akcr.a(a, "Single\n            .from…  )\n            }.cache()");
        this.c = a;
    }

    /* Access modifiers changed, original: final */
    public final nbl a() {
        return (nbl) this.b.b();
    }

    public final ajdp<Location> b() {
        Object d = this.c.d((ajfc) new c(this));
        akcr.a(d, "betterLocationRequiremen…ilChanged()\n            }");
        String str = "UnlockablesDefaultLocProvider";
        String str2 = "getBetterLoc";
        d = d.e((ajfb) new e(str, str2)).b((ajev) new f(str, str2)).d((ajfb) new g(str, str2, true)).c((ajev) new h(str, str2));
        akcr.a(d, "doOnSubscribe { if (fals…servable on complete\")  }");
        return d;
    }

    public final ajdj<Location> c() {
        return a().b();
    }
}
