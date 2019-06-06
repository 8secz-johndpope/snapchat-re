package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ajtn */
public final class ajtn extends AtomicReferenceArray<Object> implements ajej, Runnable, Callable<Object> {
    private static Object b = new Object();
    private static Object c = new Object();
    private static Object d = new Object();
    private static Object e = new Object();
    private Runnable a;

    public ajtn(Runnable runnable, ajfo ajfo) {
        super(3);
        this.a = runnable;
        lazySet(0, ajfo);
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != e) {
                if (obj == c) {
                    future.cancel(false);
                    return;
                } else if (obj == d) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public final Object call() {
        run();
        return null;
    }

    public final void dispose() {
        Object obj;
        boolean z;
        Object obj2;
        do {
            obj = get(1);
            if (obj == e || obj == c || obj == d) {
                break;
            }
            z = get(2) != Thread.currentThread();
        } while (!compareAndSet(1, obj, z ? d : c));
        if (obj != null) {
            ((Future) obj).cancel(z);
        }
        do {
            obj2 = get(0);
            if (obj2 != e) {
                obj = b;
                if (obj2 == obj || obj2 == null) {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(0, obj2, obj));
        ((ajfo) obj2).c(this);
    }

    public final boolean isDisposed() {
        Object obj = get(0);
        return obj == b || obj == e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x0076 in {3, 8, 14, 20, 21, 27, 34, 35} preds:[]
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
        r0 = java.lang.Thread.currentThread();
        r1 = 2;
        r5.lazySet(r1, r0);
        r0 = 0;
        r2 = 1;
        r3 = 0;
        r4 = r5.a;	 Catch:{ Throwable -> 0x0013 }
        r4.run();	 Catch:{ Throwable -> 0x0013 }
        goto L_0x0017;
        r4 = move-exception;
        goto L_0x0046;
        r4 = move-exception;
        defpackage.ajvo.a(r4);	 Catch:{ all -> 0x0011 }
        r5.lazySet(r1, r0);
        r0 = r5.get(r3);
        r1 = b;
        if (r0 == r1) goto L_0x0031;
        r1 = e;
        r1 = r5.compareAndSet(r3, r0, r1);
        if (r1 == 0) goto L_0x0031;
        if (r0 == 0) goto L_0x0031;
        r0 = (defpackage.ajfo) r0;
        r0.c(r5);
        r0 = r5.get(r2);
        r1 = c;
        if (r0 == r1) goto L_0x0045;
        r1 = d;
        if (r0 == r1) goto L_0x0045;
        r1 = e;
        r0 = r5.compareAndSet(r2, r0, r1);
        if (r0 == 0) goto L_0x0031;
        return;
        r5.lazySet(r1, r0);
        r0 = r5.get(r3);
        r1 = b;
        if (r0 == r1) goto L_0x0060;
        r1 = e;
        r1 = r5.compareAndSet(r3, r0, r1);
        if (r1 == 0) goto L_0x0060;
        if (r0 == 0) goto L_0x0060;
        r0 = (defpackage.ajfo) r0;
        r0.c(r5);
        r0 = r5.get(r2);
        r1 = c;
        if (r0 == r1) goto L_0x0075;
        r1 = d;
        if (r0 == r1) goto L_0x0075;
        r1 = e;
        r0 = r5.compareAndSet(r2, r0, r1);
        if (r0 != 0) goto L_0x0075;
        goto L_0x0060;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtn.run():void");
    }
}
