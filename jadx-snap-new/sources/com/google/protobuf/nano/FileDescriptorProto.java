package com.google.protobuf.nano;

public final class FileDescriptorProto extends ExtendableMessageNano<FileDescriptorProto> {
    private static volatile FileDescriptorProto[] _emptyArray;
    private int bitField0_;
    public String[] dependency;
    public EnumDescriptorProto[] enumType;
    public FieldDescriptorProto[] extension;
    public DescriptorProto[] messageType;
    private String name_;
    public FileOptions options;
    private String package__;
    public int[] publicDependency;
    public ServiceDescriptorProto[] service;
    public SourceCodeInfo sourceCodeInfo;
    private String syntax_;
    public int[] weakDependency;

    public FileDescriptorProto() {
        clear();
    }

    public static FileDescriptorProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new FileDescriptorProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static FileDescriptorProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new FileDescriptorProto().mergeFrom(codedInputByteBufferNano);
    }

    public static FileDescriptorProto parseFrom(byte[] bArr) {
        return (FileDescriptorProto) MessageNano.mergeFrom(new FileDescriptorProto(), bArr);
    }

    public final FileDescriptorProto clear() {
        this.bitField0_ = 0;
        String str = "";
        this.name_ = str;
        this.package__ = str;
        this.dependency = WireFormatNano.EMPTY_STRING_ARRAY;
        this.publicDependency = WireFormatNano.EMPTY_INT_ARRAY;
        this.weakDependency = WireFormatNano.EMPTY_INT_ARRAY;
        this.messageType = DescriptorProto.emptyArray();
        this.enumType = EnumDescriptorProto.emptyArray();
        this.service = ServiceDescriptorProto.emptyArray();
        this.extension = FieldDescriptorProto.emptyArray();
        this.options = null;
        this.sourceCodeInfo = null;
        this.syntax_ = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final FileDescriptorProto clearName() {
        this.name_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    public final FileDescriptorProto clearPackage() {
        this.package__ = "";
        this.bitField0_ &= -3;
        return this;
    }

    public final FileDescriptorProto clearSyntax() {
        this.syntax_ = "";
        this.bitField0_ &= -5;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int i2;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.package__);
        }
        String[] strArr = this.dependency;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i4 = 0;
            i2 = 0;
            while (true) {
                String[] strArr2 = this.dependency;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
                    i4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i4) + (i2 * 1);
        }
        DescriptorProto[] descriptorProtoArr = this.messageType;
        if (descriptorProtoArr != null && descriptorProtoArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                DescriptorProto[] descriptorProtoArr2 = this.messageType;
                if (computeSerializedSize >= descriptorProtoArr2.length) {
                    break;
                }
                messageNano = descriptorProtoArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
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
                    i += CodedOutputByteBufferNano.computeMessageSize(5, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        ServiceDescriptorProto[] serviceDescriptorProtoArr = this.service;
        if (serviceDescriptorProtoArr != null && serviceDescriptorProtoArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ServiceDescriptorProto[] serviceDescriptorProtoArr2 = this.service;
                if (computeSerializedSize >= serviceDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = serviceDescriptorProtoArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(6, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        FieldDescriptorProto[] fieldDescriptorProtoArr = this.extension;
        if (fieldDescriptorProtoArr != null && fieldDescriptorProtoArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                FieldDescriptorProto[] fieldDescriptorProtoArr2 = this.extension;
                if (computeSerializedSize >= fieldDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = fieldDescriptorProtoArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(7, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        FileOptions fileOptions = this.options;
        if (fileOptions != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, fileOptions);
        }
        SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo;
        if (sourceCodeInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(9, sourceCodeInfo);
        }
        int[] iArr = this.publicDependency;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            i = 0;
            i2 = 0;
            while (true) {
                iArr2 = this.publicDependency;
                if (i >= iArr2.length) {
                    break;
                }
                i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (iArr2.length * 1);
        }
        iArr = this.weakDependency;
        if (iArr != null && iArr.length > 0) {
            int[] iArr3;
            i = 0;
            while (true) {
                iArr3 = this.weakDependency;
                if (i3 >= iArr3.length) {
                    break;
                }
                i += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr3[i3]);
                i3++;
            }
            computeSerializedSize = (computeSerializedSize + i) + (iArr3.length * 1);
        }
        return (this.bitField0_ & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(12, this.syntax_) : computeSerializedSize;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPackage() {
        return this.package__;
    }

    public final String getSyntax() {
        return this.syntax_;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasSyntax() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX WARNING: Missing block: B:47:0x00c4, code skipped:
            r6.popLimit(r0);
     */
    /* JADX WARNING: Missing block: B:67:0x0116, code skipped:
            r6.readMessage(r0);
     */
    /* JADX WARNING: Missing block: B:125:0x025a, code skipped:
            r5.bitField0_ = r0;
     */
    public final com.google.protobuf.nano.FileDescriptorProto mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r6) {
        /*
        r5 = this;
    L_0x0000:
        r0 = r6.readTag();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x025e;
            case 10: goto L_0x0250;
            case 18: goto L_0x0245;
            case 26: goto L_0x0213;
            case 34: goto L_0x01d5;
            case 42: goto L_0x0197;
            case 50: goto L_0x0159;
            case 58: goto L_0x011b;
            case 66: goto L_0x0109;
            case 74: goto L_0x00fb;
            case 80: goto L_0x00c9;
            case 82: goto L_0x0089;
            case 88: goto L_0x0057;
            case 90: goto L_0x001b;
            case 98: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = r5.storeUnknownField(r6, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r5;
    L_0x000f:
        r0 = r6.readString();
        r5.syntax_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 4;
        goto L_0x025a;
    L_0x001b:
        r0 = r6.readRawVarint32();
        r0 = r6.pushLimit(r0);
        r2 = r6.getPosition();
        r3 = 0;
    L_0x0028:
        r4 = r6.getBytesUntilLimit();
        if (r4 <= 0) goto L_0x0034;
    L_0x002e:
        r6.readInt32();
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x0034:
        r6.rewindToPosition(r2);
        r2 = r5.weakDependency;
        if (r2 != 0) goto L_0x003d;
    L_0x003b:
        r2 = 0;
        goto L_0x003e;
    L_0x003d:
        r2 = r2.length;
    L_0x003e:
        r3 = r3 + r2;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0048;
    L_0x0043:
        r4 = r5.weakDependency;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0048:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x0054;
    L_0x004b:
        r1 = r6.readInt32();
        r3[r2] = r1;
        r2 = r2 + 1;
        goto L_0x0048;
    L_0x0054:
        r5.weakDependency = r3;
        goto L_0x00c4;
    L_0x0057:
        r0 = 88;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r2 = r5.weakDependency;
        if (r2 != 0) goto L_0x0063;
    L_0x0061:
        r2 = 0;
        goto L_0x0064;
    L_0x0063:
        r2 = r2.length;
    L_0x0064:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x006e;
    L_0x0069:
        r3 = r5.weakDependency;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x006e:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x007f;
    L_0x0073:
        r1 = r6.readInt32();
        r0[r2] = r1;
        r6.readTag();
        r2 = r2 + 1;
        goto L_0x006e;
    L_0x007f:
        r1 = r6.readInt32();
        r0[r2] = r1;
        r5.weakDependency = r0;
        goto L_0x0000;
    L_0x0089:
        r0 = r6.readRawVarint32();
        r0 = r6.pushLimit(r0);
        r2 = r6.getPosition();
        r3 = 0;
    L_0x0096:
        r4 = r6.getBytesUntilLimit();
        if (r4 <= 0) goto L_0x00a2;
    L_0x009c:
        r6.readInt32();
        r3 = r3 + 1;
        goto L_0x0096;
    L_0x00a2:
        r6.rewindToPosition(r2);
        r2 = r5.publicDependency;
        if (r2 != 0) goto L_0x00ab;
    L_0x00a9:
        r2 = 0;
        goto L_0x00ac;
    L_0x00ab:
        r2 = r2.length;
    L_0x00ac:
        r3 = r3 + r2;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x00b6;
    L_0x00b1:
        r4 = r5.publicDependency;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00b6:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x00c2;
    L_0x00b9:
        r1 = r6.readInt32();
        r3[r2] = r1;
        r2 = r2 + 1;
        goto L_0x00b6;
    L_0x00c2:
        r5.publicDependency = r3;
    L_0x00c4:
        r6.popLimit(r0);
        goto L_0x0000;
    L_0x00c9:
        r0 = 80;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r2 = r5.publicDependency;
        if (r2 != 0) goto L_0x00d5;
    L_0x00d3:
        r2 = 0;
        goto L_0x00d6;
    L_0x00d5:
        r2 = r2.length;
    L_0x00d6:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00e0;
    L_0x00db:
        r3 = r5.publicDependency;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00e0:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00f1;
    L_0x00e5:
        r1 = r6.readInt32();
        r0[r2] = r1;
        r6.readTag();
        r2 = r2 + 1;
        goto L_0x00e0;
    L_0x00f1:
        r1 = r6.readInt32();
        r0[r2] = r1;
        r5.publicDependency = r0;
        goto L_0x0000;
    L_0x00fb:
        r0 = r5.sourceCodeInfo;
        if (r0 != 0) goto L_0x0106;
    L_0x00ff:
        r0 = new com.google.protobuf.nano.SourceCodeInfo;
        r0.<init>();
        r5.sourceCodeInfo = r0;
    L_0x0106:
        r0 = r5.sourceCodeInfo;
        goto L_0x0116;
    L_0x0109:
        r0 = r5.options;
        if (r0 != 0) goto L_0x0114;
    L_0x010d:
        r0 = new com.google.protobuf.nano.FileOptions;
        r0.<init>();
        r5.options = r0;
    L_0x0114:
        r0 = r5.options;
    L_0x0116:
        r6.readMessage(r0);
        goto L_0x0000;
    L_0x011b:
        r0 = 58;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r2 = r5.extension;
        if (r2 != 0) goto L_0x0127;
    L_0x0125:
        r2 = 0;
        goto L_0x0128;
    L_0x0127:
        r2 = r2.length;
    L_0x0128:
        r0 = r0 + r2;
        r0 = new com.google.protobuf.nano.FieldDescriptorProto[r0];
        if (r2 == 0) goto L_0x0132;
    L_0x012d:
        r3 = r5.extension;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0132:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0149;
    L_0x0137:
        r1 = new com.google.protobuf.nano.FieldDescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r6.readTag();
        r2 = r2 + 1;
        goto L_0x0132;
    L_0x0149:
        r1 = new com.google.protobuf.nano.FieldDescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r5.extension = r0;
        goto L_0x0000;
    L_0x0159:
        r0 = 50;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r2 = r5.service;
        if (r2 != 0) goto L_0x0165;
    L_0x0163:
        r2 = 0;
        goto L_0x0166;
    L_0x0165:
        r2 = r2.length;
    L_0x0166:
        r0 = r0 + r2;
        r0 = new com.google.protobuf.nano.ServiceDescriptorProto[r0];
        if (r2 == 0) goto L_0x0170;
    L_0x016b:
        r3 = r5.service;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0170:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0187;
    L_0x0175:
        r1 = new com.google.protobuf.nano.ServiceDescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r6.readTag();
        r2 = r2 + 1;
        goto L_0x0170;
    L_0x0187:
        r1 = new com.google.protobuf.nano.ServiceDescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r5.service = r0;
        goto L_0x0000;
    L_0x0197:
        r0 = 42;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r2 = r5.enumType;
        if (r2 != 0) goto L_0x01a3;
    L_0x01a1:
        r2 = 0;
        goto L_0x01a4;
    L_0x01a3:
        r2 = r2.length;
    L_0x01a4:
        r0 = r0 + r2;
        r0 = new com.google.protobuf.nano.EnumDescriptorProto[r0];
        if (r2 == 0) goto L_0x01ae;
    L_0x01a9:
        r3 = r5.enumType;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x01ae:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x01c5;
    L_0x01b3:
        r1 = new com.google.protobuf.nano.EnumDescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r6.readTag();
        r2 = r2 + 1;
        goto L_0x01ae;
    L_0x01c5:
        r1 = new com.google.protobuf.nano.EnumDescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r5.enumType = r0;
        goto L_0x0000;
    L_0x01d5:
        r0 = 34;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r2 = r5.messageType;
        if (r2 != 0) goto L_0x01e1;
    L_0x01df:
        r2 = 0;
        goto L_0x01e2;
    L_0x01e1:
        r2 = r2.length;
    L_0x01e2:
        r0 = r0 + r2;
        r0 = new com.google.protobuf.nano.DescriptorProto[r0];
        if (r2 == 0) goto L_0x01ec;
    L_0x01e7:
        r3 = r5.messageType;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x01ec:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0203;
    L_0x01f1:
        r1 = new com.google.protobuf.nano.DescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r6.readTag();
        r2 = r2 + 1;
        goto L_0x01ec;
    L_0x0203:
        r1 = new com.google.protobuf.nano.DescriptorProto;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r6.readMessage(r1);
        r5.messageType = r0;
        goto L_0x0000;
    L_0x0213:
        r0 = 26;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r2 = r5.dependency;
        if (r2 != 0) goto L_0x021f;
    L_0x021d:
        r2 = 0;
        goto L_0x0220;
    L_0x021f:
        r2 = r2.length;
    L_0x0220:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x022a;
    L_0x0225:
        r3 = r5.dependency;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x022a:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x023b;
    L_0x022f:
        r1 = r6.readString();
        r0[r2] = r1;
        r6.readTag();
        r2 = r2 + 1;
        goto L_0x022a;
    L_0x023b:
        r1 = r6.readString();
        r0[r2] = r1;
        r5.dependency = r0;
        goto L_0x0000;
    L_0x0245:
        r0 = r6.readString();
        r5.package__ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 2;
        goto L_0x025a;
    L_0x0250:
        r0 = r6.readString();
        r5.name_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 1;
    L_0x025a:
        r5.bitField0_ = r0;
        goto L_0x0000;
    L_0x025e:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.FileDescriptorProto.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.FileDescriptorProto");
    }

    public final FileDescriptorProto setName(String str) {
        if (str != null) {
            this.name_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final FileDescriptorProto setPackage(String str) {
        if (str != null) {
            this.package__ = str;
            this.bitField0_ |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final FileDescriptorProto setSyntax(String str) {
        if (str != null) {
            this.syntax_ = str;
            this.bitField0_ |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        MessageNano messageNano;
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.package__);
        }
        String[] strArr = this.dependency;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            while (true) {
                String[] strArr2 = this.dependency;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        DescriptorProto[] descriptorProtoArr = this.messageType;
        if (descriptorProtoArr != null && descriptorProtoArr.length > 0) {
            i = 0;
            while (true) {
                DescriptorProto[] descriptorProtoArr2 = this.messageType;
                if (i >= descriptorProtoArr2.length) {
                    break;
                }
                messageNano = descriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
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
                    codedOutputByteBufferNano.writeMessage(5, messageNano);
                }
                i++;
            }
        }
        ServiceDescriptorProto[] serviceDescriptorProtoArr = this.service;
        if (serviceDescriptorProtoArr != null && serviceDescriptorProtoArr.length > 0) {
            i = 0;
            while (true) {
                ServiceDescriptorProto[] serviceDescriptorProtoArr2 = this.service;
                if (i >= serviceDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = serviceDescriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(6, messageNano);
                }
                i++;
            }
        }
        FieldDescriptorProto[] fieldDescriptorProtoArr = this.extension;
        if (fieldDescriptorProtoArr != null && fieldDescriptorProtoArr.length > 0) {
            i = 0;
            while (true) {
                FieldDescriptorProto[] fieldDescriptorProtoArr2 = this.extension;
                if (i >= fieldDescriptorProtoArr2.length) {
                    break;
                }
                messageNano = fieldDescriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(7, messageNano);
                }
                i++;
            }
        }
        FileOptions fileOptions = this.options;
        if (fileOptions != null) {
            codedOutputByteBufferNano.writeMessage(8, fileOptions);
        }
        SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo;
        if (sourceCodeInfo != null) {
            codedOutputByteBufferNano.writeMessage(9, sourceCodeInfo);
        }
        int[] iArr = this.publicDependency;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            while (true) {
                int[] iArr2 = this.publicDependency;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(10, iArr2[i]);
                i++;
            }
        }
        iArr = this.weakDependency;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                iArr = this.weakDependency;
                if (i2 >= iArr.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(11, iArr[i2]);
                i2++;
            }
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputByteBufferNano.writeString(12, this.syntax_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
