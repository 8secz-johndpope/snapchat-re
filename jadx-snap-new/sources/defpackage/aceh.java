package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: aceh */
public final class aceh extends ExtendableMessageNano<aceh> {
    private int a;
    private int b;
    private int c;

    public aceh() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.b);
        }
        return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.b = codedInputByteBufferNano.readInt32();
                readTag = this.a | 1;
            } else if (readTag == 16) {
                this.c = codedInputByteBufferNano.readInt32();
                readTag = this.a | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}