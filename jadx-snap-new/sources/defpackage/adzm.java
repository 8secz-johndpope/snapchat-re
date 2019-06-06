package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: adzm */
public final class adzm extends ExtendableMessageNano<adzm> {
    private static volatile adzm[] h;
    public long a = 0;
    public String b;
    public String c;
    public adzl d;
    public adzj e;
    public adzx f;
    public aebb g;

    public adzm() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static adzm[] a() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (h == null) {
                    h = new adzm[0];
                }
            }
        }
        return h;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        String str = "";
        if (!this.b.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        if (!this.c.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        adzl adzl = this.d;
        if (adzl != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, adzl);
        }
        adzj adzj = this.e;
        if (adzj != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, adzj);
        }
        adzx adzx = this.f;
        if (adzx != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, adzx);
        }
        aebb aebb = this.g;
        return aebb != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(7, aebb) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag != 26) {
                MessageNano messageNano;
                if (readTag == 34) {
                    if (this.d == null) {
                        this.d = new adzl();
                    }
                    messageNano = this.d;
                } else if (readTag == 42) {
                    if (this.e == null) {
                        this.e = new adzj();
                    }
                    messageNano = this.e;
                } else if (readTag == 50) {
                    if (this.f == null) {
                        this.f = new adzx();
                    }
                    messageNano = this.f;
                } else if (readTag == 58) {
                    if (this.g == null) {
                        this.g = new aebb();
                    }
                    messageNano = this.g;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                codedInputByteBufferNano.readMessage(messageNano);
            } else {
                this.c = codedInputByteBufferNano.readString();
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j = this.a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        String str = "";
        if (!this.b.equals(str)) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (!this.c.equals(str)) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        adzl adzl = this.d;
        if (adzl != null) {
            codedOutputByteBufferNano.writeMessage(4, adzl);
        }
        adzj adzj = this.e;
        if (adzj != null) {
            codedOutputByteBufferNano.writeMessage(5, adzj);
        }
        adzx adzx = this.f;
        if (adzx != null) {
            codedOutputByteBufferNano.writeMessage(6, adzx);
        }
        aebb aebb = this.g;
        if (aebb != null) {
            codedOutputByteBufferNano.writeMessage(7, aebb);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
