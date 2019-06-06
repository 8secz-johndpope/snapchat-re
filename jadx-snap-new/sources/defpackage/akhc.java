package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: akhc */
public final class akhc {
    static final Executor a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), akib.a("OkHttp ConnectionPool", true));
    static final /* synthetic */ boolean f = (akhc.class.desiredAssertionStatus() ^ 1);
    final Runnable b;
    final Deque<akij> c;
    final akik d;
    boolean e;
    private int g;
    private final long h;

    /* renamed from: akhc$1 */
    class 1 implements Runnable {
        1() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x002e in {2, 9, 14, 16} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r6 = this;
            r0 = defpackage.akhc.this;
            r1 = java.lang.System.nanoTime();
            r0 = r0.a(r1);
            r2 = -1;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 != 0) goto L_0x0011;
            return;
            r2 = 0;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x0000;
            r2 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
            r4 = r0 / r2;
            r2 = r2 * r4;
            r0 = r0 - r2;
            r2 = defpackage.akhc.this;
            monitor-enter(r2);
            r3 = defpackage.akhc.this;	 Catch:{ InterruptedException -> 0x002a }
            r1 = (int) r0;	 Catch:{ InterruptedException -> 0x002a }
            r3.wait(r4, r1);	 Catch:{ InterruptedException -> 0x002a }
            goto L_0x002a;
            r0 = move-exception;
            goto L_0x002c;
        L_0x002a:
            monitor-exit(r2);	 Catch:{ all -> 0x0028 }
            goto L_0x0000;	 Catch:{ all -> 0x0028 }
            monitor-exit(r2);	 Catch:{ all -> 0x0028 }
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akhc$1.run():void");
        }
    }

    public akhc() {
        this(TimeUnit.MINUTES);
    }

    private akhc(TimeUnit timeUnit) {
        this.b = new 1();
        this.c = new ArrayDeque();
        this.d = new akik();
        this.g = 5;
        this.h = timeUnit.toNanos(5);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x00ac in {10, 13, 14, 16, 19, 24, 28, 32, 35, 39, 43} preds:[]
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
    final long a(long r14) {
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.c;	 Catch:{ all -> 0x00a9 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00a9 }
        r1 = 0;	 Catch:{ all -> 0x00a9 }
        r2 = 0;	 Catch:{ all -> 0x00a9 }
        r3 = -9223372036854775808;	 Catch:{ all -> 0x00a9 }
        r5 = r2;	 Catch:{ all -> 0x00a9 }
        r2 = 0;	 Catch:{ all -> 0x00a9 }
        r6 = 0;	 Catch:{ all -> 0x00a9 }
        r7 = r0.hasNext();	 Catch:{ all -> 0x00a9 }
        if (r7 == 0) goto L_0x007e;	 Catch:{ all -> 0x00a9 }
        r7 = r0.next();	 Catch:{ all -> 0x00a9 }
        r7 = (defpackage.akij) r7;	 Catch:{ all -> 0x00a9 }
        r8 = r7.j;	 Catch:{ all -> 0x00a9 }
        r9 = 0;	 Catch:{ all -> 0x00a9 }
        r10 = r8.size();	 Catch:{ all -> 0x00a9 }
        if (r9 >= r10) goto L_0x0068;	 Catch:{ all -> 0x00a9 }
        r10 = r8.get(r9);	 Catch:{ all -> 0x00a9 }
        r10 = (java.lang.ref.Reference) r10;	 Catch:{ all -> 0x00a9 }
        r11 = r10.get();	 Catch:{ all -> 0x00a9 }
        if (r11 == 0) goto L_0x0032;	 Catch:{ all -> 0x00a9 }
        r9 = r9 + 1;	 Catch:{ all -> 0x00a9 }
        goto L_0x001d;	 Catch:{ all -> 0x00a9 }
        r10 = (defpackage.akin.a) r10;	 Catch:{ all -> 0x00a9 }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a9 }
        r12 = "A connection to ";	 Catch:{ all -> 0x00a9 }
        r11.<init>(r12);	 Catch:{ all -> 0x00a9 }
        r12 = r7.a;	 Catch:{ all -> 0x00a9 }
        r12 = r12.a;	 Catch:{ all -> 0x00a9 }
        r12 = r12.a;	 Catch:{ all -> 0x00a9 }
        r11.append(r12);	 Catch:{ all -> 0x00a9 }
        r12 = " was leaked. Did you forget to close a response body?";	 Catch:{ all -> 0x00a9 }
        r11.append(r12);	 Catch:{ all -> 0x00a9 }
        r11 = r11.toString();	 Catch:{ all -> 0x00a9 }
        r12 = defpackage.akju.a;	 Catch:{ all -> 0x00a9 }
        r10 = r10.a;	 Catch:{ all -> 0x00a9 }
        r12.a(r11, r10);	 Catch:{ all -> 0x00a9 }
        r8.remove(r9);	 Catch:{ all -> 0x00a9 }
        r10 = 1;	 Catch:{ all -> 0x00a9 }
        r7.h = r10;	 Catch:{ all -> 0x00a9 }
        r10 = r8.isEmpty();	 Catch:{ all -> 0x00a9 }
        if (r10 == 0) goto L_0x001d;	 Catch:{ all -> 0x00a9 }
        r8 = r13.h;	 Catch:{ all -> 0x00a9 }
        r8 = r14 - r8;	 Catch:{ all -> 0x00a9 }
        r7.k = r8;	 Catch:{ all -> 0x00a9 }
        r8 = 0;	 Catch:{ all -> 0x00a9 }
        goto L_0x006c;	 Catch:{ all -> 0x00a9 }
        r8 = r8.size();	 Catch:{ all -> 0x00a9 }
        if (r8 <= 0) goto L_0x0071;	 Catch:{ all -> 0x00a9 }
        r6 = r6 + 1;	 Catch:{ all -> 0x00a9 }
        goto L_0x000e;	 Catch:{ all -> 0x00a9 }
        r2 = r2 + 1;	 Catch:{ all -> 0x00a9 }
        r8 = r7.k;	 Catch:{ all -> 0x00a9 }
        r8 = r14 - r8;	 Catch:{ all -> 0x00a9 }
        r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));	 Catch:{ all -> 0x00a9 }
        if (r10 <= 0) goto L_0x000e;	 Catch:{ all -> 0x00a9 }
        r5 = r7;	 Catch:{ all -> 0x00a9 }
        r3 = r8;	 Catch:{ all -> 0x00a9 }
        goto L_0x000e;	 Catch:{ all -> 0x00a9 }
        r14 = r13.h;	 Catch:{ all -> 0x00a9 }
        r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));	 Catch:{ all -> 0x00a9 }
        if (r0 >= 0) goto L_0x009b;	 Catch:{ all -> 0x00a9 }
        r14 = 5;	 Catch:{ all -> 0x00a9 }
        if (r2 <= r14) goto L_0x0088;	 Catch:{ all -> 0x00a9 }
        goto L_0x009b;	 Catch:{ all -> 0x00a9 }
        if (r2 <= 0) goto L_0x008f;	 Catch:{ all -> 0x00a9 }
        r14 = r13.h;	 Catch:{ all -> 0x00a9 }
        r14 = r14 - r3;	 Catch:{ all -> 0x00a9 }
        monitor-exit(r13);	 Catch:{ all -> 0x00a9 }
        return r14;	 Catch:{ all -> 0x00a9 }
        if (r6 <= 0) goto L_0x0095;	 Catch:{ all -> 0x00a9 }
        r14 = r13.h;	 Catch:{ all -> 0x00a9 }
        monitor-exit(r13);	 Catch:{ all -> 0x00a9 }
        return r14;	 Catch:{ all -> 0x00a9 }
        r13.e = r1;	 Catch:{ all -> 0x00a9 }
        r14 = -1;	 Catch:{ all -> 0x00a9 }
        monitor-exit(r13);	 Catch:{ all -> 0x00a9 }
        return r14;	 Catch:{ all -> 0x00a9 }
        r14 = r13.c;	 Catch:{ all -> 0x00a9 }
        r14.remove(r5);	 Catch:{ all -> 0x00a9 }
        monitor-exit(r13);	 Catch:{ all -> 0x00a9 }
        r14 = r5.c;
        defpackage.akib.a(r14);
        r14 = 0;
        return r14;
        r14 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x00a9 }
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhc.a(long):long");
    }
}
