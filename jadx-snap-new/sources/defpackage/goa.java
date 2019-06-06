package defpackage;

import com.snap.core.prefetch.impl.BackgroundPrefetchDurableJob;
import defpackage.hwg.a;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: goa */
public final class goa {
    final ajdw a = zfx.a((ajdw) this.h.b(), 1);
    final ajei b = new ajei();
    final aipn<Map<String, gnb>> c;
    final ajwy<hwl> d;
    final ajwy<ftl> e;
    final ajwy<hwo> f;
    private final String g = "BackgroundPrefetchActivityObserver";
    private final zfw h = zgb.a(gnq.a, this.g);
    private final ihs i = new ihs();
    private final ihh j;

    /* renamed from: goa$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ goa a;

        c(goa goa) {
            this.a = goa;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "enabled");
            if (obj.booleanValue()) {
                for (gnb a : ((Map) this.a.c.get()).values()) {
                    a.a();
                }
            }
        }
    }

    /* renamed from: goa$b */
    static final class b implements ajev {
        final /* synthetic */ goa a;

        /* renamed from: goa$b$1 */
        static final class 1 implements Runnable {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                goa goa = this.a.a;
                abmr.a("Background prefetch scheduling should not be on the main thread.");
                Object b = ajdx.c((Callable) new a(goa)).b(goa.a);
                akcr.a(b, "Single.fromCallable {\n  …scribeOn(serialScheduler)");
                ajej a = b.a((ajfb) new d(goa), (ajfb) new e(goa));
                akcr.a((Object) a, "getAndInitializeDurableJ…h tasks: $it\")\n        })");
                ajvv.a(a, goa.b);
            }
        }

        b(goa goa) {
            this.a = goa;
        }

        public final void run() {
            this.a.a.a((Runnable) new 1(this));
        }
    }

    /* renamed from: goa$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ goa a;

        a(goa goa) {
            this.a = goa;
        }

        private hwl a() {
            hwl hwl = (hwl) this.a.d.get();
            hwl.a(hwp.USER_SCOPE, this.a.f);
            hwl.a();
            return hwl;
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: goa$d */
    static final class d<T> implements ajfb<hwl> {
        private /* synthetic */ goa a;

        d(goa goa) {
            this.a = goa;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x007d in {7, 8, 11, 12, 14} preds:[]
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
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (defpackage.hwl) r7;
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x007b }
            r0.<init>();	 Catch:{ all -> 0x007b }
            r0 = (java.util.List) r0;	 Catch:{ all -> 0x007b }
            r1 = r6.a;	 Catch:{ all -> 0x007b }
            r1 = r1.c;	 Catch:{ all -> 0x007b }
            r1 = r1.get();	 Catch:{ all -> 0x007b }
            r2 = "backgroundPrefetchProcessors.get()";	 Catch:{ all -> 0x007b }
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x007b }
            r1 = (java.util.Map) r1;	 Catch:{ all -> 0x007b }
            r1 = r1.entrySet();	 Catch:{ all -> 0x007b }
            r1 = r1.iterator();	 Catch:{ all -> 0x007b }
            r2 = r1.hasNext();	 Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0058;	 Catch:{ all -> 0x007b }
            r2 = r1.next();	 Catch:{ all -> 0x007b }
            r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x007b }
            r3 = r2.getKey();	 Catch:{ all -> 0x007b }
            r3 = (java.lang.String) r3;	 Catch:{ all -> 0x007b }
            r2 = r2.getValue();	 Catch:{ all -> 0x007b }
            r2 = (defpackage.gnb) r2;	 Catch:{ all -> 0x007b }
            r4 = r2.a();	 Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x0049;	 Catch:{ all -> 0x007b }
            r4 = r6.a;	 Catch:{ all -> 0x007b }
            r5 = "durableJobManager";	 Catch:{ all -> 0x007b }
            defpackage.akcr.a(r7, r5);	 Catch:{ all -> 0x007b }
            defpackage.goa.a(r4, r2, r3, r7);	 Catch:{ all -> 0x007b }
            goto L_0x0020;	 Catch:{ all -> 0x007b }
            r2 = "groupTag";	 Catch:{ all -> 0x007b }
            defpackage.akcr.b(r3, r2);	 Catch:{ all -> 0x007b }
            r2 = "BG_PREFETCH";	 Catch:{ all -> 0x007b }
            r2 = defpackage.hwg.a.a(r2, r3);	 Catch:{ all -> 0x007b }
            r0.add(r2);	 Catch:{ all -> 0x007b }
            goto L_0x0020;	 Catch:{ all -> 0x007b }
            r1 = r0.isEmpty();	 Catch:{ all -> 0x007b }
            if (r1 != 0) goto L_0x007a;	 Catch:{ all -> 0x007b }
            r7 = r7.a(r0);	 Catch:{ all -> 0x007b }
            r0 = r6.a;	 Catch:{ all -> 0x007b }
            r0 = r0.a;	 Catch:{ all -> 0x007b }
            r7 = r7.b(r0);	 Catch:{ all -> 0x007b }
            r7 = r7.e();	 Catch:{ all -> 0x007b }
            r0 = "durableJobManager.cancel…             .subscribe()";	 Catch:{ all -> 0x007b }
            defpackage.akcr.a(r7, r0);	 Catch:{ all -> 0x007b }
            r0 = r6.a;	 Catch:{ all -> 0x007b }
            r0 = r0.b;	 Catch:{ all -> 0x007b }
            defpackage.ajvv.a(r7, r0);	 Catch:{ all -> 0x007b }
            return;
            r7 = move-exception;
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.goa$d.accept(java.lang.Object):void");
        }
    }

    /* renamed from: goa$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ goa a;

        e(goa goa) {
            this.a = goa;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public goa(aipn<Map<String, gnb>> aipn, ajwy<hwl> ajwy, ajwy<ftl> ajwy2, ajwy<hwo> ajwy3, ihh ihh, zgb zgb) {
        akcr.b(aipn, "backgroundPrefetchProcessors");
        akcr.b(ajwy, "durableJobManager");
        akcr.b(ajwy2, "compositeConfigurationProvider");
        akcr.b(ajwy3, "userScopeJobRegistry");
        akcr.b(ihh, "clock");
        akcr.b(zgb, "schedulersProvider");
        this.c = aipn;
        this.d = ajwy;
        this.e = ajwy2;
        this.f = ajwy3;
        this.j = ihh;
    }

    public static final /* synthetic */ void a(goa goa, gnb gnb, String str, hwl hwl) {
        for (gna gna : gnb.b()) {
            String str2 = gna.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(':');
            stringBuilder.append(str2);
            String stringBuilder2 = stringBuilder.toString();
            akcr.b(stringBuilder2, "uniqueKey");
            str2 = a.a("BG_PREFETCH", stringBuilder2);
            boolean a = ((ftl) goa.e.get()).a((fth) fxm.BACKGROUND_PREFETCH_ALWAYS_RESCHEDULE);
            if (!hwl.b(str2) || a) {
                ajej e = hwl.a((hwg) BackgroundPrefetchDurableJob.a.a(stringBuilder2, str, gna, goa.j, goa.i, goa.e)).e();
                akcr.a((Object) e, "durableJobManager.submit…             .subscribe()");
                ajvv.a(e, goa.b);
            }
        }
    }
}
