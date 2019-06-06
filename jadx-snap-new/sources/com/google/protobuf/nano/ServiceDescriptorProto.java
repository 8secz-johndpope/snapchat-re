package com.google.protobuf.nano;

public final class ServiceDescriptorProto extends ExtendableMessageNano<ServiceDescriptorProto> {
    private static volatile ServiceDescriptorProto[] _emptyArray;
    private int bitField0_;
    public MethodDescriptorProto[] method;
    private String name_;
    public ServiceOptions options;

    public ServiceDescriptorProto() {
        clear();
    }

    public static ServiceDescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new ServiceDescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static ServiceDescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new ServiceDescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static ServiceDescriptorProto parseFrom(byte[] bArr) {
        return (ServiceDescriptorProto) MessageNano.mergeFrom(new ServiceDescriptorProto(), bArr);
    }

    public final ServiceDescriptorProto clear() {
        this.bitField0_ = 0;
        this.name_ = "";
        this.method = MethodDescriptorProto.emptyArray();
        this.options = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final ServiceDescriptorProto clearName() {
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
        MethodDescriptorProto[] methodDescriptorProtoArr = this.method;
        if (methodDescriptorProtoArr != null && methodDescriptorProtoArr.length > 0) {
            int i = 0;
            while (true) {
                MethodDescriptorProto[] methodDescriptorProtoArr2 = this.method;
                if (i >= methodDescriptorProtoArr2.length) {
                    break;
                }
                MessageNano messageNano = methodDescriptorProtoArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                i++;
            }
        }
        ServiceOptions serviceOptions = this.options;
        return serviceOptions != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, serviceOptions) : computeSerializedSize;
    }

    public final String getName() {
        return this.name_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final ServiceDescriptorProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                MethodDescriptorProto[] methodDescriptorProtoArr = this.method;
                int length = methodDescriptorProtoArr == null ? 0 : methodDescriptorProtoArr.length;
                MethodDescriptorProto[] methodDescriptorProtoArr2 = new MethodDescriptorProto[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.method, 0, methodDescriptorProtoArr2, 0, length);
                }
                while (length < methodDescriptorProtoArr2.length - 1) {
                    methodDescriptorProtoArr2[length] = new MethodDescriptorProto();
                    codedInputByteBufferNano.readMessage(methodDescriptorProtoArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                methodDescriptorProtoArr2[length] = new MethodDescriptorProto();
                codedInputByteBufferNano.readMessage(methodDescriptorProtoArr2[length]);
                this.method = methodDescriptorProtoArr2;
            } else if (readTag == 26) {
                if (this.options == null) {
                    this.options = new ServiceOptions();
                }
                codedInputByteBufferNano.readMessage(this.options);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final ServiceDescriptorProto setName(String str) {
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
        MethodDescriptorProto[] methodDescriptorProtoArr = this.method;
        if (methodDescriptorProtoArr != null && methodDescriptorProtoArr.length > 0) {
            int i = 0;
            while (true) {
                MethodDescriptorProto[] methodDescriptorProtoArr2 = this.method;
                if (i >= methodDescriptorProtoArr2.length) {
                    break;
                }
                MessageNano messageNano = methodDescriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        ServiceOptions serviceOptions = this.options;
        if (serviceOptions != null) {
            codedOutputByteBufferNano.writeMessage(3, serviceOptions);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
