package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alam */
public final class alam extends ExtendableMessageNano<alam> {
    private int a;
    private boolean b;
    private boolean c;

    public alam() {
        this.a = 0;
        this.b = false;
        this.c = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alam a(boolean z) {
        this.b = z;
        this.a |= 1;
        return this;
    }

    public final alam b(boolean z) {
        this.c = z;
        this.a |= 2;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, this.b);
        }
        return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, this.c) : computeSerializedSize;
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
        super.writeTo(codedOutputByteBufferNano);
    }
}
