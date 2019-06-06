package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

public final class zzdxi {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0030 in {9, 10, 12} preds:[]
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
    public static final void zza(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, int r6) {
        /*
        if (r6 < 0) goto L_0x0028;
        r0 = r4.remaining();
        if (r0 < r6) goto L_0x0028;
        r0 = r5.remaining();
        if (r0 < r6) goto L_0x0028;
        r0 = r3.remaining();
        if (r0 < r6) goto L_0x0028;
        r0 = 0;
        if (r0 >= r6) goto L_0x0027;
        r1 = r4.get();
        r2 = r5.get();
        r1 = r1 ^ r2;
        r1 = (byte) r1;
        r3.put(r1);
        r0 = r0 + 1;
        goto L_0x0015;
        return;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses.";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdxi.zza(java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int):void");
    }

    public static byte[] zzc(byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (i2 <= Integer.MAX_VALUE - bArr2.length) {
                i2 += bArr2.length;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (Object obj : bArr) {
            System.arraycopy(obj, 0, bArr3, i3, obj.length);
            i3 += obj.length;
        }
        return bArr3;
    }
}
