package com.google.protobuf.nano;

public final class UninterpretedOption extends ExtendableMessageNano<UninterpretedOption> {
    private static volatile UninterpretedOption[] _emptyArray;
    private String aggregateValue_;
    private int bitField0_;
    private double doubleValue_;
    private String identifierValue_;
    public NamePart[] name;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte[] stringValue_;

    public static final class NamePart extends ExtendableMessageNano<NamePart> {
        private static volatile NamePart[] _emptyArray;
        public boolean isExtension;
        public String namePart;

        public NamePart() {
            clear();
        }

        public static NamePart[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new NamePart[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static NamePart parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            return new NamePart().mergeFrom(codedInputByteBufferNano);
        }

        public static NamePart parseFrom(byte[] bArr) {
            return (NamePart) MessageNano.mergeFrom(new NamePart(), bArr);
        }

        public final NamePart clear() {
            this.namePart = "";
            this.isExtension = false;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        /* Access modifiers changed, original: protected|final */
        public final int computeSerializedSize() {
            return (super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.namePart)) + CodedOutputByteBufferNano.computeBoolSize(2, this.isExtension);
        }

        public final NamePart mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.namePart = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.isExtension = codedInputByteBufferNano.readBool();
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            codedOutputByteBufferNano.writeString(1, this.namePart);
            codedOutputByteBufferNano.writeBool(2, this.isExtension);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public UninterpretedOption() {
        clear();
    }

    public static UninterpretedOption[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new UninterpretedOption[0];
                }
            }
        }
        return _emptyArray;
    }

    public static UninterpretedOption parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new UninterpretedOption().mergeFrom(codedInputByteBufferNano);
    }

    public static UninterpretedOption parseFrom(byte[] bArr) {
        return (UninterpretedOption) MessageNano.mergeFrom(new UninterpretedOption(), bArr);
    }

    public final UninterpretedOption clear() {
        this.bitField0_ = 0;
        this.name = NamePart.emptyArray();
        String str = "";
        this.identifierValue_ = str;
        this.positiveIntValue_ = 0;
        this.negativeIntValue_ = 0;
        this.doubleValue_ = 0.0d;
        this.stringValue_ = WireFormatNano.EMPTY_BYTES;
        this.aggregateValue_ = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final UninterpretedOption clearAggregateValue() {
        this.aggregateValue_ = "";
        this.bitField0_ &= -33;
        return this;
    }

    public final UninterpretedOption clearDoubleValue() {
        this.doubleValue_ = 0.0d;
        this.bitField0_ &= -9;
        return this;
    }

    public final UninterpretedOption clearIdentifierValue() {
        this.identifierValue_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    public final UninterpretedOption clearNegativeIntValue() {
        this.negativeIntValue_ = 0;
        this.bitField0_ &= -5;
        return this;
    }

    public final UninterpretedOption clearPositiveIntValue() {
        this.positiveIntValue_ = 0;
        this.bitField0_ &= -3;
        return this;
    }

    public final UninterpretedOption clearStringValue() {
        this.stringValue_ = WireFormatNano.EMPTY_BYTES;
        this.bitField0_ &= -17;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        NamePart[] namePartArr = this.name;
        if (namePartArr != null && namePartArr.length > 0) {
            int i = 0;
            while (true) {
                NamePart[] namePartArr2 = this.name;
                if (i >= namePartArr2.length) {
                    break;
                }
                MessageNano messageNano = namePartArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                i++;
            }
        }
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.identifierValue_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, this.positiveIntValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(5, this.negativeIntValue_);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(6, this.doubleValue_);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.stringValue_);
        }
        return (this.bitField0_ & 32) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(8, this.aggregateValue_) : computeSerializedSize;
    }

    public final String getAggregateValue() {
        return this.aggregateValue_;
    }

    public final double getDoubleValue() {
        return this.doubleValue_;
    }

    public final String getIdentifierValue() {
        return this.identifierValue_;
    }

    public final long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    public final long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    public final byte[] getStringValue() {
        return this.stringValue_;
    }

    public final boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    public final UninterpretedOption mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 18) {
                if (readTag == 26) {
                    this.identifierValue_ = codedInputByteBufferNano.readString();
                    readTag = this.bitField0_ | 1;
                } else if (readTag == 32) {
                    this.positiveIntValue_ = codedInputByteBufferNano.readUInt64();
                    readTag = this.bitField0_ | 2;
                } else if (readTag == 40) {
                    this.negativeIntValue_ = codedInputByteBufferNano.readInt64();
                    readTag = this.bitField0_ | 4;
                } else if (readTag == 49) {
                    this.doubleValue_ = codedInputByteBufferNano.readDouble();
                    readTag = this.bitField0_ | 8;
                } else if (readTag == 58) {
                    this.stringValue_ = codedInputByteBufferNano.readBytes();
                    readTag = this.bitField0_ | 16;
                } else if (readTag == 66) {
                    this.aggregateValue_ = codedInputByteBufferNano.readString();
                    readTag = this.bitField0_ | 32;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.bitField0_ = readTag;
            } else {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                NamePart[] namePartArr = this.name;
                int length = namePartArr == null ? 0 : namePartArr.length;
                NamePart[] namePartArr2 = new NamePart[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.name, 0, namePartArr2, 0, length);
                }
                while (length < namePartArr2.length - 1) {
                    namePartArr2[length] = new NamePart();
                    codedInputByteBufferNano.readMessage(namePartArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                namePartArr2[length] = new NamePart();
                codedInputByteBufferNano.readMessage(namePartArr2[length]);
                this.name = namePartArr2;
            }
        }
    }

    public final UninterpretedOption setAggregateValue(String str) {
        if (str != null) {
            this.aggregateValue_ = str;
            this.bitField0_ |= 32;
            return this;
        }
        throw new NullPointerException();
    }

    public final UninterpretedOption setDoubleValue(double d) {
        this.doubleValue_ = d;
        this.bitField0_ |= 8;
        return this;
    }

    public final UninterpretedOption setIdentifierValue(String str) {
        if (str != null) {
            this.identifierValue_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final UninterpretedOption setNegativeIntValue(long j) {
        this.negativeIntValue_ = j;
        this.bitField0_ |= 4;
        return this;
    }

    public final UninterpretedOption setPositiveIntValue(long j) {
        this.positiveIntValue_ = j;
        this.bitField0_ |= 2;
        return this;
    }

    public final UninterpretedOption setStringValue(byte[] bArr) {
        if (bArr != null) {
            this.stringValue_ = bArr;
            this.bitField0_ |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        NamePart[] namePartArr = this.name;
        if (namePartArr != null && namePartArr.length > 0) {
            int i = 0;
            while (true) {
                NamePart[] namePartArr2 = this.name;
                if (i >= namePartArr2.length) {
                    break;
                }
                MessageNano messageNano = namePartArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(3, this.identifierValue_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeUInt64(4, this.positiveIntValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputByteBufferNano.writeInt64(5, this.negativeIntValue_);
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputByteBufferNano.writeDouble(6, this.doubleValue_);
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputByteBufferNano.writeBytes(7, this.stringValue_);
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputByteBufferNano.writeString(8, this.aggregateValue_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
