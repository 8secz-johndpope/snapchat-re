package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: akqm */
final class akqm extends Handler {
    private final akqp a = new akqp();
    private final int b = 10;
    private final akqj c;
    private boolean d;

    akqm(akqj akqj, Looper looper) {
        super(looper);
        this.c = akqj;
    }

    /* Access modifiers changed, original: final */
    public final void a(akqu akqu, Object obj) {
        akqo a = akqo.a(akqu, obj);
        synchronized (this) {
            this.a.a(a);
            if (!this.d) {
                this.d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new akql("Could not send handler message");
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x004b in {12, 15, 19, 25, 28, 31} preds:[]
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
    public final void handleMessage(android.os.Message r8) {
        /*
        r7 = this;
        r8 = 0;
        r0 = android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0047 }
        r2 = r7.a;	 Catch:{ all -> 0x0047 }
        r2 = r2.a();	 Catch:{ all -> 0x0047 }
        if (r2 != 0) goto L_0x0021;	 Catch:{ all -> 0x0047 }
        monitor-enter(r7);	 Catch:{ all -> 0x0047 }
        r2 = r7.a;	 Catch:{ all -> 0x001e }
        r2 = r2.a();	 Catch:{ all -> 0x001e }
        if (r2 != 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r7.d = r8;	 Catch:{ all -> 0x001e }
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        r7.d = r8;
        return;
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        goto L_0x0021;	 Catch:{ all -> 0x001e }
        r0 = move-exception;	 Catch:{ all -> 0x001e }
        monitor-exit(r7);	 Catch:{ all -> 0x001e }
        throw r0;	 Catch:{ all -> 0x0047 }
        r3 = r7.c;	 Catch:{ all -> 0x0047 }
        r3.a(r2);	 Catch:{ all -> 0x0047 }
        r2 = android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0047 }
        r2 = r2 - r0;	 Catch:{ all -> 0x0047 }
        r4 = 10;	 Catch:{ all -> 0x0047 }
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x0047 }
        if (r6 < 0) goto L_0x0005;	 Catch:{ all -> 0x0047 }
        r0 = r7.obtainMessage();	 Catch:{ all -> 0x0047 }
        r0 = r7.sendMessage(r0);	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x003f;
        r8 = 1;
        r7.d = r8;
        return;
        r0 = new akql;	 Catch:{ all -> 0x0047 }
        r1 = "Could not send handler message";	 Catch:{ all -> 0x0047 }
        r0.<init>(r1);	 Catch:{ all -> 0x0047 }
        throw r0;	 Catch:{ all -> 0x0047 }
        r0 = move-exception;
        r7.d = r8;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqm.handleMessage(android.os.Message):void");
    }
}
