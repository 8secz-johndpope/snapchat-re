package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acdn */
public final class acdn extends ExtendableMessageNano<acdn> {
    public int a = 0;
    public Object b;
    public int c = 0;
    public String d;
    public String e;

    public acdn() {
        String str = "";
        this.d = str;
        this.e = str;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acdo a() {
        return this.a == 3 ? (acdo) this.b : null;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.d);
        }
        if ((this.c & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.e);
        }
        return this.a == 3 ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano) this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.c | 1;
            } else if (readTag == 18) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.c | 2;
            } else if (readTag == 26) {
                if (this.a != 3) {
                    this.b = new acdo();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = 3;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.c = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.d);
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.e);
        }
        if (this.a == 3) {
            codedOutputByteBufferNano.writeMessage(3, (MessageNano) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
