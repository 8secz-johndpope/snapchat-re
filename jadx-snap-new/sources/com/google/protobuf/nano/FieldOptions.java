package com.google.protobuf.nano;

import com.snap.core.db.DbConstantsKt;

public final class FieldOptions extends ExtendableMessageNano<FieldOptions> {
    public static final int CORD = 1;
    public static final int JS_NORMAL = 0;
    public static final int JS_NUMBER = 2;
    public static final int JS_STRING = 1;
    public static final int STRING = 0;
    public static final int STRING_PIECE = 2;
    private static volatile FieldOptions[] _emptyArray;
    private int bitField0_;
    private int ctype_;
    private boolean deprecated_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    public UninterpretedOption[] uninterpretedOption;
    private boolean weak_;

    public FieldOptions() {
        clear();
    }

    public static FieldOptions[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new FieldOptions[0];
                }
            }
        }
        return _emptyArray;
    }

    public static FieldOptions parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new FieldOptions().mergeFrom(codedInputByteBufferNano);
    }

    public static FieldOptions parseFrom(byte[] bArr) {
        return (FieldOptions) MessageNano.mergeFrom(new FieldOptions(), bArr);
    }

    public final FieldOptions clear() {
        this.bitField0_ = 0;
        this.ctype_ = 0;
        this.packed_ = false;
        this.jstype_ = 0;
        this.lazy_ = false;
        this.deprecated_ = false;
        this.weak_ = false;
        this.uninterpretedOption = UninterpretedOption.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final FieldOptions clearCtype() {
        this.ctype_ = 0;
        this.bitField0_ &= -2;
        return this;
    }

    public final FieldOptions clearDeprecated() {
        this.deprecated_ = false;
        this.bitField0_ &= -17;
        return this;
    }

    public final FieldOptions clearJstype() {
        this.jstype_ = 0;
        this.bitField0_ &= -5;
        return this;
    }

    public final FieldOptions clearLazy() {
        this.lazy_ = false;
        this.bitField0_ &= -9;
        return this;
    }

    public final FieldOptions clearPacked() {
        this.packed_ = false;
        this.bitField0_ &= -3;
        return this;
    }

    public final FieldOptions clearWeak() {
        this.weak_ = false;
        this.bitField0_ &= -33;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.ctype_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, this.packed_);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, this.lazy_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, this.jstype_);
        }
        if ((this.bitField0_ & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(10, this.weak_);
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

    public final int getCtype() {
        return this.ctype_;
    }

    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    public final int getJstype() {
        return this.jstype_;
    }

    public final boolean getLazy() {
        return this.lazy_;
    }

    public final boolean getPacked() {
        return this.packed_;
    }

    public final boolean getWeak() {
        return this.weak_;
    }

    public final boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasDeprecated() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasWeak() {
        return (this.bitField0_ & 32) != 0;
    }

    public final FieldOptions mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.ctype_ = readTag;
                    readTag = this.bitField0_ | 1;
                }
            } else if (readTag == 16) {
                this.packed_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 2;
            } else if (readTag == 24) {
                this.deprecated_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 16;
            } else if (readTag == 40) {
                this.lazy_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 8;
            } else if (readTag == 48) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.jstype_ = readTag;
                    readTag = this.bitField0_ | 4;
                }
            } else if (readTag == 80) {
                this.weak_ = codedInputByteBufferNano.readBool();
                readTag = this.bitField0_ | 32;
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

    public final FieldOptions setCtype(int i) {
        this.ctype_ = i;
        this.bitField0_ |= 1;
        return this;
    }

    public final FieldOptions setDeprecated(boolean z) {
        this.deprecated_ = z;
        this.bitField0_ |= 16;
        return this;
    }

    public final FieldOptions setJstype(int i) {
        this.jstype_ = i;
        this.bitField0_ |= 4;
        return this;
    }

    public final FieldOptions setLazy(boolean z) {
        this.lazy_ = z;
        this.bitField0_ |= 8;
        return this;
    }

    public final FieldOptions setPacked(boolean z) {
        this.packed_ = z;
        this.bitField0_ |= 2;
        return this;
    }

    public final FieldOptions setWeak(boolean z) {
        this.weak_ = z;
        this.bitField0_ |= 32;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.ctype_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeBool(2, this.packed_);
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputByteBufferNano.writeBool(3, this.deprecated_);
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputByteBufferNano.writeBool(5, this.lazy_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(6, this.jstype_);
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputByteBufferNano.writeBool(10, this.weak_);
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
