package defpackage;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zia */
public final class zia {
    final ajwy<zhz> a;
    private a b;
    private Map<String, AtomicInteger> c;
    private final ajxe d = ajxh.a(new c(this));
    private final zij e;
    private final ajwy<icu> f;

    /* renamed from: zia$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: zia$c */
    static final class c extends akcs implements akbk<Long> {
        private /* synthetic */ zia a;

        c(zia zia) {
            this.a = zia;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(((zhz) this.a.a.get()).g());
        }
    }

    /* renamed from: zia$a */
    static final class a {
        String a;
        private final zij b;
        private final zhy c;
        private final String d;
        private final long e;

        public a(zij zij, zhy zhy, String str, String str2, long j) {
            akcr.b(zij, "uiPerfEvent");
            akcr.b(zhy, "initialBadFrameStats");
            akcr.b(str2, "attribution");
            this.b = zij;
            this.c = zhy;
            this.d = str;
            this.a = str2;
            this.e = j;
        }

        public final void a(String str) {
            akcr.b(str, "<set-?>");
            this.a = str;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zia.class), "frameIntervalNanos", "getFrameIntervalNanos()J");
        b bVar = new b();
    }

    public zia(zij zij, ajwy<zhz> ajwy, ajwy<icu> ajwy2) {
        akcr.b(zij, "uiPerfEvent");
        akcr.b(ajwy, "badFrameMonitor");
        akcr.b(ajwy2, "badFrameMetricReporter");
        this.e = zij;
        this.a = ajwy;
        this.f = ajwy2;
        Object newHashMap = Maps.newHashMap();
        akcr.a(newHashMap, "Maps.newHashMap()");
        this.c = (Map) newHashMap;
    }

    private final long a() {
        return ((Number) this.d.b()).longValue();
    }

    private final int b(String str) {
        AtomicInteger atomicInteger = (AtomicInteger) this.c.get(str);
        if (atomicInteger != null) {
            return atomicInteger.incrementAndGet();
        }
        this.c.put(str, new AtomicInteger(0));
        return 0;
    }

    private final void b() {
        a aVar = this.b;
        if (aVar != null) {
            b(aVar.a);
        }
    }

    public final void a(String str) {
        akcr.b(str, "attribution");
        a aVar = this.b;
        if (aVar != null) {
            if ((akcr.a((Object) str, (Object) "UNDEFINED") ^ 1) != 0) {
                aVar.a(str);
            }
            ((zhz) this.a.get()).d();
            b();
            this.b = null;
        }
    }

    public final void a(String str, String str2) {
        akcr.b(str2, "attribution");
        this.b = new a(this.e, ((zhz) this.a.get()).d(), str, str2, a());
    }
}
