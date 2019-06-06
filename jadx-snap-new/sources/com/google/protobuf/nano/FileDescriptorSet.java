package com.google.protobuf.nano;

public final class FileDescriptorSet extends ExtendableMessageNano<FileDescriptorSet> {
    private static volatile FileDescriptorSet[] _emptyArray;
    public FileDescriptorProto[] file;

    public FileDescriptorSet() {
        clear();
    }

    public static FileDescriptorSet[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new FileDescriptorSet[0];
                }
            }
        }
        return _emptyArray;
    }

    public static FileDescriptorSet parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new FileDescriptorSet().mergeFrom(codedInputByteBufferNano);
    }

    public static FileDescriptorSet parseFrom(byte[] bArr) {
        return (FileDescriptorSet) MessageNano.mergeFrom(new FileDescriptorSet(), bArr);
    }

    public final FileDescriptorSet clear() {
        this.file = FileDescriptorProto.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        FileDescriptorProto[] fileDescriptorProtoArr = this.file;
        if (fileDescriptorProtoArr != null && fileDescriptorProtoArr.length > 0) {
            int i = 0;
            while (true) {
                FileDescriptorProto[] fileDescriptorProtoArr2 = this.file;
                if (i >= fileDescriptorProtoArr2.length) {
                    break;
                }
                MessageNano messageNano = fileDescriptorProtoArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final FileDescriptorSet mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                FileDescriptorProto[] fileDescriptorProtoArr = this.file;
                int length = fileDescriptorProtoArr == null ? 0 : fileDescriptorProtoArr.length;
                FileDescriptorProto[] fileDescriptorProtoArr2 = new FileDescriptorProto[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.file, 0, fileDescriptorProtoArr2, 0, length);
                }
                while (length < fileDescriptorProtoArr2.length - 1) {
                    fileDescriptorProtoArr2[length] = new FileDescriptorProto();
                    codedInputByteBufferNano.readMessage(fileDescriptorProtoArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                fileDescriptorProtoArr2[length] = new FileDescriptorProto();
                codedInputByteBufferNano.readMessage(fileDescriptorProtoArr2[length]);
                this.file = fileDescriptorProtoArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        FileDescriptorProto[] fileDescriptorProtoArr = this.file;
        if (fileDescriptorProtoArr != null && fileDescriptorProtoArr.length > 0) {
            int i = 0;
            while (true) {
                FileDescriptorProto[] fileDescriptorProtoArr2 = this.file;
                if (i >= fileDescriptorProtoArr2.length) {
                    break;
                }
                MessageNano messageNano = fileDescriptorProtoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
