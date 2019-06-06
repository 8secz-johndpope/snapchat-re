package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acdz */
public final class acdz extends ExtendableMessageNano<acdz> {
    private int a = 0;
    private String b;
    private String c;
    private String d;

    public acdz() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acdz a(String str) {
        if (str != null) {
            this.b = str;
            this.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final acdz b(String str) {
        if (str != null) {
            this.c = str;
            this.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final acdz c(String str) {
        if (str != null) {
            this.d = str;
            this.a |= 4;
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
        return (this.a & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.d) : computeSerializedSize;
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
        super.writeTo(codedOutputByteBufferNano);
    }
}
