package defpackage;

import android.location.Location;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: rwm */
public final class rwm {
    final ajdx<qxl> a;
    final ajdx<ira> b;
    final ajdx<yhz> c;
    final ajwy<hyq> d;
    final ajwy<evg> e;
    final ajwy<hxs> f;
    final ihh g;
    final ajwy<hch> h;
    final ajwy<nbl> i;
    final ajwy<ncc> j;
    final ngo k;
    private final ajxe l;
    private final ajxe m = ajxh.a(new n(this));
    private final ajwy<sah> n;
    private final zgb o;

    /* renamed from: rwm$i */
    public static abstract class i {
        long c;

        public abstract ajcx a(boolean z);

        public abstract idd a();

        public abstract long b();
    }

    /* renamed from: rwm$j */
    static final class j extends akcq implements akbk<ftl> {
        j(ajwy ajwy) {
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
            return (ftl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: rwm$a */
    public final class a extends i {
        private final idd b = irc.t.callsite("AllUpdatesSyncer");
        private final long d = TimeUnit.MINUTES.toMillis(15);

        /* renamed from: rwm$a$a */
        static final class a<T> implements ajfb<ajej> {
            public static final a a = new a();

            a() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: rwm$a$b */
        static final class b<T, R> implements ajfc<ira, ajdb> {
            private /* synthetic */ boolean a;
            private /* synthetic */ zfw b;

            b(boolean z, zfw zfw) {
                this.a = z;
                this.b = zfw;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ira ira = (ira) obj;
                akcr.b(ira, "api");
                return ira.a(this.a).b((ajdw) this.b.g());
            }
        }

        /* renamed from: rwm$a$c */
        static final class c<V> implements Callable<T> {
            private /* synthetic */ a a;

            c(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object call() {
                return (hxs) rwm.this.f.get();
            }
        }

        /* renamed from: rwm$a$d */
        static final class d<T, R> implements ajfc<hxs, ajdb> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                hxs hxs = (hxs) obj;
                akcr.b(hxs, "it");
                return hxs.b((fth) jic.MUSHROOM_OPTED_IN, Boolean.TRUE);
            }
        }

        /* renamed from: rwm$a$e */
        static final class e<V> implements Callable<Object> {
            private /* synthetic */ a a;

            e(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object call() {
                a aVar = this.a;
                if (!rwm.this.a().a((fth) jic.MUSHROOM_EXP_ENABLED)) {
                    rwm.this.a().a((fth) jic.MUSHROOM_AB_ENABLED);
                }
                return ajxw.a;
            }
        }

        /* renamed from: rwm$a$f */
        static final class f<T, R> implements ajfc<ira, ajdb> {
            public static final f a = new f();

            f() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                ira ira = (ira) obj;
                akcr.b(ira, "it");
                return ira.d();
            }
        }

        public final ajcx a(boolean z) {
            Object e = rwm.this.b.b((ajfb) a.a).e((ajfc) new b(z, zgb.a(this.b))).b((ajeb) ajdx.c((Callable) new c(this))).e((ajfc) d.a).b((ajdb) ajcx.b((Callable) new e(this))).b((ajeb) rwm.this.b).e((ajfc) f.a);
            akcr.a(e, "identityApi\n            ….syncFriendsUserScore() }");
            return e;
        }

        public final idd a() {
            return this.b;
        }

        public final long b() {
            return this.d;
        }
    }

    /* renamed from: rwm$f */
    public final class f extends i {
        private final idd a = irc.t.callsite("ServerConfigsSyncer");
        private final long b = TimeUnit.MINUTES.toMillis(3);

        /* renamed from: rwm$f$a */
        static final class a<T> implements ajfb<ajej> {
            public static final a a = new a();

            a() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: rwm$f$b */
        static final class b<T, R> implements ajfc<ira, ajdb> {
            private /* synthetic */ zfw a;

            b(zfw zfw) {
                this.a = zfw;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ira ira = (ira) obj;
                akcr.b(ira, "api");
                return ira.b().b((ajdw) this.a.g());
            }
        }

        public final ajcx a(boolean z) {
            Object e = rwm.this.b.b((ajfb) a.a).e((ajfc) new b(zgb.a(this.a)));
            akcr.a(e, "identityApi\n            …())\n                    }");
            return e;
        }

        public final idd a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    /* renamed from: rwm$e */
    public final class e extends i {
        private final idd a = qxo.b.callsite("FriendsFeedSyncer");
        private final long b;

        /* renamed from: rwm$e$a */
        static final class a<T> implements ajfb<ajej> {
            public static final a a = new a();

            a() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: rwm$e$b */
        static final class b<T, R> implements ajfc<qxl, ajdb> {
            private /* synthetic */ qxt a;

            b(qxt qxt) {
                this.a = qxt;
            }

            public final /* synthetic */ Object apply(Object obj) {
                qxl qxl = (qxl) obj;
                akcr.b(qxl, "api");
                return qxl.a(this.a);
            }
        }

        /* renamed from: rwm$e$c */
        static final class c<T, R> implements ajfc<yhz, ajdb> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                yhz yhz = (yhz) obj;
                akcr.b(yhz, "it");
                return yhz.a(null);
            }
        }

        public final ajcx a(boolean z) {
            Object e = rwm.this.a.b((ajfb) a.a).e((ajfc) new b(z ? qxt.COLD_START : qxt.WARM_START)).b((ajeb) rwm.this.c).e((ajfc) c.a);
            akcr.a(e, "friendsFeedApi\n         …tchGroupStoryMetadata() }");
            return e;
        }

        public final idd a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    /* renamed from: rwm$d */
    public final class d extends i {
        final String a = "app_open";
        private final idd d = qxo.b.callsite("FideliusSyncer");
        private final long e;

        /* renamed from: rwm$d$a */
        static final class a implements ajev {
            private /* synthetic */ d a;
            private /* synthetic */ boolean b;

            a(d dVar, boolean z) {
                this.a = dVar;
                this.b = z;
            }

            public final void run() {
                if (!this.b) {
                    ((hyq) rwm.this.d.get()).a(this.a.a);
                }
            }
        }

        public final ajcx a(boolean z) {
            Object a = ajcx.a((ajev) new a(this, z));
            akcr.a(a, "Completable.fromAction {…          }\n            }");
            return a;
        }

        public final idd a() {
            return this.d;
        }

        public final long b() {
            return this.e;
        }
    }

    /* renamed from: rwm$b */
    public final class b extends i {
        private final idd a = evh.a.callsite("CircumstanceEngineSyncer");
        private final long b = TimeUnit.MINUTES.toMillis(3);

        public final ajcx a(boolean z) {
            return ((evg) rwm.this.e.get()).a();
        }

        public final idd a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    /* renamed from: rwm$c */
    public final class c extends i {
        private final idd a = hbn.f.callsite("DiscoverFeedSyncer");
        private final long b;

        public final ajcx a(boolean z) {
            if (z) {
                return ((hch) rwm.this.h.get()).a();
            }
            if (z) {
                throw new ajxk();
            }
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }

        public final idd a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    /* renamed from: rwm$h */
    public final class h extends i {
        private final idd b = qxo.b.callsite("StoriesSyncer");
        private final long d = TimeUnit.MINUTES.toMillis(5);
        private final zfw e = zgb.a(this.b);

        /* renamed from: rwm$h$a */
        static final class a<T> implements ajfb<ajej> {
            public static final a a = new a();

            a() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: rwm$h$b */
        static final class b<T, R> implements ajfc<Optional<Location>, ajdb> {
            private /* synthetic */ h a;

            b(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final Optional optional = (Optional) obj;
                akcr.b(optional, MapboxEvent.TYPE_LOCATION);
                return rwm.this.c.e((ajfc) new ajfc<yhz, ajdb>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        yhz yhz = (yhz) obj;
                        akcr.b(yhz, "it");
                        return yhz.a((Location) optional.orNull());
                    }
                });
            }
        }

        /* renamed from: rwm$h$c */
        static final class c<T, R> implements ajfc<T, R> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Location location = (Location) obj;
                akcr.b(location, "it");
                return Optional.of(location);
            }
        }

        public final ajcx a(boolean z) {
            Object e = (((ncc) rwm.this.j.get()).a() ? ((nbl) rwm.this.i.get()).c().p(c.a) : ajdp.b(Optional.absent())).d().b((ajfb) a.a).a((ajdw) this.e.g()).e(new b(this));
            akcr.a(e, "observeLocation\n        …) }\n                    }");
            return e;
        }

        public final idd a() {
            return this.b;
        }

        public final long b() {
            return this.d;
        }
    }

    /* renamed from: rwm$g */
    public final class g extends i {
        private final idd a = ngn.d.callsite("SnapKitAppConnectionsSyncer");
        private final long b = TimeUnit.MINUTES.toMillis(5);

        public final ajcx a(boolean z) {
            return rwm.this.k.a();
        }

        public final idd a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    /* renamed from: rwm$n */
    static final class n extends akcs implements akbk<List<? extends i>> {
        private /* synthetic */ rwm a;

        n(rwm rwm) {
            this.a = rwm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajym.b((Object[]) new i[]{new a(), new f(), new e(), new d(), new b(), new c(), new h(), new g()});
        }
    }

    /* renamed from: rwm$l */
    static final class l<V> implements Callable<Boolean> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: rwm$k */
    static final class k implements ajev {
        private /* synthetic */ i a;
        private /* synthetic */ long b;
        private /* synthetic */ ajei c;
        private /* synthetic */ rwm d;
        private /* synthetic */ boolean e;

        k(i iVar, long j, ajei ajei, rwm rwm, boolean z) {
            this.a = iVar;
            this.b = j;
            this.c = ajei;
            this.d = rwm;
            this.e = z;
        }

        public final void run() {
            this.a.c = this.d.g.a();
        }
    }

    /* renamed from: rwm$m */
    static final class m<T> implements ajfb<Throwable> {
        private /* synthetic */ i a;

        m(i iVar) {
            this.a = iVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rwm.class), "configurationProvider", "getConfigurationProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(rwm.class), "syncers", "getSyncers()Ljava/util/List;")};
    }

    public rwm(ajdx<qxl> ajdx, ajdx<ira> ajdx2, ajdx<yhz> ajdx3, ajwy<hyq> ajwy, ajwy<evg> ajwy2, ajwy<hxs> ajwy3, ajwy<sah> ajwy4, ajwy<ftl> ajwy5, ihh ihh, zgb zgb, ajwy<hch> ajwy6, ajwy<nbl> ajwy7, ajwy<ncc> ajwy8, ngo ngo) {
        akcr.b(ajdx, "friendsFeedApi");
        akcr.b(ajdx2, "identityApi");
        akcr.b(ajdx3, "storiesApi");
        akcr.b(ajwy, "fideliusManager");
        akcr.b(ajwy2, "circumstanceEngine");
        akcr.b(ajwy3, "featureConfiguration");
        akcr.b(ajwy4, "noNetworkBackOffController");
        akcr.b(ajwy5, "configurationProviderProvider");
        akcr.b(ihh, "clock");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy6, "discoverFeedContentSyncer");
        akcr.b(ajwy7, "currentLocationManager");
        akcr.b(ajwy8, "locationPermissionsProvider");
        akcr.b(ngo, "loginkitSyncApi");
        this.a = ajdx;
        this.b = ajdx2;
        this.c = ajdx3;
        this.d = ajwy;
        this.e = ajwy2;
        this.f = ajwy3;
        this.n = ajwy4;
        this.g = ihh;
        this.o = zgb;
        this.h = ajwy6;
        this.i = ajwy7;
        this.j = ajwy8;
        this.k = ngo;
        this.l = ajxh.a(new j(ajwy5));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x00be in {5, 6, 7, 10, 17, 18, 20, 22} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.ajej a(boolean r14) {
        /*
        r13 = this;
        r0 = r13.a();	 Catch:{ all -> 0x00bc }
        r1 = defpackage.fxs.STARTUP_MODE;	 Catch:{ all -> 0x00bc }
        r1 = (defpackage.fth) r1;	 Catch:{ all -> 0x00bc }
        r0 = r0.l(r1);	 Catch:{ all -> 0x00bc }
        r0 = (defpackage.fxv) r0;	 Catch:{ all -> 0x00bc }
        r1 = r0;	 Catch:{ all -> 0x00bc }
        r1 = (defpackage.fxv) r1;	 Catch:{ all -> 0x00bc }
        r2 = defpackage.fxv.ALL;	 Catch:{ all -> 0x00bc }
        r3 = 0;	 Catch:{ all -> 0x00bc }
        if (r1 == r2) goto L_0x001f;	 Catch:{ all -> 0x00bc }
        r0 = (defpackage.fxv) r0;	 Catch:{ all -> 0x00bc }
        r1 = defpackage.fxv.NO_ACTIVITY_OBSERVERS;	 Catch:{ all -> 0x00bc }
        if (r0 != r1) goto L_0x001d;	 Catch:{ all -> 0x00bc }
        goto L_0x001f;	 Catch:{ all -> 0x00bc }
        r0 = 0;	 Catch:{ all -> 0x00bc }
        goto L_0x0020;	 Catch:{ all -> 0x00bc }
        r0 = 1;	 Catch:{ all -> 0x00bc }
        if (r0 != 0) goto L_0x002a;	 Catch:{ all -> 0x00bc }
        r14 = defpackage.ajfq.INSTANCE;	 Catch:{ all -> 0x00bc }
        r0 = "Disposables.disposed()";	 Catch:{ all -> 0x00bc }
        defpackage.akcr.a(r14, r0);	 Catch:{ all -> 0x00bc }
        return r14;	 Catch:{ all -> 0x00bc }
        r0 = new ajei;	 Catch:{ all -> 0x00bc }
        r0.<init>();	 Catch:{ all -> 0x00bc }
        r1 = r13.m;	 Catch:{ all -> 0x00bc }
        r1 = r1.b();	 Catch:{ all -> 0x00bc }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x00bc }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x00bc }
        r1 = r1.iterator();	 Catch:{ all -> 0x00bc }
        r2 = r1.hasNext();	 Catch:{ all -> 0x00bc }
        if (r2 == 0) goto L_0x00b9;	 Catch:{ all -> 0x00bc }
        r2 = r1.next();	 Catch:{ all -> 0x00bc }
        r2 = (defpackage.rwm.i) r2;	 Catch:{ all -> 0x00bc }
        r4 = r13.g;	 Catch:{ all -> 0x00bc }
        r6 = r4.a();	 Catch:{ all -> 0x00bc }
        r4 = r2.c;	 Catch:{ all -> 0x00bc }
        r4 = r6 - r4;	 Catch:{ all -> 0x00bc }
        if (r14 != 0) goto L_0x005d;	 Catch:{ all -> 0x00bc }
        r8 = r2.b();	 Catch:{ all -> 0x00bc }
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));	 Catch:{ all -> 0x00bc }
        if (r10 < 0) goto L_0x003d;	 Catch:{ all -> 0x00bc }
        r4 = r2.a();	 Catch:{ all -> 0x00bc }
        r4 = defpackage.zgb.a(r4);	 Catch:{ all -> 0x00bc }
        r5 = r2.a(r14);	 Catch:{ all -> 0x00bc }
        r4 = r4.g();	 Catch:{ all -> 0x00bc }
        r4 = (defpackage.ajdw) r4;	 Catch:{ all -> 0x00bc }
        r4 = r5.b(r4);	 Catch:{ all -> 0x00bc }
        r5 = defpackage.rwm.l.a;	 Catch:{ all -> 0x00bc }
        r5 = (java.util.concurrent.Callable) r5;	 Catch:{ all -> 0x00bc }
        r4 = r4.c(r5);	 Catch:{ all -> 0x00bc }
        r5 = "syncer.sync(isColdStart)…       .toSingle { true }";	 Catch:{ all -> 0x00bc }
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x00bc }
        r5 = r13.n;	 Catch:{ all -> 0x00bc }
        r5 = r5.get();	 Catch:{ all -> 0x00bc }
        r5 = (defpackage.sah) r5;	 Catch:{ all -> 0x00bc }
        r8 = r2.a();	 Catch:{ all -> 0x00bc }
        r9 = 6;	 Catch:{ all -> 0x00bc }
        r5 = defpackage.sah.a.a(r5, r8, r3, r3, r9);	 Catch:{ all -> 0x00bc }
        r4 = defpackage.ign.a(r4, r5);	 Catch:{ all -> 0x00bc }
        r11 = r4.e();	 Catch:{ all -> 0x00bc }
        r12 = new rwm$k;	 Catch:{ all -> 0x00bc }
        r4 = r12;	 Catch:{ all -> 0x00bc }
        r5 = r2;	 Catch:{ all -> 0x00bc }
        r8 = r0;	 Catch:{ all -> 0x00bc }
        r9 = r13;	 Catch:{ all -> 0x00bc }
        r10 = r14;	 Catch:{ all -> 0x00bc }
        r4.<init>(r5, r6, r8, r9, r10);	 Catch:{ all -> 0x00bc }
        r12 = (defpackage.ajev) r12;	 Catch:{ all -> 0x00bc }
        r4 = new rwm$m;	 Catch:{ all -> 0x00bc }
        r4.<init>(r2);	 Catch:{ all -> 0x00bc }
        r4 = (defpackage.ajfb) r4;	 Catch:{ all -> 0x00bc }
        r2 = r11.a(r12, r4);	 Catch:{ all -> 0x00bc }
        r4 = "syncer.sync(isColdStart)…                       })";	 Catch:{ all -> 0x00bc }
        defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x00bc }
        defpackage.ajvv.a(r2, r0);	 Catch:{ all -> 0x00bc }
        goto L_0x003d;	 Catch:{ all -> 0x00bc }
        r0 = (defpackage.ajej) r0;	 Catch:{ all -> 0x00bc }
        return r0;
        r14 = move-exception;
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwm.a(boolean):ajej");
    }

    /* Access modifiers changed, original: final */
    public final ftl a() {
        return (ftl) this.l.b();
    }
}
