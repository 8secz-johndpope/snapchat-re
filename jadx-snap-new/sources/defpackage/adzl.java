package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: adzl */
public final class adzl extends ExtendableMessageNano<adzl> {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;

    public adzl() {
        this.a = MapboxConstants.MINIMUM_ZOOM;
        this.b = MapboxConstants.MINIMUM_ZOOM;
        this.c = MapboxConstants.MINIMUM_ZOOM;
        this.d = MapboxConstants.MINIMUM_ZOOM;
        this.e = MapboxConstants.MINIMUM_ZOOM;
        this.f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(2, this.b);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(4, this.d);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(5, this.e);
        }
        int i = this.f;
        return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(6, i) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 13) {
                this.a = codedInputByteBufferNano.readFloat();
            } else if (readTag == 21) {
                this.b = codedInputByteBufferNano.readFloat();
            } else if (readTag == 29) {
                this.c = codedInputByteBufferNano.readFloat();
            } else if (readTag == 37) {
                this.d = codedInputByteBufferNano.readFloat();
            } else if (readTag == 45) {
                this.e = codedInputByteBufferNano.readFloat();
            } else if (readTag == 48) {
                this.f = codedInputByteBufferNano.readInt32();
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(2, this.b);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(4, this.d);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(5, this.e);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
