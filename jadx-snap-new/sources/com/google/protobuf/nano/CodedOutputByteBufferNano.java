package com.google.protobuf.nano;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import org.opencv.imgproc.Imgproc;

public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
            stringBuilder.append(i);
            stringBuilder.append(" limit ");
            stringBuilder.append(i2);
            stringBuilder.append(").");
            super(stringBuilder.toString());
        }
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.buffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeBytesSize(int i, byte[] bArr) {
        return computeTagSize(i) + computeBytesSizeNoTag(bArr);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
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
        return computeRawVarint32Size(i);
    }

    static int computeFieldSize(int i, int i2, Object obj) {
        switch (i2) {
            case 1:
                return computeDoubleSize(i, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i, (String) obj);
            case 10:
                return computeGroupSize(i, (MessageNano) obj);
            case 11:
                return computeMessageSize(i, (MessageNano) obj);
            case 12:
                return computeBytesSize(i, (byte[]) obj);
            case 13:
                return computeUInt32Size(i, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type: ".concat(String.valueOf(i2)));
        }
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

    public static int computeGroupSize(int i, MessageNano messageNano) {
        return (computeTagSize(i) << 1) + computeGroupSizeNoTag(messageNano);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeInt32SizeNoTag(int i) {
        return i >= 0 ? computeRawVarint32Size(i) : 10;
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeMessageSize(int i, MessageNano messageNano) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageNano);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
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
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int encodedLength = encodedLength(str);
        return computeRawVarint32Size(encodedLength) + encodedLength;
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    private static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        i2 += i;
        int i4 = 0;
        while (i4 < length) {
            i3 = i4 + i;
            if (i3 >= i2) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt >= 128) {
                break;
            }
            bArr[i3] = (byte) charAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        i += i4;
        while (i4 < length) {
            int i5;
            char charAt2 = charSequence.charAt(i4);
            StringBuilder stringBuilder;
            if (charAt2 < 128 && i < i2) {
                i5 = i + 1;
                bArr[i] = (byte) charAt2;
            } else if (charAt2 < 2048 && i <= i2 - 2) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 6) | 960);
                i = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
                i4++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i2 - 3) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 12) | 480);
                i = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 & 63) | 128);
            } else if (i <= i2 - 4) {
                i5 = i4 + 1;
                if (i5 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i4 = Character.toCodePoint(charAt2, charAt3);
                        i3 = i + 1;
                        bArr[i] = (byte) ((i4 >>> 18) | 240);
                        i = i3 + 1;
                        bArr[i3] = (byte) (((i4 >>> 12) & 63) | 128);
                        i3 = i + 1;
                        bArr[i] = (byte) (((i4 >>> 6) & 63) | 128);
                        i = i3 + 1;
                        bArr[i3] = (byte) ((i4 & 63) | 128);
                        i4 = i5;
                        i4++;
                    } else {
                        i4 = i5;
                    }
                }
                stringBuilder = new StringBuilder("Unpaired surrogate at index ");
                stringBuilder.append(i4 - 1);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                stringBuilder = new StringBuilder("Failed writing ");
                stringBuilder.append(charAt2);
                stringBuilder.append(" at index ");
                stringBuilder.append(i);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            i = i5;
            i4++;
        }
        return i;
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            encodeDirect(charSequence, byteBuffer);
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i);
            if (charAt >= 128) {
                int i2;
                if (charAt < ItemAnimator.FLAG_MOVED) {
                    i2 = (charAt >>> 6) | 960;
                } else if (charAt < 55296 || 57343 < charAt) {
                    byteBuffer.put((byte) ((charAt >>> 12) | 480));
                    i2 = ((charAt >>> 6) & 63) | 128;
                } else {
                    i2 = i + 1;
                    if (i2 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i2);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            i = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((i >>> 18) | 240));
                            byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((i & 63) | 128));
                            i = i2;
                            i++;
                        } else {
                            i = i2;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder("Unpaired surrogate at index ");
                    stringBuilder.append(i - 1);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                byteBuffer.put((byte) i2);
                charAt = (charAt & 63) | 128;
            }
            byteBuffer.put((byte) charAt);
            i++;
        }
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0048 in {4, 9, 10, 12, 14} preds:[]
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
    private static int encodedLength(java.lang.CharSequence r5) {
        /*
        r0 = r5.length();
        r1 = 0;
        if (r1 >= r0) goto L_0x0012;
        r2 = r5.charAt(r1);
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r3) goto L_0x0012;
        r1 = r1 + 1;
        goto L_0x0005;
        r2 = r0;
        if (r1 >= r0) goto L_0x002a;
        r3 = r5.charAt(r1);
        r4 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r3 >= r4) goto L_0x0025;
        r3 = 127 - r3;
        r3 = r3 >>> 31;
        r2 = r2 + r3;
        r1 = r1 + 1;
        goto L_0x0013;
        r5 = encodedLengthGeneral(r5, r1);
        r2 = r2 + r5;
        if (r2 < r0) goto L_0x002d;
        return r2;
        r5 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "UTF-8 length does not fit in int: ";
        r0.<init>(r1);
        r1 = (long) r2;
        r3 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r1 = r1 + r3;
        r0.append(r1);
        r0 = r0.toString();
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.CodedOutputByteBufferNano.encodedLength(java.lang.CharSequence):int");
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= Imgproc.FLOODFILL_FIXED_RANGE) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Unpaired surrogate at index ".concat(String.valueOf(i)));
                    }
                }
            }
            i++;
        }
        return i2;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i, int i2) {
        return new CodedOutputByteBufferNano(bArr, i, i2);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final int position() {
        return this.buffer.position();
    }

    public final void reset() {
        this.buffer.clear();
    }

    public final int spaceLeft() {
        return this.buffer.remaining();
    }

    public final void writeBool(int i, boolean z) {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public final void writeBoolNoTag(boolean z) {
        writeRawByte((int) z);
    }

    public final void writeBytes(int i, byte[] bArr) {
        writeTag(i, 2);
        writeBytesNoTag(bArr);
    }

    public final void writeBytesNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public final void writeDouble(int i, double d) {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public final void writeDoubleNoTag(double d) {
        writeRawLittleEndian64(Double.doubleToLongBits(d));
    }

    public final void writeEnum(int i, int i2) {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public final void writeEnumNoTag(int i) {
        writeRawVarint32(i);
    }

    /* Access modifiers changed, original: final */
    public final void writeField(int i, int i2, Object obj) {
        switch (i2) {
            case 1:
                writeDouble(i, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i, (String) obj);
                return;
            case 10:
                writeGroup(i, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i, ((Long) obj).longValue());
                return;
            default:
                throw new IOException("Unknown type: ".concat(String.valueOf(i2)));
        }
    }

    public final void writeFixed32(int i, int i2) {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    public final void writeFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public final void writeFixed64(int i, long j) {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    public final void writeFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public final void writeFloat(int i, float f) {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public final void writeFloatNoTag(float f) {
        writeRawLittleEndian32(Float.floatToIntBits(f));
    }

    public final void writeGroup(int i, MessageNano messageNano) {
        writeTag(i, 3);
        writeGroupNoTag(messageNano);
        writeTag(i, 4);
    }

    public final void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public final void writeInt32(int i, int i2) {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public final void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64((long) i);
        }
    }

    public final void writeInt64(int i, long j) {
        writeTag(i, 0);
        writeInt64NoTag(j);
    }

    public final void writeInt64NoTag(long j) {
        writeRawVarint64(j);
    }

    public final void writeMessage(int i, MessageNano messageNano) {
        writeTag(i, 2);
        writeMessageNoTag(messageNano);
    }

    public final void writeMessageNoTag(MessageNano messageNano) {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public final void writeRawByte(byte b) {
        if (this.buffer.hasRemaining()) {
            this.buffer.put(b);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public final void writeRawByte(int i) {
        writeRawByte((byte) i);
    }

    public final void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) {
        if (this.buffer.remaining() >= i2) {
            this.buffer.put(bArr, i, i2);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public final void writeRawLittleEndian32(int i) {
        if (this.buffer.remaining() >= 4) {
            this.buffer.putInt(i);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public final void writeRawLittleEndian64(long j) {
        if (this.buffer.remaining() >= 8) {
            this.buffer.putLong(j);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public final void writeRawVarint32(int i) {
        while ((i & -128) != 0) {
            writeRawByte((i & 127) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public final void writeRawVarint64(long j) {
        while ((-128 & j) != 0) {
            writeRawByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public final void writeSFixed32(int i, int i2) {
        writeTag(i, 5);
        writeSFixed32NoTag(i2);
    }

    public final void writeSFixed32NoTag(int i) {
        writeRawLittleEndian32(i);
    }

    public final void writeSFixed64(int i, long j) {
        writeTag(i, 1);
        writeSFixed64NoTag(j);
    }

    public final void writeSFixed64NoTag(long j) {
        writeRawLittleEndian64(j);
    }

    public final void writeSInt32(int i, int i2) {
        writeTag(i, 0);
        writeSInt32NoTag(i2);
    }

    public final void writeSInt32NoTag(int i) {
        writeRawVarint32(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long j) {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public final void writeSInt64NoTag(long j) {
        writeRawVarint64(encodeZigZag64(j));
    }

    public final void writeString(int i, String str) {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    public final void writeStringNoTag(String str) {
        try {
            int computeRawVarint32Size = computeRawVarint32Size(str.length());
            if (computeRawVarint32Size == computeRawVarint32Size(str.length() * 3)) {
                int position = this.buffer.position();
                if (this.buffer.remaining() >= computeRawVarint32Size) {
                    this.buffer.position(position + computeRawVarint32Size);
                    encode(str, this.buffer);
                    int position2 = this.buffer.position();
                    this.buffer.position(position);
                    writeRawVarint32((position2 - position) - computeRawVarint32Size);
                    this.buffer.position(position2);
                    return;
                }
                throw new OutOfSpaceException(position + computeRawVarint32Size, this.buffer.limit());
            }
            writeRawVarint32(encodedLength(str));
            encode(str, this.buffer);
        } catch (BufferOverflowException e) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e);
            throw outOfSpaceException;
        }
    }

    public final void writeTag(int i, int i2) {
        writeRawVarint32(WireFormatNano.makeTag(i, i2));
    }

    public final void writeUInt32(int i, int i2) {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public final void writeUInt32NoTag(int i) {
        writeRawVarint32(i);
    }

    public final void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    public final void writeUInt64NoTag(long j) {
        writeRawVarint64(j);
    }
}
