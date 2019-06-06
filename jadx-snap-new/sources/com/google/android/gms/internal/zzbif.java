package com.google.android.gms.internal;

import android.content.Context;

public final class zzbif {
    private static Context zzglq;
    private static Boolean zzglr;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0051 in {11, 16, 18, 21, 23, 26, 29} preds:[]
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
    public static synchronized boolean zzdb(android.content.Context r3) {
        /*
        r0 = com.google.android.gms.internal.zzbif.class;
        monitor-enter(r0);
        r1 = r3.getApplicationContext();	 Catch:{ all -> 0x004e }
        r2 = zzglq;	 Catch:{ all -> 0x004e }
        if (r2 == 0) goto L_0x001b;	 Catch:{ all -> 0x004e }
        r2 = zzglr;	 Catch:{ all -> 0x004e }
        if (r2 == 0) goto L_0x001b;	 Catch:{ all -> 0x004e }
        r2 = zzglq;	 Catch:{ all -> 0x004e }
        if (r2 != r1) goto L_0x001b;	 Catch:{ all -> 0x004e }
        r3 = zzglr;	 Catch:{ all -> 0x004e }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x004e }
        monitor-exit(r0);
        return r3;
        r2 = 0;
        zzglr = r2;	 Catch:{ all -> 0x004e }
        r2 = com.google.android.gms.common.util.zzs.isAtLeastO();	 Catch:{ all -> 0x004e }
        if (r2 == 0) goto L_0x0033;	 Catch:{ all -> 0x004e }
        r3 = r1.getPackageManager();	 Catch:{ all -> 0x004e }
        r3 = r3.isInstantApp();	 Catch:{ all -> 0x004e }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ all -> 0x004e }
        zzglr = r3;	 Catch:{ all -> 0x004e }
        goto L_0x0044;
        r3 = r3.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0041 }
        r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime";	 Catch:{ ClassNotFoundException -> 0x0041 }
        r3.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x0041 }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ ClassNotFoundException -> 0x0041 }
        zzglr = r3;	 Catch:{ ClassNotFoundException -> 0x0041 }
        goto L_0x0044;
    L_0x0041:
        r3 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x004e }
        goto L_0x0030;	 Catch:{ all -> 0x004e }
        zzglq = r1;	 Catch:{ all -> 0x004e }
        r3 = zzglr;	 Catch:{ all -> 0x004e }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x004e }
        monitor-exit(r0);
        return r3;
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbif.zzdb(android.content.Context):boolean");
    }
}
