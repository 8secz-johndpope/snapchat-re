package defpackage;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiwp */
class aiwp {
    private static final Logger a = Logger.getLogger(aiwp.class.getName());
    private final Object b = new Object();
    private final Queue<Runnable> c = new ArrayDeque();
    private boolean d;

    aiwp() {
    }

    /* Access modifiers changed, original: final */
    public final aiwp a(Runnable runnable) {
        synchronized (this.b) {
            this.c.add(Preconditions.checkNotNull(runnable, "runnable is null"));
        }
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x002c in {9, 10, 15, 19, 21, 25} preds:[]
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
    final void a() {
        /*
        r4 = this;
        r0 = 0;
        r1 = 0;
        r2 = r4.b;
        monitor-enter(r2);
        r3 = 1;
        if (r1 != 0) goto L_0x0011;
        r1 = r4.d;	 Catch:{ all -> 0x0029 }
        if (r1 == 0) goto L_0x000e;	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        return;	 Catch:{ all -> 0x0029 }
        r4.d = r3;	 Catch:{ all -> 0x0029 }
        r1 = 1;	 Catch:{ all -> 0x0029 }
        r3 = r4.c;	 Catch:{ all -> 0x0029 }
        r3 = r3.poll();	 Catch:{ all -> 0x0029 }
        r3 = (java.lang.Runnable) r3;	 Catch:{ all -> 0x0029 }
        if (r3 != 0) goto L_0x001f;	 Catch:{ all -> 0x0029 }
        r4.d = r0;	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        return;	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        r3.run();	 Catch:{ Throwable -> 0x0024 }
        goto L_0x0002;
        r2 = move-exception;
        r4.a(r2);
        goto L_0x0002;
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwp.a():void");
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Throwable th) {
        a.log(Level.WARNING, "Runnable threw exception in ChannelExecutor", th);
    }
}
