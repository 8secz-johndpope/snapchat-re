package com.google.android.gms.internal;

final class zzdyu extends zzdyr {
    private final zzdys zzmml = new zzdys();

    zzdyu() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002c in {2, 8, 10, 13} preds:[]
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
    public final void zza(java.lang.Throwable r4, java.io.PrintWriter r5) {
        /*
        r3 = this;
        r4.printStackTrace(r5);
        r0 = r3.zzmml;
        r1 = 0;
        r4 = r0.zza(r4, r1);
        if (r4 != 0) goto L_0x000d;
        return;
        monitor-enter(r4);
        r0 = r4.iterator();	 Catch:{ all -> 0x0029 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0029 }
        if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x0029 }
        r1 = r0.next();	 Catch:{ all -> 0x0029 }
        r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x0029 }
        r2 = "Suppressed: ";	 Catch:{ all -> 0x0029 }
        r5.print(r2);	 Catch:{ all -> 0x0029 }
        r1.printStackTrace(r5);	 Catch:{ all -> 0x0029 }
        goto L_0x0012;	 Catch:{ all -> 0x0029 }
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        return;	 Catch:{ all -> 0x0029 }
        r5 = move-exception;	 Catch:{ all -> 0x0029 }
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdyu.zza(java.lang.Throwable, java.io.PrintWriter):void");
    }
}
