package com.google.android.gms.internal;

import java.security.MessageDigest;

@zzabh
public final class zzib extends zzhs {
    private MessageDigest zzbaj;
    private final int zzbam;
    private final int zzban;

    public zzib(int i) {
        int i2 = i / 8;
        if (i % 8 > 0) {
            i2++;
        }
        this.zzbam = i2;
        this.zzban = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x006f in {7, 10, 11, 18, 19, 22, 24, 27} preds:[]
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
    public final byte[] zzy(java.lang.String r9) {
        /*
        r8 = this;
        r0 = r8.mLock;
        monitor-enter(r0);
        r1 = r8.zzhh();	 Catch:{ all -> 0x006c }
        r8.zzbaj = r1;	 Catch:{ all -> 0x006c }
        r1 = r8.zzbaj;	 Catch:{ all -> 0x006c }
        r2 = 0;	 Catch:{ all -> 0x006c }
        if (r1 != 0) goto L_0x0012;	 Catch:{ all -> 0x006c }
        r9 = new byte[r2];	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        return r9;	 Catch:{ all -> 0x006c }
        r1 = r8.zzbaj;	 Catch:{ all -> 0x006c }
        r1.reset();	 Catch:{ all -> 0x006c }
        r1 = r8.zzbaj;	 Catch:{ all -> 0x006c }
        r3 = "UTF-8";	 Catch:{ all -> 0x006c }
        r3 = java.nio.charset.Charset.forName(r3);	 Catch:{ all -> 0x006c }
        r9 = r9.getBytes(r3);	 Catch:{ all -> 0x006c }
        r1.update(r9);	 Catch:{ all -> 0x006c }
        r9 = r8.zzbaj;	 Catch:{ all -> 0x006c }
        r9 = r9.digest();	 Catch:{ all -> 0x006c }
        r1 = r9.length;	 Catch:{ all -> 0x006c }
        r3 = r8.zzbam;	 Catch:{ all -> 0x006c }
        if (r1 <= r3) goto L_0x0034;	 Catch:{ all -> 0x006c }
        r1 = r8.zzbam;	 Catch:{ all -> 0x006c }
        goto L_0x0035;	 Catch:{ all -> 0x006c }
        r1 = r9.length;	 Catch:{ all -> 0x006c }
        r1 = new byte[r1];	 Catch:{ all -> 0x006c }
        r3 = r1.length;	 Catch:{ all -> 0x006c }
        java.lang.System.arraycopy(r9, r2, r1, r2, r3);	 Catch:{ all -> 0x006c }
        r9 = r8.zzban;	 Catch:{ all -> 0x006c }
        r3 = 8;	 Catch:{ all -> 0x006c }
        r9 = r9 % r3;	 Catch:{ all -> 0x006c }
        if (r9 <= 0) goto L_0x006a;	 Catch:{ all -> 0x006c }
        r4 = 0;	 Catch:{ all -> 0x006c }
        r9 = r1.length;	 Catch:{ all -> 0x006c }
        if (r2 >= r9) goto L_0x0053;	 Catch:{ all -> 0x006c }
        if (r2 <= 0) goto L_0x004a;	 Catch:{ all -> 0x006c }
        r4 = r4 << r3;	 Catch:{ all -> 0x006c }
        r9 = r1[r2];	 Catch:{ all -> 0x006c }
        r9 = r9 & 255;	 Catch:{ all -> 0x006c }
        r6 = (long) r9;	 Catch:{ all -> 0x006c }
        r4 = r4 + r6;	 Catch:{ all -> 0x006c }
        r2 = r2 + 1;	 Catch:{ all -> 0x006c }
        goto L_0x0044;	 Catch:{ all -> 0x006c }
        r9 = r8.zzban;	 Catch:{ all -> 0x006c }
        r9 = r9 % r3;	 Catch:{ all -> 0x006c }
        r9 = 8 - r9;	 Catch:{ all -> 0x006c }
        r4 = r4 >>> r9;	 Catch:{ all -> 0x006c }
        r9 = r8.zzbam;	 Catch:{ all -> 0x006c }
        r9 = r9 + -1;	 Catch:{ all -> 0x006c }
        if (r9 < 0) goto L_0x006a;	 Catch:{ all -> 0x006c }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ all -> 0x006c }
        r6 = r6 & r4;	 Catch:{ all -> 0x006c }
        r2 = (int) r6;	 Catch:{ all -> 0x006c }
        r2 = (byte) r2;	 Catch:{ all -> 0x006c }
        r1[r9] = r2;	 Catch:{ all -> 0x006c }
        r4 = r4 >>> r3;	 Catch:{ all -> 0x006c }
        r9 = r9 + -1;	 Catch:{ all -> 0x006c }
        goto L_0x005d;	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        return r1;	 Catch:{ all -> 0x006c }
        r9 = move-exception;	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzib.zzy(java.lang.String):byte[]");
    }
}
