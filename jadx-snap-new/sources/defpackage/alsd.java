package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alsd */
public final class alsd extends ExtendableMessageNano<alsd> {
    public alsc a;
    private int b;
    private int c;

    public alsd() {
        this.b = 0;
        this.a = null;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alsd a(int i) {
        this.c = i;
        this.b |= 1;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        alsc alsc = this.a;
        if (alsc != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, alsc);
        }
        return (this.b & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new alsc();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 16) {
                this.c = codedInputByteBufferNano.readUInt32();
                this.b |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        alsc alsc = this.a;
        if (alsc != null) {
            codedOutputByteBufferNano.writeMessage(1, alsc);
        }
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeUInt32(2, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
