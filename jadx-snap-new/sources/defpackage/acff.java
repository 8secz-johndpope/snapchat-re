package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acff */
public final class acff extends ExtendableMessageNano<acff> {
    private int a;
    private String b;
    private acev c;

    public acff() {
        this.a = 0;
        this.b = "";
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.b);
        }
        acev acev = this.c;
        return acev != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, acev) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                this.a |= 1;
            } else if (readTag == 18) {
                if (this.c == null) {
                    this.c = new acev();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.b);
        }
        acev acev = this.c;
        if (acev != null) {
            codedOutputByteBufferNano.writeMessage(2, acev);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
