package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.opencv.imgproc.Imgproc;

public final class zzp {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long zza(InputStream inputStream, OutputStream outputStream, boolean z) {
        return zza(inputStream, outputStream, z, Imgproc.INTER_TAB_SIZE2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0025 in {6, 8, 9, 12, 13} preds:[]
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
    public static long zza(java.io.InputStream r7, java.io.OutputStream r8, boolean r9, int r10) {
        /*
        r0 = new byte[r10];
        r1 = 0;
        r3 = 0;
        r4 = r7.read(r0, r3, r10);	 Catch:{ all -> 0x001b }
        r5 = -1;	 Catch:{ all -> 0x001b }
        if (r4 == r5) goto L_0x0012;	 Catch:{ all -> 0x001b }
        r5 = (long) r4;	 Catch:{ all -> 0x001b }
        r1 = r1 + r5;	 Catch:{ all -> 0x001b }
        r8.write(r0, r3, r4);	 Catch:{ all -> 0x001b }
        goto L_0x0004;
        if (r9 == 0) goto L_0x001a;
        closeQuietly(r7);
        closeQuietly(r8);
        return r1;
        r10 = move-exception;
        if (r9 == 0) goto L_0x0024;
        closeQuietly(r7);
        closeQuietly(r8);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.zzp.zza(java.io.InputStream, java.io.OutputStream, boolean, int):long");
    }

    public static byte[] zza(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zza(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
