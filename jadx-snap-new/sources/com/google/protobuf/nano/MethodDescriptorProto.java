package com.google.protobuf.nano;

public final class MethodDescriptorProto extends ExtendableMessageNano<MethodDescriptorProto> {
    private static volatile MethodDescriptorProto[] _emptyArray;
    private int bitField0_;
    private boolean clientStreaming_;
    private String inputType_;
    private String name_;
    public MethodOptions options;
    private String outputType_;
    private boolean serverStreaming_;

    public MethodDescriptorProto() {
        clear();
    }

    public static MethodDescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new MethodDescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static MethodDescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new MethodDescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static MethodDescriptorProto parseFrom(byte[] bArr) {
        return (MethodDescriptorProto) MessageNano.mergeFrom(new MethodDescriptorProto(), bArr);
    }

    public final MethodDescriptorProto clear() {
        this.bitField0_ = 0;
        String str = "";
        this.name_ = str;
        this.inputType_ = str;
        this.outputType_ = str;
        this.options = null;
        this.clientStreaming_ = false;
        this.serverStreaming_ = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final MethodDescriptorProto clearClientStreaming() {
        this.clientStreaming_ = false;
        this.bitField0_ &= -9;
        return this;
    }

    public final MethodDescriptorProto clearInputType() {
        this.inputType_ = "";
        this.bitField0_ &= -3;
        return this;
    }

    public final MethodDescriptorProto clearName() {
        this.name_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    public final MethodDescriptorProto clearOutputType() {
        this.outputType_ = "";
        this.bitField0_ &= -5;
        return this;
    }

    public final MethodDescriptorProto clearServerStreaming() {
        this.serverStreaming_ = false;
        this.bitField0_ &= -17;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.inputType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.outputType_);
        }
        MethodOptions methodOptions = this.options;
        if (methodOptions != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, methodOptions);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, this.clientStreaming_);
        }
        return (this.bitField0_ & 16) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(6, this.serverStreaming_) : computeSerializedSize;
    }

    public final boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    public final String getInputType() {
        return this.inputType_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getOutputType() {
        return this.outputType_;
    }

    public final boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    public final boolean hasClientStreaming() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasInputType() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasOutputType() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasServerStreaming() {
        return (this.bitField0_ & 16) != 0;
    }

    public final MethodDescriptorProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.name_ = codedInputByteBufferNano.readString();
                readTag = this.bitField0_ | 1;
            } else if (readTag == 18) {
                this.inputType_ = codedInputByteBufferNano.readString();
                readTag = this.bitField0_ | 2;
            } else if (readTag == 26) {
                this.outputType_ = codedInputByteBufferNano.readString();
                readTag = this.bitField0_ | 4;
            } else if (readTag == 34) {
                if (this.options == null) {
                    this.options = new MethodOptions();
                }
                codedInputByteBufferNano.readMessage(this.options);
            } else if (readTag == 40) {
                this.clientStreaming_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 8;
            } else if (readTag == 48) {
                this.serverStreaming_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 16;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.bitField0_ = readTag;
        }
    }

    public final MethodDescriptorProto setClientStreaming(boolean z) {
        this.clientStreaming_ = z;
        this.bitField0_ |= 8;
        return this;
    }

    public final MethodDescriptorProto setInputType(String str) {
        if (str != null) {
            this.inputType_ = str;
            this.bitField0_ |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final MethodDescriptorProto setName(String str) {
        if (str != null) {
            this.name_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final MethodDescriptorProto setOutputType(String str) {
        if (str != null) {
            this.outputType_ = str;
            this.bitField0_ |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final MethodDescriptorProto setServerStreaming(boolean z) {
        this.serverStreaming_ = z;
        this.bitField0_ |= 16;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.inputType_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.outputType_);
        }
        MethodOptions methodOptions = this.options;
        if (methodOptions != null) {
            codedOutputByteBufferNano.writeMessage(4, methodOptions);
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputByteBufferNano.writeBool(5, this.clientStreaming_);
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputByteBufferNano.writeBool(6, this.serverStreaming_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
