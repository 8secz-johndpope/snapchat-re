package defpackage;

import defpackage.ryz.c;
import java.util.Collection;

/* renamed from: gho */
public final class gho implements gik {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;

    /* renamed from: gho$c */
    static final class c extends akcs implements akbk<ifa> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ifa) this.a.get();
        }
    }

    /* renamed from: gho$a */
    static final class a extends akcs implements akbk<ryg> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ryg) this.a.get();
        }
    }

    /* renamed from: gho$b */
    static final class b extends akcs implements akbk<gni> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gni) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gho.class), "networkStatusManager", "getNetworkStatusManager()Lcom/snap/framework/network/RxNetworkStatusManager;"), new akdc(akde.a(gho.class), "dataSaverPreference", "getDataSaverPreference()Lcom/snap/network/datasaver/DataSaverPreferenceWrapper;"), new akdc(akde.a(gho.class), "foregroundPrefetchConfiguration", "getForegroundPrefetchConfiguration()Lcom/snap/core/prefetch/api/ForegroundPrefetchConfiguration;")};
    }

    public gho(ajwy<ifa> ajwy, ajwy<ryg> ajwy2, ajwy<gni> ajwy3) {
        akcr.b(ajwy, "networkStatusManagerProvider");
        akcr.b(ajwy2, "dataSaverPreferenceWrapperProvider");
        akcr.b(ajwy3, "foregroundPrefetchConfigurationProvider");
        this.a = ajxh.a(new c(ajwy));
        this.b = ajxh.a(new a(ajwy2));
        this.c = ajxh.a(new b(ajwy3));
    }

    public final boolean a(geg geg) {
        akcr.b(geg, "request");
        if (gei.a(geg)) {
            if (!((ryg) this.b.b()).b()) {
                return false;
            }
            Object obj;
            akcr.b(geg, "receiver$0");
            Iterable<rzg> g = geg.g();
            if (!((g instanceof Collection) && ((Collection) g).isEmpty())) {
                for (rzg rzg : g) {
                    Object obj2;
                    if (rzg.b == rzc.ForegroundPrefetch) {
                        obj2 = 1;
                        continue;
                    } else {
                        obj2 = null;
                        continue;
                    }
                    if (obj2 == null) {
                        obj = null;
                        break;
                    }
                }
            }
            obj = 1;
            return obj == null || geg.f().b() != c.LARGE_MEDIA || ((gni) this.c.b()).b || ((ifa) this.a.b()).m();
        }
    }
}
