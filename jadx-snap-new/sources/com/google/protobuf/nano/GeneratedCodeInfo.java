package com.google.protobuf.nano;

public final class GeneratedCodeInfo extends ExtendableMessageNano<GeneratedCodeInfo> {
    private static volatile GeneratedCodeInfo[] _emptyArray;
    public Annotation[] annotation;

    public static final class Annotation extends ExtendableMessageNano<Annotation> {
        private static volatile Annotation[] _emptyArray;
        private int begin_;
        private int bitField0_;
        private int end_;
        public int[] path;
        private String sourceFile_;

        public Annotation() {
            clear();
        }

        public static Annotation[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new Annotation[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static Annotation parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            return new Annotation().mergeFrom(codedInputByteBufferNano);
        }

        public static Annotation parseFrom(byte[] bArr) {
            return (Annotation) MessageNano.mergeFrom(new Annotation(), bArr);
        }

        public final Annotation clear() {
            this.bitField0_ = 0;
            this.path = WireFormatNano.EMPTY_INT_ARRAY;
            this.sourceFile_ = "";
            this.begin_ = 0;
            this.end_ = 0;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public final Annotation clearBegin() {
            this.begin_ = 0;
            this.bitField0_ &= -3;
            return this;
        }

        public final Annotation clearEnd() {
            this.end_ = 0;
            this.bitField0_ &= -5;
            return this;
        }

        public final Annotation clearSourceFile() {
            this.sourceFile_ = "";
            this.bitField0_ &= -2;
            return this;
        }

        /* Access modifiers changed, original: protected|final */
        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int[] iArr = this.path;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.path;
                    if (i >= iArr2.length) {
                        break;
                    }
                    i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
                    i++;
                }
                computeSerializedSize = ((computeSerializedSize + i2) + 1) + CodedOutputByteBufferNano.computeRawVarint32Size(i2);
            }
            if ((this.bitField0_ & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.begin_);
            }
            return (this.bitField0_ & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, this.end_) : computeSerializedSize;
        }

        public final int getBegin() {
            return this.begin_;
        }

        public final int getEnd() {
            return this.end_;
        }

        public final String getSourceFile() {
            return this.sourceFile_;
        }

        public final boolean hasBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasSourceFile() {
            return (this.bitField0_ & 1) != 0;
        }

        public final Annotation mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                int[] iArr;
                int length;
                if (readTag == 8) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 8);
                    iArr = this.path;
                    length = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.path, 0, iArr2, 0, length);
                    }
                    while (length < iArr2.length - 1) {
                        iArr2[length] = codedInputByteBufferNano.readInt32();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    this.path = iArr2;
                } else if (readTag != 10) {
                    if (readTag == 18) {
                        this.sourceFile_ = codedInputByteBufferNano.readString();
                        readTag = this.bitField0_ | 1;
                    } else if (readTag == 24) {
                        this.begin_ = codedInputByteBufferNano.readInt32();
                        readTag = this.bitField0_ | 2;
                    } else if (readTag == 32) {
                        this.end_ = codedInputByteBufferNano.readInt32();
                        readTag = this.bitField0_ | 4;
                    } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    this.bitField0_ = readTag;
                } else {
                    readTag = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    length = codedInputByteBufferNano.getPosition();
                    int i = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        codedInputByteBufferNano.readInt32();
                        i++;
                    }
                    codedInputByteBufferNano.rewindToPosition(length);
                    iArr = this.path;
                    length = iArr == null ? 0 : iArr.length;
                    int[] iArr3 = new int[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.path, 0, iArr3, 0, length);
                    }
                    while (length < iArr3.length) {
                        iArr3[length] = codedInputByteBufferNano.readInt32();
                        length++;
                    }
                    this.path = iArr3;
                    codedInputByteBufferNano.popLimit(readTag);
                }
            }
        }

        public final Annotation setBegin(int i) {
            this.begin_ = i;
            this.bitField0_ |= 2;
            return this;
        }

        public final Annotation setEnd(int i) {
            this.end_ = i;
            this.bitField0_ |= 4;
            return this;
        }

        public final Annotation setSourceFile(String str) {
            if (str != null) {
                this.sourceFile_ = str;
                this.bitField0_ |= 1;
                return this;
            }
            throw new NullPointerException();
        }

        public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            int[] iArr = this.path;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr2 = this.path;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i2]);
                    i2++;
                }
                codedOutputByteBufferNano.writeRawVarint32(10);
                codedOutputByteBufferNano.writeRawVarint32(i3);
                while (true) {
                    int[] iArr3 = this.path;
                    if (i >= iArr3.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32NoTag(iArr3[i]);
                    i++;
                }
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputByteBufferNano.writeString(2, this.sourceFile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputByteBufferNano.writeInt32(3, this.begin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputByteBufferNano.writeInt32(4, this.end_);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public GeneratedCodeInfo() {
        clear();
    }

    public static GeneratedCodeInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new GeneratedCodeInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GeneratedCodeInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new GeneratedCodeInfo().mergeFrom(codedInputByteBufferNano);
    }

    public static GeneratedCodeInfo parseFrom(byte[] bArr) {
        return (GeneratedCodeInfo) MessageNano.mergeFrom(new GeneratedCodeInfo(), bArr);
    }

    public final GeneratedCodeInfo clear() {
        this.annotation = Annotation.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Annotation[] annotationArr = this.annotation;
        if (annotationArr != null && annotationArr.length > 0) {
            int i = 0;
            while (true) {
                Annotation[] annotationArr2 = this.annotation;
                if (i >= annotationArr2.length) {
                    break;
                }
                MessageNano messageNano = annotationArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final GeneratedCodeInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Annotation[] annotationArr = this.annotation;
                int length = annotationArr == null ? 0 : annotationArr.length;
                Annotation[] annotationArr2 = new Annotation[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.annotation, 0, annotationArr2, 0, length);
                }
                while (length < annotationArr2.length - 1) {
                    annotationArr2[length] = new Annotation();
                    codedInputByteBufferNano.readMessage(annotationArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                annotationArr2[length] = new Annotation();
                codedInputByteBufferNano.readMessage(annotationArr2[length]);
                this.annotation = annotationArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Annotation[] annotationArr = this.annotation;
        if (annotationArr != null && annotationArr.length > 0) {
            int i = 0;
            while (true) {
                Annotation[] annotationArr2 = this.annotation;
                if (i >= annotationArr2.length) {
                    break;
                }
                MessageNano messageNano = annotationArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
