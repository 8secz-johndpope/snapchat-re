package defpackage;

import com.google.common.base.Preconditions;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiyv */
public final class aiyv implements Runnable, Executor {
    private static final Logger b = Logger.getLogger(aiyv.class.getName());
    private static final a c = aiyv.a();
    volatile int a = 0;
    private final Executor d;
    private final Queue<Runnable> e = new ConcurrentLinkedQueue();

    /* renamed from: aiyv$b */
    static final class b extends a {
        private final AtomicIntegerFieldUpdater<aiyv> a;

        private b(AtomicIntegerFieldUpdater<aiyv> atomicIntegerFieldUpdater) {
            super();
            this.a = atomicIntegerFieldUpdater;
        }

        /* synthetic */ b(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, byte b) {
            this(atomicIntegerFieldUpdater);
        }

        public final boolean a(aiyv aiyv) {
            return this.a.compareAndSet(aiyv, 0, -1);
        }

        public final void b(aiyv aiyv) {
            this.a.set(aiyv, 0);
        }
    }

    /* renamed from: aiyv$a */
    static abstract class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public abstract boolean a(aiyv aiyv);

        public abstract void b(aiyv aiyv);
    }

    /* renamed from: aiyv$c */
    static final class c extends a {
        private c() {
            super();
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final boolean a(aiyv aiyv) {
            synchronized (aiyv) {
                if (aiyv.a == 0) {
                    aiyv.a = -1;
                    return true;
                }
                return false;
            }
        }

        public final void b(aiyv aiyv) {
            synchronized (aiyv) {
                aiyv.a = 0;
            }
        }
    }

    public aiyv(Executor executor) {
        Preconditions.checkNotNull(executor, "'executor' must not be null.");
        this.d = executor;
    }

    private static a a() {
        try {
            return new b(AtomicIntegerFieldUpdater.newUpdater(aiyv.class, "a"), (byte) 0);
        } catch (Throwable th) {
            b.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new c();
        }
    }

    private void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
            }
        }
    }

    public final void execute(Runnable runnable) {
        this.e.add(Preconditions.checkNotNull(runnable, "'r' must not be null."));
        a(runnable);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x003a in {5, 9, 12, 13, 16} preds:[]
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
        r5 = this;
        r0 = r5.e;	 Catch:{ all -> 0x0033 }
        r0 = r0.poll();	 Catch:{ all -> 0x0033 }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0021;
        r0.run();	 Catch:{ RuntimeException -> 0x000e }
        goto L_0x0000;
        r1 = move-exception;
        r2 = b;	 Catch:{ all -> 0x0033 }
        r3 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x0033 }
        r4 = "Exception while executing runnable ";	 Catch:{ all -> 0x0033 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0033 }
        r0 = r4.concat(r0);	 Catch:{ all -> 0x0033 }
        r2.log(r3, r0, r1);	 Catch:{ all -> 0x0033 }
        goto L_0x0000;
        r0 = c;
        r0.b(r5);
        r0 = r5.e;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0032;
        r0 = 0;
        r5.a(r0);
        return;
        r0 = move-exception;
        r1 = c;
        r1.b(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyv.run():void");
    }
}
