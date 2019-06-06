package com.google.protobuf.nano;

public final class Int64Value extends ExtendableMessageNano<Int64Value> {
    private static volatile Int64Value[] _emptyArray;
    private int bitField0_;
    private long value_;

    public Int64Value() {
        clear();
    }

    public static Int64Value[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new Int64Value[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Int64Value parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Int64Value().mergeFrom(codedInputByteBufferNano);
    }

    public static Int64Value parseFrom(byte[] bArr) {
        return (Int64Value) MessageNano.mergeFrom(new Int64Value(), bArr);
    }

    public final Int64Value clear() {
        this.bitField0_ = 0;
        this.value_ = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final Int64Value clearValue() {
        this.value_ = 0;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, this.value_) : computeSerializedSize;
    }

    public final long getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Int64Value mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.value_ = codedInputByteBufferNano.readInt64();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final Int64Value setValue(long j) {
        this.value_ = j;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
