package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acgr */
public final class acgr extends ExtendableMessageNano<acgr> {
    private int a;
    private long b;
    private float c;
    private float d;
    private boolean e;

    public acgr() {
        this.a = 0;
        this.b = 0;
        this.c = MapboxConstants.MINIMUM_ZOOM;
        this.d = MapboxConstants.MINIMUM_ZOOM;
        this.e = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(3, this.d);
        }
        return (this.a & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.b = codedInputByteBufferNano.readUInt64();
                readTag = this.a | 1;
            } else if (readTag == 21) {
                this.c = codedInputByteBufferNano.readFloat();
                readTag = this.a | 2;
            } else if (readTag == 29) {
                this.d = codedInputByteBufferNano.readFloat();
                readTag = this.a | 4;
            } else if (readTag == 32) {
                this.e = codedInputByteBufferNano.readBool();
                readTag = this.a | 8;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeUInt64(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeFloat(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeFloat(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
