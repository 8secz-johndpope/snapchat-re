package com.google.protobuf.nano;

public final class DoubleValue extends ExtendableMessageNano<DoubleValue> {
    private static volatile DoubleValue[] _emptyArray;
    private int bitField0_;
    private double value_;

    public DoubleValue() {
        clear();
    }

    public static DoubleValue[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new DoubleValue[0];
                }
            }
        }
        return _emptyArray;
    }

    public static DoubleValue parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new DoubleValue().mergeFrom(codedInputByteBufferNano);
    }

    public static DoubleValue parseFrom(byte[] bArr) {
        return (DoubleValue) MessageNano.mergeFrom(new DoubleValue(), bArr);
    }

    public final DoubleValue clear() {
        this.bitField0_ = 0;
        this.value_ = 0.0d;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final DoubleValue clearValue() {
        this.value_ = 0.0d;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeDoubleSize(1, this.value_) : computeSerializedSize;
    }

    public final double getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final DoubleValue mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 9) {
                this.value_ = codedInputByteBufferNano.readDouble();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final DoubleValue setValue(double d) {
        this.value_ = d;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeDouble(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
