package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: aceo */
public final class aceo extends ExtendableMessageNano<aceo> {
    private static volatile aceo[] a;
    private int b;
    private String c;
    private long d;
    private acgg e;

    public aceo() {
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static aceo[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new aceo[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, this.d);
        }
        acgg acgg = this.e;
        return acgg != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, acgg) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.b | 1;
            } else if (readTag == 16) {
                this.d = codedInputByteBufferNano.readUInt64();
                readTag = this.b | 2;
            } else if (readTag == 26) {
                if (this.e == null) {
                    this.e = new acgg();
                }
                codedInputByteBufferNano.readMessage(this.e);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeUInt64(2, this.d);
        }
        acgg acgg = this.e;
        if (acgg != null) {
            codedOutputByteBufferNano.writeMessage(3, acgg);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
