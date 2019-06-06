package com.google.protobuf.nano;

import com.snap.core.db.DbConstantsKt;

public final class OneofOptions extends ExtendableMessageNano<OneofOptions> {
    private static volatile OneofOptions[] _emptyArray;
    public UninterpretedOption[] uninterpretedOption;

    public OneofOptions() {
        clear();
    }

    public static OneofOptions[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new OneofOptions[0];
                }
            }
        }
        return _emptyArray;
    }

    public static OneofOptions parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new OneofOptions().mergeFrom(codedInputByteBufferNano);
    }

    public static OneofOptions parseFrom(byte[] bArr) {
        return (OneofOptions) MessageNano.mergeFrom(new OneofOptions(), bArr);
    }

    public final OneofOptions clear() {
        this.uninterpretedOption = UninterpretedOption.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
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

    public final OneofOptions mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 7994) {
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

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
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
