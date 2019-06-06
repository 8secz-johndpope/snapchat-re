package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: aeah */
public final class aeah extends ExtendableMessageNano<aeah> {
    public String a;
    public adzp b;
    public float c;

    public aeah() {
        this.a = "";
        this.b = null;
        this.c = MapboxConstants.MINIMUM_ZOOM;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        adzp adzp = this.b;
        if (adzp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, adzp);
        }
        return Float.floatToIntBits(this.c) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM) ? computeSerializedSize + CodedOutputByteBufferNano.computeFloatSize(3, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new adzp();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 29) {
                this.c = codedInputByteBufferNano.readFloat();
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        adzp adzp = this.b;
        if (adzp != null) {
            codedOutputByteBufferNano.writeMessage(2, adzp);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
