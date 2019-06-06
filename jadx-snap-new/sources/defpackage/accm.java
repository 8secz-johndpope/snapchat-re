package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: accm */
public final class accm extends ExtendableMessageNano<accm> {
    public String a;
    public accn b;
    public String c;
    private int d = 0;

    public accm() {
        String str = "";
        this.a = str;
        this.b = null;
        this.c = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        accn accn = this.b;
        if (accn != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, accn);
        }
        return (this.d & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
                readTag = this.d | 1;
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new accn();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.d | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.d = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        accn accn = this.b;
        if (accn != null) {
            codedOutputByteBufferNano.writeMessage(2, accn);
        }
        if ((this.d & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
