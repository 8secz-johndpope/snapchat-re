package com.google.protobuf.nano;

public final class BoolValue extends ExtendableMessageNano<BoolValue> {
    private static volatile BoolValue[] _emptyArray;
    private int bitField0_;
    private boolean value_;

    public BoolValue() {
        clear();
    }

    public static BoolValue[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new BoolValue[0];
                }
            }
        }
        return _emptyArray;
    }

    public static BoolValue parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new BoolValue().mergeFrom(codedInputByteBufferNano);
    }

    public static BoolValue parseFrom(byte[] bArr) {
        return (BoolValue) MessageNano.mergeFrom(new BoolValue(), bArr);
    }

    public final BoolValue clear() {
        this.bitField0_ = 0;
        this.value_ = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final BoolValue clearValue() {
        this.value_ = false;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, this.value_) : computeSerializedSize;
    }

    public final boolean getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final BoolValue mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.value_ = codedInputByteBufferNano.readBool();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final BoolValue setValue(boolean z) {
        this.value_ = z;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeBool(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
