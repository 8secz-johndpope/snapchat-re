package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alew */
public final class alew extends ExtendableMessageNano<alew> {
    private int a;
    private boolean b;

    public alew() {
        this.a = 0;
        this.b = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean a() {
        return this.b;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return (this.a & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.b = codedInputByteBufferNano.readBool();
                this.a |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeBool(1, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
