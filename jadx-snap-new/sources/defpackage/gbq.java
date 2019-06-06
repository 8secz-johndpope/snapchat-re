package defpackage;

import android.net.NetworkInfo;
import com.brightcove.player.event.Event;
import com.google.common.base.Optional;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: gbq */
public final class gbq implements hws {
    final Map<String, gbu> a = new LinkedHashMap();
    final ajwo<Boolean> b;
    final ajwy<gbc> c;
    final ajwy<abss> d;
    final ajwy<ifa> e;
    final ajwy<gbv> f;
    final ajwy<gby> g;
    final ajwy<ftl> h;
    private final ajxe i;
    private final ajdw j = zfx.a((ajdw) a().b(), 1);
    private ajei k;
    private final ajwy<ihh> l;

    /* renamed from: gbq$x */
    static final class x extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        x(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hwj.a.callsite("DirectJobScheduler"));
        }
    }

    /* renamed from: gbq$i */
    static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return Boolean.valueOf(l.longValue() == 0);
        }
    }

    /* renamed from: gbq$j */
    static final class j<T> implements ajfb<Boolean> {
        private /* synthetic */ gbq a;

        j(gbq gbq) {
            this.a = gbq;
        }

        public final /* synthetic */ void accept(Object obj) {
            gbv gbv;
            obj = (Boolean) obj;
            gbq gbq = this.a;
            gbv gbv2 = (gbv) gbq.f.get();
            Object obj2 = (gby) gbq.g.get();
            if (((ftl) gbq.h.get()).a((fth) fxq.DURABLE_JOB_MUSHROOM_WORKMANAGER_WAKEUP_EMABLED)) {
                akcr.a(obj2, "workManagerWakeUpScheduler");
                gbv = (gbv) obj2;
                gbv2.c();
            } else {
                akcr.a((Object) gbv2, "fjdWakeUpScheduler");
                obj2.c();
                gbv = gbv2;
            }
            akcr.a(obj, "empty");
            if (obj.booleanValue()) {
                gbv.c();
            } else {
                gbv.b();
            }
        }
    }

    /* renamed from: gbq$k */
    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gbq$l */
    static final class l<T> implements ajfb<List<? extends String>> {
        private /* synthetic */ gbq a;

        l(gbq gbq) {
            this.a = gbq;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            if (obj.isEmpty()) {
                this.a.f();
            }
            akcr.a(obj, "tags");
            for (String a : (Iterable) obj) {
                this.a.a(a);
            }
        }
    }

    /* renamed from: gbq$m */
    static final class m<T> implements ajfb<Throwable> {
        public static final m a = new m();

        m() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gbq$c */
    static final class c<V> implements Callable<Object> {
        private /* synthetic */ gbq a;
        private /* synthetic */ List b;

        c(gbq gbq, List list) {
            this.a = gbq;
            this.b = list;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x003b in {10, 12, 15, 18} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r4 = this;
            r0 = r4.a;
            r0 = r0.a;
            monitor-enter(r0);
            r1 = r4.b;	 Catch:{ all -> 0x0038 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0038 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0038 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0034;	 Catch:{ all -> 0x0038 }
            r2 = r1.next();	 Catch:{ all -> 0x0038 }
            r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0038 }
            r3 = r4.a;	 Catch:{ all -> 0x0038 }
            r3 = r3.a;	 Catch:{ all -> 0x0038 }
            r3 = r3.get(r2);	 Catch:{ all -> 0x0038 }
            r3 = (defpackage.gbu) r3;	 Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x002c;	 Catch:{ all -> 0x0038 }
            r3 = r3.b;	 Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x002c;	 Catch:{ all -> 0x0038 }
            r3.dispose();	 Catch:{ all -> 0x0038 }
            r3 = r4.a;	 Catch:{ all -> 0x0038 }
            r3 = r3.a;	 Catch:{ all -> 0x0038 }
            r3.remove(r2);	 Catch:{ all -> 0x0038 }
            goto L_0x000d;
            monitor-exit(r0);
            r0 = defpackage.ajxw.a;
            return r0;
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gbq$c.call():java.lang.Object");
        }
    }

    /* renamed from: gbq$w */
    static final class w implements Runnable {
        private /* synthetic */ gbq a;
        private /* synthetic */ hwg b;

        w(gbq gbq, hwg hwg) {
            this.a = gbq;
            this.b = hwg;
        }

        public final void run() {
            this.a.a(this.b.b());
        }
    }

    /* renamed from: gbq$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gbq$n */
    static final class n<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ gbq a;
        private /* synthetic */ String b;

        n(gbq gbq, String str) {
            this.a = gbq;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.b(this.b);
        }
    }

    /* renamed from: gbq$p */
    static final class p implements ajev {
        public static final p a = new p();

        p() {
        }

        public final void run() {
        }
    }

    /* renamed from: gbq$o */
    static final class o<T> implements ajfb<Throwable> {
        private /* synthetic */ gbq a;
        private /* synthetic */ String b;

        o(gbq gbq, String str) {
            this.a = gbq;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Object obj2 = this.a.d.get();
            akcr.a(obj2, "releaseManager.get()");
            if (((abss) obj2).k()) {
                throw new IllegalStateException("Queue execution completed incorrectly.", th);
            }
        }
    }

    /* renamed from: gbq$t */
    static final class t extends akcq implements akbk<gbc> {
        t(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gbc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: gbq$a */
    enum a {
        ;

        static {
            a = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* renamed from: gbq$u */
    static final class u<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ gbm a;

        u(gbm gbm) {
            this.a = gbm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gbc gbc = (gbc) obj;
            akcr.b(gbc, "durableJobManager");
            String b = this.a.b();
            byte[] f = this.a.f();
            if (f != null) {
                Object obj2 = StandardCharsets.UTF_8;
                String str = "StandardCharsets.UTF_8";
                akcr.a(obj2, str);
                String str2 = new String(f, obj2);
                String a = this.a.a();
                f = this.a.e();
                if (f != null) {
                    Object obj3 = StandardCharsets.UTF_8;
                    akcr.a(obj3, str);
                    return gbc.a(b, a, (int) this.a.g(), str2, new String(f, obj3));
                }
                throw new IllegalStateException("Invalid job config");
            }
            throw new IllegalStateException("Invalid job metadata");
        }
    }

    /* renamed from: gbq$v */
    static final class v<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ gbq a;
        private /* synthetic */ gbm b;

        v(gbq gbq, gbm gbm) {
            this.a = gbq;
            this.b = gbm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gay gay = (gay) obj;
            akcr.b(gay, "job");
            if (this.a.a(gay.a)) {
                return ((gbc) this.a.c.get()).a(gay);
            }
            obj = ajdx.b(new gbd(gay, false, true));
            akcr.a(obj, "Single.just(DurableJobResult(job, false, true))");
            return obj;
        }
    }

    /* renamed from: gbq$z */
    static final class z<T, R> implements ajfc<gbd, ajdb> {
        private /* synthetic */ String a;
        private /* synthetic */ gbq b;
        private /* synthetic */ String c;

        z(String str, gbq gbq, String str2) {
            this.a = str;
            this.b = gbq;
            this.c = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdp a;
            gbd gbd = (gbd) obj;
            akcr.b(gbd, "result");
            gbq gbq = this.b;
            String str = this.c;
            String str2 = this.a;
            boolean z = gbd.b;
            long j = 0;
            Object valueOf = Long.valueOf(0);
            if (!z && gbd.c) {
                gay gay = gbd.a;
                hwg hwg = gay.a;
                if (gbq.a(hwg)) {
                    if (hwg.c.f) {
                        j = (long) Math.pow(2.0d, (double) Math.min(gay.d - 2, 7));
                    }
                    a = ajdp.a(j, TimeUnit.SECONDS, (ajdw) gbq.a().b());
                } else {
                    int b = gbq.b(hwg);
                    ajcx b2 = ((gbc) gbq.c.get()).b(hwg);
                    Object a2 = ajdx.c((Callable) new gbs(new q(gbq.e))).d((ajfc) r.a).a((ajdw) gbq.a().b());
                    akcr.a(a2, "Single.fromCallable(netw…schedulers.computation())");
                    a = b2.a((ajdt) a2).a((ajfl) e.a).p(f.a).p(new g(gbq, b)).a((ajfl) new h(str2)).c(1);
                }
            } else {
                a = ajdp.b(valueOf);
            }
            obj = a.c(1).p(new d(gbq, str)).g();
            akcr.a(obj, "kicker\n                .…       }.ignoreElements()");
            return obj;
        }
    }

    /* renamed from: gbq$aa */
    static final class aa<T, R> implements ajfc<Throwable, ajdb> {
        private /* synthetic */ String a;
        private /* synthetic */ gbm b;
        private /* synthetic */ gbq c;
        private /* synthetic */ String d;

        aa(String str, gbm gbm, gbq gbq, String str2) {
            this.a = str;
            this.b = gbm;
            this.c = gbq;
            this.d = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ((gbc) this.c.c.get()).e(this.b.a());
        }
    }

    /* renamed from: gbq$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ gbq a;
        private /* synthetic */ String b;

        d(gbq gbq, String str) {
            this.a = gbq;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            this.a.a(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: gbq$y */
    static final class y implements Runnable {
        private /* synthetic */ gbm a;
        private /* synthetic */ gbq b;
        private /* synthetic */ String c;

        y(gbm gbm, gbq gbq, String str) {
            this.a = gbm;
            this.b = gbq;
            this.c = str;
        }

        public final void run() {
            this.b.a(this.a.c());
        }
    }

    /* renamed from: gbq$e */
    static final class e<T> implements ajfl<Optional<NetworkInfo>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: gbq$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return (NetworkInfo) optional.get();
        }
    }

    /* renamed from: gbq$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ gbq a;
        private /* synthetic */ int b;

        g(gbq gbq, int i) {
            this.a = gbq;
            this.b = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean m;
            akcr.b((NetworkInfo) obj, "it");
            int i = gbr.a[this.b - 1];
            if (i == 1) {
                m = ((ifa) this.a.e.get()).m();
            } else if (i == 2) {
                m = ((ifa) this.a.e.get()).l();
            } else if (i != 3) {
                throw new ajxk();
            } else {
                throw new IllegalStateException("Unhandled constraint");
            }
            return Boolean.valueOf(m);
        }
    }

    /* renamed from: gbq$h */
    static final class h<T> implements ajfl<Boolean> {
        private /* synthetic */ String a;

        h(String str) {
            this.a = str;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            bool.booleanValue();
            return bool.booleanValue();
        }
    }

    /* renamed from: gbq$r */
    static final class r<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final r a = new r();

        r() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ifa ifa = (ifa) obj;
            akcr.b(ifa, "it");
            return ifa.e();
        }
    }

    /* renamed from: gbq$s */
    static final class s implements ajda {
        private /* synthetic */ gbq a;

        s(gbq gbq) {
            this.a = gbq;
        }

        public final void subscribe(final ajcy ajcy) {
            akcr.b(ajcy, Event.EMITTER);
            ajcy.a(this.a.b.f((ajfb) new ajfb<Boolean>() {
                public final /* synthetic */ void accept(Object obj) {
                    ajcy.a();
                }
            }));
            this.a.d();
        }
    }

    /* renamed from: gbq$q */
    static final class q extends akcq implements akbk<ifa> {
        q(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ifa) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gbq.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public gbq(ajwy<gbc> ajwy, ajwy<abss> ajwy2, ajwy<ifa> ajwy3, ajwy<gbv> ajwy4, ajwy<gby> ajwy5, ajwy<ihh> ajwy6, zgb zgb, ajwy<ftl> ajwy7) {
        akcr.b(ajwy, "durableJobManager");
        akcr.b(ajwy2, "releaseManager");
        akcr.b(ajwy3, "networkManager");
        akcr.b(ajwy4, "wakeUpSchedulerProvider");
        akcr.b(ajwy5, "workerWakeUpSchedulerProvider");
        akcr.b(ajwy6, "clock");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy7, "configurationProvider");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
        this.g = ajwy5;
        this.l = ajwy6;
        this.h = ajwy7;
        this.i = ajxh.a(new x(zgb));
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Boolean>()");
        this.b = ajwo;
    }

    static int b(hwg<?> hwg) {
        return hwg.c.b.contains(Integer.valueOf(2)) ? 2 : hwg.c.b.contains(Integer.valueOf(1)) ? 3 : 1;
    }

    private final ajcx g() {
        if (((gbc) this.c.get()).d() == 0) {
            f();
        }
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
    }

    public final ajcx a(List<String> list) {
        Object a;
        String str;
        akcr.b(list, "uniqueTags");
        if (list.isEmpty()) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            a = ajcx.b((Callable) new c(this, list)).b((ajdb) ((gbc) this.c.get()).b((List) list));
            str = "Completable.fromCallable…).deleteJobs(uniqueTags))";
        }
        akcr.a(a, str);
        return a;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.i.b();
    }

    public final void a(String str) {
        akcr.b(str, "uniqueTag");
        synchronized (this.a) {
            gbu gbu = (gbu) this.a.get(str);
            if (gbu == null) {
                Object i = ajwl.i(Boolean.TRUE);
                akcr.a(i, "BehaviorSubject.createDefault(true)");
                akcr.b(i, "subject");
                akcr.b(str, "uniqueTag");
                ajde a = i.a(ajcw.MISSING);
                Object bVar = new b(str);
                ajfv.a(bVar, "onDrop is null");
                Object a2 = ajvo.a(new ajkh(a, bVar));
                akcr.a(a2, "subject.toFlowable(Backp…g kick for $uniqueTag\") }");
                a = a2.a(zfx.a((ajdw) a().b(), 1), 1);
                bVar = new n(this, str);
                ajfv.a(bVar, "mapper is null");
                ajfv.a(2, "prefetch");
                ajej a3 = ajvo.a(new ajne(a, bVar, 1)).a((ajev) p.a, (ajfb) new o(this, str));
                akcr.a((Object) a3, "applyBackpressure(subjec… }\n                    })");
                ajei ajei = this.k;
                if (ajei != null) {
                    ajei.a(a3);
                }
                this.a.put(str, new gbu(i, a3));
            } else if (gbu.b.isDisposed()) {
            } else {
                gbu.a.a(Boolean.TRUE);
            }
        }
    }

    public final <T extends hwg<?>> void a(String str, T t) {
        akcr.b(str, "uuid");
        akcr.b(t, "durableJob");
        Runnable wVar = new w(this, t);
        hwq hwq = t.c.e;
        if (hwq == null || a().b().a(wVar, hwq.a, hwq.b) == null) {
            wVar.run();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(hwg<?> hwg) {
        int i = gbr.b[gbq.b((hwg) hwg) - 1];
        if (i == 1) {
            return ((ifa) this.e.get()).m();
        }
        if (i == 2) {
            return ((ifa) this.e.get()).l();
        }
        if (i == 3) {
            return true;
        }
        throw new ajxk();
    }

    /* Access modifiers changed, original: final */
    public final ajcx b(String str) {
        long a = ((ihh) this.l.get()).a();
        gbm d = ((gbc) this.c.get()).d(str);
        if (d == null) {
            return g();
        }
        if (a < d.d()) {
            a().b().a(new y(d, this, str), Math.max(0, d.d() - a), TimeUnit.MILLISECONDS);
            return g();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.c());
        stringBuilder.append('[');
        stringBuilder.append(d.a());
        stringBuilder.append(']');
        String stringBuilder2 = stringBuilder.toString();
        akcr.b(d, "nextJob");
        Object a2 = ajdx.c((Callable) new gbs(new t(this.c))).a((ajfc) new u(d)).a((ajfc) new v(this, d));
        akcr.a(a2, "Single.fromCallable(dura…      }\n                }");
        Object a3 = a2.e((ajfc) new z(stringBuilder2, this, str)).a((ajfc) new aa(stringBuilder2, d, this, str));
        akcr.a(a3, "runJob(nextJob)\n        …b.uuid)\n                }");
        return a3;
    }

    public final void b() {
        ajei ajei = new ajei();
        ajej a = ((gbc) this.c.get()).e().p(i.a).j(ajfu.a).d((long) ((ftl) this.h.get()).f(fxq.DURABLE_JOB_WAKEUP_DEBOUNCE_SEC), TimeUnit.SECONDS).a(this.j).a((ajfb) new j(this), (ajfb) k.a);
        akcr.a((Object) a, "durableJobManager.get()\n…nges\")\n                })");
        ajvv.a(a, ajei);
        this.k = ajei;
        d();
    }

    public final ajcx c() {
        Object a = ajcx.a((ajda) new s(this));
        akcr.a(a, "Completable.create { emi…      kickAll()\n        }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        ajei ajei = this.k;
        if (ajei != null) {
            ajej a = ((gbc) this.c.get()).f().c(1).a((ajfb) new l(this), (ajfb) m.a);
            akcr.a((Object) a, "durableJobManager.get().…\")\n                    })");
            ajvv.a(a, ajei);
        }
    }

    public final void dispose() {
        e();
        ajei ajei = this.k;
        if (ajei != null) {
            ajei.dispose();
        }
    }

    public final void e() {
        synchronized (this.a) {
            this.a.clear();
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        this.b.a(Boolean.TRUE);
    }

    public final boolean isDisposed() {
        ajei ajei = this.k;
        return ajei != null ? ajei.isDisposed() : false;
    }
}
