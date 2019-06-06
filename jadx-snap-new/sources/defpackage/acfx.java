package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acfx */
public final class acfx extends ExtendableMessageNano<acfx> {
    public acgq a;
    private int b;
    private int c;

    public acfx() {
        this.b = 0;
        this.a = null;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acfx a(int i) {
        this.c = 15;
        this.b |= 1;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acgq acgq = this.a;
        if (acgq != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, acgq);
        }
        return (this.b & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new acgq();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 16) {
                this.c = codedInputByteBufferNano.readInt32();
                this.b |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acgq acgq = this.a;
        if (acgq != null) {
            codedOutputByteBufferNano.writeMessage(1, acgq);
        }
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
