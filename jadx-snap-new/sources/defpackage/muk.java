package defpackage;

import defpackage.moh.a;
import defpackage.mwa.b;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: muk */
public final class muk implements mwa {
    final ConcurrentHashMap<String, ajdp<b>> a;
    private final mok<moc> b;
    private final zfw c;
    private final long d;
    private final TimeUnit e;
    private final List<mwh> f;

    /* renamed from: muk$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (moh) obj;
            akcr.b(obj, "it");
            return akcr.a(obj, defpackage.moh.b.a) ? defpackage.mwa.b.IN_PROGRESS : akcr.a(obj, a.a) ? defpackage.mwa.b.COMPLETED : defpackage.mwa.b.PENDING;
        }
    }

    /* renamed from: muk$a */
    static final class a implements ajev {
        private /* synthetic */ muk a;
        private /* synthetic */ mux b;
        private /* synthetic */ String c;

        a(muk muk, mux mux, String str) {
            this.a = muk;
            this.b = mux;
            this.c = str;
        }

        public final void run() {
            this.a.a.remove(this.c);
        }
    }

    /* renamed from: muk$d */
    static final class d extends akcs implements akbl<miq, String> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            miq miq = (miq) obj;
            akcr.b(miq, "it");
            return String.valueOf(miq.hashCode());
        }
    }

    /* renamed from: muk$c */
    static final class c<T, R> implements ajfc<Object[], R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            Object[] objArr = (Object[]) obj;
            akcr.b(objArr, "statuses");
            Object obj3 = null;
            for (moh.b bVar : objArr) {
                if ((bVar == moh.b.a ? 1 : null) != null) {
                    obj2 = 1;
                    break;
                }
            }
            obj2 = null;
            if (obj2 != null) {
                return b.IN_PROGRESS;
            }
            for (a aVar : objArr) {
                if ((aVar == a.a ? 1 : null) == null) {
                    break;
                }
            }
            obj3 = 1;
            return obj3 != null ? b.COMPLETED : b.PENDING;
        }
    }

    public /* synthetic */ muk(mok mok, zfw zfw) {
        this(mok, zfw, TimeUnit.SECONDS, ajym.b((Object[]) new mwh[]{muf.a, mwl.a}));
    }

    private muk(mok<? super moc> mok, zfw zfw, TimeUnit timeUnit, List<? extends mwh> list) {
        akcr.b(mok, "resourceUriResolver");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "keepAliveTimeUnit");
        akcr.b(list, "uriHelpers");
        this.b = mok;
        this.c = zfw;
        this.d = 5;
        this.e = timeUnit;
        this.f = list;
        this.a = new ConcurrentHashMap();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x015c in {5, 13, 14, 17, 21, 31, 32, 34, 38, 39, 40, 43, 44, 46, 48} preds:[]
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
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
        r13 = this;
        r14 = (defpackage.mux) r14;
        r0 = "lens";
        defpackage.akcr.b(r14, r0);
        r0 = r13.f;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0152;
        r0 = r13.f;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = 10;
        r3 = defpackage.ajyn.a(r0, r2);
        r1.<init>(r3);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0038;
        r3 = r0.next();
        r3 = (defpackage.mwh) r3;
        r3 = r3.a(r14);
        r1.add(r3);
        goto L_0x0024;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = r1;
        r0 = (java.util.Collection) r0;
        r0 = r0.isEmpty();
        r3 = 0;
        r4 = 1;
        if (r0 != 0) goto L_0x0061;
        r0 = r1.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0061;
        r1 = r0.next();
        r1 = (defpackage.miq) r1;
        r5 = defpackage.miq.b.a;
        r1 = defpackage.akcr.a(r1, r5);
        if (r1 != 0) goto L_0x004b;
        r0 = 0;
        goto L_0x0062;
        r0 = 1;
        if (r0 == 0) goto L_0x0070;
        r14 = defpackage.mwa.b.PENDING;
        r14 = defpackage.ajdp.b(r14);
        r0 = "Observable.just(LensDown…sProvider.Status.PENDING)";
        defpackage.akcr.a(r14, r0);
        return r14;
        r0 = r13.f;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = defpackage.ajyn.a(r0, r2);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0097;
        r2 = r0.next();
        r2 = (defpackage.mwh) r2;
        r2 = r2.a(r14);
        r1.add(r2);
        goto L_0x0083;
        r1 = (java.util.List) r1;
        r5 = r1;
        r5 = (java.lang.Iterable) r5;
        r0 = "";
        r6 = r0;
        r6 = (java.lang.CharSequence) r6;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r0 = defpackage.muk.d.a;
        r11 = r0;
        r11 = (defpackage.akbl) r11;
        r12 = 30;
        r0 = defpackage.ajyu.a(r5, r6, r7, r8, r9, r10, r11, r12);
        r1 = r13.a;
        r1 = (java.util.concurrent.ConcurrentMap) r1;
        r2 = r1.get(r0);
        if (r2 != 0) goto L_0x014a;
        r2 = r13.f;
        r2 = (java.lang.Iterable) r2;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r5 = (java.util.Collection) r5;
        r2 = r2.iterator();
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x00f3;
        r6 = r2.next();
        r6 = (defpackage.mwh) r6;
        r6 = r6.a(r14, null);
        if (r6 == 0) goto L_0x00ec;
        r7 = r13.b;
        r6 = (defpackage.moc) r6;
        r6 = r7.d(r6);
        if (r6 == 0) goto L_0x00ec;
        r7 = defpackage.moh.c.a;
        r6 = r6.h(r7);
        goto L_0x00ed;
        r6 = 0;
        if (r6 == 0) goto L_0x00c9;
        r5.add(r6);
        goto L_0x00c9;
        r5 = (java.util.List) r5;
        r2 = r5.size();
        if (r2 == 0) goto L_0x0117;
        if (r2 == r4) goto L_0x0108;
        r5 = (java.lang.Iterable) r5;
        r2 = defpackage.muk.c.a;
        r2 = (defpackage.ajfc) r2;
        r2 = defpackage.ajdp.a(r5, r2);
        goto L_0x011d;
        r2 = r5.get(r3);
        r2 = (defpackage.ajdp) r2;
        r3 = defpackage.muk.b.a;
        r3 = (defpackage.ajfc) r3;
        r2 = r2.p(r3);
        goto L_0x011d;
        r2 = defpackage.mwa.b.COMPLETED;
        r2 = defpackage.ajdp.b(r2);
        r3 = new muk$a;
        r3.<init>(r13, r14, r0);
        r3 = (defpackage.ajev) r3;
        r14 = r2.a(r3);
        r2 = defpackage.ajfu.a;
        r14 = r14.j(r2);
        r14 = r14.i();
        r2 = 5;
        r4 = r13.e;
        r5 = r13.c;
        r5 = r5.b();
        r5 = (defpackage.ajdw) r5;
        r2 = r14.g(r2, r4, r5);
        r14 = r1.putIfAbsent(r0, r2);
        if (r14 != 0) goto L_0x0149;
        goto L_0x014a;
        r2 = r14;
        r14 = "statusMap.getOrPut(id) {….computation())\n        }";
        defpackage.akcr.a(r2, r14);
        r2 = (defpackage.ajdp) r2;
        return r2;
        r14 = new java.lang.IllegalArgumentException;
        r0 = "empty uri helper list";
        r14.<init>(r0);
        r14 = (java.lang.Throwable) r14;
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muk.invoke(java.lang.Object):java.lang.Object");
    }
}
