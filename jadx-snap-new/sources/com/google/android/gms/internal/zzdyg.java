package com.google.android.gms.internal;

public final class zzdyg {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0068 in {5, 6, 7, 11, 13, 15} preds:[]
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
    public static byte[] zza(java.lang.String r4, byte[] r5, byte[] r6, byte[] r7, int r8) {
        /*
        r0 = com.google.android.gms.internal.zzdxx.zzmll;
        r0 = r0.zzoy(r4);
        r0 = (javax.crypto.Mac) r0;
        r1 = r0.getMacLength();
        r1 = r1 * 255;
        if (r8 > r1) goto L_0x0060;
        if (r6 == 0) goto L_0x001f;
        r1 = r6.length;
        if (r1 != 0) goto L_0x0016;
        goto L_0x001f;
        r1 = new javax.crypto.spec.SecretKeySpec;
        r1.<init>(r6, r4);
        r0.init(r1);
        goto L_0x002d;
        r6 = new javax.crypto.spec.SecretKeySpec;
        r1 = r0.getMacLength();
        r1 = new byte[r1];
        r6.<init>(r1, r4);
        r0.init(r6);
        r5 = r0.doFinal(r5);
        r6 = new byte[r8];
        r1 = new javax.crypto.spec.SecretKeySpec;
        r1.<init>(r5, r4);
        r0.init(r1);
        r4 = 0;
        r5 = new byte[r4];
        r1 = 1;
        r2 = 0;
        r0.update(r5);
        r0.update(r7);
        r5 = (byte) r1;
        r0.update(r5);
        r5 = r0.doFinal();
        r3 = r5.length;
        r3 = r3 + r2;
        if (r3 >= r8) goto L_0x005b;
        r3 = r5.length;
        java.lang.System.arraycopy(r5, r4, r6, r2, r3);
        r3 = r5.length;
        r2 = r2 + r3;
        r1 = r1 + 1;
        goto L_0x0040;
        r8 = r8 - r2;
        java.lang.System.arraycopy(r5, r4, r6, r2, r8);
        return r6;
        r4 = new java.security.GeneralSecurityException;
        r5 = "size too large";
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdyg.zza(java.lang.String, byte[], byte[], byte[], int):byte[]");
    }
}
