package com.google.protobuf.nano;

import com.snap.core.db.DbConstantsKt;

public final class EnumValueOptions extends ExtendableMessageNano<EnumValueOptions> {
    private static volatile EnumValueOptions[] _emptyArray;
    private int bitField0_;
    private boolean deprecated_;
    public UninterpretedOption[] uninterpretedOption;

    public EnumValueOptions() {
        clear();
    }

    public static EnumValueOptions[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new EnumValueOptions[0];
                }
            }
        }
        return _emptyArray;
    }

    public static EnumValueOptions parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new EnumValueOptions().mergeFrom(codedInputByteBufferNano);
    }

    public static EnumValueOptions parseFrom(byte[] bArr) {
        return (EnumValueOptions) MessageNano.mergeFrom(new EnumValueOptions(), bArr);
    }

    public final EnumValueOptions clear() {
        this.bitField0_ = 0;
        this.deprecated_ = false;
        this.uninterpretedOption = UninterpretedOption.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final EnumValueOptions clearDeprecated() {
        this.deprecated_ = false;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, this.deprecated_);
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

    public final boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    public final EnumValueOptions mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.deprecated_ = codedInputByteBufferNano.readBool();
                this.bitField0_ |= 1;
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
        }
    }

    public final EnumValueOptions setDeprecated(boolean z) {
        this.deprecated_ = z;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeBool(1, this.deprecated_);
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
