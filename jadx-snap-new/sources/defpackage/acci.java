package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acci */
public final class acci extends ExtendableMessageNano<acci> {
    private static volatile acci[] a;
    private int b;
    private int c;
    private int d;

    public acci() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acci[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acci[0];
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
        return (this.b & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(2, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                switch (readTag) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.c = readTag;
                        readTag = this.b | 1;
                        break;
                    default:
                        continue;
                }
            } else if (readTag == 16) {
                this.d = codedInputByteBufferNano.readSInt32();
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
            codedOutputByteBufferNano.writeSInt32(2, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
