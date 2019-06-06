package defpackage;

import com.google.common.base.Optional;
import defpackage.rwz.a;
import defpackage.rxa.b;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rwt */
public final class rwt implements a {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private final ajxe e;
    private final ajxe f = ajxh.a(e.a);

    /* renamed from: rwt$d */
    static final class d extends akcs implements akbk<rxl> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rxl) this.a.get();
        }
    }

    /* renamed from: rwt$a */
    static final class a extends akcs implements akbk<ihh> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    /* renamed from: rwt$b */
    static final class b extends akcs implements akbk<rym> {
        private /* synthetic */ Optional a;

        b(Optional optional) {
            this.a = optional;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = (ajwy) this.a.orNull();
            return ajwy != null ? (rym) ajwy.get() : null;
        }
    }

    /* renamed from: rwt$c */
    static final class c extends akcs implements akbk<rzr> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rzr) this.a.get();
        }
    }

    /* renamed from: rwt$f */
    static final class f extends akcs implements akbk<b> {
        private /* synthetic */ b a;

        f(b bVar) {
            this.a = bVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.a;
        }
    }

    /* renamed from: rwt$e */
    static final class e extends akcs implements akbk<ConcurrentHashMap<UUID, rws>> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rwt.class), "networkCondition", "getNetworkCondition()Lcom/snap/network/bandwidth/api/NetworkConditionProvider;"), new akdc(akde.a(rwt.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(rwt.class), "eventLogger", "getEventLogger()Lcom/snap/network/misc/NetworkMetricsEventLogger;"), new akdc(akde.a(rwt.class), "netTrafficStats", "getNetTrafficStats()Lcom/snap/network/trafficstats/NetTrafficStats;"), new akdc(akde.a(rwt.class), "type", "getType()Lcom/snap/network/bandwidth/BandwidthSampler$BandwidthSamplerType;"), new akdc(akde.a(rwt.class), "requestBandwidthAccuracySampleMap", "getRequestBandwidthAccuracySampleMap()Ljava/util/concurrent/ConcurrentHashMap;")};
    }

    public rwt(ajwy<rxl> ajwy, ajwy<ihh> ajwy2, Optional<ajwy<rym>> optional, ajwy<rzr> ajwy3, b bVar) {
        akcr.b(ajwy, "networkConditionProvider");
        akcr.b(ajwy2, "clockProvider");
        akcr.b(optional, "eventLoggerProvider");
        akcr.b(ajwy3, "netTrafficStatsProvider");
        akcr.b(bVar, "bandwidthSamplerType");
        this.a = ajxh.a(new d(ajwy));
        this.b = ajxh.a(new a(ajwy2));
        this.c = ajxh.a(new b(optional));
        this.d = ajxh.a(new c(ajwy3));
        this.e = ajxh.a(new f(bVar));
    }

    private final rxl a() {
        return (rxl) this.a.b();
    }

    private final ihh b() {
        return (ihh) this.b.b();
    }

    private final rzr c() {
        return (rzr) this.d.b();
    }

    private final b d() {
        return (b) this.e.b();
    }

    private final ConcurrentHashMap<UUID, rws> e() {
        return (ConcurrentHashMap) this.f.b();
    }

    private final long f() {
        String str = "netTrafficStats";
        Object c;
        if (d() == b.DOWNLOAD) {
            c = c();
            akcr.a(c, str);
            return c.a();
        }
        c = c();
        akcr.a(c, str);
        return c.b();
    }

    public final void a(rwy rwy) {
        long j;
        rwy rwy2 = rwy;
        akcr.b(rwy2, "bandwidthSample");
        String str = "clock";
        if (rwy2.c) {
            UUID uuid = rwy2.a;
            long j2 = rwy2.b;
            if (j2 > 1048576) {
                ConcurrentHashMap e = e();
                rxk rxk = (rxk) a().get();
                j = rxk.d;
                Object b = b();
                akcr.a(b, str);
                rws rws = r5;
                rws rws2 = new rws(j, new ifl(b), f(), j2, rxk.c, d() == b.DOWNLOAD);
                e.putIfAbsent(uuid, rws);
            }
        }
        if (rwy2.d) {
            Object obj = (rws) e().remove(rwy2.a);
            if (obj != null) {
                rxk rxk2 = (rxk) a().get();
                long f = f() - obj.c;
                akcr.a(obj, "it");
                long j3 = rxk2.d;
                Object b2 = b();
                akcr.a(b2, str);
                j = new ifl(b2).a(obj.b);
                Object obj2 = (j < 10 || f <= 0) ? null : 1;
                if (obj2 != null) {
                    aasv aasv;
                    aabl aabl = new aabl();
                    aabl.a(Long.valueOf(obj.a));
                    aabl.b(Long.valueOf(j3));
                    aabl.d(Long.valueOf(f));
                    aabl.c(Long.valueOf(j));
                    aabl.e(Long.valueOf(obj.d));
                    int i = rwu.a[obj.e.ordinal()];
                    if (i == 1) {
                        aasv = aasv.WWAN;
                    } else if (i == 2) {
                        aasv = aasv.WIFI;
                    } else if (i == 3) {
                        aasv = aasv.NOT_REACHABLE;
                    } else if (i == 4) {
                        aasv = aasv.UNKNOWN;
                    } else {
                        throw new ajxk();
                    }
                    aabl.a(aasv);
                    aabl.a(Boolean.valueOf(obj.f));
                    rym rym = (rym) this.c.b();
                    if (rym != null) {
                        rym.log(aabl);
                        return;
                    }
                }
                return;
            }
        }
    }
}
