package defpackage;

import com.google.common.base.Stopwatch;
import defpackage.aiwu.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aixs */
public class aixs {
    private static final Logger f = Logger.getLogger(aixs.class.getName());
    public final long a;
    public Map<a, Executor> b = new LinkedHashMap();
    public boolean c;
    public Throwable d;
    public long e;
    private final Stopwatch g;

    public aixs(long j, Stopwatch stopwatch) {
        this.a = j;
        this.g = stopwatch;
    }

    public static Runnable a(final a aVar, final long j) {
        return new Runnable() {
            public final void run() {
            }
        };
    }

    public static Runnable a(final a aVar, final Throwable th) {
        return new Runnable() {
            public final void run() {
                aVar.a();
            }
        };
    }

    public static void a(a aVar, Executor executor, Throwable th) {
        aixs.a(executor, aixs.a(aVar, th));
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x003a in {5, 11, 12, 16} preds:[]
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
    public final void a(java.lang.Throwable r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0007;	 Catch:{ all -> 0x0037 }
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        return;	 Catch:{ all -> 0x0037 }
        r0 = 1;	 Catch:{ all -> 0x0037 }
        r3.c = r0;	 Catch:{ all -> 0x0037 }
        r3.d = r4;	 Catch:{ all -> 0x0037 }
        r0 = r3.b;	 Catch:{ all -> 0x0037 }
        r1 = 0;	 Catch:{ all -> 0x0037 }
        r3.b = r1;	 Catch:{ all -> 0x0037 }
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        r0 = r0.entrySet();
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0036;
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = (defpackage.aiwu.a) r2;
        r1 = r1.getValue();
        r1 = (java.util.concurrent.Executor) r1;
        defpackage.aixs.a(r2, r1, r4);
        goto L_0x001a;
        return;
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixs.a(java.lang.Throwable):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0047 in {6, 12, 13, 17} preds:[]
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
    public final boolean a() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x0008;	 Catch:{ all -> 0x0044 }
        r0 = 0;	 Catch:{ all -> 0x0044 }
        monitor-exit(r6);	 Catch:{ all -> 0x0044 }
        return r0;	 Catch:{ all -> 0x0044 }
        r0 = 1;	 Catch:{ all -> 0x0044 }
        r6.c = r0;	 Catch:{ all -> 0x0044 }
        r1 = r6.g;	 Catch:{ all -> 0x0044 }
        r2 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x0044 }
        r1 = r1.elapsed(r2);	 Catch:{ all -> 0x0044 }
        r6.e = r1;	 Catch:{ all -> 0x0044 }
        r3 = r6.b;	 Catch:{ all -> 0x0044 }
        r4 = 0;	 Catch:{ all -> 0x0044 }
        r6.b = r4;	 Catch:{ all -> 0x0044 }
        monitor-exit(r6);	 Catch:{ all -> 0x0044 }
        r3 = r3.entrySet();
        r3 = r3.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0043;
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r5 = r4.getValue();
        r5 = (java.util.concurrent.Executor) r5;
        r4 = r4.getKey();
        r4 = (defpackage.aiwu.a) r4;
        r4 = defpackage.aixs.a(r4, r1);
        defpackage.aixs.a(r5, r4);
        goto L_0x0023;
        return r0;
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0044 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixs.a():boolean");
    }
}
