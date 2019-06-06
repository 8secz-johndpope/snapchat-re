package defpackage;

import defpackage.gop.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gof */
public final class gof implements gnk {
    final ConcurrentHashMap<String, gnl> a = new ConcurrentHashMap();
    final ajxe b = ajxh.a(new b(this));
    final ajwy<ggc> c;
    final ajwy<zgb> d;
    final ajwy<gnj> e;
    final ajwy<gqr> f;
    final ajwy<a> g;
    private final ajxe h = ajxh.a(new a(this));
    private final ajxe i = ajxh.a(new k(this));
    private final ajxe j = ajxh.a(new c(this));
    private final ajxe k = ajxh.a(new d(this));
    private final ajwy<gni> l;
    private final ajwy<sah> m;
    private final ajei n;

    /* renamed from: gof$a */
    static final class a extends akcs implements akbk<ggc> {
        private /* synthetic */ gof a;

        a(gof gof) {
            this.a = gof;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ggc) this.a.c.get();
        }
    }

    /* renamed from: gof$b */
    static final class b extends akcs implements akbk<gqr> {
        private /* synthetic */ gof a;

        b(gof gof) {
            this.a = gof;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) this.a.f.get();
        }
    }

    /* renamed from: gof$k */
    static final class k extends akcs implements akbk<zgb> {
        private /* synthetic */ gof a;

        k(gof gof) {
            this.a = gof;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zgb) this.a.d.get();
        }
    }

    /* renamed from: gof$c */
    static final class c extends akcs implements akbk<gnj> {
        private /* synthetic */ gof a;

        c(gof gof) {
            this.a = gof;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gnj) this.a.e.get();
        }
    }

    /* renamed from: gof$d */
    static final class d extends akcs implements akbk<a> {
        private /* synthetic */ gof a;

        d(gof gof) {
            this.a = gof;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (a) this.a.g.get();
        }
    }

    /* renamed from: gof$j */
    static final class j implements Runnable {
        private /* synthetic */ gof a;
        private /* synthetic */ gnl b;

        j(gof gof, gnl gnl) {
            this.a = gof;
            this.b = gnl;
        }

        public final void run() {
            this.a.a.remove(this.b.b(), this.b);
        }
    }

    /* renamed from: gof$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ gnl a;
        private /* synthetic */ gop b;
        private /* synthetic */ AtomicBoolean c;
        private /* synthetic */ gom d;
        private /* synthetic */ ajei e;

        e(gnl gnl, gop gop, AtomicBoolean atomicBoolean, gom gom, ajei ajei) {
            this.a = gnl;
            this.b = gop;
            this.c = atomicBoolean;
            this.d = gom;
            this.e = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.b.a(booleanValue);
            if (booleanValue && this.c.compareAndSet(false, true)) {
                ajvv.a(this.a.a(this.d), this.e);
            }
        }
    }

    /* renamed from: gof$f */
    static final class f implements ajev {
        private /* synthetic */ gop a;

        f(gop gop) {
            this.a = gop;
        }

        public final void run() {
            this.a.a(false);
        }
    }

    /* renamed from: gof$g */
    static final class g<T> implements ajfb<ajej> {
        private /* synthetic */ gnl a;

        g(gnl gnl) {
            this.a = gnl;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gof$h */
    static final class h<T> implements ajfb<Boolean> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gof$i */
    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ gof a;
        private /* synthetic */ gnl b;
        private /* synthetic */ idd c;

        i(gof gof, gnl gnl, idd idd) {
            this.a = gof;
            this.b = gnl;
            this.c = idd;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "e");
            ((gqr) this.a.b.b()).a(gqt.HIGH, th, this.c);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gof.class), "defaultSnapContentResolver", "getDefaultSnapContentResolver()Lcom/snap/core/net/content/impl/AssociatePriorityAwareSnapContentResolver;"), new akdc(akde.a(gof.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;"), new akdc(akde.a(gof.class), "schedulersProvider", "getSchedulersProvider()Lcom/snap/taskexecution/scheduling/SchedulersProvider;"), new akdc(akde.a(gof.class), "pageReadySignalProvider", "getPageReadySignalProvider()Lcom/snap/core/prefetch/api/ForegroundPrefetchPageReadyObservableProvider;"), new akdc(akde.a(gof.class), "prefetchThrottlerFactory", "getPrefetchThrottlerFactory()Lcom/snap/core/prefetch/impl/PrefetchThrottler$Factory;")};
    }

    public gof(ajwy<ggc> ajwy, ajwy<zgb> ajwy2, ajwy<gnj> ajwy3, ajwy<gni> ajwy4, ajwy<sah> ajwy5, ajwy<gqr> ajwy6, ajwy<a> ajwy7, ajei ajei) {
        akcr.b(ajwy, "defaultSnapContentResolverProvider");
        akcr.b(ajwy2, "schedulersProviderProvider");
        akcr.b(ajwy3, "pageReadySignalProviderProvider");
        akcr.b(ajwy4, "foregroundPrefetchConfigurationProvider");
        akcr.b(ajwy5, "backoffControllerProvider");
        akcr.b(ajwy6, "exceptionTrackerProvider");
        akcr.b(ajwy7, "prefetchThrottlerFactoryProvider");
        akcr.b(ajei, "userSessionDisposable");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.l = ajwy4;
        this.m = ajwy5;
        this.f = ajwy6;
        this.g = ajwy7;
        this.n = ajei;
    }

    public final ajej a(gnl gnl) {
        gnl gnl2 = gnl;
        akcr.b(gnl2, "processor");
        if (this.a.putIfAbsent(gnl.b(), gnl2) != null) {
            Object obj = ajfq.INSTANCE;
            akcr.a(obj, "Disposables.disposed()");
            return obj;
        }
        ajei ajei = new ajei();
        idd callsite = gnq.a.callsite(gnl.b());
        this.i.b();
        ajdw f = zgb.a(callsite).f();
        gop a = ((a) this.k.b()).a(gnl.a(), gnl.c());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String b = gnl.b();
        ajwy ajwy = this.l;
        ajwy ajwy2 = this.m;
        Object obj2 = (ggc) this.h.b();
        akcr.a(obj2, "defaultSnapContentResolver");
        ajej a2 = ((gnj) this.j.b()).a(gnl.a(), gnl.c()).j(ajfu.a).b(f).d((ajfb) new e(gnl, a, atomicBoolean, new gom(b, ajwy, ajwy2, obj2, a, f), ajei)).a((ajev) new f(a)).e((ajfb) new g(gnl2)).a((ajfb) h.a, (ajfb) new i(this, gnl2, callsite));
        akcr.a((Object) a2, "pageReadySignalProvider.…      }\n                )");
        ajvv.a(a2, ajei);
        ajei.a(ajek.a((Runnable) new j(this, gnl2)));
        ajej ajej = ajei;
        this.n.a(ajej);
        return ajej;
    }
}
