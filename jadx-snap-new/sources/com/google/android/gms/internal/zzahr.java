package com.google.android.gms.internal;

@zzabh
public final class zzahr {
    private static final Object sLock = new Object();
    private static String zzdep;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x005b in {16, 17, 18, 19, 20, 24, 27} preds:[]
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
    public static java.lang.String zzc(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
        r0 = sLock;
        monitor-enter(r0);
        r1 = zzdep;	 Catch:{ all -> 0x0058 }
        if (r1 != 0) goto L_0x0054;	 Catch:{ all -> 0x0058 }
        r1 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x0058 }
        if (r1 != 0) goto L_0x0054;
        r1 = 3;
        r6 = r6.createPackageContext(r8, r1);	 Catch:{ Throwable -> 0x0051 }
        r6 = r6.getClassLoader();	 Catch:{ Throwable -> 0x0051 }
        r8 = "com.google.ads.mediation.MediationAdapter";	 Catch:{ Throwable -> 0x0051 }
        r1 = 0;	 Catch:{ Throwable -> 0x0051 }
        r8 = java.lang.Class.forName(r8, r1, r6);	 Catch:{ Throwable -> 0x0051 }
        r2 = new java.math.BigInteger;	 Catch:{ all -> 0x0058 }
        r3 = 1;	 Catch:{ all -> 0x0058 }
        r4 = new byte[r3];	 Catch:{ all -> 0x0058 }
        r2.<init>(r4);	 Catch:{ all -> 0x0058 }
        r4 = ",";	 Catch:{ all -> 0x0058 }
        r7 = r7.split(r4);	 Catch:{ all -> 0x0058 }
        r4 = r2;	 Catch:{ all -> 0x0058 }
        r2 = 0;	 Catch:{ all -> 0x0058 }
        r5 = r7.length;	 Catch:{ all -> 0x0058 }
        if (r2 >= r5) goto L_0x0042;	 Catch:{ all -> 0x0058 }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x0058 }
        r5 = r7[r2];	 Catch:{ all -> 0x0058 }
        r5 = com.google.android.gms.internal.zzaij.zza(r6, r8, r5);	 Catch:{ all -> 0x0058 }
        if (r5 == 0) goto L_0x003f;	 Catch:{ all -> 0x0058 }
        r4 = r4.setBit(r2);	 Catch:{ all -> 0x0058 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0058 }
        goto L_0x002d;	 Catch:{ all -> 0x0058 }
        r6 = java.util.Locale.US;	 Catch:{ all -> 0x0058 }
        r7 = "%X";	 Catch:{ all -> 0x0058 }
        r8 = new java.lang.Object[r3];	 Catch:{ all -> 0x0058 }
        r8[r1] = r4;	 Catch:{ all -> 0x0058 }
        r6 = java.lang.String.format(r6, r7, r8);	 Catch:{ all -> 0x0058 }
        zzdep = r6;	 Catch:{ all -> 0x0058 }
        goto L_0x0054;	 Catch:{ all -> 0x0058 }
        r6 = "err";	 Catch:{ all -> 0x0058 }
        goto L_0x004e;	 Catch:{ all -> 0x0058 }
        r6 = zzdep;	 Catch:{ all -> 0x0058 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return r6;	 Catch:{ all -> 0x0058 }
        r6 = move-exception;	 Catch:{ all -> 0x0058 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahr.zzc(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String zzqi() {
        String str;
        synchronized (sLock) {
            str = zzdep;
        }
        return str;
    }
}
