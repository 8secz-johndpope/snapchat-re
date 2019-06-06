package defpackage;

import android.util.Log;
import com.bumptech.glide.GlideContext;
import defpackage.aah.a;
import defpackage.ahn.c;
import defpackage.yl.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aaj */
final class aaj<R> implements a, c, Comparable<aaj<?>>, Runnable {
    private zd A;
    private Object B;
    private yx C;
    private zm<?> D;
    private volatile boolean E;
    final aai<R> a = new aai();
    final d b;
    final c<?> c = new c();
    final e d = new e();
    GlideContext e;
    zd f;
    yk g;
    aap h;
    int i;
    int j;
    aal k;
    zf l;
    a<R> m;
    int n;
    f o;
    boolean p;
    Object q;
    zd r;
    volatile aah s;
    volatile boolean t;
    private final List<Throwable> u = new ArrayList();
    private final aho v = new aho.a();
    private final jf.a<aaj<?>> w;
    private g x;
    private long y;
    private Thread z;

    /* renamed from: aaj$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[f.values().length];
        static final /* synthetic */ int[] b = new int[g.values().length];
        static final /* synthetic */ int[] c = new int[yz.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        static {
            /*
            r0 = defpackage.yz.values();
            r0 = r0.length;
            r0 = new int[r0];
            c = r0;
            r0 = 1;
            r1 = c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.yz.SOURCE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = c;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.yz.TRANSFORMED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = defpackage.aaj.g.values();
            r2 = r2.length;
            r2 = new int[r2];
            b = r2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = defpackage.aaj.g.RESOURCE_CACHE;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x003c }
            r3 = defpackage.aaj.g.DATA_CACHE;	 Catch:{ NoSuchFieldError -> 0x003c }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r4 = defpackage.aaj.g.SOURCE;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = defpackage.aaj.g.FINISHED;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r5 = 4;
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x005d }
            r4 = defpackage.aaj.g.INITIALIZE;	 Catch:{ NoSuchFieldError -> 0x005d }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r5 = 5;
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r3 = defpackage.aaj.f.values();
            r3 = r3.length;
            r3 = new int[r3];
            a = r3;
            r3 = a;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r4 = defpackage.aaj.f.INITIALIZE;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0070 }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x0070 }
        L_0x0070:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x007a }
            r3 = defpackage.aaj.f.SWITCH_TO_SOURCE_SERVICE;	 Catch:{ NoSuchFieldError -> 0x007a }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0084 }
            r1 = defpackage.aaj.f.DECODE_DATA;	 Catch:{ NoSuchFieldError -> 0x0084 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0084 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0084 }
        L_0x0084:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aaj$1.<clinit>():void");
        }
    }

    /* renamed from: aaj$a */
    interface a<R> {
        void a(aaj<?> aaj);

        void a(aas aas);

        void a(aax<R> aax, yx yxVar);
    }

    /* renamed from: aaj$c */
    static class c<Z> {
        zd a;
        zh<Z> b;
        aaw<Z> c;

        c() {
        }

        /* Access modifiers changed, original: final */
        public final void a(d dVar, zf zfVar) {
            try {
                dVar.a().a(this.a, new aag(this.b, this.c, zfVar));
            } finally {
                this.c.e();
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            return this.c != null;
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    /* renamed from: aaj$d */
    interface d {
        abq a();
    }

    /* renamed from: aaj$e */
    static class e {
        private boolean a;
        private boolean b;
        private boolean c;

        e() {
        }

        private boolean a(boolean z) {
            return (this.c || this.b) && this.a;
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized boolean a() {
            this.a = true;
            return a(false);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void d() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    /* renamed from: aaj$f */
    enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: aaj$g */
    enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: aaj$b */
    final class b<Z> implements aak.a<Z> {
        private final yx a;

        b(yx yxVar) {
            this.a = yxVar;
        }

        public final aax<Z> a(aax<Z> aax) {
            zi ziVar;
            Object a;
            yz a2;
            aaj aaj = aaj.this;
            yx yxVar = this.a;
            Class cls = aax.b().getClass();
            zh zhVar = null;
            if (yxVar != yx.RESOURCE_DISK_CACHE) {
                zi c = aaj.a.c(cls);
                ziVar = c;
                a = c.a(aaj.e, aax, aaj.i, aaj.j);
            } else {
                a = aax;
                ziVar = null;
            }
            if (!aax.equals(a)) {
                aax.d();
            }
            int i = 0;
            if ((aaj.a.a.c.b.a(a.a()) != null ? 1 : null) != null) {
                zhVar = aaj.a.a.c.b.a(a.a());
                if (zhVar != null) {
                    a2 = zhVar.a(aaj.l);
                } else {
                    throw new d(a.a());
                }
            }
            a2 = yz.NONE;
            zh zhVar2 = zhVar;
            aai aai = aaj.a;
            zd zdVar = aaj.r;
            List c2 = aai.c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((acq.a) c2.get(i2)).a.equals(zdVar)) {
                    i = 1;
                    break;
                }
            }
            if (!aaj.k.a(i ^ 1, yxVar, a2)) {
                return a;
            }
            if (zhVar2 != null) {
                zd aaf;
                int i3 = 1.c[a2.ordinal()];
                if (i3 == 1) {
                    aaf = new aaf(aaj.r, aaj.f);
                } else if (i3 == 2) {
                    zd aaz = new aaz(aaj.a.a.b, aaj.r, aaj.f, aaj.i, aaj.j, ziVar, cls, aaj.l);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: ".concat(String.valueOf(a2)));
                }
                aaw a3 = aaw.a(a);
                c cVar = aaj.c;
                cVar.a = aaf;
                cVar.b = zhVar2;
                cVar.c = a3;
                return a3;
            }
            throw new d(a.b().getClass());
        }
    }

    aaj(d dVar, jf.a<aaj<?>> aVar) {
        this.b = dVar;
        this.w = aVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0061 in {2, 7, 8, 9, 14, 16, 21, 24} preds:[]
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
    private <Data, ResourceType> defpackage.aax<R> a(Data r10, defpackage.yx r11, defpackage.aav<Data, ResourceType, R> r12) {
        /*
        r9 = this;
        r0 = r9.l;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 26;
        if (r1 >= r2) goto L_0x0009;
        goto L_0x0029;
        r1 = defpackage.yx.RESOURCE_DISK_CACHE;
        if (r11 == r1) goto L_0x0016;
        r1 = r9.a;
        r1 = r1.n;
        if (r1 == 0) goto L_0x0014;
        goto L_0x0016;
        r1 = 0;
        goto L_0x0017;
        r1 = 1;
        r2 = defpackage.adq.b;
        r2 = r0.a(r2);
        r2 = (java.lang.Boolean) r2;
        if (r2 == 0) goto L_0x002b;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x0029;
        if (r1 == 0) goto L_0x002b;
        r5 = r0;
        goto L_0x003f;
        r0 = new zf;
        r0.<init>();
        r2 = r9.l;
        r0.a(r2);
        r2 = defpackage.adq.b;
        r1 = java.lang.Boolean.valueOf(r1);
        r0.a(r2, r1);
        goto L_0x0029;
        r0 = r9.e;
        r0 = r0.c;
        r0 = r0.c;
        r10 = r0.a(r10);
        r6 = r9.i;	 Catch:{ all -> 0x005c }
        r7 = r9.j;	 Catch:{ all -> 0x005c }
        r8 = new aaj$b;	 Catch:{ all -> 0x005c }
        r8.<init>(r11);	 Catch:{ all -> 0x005c }
        r3 = r12;	 Catch:{ all -> 0x005c }
        r4 = r10;	 Catch:{ all -> 0x005c }
        r11 = r3.a(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x005c }
        r10.b();
        return r11;
        r11 = move-exception;
        r10.b();
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaj.a(java.lang.Object, yx, aav):aax");
    }

    private <Data> aax<R> a(zm<?> zmVar, Data data, yx yxVar) {
        if (data == null) {
            zmVar.b();
            return null;
        }
        try {
            long a = ahh.a();
            aax a2 = a((Object) data, yxVar, this.a.b(data.getClass()));
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Decoded result ".concat(String.valueOf(a2)), a, null);
            }
            zmVar.b();
            return a2;
        } catch (Throwable th) {
            zmVar.b();
        }
    }

    private void a(aax<R> aax, yx yxVar) {
        i();
        this.m.a(aax, yxVar);
    }

    private void a(String str, long j, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(ahh.a(j));
        stringBuilder.append(", load key: ");
        stringBuilder.append(this.h);
        if (str2 != null) {
            str = ppy.d.concat(String.valueOf(str2));
        } else {
            str = "";
        }
        stringBuilder.append(str);
        stringBuilder.append(", thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        Log.v("DecodeJob", stringBuilder.toString());
    }

    private void b(aax<R> aax, yx yxVar) {
        aax aax2;
        if (aax2 instanceof aat) {
            ((aat) aax2).e();
        }
        aaw aaw = null;
        if (this.c.a()) {
            aax2 = aaw.a(aax2);
            aaw = aax2;
        }
        a(aax2, yxVar);
        this.x = g.ENCODE;
        try {
            if (this.c.a()) {
                this.c.a(this.b, this.l);
            }
            if (aaw != null) {
                aaw.e();
            }
            d();
        } catch (Throwable th) {
            if (aaw != null) {
                aaw.e();
            }
        }
    }

    private void d() {
        if (this.d.b()) {
            a();
        }
    }

    private void e() {
        if (this.d.c()) {
            a();
        }
    }

    private aah f() {
        int i = 1.b[this.x.ordinal()];
        if (i == 1) {
            return new aay(this.a, this);
        }
        if (i == 2) {
            return new aae(this.a, this);
        }
        if (i == 3) {
            return new abb(this.a, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("Unrecognized stage: ");
        stringBuilder.append(this.x);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void g() {
        this.z = Thread.currentThread();
        this.y = ahh.a();
        boolean z = false;
        while (!this.t && this.s != null) {
            z = this.s.a();
            if (z) {
                break;
            }
            this.x = a(this.x);
            this.s = f();
            if (this.x == g.SOURCE) {
                c();
                return;
            }
        }
        if ((this.x == g.FINISHED || this.t) && !r0) {
            h();
        }
    }

    private void h() {
        i();
        this.m.a(new aas("Failed to load resource", new ArrayList(this.u)));
        e();
    }

    private void i() {
        this.v.a();
        if (this.E) {
            Throwable th;
            if (this.u.isEmpty()) {
                th = null;
            } else {
                List list = this.u;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.E = true;
    }

    private void j() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.y;
            StringBuilder stringBuilder = new StringBuilder("data: ");
            stringBuilder.append(this.B);
            stringBuilder.append(", cache key: ");
            stringBuilder.append(this.r);
            stringBuilder.append(", fetcher: ");
            stringBuilder.append(this.D);
            a("Retrieved data", j, stringBuilder.toString());
        }
        aax aax = null;
        try {
            aax = a(this.D, this.B, this.C);
        } catch (aas e) {
            e.a(this.A, this.C, aax);
            this.u.add(e);
        }
        if (aax != null) {
            b(aax, this.C);
        } else {
            g();
        }
    }

    /* Access modifiers changed, original: final */
    public final g a(g gVar) {
        while (true) {
            int i = 1.b[gVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this.p ? g.FINISHED : g.SOURCE;
                } else {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException("Unrecognized stage: ".concat(String.valueOf(gVar)));
                        } else if (this.k.a()) {
                            return g.RESOURCE_CACHE;
                        } else {
                            gVar = g.RESOURCE_CACHE;
                        }
                    }
                }
            } else if (this.k.b()) {
                return g.DATA_CACHE;
            } else {
                gVar = g.DATA_CACHE;
            }
        }
        return g.FINISHED;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.d.d();
        this.c.b();
        this.a.a();
        this.E = false;
        this.e = null;
        this.f = null;
        this.l = null;
        this.g = null;
        this.h = null;
        this.m = null;
        this.x = null;
        this.s = null;
        this.z = null;
        this.r = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.y = 0;
        this.t = false;
        this.q = null;
        this.u.clear();
        this.w.a(this);
    }

    public final void a(zd zdVar, Exception exception, zm<?> zmVar, yx yxVar) {
        zmVar.b();
        aas aas = new aas("Fetching data failed", (Throwable) exception);
        aas.a(zdVar, yxVar, zmVar.a());
        this.u.add(aas);
        if (Thread.currentThread() != this.z) {
            this.o = f.SWITCH_TO_SOURCE_SERVICE;
            this.m.a(this);
            return;
        }
        g();
    }

    public final void a(zd zdVar, Object obj, zm<?> zmVar, yx yxVar, zd zdVar2) {
        this.r = zdVar;
        this.B = obj;
        this.D = zmVar;
        this.C = yxVar;
        this.A = zdVar2;
        if (Thread.currentThread() != this.z) {
            this.o = f.DECODE_DATA;
            this.m.a(this);
            return;
        }
        j();
    }

    public final aho b_() {
        return this.v;
    }

    public final void c() {
        this.o = f.SWITCH_TO_SOURCE_SERVICE;
        this.m.a(this);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        aaj aaj = (aaj) obj;
        int ordinal = this.g.ordinal() - aaj.g.ordinal();
        return ordinal == 0 ? this.n - aaj.n : ordinal;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x0099 in {6, 7, 14, 16, 17, 19, 21, 22, 29, 32, 35, 36, 38, 40, 41} preds:[]
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
    public final void run() {
        /*
        r6 = this;
        r0 = "DecodeJob";
        r1 = r6.D;
        r2 = 3;
        r3 = r6.t;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        if (r3 == 0) goto L_0x0012;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r6.h();	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        if (r1 == 0) goto L_0x0011;
        r1.b();
        return;
        r3 = defpackage.aaj.1.a;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4 = r6.o;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4 = r4.ordinal();	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r3 = r3[r4];	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4 = 1;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        if (r3 == r4) goto L_0x0042;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4 = 2;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        if (r3 == r4) goto L_0x003e;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        if (r3 != r2) goto L_0x0028;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r6.j();	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        goto L_0x0051;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r3 = new java.lang.IllegalStateException;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4 = new java.lang.StringBuilder;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r5 = "Unrecognized run reason: ";	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4.<init>(r5);	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r5 = r6.o;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4.append(r5);	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r4 = r4.toString();	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r3.<init>(r4);	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        throw r3;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r6.g();	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        goto L_0x0051;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r3 = defpackage.aaj.g.INITIALIZE;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r3 = r6.a(r3);	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r6.x = r3;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r3 = r6.f();	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        r6.s = r3;	 Catch:{ aad -> 0x0091, Throwable -> 0x0059 }
        goto L_0x003e;
        if (r1 == 0) goto L_0x0056;
        r1.b();
        return;
        r0 = move-exception;
        goto L_0x0093;
        r3 = move-exception;
        r2 = android.util.Log.isLoggable(r0, r2);	 Catch:{ all -> 0x0057 }
        if (r2 == 0) goto L_0x007d;	 Catch:{ all -> 0x0057 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0057 }
        r4 = "DecodeJob threw unexpectedly, isCancelled: ";	 Catch:{ all -> 0x0057 }
        r2.<init>(r4);	 Catch:{ all -> 0x0057 }
        r4 = r6.t;	 Catch:{ all -> 0x0057 }
        r2.append(r4);	 Catch:{ all -> 0x0057 }
        r4 = ", stage: ";	 Catch:{ all -> 0x0057 }
        r2.append(r4);	 Catch:{ all -> 0x0057 }
        r4 = r6.x;	 Catch:{ all -> 0x0057 }
        r2.append(r4);	 Catch:{ all -> 0x0057 }
        r2 = r2.toString();	 Catch:{ all -> 0x0057 }
        android.util.Log.d(r0, r2, r3);	 Catch:{ all -> 0x0057 }
        r0 = r6.x;	 Catch:{ all -> 0x0057 }
        r2 = defpackage.aaj.g.ENCODE;	 Catch:{ all -> 0x0057 }
        if (r0 == r2) goto L_0x008b;	 Catch:{ all -> 0x0057 }
        r0 = r6.u;	 Catch:{ all -> 0x0057 }
        r0.add(r3);	 Catch:{ all -> 0x0057 }
        r6.h();	 Catch:{ all -> 0x0057 }
        r0 = r6.t;	 Catch:{ all -> 0x0057 }
        if (r0 != 0) goto L_0x0090;	 Catch:{ all -> 0x0057 }
        throw r3;	 Catch:{ all -> 0x0057 }
        throw r3;	 Catch:{ all -> 0x0057 }
        r0 = move-exception;	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0098;
        r1.b();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaj.run():void");
    }
}
