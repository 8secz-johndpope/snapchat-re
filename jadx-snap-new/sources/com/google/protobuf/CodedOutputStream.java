package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {
    private static final long ARRAY_BASE_OFFSET = UnsafeUtil.getArrayBaseOffset();
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private static final int MAX_VARINT_SIZE = 10;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }
    }

    static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i) {
            super();
            if (i >= 0) {
                this.buffer = new byte[Math.max(i, 20)];
                this.limit = this.buffer.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* Access modifiers changed, original: final */
        public final void buffer(byte b) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b;
            this.totalBytesWritten++;
        }

        /* Access modifiers changed, original: final */
        public final void bufferFixed32NoTag(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) i;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) (i >>> 24);
            this.totalBytesWritten += 4;
        }

        /* Access modifiers changed, original: final */
        public final void bufferFixed64NoTag(long j) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 8) & 255));
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 16) & 255));
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (255 & (j >> 24)));
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 32));
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 40));
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 48));
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 56));
            this.totalBytesWritten += 8;
        }

        /* Access modifiers changed, original: final */
        public final void bufferInt32NoTag(int i) {
            if (i >= 0) {
                bufferUInt32NoTag(i);
            } else {
                bufferUInt64NoTag((long) i);
            }
        }

        /* Access modifiers changed, original: final */
        public final void bufferTag(int i, int i2) {
            bufferUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        /* Access modifiers changed, original: final */
        public final void bufferUInt32NoTag(int i) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j;
                long access$200 = CodedOutputStream.ARRAY_BASE_OFFSET + ((long) this.position);
                long j2 = access$200;
                while ((i & -128) != 0) {
                    j = 1 + j2;
                    UnsafeUtil.putByte(this.buffer, j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                    j2 = j;
                }
                j = 1 + j2;
                UnsafeUtil.putByte(this.buffer, j2, (byte) i);
                i = (int) (j - access$200);
                this.position += i;
                this.totalBytesWritten += i;
                return;
            }
            byte[] bArr;
            int i2;
            while ((i & -128) != 0) {
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.totalBytesWritten++;
                i >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) i;
            this.totalBytesWritten++;
        }

        /* Access modifiers changed, original: final */
        public final void bufferUInt64NoTag(long j) {
            int i;
            long access$200;
            int i2;
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                access$200 = CodedOutputStream.ARRAY_BASE_OFFSET + ((long) this.position);
                long j2 = j;
                long j3 = access$200;
                while ((j2 & -128) != CodedOutputStream.ARRAY_BASE_OFFSET) {
                    long j4 = j3 + 1;
                    UnsafeUtil.putByte(this.buffer, j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                    j3 = j4;
                }
                long j5 = 1 + j3;
                UnsafeUtil.putByte(this.buffer, j3, (byte) ((int) j2));
                i2 = (int) (j5 - access$200);
                this.position += i2;
                i = this.totalBytesWritten + i2;
            } else {
                byte[] bArr;
                access$200 = j;
                while ((access$200 & -128) != CodedOutputStream.ARRAY_BASE_OFFSET) {
                    bArr = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr[i3] = (byte) ((((int) access$200) & 127) | 128);
                    this.totalBytesWritten++;
                    access$200 >>>= 7;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((int) access$200);
                i = this.totalBytesWritten + 1;
            }
            this.totalBytesWritten = i;
        }

        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if (((i | i2) | (bArr.length - i3)) >= 0) {
                    this.buffer = bArr;
                    this.offset = i;
                    this.position = i;
                    this.limit = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public void flush() {
        }

        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        public final int spaceLeft() {
            return this.limit - this.position;
        }

        public final void write(byte b) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, remaining);
                this.position += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)}), e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write((byte) z);
        }

        public final void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public final void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public final void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public final void writeFixed32NoTag(int i) {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 8);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 16);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public final void writeFixed64NoTag(long j) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) j);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 8));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 16));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 24));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 32));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 40));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 48));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public final void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        public final void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public final void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public final void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public final void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public final void writeStringNoTag(String str) {
            int i = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    this.position = i + computeUInt32SizeNoTag2;
                    computeUInt32SizeNoTag = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                    this.position = i;
                    writeUInt32NoTag((computeUInt32SizeNoTag - i) - computeUInt32SizeNoTag2);
                    this.position = computeUInt32SizeNoTag;
                    return;
                }
                writeUInt32NoTag(Utf8.encodedLength(str));
                this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
            } catch (UnpairedSurrogateException e) {
                this.position = i;
                inefficientWriteStringNoTag(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public final void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0087 in {8, 9, 14, 16, 19} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void writeUInt32NoTag(int r8) {
            /*
            r7 = this;
            r0 = com.google.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
            r1 = 1;
            if (r0 == 0) goto L_0x003d;
            r0 = r7.spaceLeft();
            r2 = 10;
            if (r0 < r2) goto L_0x003d;
            r2 = com.google.protobuf.CodedOutputStream.ARRAY_BASE_OFFSET;
            r0 = r7.position;
            r4 = (long) r0;
            r2 = r2 + r4;
            r0 = r8 & -128;
            if (r0 != 0) goto L_0x0027;
            r0 = r7.buffer;
            r8 = (byte) r8;
            com.google.protobuf.UnsafeUtil.putByte(r0, r2, r8);
            r8 = r7.position;
            r8 = r8 + r1;
            r7.position = r8;
            return;
            r0 = r7.buffer;
            r4 = 1;
            r4 = r4 + r2;
            r6 = r8 & 127;
            r6 = r6 | 128;
            r6 = (byte) r6;
            com.google.protobuf.UnsafeUtil.putByte(r0, r2, r6);
            r0 = r7.position;
            r0 = r0 + r1;
            r7.position = r0;
            r8 = r8 >>> 7;
            r2 = r4;
            goto L_0x0017;
            r0 = r8 & -128;
            if (r0 != 0) goto L_0x004d;
            r0 = r7.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r2 = r7.position;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r3 = r2 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r7.position = r3;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r8 = (byte) r8;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r0[r2] = r8;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            return;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r0 = r7.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r2 = r7.position;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r3 = r2 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r7.position = r3;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r3 = r8 & 127;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r3 = r3 | 128;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r3 = (byte) r3;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r0[r2] = r3;	 Catch:{ IndexOutOfBoundsException -> 0x005f }
            r8 = r8 >>> 7;
            goto L_0x003d;
            r8 = move-exception;
            r0 = new com.google.protobuf.CodedOutputStream$OutOfSpaceException;
            r2 = 3;
            r2 = new java.lang.Object[r2];
            r3 = 0;
            r4 = r7.position;
            r4 = java.lang.Integer.valueOf(r4);
            r2[r3] = r4;
            r3 = r7.limit;
            r3 = java.lang.Integer.valueOf(r3);
            r2[r1] = r3;
            r3 = 2;
            r1 = java.lang.Integer.valueOf(r1);
            r2[r3] = r1;
            r1 = "Pos: %d, limit: %d, len: %d";
            r1 = java.lang.String.format(r1, r2);
            r0.<init>(r1, r8);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStream$ArrayEncoder.writeUInt32NoTag(int):void");
        }

        public final void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0092 in {8, 9, 14, 16, 19} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void writeUInt64NoTag(long r13) {
            /*
            r12 = this;
            r0 = com.google.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
            r1 = 7;
            r2 = 0;
            r4 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
            r6 = 1;
            if (r0 == 0) goto L_0x0045;
            r0 = r12.spaceLeft();
            r7 = 10;
            if (r0 < r7) goto L_0x0045;
            r7 = com.google.protobuf.CodedOutputStream.ARRAY_BASE_OFFSET;
            r0 = r12.position;
            r9 = (long) r0;
            r7 = r7 + r9;
            r9 = r13 & r4;
            r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
            if (r0 != 0) goto L_0x002f;
            r0 = r12.buffer;
            r14 = (int) r13;
            r13 = (byte) r14;
            com.google.protobuf.UnsafeUtil.putByte(r0, r7, r13);
            r13 = r12.position;
            r13 = r13 + r6;
            r12.position = r13;
            return;
            r0 = r12.buffer;
            r9 = 1;
            r9 = r9 + r7;
            r11 = (int) r13;
            r11 = r11 & 127;
            r11 = r11 | 128;
            r11 = (byte) r11;
            com.google.protobuf.UnsafeUtil.putByte(r0, r7, r11);
            r0 = r12.position;
            r0 = r0 + r6;
            r12.position = r0;
            r13 = r13 >>> r1;
            r7 = r9;
            goto L_0x001c;
            r7 = r13 & r4;
            r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
            if (r0 != 0) goto L_0x0058;
            r0 = r12.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r1 = r12.position;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r2 = r1 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r12.position = r2;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r14 = (int) r13;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r13 = (byte) r14;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r0[r1] = r13;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            return;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r0 = r12.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r7 = r12.position;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r8 = r7 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r12.position = r8;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r8 = (int) r13;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r8 = r8 & 127;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r8 = r8 | 128;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r8 = (byte) r8;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r0[r7] = r8;	 Catch:{ IndexOutOfBoundsException -> 0x006a }
            r13 = r13 >>> r1;
            goto L_0x0045;
            r13 = move-exception;
            r14 = new com.google.protobuf.CodedOutputStream$OutOfSpaceException;
            r0 = 3;
            r0 = new java.lang.Object[r0];
            r1 = 0;
            r2 = r12.position;
            r2 = java.lang.Integer.valueOf(r2);
            r0[r1] = r2;
            r1 = r12.limit;
            r1 = java.lang.Integer.valueOf(r1);
            r0[r6] = r1;
            r1 = 2;
            r2 = java.lang.Integer.valueOf(r6);
            r0[r1] = r2;
            r1 = "Pos: %d, limit: %d, len: %d";
            r0 = java.lang.String.format(r1, r0);
            r14.<init>(r0, r13);
            throw r14;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStream$ArrayEncoder.writeUInt64NoTag(long):void");
        }
    }

    static final class NioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        NioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            }
        }

        public final void flush() {
            this.originalBuffer.position(this.buffer.position());
        }

        public final int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        public final int spaceLeft() {
            return this.buffer.remaining();
        }

        public final void write(byte b) {
            try {
                this.buffer.put(b);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        public final void write(ByteBuffer byteBuffer) {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                this.buffer.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write((byte) z);
        }

        public final void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public final void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public final void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public final void writeFixed32NoTag(int i) {
            try {
                this.buffer.putInt(i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        public final void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public final void writeFixed64NoTag(long j) {
            try {
                this.buffer.putLong(j);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        public final void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public final void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        public final void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public final void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public final void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public final void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public final void writeStringNoTag(String str) {
            int position = this.buffer.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    computeUInt32SizeNoTag = this.buffer.position() + computeUInt32SizeNoTag2;
                    this.buffer.position(computeUInt32SizeNoTag);
                    encode(str);
                    computeUInt32SizeNoTag2 = this.buffer.position();
                    this.buffer.position(position);
                    writeUInt32NoTag(computeUInt32SizeNoTag2 - computeUInt32SizeNoTag);
                    this.buffer.position(computeUInt32SizeNoTag2);
                    return;
                }
                writeUInt32NoTag(Utf8.encodedLength(str));
                encode(str);
            } catch (UnpairedSurrogateException e) {
                this.buffer.position(position);
                inefficientWriteStringNoTag(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public final void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x001f in {4, 6, 9} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void writeUInt32NoTag(int r3) {
            /*
            r2 = this;
            r0 = r3 & -128;
            if (r0 != 0) goto L_0x000b;
            r0 = r2.buffer;	 Catch:{ BufferOverflowException -> 0x0018 }
            r3 = (byte) r3;	 Catch:{ BufferOverflowException -> 0x0018 }
            r0.put(r3);	 Catch:{ BufferOverflowException -> 0x0018 }
            return;	 Catch:{ BufferOverflowException -> 0x0018 }
            r0 = r2.buffer;	 Catch:{ BufferOverflowException -> 0x0018 }
            r1 = r3 & 127;	 Catch:{ BufferOverflowException -> 0x0018 }
            r1 = r1 | 128;	 Catch:{ BufferOverflowException -> 0x0018 }
            r1 = (byte) r1;	 Catch:{ BufferOverflowException -> 0x0018 }
            r0.put(r1);	 Catch:{ BufferOverflowException -> 0x0018 }
            r3 = r3 >>> 7;
            goto L_0x0000;
            r3 = move-exception;
            r0 = new com.google.protobuf.CodedOutputStream$OutOfSpaceException;
            r0.<init>(r3);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStream$NioEncoder.writeUInt32NoTag(int):void");
        }

        public final void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0026 in {4, 6, 9} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void writeUInt64NoTag(long r6) {
            /*
            r5 = this;
            r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
            r0 = r0 & r6;
            r2 = 0;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 != 0) goto L_0x0011;
            r0 = r5.buffer;	 Catch:{ BufferOverflowException -> 0x001f }
            r7 = (int) r6;	 Catch:{ BufferOverflowException -> 0x001f }
            r6 = (byte) r7;	 Catch:{ BufferOverflowException -> 0x001f }
            r0.put(r6);	 Catch:{ BufferOverflowException -> 0x001f }
            return;	 Catch:{ BufferOverflowException -> 0x001f }
            r0 = r5.buffer;	 Catch:{ BufferOverflowException -> 0x001f }
            r1 = (int) r6;	 Catch:{ BufferOverflowException -> 0x001f }
            r1 = r1 & 127;	 Catch:{ BufferOverflowException -> 0x001f }
            r1 = r1 | 128;	 Catch:{ BufferOverflowException -> 0x001f }
            r1 = (byte) r1;	 Catch:{ BufferOverflowException -> 0x001f }
            r0.put(r1);	 Catch:{ BufferOverflowException -> 0x001f }
            r0 = 7;
            r6 = r6 >>> r0;
            goto L_0x0000;
            r6 = move-exception;
            r7 = new com.google.protobuf.CodedOutputStream$OutOfSpaceException;
            r7.<init>(r6);
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStream$NioEncoder.writeUInt64NoTag(long):void");
        }
    }

    static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        ByteOutputEncoder(ByteOutput byteOutput, int i) {
            super(i);
            if (byteOutput != null) {
                this.out = byteOutput;
                return;
            }
            throw new NullPointerException("out");
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i) {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        public final void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        public final void write(byte b) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b);
        }

        public final void write(ByteBuffer byteBuffer) {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += remaining;
        }

        public final void write(byte[] bArr, int i, int i2) {
            flush();
            this.out.write(bArr, i, i2);
            this.totalBytesWritten += i2;
        }

        public final void writeBool(int i, boolean z) {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer((byte) z);
        }

        public final void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public final void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public final void writeFixed32(int i, int i2) {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i2);
        }

        public final void writeFixed32NoTag(int i) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        public final void writeFixed64(int i, long j) {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j);
        }

        public final void writeFixed64NoTag(long j) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j);
        }

        public final void writeInt32(int i, int i2) {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i2);
        }

        public final void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public final void writeLazy(ByteBuffer byteBuffer) {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += remaining;
        }

        public final void writeLazy(byte[] bArr, int i, int i2) {
            flush();
            this.out.writeLazy(bArr, i, i2);
            this.totalBytesWritten += i2;
        }

        public final void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public final void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public final void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public final void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public final void writeStringNoTag(String str) {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i = computeUInt32SizeNoTag + length;
            if (i > this.limit) {
                byte[] bArr = new byte[length];
                int encode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(encode);
                writeLazy(bArr, 0, encode);
                return;
            }
            if (i > this.limit - this.position) {
                doFlush();
            }
            length = this.position;
            try {
                i = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (i == computeUInt32SizeNoTag) {
                    this.position = length + i;
                    computeUInt32SizeNoTag = Utf8.encode(str, this.buffer, this.position, this.limit - this.position);
                    this.position = length;
                    int i2 = (computeUInt32SizeNoTag - length) - i;
                    bufferUInt32NoTag(i2);
                    this.position = computeUInt32SizeNoTag;
                    this.totalBytesWritten += i2;
                    return;
                }
                computeUInt32SizeNoTag = Utf8.encodedLength(str);
                bufferUInt32NoTag(computeUInt32SizeNoTag);
                this.position = Utf8.encode(str, this.buffer, this.position, computeUInt32SizeNoTag);
                this.totalBytesWritten += computeUInt32SizeNoTag;
            } catch (UnpairedSurrogateException e) {
                this.totalBytesWritten -= this.position - length;
                this.position = length;
                inefficientWriteStringNoTag(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public final void writeUInt32(int i, int i2) {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i2);
        }

        public final void writeUInt32NoTag(int i) {
            flushIfNotAvailable(10);
            bufferUInt32NoTag(i);
        }

        public final void writeUInt64(int i, long j) {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j);
        }

        public final void writeUInt64NoTag(long j) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j);
        }
    }

    static final class NioHeapEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        NioHeapEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        public final void flush() {
            this.byteBuffer.position(this.initialPosition + getTotalBytesWritten());
        }
    }

    static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        OutputStreamEncoder(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.out = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i) {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        public final void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        public final void write(byte b) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b);
        }

        public final void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.limit - this.position >= remaining) {
                byteBuffer.get(this.buffer, this.position, remaining);
                this.position += remaining;
            } else {
                int i = this.limit - this.position;
                byteBuffer.get(this.buffer, this.position, i);
                remaining -= i;
                this.position = this.limit;
                this.totalBytesWritten += i;
                doFlush();
                while (remaining > this.limit) {
                    byteBuffer.get(this.buffer, 0, this.limit);
                    this.out.write(this.buffer, 0, this.limit);
                    remaining -= this.limit;
                    this.totalBytesWritten += this.limit;
                }
                byteBuffer.get(this.buffer, 0, remaining);
                this.position = remaining;
            }
            this.totalBytesWritten += remaining;
        }

        public final void write(byte[] bArr, int i, int i2) {
            if (this.limit - this.position >= i2) {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } else {
                int i3 = this.limit - this.position;
                System.arraycopy(bArr, i, this.buffer, this.position, i3);
                i += i3;
                i2 -= i3;
                this.position = this.limit;
                this.totalBytesWritten += i3;
                doFlush();
                if (i2 <= this.limit) {
                    System.arraycopy(bArr, i, this.buffer, 0, i2);
                    this.position = i2;
                } else {
                    this.out.write(bArr, i, i2);
                }
            }
            this.totalBytesWritten += i2;
        }

        public final void writeBool(int i, boolean z) {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer((byte) z);
        }

        public final void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public final void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public final void writeFixed32(int i, int i2) {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i2);
        }

        public final void writeFixed32NoTag(int i) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        public final void writeFixed64(int i, long j) {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j);
        }

        public final void writeFixed64NoTag(long j) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j);
        }

        public final void writeInt32(int i, int i2) {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i2);
        }

        public final void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        public final void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public final void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public final void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public final void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public final void writeStringNoTag(String str) {
            int i;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                i = computeUInt32SizeNoTag + length;
                if (i > this.limit) {
                    byte[] bArr = new byte[length];
                    length = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(length);
                    writeLazy(bArr, 0, length);
                    return;
                }
                int i2;
                if (i > this.limit - this.position) {
                    doFlush();
                }
                length = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                i = this.position;
                if (length == computeUInt32SizeNoTag) {
                    this.position = i + length;
                    computeUInt32SizeNoTag = Utf8.encode(str, this.buffer, this.position, this.limit - this.position);
                    this.position = i;
                    i2 = (computeUInt32SizeNoTag - i) - length;
                    bufferUInt32NoTag(i2);
                    this.position = computeUInt32SizeNoTag;
                } else {
                    i2 = Utf8.encodedLength(str);
                    bufferUInt32NoTag(i2);
                    this.position = Utf8.encode(str, this.buffer, this.position, i2);
                }
                this.totalBytesWritten += i2;
            } catch (UnpairedSurrogateException e) {
                this.totalBytesWritten -= this.position - i;
                this.position = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            } catch (UnpairedSurrogateException e3) {
                inefficientWriteStringNoTag(str, e3);
            }
        }

        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public final void writeUInt32(int i, int i2) {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i2);
        }

        public final void writeUInt32NoTag(int i) {
            flushIfNotAvailable(10);
            bufferUInt32NoTag(i);
        }

        public final void writeUInt64(int i, long j) {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j);
        }

        public final void writeUInt64NoTag(long j) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j);
        }
    }

    private CodedOutputStream() {
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeTagSize(i) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite) {
        return (computeTagSize(i) << 1) + computeGroupSizeNoTag(messageLite);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeInt32SizeNoTag(int i) {
        return i >= 0 ? computeUInt32SizeNoTag(i) : 10;
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyFieldLite) {
        return ((computeTagSize(1) << 1) + computeUInt32Size(2, i)) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    static int computeLengthDelimitedFieldSize(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return ((computeTagSize(1) << 1) + computeUInt32Size(2, i)) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    static int computePreferredBufferSize(int i) {
        return i > 4096 ? 4096 : i;
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return ((computeTagSize(1) << 1) + computeUInt32Size(2, i)) + computeBytesSize(3, byteString);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int encodedLength;
        try {
            encodedLength = Utf8.encodedLength(str);
        } catch (UnpairedSurrogateException unused) {
            encodedLength = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(encodedLength);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        if ((-128 & j) == ARRAY_BASE_OFFSET) {
            return 1;
        }
        if (j < ARRAY_BASE_OFFSET) {
            return 10;
        }
        int i;
        if ((-34359738368L & j) != ARRAY_BASE_OFFSET) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != ARRAY_BASE_OFFSET) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != ARRAY_BASE_OFFSET) {
            i++;
        }
        return i;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i) {
        if (i >= 0) {
            return new ByteOutputEncoder(byteOutput, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new OutputStreamEncoder(outputStream, i);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() ? new NioHeapEncoder(byteBuffer) : new NioEncoder(byteBuffer);
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new ArrayEncoder(bArr, i, i2);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    /* Access modifiers changed, original: final */
    public final void inefficientWriteStringNoTag(String str, UnpairedSurrogateException unpairedSurrogateException) {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    public abstract int spaceLeft();

    public abstract void write(byte b);

    public abstract void write(ByteBuffer byteBuffer);

    public abstract void write(byte[] bArr, int i, int i2);

    public abstract void writeBool(int i, boolean z);

    public final void writeBoolNoTag(boolean z) {
        write((byte) z);
    }

    public abstract void writeByteArray(int i, byte[] bArr);

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i, int i2);

    public abstract void writeByteBuffer(int i, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i, double d) {
        writeFixed64(i, Double.doubleToRawLongBits(d));
    }

    public final void writeDoubleNoTag(double d) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int i2) {
        writeInt32(i, i2);
    }

    public final void writeEnumNoTag(int i) {
        writeInt32NoTag(i);
    }

    public abstract void writeFixed32(int i, int i2);

    public abstract void writeFixed32NoTag(int i);

    public abstract void writeFixed64(int i, long j);

    public abstract void writeFixed64NoTag(long j);

    public final void writeFloat(int i, float f) {
        writeFixed32(i, Float.floatToRawIntBits(f));
    }

    public final void writeFloatNoTag(float f) {
        writeFixed32NoTag(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void writeGroup(int i, MessageLite messageLite) {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i, int i2);

    public abstract void writeInt32NoTag(int i);

    public final void writeInt64(int i, long j) {
        writeUInt64(i, j);
    }

    public final void writeInt64NoTag(long j) {
        writeUInt64NoTag(j);
    }

    public abstract void writeLazy(ByteBuffer byteBuffer);

    public abstract void writeLazy(byte[] bArr, int i, int i2);

    public abstract void writeMessage(int i, MessageLite messageLite);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    public abstract void writeMessageSetExtension(int i, MessageLite messageLite);

    public final void writeRawByte(byte b) {
        write(b);
    }

    public final void writeRawByte(int i) {
        write((byte) i);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo((ByteOutput) this);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i) {
        writeFixed32NoTag(i);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) {
        writeFixed64NoTag(j);
    }

    public abstract void writeRawMessageSetExtension(int i, ByteString byteString);

    @Deprecated
    public final void writeRawVarint32(int i) {
        writeUInt32NoTag(i);
    }

    @Deprecated
    public final void writeRawVarint64(long j) {
        writeUInt64NoTag(j);
    }

    public final void writeSFixed32(int i, int i2) {
        writeFixed32(i, i2);
    }

    public final void writeSFixed32NoTag(int i) {
        writeFixed32NoTag(i);
    }

    public final void writeSFixed64(int i, long j) {
        writeFixed64(i, j);
    }

    public final void writeSFixed64NoTag(long j) {
        writeFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSInt32NoTag(int i) {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long j) {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSInt64NoTag(long j) {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public abstract void writeString(int i, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i, int i2);

    public abstract void writeUInt32(int i, int i2);

    public abstract void writeUInt32NoTag(int i);

    public abstract void writeUInt64(int i, long j);

    public abstract void writeUInt64NoTag(long j);
}
