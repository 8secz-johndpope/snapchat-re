package defpackage;

import android.location.Location;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.venues.api.network.VenuesHttpInterface;
import defpackage.zvw.b;
import defpackage.zvw.c;
import defpackage.zvw.e;
import java.util.concurrent.Callable;

/* renamed from: zvt */
public final class zvt implements zvr {
    final ajwy<zvv> a;
    final ajwy<zvw> b;
    final ajwy<nbl> c;
    private final ajxe d = ajxh.a(new a(this));
    private final ajxe e = ajxh.a(new e(this));
    private final ajxe f = ajxh.a(new b(this));

    /* renamed from: zvt$a */
    static final class a extends akcs implements akbk<zvv> {
        private /* synthetic */ zvt a;

        a(zvt zvt) {
            this.a = zvt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zvv) this.a.a.get();
        }
    }

    /* renamed from: zvt$e */
    static final class e extends akcs implements akbk<zvw> {
        private /* synthetic */ zvt a;

        e(zvt zvt) {
            this.a = zvt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zvw) this.a.b.get();
        }
    }

    /* renamed from: zvt$b */
    static final class b extends akcs implements akbk<nbl> {
        private /* synthetic */ zvt a;

        b(zvt zvt) {
            this.a = zvt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nbl) this.a.c.get();
        }
    }

    /* renamed from: zvt$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Location location = (Location) obj;
            akcr.b(location, MapboxEvent.TYPE_LOCATION);
            alia alia = new alia();
            alia.a(location.getLatitude());
            alia.b(location.getLongitude());
            alia.c((double) location.getAccuracy());
            return alia;
        }
    }

    /* renamed from: zvt$d */
    static final class d<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ zvt a;

        d(zvt zvt) {
            this.a = zvt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final alia alia = (alia) obj;
            akcr.b(alia, "request");
            return ajdj.b((Callable) new Callable<T>(this) {
                private /* synthetic */ d a;

                public final /* synthetic */ Object call() {
                    zvv a = ((zvv) this.a.a.d.b());
                    Object obj = alia;
                    String str = "request";
                    akcr.a(obj, str);
                    alib a2 = a.a(obj);
                    if (a2 == null) {
                        return null;
                    }
                    Object obj2 = alia;
                    akcr.a(obj2, str);
                    return new zvq(a2, obj2);
                }
            }).b((ajdn) ajdj.a((Callable) new Callable<ajdn<? extends T>>(this) {
                private /* synthetic */ d b;

                /* renamed from: zvt$d$2$2 */
                static final class 2<T, R> implements ajfc<T, R> {
                    private /* synthetic */ 2 a;

                    2(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        alib alib = (alib) obj;
                        akcr.b(alib, "it");
                        Object obj2 = alia;
                        akcr.a(obj2, "request");
                        return new zvq(alib, obj2);
                    }
                }

                public final /* synthetic */ Object call() {
                    zvw b = this.b.a.b();
                    Object obj = alia;
                    akcr.a(obj, "request");
                    akcr.b(obj, "req");
                    VenuesHttpInterface b2 = b.b();
                    Object a = wjd.EXPLORE.a();
                    akcr.a(a, "SnapTokenAccessTokenScop…PLORE.serverSideScopeName");
                    Object b3 = b2.getCheckinOptions(a, "https://st.sc-jpl.com/rpc/getCheckinOptions", obj).b((ajfc) defpackage.zvw.d.a).b((ajdw) b.a().g()).a((ajfb) e.a).b(ajfu.g);
                    akcr.a(b3, "httpInterface.getCheckin…       .onErrorComplete()");
                    return b3.c((ajfb) new zvu(new akbl<alib, ajxw>(((zvv) this.b.a.d.b())) {
                        public final String getName() {
                            return "set";
                        }

                        public final akej getOwner() {
                            return akde.a(zvv.class);
                        }

                        public final String getSignature() {
                            return "set(Lsnapchat/map/nano/GetCheckinOptionsResponse;)V";
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            alib alib = (alib) obj;
                            akcr.b(alib, "p1");
                            zvv zvv = (zvv) this.receiver;
                            akcr.b(alib, "value");
                            synchronized (zvv) {
                                zvv.a = alib;
                                zvv.b = zvv.g.a();
                                algx algx = alib.g;
                                zvv.c = algx != null ? algx.d() : 0;
                                algx = alib.g;
                                double d = 0.0d;
                                zvv.d = algx != null ? algx.a() : 0.0d;
                                algx = alib.g;
                                zvv.e = algx != null ? algx.b() : 0.0d;
                                algx algx2 = alib.g;
                                if (algx2 != null) {
                                    d = algx2.c();
                                }
                                zvv.f = d;
                            }
                            return ajxw.a;
                        }
                    })).f(new 2(this));
                }
            }));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zvt.class), "cache", "getCache()Lcom/snap/venues/core/cache/VenueCache;"), new akdc(akde.a(zvt.class), "network", "getNetwork()Lcom/snap/venues/core/network/VenuesRequestMaker;"), new akdc(akde.a(zvt.class), "currentLocationManager", "getCurrentLocationManager()Lcom/snap/location/CurrentLocationManager;")};
    }

    public zvt(ajwy<zvv> ajwy, ajwy<zvw> ajwy2, ajwy<nbl> ajwy3) {
        akcr.b(ajwy, "cacheProvider");
        akcr.b(ajwy2, "networkProvider");
        akcr.b(ajwy3, "currentLocationManagerProvider");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    public final ajdj<zvq> a() {
        Object a = ((nbl) this.f.b()).b().f(c.a).a((ajfc) new d(this));
        akcr.a(a, "currentLocationManager\n …     })\n                }");
        return a;
    }

    public final ajdj<alhl> a(alhk alhk) {
        akcr.b(alhk, "request");
        zvw b = b();
        akcr.b(alhk, "req");
        VenuesHttpInterface b2 = b.b();
        Object a = wjd.EXPLORE.a();
        akcr.a(a, "SnapTokenAccessTokenScop…PLORE.serverSideScopeName");
        Object b3 = b2.flagCheckinOption(a, "https://st.sc-jpl.com/rpc/flagCheckinOption", alhk).d((ajfb) b.a).b((ajfc) c.a).b((ajdw) b.a().g());
        akcr.a(b3, "httpInterface.flagChecki…eOn(schedulers.network())");
        return b3;
    }

    /* Access modifiers changed, original: final */
    public final zvw b() {
        return (zvw) this.e.b();
    }
}
