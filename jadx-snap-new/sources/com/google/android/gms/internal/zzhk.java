package com.google.android.gms.internal;

final class zzhk implements Runnable {
    private /* synthetic */ zzhj zzazc;

    zzhk(zzhj zzhj) {
        this.zzazc = zzhj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x004d in {13, 16, 17, 19, 22} preds:[]
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
        r0 = r5.zzazc;
        r0 = r0.mLock;
        monitor-enter(r0);
        r1 = r5.zzazc;	 Catch:{ all -> 0x004a }
        r1 = r1.zzayw;	 Catch:{ all -> 0x004a }
        if (r1 == 0) goto L_0x0043;	 Catch:{ all -> 0x004a }
        r1 = r5.zzazc;	 Catch:{ all -> 0x004a }
        r1 = r1.zzayx;	 Catch:{ all -> 0x004a }
        if (r1 == 0) goto L_0x0043;	 Catch:{ all -> 0x004a }
        r1 = r5.zzazc;	 Catch:{ all -> 0x004a }
        r2 = 0;	 Catch:{ all -> 0x004a }
        r1.zzayw = false;	 Catch:{ all -> 0x004a }
        r1 = "App went background";	 Catch:{ all -> 0x004a }
        com.google.android.gms.internal.zzaky.zzby(r1);	 Catch:{ all -> 0x004a }
        r1 = r5.zzazc;	 Catch:{ all -> 0x004a }
        r1 = r1.zzayy;	 Catch:{ all -> 0x004a }
        r1 = r1.iterator();	 Catch:{ all -> 0x004a }
        r3 = r1.hasNext();	 Catch:{ all -> 0x004a }
        if (r3 == 0) goto L_0x0048;	 Catch:{ all -> 0x004a }
        r3 = r1.next();	 Catch:{ all -> 0x004a }
        r3 = (com.google.android.gms.internal.zzhl) r3;	 Catch:{ all -> 0x004a }
        r3.zzh(r2);	 Catch:{ Exception -> 0x003c }
        goto L_0x002c;
        r3 = move-exception;
        r4 = "OnForegroundStateChangedListener threw exception.";	 Catch:{ all -> 0x004a }
        com.google.android.gms.internal.zzaky.zzb(r4, r3);	 Catch:{ all -> 0x004a }
        goto L_0x002c;	 Catch:{ all -> 0x004a }
        r1 = "App is still foreground";	 Catch:{ all -> 0x004a }
        com.google.android.gms.internal.zzaky.zzby(r1);	 Catch:{ all -> 0x004a }
        monitor-exit(r0);	 Catch:{ all -> 0x004a }
        return;	 Catch:{ all -> 0x004a }
        r1 = move-exception;	 Catch:{ all -> 0x004a }
        monitor-exit(r0);	 Catch:{ all -> 0x004a }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhk.run():void");
    }
}
