package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acds */
public final class acds extends ExtendableMessageNano<acds> {
    public int a = 0;
    public String b;
    private String c;

    public acds() {
        String str = "";
        this.c = str;
        this.b = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acds a(String str) {
        if (str != null) {
            this.c = str;
            this.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.c);
        }
        return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.a | 1;
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
                readTag = this.a | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.c);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
