package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acbw */
public final class acbw extends ExtendableMessageNano<acbw> {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public acbw() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.d);
        }
        return (this.a & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.b = readTag;
                    readTag = this.a | 1;
                }
            } else if (readTag == 16) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3) {
                    this.c = readTag;
                    readTag = this.a | 2;
                }
            } else if (readTag == 24) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.d = readTag;
                    readTag = this.a | 4;
                }
            } else if (readTag == 32) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.e = readTag;
                    readTag = this.a | 8;
                }
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
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
