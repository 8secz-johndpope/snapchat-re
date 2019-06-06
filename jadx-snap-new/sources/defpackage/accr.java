package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.Timestamp;

/* renamed from: accr */
public final class accr extends ExtendableMessageNano<accr> {
    private static volatile accr[] f;
    public accm a;
    public Timestamp b;
    public long c;
    public boolean d;
    public long e;
    private int g;

    public accr() {
        this.g = 0;
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = false;
        this.e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static accr[] a() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f == null) {
                    f = new accr[0];
                }
            }
        }
        return f;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accm accm = this.a;
        if (accm != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, accm);
        }
        Timestamp timestamp = this.b;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, timestamp);
        }
        if ((this.g & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, this.c);
        }
        if ((this.g & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, this.d);
        }
        return (this.g & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(5, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            MessageNano messageNano;
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new accm();
                }
                messageNano = this.a;
            } else if (readTag != 18) {
                if (readTag == 24) {
                    this.c = codedInputByteBufferNano.readInt64();
                    readTag = this.g | 1;
                } else if (readTag == 32) {
                    this.d = codedInputByteBufferNano.readBool();
                    readTag = this.g | 2;
                } else if (readTag == 40) {
                    this.e = codedInputByteBufferNano.readInt64();
                    readTag = this.g | 4;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.g = readTag;
            } else {
                if (this.b == null) {
                    this.b = new Timestamp();
                }
                messageNano = this.b;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accm accm = this.a;
        if (accm != null) {
            codedOutputByteBufferNano.writeMessage(1, accm);
        }
        Timestamp timestamp = this.b;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(2, timestamp);
        }
        if ((this.g & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(3, this.c);
        }
        if ((this.g & 2) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.d);
        }
        if ((this.g & 4) != 0) {
            codedOutputByteBufferNano.writeInt64(5, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
