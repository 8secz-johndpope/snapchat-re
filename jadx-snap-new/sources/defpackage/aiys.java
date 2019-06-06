package defpackage;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import defpackage.aivl.e;
import defpackage.aiyt.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: aiys */
abstract class aiys<ReqT> implements aiws {
    static final e<String> a = e.a("grpc-retry-pushback-ms", aivl.a);
    static final aivw b = aivw.c.a("Stream thrown away because RetriableStream committed");
    static Random s = new Random();
    private static e<String> t = e.a("grpc-previous-rpc-attempts", aivl.a);
    final aivm<ReqT, ?> c;
    final Executor d;
    final ScheduledExecutorService e;
    final a f;
    aiyt g;
    final Object h = new Object();
    final o i;
    final long j;
    final long k;
    final t l;
    volatile q m = new q(new ArrayList(8), Collections.emptyList(), null, false, false);
    boolean n;
    long o;
    aiwt p;
    Future<?> q;
    long r;
    private final aivl u;
    private final aixq.a v;

    /* renamed from: aiys$o */
    static final class o {
        private final AtomicLong a = new AtomicLong();

        o() {
        }

        /* Access modifiers changed, original: final */
        public final long a(long j) {
            return this.a.addAndGet(j);
        }
    }

    /* renamed from: aiys$b */
    class b implements Runnable {
        private /* synthetic */ Collection a;
        private /* synthetic */ s b;

        b(Collection collection, s sVar) {
            this.a = collection;
            this.b = sVar;
        }

        public final void run() {
            for (s sVar : this.a) {
                if (sVar != this.b) {
                    sVar.a.a(aiys.b);
                }
            }
            aiys.this.b();
        }
    }

    /* renamed from: aiys$m */
    interface m {
        void a(s sVar);
    }

    /* renamed from: aiys$p */
    static final class p {
        final boolean a;
        final long b;

        p(boolean z, long j) {
            this.a = z;
            this.b = j;
        }
    }

    /* renamed from: aiys$q */
    static final class q {
        final boolean a;
        final List<m> b;
        final Collection<s> c;
        final s d;
        final boolean e;

        q(List<m> list, Collection<s> collection, s sVar, boolean z, boolean z2) {
            this.b = list;
            this.c = (Collection) Preconditions.checkNotNull(collection, "drainedSubstreams");
            this.d = sVar;
            this.e = z;
            this.a = z2;
            boolean z3 = false;
            boolean z4 = !z2 || list == null;
            Preconditions.checkState(z4, "passThrough should imply buffer is null");
            z4 = (z2 && sVar == null) ? false : true;
            Preconditions.checkState(z4, "passThrough should imply winningSubstream != null");
            z4 = !z2 || ((collection.size() == 1 && collection.contains(sVar)) || (collection.size() == 0 && sVar.b));
            Preconditions.checkState(z4, "passThrough should imply winningSubstream is drained");
            if (!(z && sVar == null)) {
                z3 = true;
            }
            Preconditions.checkState(z3, "cancelled should imply committed");
        }

        /* Access modifiers changed, original: final */
        public final q a() {
            return new q(this.b, this.c, this.d, true, this.a);
        }

        /* Access modifiers changed, original: final */
        public final q a(s sVar) {
            sVar.b = true;
            if (!this.c.contains(sVar)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.c);
            arrayList.remove(sVar);
            return new q(this.b, Collections.unmodifiableCollection(arrayList), this.d, this.e, this.a);
        }
    }

    /* renamed from: aiys$s */
    static final class s {
        aiws a;
        boolean b;
        boolean c;
        final int d;

        s(int i) {
            this.d = i;
        }
    }

    /* renamed from: aiys$t */
    static final class t {
        final int a;
        final int b;
        final int c;
        final AtomicInteger d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.a == tVar.a && this.c == tVar.c;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.c));
        }
    }

    /* renamed from: aiys$a */
    class a implements m {
        private /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        public final void a(s sVar) {
            sVar.a.a(this.a);
        }
    }

    /* renamed from: aiys$c */
    class c implements m {
        private /* synthetic */ aium a;

        c(aium aium) {
            this.a = aium;
        }

        public final void a(s sVar) {
            sVar.a.a(this.a);
        }
    }

    /* renamed from: aiys$d */
    class d implements m {
        private /* synthetic */ aius a;

        d(aius aius) {
            this.a = aius;
        }

        public final void a(s sVar) {
            sVar.a.a(this.a);
        }
    }

    /* renamed from: aiys$e */
    class e implements m {
        private /* synthetic */ aiuu a;

        e(aiuu aiuu) {
            this.a = aiuu;
        }

        public final void a(s sVar) {
            sVar.a.a(this.a);
        }
    }

    /* renamed from: aiys$f */
    class f implements m {
        f() {
        }

        public final void a(s sVar) {
            sVar.a.f();
        }
    }

    /* renamed from: aiys$g */
    class g implements m {
        g() {
        }

        public final void a(s sVar) {
            sVar.a.d();
        }
    }

    /* renamed from: aiys$h */
    class h implements m {
        private /* synthetic */ int a;

        h(int i) {
            this.a = i;
        }

        public final void a(s sVar) {
            sVar.a.b(this.a);
        }
    }

    /* renamed from: aiys$i */
    class i implements m {
        private /* synthetic */ int a;

        i(int i) {
            this.a = i;
        }

        public final void a(s sVar) {
            sVar.a.a(this.a);
        }
    }

    /* renamed from: aiys$j */
    class j implements m {
        private /* synthetic */ int a;

        j(int i) {
            this.a = i;
        }

        public final void a(s sVar) {
            sVar.a.c(this.a);
        }
    }

    /* renamed from: aiys$k */
    class k implements m {
        private /* synthetic */ Object a;

        k(Object obj) {
            this.a = obj;
        }

        public final void a(s sVar) {
            sVar.a.a(aiys.this.c.a(this.a));
        }
    }

    /* renamed from: aiys$l */
    class l implements m {
        l() {
        }

        public final void a(s sVar) {
            sVar.a.a(new r(sVar));
        }
    }

    /* renamed from: aiys$n */
    class n extends aiuk {
        private final s a;
        private long b;

        n(s sVar) {
            this.a = sVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x0079 in {2, 10, 14, 17, 18, 21, 24, 27, 28, 31, 34} preds:[]
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
        public final void a(long r8) {
            /*
            r7 = this;
            r0 = defpackage.aiys.this;
            r0 = r0.m;
            r0 = r0.d;
            if (r0 == 0) goto L_0x0009;
            return;
            r0 = 0;
            r1 = defpackage.aiys.this;
            r1 = r1.h;
            monitor-enter(r1);
            r2 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r2 = r2.m;	 Catch:{ all -> 0x0076 }
            r2 = r2.d;	 Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x0074;	 Catch:{ all -> 0x0076 }
            r2 = r7.a;	 Catch:{ all -> 0x0076 }
            r2 = r2.b;	 Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x001e;	 Catch:{ all -> 0x0076 }
            goto L_0x0074;	 Catch:{ all -> 0x0076 }
            r2 = r7.b;	 Catch:{ all -> 0x0076 }
            r2 = r2 + r8;	 Catch:{ all -> 0x0076 }
            r7.b = r2;	 Catch:{ all -> 0x0076 }
            r8 = r7.b;	 Catch:{ all -> 0x0076 }
            r2 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r2 = r2.o;	 Catch:{ all -> 0x0076 }
            r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));	 Catch:{ all -> 0x0076 }
            if (r4 > 0) goto L_0x002f;	 Catch:{ all -> 0x0076 }
            monitor-exit(r1);	 Catch:{ all -> 0x0076 }
            return;	 Catch:{ all -> 0x0076 }
            r8 = r7.b;	 Catch:{ all -> 0x0076 }
            r2 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r2 = r2.j;	 Catch:{ all -> 0x0076 }
            r4 = 1;	 Catch:{ all -> 0x0076 }
            r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));	 Catch:{ all -> 0x0076 }
            if (r5 <= 0) goto L_0x003f;	 Catch:{ all -> 0x0076 }
            r8 = r7.a;	 Catch:{ all -> 0x0076 }
            r8.c = r4;	 Catch:{ all -> 0x0076 }
            goto L_0x005f;	 Catch:{ all -> 0x0076 }
            r8 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r8 = r8.i;	 Catch:{ all -> 0x0076 }
            r2 = r7.b;	 Catch:{ all -> 0x0076 }
            r9 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r5 = r9.o;	 Catch:{ all -> 0x0076 }
            r2 = r2 - r5;	 Catch:{ all -> 0x0076 }
            r8 = r8.a(r2);	 Catch:{ all -> 0x0076 }
            r2 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r5 = r7.b;	 Catch:{ all -> 0x0076 }
            r2.o = r5;	 Catch:{ all -> 0x0076 }
            r2 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r2 = r2.k;	 Catch:{ all -> 0x0076 }
            r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));	 Catch:{ all -> 0x0076 }
            if (r5 <= 0) goto L_0x005f;	 Catch:{ all -> 0x0076 }
            r8 = r7.a;	 Catch:{ all -> 0x0076 }
            goto L_0x003c;	 Catch:{ all -> 0x0076 }
            r8 = r7.a;	 Catch:{ all -> 0x0076 }
            r8 = r8.c;	 Catch:{ all -> 0x0076 }
            if (r8 == 0) goto L_0x006d;	 Catch:{ all -> 0x0076 }
            r8 = defpackage.aiys.this;	 Catch:{ all -> 0x0076 }
            r9 = r7.a;	 Catch:{ all -> 0x0076 }
            r0 = r8.a(r9);	 Catch:{ all -> 0x0076 }
            monitor-exit(r1);	 Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0073;
            r0.run();
            return;
            monitor-exit(r1);	 Catch:{ all -> 0x0076 }
            return;	 Catch:{ all -> 0x0076 }
            r8 = move-exception;	 Catch:{ all -> 0x0076 }
            monitor-exit(r1);	 Catch:{ all -> 0x0076 }
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiys$n.a(long):void");
        }
    }

    /* renamed from: aiys$r */
    final class r implements aiwt {
        final s a;

        /* renamed from: aiys$r$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                aiys.this.b(aiys.this.d(r.this.a.d));
            }
        }

        /* renamed from: aiys$r$2 */
        class 2 implements Runnable {

            /* renamed from: aiys$r$2$1 */
            class 1 implements Runnable {
                1() {
                }

                public final void run() {
                    aiys.this.b(aiys.this.d(r.this.a.d + 1));
                }
            }

            2() {
            }

            public final void run() {
                aiys.this.q = null;
                aiys.this.d.execute(new 1());
            }
        }

        r(s sVar) {
            this.a = sVar;
        }

        private p a(aiyt aiyt, aivw aivw, aivl aivl) {
            Integer valueOf;
            long j;
            boolean contains = aiyt.e.contains(aivw.m);
            String str = (String) aivl.a(aiys.a);
            if (str != null) {
                try {
                    valueOf = Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    valueOf = Integer.valueOf(-1);
                }
            } else {
                valueOf = null;
            }
            boolean z = true;
            int i;
            if (aiys.this.l == null || (!contains && (valueOf == null || valueOf.intValue() >= 0))) {
                i = 0;
            } else {
                int i2;
                t tVar = aiys.this.l;
                int i3;
                do {
                    i3 = tVar.d.get();
                    if (i3 == 0) {
                        break;
                    }
                    i2 = i3 - 1000;
                } while (!tVar.d.compareAndSet(i3, Math.max(i2, 0)));
                if (i2 > tVar.b) {
                    i = 1;
                    i ^= 1;
                }
                i = 0;
                i ^= 1;
            }
            if (aiyt.a > this.a.d + 1 && i == 0) {
                aiys aiys;
                long min;
                if (valueOf == null) {
                    if (contains) {
                        double d = (double) aiys.this.r;
                        double nextDouble = aiys.s.nextDouble();
                        Double.isNaN(d);
                        j = (long) (d * nextDouble);
                        aiys = aiys.this;
                        nextDouble = (double) aiys.r;
                        double d2 = aiyt.d;
                        Double.isNaN(nextDouble);
                        min = Math.min((long) (nextDouble * d2), aiyt.c);
                    }
                } else if (valueOf.intValue() >= 0) {
                    j = TimeUnit.MILLISECONDS.toNanos((long) valueOf.intValue());
                    aiys = aiys.this;
                    min = aiyt.b;
                }
                aiys.r = min;
                return new p(z, j);
            }
            j = 0;
            z = false;
            return new p(z, j);
        }

        public final void a() {
            if (aiys.this.m.c.contains(this.a)) {
                aiys.this.p.a();
            }
        }

        public final void a(aivl aivl) {
            aiys.a(aiys.this, this.a);
            if (aiys.this.m.d == this.a) {
                aiys.this.p.a(aivl);
                if (aiys.this.l != null) {
                    t tVar = aiys.this.l;
                    int i;
                    do {
                        i = tVar.d.get();
                        if (i != tVar.a) {
                        } else {
                            return;
                        }
                    } while (!tVar.d.compareAndSet(i, Math.min(tVar.c + i, tVar.a)));
                }
            }
        }

        public final void a(aivw aivw, int i, aivl aivl) {
            synchronized (aiys.this.h) {
                aiys.this.m = aiys.this.m.a(this.a);
            }
            if (this.a.c) {
                aiys.a(aiys.this, this.a);
                if (aiys.this.m.d == this.a) {
                    aiys.this.p.a(aivw, aivl);
                }
                return;
            }
            if (aiys.this.m.d == null) {
                aiys aiys;
                if (i == 2 && !aiys.this.n) {
                    aiys = aiys.this;
                    aiys.n = true;
                    aiys.d.execute(new 1());
                    return;
                } else if (i != 3) {
                    aiys aiys2 = aiys.this;
                    aiys2.n = true;
                    if (aiys2.g == null) {
                        aiys2 = aiys.this;
                        aiys2.g = aiys2.f.a();
                        aiys2 = aiys.this;
                        aiys2.r = aiys2.g.b;
                    }
                    p a = a(aiys.this.g, aivw, aivl);
                    if (a.a) {
                        aiys = aiys.this;
                        aiys.q = aiys.e.schedule(new 2(), a.b, TimeUnit.NANOSECONDS);
                        return;
                    }
                }
            }
            aiys.a(aiys.this, this.a);
            if (aiys.this.m.d == this.a) {
                aiys.this.p.a(aivw, aivl);
            }
        }

        public final void a(aivw aivw, aivl aivl) {
            a(aivw, 1, aivl);
        }

        public final void a(aizc.a aVar) {
            q qVar = aiys.this.m;
            Preconditions.checkState(qVar.d != null, "Headers should be received prior to messages.");
            if (qVar.d == this.a) {
                aiys.this.p.a(aVar);
            }
        }
    }

    aiys(aivm<ReqT, ?> aivm, aivl aivl, o oVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, a aVar, aixq.a aVar2, t tVar) {
        this.c = aivm;
        this.i = oVar;
        this.j = j;
        this.k = j2;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.u = aivl;
        this.f = (a) Preconditions.checkNotNull(aVar, "retryPolicyProvider");
        this.v = (aixq.a) Preconditions.checkNotNull(aVar2, "hedgingPolicyProvider");
        this.l = tVar;
    }

    public abstract aivw a();

    public abstract aiws a(aiuk.a aVar, aivl aivl);

    /* Access modifiers changed, original: final */
    public final Runnable a(s sVar) {
        synchronized (this.h) {
            if (this.m.d != null) {
                return null;
            }
            List list;
            Collection singleton;
            boolean z;
            Collection collection = this.m.c;
            q qVar = this.m;
            Preconditions.checkState(qVar.d == null, "Already committed");
            List list2 = qVar.b;
            if (qVar.c.contains(sVar)) {
                list = null;
                singleton = Collections.singleton(sVar);
                z = true;
            } else {
                singleton = Collections.emptyList();
                list = list2;
                z = false;
            }
            this.m = new q(list, singleton, sVar, qVar.e, z);
            this.i.a(-this.o);
            b bVar = new b(collection, sVar);
            return bVar;
        }
    }

    public final void a(int i) {
        a(new i(i));
    }

    public final void a(aium aium) {
        a(new c(aium));
    }

    public final void a(aius aius) {
        a(new d(aius));
    }

    public final void a(aiuu aiuu) {
        a(new e(aiuu));
    }

    public final void a(aivw aivw) {
        s sVar = new s(0);
        sVar.a = new aiyh();
        Runnable a = a(sVar);
        if (a != null) {
            Future future = this.q;
            if (future != null) {
                future.cancel(false);
                this.q = null;
            }
            this.p.a(aivw, new aivl());
            a.run();
            return;
        }
        this.m.d.a.a(aivw);
        synchronized (this.h) {
            this.m = this.m.a();
        }
    }

    public final void a(aiwt aiwt) {
        this.p = aiwt;
        aivw a = a();
        if (a != null) {
            a(a);
            return;
        }
        synchronized (this.h) {
            this.m.b.add(new l());
        }
        b(d(0));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x002d in {5, 11, 12, 16} preds:[]
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
    final void a(defpackage.aiys.m r3) {
        /*
        r2 = this;
        r0 = r2.h;
        monitor-enter(r0);
        r1 = r2.m;	 Catch:{ all -> 0x002a }
        r1 = r1.a;	 Catch:{ all -> 0x002a }
        if (r1 != 0) goto L_0x0010;	 Catch:{ all -> 0x002a }
        r1 = r2.m;	 Catch:{ all -> 0x002a }
        r1 = r1.b;	 Catch:{ all -> 0x002a }
        r1.add(r3);	 Catch:{ all -> 0x002a }
        r1 = r2.m;	 Catch:{ all -> 0x002a }
        r1 = r1.c;	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        r0 = r1.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0029;
        r1 = r0.next();
        r1 = (defpackage.aiys.s) r1;
        r3.a(r1);
        goto L_0x0019;
        return;
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiys.a(aiys$m):void");
    }

    public final void a(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    public final void a(String str) {
        a(new a(str));
    }

    public abstract void b();

    public final void b(int i) {
        a(new h(i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:69:0x00d9 in {10, 16, 17, 20, 24, 25, 28, 29, 34, 35, 36, 39, 43, 46, 47, 55, 60, 62, 63, 64, 68} preds:[]
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
    final void b(defpackage.aiys.s r15) {
        /*
        r14 = this;
        r0 = 0;
        r1 = 0;
        r3 = r0;
        r2 = 0;
        r4 = r14.h;
        monitor-enter(r4);
        r5 = r14.m;	 Catch:{ all -> 0x00d6 }
        r6 = r5.d;	 Catch:{ all -> 0x00d6 }
        if (r6 == 0) goto L_0x001a;	 Catch:{ all -> 0x00d6 }
        r6 = r5.d;	 Catch:{ all -> 0x00d6 }
        if (r6 == r15) goto L_0x001a;	 Catch:{ all -> 0x00d6 }
        monitor-exit(r4);	 Catch:{ all -> 0x00d6 }
        r15 = r15.a;
        r0 = b;
        r15.a(r0);
        return;
        r6 = r5.b;	 Catch:{ all -> 0x00d6 }
        r6 = r6.size();	 Catch:{ all -> 0x00d6 }
        r7 = 1;	 Catch:{ all -> 0x00d6 }
        if (r2 != r6) goto L_0x0079;	 Catch:{ all -> 0x00d6 }
        r2 = r5.a;	 Catch:{ all -> 0x00d6 }
        if (r2 != 0) goto L_0x0029;	 Catch:{ all -> 0x00d6 }
        r2 = 1;	 Catch:{ all -> 0x00d6 }
        goto L_0x002a;	 Catch:{ all -> 0x00d6 }
        r2 = 0;	 Catch:{ all -> 0x00d6 }
        r3 = "Already passThrough";	 Catch:{ all -> 0x00d6 }
        com.google.common.base.Preconditions.checkState(r2, r3);	 Catch:{ all -> 0x00d6 }
        r2 = r15.b;	 Catch:{ all -> 0x00d6 }
        if (r2 == 0) goto L_0x0037;	 Catch:{ all -> 0x00d6 }
        r2 = r5.c;	 Catch:{ all -> 0x00d6 }
        r10 = r2;	 Catch:{ all -> 0x00d6 }
        goto L_0x0053;	 Catch:{ all -> 0x00d6 }
        r2 = r5.c;	 Catch:{ all -> 0x00d6 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x00d6 }
        if (r2 == 0) goto L_0x0044;	 Catch:{ all -> 0x00d6 }
        r2 = java.util.Collections.singletonList(r15);	 Catch:{ all -> 0x00d6 }
        goto L_0x0035;	 Catch:{ all -> 0x00d6 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x00d6 }
        r3 = r5.c;	 Catch:{ all -> 0x00d6 }
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        r2.add(r15);	 Catch:{ all -> 0x00d6 }
        r2 = java.util.Collections.unmodifiableCollection(r2);	 Catch:{ all -> 0x00d6 }
        goto L_0x0035;	 Catch:{ all -> 0x00d6 }
        r2 = r5.d;	 Catch:{ all -> 0x00d6 }
        if (r2 == 0) goto L_0x0059;	 Catch:{ all -> 0x00d6 }
        r13 = 1;	 Catch:{ all -> 0x00d6 }
        goto L_0x005a;	 Catch:{ all -> 0x00d6 }
        r13 = 0;	 Catch:{ all -> 0x00d6 }
        r2 = r5.b;	 Catch:{ all -> 0x00d6 }
        if (r13 == 0) goto L_0x006a;	 Catch:{ all -> 0x00d6 }
        r2 = r5.d;	 Catch:{ all -> 0x00d6 }
        if (r2 != r15) goto L_0x0063;	 Catch:{ all -> 0x00d6 }
        r1 = 1;	 Catch:{ all -> 0x00d6 }
        r15 = "Another RPC attempt has already committed";	 Catch:{ all -> 0x00d6 }
        com.google.common.base.Preconditions.checkState(r1, r15);	 Catch:{ all -> 0x00d6 }
        r9 = r0;	 Catch:{ all -> 0x00d6 }
        goto L_0x006b;	 Catch:{ all -> 0x00d6 }
        r9 = r2;	 Catch:{ all -> 0x00d6 }
        r15 = new aiys$q;	 Catch:{ all -> 0x00d6 }
        r11 = r5.d;	 Catch:{ all -> 0x00d6 }
        r12 = r5.e;	 Catch:{ all -> 0x00d6 }
        r8 = r15;	 Catch:{ all -> 0x00d6 }
        r8.<init>(r9, r10, r11, r12, r13);	 Catch:{ all -> 0x00d6 }
        r14.m = r15;	 Catch:{ all -> 0x00d6 }
        monitor-exit(r4);	 Catch:{ all -> 0x00d6 }
        return;	 Catch:{ all -> 0x00d6 }
        r6 = r15.b;	 Catch:{ all -> 0x00d6 }
        if (r6 == 0) goto L_0x007f;	 Catch:{ all -> 0x00d6 }
        monitor-exit(r4);	 Catch:{ all -> 0x00d6 }
        return;	 Catch:{ all -> 0x00d6 }
        r6 = r2 + 128;	 Catch:{ all -> 0x00d6 }
        r8 = r5.b;	 Catch:{ all -> 0x00d6 }
        r8 = r8.size();	 Catch:{ all -> 0x00d6 }
        r6 = java.lang.Math.min(r6, r8);	 Catch:{ all -> 0x00d6 }
        if (r3 != 0) goto L_0x0099;	 Catch:{ all -> 0x00d6 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x00d6 }
        r5 = r5.b;	 Catch:{ all -> 0x00d6 }
        r2 = r5.subList(r2, r6);	 Catch:{ all -> 0x00d6 }
        r3.<init>(r2);	 Catch:{ all -> 0x00d6 }
        goto L_0x00a5;	 Catch:{ all -> 0x00d6 }
        r3.clear();	 Catch:{ all -> 0x00d6 }
        r5 = r5.b;	 Catch:{ all -> 0x00d6 }
        r2 = r5.subList(r2, r6);	 Catch:{ all -> 0x00d6 }
        r3.addAll(r2);	 Catch:{ all -> 0x00d6 }
        monitor-exit(r4);	 Catch:{ all -> 0x00d6 }
        r2 = r3.iterator();
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x00d3;
        r4 = r2.next();
        r4 = (defpackage.aiys.m) r4;
        r5 = r14.m;
        r8 = r5.d;
        if (r8 == 0) goto L_0x00c0;
        r8 = r5.d;
        if (r8 != r15) goto L_0x00d3;
        r8 = r5.e;
        if (r8 == 0) goto L_0x00cf;
        r0 = r5.d;
        if (r0 != r15) goto L_0x00c9;
        r1 = 1;
        r15 = "substream should be CANCELLED_BECAUSE_COMMITTED already";
        com.google.common.base.Preconditions.checkState(r1, r15);
        return;
        r4.a(r15);
        goto L_0x00aa;
        r2 = r6;
        goto L_0x0004;
        r15 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00d6 }
        throw r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiys.b(aiys$s):void");
    }

    public final void c(int i) {
        q qVar = this.m;
        if (qVar.a) {
            qVar.d.a.c(i);
        } else {
            a(new j(i));
        }
    }

    /* Access modifiers changed, original: final */
    public final s d(int i) {
        s sVar = new s(i);
        final n nVar = new n(sVar);
        aiuk.a 1 = new aiuk.a() {
            public final aiuk a(aivl aivl) {
                return nVar;
            }
        };
        aivl aivl = this.u;
        aivl aivl2 = new aivl();
        aivl2.a(aivl);
        if (i > 0) {
            aivl2.a(t, String.valueOf(i));
        }
        sVar.a = a(1, aivl2);
        return sVar;
    }

    public final void d() {
        a(new g());
    }

    public final void f() {
        q qVar = this.m;
        if (qVar.a) {
            qVar.d.a.f();
        } else {
            a(new f());
        }
    }
}
