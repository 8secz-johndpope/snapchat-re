package defpackage;

import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: abmr */
public class abmr {
    static final Supplier<Looper> a = Suppliers.memoize(new 1());
    static final ConcurrentLinkedQueue<a> b = new ConcurrentLinkedQueue();
    static a c;
    static final AtomicBoolean d = new AtomicBoolean(false);
    static Runnable e;
    private static Supplier<Handler> f = Suppliers.memoize(new 2());
    private static boolean g = true;

    /* renamed from: abmr$1 */
    static class 1 implements Supplier<Looper> {
        1() {
        }

        public final /* synthetic */ Object get() {
            return Looper.getMainLooper();
        }
    }

    /* renamed from: abmr$2 */
    static class 2 implements Supplier<Handler> {
        2() {
        }

        public final /* synthetic */ Object get() {
            return new Handler((Looper) abmr.a.get());
        }
    }

    /* renamed from: abmr$a */
    static class a implements Runnable {
        private static final long a = TimeUnit.MILLISECONDS.convert(16, TimeUnit.NANOSECONDS);
        private final Runnable b;
        private final CancellationSignal c;
        private long d = 0;

        public a(Runnable runnable, CancellationSignal cancellationSignal) {
            this.c = cancellationSignal;
            this.b = runnable;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x004e in {4, 7, 8, 15, 16, 20} preds:[]
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
        public final void run() {
            /*
            r5 = this;
            r0 = r5;
            if (r0 == 0) goto L_0x0031;
            r1 = java.lang.System.nanoTime();
            r3 = r0.c;
            r3 = r3.isCanceled();
            if (r3 != 0) goto L_0x0014;
            r0 = r0.b;
            r0.run();
            r3 = java.lang.System.nanoTime();
            r3 = r3 - r1;
            r0 = r5.d;
            r0 = r0 + r3;
            r5.d = r0;
            r0 = r5.d;
            r2 = a;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 >= 0) goto L_0x002f;
            r0 = defpackage.abmr.b;
            r0 = r0.poll();
            r0 = (defpackage.abmr.a) r0;
            goto L_0x0001;
            r0 = 0;
            goto L_0x0001;
            r0 = 0;
            r5.d = r0;
            r0 = defpackage.abmr.b;
            monitor-enter(r0);
            r1 = defpackage.abmr.b;	 Catch:{ all -> 0x004b }
            r1 = r1.poll();	 Catch:{ all -> 0x004b }
            r1 = (defpackage.abmr.a) r1;	 Catch:{ all -> 0x004b }
            defpackage.abmr.c = r1;	 Catch:{ all -> 0x004b }
            monitor-exit(r0);	 Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a;
            r2 = 1;
            defpackage.abmr.a(r1, r2);
            return;
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x004b }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abmr$a.run():void");
        }
    }

    public static void a() {
        if (g && !abmr.c()) {
            throw new IllegalStateException("This method must be called only from the Main Thread.");
        }
    }

    @Deprecated
    public static void a(Runnable runnable) {
        if (abmr.c()) {
            runnable.run();
        } else {
            abmr.b(runnable);
        }
    }

    @Deprecated
    static void a(Runnable runnable, long j) {
        ((Handler) f.get()).postDelayed(runnable, j);
    }

    public static void a(String str) {
        if (g && abmr.c()) {
            throw new IllegalStateException(str);
        }
    }

    @Deprecated
    public static void b() {
        abmr.a("This method must not be called from the Main Thread.");
    }

    @Deprecated
    public static void b(Runnable runnable) {
        if (d.get()) {
            ((Handler) f.get()).postAtFrontOfQueue(runnable);
            return;
        }
        synchronized (abmr.class) {
            if (e != null) {
                ((Handler) f.get()).removeCallbacks(e);
                ((Handler) f.get()).postAtFrontOfQueue(runnable);
                ((Handler) f.get()).postAtFrontOfQueue(e);
            } else {
                ((Handler) f.get()).postAtFrontOfQueue(runnable);
            }
        }
    }

    @Deprecated
    public static synchronized void c(final Runnable runnable) {
        synchronized (abmr.class) {
            if (e != null) {
                abmr.b(runnable);
                return;
            }
            d.set(false);
            e = new Runnable() {
                private final WeakReference<Runnable> a = new WeakReference(runnable);
                private volatile boolean b = false;

                public final void run() {
                    if (!abmr.d.getAndSet(true) && !this.b) {
                        this.b = true;
                        synchronized (abmr.class) {
                            abmr.e = null;
                        }
                        Runnable runnable = (Runnable) this.a.get();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            };
            ((Handler) f.get()).postAtFrontOfQueue(e);
        }
    }

    public static boolean c() {
        return a.get() != null && Thread.currentThread() == ((Looper) a.get()).getThread();
    }

    @Deprecated
    public static CancellationSignal d(Runnable runnable) {
        Object obj;
        CancellationSignal cancellationSignal = new CancellationSignal();
        a aVar = new a(runnable, cancellationSignal);
        synchronized (b) {
            if (c == null) {
                obj = 1;
                c = aVar;
            } else {
                obj = null;
                b.add(aVar);
            }
        }
        if (obj != null) {
            abmr.a(aVar, 0);
        }
        return cancellationSignal;
    }
}
