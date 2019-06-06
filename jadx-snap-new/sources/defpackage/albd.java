package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: albd */
public final class albd extends ExtendableMessageNano<albd> {
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;

    public albd() {
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final albd a(boolean z) {
        this.b = z;
        this.a |= 1;
        return this;
    }

    public final albd b(boolean z) {
        this.c = z;
        this.a |= 2;
        return this;
    }

    public final albd c(boolean z) {
        this.d = z;
        this.a |= 4;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, this.c);
        }
        return (this.a & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(3, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.b = codedInputByteBufferNano.readBool();
                readTag = this.a | 1;
            } else if (readTag == 16) {
                this.c = codedInputByteBufferNano.readBool();
                readTag = this.a | 2;
            } else if (readTag == 24) {
                this.d = codedInputByteBufferNano.readBool();
                readTag = this.a | 4;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeBool(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeBool(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeBool(3, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
