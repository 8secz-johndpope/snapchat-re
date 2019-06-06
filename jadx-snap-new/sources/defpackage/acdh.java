package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acdh */
public final class acdh extends ExtendableMessageNano<acdh> {
    public long a;
    public long b;
    private int c;

    public acdh() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, this.a);
        }
        return (this.c & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(2, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readInt64();
                readTag = this.c | 1;
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readInt64();
                readTag = this.c | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.c = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(1, this.a);
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeInt64(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
