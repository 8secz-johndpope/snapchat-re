package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acgq */
public final class acgq extends ExtendableMessageNano<acgq> {
    private int a = 0;
    private String b;
    private String c;
    private String d;
    private String e;

    public acgq() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acgq a(String str) {
        if (str != null) {
            this.b = str;
            this.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        return (this.a & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                readTag = this.a | 1;
            } else if (readTag == 18) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.a | 2;
            } else if (readTag == 26) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.a | 4;
            } else if (readTag == 82) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.a | 8;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeString(10, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
