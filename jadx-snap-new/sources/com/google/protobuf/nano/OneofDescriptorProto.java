package com.google.protobuf.nano;

public final class OneofDescriptorProto extends ExtendableMessageNano<OneofDescriptorProto> {
    private static volatile OneofDescriptorProto[] _emptyArray;
    private int bitField0_;
    private String name_;
    public OneofOptions options;

    public OneofDescriptorProto() {
        clear();
    }

    public static OneofDescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new OneofDescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static OneofDescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new OneofDescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static OneofDescriptorProto parseFrom(byte[] bArr) {
        return (OneofDescriptorProto) MessageNano.mergeFrom(new OneofDescriptorProto(), bArr);
    }

    public final OneofDescriptorProto clear() {
        this.bitField0_ = 0;
        this.name_ = "";
        this.options = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final OneofDescriptorProto clearName() {
        this.name_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.name_);
        }
        OneofOptions oneofOptions = this.options;
        return oneofOptions != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, oneofOptions) : computeSerializedSize;
    }

    public final String getName() {
        return this.name_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final OneofDescriptorProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.name_ = codedInputByteBufferNano.readString();
                this.bitField0_ |= 1;
            } else if (readTag == 18) {
                if (this.options == null) {
                    this.options = new OneofOptions();
                }
                codedInputByteBufferNano.readMessage(this.options);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final OneofDescriptorProto setName(String str) {
        if (str != null) {
            this.name_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.name_);
        }
        OneofOptions oneofOptions = this.options;
        if (oneofOptions != null) {
            codedOutputByteBufferNano.writeMessage(2, oneofOptions);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
