package com.google.protobuf.nano;

import com.snap.core.db.DbConstantsKt;

public final class MessageOptions extends ExtendableMessageNano<MessageOptions> {
    private static volatile MessageOptions[] _emptyArray;
    private int bitField0_;
    private boolean deprecated_;
    private boolean mapEntry_;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    public UninterpretedOption[] uninterpretedOption;

    public MessageOptions() {
        clear();
    }

    public static MessageOptions[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new MessageOptions[0];
                }
            }
        }
        return _emptyArray;
    }

    public static MessageOptions parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new MessageOptions().mergeFrom(codedInputByteBufferNano);
    }

    public static MessageOptions parseFrom(byte[] bArr) {
        return (MessageOptions) MessageNano.mergeFrom(new MessageOptions(), bArr);
    }

    public final MessageOptions clear() {
        this.bitField0_ = 0;
        this.messageSetWireFormat_ = false;
        this.noStandardDescriptorAccessor_ = false;
        this.deprecated_ = false;
        this.mapEntry_ = false;
        this.uninterpretedOption = UninterpretedOption.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final MessageOptions clearDeprecated() {
        this.deprecated_ = false;
        this.bitField0_ &= -5;
        return this;
    }

    public final MessageOptions clearMapEntry() {
        this.mapEntry_ = false;
        this.bitField0_ &= -9;
        return this;
    }

    public final MessageOptions clearMessageSetWireFormat() {
        this.messageSetWireFormat_ = false;
        this.bitField0_ &= -2;
        return this;
    }

    public final MessageOptions clearNoStandardDescriptorAccessor() {
        this.noStandardDescriptorAccessor_ = false;
        this.bitField0_ &= -3;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, this.messageSetWireFormat_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, this.noStandardDescriptorAccessor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, this.mapEntry_);
        }
        UninterpretedOption[] uninterpretedOptionArr = this.uninterpretedOption;
        if (uninterpretedOptionArr != null && uninterpretedOptionArr.length > 0) {
            int i = 0;
            while (true) {
                UninterpretedOption[] uninterpretedOptionArr2 = this.uninterpretedOption;
                if (i >= uninterpretedOptionArr2.length) {
                    break;
                }
                MessageNano messageNano = uninterpretedOptionArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(DbConstantsKt.MAX_QUERY_VARIABLE_COUNT, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    public final boolean getMapEntry() {
        return this.mapEntry_;
    }

    public final boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    public final boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
    }

    public final boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasMapEntry() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasMessageSetWireFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasNoStandardDescriptorAccessor() {
        return (this.bitField0_ & 2) != 0;
    }

    public final MessageOptions mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.messageSetWireFormat_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 1;
            } else if (readTag == 16) {
                this.noStandardDescriptorAccessor_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 2;
            } else if (readTag == 24) {
                this.deprecated_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 4;
            } else if (readTag == 56) {
                this.mapEntry_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 8;
            } else if (readTag == 7994) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 7994);
                UninterpretedOption[] uninterpretedOptionArr = this.uninterpretedOption;
                int length = uninterpretedOptionArr == null ? 0 : uninterpretedOptionArr.length;
                UninterpretedOption[] uninterpretedOptionArr2 = new UninterpretedOption[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.uninterpretedOption, 0, uninterpretedOptionArr2, 0, length);
                }
                while (length < uninterpretedOptionArr2.length - 1) {
                    uninterpretedOptionArr2[length] = new UninterpretedOption();
                    codedInputByteBufferNano.readMessage(uninterpretedOptionArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                uninterpretedOptionArr2[length] = new UninterpretedOption();
                codedInputByteBufferNano.readMessage(uninterpretedOptionArr2[length]);
                this.uninterpretedOption = uninterpretedOptionArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.bitField0_ = readTag;
        }
    }

    public final MessageOptions setDeprecated(boolean z) {
        this.deprecated_ = z;
        this.bitField0_ |= 4;
        return this;
    }

    public final MessageOptions setMapEntry(boolean z) {
        this.mapEntry_ = z;
        this.bitField0_ |= 8;
        return this;
    }

    public final MessageOptions setMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat_ = z;
        this.bitField0_ |= 1;
        return this;
    }

    public final MessageOptions setNoStandardDescriptorAccessor(boolean z) {
        this.noStandardDescriptorAccessor_ = z;
        this.bitField0_ |= 2;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeBool(1, this.messageSetWireFormat_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeBool(2, this.noStandardDescriptorAccessor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputByteBufferNano.writeBool(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputByteBufferNano.writeBool(7, this.mapEntry_);
        }
        UninterpretedOption[] uninterpretedOptionArr = this.uninterpretedOption;
        if (uninterpretedOptionArr != null && uninterpretedOptionArr.length > 0) {
            int i = 0;
            while (true) {
                UninterpretedOption[] uninterpretedOptionArr2 = this.uninterpretedOption;
                if (i >= uninterpretedOptionArr2.length) {
                    break;
                }
                MessageNano messageNano = uninterpretedOptionArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(DbConstantsKt.MAX_QUERY_VARIABLE_COUNT, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
