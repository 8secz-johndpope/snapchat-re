package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acbu */
public final class acbu extends ExtendableMessageNano<acbu> {
    private static volatile acbu[] b;
    public acbv a;
    private int c;
    private int d;

    public acbu() {
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acbu[] a() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new acbu[0];
                }
            }
        }
        return b;
    }

    public final acbu a(int i) {
        this.d = i;
        this.c |= 1;
        return this;
    }

    public final int b() {
        return this.d;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.d);
        }
        acbv acbv = this.a;
        return acbv != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, acbv) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
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
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            this.d = readTag;
                            this.c |= 1;
                            break;
                        default:
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.a == null) {
                        this.a = new acbv();
                    }
                    codedInputByteBufferNano.readMessage(this.a);
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.d);
        }
        acbv acbv = this.a;
        if (acbv != null) {
            codedOutputByteBufferNano.writeMessage(2, acbv);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
