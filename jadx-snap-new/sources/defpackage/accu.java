package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: accu */
public final class accu extends ExtendableMessageNano<accu> {
    public accn a;

    public accu() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accn accn = this.a;
        return accn != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, accn) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new accn();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accn accn = this.a;
        if (accn != null) {
            codedOutputByteBufferNano.writeMessage(1, accn);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
