package com.google.android.gms.internal;

final class zzah extends zzai {
    private final zzar zzbo;

    zzah(zzar zzar) {
        this.zzbo = zzar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0086 in {4, 8, 12, 14, 17} preds:[]
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
    public final com.google.android.gms.internal.zzaq zza(com.google.android.gms.internal.zzr<?> r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
        r7 = this;
        r0 = r7.zzbo;	 Catch:{ ConnectTimeoutException -> 0x007b }
        r8 = r0.zzb(r8, r9);	 Catch:{ ConnectTimeoutException -> 0x007b }
        r9 = r8.getStatusLine();
        r9 = r9.getStatusCode();
        r0 = r8.getAllHeaders();
        r1 = new java.util.ArrayList;
        r2 = r0.length;
        r1.<init>(r2);
        r2 = r0.length;
        r3 = 0;
        if (r3 >= r2) goto L_0x0031;
        r4 = r0[r3];
        r5 = new com.google.android.gms.internal.zzl;
        r6 = r4.getName();
        r4 = r4.getValue();
        r5.<init>(r6, r4);
        r1.add(r5);
        r3 = r3 + 1;
        goto L_0x001a;
        r0 = r8.getEntity();
        if (r0 != 0) goto L_0x003d;
        r8 = new com.google.android.gms.internal.zzaq;
        r8.<init>(r9, r1);
        return r8;
        r0 = r8.getEntity();
        r2 = r0.getContentLength();
        r0 = (int) r2;
        r4 = (long) r0;
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0062;
        r0 = new com.google.android.gms.internal.zzaq;
        r2 = r8.getEntity();
        r2 = r2.getContentLength();
        r3 = (int) r2;
        r8 = r8.getEntity();
        r8 = r8.getContent();
        r0.<init>(r9, r1, r3, r8);
        return r0;
        r8 = new java.io.IOException;
        r9 = 40;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r9);
        r9 = "Response too large: ";
        r0.append(r9);
        r0.append(r2);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
        r8 = move-exception;
        r9 = new java.net.SocketTimeoutException;
        r8 = r8.getMessage();
        r9.<init>(r8);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzah.zza(com.google.android.gms.internal.zzr, java.util.Map):com.google.android.gms.internal.zzaq");
    }
}
