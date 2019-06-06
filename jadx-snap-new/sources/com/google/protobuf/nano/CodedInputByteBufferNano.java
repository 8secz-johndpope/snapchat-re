package com.google.protobuf.nano;

public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int currentLimit = Integer.MAX_VALUE;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit = 64;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.bufferStart = i;
        this.bufferSize = i2 + i;
        this.bufferPos = i;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i, int i2) {
        return new CodedInputByteBufferNano(bArr, i, i2);
    }

    private void recomputeBufferSizeAfterLimit() {
        this.bufferSize += this.bufferSizeAfterLimit;
        int i = this.bufferSize;
        int i2 = this.currentLimit;
        if (i > i2) {
            this.bufferSizeAfterLimit = i - i2;
            this.bufferSize = i - this.bufferSizeAfterLimit;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    public final void checkLastTagWas(int i) {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public final int getBytesUntilLimit() {
        int i = this.currentLimit;
        return i == Integer.MAX_VALUE ? -1 : i - this.bufferPos;
    }

    public final byte[] getData(int i, int i2) {
        if (i2 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.bufferStart + i, bArr, 0, i2);
        return bArr;
    }

    public final int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public final boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public final void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public final int pushLimit(int i) {
        if (i >= 0) {
            i += this.bufferPos;
            int i2 = this.currentLimit;
            if (i <= i2) {
                this.currentLimit = i;
                recomputeBufferSizeAfterLimit();
                return i2;
            }
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public final boolean readBool() {
        return readRawVarint32() != 0;
    }

    public final byte[] readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? WireFormatNano.EMPTY_BYTES : readRawBytes(readRawVarint32);
        } else {
            byte[] bArr = new byte[readRawVarint32];
            System.arraycopy(this.buffer, i2, bArr, 0, readRawVarint32);
            this.bufferPos += readRawVarint32;
            return bArr;
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

    public final void readGroup(MessageNano messageNano, int i) {
        int i2 = this.recursionDepth;
        if (i2 < this.recursionLimit) {
            this.recursionDepth = i2 + 1;
            messageNano.mergeFrom(this);
            checkLastTagWas(WireFormatNano.makeTag(i, 4));
            this.recursionDepth--;
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    public final int readInt32() {
        return readRawVarint32();
    }

    public final long readInt64() {
        return readRawVarint64();
    }

    public final void readMessage(MessageNano messageNano) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            messageNano.mergeFrom(this);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(readRawVarint32);
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    /* Access modifiers changed, original: final */
    public final Object readPrimitiveField(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(readDouble());
            case 2:
                return Float.valueOf(readFloat());
            case 3:
                return Long.valueOf(readInt64());
            case 4:
                return Long.valueOf(readUInt64());
            case 5:
                return Integer.valueOf(readInt32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Integer.valueOf(readFixed32());
            case 8:
                return Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 12:
                return readBytes();
            case 13:
                return Integer.valueOf(readUInt32());
            case 14:
                return Integer.valueOf(readEnum());
            case 15:
                return Integer.valueOf(readSFixed32());
            case 16:
                return Long.valueOf(readSFixed64());
            case 17:
                return Integer.valueOf(readSInt32());
            case 18:
                return Long.valueOf(readSInt64());
            default:
                throw new IllegalArgumentException("Unknown type ".concat(String.valueOf(i)));
        }
    }

    public final byte readRawByte() {
        int i = this.bufferPos;
        if (i != this.bufferSize) {
            byte[] bArr = this.buffer;
            this.bufferPos = i + 1;
            return bArr[i];
        }
        throw InvalidProtocolBufferNanoException.truncatedMessage();
    }

    public final byte[] readRawBytes(int i) {
        if (i >= 0) {
            int i2 = this.bufferPos;
            int i3 = i2 + i;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                skipRawBytes(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i <= this.bufferSize - i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.buffer, i2, bArr, 0, i);
                this.bufferPos += i;
                return bArr;
            } else {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public final int readRawLittleEndian32() {
        return (((readRawByte() & 255) | ((readRawByte() & 255) << 8)) | ((readRawByte() & 255) << 16)) | ((readRawByte() & 255) << 24);
    }

    public final long readRawLittleEndian64() {
        byte readRawByte = readRawByte();
        byte readRawByte2 = readRawByte();
        return ((((((((((long) readRawByte2) & 255) << 8) | (((long) readRawByte) & 255)) | ((((long) readRawByte()) & 255) << 16)) | ((((long) readRawByte()) & 255) << 24)) | ((((long) readRawByte()) & 255) << 32)) | ((((long) readRawByte()) & 255) << 40)) | ((((long) readRawByte()) & 255) << 48)) | ((((long) readRawByte()) & 255) << 56);
    }

    public final int readRawVarint32() {
        byte readRawByte = readRawByte();
        if (readRawByte >= (byte) 0) {
            return readRawByte;
        }
        int i;
        int i2 = readRawByte & 127;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= (byte) 0) {
            i = readRawByte2 << 7;
        } else {
            i2 |= (readRawByte2 & 127) << 7;
            readRawByte2 = readRawByte();
            if (readRawByte2 >= (byte) 0) {
                i = readRawByte2 << 14;
            } else {
                i2 |= (readRawByte2 & 127) << 14;
                readRawByte2 = readRawByte();
                if (readRawByte2 >= (byte) 0) {
                    i = readRawByte2 << 21;
                } else {
                    i2 |= (readRawByte2 & 127) << 21;
                    readRawByte2 = readRawByte();
                    i2 |= readRawByte2 << 28;
                    if (readRawByte2 < (byte) 0) {
                        for (i = 0; i < 5; i++) {
                            if (readRawByte() >= (byte) 0) {
                                return i2;
                            }
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                    return i2;
                }
            }
        }
        i2 |= i;
        return i2;
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final long readRawVarint64() {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r3 = 64;
        if (r0 >= r3) goto L_0x0018;
        r3 = r6.readRawByte();
        r4 = r3 & 127;
        r4 = (long) r4;
        r4 = r4 << r0;
        r1 = r1 | r4;
        r3 = r3 & 128;
        if (r3 != 0) goto L_0x0015;
        return r1;
        r0 = r0 + 7;
        goto L_0x0003;
        r0 = com.google.protobuf.nano.InvalidProtocolBufferNanoException.malformedVarint();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.CodedInputByteBufferNano.readRawVarint64():long");
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
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return new String(readRawBytes(readRawVarint32), InternalNano.UTF_8);
        }
        String str = new String(this.buffer, i2, readRawVarint32, InternalNano.UTF_8);
        this.bufferPos += readRawVarint32;
        return str;
    }

    public final int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = readRawVarint32();
        int i = this.lastTag;
        if (i != 0) {
            return i;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public final int readUInt32() {
        return readRawVarint32();
    }

    public final long readUInt64() {
        return readRawVarint64();
    }

    public final void resetSizeCounter() {
    }

    public final void rewindToPosition(int i) {
        int i2 = this.bufferPos;
        int i3 = this.bufferStart;
        if (i > i2 - i3) {
            StringBuilder stringBuilder = new StringBuilder("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(this.bufferPos - this.bufferStart);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.bufferPos = i3 + i;
        } else {
            throw new IllegalArgumentException("Bad position ".concat(String.valueOf(i)));
        }
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
        int tagWireType = WireFormatNano.getTagWireType(i);
        if (tagWireType == 0) {
            readInt32();
            return true;
        } else if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        } else if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        } else if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i), 4));
            return true;
        } else if (tagWireType == 4) {
            return false;
        } else {
            if (tagWireType == 5) {
                readRawLittleEndian32();
                return true;
            }
            throw InvalidProtocolBufferNanoException.invalidWireType();
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

    public final void skipRawBytes(int i) {
        if (i >= 0) {
            int i2 = this.bufferPos;
            int i3 = i2 + i;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                skipRawBytes(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i <= this.bufferSize - i2) {
                this.bufferPos = i2 + i;
                return;
            } else {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }
}
