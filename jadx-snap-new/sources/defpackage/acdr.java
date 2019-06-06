package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acdr */
public final class acdr extends ExtendableMessageNano<acdr> {
    public String a;
    public String b;
    private int c = 0;

    public acdr() {
        String str = "";
        this.a = str;
        this.b = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        return (this.c & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
                readTag = this.c | 1;
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
                readTag = this.c | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.c = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
