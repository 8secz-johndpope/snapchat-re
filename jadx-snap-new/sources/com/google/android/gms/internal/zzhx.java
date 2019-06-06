package com.google.android.gms.internal;

import java.security.MessageDigest;

@zzabh
public final class zzhx extends zzhs {
    private MessageDigest zzbaj;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00a9 in {2, 8, 12, 20, 23, 24, 27, 30} preds:[]
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
    public final byte[] zzy(java.lang.String r9) {
        /*
        r8 = this;
        r0 = " ";
        r9 = r9.split(r0);
        r0 = r9.length;
        r1 = 4;
        r2 = 0;
        r3 = 1;
        if (r0 != r3) goto L_0x0024;
        r9 = r9[r2];
        r9 = com.google.android.gms.internal.zzhw.zzaa(r9);
        r0 = java.nio.ByteBuffer.allocate(r1);
        r3 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0.order(r3);
        r0.putInt(r9);
        r9 = r0.array();
        r0 = r9;
        goto L_0x0078;
        r0 = r9.length;
        r4 = 5;
        if (r0 >= r4) goto L_0x0056;
        r0 = r9.length;
        r0 = r0 << r3;
        r0 = new byte[r0];
        r4 = 0;
        r5 = r9.length;
        if (r4 >= r5) goto L_0x0078;
        r5 = r9[r4];
        r5 = com.google.android.gms.internal.zzhw.zzaa(r5);
        r6 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r6 & r5;
        r5 = r5 >> 16;
        r5 = r5 ^ r6;
        r6 = 2;
        r6 = new byte[r6];
        r7 = (byte) r5;
        r6[r2] = r7;
        r5 = r5 >> 8;
        r5 = (byte) r5;
        r6[r3] = r5;
        r5 = r4 << 1;
        r7 = r6[r2];
        r0[r5] = r7;
        r5 = r5 + r3;
        r6 = r6[r3];
        r0[r5] = r6;
        r4 = r4 + 1;
        goto L_0x002d;
        r0 = r9.length;
        r0 = new byte[r0];
        r3 = 0;
        r4 = r9.length;
        if (r3 >= r4) goto L_0x0078;
        r4 = r9[r3];
        r4 = com.google.android.gms.internal.zzhw.zzaa(r4);
        r5 = r4 & 255;
        r6 = r4 >> 8;
        r6 = r6 & 255;
        r5 = r5 ^ r6;
        r6 = r4 >> 16;
        r6 = r6 & 255;
        r5 = r5 ^ r6;
        r4 = r4 >> 24;
        r4 = r4 ^ r5;
        r4 = (byte) r4;
        r0[r3] = r4;
        r3 = r3 + 1;
        goto L_0x005a;
        r9 = r8.zzhh();
        r8.zzbaj = r9;
        r9 = r8.mLock;
        monitor-enter(r9);
        r3 = r8.zzbaj;	 Catch:{ all -> 0x00a6 }
        if (r3 != 0) goto L_0x0089;	 Catch:{ all -> 0x00a6 }
        r0 = new byte[r2];	 Catch:{ all -> 0x00a6 }
        monitor-exit(r9);	 Catch:{ all -> 0x00a6 }
        return r0;	 Catch:{ all -> 0x00a6 }
        r3 = r8.zzbaj;	 Catch:{ all -> 0x00a6 }
        r3.reset();	 Catch:{ all -> 0x00a6 }
        r3 = r8.zzbaj;	 Catch:{ all -> 0x00a6 }
        r3.update(r0);	 Catch:{ all -> 0x00a6 }
        r0 = r8.zzbaj;	 Catch:{ all -> 0x00a6 }
        r0 = r0.digest();	 Catch:{ all -> 0x00a6 }
        r3 = r0.length;	 Catch:{ all -> 0x00a6 }
        if (r3 <= r1) goto L_0x009d;	 Catch:{ all -> 0x00a6 }
        goto L_0x009e;	 Catch:{ all -> 0x00a6 }
        r1 = r0.length;	 Catch:{ all -> 0x00a6 }
        r1 = new byte[r1];	 Catch:{ all -> 0x00a6 }
        r3 = r1.length;	 Catch:{ all -> 0x00a6 }
        java.lang.System.arraycopy(r0, r2, r1, r2, r3);	 Catch:{ all -> 0x00a6 }
        monitor-exit(r9);	 Catch:{ all -> 0x00a6 }
        return r1;	 Catch:{ all -> 0x00a6 }
        r0 = move-exception;	 Catch:{ all -> 0x00a6 }
        monitor-exit(r9);	 Catch:{ all -> 0x00a6 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhx.zzy(java.lang.String):byte[]");
    }
}
