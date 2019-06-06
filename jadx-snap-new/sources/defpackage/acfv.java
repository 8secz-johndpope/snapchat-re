package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acfv */
public final class acfv extends ExtendableMessageNano<acfv> {
    private int a;
    private Object b;
    private int c;
    private String d;
    private int e;

    public acfv() {
        this.a = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, (String) this.b);
        }
        if (this.a == 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, ((Integer) this.b).intValue());
        }
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        return (this.c & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                this.a = 1;
            } else if (readTag != 16) {
                if (readTag == 26) {
                    this.d = codedInputByteBufferNano.readString();
                    readTag = this.c | 1;
                } else if (readTag == 32) {
                    this.e = codedInputByteBufferNano.readInt32();
                    readTag = this.c | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.c = readTag;
            } else {
                this.b = Integer.valueOf(codedInputByteBufferNano.readUInt32());
                this.a = 2;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeString(1, (String) this.b);
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeUInt32(2, ((Integer) this.b).intValue());
        }
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
