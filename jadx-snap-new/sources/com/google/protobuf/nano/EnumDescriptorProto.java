package com.google.protobuf.nano;

public final class EnumDescriptorProto extends ExtendableMessageNano<EnumDescriptorProto> {
    private static volatile EnumDescriptorProto[] _emptyArray;
    private int bitField0_;
    private String name_;
    public EnumOptions options;
    public EnumValueDescriptorProto[] value;

    public EnumDescriptorProto() {
        clear();
    }

    public static EnumDescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new EnumDescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static EnumDescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new EnumDescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static EnumDescriptorProto parseFrom(byte[] bArr) {
        return (EnumDescriptorProto) MessageNano.mergeFrom(new EnumDescriptorProto(), bArr);
    }

    public final EnumDescriptorProto clear() {
        this.bitField0_ = 0;
        this.name_ = "";
        this.value = EnumValueDescriptorProto.emptyArray();
        this.options = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final EnumDescriptorProto clearName() {
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
        EnumValueDescriptorProto[] enumValueDescriptorProtoArr = this.value;
        if (enumValueDescriptorProtoArr != null && enumValueDescriptorProtoArr.length > 0) {
            int i = 0;
            while (true) {
                EnumValueDescriptorProto[] enumValueDescriptorProtoArr2 = this.value;
                if (i >= enumValueDescriptorProtoArr2.length) {
                    break;
                }
                MessageNano messageNano = enumValueDescriptorProtoArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                i++;
            }
        }
        EnumOptions enumOptions = this.options;
        return enumOptions != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, enumOptions) : computeSerializedSize;
    }

    public final String getName() {
        return this.name_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final EnumDescriptorProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.name_ = codedInputByteBufferNano.readString();
                this.bitField0_ |= 1;
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                EnumValueDescriptorProto[] enumValueDescriptorProtoArr = this.value;
                int length = enumValueDescriptorProtoArr == null ? 0 : enumValueDescriptorProtoArr.length;
                EnumValueDescriptorProto[] enumValueDescriptorProtoArr2 = new EnumValueDescriptorProto[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.value, 0, enumValueDescriptorProtoArr2, 0, length);
                }
                while (length < enumValueDescriptorProtoArr2.length - 1) {
                    enumValueDescriptorProtoArr2[length] = new EnumValueDescriptorProto();
                    codedInputByteBufferNano.readMessage(enumValueDescriptorProtoArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                enumValueDescriptorProtoArr2[length] = new EnumValueDescriptorProto();
                codedInputByteBufferNano.readMessage(enumValueDescriptorProtoArr2[length]);
                this.value = enumValueDescriptorProtoArr2;
            } else if (readTag == 26) {
                if (this.options == null) {
                    this.options = new EnumOptions();
                }
                codedInputByteBufferNano.readMessage(this.options);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final EnumDescriptorProto setName(String str) {
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
        EnumValueDescriptorProto[] enumValueDescriptorProtoArr = this.value;
        if (enumValueDescriptorProtoArr != null && enumValueDescriptorProtoArr.length > 0) {
            int i = 0;
            while (true) {
                EnumValueDescriptorProto[] enumValueDescriptorProtoArr2 = this.value;
                if (i >= enumValueDescriptorProtoArr2.length) {
                    break;
                }
                MessageNano messageNano = enumValueDescriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        EnumOptions enumOptions = this.options;
        if (enumOptions != null) {
            codedOutputByteBufferNano.writeMessage(3, enumOptions);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
