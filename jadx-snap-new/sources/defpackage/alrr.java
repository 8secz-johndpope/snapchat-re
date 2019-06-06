package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alrr */
public final class alrr extends ExtendableMessageNano<alrr> {
    public alrs a;
    private int b;
    private double c;

    public alrr() {
        this.b = 0;
        this.a = null;
        this.c = 0.0d;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alrr a(double d) {
        this.c = d;
        this.b |= 1;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        alrs alrs = this.a;
        if (alrs != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, alrs);
        }
        return (this.b & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeDoubleSize(2, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new alrs();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 17) {
                this.c = codedInputByteBufferNano.readDouble();
                this.b |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        alrs alrs = this.a;
        if (alrs != null) {
            codedOutputByteBufferNano.writeMessage(1, alrs);
        }
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeDouble(2, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
