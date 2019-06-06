package com.google.protobuf;

import com.google.protobuf.MessageLite.Builder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class CodedInputStream {
    private static final int BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 100;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit = Integer.MAX_VALUE;
    private boolean enableAliasing = false;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit = 100;
    private RefillCallback refillCallback = null;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;
    private int totalBytesRetired;

    interface RefillCallback {
        void onRefill();
    }

    class SkippedDataSink implements RefillCallback {
        private ByteArrayOutputStream byteArrayStream;
        private int lastPos = CodedInputStream.this.bufferPos;

        private SkippedDataSink() {
        }

        /* Access modifiers changed, original: 0000 */
        public ByteBuffer getSkippedData() {
            ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
            if (byteArrayOutputStream == null) {
                return ByteBuffer.wrap(CodedInputStream.this.buffer, this.lastPos, CodedInputStream.this.bufferPos - this.lastPos);
            }
            byteArrayOutputStream.write(CodedInputStream.this.buffer, this.lastPos, CodedInputStream.this.bufferPos);
            return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
        }

        public void onRefill() {
            if (this.byteArrayStream == null) {
                this.byteArrayStream = new ByteArrayOutputStream();
            }
            this.byteArrayStream.write(CodedInputStream.this.buffer, this.lastPos, CodedInputStream.this.bufferPos - this.lastPos);
            this.lastPos = 0;
        }
    }

    private CodedInputStream(InputStream inputStream, int i) {
        this.buffer = new byte[i];
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    private CodedInputStream(byte[] bArr, int i, int i2, boolean z) {
        this.buffer = bArr;
        this.bufferSize = i2 + i;
        this.bufferPos = i;
        this.totalBytesRetired = -i;
        this.input = null;
        this.bufferIsImmutable = z;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream, 4096);
    }

    static CodedInputStream newInstance(InputStream inputStream, int i) {
        return new CodedInputStream(inputStream, i);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        byteBuffer = byteBuffer.duplicate();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return newInstance(bArr);
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    static CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
        CodedInputStream codedInputStream = new CodedInputStream(bArr, i, i2, z);
        try {
            codedInputStream.pushLimit(i2);
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:47:0x00b9 in {3, 5, 16, 24, 26, 27, 31, 32, 37, 39, 40, 42, 44, 46} preds:[]
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
    private byte[] readRawBytesSlowPath(int r12) {
        /*
        r11 = this;
        if (r12 > 0) goto L_0x000c;
        if (r12 != 0) goto L_0x0007;
        r12 = com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
        return r12;
        r12 = com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        throw r12;
        r0 = r11.totalBytesRetired;
        r1 = r11.bufferPos;
        r2 = r0 + r1;
        r2 = r2 + r12;
        r3 = r11.sizeLimit;
        if (r2 > r3) goto L_0x00b4;
        r3 = r11.currentLimit;
        if (r2 > r3) goto L_0x00aa;
        r2 = r11.input;
        if (r2 == 0) goto L_0x00a5;
        r3 = r11.bufferSize;
        r4 = r3 - r1;
        r0 = r0 + r3;
        r11.totalBytesRetired = r0;
        r0 = 0;
        r11.bufferPos = r0;
        r11.bufferSize = r0;
        r3 = r12 - r4;
        r5 = -1;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r3 < r6) goto L_0x0085;
        r2 = r2.available();
        if (r3 > r2) goto L_0x0039;
        goto L_0x0085;
        r2 = new java.util.ArrayList;
        r2.<init>();
        if (r3 <= 0) goto L_0x0066;
        r7 = java.lang.Math.min(r3, r6);
        r7 = new byte[r7];
        r8 = 0;
        r9 = r7.length;
        if (r8 >= r9) goto L_0x0060;
        r9 = r11.input;
        r10 = r7.length;
        r10 = r10 - r8;
        r9 = r9.read(r7, r8, r10);
        if (r9 == r5) goto L_0x005b;
        r10 = r11.totalBytesRetired;
        r10 = r10 + r9;
        r11.totalBytesRetired = r10;
        r8 = r8 + r9;
        goto L_0x0047;
        r12 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        throw r12;
        r8 = r7.length;
        r3 = r3 - r8;
        r2.add(r7);
        goto L_0x003e;
        r12 = new byte[r12];
        r3 = r11.buffer;
        java.lang.System.arraycopy(r3, r1, r12, r0, r4);
        r1 = r2.iterator();
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0084;
        r2 = r1.next();
        r2 = (byte[]) r2;
        r3 = r2.length;
        java.lang.System.arraycopy(r2, r0, r12, r4, r3);
        r2 = r2.length;
        r4 = r4 + r2;
        goto L_0x0071;
        return r12;
        r2 = new byte[r12];
        r3 = r11.buffer;
        java.lang.System.arraycopy(r3, r1, r2, r0, r4);
        if (r4 >= r12) goto L_0x00a4;
        r0 = r11.input;
        r1 = r12 - r4;
        r0 = r0.read(r2, r4, r1);
        if (r0 == r5) goto L_0x009f;
        r1 = r11.totalBytesRetired;
        r1 = r1 + r0;
        r11.totalBytesRetired = r1;
        r4 = r4 + r0;
        goto L_0x008c;
        r12 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        throw r12;
        return r2;
        r12 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        throw r12;
        r3 = r3 - r0;
        r3 = r3 - r1;
        r11.skipRawBytes(r3);
        r12 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        throw r12;
        r12 = com.google.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.readRawBytesSlowPath(int):byte[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0040 in {2, 10, 11, 13, 20, 21, 23, 25} preds:[]
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
    public static int readRawVarint32(int r3, java.io.InputStream r4) {
        /*
        r0 = r3 & 128;
        if (r0 != 0) goto L_0x0005;
        return r3;
        r3 = r3 & 127;
        r0 = 7;
        r1 = 32;
        r2 = -1;
        if (r0 >= r1) goto L_0x0024;
        r1 = r4.read();
        if (r1 == r2) goto L_0x001f;
        r2 = r1 & 127;
        r2 = r2 << r0;
        r3 = r3 | r2;
        r1 = r1 & 128;
        if (r1 != 0) goto L_0x001c;
        return r3;
        r0 = r0 + 7;
        goto L_0x0008;
        r3 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        throw r3;
        r1 = 64;
        if (r0 >= r1) goto L_0x003b;
        r1 = r4.read();
        if (r1 == r2) goto L_0x0036;
        r1 = r1 & 128;
        if (r1 != 0) goto L_0x0033;
        return r3;
        r0 = r0 + 7;
        goto L_0x0024;
        r3 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        throw r3;
        r3 = com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.readRawVarint32(int, java.io.InputStream):int");
    }

    static int readRawVarint32(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private void recomputeBufferSizeAfterLimit() {
        this.bufferSize += this.bufferSizeAfterLimit;
        int i = this.totalBytesRetired;
        int i2 = this.bufferSize;
        i += i2;
        int i3 = this.currentLimit;
        if (i > i3) {
            this.bufferSizeAfterLimit = i - i3;
            this.bufferSize = i2 - this.bufferSizeAfterLimit;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private void refillBuffer(int i) {
        if (!tryRefillBuffer(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0033 in {6, 8, 10, 12} preds:[]
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
    private void skipRawBytesSlowPath(int r5) {
        /*
        r4 = this;
        if (r5 < 0) goto L_0x002e;
        r0 = r4.totalBytesRetired;
        r1 = r4.bufferPos;
        r2 = r0 + r1;
        r2 = r2 + r5;
        r3 = r4.currentLimit;
        if (r2 > r3) goto L_0x0024;
        r0 = r4.bufferSize;
        r1 = r0 - r1;
        r4.bufferPos = r0;
        r0 = 1;
        r4.refillBuffer(r0);
        r2 = r5 - r1;
        r3 = r4.bufferSize;
        if (r2 <= r3) goto L_0x0021;
        r1 = r1 + r3;
        r4.bufferPos = r3;
        goto L_0x0014;
        r4.bufferPos = r2;
        return;
        r3 = r3 - r0;
        r3 = r3 - r1;
        r4.skipRawBytes(r3);
        r5 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        throw r5;
        r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.skipRawBytesSlowPath(int):void");
    }

    private void skipRawVarint() {
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (i - i2 >= 10) {
            byte[] bArr = this.buffer;
            int i3 = 0;
            while (i3 < 10) {
                int i4 = i2 + 1;
                if (bArr[i2] >= (byte) 0) {
                    this.bufferPos = i4;
                    return;
                } else {
                    i3++;
                    i2 = i4;
                }
            }
        }
        skipRawVarintSlowPath();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0014 in {5, 6, 8} preds:[]
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
    private void skipRawVarintSlowPath() {
        /*
        r2 = this;
        r0 = 0;
        r1 = 10;
        if (r0 >= r1) goto L_0x000f;
        r1 = r2.readRawByte();
        if (r1 < 0) goto L_0x000c;
        return;
        r0 = r0 + 1;
        goto L_0x0001;
        r0 = com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.skipRawVarintSlowPath():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x009d in {4, 7, 14, 15, 28, 30, 32, 33, 35} preds:[]
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
    private boolean tryRefillBuffer(int r6) {
        /*
        r5 = this;
        r0 = r5.bufferPos;
        r1 = r0 + r6;
        r2 = r5.bufferSize;
        if (r1 <= r2) goto L_0x0084;
        r1 = r5.totalBytesRetired;
        r1 = r1 + r0;
        r1 = r1 + r6;
        r0 = r5.currentLimit;
        r2 = 0;
        if (r1 <= r0) goto L_0x0012;
        return r2;
        r0 = r5.refillCallback;
        if (r0 == 0) goto L_0x0019;
        r0.onRefill();
        r0 = r5.input;
        if (r0 == 0) goto L_0x0083;
        r0 = r5.bufferPos;
        if (r0 <= 0) goto L_0x0037;
        r1 = r5.bufferSize;
        if (r1 <= r0) goto L_0x002b;
        r3 = r5.buffer;
        r1 = r1 - r0;
        java.lang.System.arraycopy(r3, r0, r3, r2, r1);
        r1 = r5.totalBytesRetired;
        r1 = r1 + r0;
        r5.totalBytesRetired = r1;
        r1 = r5.bufferSize;
        r1 = r1 - r0;
        r5.bufferSize = r1;
        r5.bufferPos = r2;
        r0 = r5.input;
        r1 = r5.buffer;
        r3 = r5.bufferSize;
        r4 = r1.length;
        r4 = r4 - r3;
        r0 = r0.read(r1, r3, r4);
        if (r0 == 0) goto L_0x006a;
        r1 = -1;
        if (r0 < r1) goto L_0x006a;
        r1 = r5.buffer;
        r1 = r1.length;
        if (r0 > r1) goto L_0x006a;
        if (r0 <= 0) goto L_0x0083;
        r1 = r5.bufferSize;
        r1 = r1 + r0;
        r5.bufferSize = r1;
        r0 = r5.totalBytesRetired;
        r0 = r0 + r6;
        r1 = r5.sizeLimit;
        r0 = r0 - r1;
        if (r0 > 0) goto L_0x0065;
        r5.recomputeBufferSizeAfterLimit();
        r0 = r5.bufferSize;
        if (r0 < r6) goto L_0x0000;
        r6 = 1;
        return r6;
        r6 = com.google.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
        throw r6;
        r6 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "InputStream#read(byte[]) returned invalid result: ";
        r1.<init>(r2);
        r1.append(r0);
        r0 = "\nThe InputStream implementation is buggy.";
        r1.append(r0);
        r0 = r1.toString();
        r6.<init>(r0);
        throw r6;
        return r2;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "refillBuffer() called when ";
        r1.<init>(r2);
        r1.append(r6);
        r6 = " bytes were already available in buffer";
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.tryRefillBuffer(int):boolean");
    }

    public final void checkLastTagWas(int i) {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void enableAliasing(boolean z) {
        this.enableAliasing = z;
    }

    public final int getBytesUntilLimit() {
        int i = this.currentLimit;
        return i == Integer.MAX_VALUE ? -1 : i - (this.totalBytesRetired + this.bufferPos);
    }

    public final int getLastTag() {
        return this.lastTag;
    }

    public final int getTotalBytesRead() {
        return this.totalBytesRetired + this.bufferPos;
    }

    public final boolean isAtEnd() {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public final void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public final int pushLimit(int i) {
        if (i >= 0) {
            i += this.totalBytesRetired + this.bufferPos;
            int i2 = this.currentLimit;
            if (i <= i2) {
                this.currentLimit = i;
                recomputeBufferSizeAfterLimit();
                return i2;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    public final byte[] readByteArray() {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return readRawBytesSlowPath(readRawVarint32);
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32);
        this.bufferPos += readRawVarint32;
        return copyOfRange;
    }

    public final ByteBuffer readByteBuffer() {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? Internal.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32));
        } else {
            ByteBuffer slice;
            if (this.input == null && !this.bufferIsImmutable && this.enableAliasing) {
                slice = ByteBuffer.wrap(this.buffer, i2, readRawVarint32).slice();
            } else {
                byte[] bArr = this.buffer;
                i2 = this.bufferPos;
                slice = ByteBuffer.wrap(Arrays.copyOfRange(bArr, i2, i2 + readRawVarint32));
            }
            this.bufferPos += readRawVarint32;
            return slice;
        }
    }

    public final ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytesSlowPath(readRawVarint32));
        } else {
            ByteString wrap = (this.bufferIsImmutable && this.enableAliasing) ? ByteString.wrap(this.buffer, i2, readRawVarint32) : ByteString.copyFrom(this.buffer, this.bufferPos, readRawVarint32);
            this.bufferPos += readRawVarint32;
            return wrap;
        }
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public final int readEnum() {
        return readRawVarint32();
    }

    public final int readFixed32() {
        return readRawLittleEndian32();
    }

    public final long readFixed64() {
        return readRawLittleEndian64();
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        int i2 = this.recursionDepth;
        if (i2 < this.recursionLimit) {
            this.recursionDepth = i2 + 1;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final void readGroup(int i, Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int i2 = this.recursionDepth;
        if (i2 < this.recursionLimit) {
            this.recursionDepth = i2 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final int readInt32() {
        return readRawVarint32();
    }

    public final long readInt64() {
        return readRawVarint64();
    }

    public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(readRawVarint32);
            return messageLite;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final void readMessage(Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(readRawVarint32);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final byte readRawByte() {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public final byte[] readRawBytes(int i) {
        int i2 = this.bufferPos;
        if (i > this.bufferSize - i2 || i <= 0) {
            return readRawBytesSlowPath(i);
        }
        i += i2;
        this.bufferPos = i;
        return Arrays.copyOfRange(this.buffer, i2, i);
    }

    public final int readRawLittleEndian32() {
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    public final long readRawLittleEndian64() {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    /* JADX WARNING: Missing block: B:29:0x0066, code skipped:
            if (r2[r3] >= (byte) 0) goto L_0x0068;
     */
    public final int readRawVarint32() {
        /*
        r5 = this;
        r0 = r5.bufferPos;
        r1 = r5.bufferSize;
        if (r1 == r0) goto L_0x006b;
    L_0x0006:
        r2 = r5.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.bufferPos = r3;
        return r0;
    L_0x0011:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x006b;
    L_0x0016:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0022;
    L_0x001f:
        r0 = r0 ^ -128;
        goto L_0x0068;
    L_0x0022:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x002f;
    L_0x002b:
        r0 = r0 ^ 16256;
    L_0x002d:
        r1 = r3;
        goto L_0x0068;
    L_0x002f:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x003d;
    L_0x0038:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0068;
    L_0x003d:
        r3 = r1 + 1;
        r1 = r2[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x002d;
    L_0x004a:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0068;
    L_0x0050:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x002d;
    L_0x0056:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0068;
    L_0x005c:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x002d;
    L_0x0062:
        r1 = r3 + 1;
        r2 = r2[r3];
        if (r2 < 0) goto L_0x006b;
    L_0x0068:
        r5.bufferPos = r1;
        return r0;
    L_0x006b:
        r0 = r5.readRawVarint64SlowPath();
        r1 = (int) r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.readRawVarint32():int");
    }

    /* JADX WARNING: Missing block: B:36:0x00af, code skipped:
            if (((long) r2[r0]) >= 0) goto L_0x00b1;
     */
    public final long readRawVarint64() {
        /*
        r11 = this;
        r0 = r11.bufferPos;
        r1 = r11.bufferSize;
        if (r1 == r0) goto L_0x00b4;
    L_0x0006:
        r2 = r11.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0012;
    L_0x000e:
        r11.bufferPos = r3;
        r0 = (long) r0;
        return r0;
    L_0x0012:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x00b4;
    L_0x0017:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0026;
    L_0x0020:
        r0 = r0 ^ -128;
    L_0x0022:
        r2 = (long) r0;
        r3 = r2;
        goto L_0x00b1;
    L_0x0026:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0036;
    L_0x002f:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        r9 = r0;
        r1 = r3;
        r3 = r9;
        goto L_0x00b1;
    L_0x0036:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0044;
    L_0x003f:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0022;
    L_0x0044:
        r3 = (long) r0;
        r0 = r1 + 1;
        r1 = r2[r1];
        r5 = (long) r1;
        r1 = 28;
        r5 = r5 << r1;
        r3 = r3 ^ r5;
        r5 = 0;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x005b;
    L_0x0054:
        r1 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
    L_0x0057:
        r1 = r1 ^ r3;
        r3 = r1;
    L_0x0059:
        r1 = r0;
        goto L_0x00b1;
    L_0x005b:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 35;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x006f;
    L_0x0068:
        r5 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
    L_0x006d:
        r3 = r3 ^ r5;
        goto L_0x00b1;
    L_0x006f:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 42;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x0082;
    L_0x007c:
        r1 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        goto L_0x0057;
    L_0x0082:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 49;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x0095;
    L_0x008f:
        r5 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        goto L_0x006d;
    L_0x0095:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 56;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r7 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x0059;
    L_0x00a8:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 < 0) goto L_0x00b4;
    L_0x00b1:
        r11.bufferPos = r1;
        return r3;
    L_0x00b4:
        r0 = r11.readRawVarint64SlowPath();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.readRawVarint64():long");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x001d in {5, 6, 8} preds:[]
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
    final long readRawVarint64SlowPath() {
        /*
        r6 = this;
        r0 = 0;
        r2 = 0;
        r3 = 64;
        if (r2 >= r3) goto L_0x0018;
        r3 = r6.readRawByte();
        r4 = r3 & 127;
        r4 = (long) r4;
        r4 = r4 << r2;
        r0 = r0 | r4;
        r3 = r3 & 128;
        if (r3 != 0) goto L_0x0015;
        return r0;
        r2 = r2 + 7;
        goto L_0x0003;
        r0 = com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.readRawVarint64SlowPath():long");
    }

    public final int readSFixed32() {
        return readRawLittleEndian32();
    }

    public final long readSFixed64() {
        return readRawLittleEndian64();
    }

    public final int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public final long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public final String readString() {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        String str;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            str = new String(this.buffer, i2, readRawVarint32, Internal.UTF_8);
            this.bufferPos += readRawVarint32;
            return str;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            if (readRawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(readRawVarint32), Internal.UTF_8);
            }
            refillBuffer(readRawVarint32);
            str = new String(this.buffer, this.bufferPos, readRawVarint32, Internal.UTF_8);
            this.bufferPos += readRawVarint32;
            return str;
        }
    }

    public final String readStringRequireUtf8() {
        byte[] bArr;
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferPos;
        int i2 = 0;
        if (readRawVarint32 <= this.bufferSize - i && readRawVarint32 > 0) {
            bArr = this.buffer;
            this.bufferPos = i + readRawVarint32;
            i2 = i;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            if (readRawVarint32 <= this.bufferSize) {
                refillBuffer(readRawVarint32);
                bArr = this.buffer;
                this.bufferPos = readRawVarint32;
            } else {
                bArr = readRawBytesSlowPath(readRawVarint32);
            }
        }
        if (Utf8.isValidUtf8(bArr, i2, i2 + readRawVarint32)) {
            return new String(bArr, i2, readRawVarint32, Internal.UTF_8);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public final int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = readRawVarint32();
        if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public final int readUInt32() {
        return readRawVarint32();
    }

    public final long readUInt64() {
        return readRawVarint64();
    }

    @Deprecated
    public final void readUnknownGroup(int i, Builder builder) {
        readGroup(i, builder, null);
    }

    public final void resetSizeCounter() {
        this.totalBytesRetired = -this.bufferPos;
    }

    public final int setRecursionLimit(int i) {
        if (i >= 0) {
            int i2 = this.recursionLimit;
            this.recursionLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: ".concat(String.valueOf(i)));
    }

    public final int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.sizeLimit;
            this.sizeLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: ".concat(String.valueOf(i)));
    }

    public final boolean skipField(int i) {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            skipRawVarint();
            return true;
        } else if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        } else if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        } else if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
            return true;
        } else if (tagWireType == 4) {
            return false;
        } else {
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean skipField(int i, CodedOutputStream codedOutputStream) {
        int tagWireType = WireFormat.getTagWireType(i);
        long readInt64;
        if (tagWireType == 0) {
            readInt64 = readInt64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeUInt64NoTag(readInt64);
            return true;
        } else if (tagWireType == 1) {
            readInt64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(readInt64);
            return true;
        } else if (tagWireType == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        } else if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i);
            skipMessage(codedOutputStream);
            i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(i);
            codedOutputStream.writeRawVarint32(i);
            return true;
        } else if (tagWireType == 4) {
            return false;
        } else {
            if (tagWireType == 5) {
                tagWireType = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeFixed32NoTag(tagWireType);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final void skipMessage() {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    public final void skipMessage(CodedOutputStream codedOutputStream) {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, codedOutputStream));
    }

    public final void skipRawBytes(int i) {
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (i > i2 - i3 || i < 0) {
            skipRawBytesSlowPath(i);
        } else {
            this.bufferPos = i3 + i;
        }
    }
}
