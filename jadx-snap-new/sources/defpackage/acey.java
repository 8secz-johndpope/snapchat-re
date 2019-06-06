package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acey */
public final class acey extends ExtendableMessageNano<acey> {
    public int a;
    public Object b;

    public acey() {
        this.a = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, (String) this.b);
        }
        return this.a == 2 ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano) this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                this.a = 1;
            } else if (readTag == 18) {
                if (this.a != 2) {
                    this.b = new acew();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeString(1, (String) this.b);
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
