package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acck */
public final class acck extends ExtendableMessageNano<acck> {
    private static volatile acck[] a;
    private int b;
    private int c;
    private int d;

    public acck() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acck[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acck[0];
                }
            }
        }
        return a;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.c);
        }
        return (this.b & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3 || readTag == 4 || readTag == 5) {
                    this.c = readTag;
                    readTag = this.b | 1;
                }
            } else if (readTag == 16) {
                this.d = codedInputByteBufferNano.readInt32();
                readTag = this.b | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
