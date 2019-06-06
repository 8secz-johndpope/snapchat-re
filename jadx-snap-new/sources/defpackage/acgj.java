package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acgj */
public final class acgj extends ExtendableMessageNano<acgj> {
    private static volatile acgj[] c;
    private int a;
    private Object b;

    public acgj() {
        this.a = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acgj[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new acgj[0];
                }
            }
        }
        return c;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano) this.b);
        }
        return this.a == 2 ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano) this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int i;
            Object acgm;
            if (readTag == 10) {
                i = 1;
                if (this.a != 1) {
                    acgm = new acgm();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = i;
            } else if (readTag == 18) {
                i = 2;
                if (this.a != 2) {
                    acgm = new acgh();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = i;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = acgm;
            codedInputByteBufferNano.readMessage((MessageNano) this.b);
            this.a = i;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano) this.b);
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
