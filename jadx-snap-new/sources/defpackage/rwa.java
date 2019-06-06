package defpackage;

import android.os.Build.VERSION;
import com.google.common.collect.ConcurrentHashMultiset;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: rwa */
public final class rwa extends ablj {
    long a = -1;
    long b;
    final ConcurrentHashMultiset<String> c;
    final zgk<b> d;
    final ihh e;
    final ppn f;
    final ajwy<ilw> g;
    final ajwy<ilv> h;
    final achb<zjm, zjk> i;
    private final ajxe j = ajxh.a(new g(this));
    private final ajxe k;
    private final ajei l;
    private final zgb m;

    /* renamed from: rwa$f */
    static final class f extends akcs implements akbk<Runtime> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Runtime.getRuntime();
        }
    }

    /* renamed from: rwa$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ rwa a;

        g(rwa rwa) {
            this.a = rwa;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ppp.a.callsite("MemoryUsageReportingObserver"));
        }
    }

    /* renamed from: rwa$c */
    static final class c<T> implements ajfb<Integer> {
        private /* synthetic */ rwa a;
        private /* synthetic */ ArrayList b;

        c(rwa rwa, ArrayList arrayList) {
            this.a = rwa;
            this.b = arrayList;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            synchronized (this.b) {
                ArrayList arrayList = this.b;
                akcr.a(obj, "it");
                arrayList.add(new a(obj.intValue(), (zjm) this.a.i.h()));
            }
        }
    }

    /* renamed from: rwa$d */
    static final class d implements ajev {
        private /* synthetic */ rwa a;
        private /* synthetic */ ArrayList b;

        d(rwa rwa, ArrayList arrayList) {
            this.a = rwa;
            this.b = arrayList;
        }

        public final void run() {
            rwa rwa = this.a;
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                int i = aVar.a;
                String str = i != 5 ? i != 10 ? i != 15 ? i != 20 ? i != 40 ? i != 60 ? i != 80 ? "UNKNOWN" : "TRIM_MEMORY_COMPLETE" : "TRIM_MEMORY_MODERATE" : "TRIM_MEMORY_BACKGROUND" : "TRIM_MEMORY_UI_HIDDEN" : "TRIM_MEMORY_RUNNING_CRITICAL" : "TRIM_MEMORY_RUNNING_LOW" : "TRIM_MEMORY_RUNNING_MODERATE";
                ((ilv) rwa.h.get()).c(iot.MEMORY_USAGE_CALLBACK.a("level", str).a("os_version", String.valueOf(VERSION.SDK_INT)).a("page", String.valueOf(aVar.b)), 1);
            }
            arrayList.clear();
        }
    }

    /* renamed from: rwa$e */
    static final class e implements ajev {
        final /* synthetic */ rwa a;

        /* renamed from: rwa$e$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object call() {
                rwa rwa = this.a.a;
                rwa.b += rwa.e.c() - rwa.a;
                long j = rwa.b / 1000;
                String str = (0 <= j && 60 >= j) ? "less_1min" : (61 <= j && 300 >= j) ? "1min" : (301 <= j && 600 >= j) ? "5mins" : (601 <= j && 1200 >= j) ? "10mins" : "20mins";
                String str2 = str;
                if (!rwa.c.contains(str2)) {
                    rwa.c.add(str2);
                    long totalMemory = rwa.d().totalMemory() - rwa.d().freeMemory();
                    rwa.f.c();
                    rwa.a().b().a(new b(rwa.h, rwa.g, str2, totalMemory), 20, TimeUnit.SECONDS);
                }
                return ajxw.a;
            }
        }

        e(rwa rwa) {
            this.a = rwa;
        }

        public final void run() {
            this.a.d.a(ajdx.c((Callable) new 1(this)).b((ajdw) this.a.a().f()).c(), b.ON_DESTROY, "MemoryUsageReportingObserver");
        }
    }

    /* renamed from: rwa$b */
    static final class b implements Runnable {
        private final ajwy<ilv> a;
        private final ajwy<ilw> b;
        private final String c;
        private final long d;

        public b(ajwy<ilv> ajwy, ajwy<ilw> ajwy2, String str, long j) {
            akcr.b(ajwy, "graphene");
            akcr.b(ajwy2, "grapheneFlusher");
            akcr.b(str, "bucket");
            this.a = ajwy;
            this.b = ajwy2;
            this.c = str;
            this.d = j;
        }

        public final void run() {
            String str = "os_version";
            ((ilv) this.a.get()).b(iot.MEMORY_USAGE_BACKGROUND.a("time_bucket", this.c).a(str, String.valueOf(VERSION.SDK_INT)), this.d);
            ((ilw) this.b.get()).b();
        }
    }

    /* renamed from: rwa$a */
    static final class a {
        final int a;
        final zjm b;

        public a(int i, zjm zjm) {
            this.a = i;
            this.b = zjm;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) == null || !akcr.a(this.b, aVar.b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.a * 31;
            zjm zjm = this.b;
            return i + (zjm != null ? zjm.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("MemoryCallbackMetaData(level=");
            stringBuilder.append(this.a);
            stringBuilder.append(", pageType=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rwa.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(rwa.class), "runtime", "getRuntime()Ljava/lang/Runtime;")};
    }

    public rwa(zgb zgb, zgk<b> zgk, ihh ihh, ppn ppn, ajwy<ilw> ajwy, ajwy<ilv> ajwy2, achb<zjm, zjk> achb) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(ihh, "clock");
        akcr.b(ppn, "memoryMonitor");
        akcr.b(ajwy, "grapheneFlusher");
        akcr.b(ajwy2, "graphene");
        akcr.b(achb, "navigationHost");
        this.m = zgb;
        this.d = zgk;
        this.e = ihh;
        this.f = ppn;
        this.g = ajwy;
        this.h = ajwy2;
        this.i = achb;
        Object create = ConcurrentHashMultiset.create();
        akcr.a(create, "ConcurrentHashMultiset.create()");
        this.c = create;
        this.k = ajxh.a(f.a);
        this.l = new ajei();
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.j.b();
    }

    public final void b() {
        this.a = this.e.c();
    }

    /* Access modifiers changed, original: final */
    public final Runtime d() {
        return (Runtime) this.k.b();
    }

    public final void e() {
        this.l.a();
        this.a = this.e.c();
        ArrayList arrayList = new ArrayList();
        ajej l = this.f.a().d((ajfb) new c(this, arrayList)).a((ajev) new d(this, arrayList)).l();
        akcr.a((Object) l, "memoryMonitor.trimMemory…             .subscribe()");
        ajvv.a(l, this.l);
        l = ajek.a((ajev) new e(this));
        akcr.a((Object) l, "Disposables.fromAction {…N_DESTROY, TAG)\n        }");
        ajvv.a(l, this.l);
    }

    public final void f() {
        this.l.a();
    }
}
