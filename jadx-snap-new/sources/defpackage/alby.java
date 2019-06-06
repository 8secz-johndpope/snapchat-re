package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alby */
public final class alby extends ExtendableMessageNano<alby> {
    private int a;
    private Object b;
    private int c;
    private boolean d;

    public alby() {
        this.a = 0;
        this.c = 0;
        this.d = false;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alby a(boolean z) {
        this.d = z;
        this.c |= 1;
        return this;
    }

    public final alby a(byte[] bArr) {
        this.a = 2;
        this.b = bArr;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano) this.b);
        }
        if (this.a == 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, (byte[]) this.b);
        }
        return (this.c & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(3, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a != 1) {
                    this.b = new albz();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = 1;
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readBytes();
                this.a = 2;
            } else if (readTag == 24) {
                this.d = codedInputByteBufferNano.readBool();
                this.c |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano) this.b);
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeBytes(2, (byte[]) this.b);
        }
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeBool(3, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
