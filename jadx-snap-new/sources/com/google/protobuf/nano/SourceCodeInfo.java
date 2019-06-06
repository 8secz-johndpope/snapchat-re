package com.google.protobuf.nano;

public final class SourceCodeInfo extends ExtendableMessageNano<SourceCodeInfo> {
    private static volatile SourceCodeInfo[] _emptyArray;
    public Location[] location;

    public static final class Location extends ExtendableMessageNano<Location> {
        private static volatile Location[] _emptyArray;
        private int bitField0_;
        private String leadingComments_;
        public String[] leadingDetachedComments;
        public int[] path;
        public int[] span;
        private String trailingComments_;

        public Location() {
            clear();
        }

        public static Location[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new Location[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static Location parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            return new Location().mergeFrom(codedInputByteBufferNano);
        }

        public static Location parseFrom(byte[] bArr) {
            return (Location) MessageNano.mergeFrom(new Location(), bArr);
        }

        public final Location clear() {
            this.bitField0_ = 0;
            this.path = WireFormatNano.EMPTY_INT_ARRAY;
            this.span = WireFormatNano.EMPTY_INT_ARRAY;
            String str = "";
            this.leadingComments_ = str;
            this.trailingComments_ = str;
            this.leadingDetachedComments = WireFormatNano.EMPTY_STRING_ARRAY;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public final Location clearLeadingComments() {
            this.leadingComments_ = "";
            this.bitField0_ &= -2;
            return this;
        }

        public final Location clearTrailingComments() {
            this.trailingComments_ = "";
            this.bitField0_ &= -3;
            return this;
        }

        /* Access modifiers changed, original: protected|final */
        public final int computeSerializedSize() {
            int i;
            int i2;
            int[] iArr;
            int computeSerializedSize = super.computeSerializedSize();
            int[] iArr2 = this.path;
            int i3 = 0;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                i2 = 0;
                while (true) {
                    iArr = this.path;
                    if (i >= iArr.length) {
                        break;
                    }
                    i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i]);
                    i++;
                }
                computeSerializedSize = ((computeSerializedSize + i2) + 1) + CodedOutputByteBufferNano.computeRawVarint32Size(i2);
            }
            iArr2 = this.span;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                i2 = 0;
                while (true) {
                    iArr = this.span;
                    if (i >= iArr.length) {
                        break;
                    }
                    i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i]);
                    i++;
                }
                computeSerializedSize = ((computeSerializedSize + i2) + 1) + CodedOutputByteBufferNano.computeRawVarint32Size(i2);
            }
            if ((this.bitField0_ & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.trailingComments_);
            }
            String[] strArr = this.leadingDetachedComments;
            if (strArr == null || strArr.length <= 0) {
                return computeSerializedSize;
            }
            i = 0;
            i2 = 0;
            while (true) {
                String[] strArr2 = this.leadingDetachedComments;
                if (i3 >= strArr2.length) {
                    return (computeSerializedSize + i) + (i2 * 1);
                }
                String str = strArr2[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i3++;
            }
        }

        public final String getLeadingComments() {
            return this.leadingComments_;
        }

        public final String getTrailingComments() {
            return this.trailingComments_;
        }

        public final boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        public final Location mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                int position;
                int[] iArr;
                int[] iArr2;
                if (readTag != 8) {
                    int i;
                    int[] iArr3;
                    if (readTag == 10) {
                        readTag = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        position = codedInputByteBufferNano.getPosition();
                        i = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position);
                        iArr = this.path;
                        position = iArr == null ? 0 : iArr.length;
                        iArr3 = new int[(i + position)];
                        if (position != 0) {
                            System.arraycopy(this.path, 0, iArr3, 0, position);
                        }
                        while (position < iArr3.length) {
                            iArr3[position] = codedInputByteBufferNano.readInt32();
                            position++;
                        }
                        this.path = iArr3;
                    } else if (readTag == 16) {
                        readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                        iArr = this.span;
                        position = iArr == null ? 0 : iArr.length;
                        iArr2 = new int[(readTag + position)];
                        if (position != 0) {
                            System.arraycopy(this.span, 0, iArr2, 0, position);
                        }
                        while (position < iArr2.length - 1) {
                            iArr2[position] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            position++;
                        }
                        iArr2[position] = codedInputByteBufferNano.readInt32();
                        this.span = iArr2;
                    } else if (readTag != 18) {
                        if (readTag == 26) {
                            this.leadingComments_ = codedInputByteBufferNano.readString();
                            readTag = this.bitField0_ | 1;
                        } else if (readTag == 34) {
                            this.trailingComments_ = codedInputByteBufferNano.readString();
                            readTag = this.bitField0_ | 2;
                        } else if (readTag == 50) {
                            readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                            String[] strArr = this.leadingDetachedComments;
                            position = strArr == null ? 0 : strArr.length;
                            String[] strArr2 = new String[(readTag + position)];
                            if (position != 0) {
                                System.arraycopy(this.leadingDetachedComments, 0, strArr2, 0, position);
                            }
                            while (position < strArr2.length - 1) {
                                strArr2[position] = codedInputByteBufferNano.readString();
                                codedInputByteBufferNano.readTag();
                                position++;
                            }
                            strArr2[position] = codedInputByteBufferNano.readString();
                            this.leadingDetachedComments = strArr2;
                        } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                            return this;
                        }
                        this.bitField0_ = readTag;
                    } else {
                        readTag = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        position = codedInputByteBufferNano.getPosition();
                        i = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position);
                        iArr = this.span;
                        position = iArr == null ? 0 : iArr.length;
                        iArr3 = new int[(i + position)];
                        if (position != 0) {
                            System.arraycopy(this.span, 0, iArr3, 0, position);
                        }
                        while (position < iArr3.length) {
                            iArr3[position] = codedInputByteBufferNano.readInt32();
                            position++;
                        }
                        this.span = iArr3;
                    }
                    codedInputByteBufferNano.popLimit(readTag);
                } else {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 8);
                    iArr = this.path;
                    position = iArr == null ? 0 : iArr.length;
                    iArr2 = new int[(readTag + position)];
                    if (position != 0) {
                        System.arraycopy(this.path, 0, iArr2, 0, position);
                    }
                    while (position < iArr2.length - 1) {
                        iArr2[position] = codedInputByteBufferNano.readInt32();
                        codedInputByteBufferNano.readTag();
                        position++;
                    }
                    iArr2[position] = codedInputByteBufferNano.readInt32();
                    this.path = iArr2;
                }
            }
        }

        public final Location setLeadingComments(String str) {
            if (str != null) {
                this.leadingComments_ = str;
                this.bitField0_ |= 1;
                return this;
            }
            throw new NullPointerException();
        }

        public final Location setTrailingComments(String str) {
            if (str != null) {
                this.trailingComments_ = str;
                this.bitField0_ |= 2;
                return this;
            }
            throw new NullPointerException();
        }

        public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            int i;
            int i2;
            int[] iArr;
            int[] iArr2;
            int[] iArr3 = this.path;
            int i3 = 0;
            if (iArr3 != null && iArr3.length > 0) {
                i = 0;
                i2 = 0;
                while (true) {
                    iArr = this.path;
                    if (i >= iArr.length) {
                        break;
                    }
                    i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i]);
                    i++;
                }
                codedOutputByteBufferNano.writeRawVarint32(10);
                codedOutputByteBufferNano.writeRawVarint32(i2);
                i = 0;
                while (true) {
                    iArr2 = this.path;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32NoTag(iArr2[i]);
                    i++;
                }
            }
            iArr3 = this.span;
            if (iArr3 != null && iArr3.length > 0) {
                i = 0;
                i2 = 0;
                while (true) {
                    iArr = this.span;
                    if (i >= iArr.length) {
                        break;
                    }
                    i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i]);
                    i++;
                }
                codedOutputByteBufferNano.writeRawVarint32(18);
                codedOutputByteBufferNano.writeRawVarint32(i2);
                i = 0;
                while (true) {
                    iArr2 = this.span;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32NoTag(iArr2[i]);
                    i++;
                }
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputByteBufferNano.writeString(3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputByteBufferNano.writeString(4, this.trailingComments_);
            }
            String[] strArr = this.leadingDetachedComments;
            if (strArr != null && strArr.length > 0) {
                while (true) {
                    strArr = this.leadingDetachedComments;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    String str = strArr[i3];
                    if (str != null) {
                        codedOutputByteBufferNano.writeString(6, str);
                    }
                    i3++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public SourceCodeInfo() {
        clear();
    }

    public static SourceCodeInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new SourceCodeInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SourceCodeInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new SourceCodeInfo().mergeFrom(codedInputByteBufferNano);
    }

    public static SourceCodeInfo parseFrom(byte[] bArr) {
        return (SourceCodeInfo) MessageNano.mergeFrom(new SourceCodeInfo(), bArr);
    }

    public final SourceCodeInfo clear() {
        this.location = Location.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Location[] locationArr = this.location;
        if (locationArr != null && locationArr.length > 0) {
            int i = 0;
            while (true) {
                Location[] locationArr2 = this.location;
                if (i >= locationArr2.length) {
                    break;
                }
                MessageNano messageNano = locationArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final SourceCodeInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Location[] locationArr = this.location;
                int length = locationArr == null ? 0 : locationArr.length;
                Location[] locationArr2 = new Location[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.location, 0, locationArr2, 0, length);
                }
                while (length < locationArr2.length - 1) {
                    locationArr2[length] = new Location();
                    codedInputByteBufferNano.readMessage(locationArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                locationArr2[length] = new Location();
                codedInputByteBufferNano.readMessage(locationArr2[length]);
                this.location = locationArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Location[] locationArr = this.location;
        if (locationArr != null && locationArr.length > 0) {
            int i = 0;
            while (true) {
                Location[] locationArr2 = this.location;
                if (i >= locationArr2.length) {
                    break;
                }
                MessageNano messageNano = locationArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
