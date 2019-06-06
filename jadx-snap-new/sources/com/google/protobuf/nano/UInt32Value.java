package com.google.protobuf.nano;

public final class UInt32Value extends ExtendableMessageNano<UInt32Value> {
    private static volatile UInt32Value[] _emptyArray;
    private int bitField0_;
    private int value_;

    public UInt32Value() {
        clear();
    }

    public static UInt32Value[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new UInt32Value[0];
                }
            }
        }
        return _emptyArray;
    }

    public static UInt32Value parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new UInt32Value().mergeFrom(codedInputByteBufferNano);
    }

    public static UInt32Value parseFrom(byte[] bArr) {
        return (UInt32Value) MessageNano.mergeFrom(new UInt32Value(), bArr);
    }

    public final UInt32Value clear() {
        this.bitField0_ = 0;
        this.value_ = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final UInt32Value clearValue() {
        this.value_ = 0;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, this.value_) : computeSerializedSize;
    }

    public final int getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final UInt32Value mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.value_ = codedInputByteBufferNano.readUInt32();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final UInt32Value setValue(int i) {
        this.value_ = i;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeUInt32(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
