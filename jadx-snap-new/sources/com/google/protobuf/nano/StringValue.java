package com.google.protobuf.nano;

public final class StringValue extends ExtendableMessageNano<StringValue> {
    private static volatile StringValue[] _emptyArray;
    private int bitField0_;
    private String value_;

    public StringValue() {
        clear();
    }

    public static StringValue[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new StringValue[0];
                }
            }
        }
        return _emptyArray;
    }

    public static StringValue parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new StringValue().mergeFrom(codedInputByteBufferNano);
    }

    public static StringValue parseFrom(byte[] bArr) {
        return (StringValue) MessageNano.mergeFrom(new StringValue(), bArr);
    }

    public final StringValue clear() {
        this.bitField0_ = 0;
        this.value_ = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final StringValue clearValue() {
        this.value_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.value_) : computeSerializedSize;
    }

    public final String getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final StringValue mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.value_ = codedInputByteBufferNano.readString();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final StringValue setValue(String str) {
        if (str != null) {
            this.value_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
