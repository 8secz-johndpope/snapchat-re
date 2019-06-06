package defpackage;

import android.os.Looper;
import android.os.Process;

/* renamed from: zfp */
public final class zfp extends Thread {
    private int a = 10;
    private int b = -1;
    private Looper c;

    public zfp(String str, long j) {
        super(null, null, str, j);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x001e in {3, 12, 16, 20} preds:[]
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
    public final android.os.Looper a() {
        /*
        r1 = this;
        r0 = r1.isAlive();
        if (r0 != 0) goto L_0x0008;
        r0 = 0;
        return r0;
        monitor-enter(r1);
    L_0x0009:
        r0 = r1.isAlive();	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0017;	 Catch:{ all -> 0x001b }
        r0 = r1.c;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x0017;
        r1.wait();	 Catch:{ InterruptedException -> 0x0009 }
        goto L_0x0009;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        r0 = r1.c;
        return r0;
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfp.a():android.os.Looper");
    }

    public final void run() {
        this.b = Process.myTid();
        Looper.prepare();
        synchronized (this) {
            this.c = Looper.myLooper();
            notifyAll();
        }
        Process.setThreadPriority(this.a);
        Looper.loop();
        this.b = -1;
    }
}
