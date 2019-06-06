package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pps */
public final class pps implements ppn {
    final AtomicInteger a = new AtomicInteger(0);
    WeakReference<a> b;
    final ajwl<ppo> c;
    final ppw d;
    final ppu e;
    final boolean f;
    private final zfw g;
    private final ajxe h;
    private final ajxe i;
    private final abqo j;
    private final zfy k;
    private final ppv l;

    /* renamed from: pps$g */
    static final class g extends akcs implements akbk<Runtime> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Runtime.getRuntime();
        }
    }

    /* renamed from: pps$a */
    final class a {
        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            pps.this.a.incrementAndGet();
            pps pps = pps.this;
            pps.b = new WeakReference(new a());
        }
    }

    /* renamed from: pps$e */
    static final class e extends akcs implements akbk<Long> {
        private /* synthetic */ pps a;

        e(pps pps) {
            this.a = pps;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.f ? this.a.e.d() : this.a.e.c());
        }
    }

    /* renamed from: pps$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ pps a;

        b(pps pps) {
            this.a = pps;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "it");
            long totalMemory = ((Runtime) this.a.h.b()).totalMemory() - ((Runtime) this.a.h.b()).freeMemory();
            this.a.c.a(new ppo(totalMemory, ((Number) this.a.i.b()).longValue()));
            long b = ((Number) this.a.i.b()).longValue();
            int i = 15;
            if (b != 0) {
                double d = (double) totalMemory;
                double d2 = (double) b;
                Double.isNaN(d);
                Double.isNaN(d2);
                d /= d2;
                if (totalMemory < b && d < 0.8999999761581421d) {
                    if (d >= 0.800000011920929d) {
                        i = 10;
                    } else if (d >= 0.699999988079071d) {
                        i = 5;
                    }
                }
                return Integer.valueOf(i);
            }
            i = 20;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: pps$c */
    static final class c<T> implements ajfl<Integer> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, "it");
            return num.intValue() != 20;
        }
    }

    /* renamed from: pps$d */
    static final class d implements ajev {
        public static final d a = new d();

        d() {
        }

        public final void run() {
        }
    }

    /* renamed from: pps$f */
    static final class f<T> implements ajfb<Integer> {
        private /* synthetic */ pps a;

        f(pps pps) {
            this.a = pps;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            ppw ppw = this.a.d;
            akcr.a(obj, "it");
            ppw.onTrimMemory(obj.intValue());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(pps.class), "runtime", "getRuntime()Ljava/lang/Runtime;"), new akdc(akde.a(pps.class), "maxMemory", "getMaxMemory()J")};
    }

    public pps(Context context, abqo abqo, ppw ppw, ppu ppu, boolean z, zfy zfy, ppv ppv) {
        akcr.b(context, "appContext");
        akcr.b(abqo, "clock");
        akcr.b(ppw, "memoryAppCallback");
        akcr.b(ppu, "deviceMemoryUtils");
        akcr.b(zfy, "qualifiedSchedulersProvider");
        akcr.b(ppv, "kernelResourceUsageMonitor");
        this.j = abqo;
        this.d = ppw;
        this.e = ppu;
        this.f = z;
        this.k = zfy;
        this.l = ppv;
        Object a = zfy.a(ppt.a.callsite("AppMemoryMonitor"));
        akcr.a(a, "qualifiedSchedulersProvi…RY_FEATURE.callsite(TAG))");
        this.g = a;
        this.b = new WeakReference(new a());
        a = new ajwl();
        akcr.a(a, "BehaviorSubject.create<MemoryStats>()");
        this.c = a;
        this.h = ajxh.a(g.a);
        this.i = ajxh.a(new e(this));
        context.registerComponentCallbacks(this.d);
    }

    public final ajdp<Integer> a() {
        Object f = this.d.a.f();
        akcr.a(f, "trimSubject.hide()");
        return f;
    }

    public final ajej b() {
        Object a = ajdp.a(5000, TimeUnit.MILLISECONDS).b((ajdw) this.g.b()).p(new b(this)).a((ajfl) c.a).b((ajev) d.a).a((ajdw) this.g.l());
        akcr.a(a, "Observable.interval(POLL…(schedulers.mainThread())");
        a = a.f((ajfb) new f(this));
        akcr.a(a, "getTrimMemoryStream()\n  …llback.onTrimMemory(it) }");
        return a;
    }

    public final boolean c() {
        return this.e.a().lowMemory;
    }
}
