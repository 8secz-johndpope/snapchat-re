package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acek */
public final class acek extends ExtendableMessageNano<acek> {
    public int a;
    public acgd b;
    public long c;
    public String d;

    public acek() {
        this.a = 0;
        this.b = null;
        this.c = 0;
        this.d = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acgd acgd = this.b;
        if (acgd != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, acgd);
        }
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, this.c);
        }
        return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (readTag == 16) {
                    this.c = codedInputByteBufferNano.readInt64();
                    readTag = this.a | 1;
                } else if (readTag == 26) {
                    this.d = codedInputByteBufferNano.readString();
                    readTag = this.a | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.a = readTag;
            } else {
                if (this.b == null) {
                    this.b = new acgd();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acgd acgd = this.b;
        if (acgd != null) {
            codedOutputByteBufferNano.writeMessage(1, acgd);
        }
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(2, this.c);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
