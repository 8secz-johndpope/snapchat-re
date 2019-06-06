package com.google.protobuf;

import java.lang.ref.SoftReference;

final class ByteBufferWriter {
    private static final ThreadLocal<SoftReference<byte[]>> BUFFER = new ThreadLocal();
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    private ByteBufferWriter() {
    }

    static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    private static byte[] getBuffer() {
        SoftReference softReference = (SoftReference) BUFFER.get();
        return softReference == null ? null : (byte[]) softReference.get();
    }

    private static byte[] getOrCreateBuffer(int i) {
        i = Math.max(i, 1024);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(i, buffer.length)) {
            buffer = new byte[i];
            if (i <= MAX_CACHED_BUFFER_SIZE) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    private static boolean needToReallocate(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * BUFFER_REALLOCATION_THRESHOLD;
    }

    private static void setBuffer(byte[] bArr) {
        BUFFER.set(new SoftReference(bArr));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0055 in {4, 7, 12, 14, 17} preds:[]
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
    static void write(java.nio.ByteBuffer r4, java.io.OutputStream r5) {
        /*
        r0 = r4.position();
        r1 = r4.hasArray();	 Catch:{ all -> 0x0050 }
        if (r1 == 0) goto L_0x001f;	 Catch:{ all -> 0x0050 }
        r1 = r4.array();	 Catch:{ all -> 0x0050 }
        r2 = r4.arrayOffset();	 Catch:{ all -> 0x0050 }
        r3 = r4.position();	 Catch:{ all -> 0x0050 }
        r2 = r2 + r3;	 Catch:{ all -> 0x0050 }
        r3 = r4.remaining();	 Catch:{ all -> 0x0050 }
        r5.write(r1, r2, r3);	 Catch:{ all -> 0x0050 }
        goto L_0x004c;	 Catch:{ all -> 0x0050 }
        r1 = r5 instanceof java.io.FileOutputStream;	 Catch:{ all -> 0x0050 }
        if (r1 == 0) goto L_0x002d;	 Catch:{ all -> 0x0050 }
        r5 = (java.io.FileOutputStream) r5;	 Catch:{ all -> 0x0050 }
        r5 = r5.getChannel();	 Catch:{ all -> 0x0050 }
        r5.write(r4);	 Catch:{ all -> 0x0050 }
        goto L_0x004c;	 Catch:{ all -> 0x0050 }
        r1 = r4.remaining();	 Catch:{ all -> 0x0050 }
        r1 = getOrCreateBuffer(r1);	 Catch:{ all -> 0x0050 }
        r2 = r4.hasRemaining();	 Catch:{ all -> 0x0050 }
        if (r2 == 0) goto L_0x004c;	 Catch:{ all -> 0x0050 }
        r2 = r4.remaining();	 Catch:{ all -> 0x0050 }
        r3 = r1.length;	 Catch:{ all -> 0x0050 }
        r2 = java.lang.Math.min(r2, r3);	 Catch:{ all -> 0x0050 }
        r3 = 0;	 Catch:{ all -> 0x0050 }
        r4.get(r1, r3, r2);	 Catch:{ all -> 0x0050 }
        r5.write(r1, r3, r2);	 Catch:{ all -> 0x0050 }
        goto L_0x0035;
        r4.position(r0);
        return;
        r5 = move-exception;
        r4.position(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ByteBufferWriter.write(java.nio.ByteBuffer, java.io.OutputStream):void");
    }
}
