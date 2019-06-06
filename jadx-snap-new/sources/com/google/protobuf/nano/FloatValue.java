package com.google.protobuf.nano;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class FloatValue extends ExtendableMessageNano<FloatValue> {
    private static volatile FloatValue[] _emptyArray;
    private int bitField0_;
    private float value_;

    public FloatValue() {
        clear();
    }

    public static FloatValue[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new FloatValue[0];
                }
            }
        }
        return _emptyArray;
    }

    public static FloatValue parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new FloatValue().mergeFrom(codedInputByteBufferNano);
    }

    public static FloatValue parseFrom(byte[] bArr) {
        return (FloatValue) MessageNano.mergeFrom(new FloatValue(), bArr);
    }

    public final FloatValue clear() {
        this.bitField0_ = 0;
        this.value_ = MapboxConstants.MINIMUM_ZOOM;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final FloatValue clearValue() {
        this.value_ = MapboxConstants.MINIMUM_ZOOM;
        this.bitField0_ &= -2;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.bitField0_ & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeFloatSize(1, this.value_) : computeSerializedSize;
    }

    public final float getValue() {
        return this.value_;
    }

    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public final FloatValue mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 13) {
                this.value_ = codedInputByteBufferNano.readFloat();
                this.bitField0_ |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final FloatValue setValue(float f) {
        this.value_ = f;
        this.bitField0_ |= 1;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeFloat(1, this.value_);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
