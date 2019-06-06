package com.snapchat.laguna.crypto;

import java.io.ByteArrayOutputStream;

public class Leb128 {
    private Leb128() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0025 in {5, 8, 9, 11} preds:[]
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
    public static int readUnsignedLeb128(byte[] r5) {
        /*
        if (r5 == 0) goto L_0x001d;
        r0 = 0;
        r1 = 0;
        r2 = r5[r0];
        r2 = r2 & 255;
        r3 = r2 & 127;
        r4 = r0 * 7;
        r3 = r3 << r4;
        r1 = r1 | r3;
        r0 = r0 + 1;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2 & r3;
        if (r2 != r3) goto L_0x0018;
        r4 = 5;
        if (r0 < r4) goto L_0x0004;
        if (r2 != r3) goto L_0x001c;
        r5 = -1;
        return r5;
        return r1;
        r5 = new java.lang.IllegalArgumentException;
        r0 = "null array is not supported";
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.laguna.crypto.Leb128.readUnsignedLeb128(byte[]):int");
    }

    public static byte[] serialize(byte[]... bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte[] bArr2 : bArr) {
            byte[] writeUnsignedLeb128 = writeUnsignedLeb128(bArr2.length);
            byteArrayOutputStream.write(writeUnsignedLeb128, 0, writeUnsignedLeb128.length);
            byteArrayOutputStream.write(bArr2, 0, bArr2.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x0026 in {3, 5, 7} preds:[]
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
    public static byte[] unserialize(byte[] r3, int r4) {
        /*
        if (r3 == 0) goto L_0x001e;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        if (r0 > r4) goto L_0x0018;
        r1 = r1 + r2;
        r2 = r3.length;
        r3 = java.util.Arrays.copyOfRange(r3, r1, r2);
        r2 = readUnsignedLeb128(r3);
        r1 = unsignedLeb128Size(r2);
        r0 = r0 + 1;
        goto L_0x0005;
        r2 = r2 + r1;
        r3 = java.util.Arrays.copyOfRange(r3, r1, r2);
        return r3;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "null array is not supported";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.laguna.crypto.Leb128.unserialize(byte[], int):byte[]");
    }

    public static int unsignedLeb128Size(int i) {
        i >>= 7;
        int i2 = 0;
        while (i != 0) {
            i >>= 7;
            i2++;
        }
        return i2 + 1;
    }

    public static byte[] writeUnsignedLeb128(int i) {
        int i2 = i >>> 7;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i3 = i2;
            i2 = i;
            i = i3;
            if (i != 0) {
                byteArrayOutputStream.write((byte) ((i2 & 127) | 128));
                i2 = i >>> 7;
            } else {
                byteArrayOutputStream.write((byte) (i2 & 127));
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
