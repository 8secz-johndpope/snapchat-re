package com.google.protobuf.nano;

public final class Int32Value extends ExtendableMessageNano<Int32Value> {
    private static volatile Int32Value[] _emptyArray;
    private int bitField0_;
    private int value_;

    public Int32Value() {
        clear();
    }

    public static Int32Value[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new Int32Value[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Int32Value parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Int32Value().mergeFrom(codedInputByteBufferNano);
    }

    public static Int32Value parseFrom(byte[] bArr) {
        return (Int32Value) MessageNano.mergeFrom(new Int32Value(), bArr);
    }

    public final Int32Value clear() {
        this.bitField0_ = 0;
        this.value_ = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final Int32Value clearValue() {
        this.value_ = 0;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(1, this.value_) : computeSerializedSize;
    }

    public final int getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Int32Value mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.value_ = codedInputByteBufferNano.readInt32();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final Int32Value setValue(int i) {
        this.value_ = i;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
