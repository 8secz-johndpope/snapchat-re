package com.google.android.gms.common.api.internal;

abstract class zzbj {
    private final zzbh zzfzd;

    protected zzbj(zzbh zzbh) {
        this.zzfzd = zzbh;
    }

    public abstract void zzajj();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0024 in {5, 8, 11} preds:[]
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
    public final void zzc(com.google.android.gms.common.api.internal.zzbi r3) {
        /*
        r2 = this;
        r0 = r3.zzfwa;
        r0.lock();
        r0 = r3.zzfyz;	 Catch:{ all -> 0x001b }
        r1 = r2.zzfzd;	 Catch:{ all -> 0x001b }
        if (r0 == r1) goto L_0x0017;
        r3 = r3.zzfwa;
        r3.unlock();
        return;
        r2.zzajj();	 Catch:{ all -> 0x001b }
        goto L_0x000f;
        r0 = move-exception;
        r3 = r3.zzfwa;
        r3.unlock();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzbj.zzc(com.google.android.gms.common.api.internal.zzbi):void");
    }
}
