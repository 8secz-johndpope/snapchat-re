package com.google.protobuf.nano;

public final class Timestamp extends ExtendableMessageNano<Timestamp> {
    private static volatile Timestamp[] _emptyArray;
    private int bitField0_;
    private int nanos_;
    private long seconds_;

    public Timestamp() {
        clear();
    }

    public static Timestamp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new Timestamp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static Timestamp parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Timestamp().mergeFrom(codedInputByteBufferNano);
    }

    public static Timestamp parseFrom(byte[] bArr) {
        return (Timestamp) MessageNano.mergeFrom(new Timestamp(), bArr);
    }

    public final Timestamp clear() {
        this.bitField0_ = 0;
        this.seconds_ = 0;
        this.nanos_ = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final Timestamp clearNanos() {
        this.nanos_ = 0;
        this.bitField0_ &= -3;
        return this;
    }

    public final Timestamp clearSeconds() {
        this.seconds_ = 0;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, this.seconds_);
        }
        return (this.bitField0_ & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, this.nanos_) : computeSerializedSize;
    }

    public final int getNanos() {
        return this.nanos_;
    }

    public final long getSeconds() {
        return this.seconds_;
    }

    public final boolean hasNanos() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Timestamp mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.seconds_ = codedInputByteBufferNano.readInt64();
                readTag = this.bitField0_ | 1;
            } else if (readTag == 16) {
                this.nanos_ = codedInputByteBufferNano.readInt32();
                readTag = this.bitField0_ | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.bitField0_ = readTag;
        }
    }

    public final Timestamp setNanos(int i) {
        this.nanos_ = i;
        this.bitField0_ |= 2;
        return this;
    }

    public final Timestamp setSeconds(long j) {
        this.seconds_ = j;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(1, this.seconds_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.nanos_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
