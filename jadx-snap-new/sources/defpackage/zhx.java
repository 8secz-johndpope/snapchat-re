package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: zhx */
public final class zhx extends ablj implements zhz {
    static final long g = TimeUnit.MILLISECONDS.toNanos(1);
    static final long h = TimeUnit.MILLISECONDS.toNanos(80);
    static final long i = TimeUnit.MILLISECONDS.toNanos(100);
    static final long j = TimeUnit.MILLISECONDS.toNanos(200);
    static final long k = h;
    final ajen a = new ajen();
    long b;
    long c;
    final long[] d = new long[9];
    final ajxe e = ajxh.a(new f(this));
    final ajwy<ablg> f;
    private final ajxe l = ajxh.a(new e(this));
    private final ajwy<ablk> m;
    private final ihh n;

    /* renamed from: zhx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zhx$e */
    static final class e extends akcs implements akbk<Long> {
        private /* synthetic */ zhx a;

        e(zhx zhx) {
            this.a = zhx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(((ablg) this.a.f.get()).g());
        }
    }

    /* renamed from: zhx$f */
    static final class f extends akcs implements akbk<Long> {
        private /* synthetic */ zhx a;

        f(zhx zhx) {
            this.a = zhx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.a() << 1);
        }
    }

    /* renamed from: zhx$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ zhx a;

        b(zhx zhx) {
            this.a = zhx;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldMonitor");
            if (obj.booleanValue()) {
                zhx zhx = this.a;
                zhx.a.a(((ablg) zhx.f.get()).h().a((ajfb) new c(zhx), (ajfb) d.a));
            }
        }
    }

    /* renamed from: zhx$c */
    static final class c<T> implements ajfb<ablf> {
        private /* synthetic */ zhx a;

        c(zhx zhx) {
            this.a = zhx;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ablf) obj;
            zhx zhx = this.a;
            akcr.a(obj, "it");
            zhx.b++;
            long j = obj.a;
            int min = j <= zhx.a() ? -1 : j < ((Number) zhx.e.b()).longValue() ? 0 : j < zhx.h ? 1 : j < zhx.j ? 2 : Math.min(8, (int) (((j - zhx.j) / zhx.i) + 3));
            if (min >= 0) {
                long[] jArr = zhx.d;
                jArr[min] = jArr[min] + 1;
            }
            if (obj.a > zhx.k) {
                zhx.c += obj.a / zhx.g;
            }
        }
    }

    /* renamed from: zhx$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zhx.class), "oneFrameDurationNanos", "getOneFrameDurationNanos()J"), new akdc(akde.a(zhx.class), "twoFrameDurationNanos", "getTwoFrameDurationNanos()J")};
        a aVar = new a();
    }

    public zhx(ajwy<ablg> ajwy, ajwy<ablk> ajwy2, ihh ihh) {
        akcr.b(ajwy, "frameRateMonitor");
        akcr.b(ajwy2, "perfMonitorConfig");
        akcr.b(ihh, "clock");
        this.f = ajwy;
        this.m = ajwy2;
        this.n = ihh;
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        return ((Number) this.l.b()).longValue();
    }

    public final zhy d() {
        long j = this.b;
        long j2 = this.c;
        Object copyOf = Arrays.copyOf(this.d, 9);
        akcr.a(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new zhy(j, j2, copyOf, this.n.c());
    }

    public final void e() {
        this.a.a(((ablk) this.m.get()).b(new aaag()).a(ajef.a()).e((ajfb) new b(this)));
    }

    public final void f() {
        this.a.a(null);
    }

    public final long g() {
        return a();
    }
}
