package defpackage;

import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.aggt.a;

/* renamed from: gkf */
public final class gkf {
    volatile gkh a;
    volatile a b = a.UNRECOGNIZED_VALUE;
    final iha c;
    final ajwy<gqr> d;
    private final ajei e = new ajei();
    private final ajxe f;

    /* renamed from: gkf$a */
    static final class a extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        a(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(iew.a, "CDNSelectionManager");
        }
    }

    /* renamed from: gkf$2 */
    static final class 2<T> implements ajfb<String> {
        private /* synthetic */ gkf a;

        2(gkf gkf) {
            this.a = gkf;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar;
            String str = (String) obj;
            gkf gkf = this.a;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3649301) {
                    if (hashCode == 3662605 && str.equals("wwan")) {
                        aVar = a.WWAN;
                        gkf.b = aVar;
                    }
                } else if (str.equals(MapboxEvent.KEY_WIFI)) {
                    aVar = a.WIFI;
                    gkf.b = aVar;
                }
            }
            aVar = a.ANY;
            gkf.b = aVar;
        }
    }

    /* renamed from: gkf$3 */
    static final class 3<T> implements ajfb<Throwable> {
        public static final 3 a = new 3();

        3() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gkf$4 */
    static final class 4<T> implements ajfb<String> {
        private /* synthetic */ gkf a;

        4(gkf gkf) {
            this.a = gkf;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            gkf gkf = this.a;
            CharSequence charSequence = str;
            Object obj2 = null;
            Object obj3 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            gkh gkh = null;
            if (obj3 != null || akcr.a((Object) str, (Object) "{}")) {
                gkf.a = null;
                return;
            }
            try {
                aggh aggh = (aggh) gkf.c.a(str, aggh.class);
                if (aggh != null) {
                    obj3 = aggh.a;
                    akcr.a(obj3, "cdnClientConfig.version");
                    if (Math.abs(obj3.doubleValue() - 2.0d) < 1.0E-6d) {
                        obj2 = 1;
                    }
                    if (obj2 != null) {
                        gkh = new gkh(aggh, gkf.d);
                    }
                }
                gkf.a = gkh;
            } catch (Exception e) {
                ((gqr) gkf.d.get()).a(gqt.HIGH, e, iew.a.callsite("CDNSelectionManager"));
            }
        }
    }

    /* renamed from: gkf$5 */
    static final class 5<T> implements ajfb<Throwable> {
        public static final 5 a = new 5();

        5() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gkf.class), "qualifiedScheduler", "getQualifiedScheduler()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public gkf(ftl ftl, final ifa ifa, iha iha, zgb zgb, ajwy<gqr> ajwy) {
        akcr.b(ftl, "configurationProvider");
        akcr.b(ifa, "networkStatusManager");
        akcr.b(iha, "serializationHelper");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "exceptionTracker");
        this.c = iha;
        this.d = ajwy;
        this.f = ajxh.a(new a(zgb));
        ajej a = ifa.e().p(new ajfc<T, R>() {
            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Optional) obj, "it");
                return ifa.d();
            }
        }).j(ajfu.a).a((ajfb) new 2(this), (ajfb) 3.a);
        akcr.a((Object) a, "networkStatusManager.get…tting network status\") })");
        ajvv.a(a, this.e);
        ajej a2 = ftl.u(rxp.CDN_CONFIG_RULES).j(ajfu.a).b((ajdw) ((zfw) this.f.b()).j()).a((ajfb) new 4(this), (ajfb) 5.a);
        akcr.a((Object) a2, "configurationProvider.ob…r getting CDN Config\") })");
        ajvv.a(a2, this.e);
    }
}
