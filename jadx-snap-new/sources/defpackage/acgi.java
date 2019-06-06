package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acgi */
public final class acgi extends ExtendableMessageNano<acgi> {
    private static volatile acgi[] a;
    private acew b;

    public acgi() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acgi[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acgi[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acew acew = this.b;
        return acew != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, acew) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.b == null) {
                    this.b = new acew();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acew acew = this.b;
        if (acew != null) {
            codedOutputByteBufferNano.writeMessage(1, acew);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
