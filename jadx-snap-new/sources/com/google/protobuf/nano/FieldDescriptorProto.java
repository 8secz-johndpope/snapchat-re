package com.google.protobuf.nano;

public final class FieldDescriptorProto extends ExtendableMessageNano<FieldDescriptorProto> {
    public static final int LABEL_OPTIONAL = 1;
    public static final int LABEL_REPEATED = 3;
    public static final int LABEL_REQUIRED = 2;
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    private static volatile FieldDescriptorProto[] _emptyArray;
    private int bitField0_;
    private String defaultValue_;
    private String extendee_;
    private String jsonName_;
    private int label_;
    private String name_;
    private int number_;
    private int oneofIndex_;
    public FieldOptions options;
    private String typeName_;
    private int type_;

    public FieldDescriptorProto() {
        clear();
    }

    public static FieldDescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new FieldDescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static FieldDescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new FieldDescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static FieldDescriptorProto parseFrom(byte[] bArr) {
        return (FieldDescriptorProto) MessageNano.mergeFrom(new FieldDescriptorProto(), bArr);
    }

    public final FieldDescriptorProto clear() {
        this.bitField0_ = 0;
        String str = "";
        this.name_ = str;
        this.number_ = 0;
        this.label_ = 1;
        this.type_ = 1;
        this.typeName_ = str;
        this.extendee_ = str;
        this.defaultValue_ = str;
        this.oneofIndex_ = 0;
        this.jsonName_ = str;
        this.options = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final FieldDescriptorProto clearDefaultValue() {
        this.defaultValue_ = "";
        this.bitField0_ &= -65;
        return this;
    }

    public final FieldDescriptorProto clearExtendee() {
        this.extendee_ = "";
        this.bitField0_ &= -33;
        return this;
    }

    public final FieldDescriptorProto clearJsonName() {
        this.jsonName_ = "";
        this.bitField0_ &= -257;
        return this;
    }

    public final FieldDescriptorProto clearLabel() {
        this.label_ = 1;
        this.bitField0_ &= -5;
        return this;
    }

    public final FieldDescriptorProto clearName() {
        this.name_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    public final FieldDescriptorProto clearNumber() {
        this.number_ = 0;
        this.bitField0_ &= -3;
        return this;
    }

    public final FieldDescriptorProto clearOneofIndex() {
        this.oneofIndex_ = 0;
        this.bitField0_ &= -129;
        return this;
    }

    public final FieldDescriptorProto clearType() {
        this.type_ = 1;
        this.bitField0_ &= -9;
        return this;
    }

    public final FieldDescriptorProto clearTypeName() {
        this.typeName_ = "";
        this.bitField0_ &= -17;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.name_);
        }
        if ((this.bitField0_ & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.extendee_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, this.label_);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, this.type_);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.typeName_);
        }
        if ((this.bitField0_ & 64) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.defaultValue_);
        }
        FieldOptions fieldOptions = this.options;
        if (fieldOptions != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, fieldOptions);
        }
        if ((this.bitField0_ & 128) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, this.oneofIndex_);
        }
        return (this.bitField0_ & 256) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.jsonName_) : computeSerializedSize;
    }

    public final String getDefaultValue() {
        return this.defaultValue_;
    }

    public final String getExtendee() {
        return this.extendee_;
    }

    public final String getJsonName() {
        return this.jsonName_;
    }

    public final int getLabel() {
        return this.label_;
    }

    public final String getName() {
        return this.name_;
    }

    public final int getNumber() {
        return this.number_;
    }

    public final int getOneofIndex() {
        return this.oneofIndex_;
    }

    public final int getType() {
        return this.type_;
    }

    public final String getTypeName() {
        return this.typeName_;
    }

    public final boolean hasDefaultValue() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasExtendee() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasJsonName() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasOneofIndex() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasTypeName() {
        return (this.bitField0_ & 16) != 0;
    }

    public final com.google.protobuf.nano.FieldDescriptorProto mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r4) {
        /*
        r3 = this;
    L_0x0000:
        r0 = r4.readTag();
        r1 = 2;
        r2 = 1;
        switch(r0) {
            case 0: goto L_0x0091;
            case 10: goto L_0x0084;
            case 18: goto L_0x0079;
            case 24: goto L_0x006f;
            case 32: goto L_0x005c;
            case 40: goto L_0x004d;
            case 50: goto L_0x0042;
            case 58: goto L_0x0037;
            case 66: goto L_0x0026;
            case 72: goto L_0x001b;
            case 82: goto L_0x0010;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = r3.storeUnknownField(r4, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000f:
        return r3;
    L_0x0010:
        r0 = r4.readString();
        r3.jsonName_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | 256;
        goto L_0x008d;
    L_0x001b:
        r0 = r4.readInt32();
        r3.oneofIndex_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | 128;
        goto L_0x008d;
    L_0x0026:
        r0 = r3.options;
        if (r0 != 0) goto L_0x0031;
    L_0x002a:
        r0 = new com.google.protobuf.nano.FieldOptions;
        r0.<init>();
        r3.options = r0;
    L_0x0031:
        r0 = r3.options;
        r4.readMessage(r0);
        goto L_0x0000;
    L_0x0037:
        r0 = r4.readString();
        r3.defaultValue_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | 64;
        goto L_0x008d;
    L_0x0042:
        r0 = r4.readString();
        r3.typeName_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | 16;
        goto L_0x008d;
    L_0x004d:
        r0 = r4.readInt32();
        switch(r0) {
            case 1: goto L_0x0055;
            case 2: goto L_0x0055;
            case 3: goto L_0x0055;
            case 4: goto L_0x0055;
            case 5: goto L_0x0055;
            case 6: goto L_0x0055;
            case 7: goto L_0x0055;
            case 8: goto L_0x0055;
            case 9: goto L_0x0055;
            case 10: goto L_0x0055;
            case 11: goto L_0x0055;
            case 12: goto L_0x0055;
            case 13: goto L_0x0055;
            case 14: goto L_0x0055;
            case 15: goto L_0x0055;
            case 16: goto L_0x0055;
            case 17: goto L_0x0055;
            case 18: goto L_0x0055;
            default: goto L_0x0054;
        };
    L_0x0054:
        goto L_0x0000;
    L_0x0055:
        r3.type_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | 8;
        goto L_0x008d;
    L_0x005c:
        r0 = r4.readInt32();
        if (r0 == r2) goto L_0x0068;
    L_0x0062:
        if (r0 == r1) goto L_0x0068;
    L_0x0064:
        r1 = 3;
        if (r0 == r1) goto L_0x0068;
    L_0x0067:
        goto L_0x0000;
    L_0x0068:
        r3.label_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | 4;
        goto L_0x008d;
    L_0x006f:
        r0 = r4.readInt32();
        r3.number_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | r1;
        goto L_0x008d;
    L_0x0079:
        r0 = r4.readString();
        r3.extendee_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | 32;
        goto L_0x008d;
    L_0x0084:
        r0 = r4.readString();
        r3.name_ = r0;
        r0 = r3.bitField0_;
        r0 = r0 | r2;
    L_0x008d:
        r3.bitField0_ = r0;
        goto L_0x0000;
    L_0x0091:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.FieldDescriptorProto.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.FieldDescriptorProto");
    }

    public final FieldDescriptorProto setDefaultValue(String str) {
        if (str != null) {
            this.defaultValue_ = str;
            this.bitField0_ |= 64;
            return this;
        }
        throw new NullPointerException();
    }

    public final FieldDescriptorProto setExtendee(String str) {
        if (str != null) {
            this.extendee_ = str;
            this.bitField0_ |= 32;
            return this;
        }
        throw new NullPointerException();
    }

    public final FieldDescriptorProto setJsonName(String str) {
        if (str != null) {
            this.jsonName_ = str;
            this.bitField0_ |= 256;
            return this;
        }
        throw new NullPointerException();
    }

    public final FieldDescriptorProto setLabel(int i) {
        this.label_ = i;
        this.bitField0_ |= 4;
        return this;
    }

    public final FieldDescriptorProto setName(String str) {
        if (str != null) {
            this.name_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final FieldDescriptorProto setNumber(int i) {
        this.number_ = i;
        this.bitField0_ |= 2;
        return this;
    }

    public final FieldDescriptorProto setOneofIndex(int i) {
        this.oneofIndex_ = i;
        this.bitField0_ |= 128;
        return this;
    }

    public final FieldDescriptorProto setType(int i) {
        this.type_ = i;
        this.bitField0_ |= 8;
        return this;
    }

    public final FieldDescriptorProto setTypeName(String str) {
        if (str != null) {
            this.typeName_ = str;
            this.bitField0_ |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.name_);
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputByteBufferNano.writeString(2, this.extendee_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.number_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.label_);
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(5, this.type_);
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputByteBufferNano.writeString(6, this.typeName_);
        }
        if ((this.bitField0_ & 64) != 0) {
            codedOutputByteBufferNano.writeString(7, this.defaultValue_);
        }
        FieldOptions fieldOptions = this.options;
        if (fieldOptions != null) {
            codedOutputByteBufferNano.writeMessage(8, fieldOptions);
        }
        if ((this.bitField0_ & 128) != 0) {
            codedOutputByteBufferNano.writeInt32(9, this.oneofIndex_);
        }
        if ((this.bitField0_ & 256) != 0) {
            codedOutputByteBufferNano.writeString(10, this.jsonName_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
