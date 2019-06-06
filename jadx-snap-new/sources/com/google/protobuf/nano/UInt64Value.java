package com.google.protobuf.nano;

public final class UInt64Value extends ExtendableMessageNano<UInt64Value> {
    private static volatile UInt64Value[] _emptyArray;
    private int bitField0_;
    private long value_;

    public UInt64Value() {
        clear();
    }

    public static UInt64Value[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new UInt64Value[0];
                }
            }
        }
        return _emptyArray;
    }

    public static UInt64Value parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new UInt64Value().mergeFrom(codedInputByteBufferNano);
    }

    public static UInt64Value parseFrom(byte[] bArr) {
        return (UInt64Value) MessageNano.mergeFrom(new UInt64Value(), bArr);
    }

    public final UInt64Value clear() {
        this.bitField0_ = 0;
        this.value_ = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final UInt64Value clearValue() {
        this.value_ = 0;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, this.value_) : computeSerializedSize;
    }

    public final long getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final UInt64Value mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.value_ = codedInputByteBufferNano.readUInt64();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final UInt64Value setValue(long j) {
        this.value_ = j;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeUInt64(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
