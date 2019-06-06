package com.google.protobuf.nano;

public final class Empty extends ExtendableMessageNano<Empty> {
    private static volatile Empty[] _emptyArray;

    public Empty() {
        clear();
    }

    public static Empty[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new Empty[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Empty parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Empty().mergeFrom(codedInputByteBufferNano);
    }

    public static Empty parseFrom(byte[] bArr) {
        return (Empty) MessageNano.mergeFrom(new Empty(), bArr);
    }

    public final Empty clear() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final Empty mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        int readTag;
        do {
            readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
        } while (storeUnknownField(codedInputByteBufferNano, readTag));
        return this;
    }
}
