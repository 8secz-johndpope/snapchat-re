package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acdj */
public final class acdj extends ExtendableMessageNano<acdj> {
    public int a;
    private int b = 0;
    private String c;
    private String d;

    public acdj() {
        String str = "";
        this.c = str;
        this.d = str;
        this.a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.d);
        }
        return (this.b & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, this.a) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.b | 1;
            } else if (readTag == 18) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.b | 2;
            } else if (readTag == 24) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3) {
                    this.a = readTag;
                    readTag = this.b | 4;
                }
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
