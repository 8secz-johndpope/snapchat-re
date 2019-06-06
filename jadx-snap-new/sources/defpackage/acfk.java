package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acfk */
public final class acfk extends ExtendableMessageNano<acfk> {
    private static volatile acfk[] c;
    private int a;
    private Object b;
    private int d;
    private long e;

    public acfk() {
        this.a = 0;
        this.d = 0;
        this.e = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acfk[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new acfk[0];
                }
            }
        }
        return c;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, ((Long) this.b).longValue());
        }
        if (this.a == 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, ((Long) this.b).longValue());
        }
        return (this.d & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(3, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.b = Long.valueOf(codedInputByteBufferNano.readInt64());
                this.a = 1;
            } else if (readTag == 16) {
                this.b = Long.valueOf(codedInputByteBufferNano.readInt64());
                this.a = 2;
            } else if (readTag == 24) {
                this.e = codedInputByteBufferNano.readInt64();
                this.d |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeInt64(1, ((Long) this.b).longValue());
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeInt64(2, ((Long) this.b).longValue());
        }
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(3, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
