package com.google.protobuf.nano;

public final class Any extends ExtendableMessageNano<Any> {
    private static volatile Any[] _emptyArray;
    private int bitField0_;
    private String typeUrl_;
    private byte[] value_;

    public Any() {
        clear();
    }

    public static Any[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new Any[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Any parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Any().mergeFrom(codedInputByteBufferNano);
    }

    public static Any parseFrom(byte[] bArr) {
        return (Any) MessageNano.mergeFrom(new Any(), bArr);
    }

    public final Any clear() {
        this.bitField0_ = 0;
        this.typeUrl_ = "";
        this.value_ = WireFormatNano.EMPTY_BYTES;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final Any clearTypeUrl() {
        this.typeUrl_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    public final Any clearValue() {
        this.value_ = WireFormatNano.EMPTY_BYTES;
        this.bitField0_ &= -3;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.typeUrl_);
        }
        return (this.bitField0_ & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.value_) : computeSerializedSize;
    }

    public final String getTypeUrl() {
        return this.typeUrl_;
    }

    public final byte[] getValue() {
        return this.value_;
    }

    public final boolean hasTypeUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public final Any mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.typeUrl_ = codedInputByteBufferNano.readString();
                readTag = this.bitField0_ | 1;
            } else if (readTag == 18) {
                this.value_ = codedInputByteBufferNano.readBytes();
                readTag = this.bitField0_ | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.bitField0_ = readTag;
        }
    }

    public final Any setTypeUrl(String str) {
        if (str != null) {
            this.typeUrl_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final Any setValue(byte[] bArr) {
        if (bArr != null) {
            this.value_ = bArr;
            this.bitField0_ |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.typeUrl_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeBytes(2, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
