package com.google.protobuf.nano;

public final class DescriptorProto extends ExtendableMessageNano<DescriptorProto> {
    private static volatile DescriptorProto[] _emptyArray;
    private int bitField0_;
    public EnumDescriptorProto[] enumType;
    public FieldDescriptorProto[] extension;
    public ExtensionRange[] extensionRange;
    public FieldDescriptorProto[] field;
    private String name_;
    public DescriptorProto[] nestedType;
    public OneofDescriptorProto[] oneofDecl;
    public MessageOptions options;
    public String[] reservedName;
    public ReservedRange[] reservedRange;

    public static final class ExtensionRange extends ExtendableMessageNano<ExtensionRange> {
        private static volatile ExtensionRange[] _emptyArray;
        private int bitField0_;
        private int end_;
        private int start_;

        public ExtensionRange() {
            clear();
        }

        public static ExtensionRange[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ExtensionRange[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static ExtensionRange parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            return new ExtensionRange().mergeFrom(codedInputByteBufferNano);
        }

        public static ExtensionRange parseFrom(byte[] bArr) {
            return (ExtensionRange) MessageNano.mergeFrom(new ExtensionRange(), bArr);
        }

        public final ExtensionRange clear() {
            this.bitField0_ = 0;
            this.start_ = 0;
            this.end_ = 0;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public final ExtensionRange clearEnd() {
            this.end_ = 0;
            this.bitField0_ &= -3;
            return this;
        }

        public final ExtensionRange clearStart() {
            this.start_ = 0;
            this.bitField0_ &= -2;
            return this;
        }

        /* Access modifiers changed, original: protected|final */
        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if ((this.bitField0_ & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.start_);
            }
            return (this.bitField0_ & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, this.end_) : computeSerializedSize;
        }

        public final int getEnd() {
            return this.end_;
        }

        public final int getStart() {
            return this.start_;
        }

        public final boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public final ExtensionRange mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.start_ = codedInputByteBufferNano.readInt32();
                    readTag = this.bitField0_ | 1;
                } else if (readTag == 16) {
                    this.end_ = codedInputByteBufferNano.readInt32();
                    readTag = this.bitField0_ | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.bitField0_ = readTag;
            }
        }

        public final ExtensionRange setEnd(int i) {
            this.end_ = i;
            this.bitField0_ |= 2;
            return this;
        }

        public final ExtensionRange setStart(int i) {
            this.start_ = i;
            this.bitField0_ |= 1;
            return this;
        }

        public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputByteBufferNano.writeInt32(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputByteBufferNano.writeInt32(2, this.end_);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class ReservedRange extends ExtendableMessageNano<ReservedRange> {
        private static volatile ReservedRange[] _emptyArray;
        private int bitField0_;
        private int end_;
        private int start_;

        public ReservedRange() {
            clear();
        }

        public static ReservedRange[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ReservedRange[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static ReservedRange parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            return new ReservedRange().mergeFrom(codedInputByteBufferNano);
        }

        public static ReservedRange parseFrom(byte[] bArr) {
            return (ReservedRange) MessageNano.mergeFrom(new ReservedRange(), bArr);
        }

        public final ReservedRange clear() {
            this.bitField0_ = 0;
            this.start_ = 0;
            this.end_ = 0;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public final ReservedRange clearEnd() {
            this.end_ = 0;
            this.bitField0_ &= -3;
            return this;
        }

        public final ReservedRange clearStart() {
            this.start_ = 0;
            this.bitField0_ &= -2;
            return this;
        }

        /* Access modifiers changed, original: protected|final */
        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if ((this.bitField0_ & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.start_);
            }
            return (this.bitField0_ & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, this.end_) : computeSerializedSize;
        }

        public final int getEnd() {
            return this.end_;
        }

        public final int getStart() {
            return this.start_;
        }

        public final boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public final ReservedRange mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.start_ = codedInputByteBufferNano.readInt32();
                    readTag = this.bitField0_ | 1;
                } else if (readTag == 16) {
                    this.end_ = codedInputByteBufferNano.readInt32();
                    readTag = this.bitField0_ | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.bitField0_ = readTag;
            }
        }

        public final ReservedRange setEnd(int i) {
            this.end_ = i;
            this.bitField0_ |= 2;
            return this;
        }

        public final ReservedRange setStart(int i) {
            this.start_ = i;
            this.bitField0_ |= 1;
            return this;
        }

        public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputByteBufferNano.writeInt32(1, this.start_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputByteBufferNano.writeInt32(2, this.end_);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public DescriptorProto() {
        clear();
    }

    public static DescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new DescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static DescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new DescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static DescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProto) MessageNano.mergeFrom(new DescriptorProto(), bArr);
    }

    public final DescriptorProto clear() {
        this.bitField0_ = 0;
        this.name_ = "";
        this.field = FieldDescriptorProto.emptyArray();
        this.extension = FieldDescriptorProto.emptyArray();
        this.nestedType = emptyArray();
        this.enumType = EnumDescriptorProto.emptyArray();
        this.extensionRange = ExtensionRange.emptyArray();
        this.oneofDecl = OneofDescriptorProto.emptyArray();
        this.options = null;
        this.reservedRange = ReservedRange.emptyArray();
        this.reservedName = WireFormatNano.EMPTY_STRING_ARRAY;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final DescriptorProto clearName() {
        this.name_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        FieldDescriptorProto[] fieldDescriptorProtoArr;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.name_);
        }
        FieldDescriptorProto[] fieldDescriptorProtoArr2 = this.field;
        int i2 = 0;
        if (fieldDescriptorProtoArr2 != null && fieldDescriptorProtoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                fieldDescriptorProtoArr = this.field;
                if (computeSerializedSize >= fieldDescriptorProtoArr.length) {
                    break;
                }
                messageNano = fieldDescriptorProtoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        DescriptorProto[] descriptorProtoArr = this.nestedType;
        if (descriptorProtoArr != null && descriptorProtoArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                DescriptorProto[] descriptorProtoArr2 = this.nestedType;
                if (computeSerializedSize >= descriptorProtoArr2.length) {
                    break;
                }
                messageNano = descriptorProtoArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        EnumDescriptorProto[] enumDescriptorProtoArr = this.enumType;
        if (enumDescriptorProtoArr != null && enumDescriptorProtoArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                EnumDescriptorProto[] enumDescriptorProtoArr2 = this.enumType;
                if (computeSerializedSize >= enumDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = enumDescriptorProtoArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        ExtensionRange[] extensionRangeArr = this.extensionRange;
        if (extensionRangeArr != null && extensionRangeArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ExtensionRange[] extensionRangeArr2 = this.extensionRange;
                if (computeSerializedSize >= extensionRangeArr2.length) {
                    break;
                }
                messageNano = extensionRangeArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(5, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        fieldDescriptorProtoArr2 = this.extension;
        if (fieldDescriptorProtoArr2 != null && fieldDescriptorProtoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                fieldDescriptorProtoArr = this.extension;
                if (computeSerializedSize >= fieldDescriptorProtoArr.length) {
                    break;
                }
                messageNano = fieldDescriptorProtoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(6, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        MessageOptions messageOptions = this.options;
        if (messageOptions != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, messageOptions);
        }
        OneofDescriptorProto[] oneofDescriptorProtoArr = this.oneofDecl;
        if (oneofDescriptorProtoArr != null && oneofDescriptorProtoArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                OneofDescriptorProto[] oneofDescriptorProtoArr2 = this.oneofDecl;
                if (computeSerializedSize >= oneofDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = oneofDescriptorProtoArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(8, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        ReservedRange[] reservedRangeArr = this.reservedRange;
        if (reservedRangeArr != null && reservedRangeArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ReservedRange[] reservedRangeArr2 = this.reservedRange;
                if (computeSerializedSize >= reservedRangeArr2.length) {
                    break;
                }
                messageNano = reservedRangeArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(9, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        String[] strArr = this.reservedName;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        i = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.reservedName;
            if (i2 >= strArr2.length) {
                return (computeSerializedSize + i) + (i3 * 1);
            }
            String str = strArr2[i2];
            if (str != null) {
                i3++;
                i += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
            }
            i2++;
        }
    }

    public final String getName() {
        return this.name_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final DescriptorProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            FieldDescriptorProto[] fieldDescriptorProtoArr;
            int length;
            FieldDescriptorProto[] fieldDescriptorProtoArr2;
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.name_ = codedInputByteBufferNano.readString();
                    this.bitField0_ |= 1;
                    break;
                case 18:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    fieldDescriptorProtoArr = this.field;
                    length = fieldDescriptorProtoArr == null ? 0 : fieldDescriptorProtoArr.length;
                    fieldDescriptorProtoArr2 = new FieldDescriptorProto[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.field, 0, fieldDescriptorProtoArr2, 0, length);
                    }
                    while (length < fieldDescriptorProtoArr2.length - 1) {
                        fieldDescriptorProtoArr2[length] = new FieldDescriptorProto();
                        codedInputByteBufferNano.readMessage(fieldDescriptorProtoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    fieldDescriptorProtoArr2[length] = new FieldDescriptorProto();
                    codedInputByteBufferNano.readMessage(fieldDescriptorProtoArr2[length]);
                    this.field = fieldDescriptorProtoArr2;
                    break;
                case 26:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    DescriptorProto[] descriptorProtoArr = this.nestedType;
                    length = descriptorProtoArr == null ? 0 : descriptorProtoArr.length;
                    DescriptorProto[] descriptorProtoArr2 = new DescriptorProto[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.nestedType, 0, descriptorProtoArr2, 0, length);
                    }
                    while (length < descriptorProtoArr2.length - 1) {
                        descriptorProtoArr2[length] = new DescriptorProto();
                        codedInputByteBufferNano.readMessage(descriptorProtoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    descriptorProtoArr2[length] = new DescriptorProto();
                    codedInputByteBufferNano.readMessage(descriptorProtoArr2[length]);
                    this.nestedType = descriptorProtoArr2;
                    break;
                case 34:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    EnumDescriptorProto[] enumDescriptorProtoArr = this.enumType;
                    length = enumDescriptorProtoArr == null ? 0 : enumDescriptorProtoArr.length;
                    EnumDescriptorProto[] enumDescriptorProtoArr2 = new EnumDescriptorProto[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.enumType, 0, enumDescriptorProtoArr2, 0, length);
                    }
                    while (length < enumDescriptorProtoArr2.length - 1) {
                        enumDescriptorProtoArr2[length] = new EnumDescriptorProto();
                        codedInputByteBufferNano.readMessage(enumDescriptorProtoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    enumDescriptorProtoArr2[length] = new EnumDescriptorProto();
                    codedInputByteBufferNano.readMessage(enumDescriptorProtoArr2[length]);
                    this.enumType = enumDescriptorProtoArr2;
                    break;
                case 42:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    ExtensionRange[] extensionRangeArr = this.extensionRange;
                    length = extensionRangeArr == null ? 0 : extensionRangeArr.length;
                    ExtensionRange[] extensionRangeArr2 = new ExtensionRange[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.extensionRange, 0, extensionRangeArr2, 0, length);
                    }
                    while (length < extensionRangeArr2.length - 1) {
                        extensionRangeArr2[length] = new ExtensionRange();
                        codedInputByteBufferNano.readMessage(extensionRangeArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    extensionRangeArr2[length] = new ExtensionRange();
                    codedInputByteBufferNano.readMessage(extensionRangeArr2[length]);
                    this.extensionRange = extensionRangeArr2;
                    break;
                case 50:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    fieldDescriptorProtoArr = this.extension;
                    length = fieldDescriptorProtoArr == null ? 0 : fieldDescriptorProtoArr.length;
                    fieldDescriptorProtoArr2 = new FieldDescriptorProto[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.extension, 0, fieldDescriptorProtoArr2, 0, length);
                    }
                    while (length < fieldDescriptorProtoArr2.length - 1) {
                        fieldDescriptorProtoArr2[length] = new FieldDescriptorProto();
                        codedInputByteBufferNano.readMessage(fieldDescriptorProtoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    fieldDescriptorProtoArr2[length] = new FieldDescriptorProto();
                    codedInputByteBufferNano.readMessage(fieldDescriptorProtoArr2[length]);
                    this.extension = fieldDescriptorProtoArr2;
                    break;
                case 58:
                    if (this.options == null) {
                        this.options = new MessageOptions();
                    }
                    codedInputByteBufferNano.readMessage(this.options);
                    break;
                case 66:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    OneofDescriptorProto[] oneofDescriptorProtoArr = this.oneofDecl;
                    length = oneofDescriptorProtoArr == null ? 0 : oneofDescriptorProtoArr.length;
                    OneofDescriptorProto[] oneofDescriptorProtoArr2 = new OneofDescriptorProto[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.oneofDecl, 0, oneofDescriptorProtoArr2, 0, length);
                    }
                    while (length < oneofDescriptorProtoArr2.length - 1) {
                        oneofDescriptorProtoArr2[length] = new OneofDescriptorProto();
                        codedInputByteBufferNano.readMessage(oneofDescriptorProtoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    oneofDescriptorProtoArr2[length] = new OneofDescriptorProto();
                    codedInputByteBufferNano.readMessage(oneofDescriptorProtoArr2[length]);
                    this.oneofDecl = oneofDescriptorProtoArr2;
                    break;
                case 74:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                    ReservedRange[] reservedRangeArr = this.reservedRange;
                    length = reservedRangeArr == null ? 0 : reservedRangeArr.length;
                    ReservedRange[] reservedRangeArr2 = new ReservedRange[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.reservedRange, 0, reservedRangeArr2, 0, length);
                    }
                    while (length < reservedRangeArr2.length - 1) {
                        reservedRangeArr2[length] = new ReservedRange();
                        codedInputByteBufferNano.readMessage(reservedRangeArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    reservedRangeArr2[length] = new ReservedRange();
                    codedInputByteBufferNano.readMessage(reservedRangeArr2[length]);
                    this.reservedRange = reservedRangeArr2;
                    break;
                case 82:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    String[] strArr = this.reservedName;
                    length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.reservedName, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.reservedName = strArr2;
                    break;
                default:
                    if (storeUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                    return this;
            }
        }
    }

    public final DescriptorProto setName(String str) {
        if (str != null) {
            this.name_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        FieldDescriptorProto[] fieldDescriptorProtoArr;
        MessageNano messageNano;
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.name_);
        }
        FieldDescriptorProto[] fieldDescriptorProtoArr2 = this.field;
        int i2 = 0;
        if (fieldDescriptorProtoArr2 != null && fieldDescriptorProtoArr2.length > 0) {
            i = 0;
            while (true) {
                fieldDescriptorProtoArr = this.field;
                if (i >= fieldDescriptorProtoArr.length) {
                    break;
                }
                messageNano = fieldDescriptorProtoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        DescriptorProto[] descriptorProtoArr = this.nestedType;
        if (descriptorProtoArr != null && descriptorProtoArr.length > 0) {
            i = 0;
            while (true) {
                DescriptorProto[] descriptorProtoArr2 = this.nestedType;
                if (i >= descriptorProtoArr2.length) {
                    break;
                }
                messageNano = descriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(3, messageNano);
                }
                i++;
            }
        }
        EnumDescriptorProto[] enumDescriptorProtoArr = this.enumType;
        if (enumDescriptorProtoArr != null && enumDescriptorProtoArr.length > 0) {
            i = 0;
            while (true) {
                EnumDescriptorProto[] enumDescriptorProtoArr2 = this.enumType;
                if (i >= enumDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = enumDescriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i++;
            }
        }
        ExtensionRange[] extensionRangeArr = this.extensionRange;
        if (extensionRangeArr != null && extensionRangeArr.length > 0) {
            i = 0;
            while (true) {
                ExtensionRange[] extensionRangeArr2 = this.extensionRange;
                if (i >= extensionRangeArr2.length) {
                    break;
                }
                messageNano = extensionRangeArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(5, messageNano);
                }
                i++;
            }
        }
        fieldDescriptorProtoArr2 = this.extension;
        if (fieldDescriptorProtoArr2 != null && fieldDescriptorProtoArr2.length > 0) {
            i = 0;
            while (true) {
                fieldDescriptorProtoArr = this.extension;
                if (i >= fieldDescriptorProtoArr.length) {
                    break;
                }
                messageNano = fieldDescriptorProtoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(6, messageNano);
                }
                i++;
            }
        }
        MessageOptions messageOptions = this.options;
        if (messageOptions != null) {
            codedOutputByteBufferNano.writeMessage(7, messageOptions);
        }
        OneofDescriptorProto[] oneofDescriptorProtoArr = this.oneofDecl;
        if (oneofDescriptorProtoArr != null && oneofDescriptorProtoArr.length > 0) {
            i = 0;
            while (true) {
                OneofDescriptorProto[] oneofDescriptorProtoArr2 = this.oneofDecl;
                if (i >= oneofDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = oneofDescriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(8, messageNano);
                }
                i++;
            }
        }
        ReservedRange[] reservedRangeArr = this.reservedRange;
        if (reservedRangeArr != null && reservedRangeArr.length > 0) {
            i = 0;
            while (true) {
                ReservedRange[] reservedRangeArr2 = this.reservedRange;
                if (i >= reservedRangeArr2.length) {
                    break;
                }
                messageNano = reservedRangeArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(9, messageNano);
                }
                i++;
            }
        }
        String[] strArr = this.reservedName;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.reservedName;
                if (i2 >= strArr.length) {
                    break;
                }
                String str = strArr[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(10, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
