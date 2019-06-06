package defpackage;

import android.location.Location;
import com.google.common.base.Optional;

/* renamed from: tyu */
public final class tyu implements toe {
    final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final String d = "CustomStoriesFeaturePreloaderKt";

    /* renamed from: tyu$f */
    static final class f extends akcq implements akbk<yhz> {
        f(ajwy ajwy) {
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
            return (yhz) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: tyu$d */
    static final class d extends akcs implements akbl<Throwable, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "throwable");
            return ajxw.a;
        }
    }

    /* renamed from: tyu$c */
    static final class c<T, R> implements ajfc<Optional<Location>, ajdb> {
        private /* synthetic */ tyu a;

        c(tyu tyu) {
            this.a = tyu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return ((yhz) this.a.a.b()).a((Location) optional.orNull());
        }
    }

    /* renamed from: tyu$a */
    static final class a extends akcq implements akbk<nbl> {
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
            return (nbl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: tyu$b */
    static final class b extends akcq implements akbk<ncc> {
        b(ajwy ajwy) {
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
            return (ncc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: tyu$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Location location = (Location) obj;
            akcr.b(location, "it");
            return Optional.of(location);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tyu.class), "currentLocationManager", "getCurrentLocationManager()Lcom/snap/location/CurrentLocationManager;"), new akdc(akde.a(tyu.class), "locationPermissionsProvider", "getLocationPermissionsProvider()Lcom/snap/location/LocationPermissionsProvider;"), new akdc(akde.a(tyu.class), "storiesNetworkApi", "getStoriesNetworkApi()Lcom/snap/stories/api/StoriesNetworkApi;")};
    }

    public tyu(ajwy<nbl> ajwy, ajwy<ncc> ajwy2, ajwy<yhz> ajwy3) {
        akcr.b(ajwy, "currentLocationManagerProvider");
        akcr.b(ajwy2, "locationPermissionsProviderProvider");
        akcr.b(ajwy3, "storiesNetworkApiProvider");
        this.b = ajxh.a(new a(ajwy));
        this.c = ajxh.a(new b(ajwy2));
        this.a = ajxh.a(new f(ajwy3));
    }

    public final ajej start() {
        Object e = (((ncc) this.c.b()).a() ? ((nbl) this.b.b()).c().p(e.a) : ajdp.b(Optional.absent())).d().e(new c(this));
        akcr.a(e, "observeLocation\n        …bleStories(it.orNull()) }");
        return ajwe.a((ajcx) e, (akbl) d.a, ajwe.a);
    }
}
