package defpackage;

import defpackage.dae.a;
import java.util.concurrent.Callable;

/* renamed from: daf */
public final class daf extends ablj {
    final ajwy<dib> a;
    final aipn<dae> b;
    final aipn<dbo> c;
    final aipn<dah> d;
    private final ajdw e;
    private final ajdw f;
    private boolean g = true;
    private final ajei h = new ajei();
    private final abss i;
    private final ajwy<ftl> j;
    private final abqo k;

    /* renamed from: daf$j */
    static final class j<T, R> implements ajfc<Throwable, Boolean> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: daf$k */
    static final class k<T> implements ajfl<Boolean> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldMonitorBattery");
            return !bool.booleanValue();
        }
    }

    /* renamed from: daf$l */
    static final class l<T> implements ajfb<Boolean> {
        private /* synthetic */ daf a;

        l(daf daf) {
            this.a = daf;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.d();
        }
    }

    /* renamed from: daf$f */
    static final class f<V> implements Callable<Boolean> {
        private /* synthetic */ daf a;

        f(daf daf) {
            this.a = daf;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(((dib) this.a.a.get()).b(new aaah()));
        }
    }

    /* renamed from: daf$g */
    static final class g<T, R> implements ajfc<Throwable, Boolean> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: daf$h */
    static final class h<T> implements ajfl<Boolean> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldLogEvent");
            return !bool.booleanValue();
        }
    }

    /* renamed from: daf$i */
    static final class i<T> implements ajfb<Boolean> {
        private /* synthetic */ daf a;

        i(daf daf) {
            this.a = daf;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.d();
        }
    }

    /* renamed from: daf$d */
    static final class d implements Runnable {
        final /* synthetic */ daf a;

        /* renamed from: daf$d$a */
        static final class a implements defpackage.dae.a {
            private /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            public final void a(aaah aaah) {
                ((dib) this.a.a.a.get()).a((aajt) aaah);
            }
        }

        d(daf daf) {
            this.a = daf;
        }

        public final void run() {
            ((dae) this.a.b.get()).a((a) new a(this));
        }
    }

    /* renamed from: daf$a */
    static final class a implements Runnable {
        private /* synthetic */ daf a;

        a(daf daf) {
            this.a = daf;
        }

        public final void run() {
            ((dae) this.a.b.get()).a();
        }
    }

    /* renamed from: daf$c */
    static final class c implements Runnable {
        private /* synthetic */ daf a;
        private /* synthetic */ long b;

        c(daf daf, long j) {
            this.a = daf;
            this.b = j;
        }

        public final void run() {
            ((dae) this.a.b.get()).a(this.b);
            ((dah) this.a.d.get()).a();
        }
    }

    /* renamed from: daf$b */
    static final class b implements Runnable {
        private /* synthetic */ daf a;

        b(daf daf) {
            this.a = daf;
        }

        public final void run() {
            this.a.d();
        }
    }

    /* renamed from: daf$e */
    static final class e implements Runnable {
        private /* synthetic */ daf a;
        private /* synthetic */ long b;

        e(daf daf, long j) {
            this.a = daf;
            this.b = j;
        }

        public final void run() {
            ((dae) this.a.b.get()).b(this.b);
            ((dbo) this.a.c.get()).a();
        }
    }

    public daf(zgb zgb, abss abss, ajwy<ftl> ajwy, ajwy<dib> ajwy2, aipn<dae> aipn, aipn<dbo> aipn2, aipn<dah> aipn3, abqo abqo) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(abss, "releaseManager");
        akcr.b(ajwy, "configurationProvider");
        akcr.b(ajwy2, "blizzardEventLoggerProvider");
        akcr.b(aipn, "batteryMonitorLazy");
        akcr.b(aipn2, "devicePowerProfileMonitor");
        akcr.b(aipn3, "backgroundRestrictionsMonitor");
        akcr.b(abqo, "clock");
        this.i = abss;
        this.j = ajwy;
        this.a = ajwy2;
        this.b = aipn;
        this.c = aipn2;
        this.d = aipn3;
        this.k = abqo;
        String str = "BatteryMonitorBinderKt";
        this.e = zfx.a((ajdw) zgb.a(dad.a.callsite(str)).j(), 1);
        this.f = zgb.a(dad.a.callsite(str)).j();
    }

    public final synchronized void a() {
        if (!this.i.d()) {
            this.h.a(((ftl) this.j.get()).b((fth) dab.BATTERY_MONITORING).b(this.f).g(j.a).a((ajfl) k.a).c((ajfb) new l(this)).i());
            this.h.a(((dib) this.a.get()).d().b(this.f).c((Callable) new f(this)).g(g.a).a((ajfl) h.a).c((ajfb) new i(this)).i());
        }
    }

    public final synchronized void b() {
        if (this.g) {
            this.e.a((Runnable) new d(this));
        }
    }

    public final void c() {
        this.e.a((Runnable) new b(this));
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void d() {
        if (this.g) {
            this.h.dispose();
            this.e.a((Runnable) new a(this));
            this.g = false;
        }
    }

    public final synchronized void e() {
        if (this.g) {
            this.e.a((Runnable) new c(this, abqo.c()));
        }
    }

    public final synchronized void f() {
        if (this.g) {
            this.e.a((Runnable) new e(this, abqo.c()));
        }
    }
}
