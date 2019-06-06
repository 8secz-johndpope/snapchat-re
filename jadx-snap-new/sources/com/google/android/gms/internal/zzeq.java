package com.google.android.gms.internal;

public final class zzeq extends zzeu {
    public zzeq(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 48);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x003c in {4, 6, 8, 11} preds:[]
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
    protected final void zzaw() {
        /*
        r5 = this;
        r0 = r5.zzakm;
        r1 = 2;
        r1 = java.lang.Integer.valueOf(r1);
        r0.zzej = r1;
        r0 = r5.zzaku;
        r1 = 1;
        r2 = new java.lang.Object[r1];
        r3 = r5.zzagq;
        r3 = r3.getContext();
        r4 = 0;
        r2[r4] = r3;
        r3 = 0;
        r0 = r0.invoke(r3, r2);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r2 = r5.zzakm;
        monitor-enter(r2);
        if (r0 != r1) goto L_0x0030;
        r0 = r5.zzakm;	 Catch:{ all -> 0x0039 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0039 }
        r0.zzej = r1;	 Catch:{ all -> 0x0039 }
        goto L_0x0037;	 Catch:{ all -> 0x0039 }
        r0 = r5.zzakm;	 Catch:{ all -> 0x0039 }
        r1 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0039 }
        goto L_0x002d;	 Catch:{ all -> 0x0039 }
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        return;	 Catch:{ all -> 0x0039 }
        r0 = move-exception;	 Catch:{ all -> 0x0039 }
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzeq.zzaw():void");
    }
}
