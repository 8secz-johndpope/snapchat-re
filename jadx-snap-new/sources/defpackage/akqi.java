package defpackage;

/* renamed from: akqi */
final class akqi implements Runnable {
    private final akqp a = new akqp();
    private final akqj b;
    private volatile boolean c;

    akqi(akqj akqj) {
        this.b = akqj;
    }

    public final void a(akqu akqu, Object obj) {
        akqo a = akqo.a(akqu, obj);
        synchronized (this) {
            this.a.a(a);
            if (!this.c) {
                this.c = true;
                this.b.b.execute(this);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x004a in {11, 14, 18, 20, 27, 29} preds:[]
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
    public final void run() {
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.a;	 Catch:{ InterruptedException -> 0x0025 }
        r1 = r1.b();	 Catch:{ InterruptedException -> 0x0025 }
        if (r1 != 0) goto L_0x001d;	 Catch:{ InterruptedException -> 0x0025 }
        monitor-enter(r5);	 Catch:{ InterruptedException -> 0x0025 }
        r1 = r5.a;	 Catch:{ all -> 0x001a }
        r1 = r1.a();	 Catch:{ all -> 0x001a }
        if (r1 != 0) goto L_0x0018;	 Catch:{ all -> 0x001a }
        r5.c = r0;	 Catch:{ all -> 0x001a }
        monitor-exit(r5);	 Catch:{ all -> 0x001a }
        r5.c = r0;
        return;
        monitor-exit(r5);	 Catch:{ all -> 0x001a }
        goto L_0x001d;	 Catch:{ all -> 0x001a }
        r1 = move-exception;	 Catch:{ all -> 0x001a }
        monitor-exit(r5);	 Catch:{ all -> 0x001a }
        throw r1;	 Catch:{ InterruptedException -> 0x0025 }
        r2 = r5.b;	 Catch:{ InterruptedException -> 0x0025 }
        r2.a(r1);	 Catch:{ InterruptedException -> 0x0025 }
        goto L_0x0000;
        r1 = move-exception;
        goto L_0x0047;
        r1 = move-exception;
        r2 = "Event";	 Catch:{ all -> 0x0023 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0023 }
        r3.<init>();	 Catch:{ all -> 0x0023 }
        r4 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0023 }
        r4 = r4.getName();	 Catch:{ all -> 0x0023 }
        r3.append(r4);	 Catch:{ all -> 0x0023 }
        r4 = " was interruppted";	 Catch:{ all -> 0x0023 }
        r3.append(r4);	 Catch:{ all -> 0x0023 }
        r3 = r3.toString();	 Catch:{ all -> 0x0023 }
        android.util.Log.w(r2, r3, r1);	 Catch:{ all -> 0x0023 }
        r5.c = r0;
        return;
        r5.c = r0;
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqi.run():void");
    }
}
