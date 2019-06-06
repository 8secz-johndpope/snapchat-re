package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: sl */
public abstract class sl<V> implements ListenableFuture<V> {
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    static final a b;
    private static final Logger f = Logger.getLogger(sl.class.getName());
    private static final Object g = new Object();
    volatile Object c;
    volatile d d;
    volatile h e;

    /* renamed from: sl$a */
    static abstract class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public abstract void a(h hVar, Thread thread);

        public abstract void a(h hVar, h hVar2);

        public abstract boolean a(sl<?> slVar, Object obj, Object obj2);

        public abstract boolean a(sl<?> slVar, d dVar, d dVar2);

        public abstract boolean a(sl<?> slVar, h hVar, h hVar2);
    }

    /* renamed from: sl$d */
    static final class d {
        static final d a = new d(null, null);
        final Runnable b;
        final Executor c;
        d d;

        d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* renamed from: sl$e */
    static final class e extends a {
        private AtomicReferenceFieldUpdater<h, Thread> a;
        private AtomicReferenceFieldUpdater<h, h> b;
        private AtomicReferenceFieldUpdater<sl, h> c;
        private AtomicReferenceFieldUpdater<sl, d> d;
        private AtomicReferenceFieldUpdater<sl, Object> e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<sl, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<sl, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<sl, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* Access modifiers changed, original: final */
        public final void a(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        /* Access modifiers changed, original: final */
        public final void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(sl<?> slVar, Object obj, Object obj2) {
            return this.e.compareAndSet(slVar, obj, obj2);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(sl<?> slVar, d dVar, d dVar2) {
            return this.d.compareAndSet(slVar, dVar, dVar2);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(sl<?> slVar, h hVar, h hVar2) {
            return this.c.compareAndSet(slVar, hVar, hVar2);
        }
    }

    /* renamed from: sl$h */
    static final class h {
        static final h a = new h();
        volatile Thread b;
        volatile h c;

        h() {
        }

        h(byte b) {
            sl.b.a(this, Thread.currentThread());
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            Thread thread = this.b;
            if (thread != null) {
                this.b = null;
                LockSupport.unpark(thread);
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(h hVar) {
            sl.b.a(this, hVar);
        }
    }

    /* renamed from: sl$b */
    static final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (sl.a) {
                b = null;
                a = null;
                return;
            }
            b = new b(false, null);
            a = new b(true, null);
        }

        b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* renamed from: sl$c */
    static final class c {
        static final c a = new c(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        c(Throwable th) {
            this.b = (Throwable) sl.b((Object) th);
        }
    }

    /* renamed from: sl$f */
    static final class f<V> implements Runnable {
        final sl<V> a;
        final ListenableFuture<? extends V> b;

        f(sl<V> slVar, ListenableFuture<? extends V> listenableFuture) {
            this.a = slVar;
            this.b = listenableFuture;
        }

        public final void run() {
            if (this.a.c == this) {
                if (sl.b.a(this.a, (Object) this, sl.b(this.b))) {
                    sl.a(this.a);
                }
            }
        }
    }

    /* renamed from: sl$g */
    static final class g extends a {
        g() {
            super();
        }

        /* Access modifiers changed, original: final */
        public final void a(h hVar, Thread thread) {
            hVar.b = thread;
        }

        /* Access modifiers changed, original: final */
        public final void a(h hVar, h hVar2) {
            hVar.c = hVar2;
        }

        /* Access modifiers changed, original: final */
        public final boolean a(sl<?> slVar, Object obj, Object obj2) {
            synchronized (slVar) {
                if (slVar.c == obj) {
                    slVar.c = obj2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean a(sl<?> slVar, d dVar, d dVar2) {
            synchronized (slVar) {
                if (slVar.d == dVar) {
                    slVar.d = dVar2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean a(sl<?> slVar, h hVar, h hVar2) {
            synchronized (slVar) {
                if (slVar.e == hVar) {
                    slVar.e = hVar2;
                    return true;
                }
                return false;
            }
        }
    }

    static {
        Throwable th;
        a gVar;
        String str = "c";
        try {
            a eVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, str), AtomicReferenceFieldUpdater.newUpdater(sl.class, h.class, "e"), AtomicReferenceFieldUpdater.newUpdater(sl.class, d.class, "d"), AtomicReferenceFieldUpdater.newUpdater(sl.class, Object.class, str));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        b = gVar;
        if (th != null) {
            f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    protected sl() {
    }

    private static <V> V a(Future<V> future) {
        Future future2;
        Object obj = null;
        while (true) {
            try {
                future2 = future2.get();
                break;
            } catch (InterruptedException unused) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return future2;
    }

    private static CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.d;
        } while (!b.a(this, dVar2, d.a));
        d dVar3 = dVar2;
        dVar2 = dVar;
        dVar = dVar3;
        while (dVar != null) {
            d dVar4 = dVar.d;
            dVar.d = dVar2;
            dVar2 = dVar;
            dVar = dVar4;
        }
        return dVar2;
    }

    private void a() {
        h hVar;
        do {
            hVar = this.e;
        } while (!b.a(this, hVar, h.a));
        while (hVar != null) {
            hVar.a();
            hVar = hVar.c;
        }
    }

    private static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
            stringBuilder.append(runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            logger.log(level, stringBuilder.toString(), e);
        }
    }

    private void a(StringBuilder stringBuilder) {
        String str = "]";
        try {
            Object a = sl.a((Future) this);
            stringBuilder.append("SUCCESS, result=[");
            stringBuilder.append(d(a));
            stringBuilder.append(str);
        } catch (ExecutionException e) {
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(e.getCause());
            stringBuilder.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            stringBuilder.append(str);
        } catch (RuntimeException e2) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(e2.getClass());
            str = " thrown from get()]";
            stringBuilder.append(str);
        }
    }

    private void a(h hVar) {
        hVar.b = null;
        while (true) {
            hVar = this.e;
            if (hVar != h.a) {
                h hVar2 = null;
                while (hVar != null) {
                    h hVar3 = hVar.c;
                    if (hVar.b != null) {
                        hVar2 = hVar;
                    } else if (hVar2 != null) {
                        hVar2.c = hVar3;
                        if (hVar2.b == null) {
                        }
                    } else if (b.a(this, hVar, hVar3)) {
                    }
                    hVar = hVar3;
                }
                return;
            }
            return;
        }
    }

    static void a(sl<?> slVar) {
        d dVar = null;
        while (true) {
            sl slVar2;
            slVar2.a();
            d a = slVar2.a(dVar);
            while (a != null) {
                dVar = a.d;
                Runnable runnable = a.b;
                if (runnable instanceof f) {
                    Object obj = (f) runnable;
                    slVar2 = obj.a;
                    if (slVar2.c == obj) {
                        if (b.a(slVar2, obj, sl.b(obj.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    sl.a(runnable, a.c);
                }
                a = dVar;
            }
            return;
        }
    }

    static Object b(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof sl) {
            Object obj = ((sl) listenableFuture).c;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    obj = bVar.d != null ? new b(false, bVar.d) : b.b;
                }
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if (((a ^ 1) & isCancelled) != 0) {
            return b.b;
        }
        try {
            Object a = sl.a((Future) listenableFuture);
            return a == null ? g : a;
        } catch (ExecutionException e) {
            return new c(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new b(false, e2);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2));
        } catch (Throwable th) {
            return new c(th);
        }
    }

    static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    private static V c(Object obj) {
        if (obj instanceof b) {
            throw sl.a("Task was cancelled.", ((b) obj).d);
        } else if (!(obj instanceof c)) {
            return obj == g ? null : obj;
        } else {
            throw new ExecutionException(((c) obj).b);
        }
    }

    private String d(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(ListenableFuture<? extends V> listenableFuture) {
        Object cVar;
        sl.b((Object) listenableFuture);
        Object obj = this.c;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!b.a(this, null, sl.b((ListenableFuture) listenableFuture))) {
                    return false;
                }
                sl.a(this);
                return true;
            }
            obj = new f(this, listenableFuture);
            if (b.a(this, null, obj)) {
                try {
                    listenableFuture.addListener(obj, sm.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.a;
                }
                return true;
            }
            obj = this.c;
        }
        if (obj instanceof b) {
            listenableFuture.cancel(((b) obj).c);
        }
        return false;
        b.a(this, obj, cVar);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(V v) {
        Object v2;
        if (v2 == null) {
            v2 = g;
        }
        if (!b.a(this, null, v2)) {
            return false;
        }
        sl.a(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(Throwable th) {
        if (!b.a(this, null, new c((Throwable) sl.b((Object) th)))) {
            return false;
        }
        sl.a(this);
        return true;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        sl.b((Object) runnable);
        sl.b((Object) executor);
        d dVar = this.d;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.d = dVar;
                if (!b.a(this, dVar, dVar2)) {
                    dVar = this.d;
                } else {
                    return;
                }
            } while (dVar != d.a);
        }
        sl.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        Object obj = this.c;
        if (((obj == null ? 1 : 0) | (obj instanceof f)) == 0) {
            return false;
        }
        Object bVar = a ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.a : b.b;
        boolean z2 = false;
        Object obj2 = obj;
        sl slVar = this;
        while (true) {
            if (b.a(slVar, obj2, bVar)) {
                sl.a(slVar);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                ListenableFuture listenableFuture = ((f) obj2).b;
                if (listenableFuture instanceof sl) {
                    slVar = (sl) listenableFuture;
                    obj2 = slVar.c;
                    if (((obj2 == null ? 1 : 0) | (obj2 instanceof f)) == 0) {
                        return true;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            }
            obj2 = slVar.c;
            if (!(obj2 instanceof f)) {
                return z2;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x006f in {4, 5, 8, 9, 13, 23, 24, 27, 28, 32, 34, 36, 38, 40} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final V get() {
        /*
        r6 = this;
        r0 = java.lang.Thread.interrupted();
        if (r0 != 0) goto L_0x0069;
        r0 = r6.c;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x000e;
        r3 = 1;
        goto L_0x000f;
        r3 = 0;
        r4 = r0 instanceof defpackage.sl.f;
        if (r4 != 0) goto L_0x0015;
        r4 = 1;
        goto L_0x0016;
        r4 = 0;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x001e;
        r0 = defpackage.sl.c(r0);
        return r0;
        r0 = r6.e;
        r3 = defpackage.sl.h.a;
        if (r0 == r3) goto L_0x0062;
        r3 = new sl$h;
        r3.<init>(r2);
        r3.a(r0);
        r4 = b;
        r0 = r4.a(r6, r0, r3);
        if (r0 == 0) goto L_0x005c;
        java.util.concurrent.locks.LockSupport.park(r6);
        r0 = java.lang.Thread.interrupted();
        if (r0 != 0) goto L_0x0053;
        r0 = r6.c;
        if (r0 == 0) goto L_0x0043;
        r4 = 1;
        goto L_0x0044;
        r4 = 0;
        r5 = r0 instanceof defpackage.sl.f;
        if (r5 != 0) goto L_0x004a;
        r5 = 1;
        goto L_0x004b;
        r5 = 0;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0034;
        r0 = defpackage.sl.c(r0);
        return r0;
        r6.a(r3);
        r0 = new java.lang.InterruptedException;
        r0.<init>();
        throw r0;
        r0 = r6.e;
        r4 = defpackage.sl.h.a;
        if (r0 != r4) goto L_0x0029;
        r0 = r6.c;
        r0 = defpackage.sl.c(r0);
        return r0;
        r0 = new java.lang.InterruptedException;
        r0.<init>();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.get():java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:93:0x01bf in {4, 5, 8, 9, 13, 16, 17, 29, 30, 33, 34, 38, 41, 43, 45, 47, 52, 53, 56, 57, 61, 64, 66, 73, 74, 75, 80, 81, 83, 84, 88, 90, 92} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r3 = r22;
        r4 = r3.toNanos(r1);
        r6 = java.lang.Thread.interrupted();
        if (r6 != 0) goto L_0x01b9;
        r6 = r0.c;
        r8 = 0;
        if (r6 == 0) goto L_0x0017;
        r9 = 1;
        goto L_0x0018;
        r9 = 0;
        r10 = r6 instanceof defpackage.sl.f;
        if (r10 != 0) goto L_0x001e;
        r10 = 1;
        goto L_0x001f;
        r10 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0027;
        r1 = defpackage.sl.c(r6);
        return r1;
        r9 = 0;
        r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r6 <= 0) goto L_0x0033;
        r11 = java.lang.System.nanoTime();
        r11 = r11 + r4;
        goto L_0x0034;
        r11 = r9;
        r13 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 < 0) goto L_0x0093;
        r6 = r0.e;
        r15 = defpackage.sl.h.a;
        if (r6 == r15) goto L_0x008c;
        r15 = new sl$h;
        r15.<init>(r8);
        r15.a(r6);
        r7 = b;
        r6 = r7.a(r0, r6, r15);
        if (r6 == 0) goto L_0x0086;
        java.util.concurrent.locks.LockSupport.parkNanos(r0, r4);
        r4 = java.lang.Thread.interrupted();
        if (r4 != 0) goto L_0x007d;
        r4 = r0.c;
        if (r4 == 0) goto L_0x005f;
        r5 = 1;
        goto L_0x0060;
        r5 = 0;
        r6 = r4 instanceof defpackage.sl.f;
        if (r6 != 0) goto L_0x0066;
        r6 = 1;
        goto L_0x0067;
        r6 = 0;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x006f;
        r1 = defpackage.sl.c(r4);
        return r1;
        r4 = java.lang.System.nanoTime();
        r4 = r11 - r4;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 >= 0) goto L_0x0050;
        r0.a(r15);
        goto L_0x0093;
        r0.a(r15);
        r1 = new java.lang.InterruptedException;
        r1.<init>();
        throw r1;
        r6 = r0.e;
        r7 = defpackage.sl.h.a;
        if (r6 != r7) goto L_0x0045;
        r1 = r0.c;
        r1 = defpackage.sl.c(r1);
        return r1;
        r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r6 <= 0) goto L_0x00c0;
        r4 = r0.c;
        if (r4 == 0) goto L_0x009d;
        r5 = 1;
        goto L_0x009e;
        r5 = 0;
        r6 = r4 instanceof defpackage.sl.f;
        if (r6 != 0) goto L_0x00a4;
        r6 = 1;
        goto L_0x00a5;
        r6 = 0;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x00ad;
        r1 = defpackage.sl.c(r4);
        return r1;
        r4 = java.lang.Thread.interrupted();
        if (r4 != 0) goto L_0x00ba;
        r4 = java.lang.System.nanoTime();
        r4 = r11 - r4;
        goto L_0x0093;
        r1 = new java.lang.InterruptedException;
        r1.<init>();
        throw r1;
        r6 = r19.toString();
        r7 = r22.toString();
        r11 = java.util.Locale.ROOT;
        r7 = r7.toLowerCase(r11);
        r11 = new java.lang.StringBuilder;
        r12 = "Waited ";
        r11.<init>(r12);
        r11.append(r1);
        r1 = " ";
        r11.append(r1);
        r2 = r22.toString();
        r12 = java.util.Locale.ROOT;
        r2 = r2.toLowerCase(r12);
        r11.append(r2);
        r2 = r11.toString();
        r11 = r4 + r13;
        r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r15 >= 0) goto L_0x0182;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r11.append(r2);
        r2 = " (plus ";
        r11.append(r2);
        r2 = r11.toString();
        r4 = -r4;
        r11 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r11 = r3.convert(r4, r11);
        r17 = r3.toNanos(r11);
        r4 = r4 - r17;
        r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r3 == 0) goto L_0x011e;
        r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r3 <= 0) goto L_0x011b;
        goto L_0x011e;
        r16 = 0;
        goto L_0x0120;
        r16 = 1;
        r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r3 <= 0) goto L_0x015b;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3.append(r11);
        r3.append(r1);
        r3.append(r7);
        r2 = r3.toString();
        if (r16 == 0) goto L_0x014c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r2 = ",";
        r3.append(r2);
        r2 = r3.toString();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3.append(r1);
        r2 = r3.toString();
        if (r16 == 0) goto L_0x0171;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r2);
        r1.append(r4);
        r2 = " nanoseconds ";
        r1.append(r2);
        r2 = r1.toString();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r2);
        r2 = "delay)";
        r1.append(r2);
        r2 = r1.toString();
        r1 = r19.isDone();
        if (r1 == 0) goto L_0x019f;
        r1 = new java.util.concurrent.TimeoutException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r2 = " but future completed as timeout expired";
        r3.append(r2);
        r2 = r3.toString();
        r1.<init>(r2);
        throw r1;
        r1 = new java.util.concurrent.TimeoutException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r2 = " for ";
        r3.append(r2);
        r3.append(r6);
        r2 = r3.toString();
        r1.<init>(r2);
        throw r1;
        r1 = new java.lang.InterruptedException;
        r1.<init>();
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.c instanceof b;
    }

    public final boolean isDone() {
        Object obj = this.c;
        int i = 1;
        int i2 = obj != null ? 1 : 0;
        if (obj instanceof f) {
            i = 0;
        }
        return i2 & i;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        String str2 = "]";
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                StringBuilder stringBuilder2;
                try {
                    Object obj = this.c;
                    if (obj instanceof f) {
                        stringBuilder2 = new StringBuilder("setFuture=[");
                        stringBuilder2.append(d(((f) obj).b));
                        stringBuilder2.append(str2);
                        str = stringBuilder2.toString();
                    } else if (this instanceof ScheduledFuture) {
                        StringBuilder stringBuilder3 = new StringBuilder("remaining delay=[");
                        stringBuilder3.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
                        stringBuilder3.append(" ms]");
                        str = stringBuilder3.toString();
                    } else {
                        str = null;
                    }
                } catch (RuntimeException e) {
                    stringBuilder2 = new StringBuilder("Exception thrown from implementation: ");
                    stringBuilder2.append(e.getClass());
                    str = stringBuilder2.toString();
                }
                if (str != null && !str.isEmpty()) {
                    stringBuilder.append("PENDING, info=[");
                    stringBuilder.append(str);
                    stringBuilder.append(str2);
                    stringBuilder.append(str2);
                    return stringBuilder.toString();
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            a(stringBuilder);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
