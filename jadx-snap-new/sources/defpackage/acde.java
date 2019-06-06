package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acde */
public final class acde extends ExtendableMessageNano<acde> {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    private int g = 0;

    public acde() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.g & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        if ((this.g & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        if ((this.g & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        if ((this.g & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        if ((this.g & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        return (this.g & 32) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(6, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
                readTag = this.g | 1;
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
                readTag = this.g | 2;
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.g | 4;
            } else if (readTag == 34) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.g | 8;
            } else if (readTag == 42) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.g | 16;
            } else if (readTag == 50) {
                this.f = codedInputByteBufferNano.readString();
                readTag = this.g | 32;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.g = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.g & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if ((this.g & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if ((this.g & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if ((this.g & 8) != 0) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if ((this.g & 16) != 0) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        if ((this.g & 32) != 0) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
