package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acer */
public final class acer extends ExtendableMessageNano<acer> {
    private static volatile acer[] a;
    private int b;
    private byte[] c;
    private acew d;

    public acer() {
        this.b = 0;
        this.c = WireFormatNano.EMPTY_BYTES;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acer[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acer[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.c);
        }
        acew acew = this.d;
        return acew != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, acew) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.c = codedInputByteBufferNano.readBytes();
                this.b |= 1;
            } else if (readTag == 18) {
                if (this.d == null) {
                    this.d = new acew();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.c);
        }
        acew acew = this.d;
        if (acew != null) {
            codedOutputByteBufferNano.writeMessage(2, acew);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
