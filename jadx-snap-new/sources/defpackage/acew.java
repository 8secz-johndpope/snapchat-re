package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acew */
public final class acew extends ExtendableMessageNano<acew> {
    private static volatile acew[] c;
    private int a;
    private Object b;
    private int d;
    private byte[] e;

    public acew() {
        this.a = 0;
        this.d = 0;
        this.e = WireFormatNano.EMPTY_BYTES;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acew[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new acew[0];
                }
            }
        }
        return c;
    }

    public final boolean b() {
        return this.a == 2;
    }

    public final acev c() {
        return this.a == 2 ? (acev) this.b : null;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.e);
        }
        if (this.a == 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano) this.b);
        }
        return this.a == 3 ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano) this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                int i;
                Object acev;
                if (readTag == 18) {
                    i = 2;
                    if (this.a != 2) {
                        acev = new acev();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano) this.b);
                    this.a = i;
                } else if (readTag == 26) {
                    i = 3;
                    if (this.a != 3) {
                        acev = new acga();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano) this.b);
                    this.a = i;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.b = acev;
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = i;
            } else {
                this.e = codedInputByteBufferNano.readBytes();
                this.d |= 1;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.e);
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano) this.b);
        }
        if (this.a == 3) {
            codedOutputByteBufferNano.writeMessage(3, (MessageNano) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
