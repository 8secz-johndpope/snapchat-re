package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: aeba */
public final class aeba extends ExtendableMessageNano<aeba> {
    public String a;
    public float b;

    public aeba() {
        this.a = "";
        this.b = MapboxConstants.MINIMUM_ZOOM;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        return Float.floatToIntBits(this.b) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM) ? computeSerializedSize + CodedOutputByteBufferNano.computeFloatSize(2, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 21) {
                this.b = codedInputByteBufferNano.readFloat();
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
