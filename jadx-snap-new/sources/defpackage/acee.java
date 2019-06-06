package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acee */
public final class acee extends ExtendableMessageNano<acee> {
    public String a;
    private int b = 0;
    private String c;
    private String d;
    private String e;

    public acee() {
        String str = "";
        this.a = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.c);
        }
        if ((this.b & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        return (this.b & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
                readTag = this.b | 1;
            } else if (readTag == 18) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.b | 2;
            } else if (readTag == 26) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.b | 4;
            } else if (readTag == 34) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.b | 8;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.c);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.b & 8) != 0) {
            codedOutputByteBufferNano.writeString(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
