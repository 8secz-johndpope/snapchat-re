package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alqz */
public final class alqz extends ExtendableMessageNano<alqz> {
    public alqy a;
    private int b;
    private long c;
    private double d;
    private int e;

    public alqz() {
        this.b = 0;
        this.c = 0;
        this.a = null;
        this.d = 0.0d;
        this.e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alqz a(double d) {
        this.d = d;
        this.b |= 2;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, this.c);
        }
        alqy alqy = this.a;
        if (alqy != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, alqy);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.d);
        }
        return (this.b & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.c = codedInputByteBufferNano.readInt64();
                readTag = this.b | 1;
            } else if (readTag == 18) {
                if (this.a == null) {
                    this.a = new alqy();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 25) {
                this.d = codedInputByteBufferNano.readDouble();
                readTag = this.b | 2;
            } else if (readTag == 32) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0) {
                    this.e = readTag;
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
            codedOutputByteBufferNano.writeInt64(1, this.c);
        }
        alqy alqy = this.a;
        if (alqy != null) {
            codedOutputByteBufferNano.writeMessage(2, alqy);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeDouble(3, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
