package com.google.protobuf.nano;

public final class BytesValue extends ExtendableMessageNano<BytesValue> {
    private static volatile BytesValue[] _emptyArray;
    private int bitField0_;
    private byte[] value_;

    public BytesValue() {
        clear();
    }

    public static BytesValue[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new BytesValue[0];
                }
            }
        }
        return _emptyArray;
    }

    public static BytesValue parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new BytesValue().mergeFrom(codedInputByteBufferNano);
    }

    public static BytesValue parseFrom(byte[] bArr) {
        return (BytesValue) MessageNano.mergeFrom(new BytesValue(), bArr);
    }

    public final BytesValue clear() {
        this.bitField0_ = 0;
        this.value_ = WireFormatNano.EMPTY_BYTES;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final BytesValue clearValue() {
        this.value_ = WireFormatNano.EMPTY_BYTES;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.value_) : computeSerializedSize;
    }

    public final byte[] getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final BytesValue mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.value_ = codedInputByteBufferNano.readBytes();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final BytesValue setValue(byte[] bArr) {
        if (bArr != null) {
            this.value_ = bArr;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
