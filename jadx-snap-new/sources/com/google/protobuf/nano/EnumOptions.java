package com.google.protobuf.nano;

import com.snap.core.db.DbConstantsKt;

public final class EnumOptions extends ExtendableMessageNano<EnumOptions> {
    private static volatile EnumOptions[] _emptyArray;
    private boolean allowAlias_;
    private int bitField0_;
    private boolean deprecated_;
    public UninterpretedOption[] uninterpretedOption;

    public EnumOptions() {
        clear();
    }

    public static EnumOptions[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new EnumOptions[0];
                }
            }
        }
        return _emptyArray;
    }

    public static EnumOptions parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new EnumOptions().mergeFrom(codedInputByteBufferNano);
    }

    public static EnumOptions parseFrom(byte[] bArr) {
        return (EnumOptions) MessageNano.mergeFrom(new EnumOptions(), bArr);
    }

    public final EnumOptions clear() {
        this.bitField0_ = 0;
        this.allowAlias_ = false;
        this.deprecated_ = false;
        this.uninterpretedOption = UninterpretedOption.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final EnumOptions clearAllowAlias() {
        this.allowAlias_ = false;
        this.bitField0_ &= -2;
        return this;
    }

    public final EnumOptions clearDeprecated() {
        this.deprecated_ = false;
        this.bitField0_ &= -3;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, this.allowAlias_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, this.deprecated_);
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

    public final boolean getAllowAlias() {
        return this.allowAlias_;
    }

    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    public final boolean hasAllowAlias() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    public final EnumOptions mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                this.allowAlias_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 1;
            } else if (readTag == 24) {
                this.deprecated_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 2;
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

    public final EnumOptions setAllowAlias(boolean z) {
        this.allowAlias_ = z;
        this.bitField0_ |= 1;
        return this;
    }

    public final EnumOptions setDeprecated(boolean z) {
        this.deprecated_ = z;
        this.bitField0_ |= 2;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeBool(2, this.allowAlias_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeBool(3, this.deprecated_);
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
