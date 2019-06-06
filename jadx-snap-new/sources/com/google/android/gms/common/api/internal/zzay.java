package com.google.android.gms.common.api.internal;

abstract class zzay implements Runnable {
    private /* synthetic */ zzao zzfxt;

    private zzay(zzao zzao) {
        this.zzfxt = zzao;
    }

    /* synthetic */ zzay(zzao zzao, zzap zzap) {
        this(zzao);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0034 in {5, 8, 14, 16} preds:[]
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
    public void run() {
        /*
        r2 = this;
        r0 = r2.zzfxt;
        r0 = r0.zzfwa;
        r0.lock();
        r0 = java.lang.Thread.interrupted();	 Catch:{ RuntimeException -> 0x001f }
        if (r0 == 0) goto L_0x0019;
        r0 = r2.zzfxt;
        r0 = r0.zzfwa;
        r0.unlock();
        return;
        r2.zzajj();	 Catch:{ RuntimeException -> 0x001f }
        goto L_0x000f;
        r0 = move-exception;
        goto L_0x002a;
        r0 = move-exception;
        r1 = r2.zzfxt;	 Catch:{ all -> 0x001d }
        r1 = r1.zzfxd;	 Catch:{ all -> 0x001d }
        r1.zzb(r0);	 Catch:{ all -> 0x001d }
        goto L_0x000f;
        r1 = r2.zzfxt;
        r1 = r1.zzfwa;
        r1.unlock();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzay.run():void");
    }

    public abstract void zzajj();
}
