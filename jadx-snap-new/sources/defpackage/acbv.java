package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acbv */
public final class acbv extends ExtendableMessageNano<acbv> {
    private int a;
    private Object b;

    public acbv() {
        this.a = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acbv a() {
        this.a = 3;
        this.b = Boolean.TRUE;
        return this;
    }

    public final acbv a(int i) {
        this.a = 1;
        this.b = Integer.valueOf(i);
        return this;
    }

    public final acbv a(long j) {
        this.a = 2;
        this.b = Long.valueOf(j);
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, ((Integer) this.b).intValue());
        }
        if (this.a == 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, ((Long) this.b).longValue());
        }
        if (this.a == 3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, ((Boolean) this.b).booleanValue());
        }
        return this.a == 4 ? computeSerializedSize + CodedOutputByteBufferNano.computeFloatSize(4, ((Float) this.b).floatValue()) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.b = Integer.valueOf(codedInputByteBufferNano.readInt32());
                readTag = 1;
            } else if (readTag == 16) {
                this.b = Long.valueOf(codedInputByteBufferNano.readInt64());
                readTag = 2;
            } else if (readTag == 24) {
                this.b = Boolean.valueOf(codedInputByteBufferNano.readBool());
                readTag = 3;
            } else if (readTag == 37) {
                this.b = Float.valueOf(codedInputByteBufferNano.readFloat());
                readTag = 4;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeInt32(1, ((Integer) this.b).intValue());
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeInt64(2, ((Long) this.b).longValue());
        }
        if (this.a == 3) {
            codedOutputByteBufferNano.writeBool(3, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 4) {
            codedOutputByteBufferNano.writeFloat(4, ((Float) this.b).floatValue());
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
