package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acda */
public final class acda extends ExtendableMessageNano<acda> {
    public accq a;
    private accr b;

    public acda() {
        this.b = null;
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accr accr = this.b;
        if (accr != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, accr);
        }
        accq accq = this.a;
        return accq != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, accq) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            MessageNano messageNano;
            if (readTag == 10) {
                if (this.b == null) {
                    this.b = new accr();
                }
                messageNano = this.b;
            } else if (readTag == 18) {
                if (this.a == null) {
                    this.a = new accq();
                }
                messageNano = this.a;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accr accr = this.b;
        if (accr != null) {
            codedOutputByteBufferNano.writeMessage(1, accr);
        }
        accq accq = this.a;
        if (accq != null) {
            codedOutputByteBufferNano.writeMessage(2, accq);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
