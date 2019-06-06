package com.google.protobuf.nano;

public final class EnumValueDescriptorProto extends ExtendableMessageNano<EnumValueDescriptorProto> {
    private static volatile EnumValueDescriptorProto[] _emptyArray;
    private int bitField0_;
    private String name_;
    private int number_;
    public EnumValueOptions options;

    public EnumValueDescriptorProto() {
        clear();
    }

    public static EnumValueDescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new EnumValueDescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static EnumValueDescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new EnumValueDescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static EnumValueDescriptorProto parseFrom(byte[] bArr) {
        return (EnumValueDescriptorProto) MessageNano.mergeFrom(new EnumValueDescriptorProto(), bArr);
    }

    public final EnumValueDescriptorProto clear() {
        this.bitField0_ = 0;
        this.name_ = "";
        this.number_ = 0;
        this.options = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final EnumValueDescriptorProto clearName() {
        this.name_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    public final EnumValueDescriptorProto clearNumber() {
        this.number_ = 0;
        this.bitField0_ &= -3;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, this.number_);
        }
        EnumValueOptions enumValueOptions = this.options;
        return enumValueOptions != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, enumValueOptions) : computeSerializedSize;
    }

    public final String getName() {
        return this.name_;
    }

    public final int getNumber() {
        return this.number_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public final EnumValueDescriptorProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.name_ = codedInputByteBufferNano.readString();
                readTag = this.bitField0_ | 1;
            } else if (readTag == 16) {
                this.number_ = codedInputByteBufferNano.readInt32();
                readTag = this.bitField0_ | 2;
            } else if (readTag == 26) {
                if (this.options == null) {
                    this.options = new EnumValueOptions();
                }
                codedInputByteBufferNano.readMessage(this.options);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.bitField0_ = readTag;
        }
    }

    public final EnumValueDescriptorProto setName(String str) {
        if (str != null) {
            this.name_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final EnumValueDescriptorProto setNumber(int i) {
        this.number_ = i;
        this.bitField0_ |= 2;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.number_);
        }
        EnumValueOptions enumValueOptions = this.options;
        if (enumValueOptions != null) {
            codedOutputByteBufferNano.writeMessage(3, enumValueOptions);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
