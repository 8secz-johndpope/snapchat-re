package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.Duration;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.Timestamp;

/* renamed from: acgp */
public final class acgp extends ExtendableMessageNano<acgp> {
    private static volatile acgp[] c;
    public Timestamp a;
    public acew b;
    private int d;
    private acev e;
    private String f;
    private Duration g;

    public acgp() {
        this.d = 0;
        this.e = null;
        this.f = "";
        this.a = null;
        this.g = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acgp a(byte[] bArr) {
        return (acgp) MessageNano.mergeFrom(new acgp(), bArr);
    }

    public static acgp[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new acgp[0];
                }
            }
        }
        return c;
    }

    public final acgp a(String str) {
        if (str != null) {
            this.f = str;
            this.d |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final String b() {
        return this.f;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acev acev = this.e;
        if (acev != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, acev);
        }
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f);
        }
        Timestamp timestamp = this.a;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, timestamp);
        }
        Duration duration = this.g;
        if (duration != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, duration);
        }
        acew acew = this.b;
        return acew != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(5, acew) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            MessageNano messageNano;
            if (readTag == 10) {
                if (this.e == null) {
                    this.e = new acev();
                }
                messageNano = this.e;
            } else if (readTag == 18) {
                this.f = codedInputByteBufferNano.readString();
                this.d |= 1;
            } else if (readTag == 26) {
                if (this.a == null) {
                    this.a = new Timestamp();
                }
                messageNano = this.a;
            } else if (readTag == 34) {
                if (this.g == null) {
                    this.g = new Duration();
                }
                messageNano = this.g;
            } else if (readTag == 42) {
                if (this.b == null) {
                    this.b = new acew();
                }
                messageNano = this.b;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acev acev = this.e;
        if (acev != null) {
            codedOutputByteBufferNano.writeMessage(1, acev);
        }
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeString(2, this.f);
        }
        Timestamp timestamp = this.a;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(3, timestamp);
        }
        Duration duration = this.g;
        if (duration != null) {
            codedOutputByteBufferNano.writeMessage(4, duration);
        }
        acew acew = this.b;
        if (acew != null) {
            codedOutputByteBufferNano.writeMessage(5, acew);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
