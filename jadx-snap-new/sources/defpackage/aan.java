package defpackage;

import defpackage.aaj.a;
import defpackage.ahn.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aan */
public final class aan<R> implements a<R>, c {
    private static final c d = new c();
    final e a;
    boolean b;
    aar<?> c;
    private final aho e;
    private final jf.a<aan<?>> f;
    private final c g;
    private final aao h;
    private final aca i;
    private final aca j;
    private final aca k;
    private final aca l;
    private final AtomicInteger m;
    private zd n;
    private boolean o;
    private boolean p;
    private boolean q;
    private aax<?> r;
    private yx s;
    private boolean t;
    private aas u;
    private boolean v;
    private aaj<R> w;
    private volatile boolean x;

    /* renamed from: aan$a */
    class a implements Runnable {
        private final agj a;

        a(agj agj) {
            this.a = agj;
        }

        public final void run() {
            synchronized (aan.this) {
                if (aan.this.a.a(this.a)) {
                    aan.this.b(this.a);
                }
                aan.this.a();
            }
        }
    }

    /* renamed from: aan$b */
    class b implements Runnable {
        private final agj a;

        b(agj agj) {
            this.a = agj;
        }

        public final void run() {
            synchronized (aan.this) {
                if (aan.this.a.a(this.a)) {
                    aan.this.c.e();
                    aan.this.a(this.a);
                    aan.this.c(this.a);
                }
                aan.this.a();
            }
        }
    }

    /* renamed from: aan$c */
    static class c {
        c() {
        }
    }

    /* renamed from: aan$d */
    static final class d {
        final agj a;
        final Executor b;

        d(agj agj, Executor executor) {
            this.a = agj;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            return this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: aan$e */
    static final class e implements Iterable<d> {
        final List<d> a;

        e() {
            this(new ArrayList(2));
        }

        private e(List<d> list) {
            this.a = list;
        }

        static d b(agj agj) {
            return new d(agj, ahg.b);
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            return this.a.isEmpty();
        }

        /* Access modifiers changed, original: final */
        public final boolean a(agj agj) {
            return this.a.contains(e.b(agj));
        }

        /* Access modifiers changed, original: final */
        public final int b() {
            return this.a.size();
        }

        /* Access modifiers changed, original: final */
        public final e c() {
            return new e(new ArrayList(this.a));
        }

        public final Iterator<d> iterator() {
            return this.a.iterator();
        }
    }

    aan(aca aca, aca aca2, aca aca3, aca aca4, aao aao, jf.a<aan<?>> aVar) {
        this(aca, aca2, aca3, aca4, aao, aVar, d);
    }

    private aan(aca aca, aca aca2, aca aca3, aca aca4, aao aao, jf.a<aan<?>> aVar, c cVar) {
        this.a = new e();
        this.e = new aho.a();
        this.m = new AtomicInteger();
        this.i = aca;
        this.j = aca2;
        this.k = aca3;
        this.l = aca4;
        this.h = aao;
        this.f = aVar;
        this.g = cVar;
    }

    private synchronized void a(int i) {
        ahl.a(d(), "Not yet complete!");
        if (this.m.getAndAdd(i) == 0 && this.c != null) {
            this.c.e();
        }
    }

    private aca c() {
        return this.p ? this.k : this.q ? this.l : this.j;
    }

    private boolean d() {
        return this.v || this.t || this.x;
    }

    private synchronized void e() {
        if (this.n != null) {
            this.a.a.clear();
            this.n = null;
            this.c = null;
            this.r = null;
            this.v = false;
            this.x = false;
            this.t = false;
            aaj aaj = this.w;
            if (aaj.d.a()) {
                aaj.a();
            }
            this.w = null;
            this.u = null;
            this.s = null;
            this.f.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized aan<R> a(zd zdVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.n = zdVar;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.b = z4;
        return this;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        this.e.a();
        ahl.a(d(), "Not yet complete!");
        int decrementAndGet = this.m.decrementAndGet();
        ahl.a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            if (this.c != null) {
                this.c.f();
            }
            e();
        }
    }

    public final void a(aaj<?> aaj) {
        c().execute(aaj);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x0070 in {10, 20, 22, 25, 27, 30, 34} preds:[]
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
    public final void a(defpackage.aas r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.u = r4;	 Catch:{ all -> 0x006d }
        monitor-exit(r3);	 Catch:{ all -> 0x006d }
        monitor-enter(r3);
        r4 = r3.e;	 Catch:{ all -> 0x006a }
        r4.a();	 Catch:{ all -> 0x006a }
        r4 = r3.x;	 Catch:{ all -> 0x006a }
        if (r4 == 0) goto L_0x0013;	 Catch:{ all -> 0x006a }
        r3.e();	 Catch:{ all -> 0x006a }
        monitor-exit(r3);	 Catch:{ all -> 0x006a }
        return;	 Catch:{ all -> 0x006a }
        r4 = r3.a;	 Catch:{ all -> 0x006a }
        r4 = r4.a();	 Catch:{ all -> 0x006a }
        if (r4 != 0) goto L_0x0062;	 Catch:{ all -> 0x006a }
        r4 = r3.v;	 Catch:{ all -> 0x006a }
        if (r4 != 0) goto L_0x005a;	 Catch:{ all -> 0x006a }
        r4 = 1;	 Catch:{ all -> 0x006a }
        r3.v = r4;	 Catch:{ all -> 0x006a }
        r0 = r3.n;	 Catch:{ all -> 0x006a }
        r1 = r3.a;	 Catch:{ all -> 0x006a }
        r1 = r1.c();	 Catch:{ all -> 0x006a }
        r2 = r1.b();	 Catch:{ all -> 0x006a }
        r2 = r2 + r4;	 Catch:{ all -> 0x006a }
        r3.a(r2);	 Catch:{ all -> 0x006a }
        monitor-exit(r3);	 Catch:{ all -> 0x006a }
        r4 = r3.h;
        r2 = 0;
        r4.a(r3, r0, r2);
        r4 = r1.iterator();
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0056;
        r0 = r4.next();
        r0 = (defpackage.aan.d) r0;
        r1 = r0.b;
        r2 = new aan$a;
        r0 = r0.a;
        r2.<init>(r0);
        r1.execute(r2);
        goto L_0x003d;
        r3.a();
        return;
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x006a }
        r0 = "Already failed once";	 Catch:{ all -> 0x006a }
        r4.<init>(r0);	 Catch:{ all -> 0x006a }
        throw r4;	 Catch:{ all -> 0x006a }
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x006a }
        r0 = "Received an exception without any callbacks to notify";	 Catch:{ all -> 0x006a }
        r4.<init>(r0);	 Catch:{ all -> 0x006a }
        throw r4;	 Catch:{ all -> 0x006a }
        r4 = move-exception;	 Catch:{ all -> 0x006a }
        monitor-exit(r3);	 Catch:{ all -> 0x006a }
        throw r4;
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x006d }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aan.a(aas):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x0083 in {10, 20, 22, 25, 27, 30, 34} preds:[]
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
    public final void a(defpackage.aax<R> r3, defpackage.yx r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.r = r3;	 Catch:{ all -> 0x0080 }
        r2.s = r4;	 Catch:{ all -> 0x0080 }
        monitor-exit(r2);	 Catch:{ all -> 0x0080 }
        monitor-enter(r2);
        r3 = r2.e;	 Catch:{ all -> 0x007d }
        r3.a();	 Catch:{ all -> 0x007d }
        r3 = r2.x;	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x001a;	 Catch:{ all -> 0x007d }
        r3 = r2.r;	 Catch:{ all -> 0x007d }
        r3.d();	 Catch:{ all -> 0x007d }
        r2.e();	 Catch:{ all -> 0x007d }
        monitor-exit(r2);	 Catch:{ all -> 0x007d }
        return;	 Catch:{ all -> 0x007d }
        r3 = r2.a;	 Catch:{ all -> 0x007d }
        r3 = r3.a();	 Catch:{ all -> 0x007d }
        if (r3 != 0) goto L_0x0075;	 Catch:{ all -> 0x007d }
        r3 = r2.t;	 Catch:{ all -> 0x007d }
        if (r3 != 0) goto L_0x006d;	 Catch:{ all -> 0x007d }
        r3 = r2.r;	 Catch:{ all -> 0x007d }
        r4 = r2.o;	 Catch:{ all -> 0x007d }
        r0 = new aar;	 Catch:{ all -> 0x007d }
        r1 = 1;	 Catch:{ all -> 0x007d }
        r0.<init>(r3, r4, r1);	 Catch:{ all -> 0x007d }
        r2.c = r0;	 Catch:{ all -> 0x007d }
        r2.t = r1;	 Catch:{ all -> 0x007d }
        r3 = r2.a;	 Catch:{ all -> 0x007d }
        r3 = r3.c();	 Catch:{ all -> 0x007d }
        r4 = r3.b();	 Catch:{ all -> 0x007d }
        r4 = r4 + r1;	 Catch:{ all -> 0x007d }
        r2.a(r4);	 Catch:{ all -> 0x007d }
        r4 = r2.n;	 Catch:{ all -> 0x007d }
        r0 = r2.c;	 Catch:{ all -> 0x007d }
        monitor-exit(r2);	 Catch:{ all -> 0x007d }
        r1 = r2.h;
        r1.a(r2, r4, r0);
        r3 = r3.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0069;
        r4 = r3.next();
        r4 = (defpackage.aan.d) r4;
        r0 = r4.b;
        r1 = new aan$b;
        r4 = r4.a;
        r1.<init>(r4);
        r0.execute(r1);
        goto L_0x0050;
        r2.a();
        return;
        r3 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x007d }
        r4 = "Already have resource";	 Catch:{ all -> 0x007d }
        r3.<init>(r4);	 Catch:{ all -> 0x007d }
        throw r3;	 Catch:{ all -> 0x007d }
        r3 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x007d }
        r4 = "Received a resource without any callbacks to notify";	 Catch:{ all -> 0x007d }
        r3.<init>(r4);	 Catch:{ all -> 0x007d }
        throw r3;	 Catch:{ all -> 0x007d }
        r3 = move-exception;	 Catch:{ all -> 0x007d }
        monitor-exit(r2);	 Catch:{ all -> 0x007d }
        throw r3;
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0080 }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aan.a(aax, yx):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(agj agj) {
        try {
            agj.a(this.c, this.s);
        } catch (Throwable th) {
            aad aad = new aad(th);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(agj agj, Executor executor) {
        this.e.a();
        this.a.a.add(new d(agj, executor));
        boolean z = true;
        if (this.t) {
            a(1);
            executor.execute(new b(agj));
        } else if (this.v) {
            a(1);
            executor.execute(new a(agj));
        } else {
            if (this.x) {
                z = false;
            }
            ahl.a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017  */
    public final synchronized void b(defpackage.aaj<R> r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.w = r3;	 Catch:{ all -> 0x0023 }
        r0 = defpackage.aaj.g.INITIALIZE;	 Catch:{ all -> 0x0023 }
        r0 = r3.a(r0);	 Catch:{ all -> 0x0023 }
        r1 = defpackage.aaj.g.RESOURCE_CACHE;	 Catch:{ all -> 0x0023 }
        if (r0 == r1) goto L_0x0014;
    L_0x000d:
        r1 = defpackage.aaj.g.DATA_CACHE;	 Catch:{ all -> 0x0023 }
        if (r0 != r1) goto L_0x0012;
    L_0x0011:
        goto L_0x0014;
    L_0x0012:
        r0 = 0;
        goto L_0x0015;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        if (r0 == 0) goto L_0x001a;
    L_0x0017:
        r0 = r2.i;	 Catch:{ all -> 0x0023 }
        goto L_0x001e;
    L_0x001a:
        r0 = r2.c();	 Catch:{ all -> 0x0023 }
    L_0x001e:
        r0.execute(r3);	 Catch:{ all -> 0x0023 }
        monitor-exit(r2);
        return;
    L_0x0023:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aan.b(aaj):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(agj agj) {
        try {
            agj.a(this.u);
        } catch (Throwable th) {
            aad aad = new aad(th);
        }
    }

    public final aho b_() {
        return this.e;
    }

    public final synchronized void c(agj agj) {
        this.e.a();
        this.a.a.remove(e.b(agj));
        if (this.a.a()) {
            boolean z = true;
            if (!d()) {
                this.x = true;
                aaj aaj = this.w;
                aaj.t = true;
                aah aah = aaj.s;
                if (aah != null) {
                    aah.b();
                }
                this.h.a(this, this.n);
            }
            if (!this.t) {
                if (!this.v) {
                    z = false;
                }
            }
            if (z && this.m.get() == 0) {
                e();
            }
        }
    }
}
