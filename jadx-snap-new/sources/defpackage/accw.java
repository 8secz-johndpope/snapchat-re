package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: accw */
public final class accw extends ExtendableMessageNano<accw> {
    public int a;
    public accn b;
    public String c;

    public accw() {
        this.a = 0;
        this.b = null;
        this.c = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accn accn = this.b;
        if (accn != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, accn);
        }
        return (this.a & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.b == null) {
                    this.b = new accn();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 18) {
                this.c = codedInputByteBufferNano.readString();
                this.a |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accn accn = this.b;
        if (accn != null) {
            codedOutputByteBufferNano.writeMessage(1, accn);
        }
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeString(2, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
