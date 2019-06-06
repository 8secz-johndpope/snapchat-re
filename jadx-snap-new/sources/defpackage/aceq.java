package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: aceq */
public final class aceq extends ExtendableMessageNano<aceq> {
    private static volatile aceq[] a;
    private acew b;
    private acew c;

    public aceq() {
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static aceq[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new aceq[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acew acew = this.b;
        if (acew != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, acew);
        }
        acew = this.c;
        return acew != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, acew) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            MessageNano messageNano;
            if (readTag == 10) {
                if (this.b == null) {
                    this.b = new acew();
                }
                messageNano = this.b;
            } else if (readTag == 18) {
                if (this.c == null) {
                    this.c = new acew();
                }
                messageNano = this.c;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acew acew = this.b;
        if (acew != null) {
            codedOutputByteBufferNano.writeMessage(1, acew);
        }
        acew = this.c;
        if (acew != null) {
            codedOutputByteBufferNano.writeMessage(2, acew);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
