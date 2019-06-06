package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acfi */
public final class acfi extends ExtendableMessageNano<acfi> {
    private static volatile acfi[] a;
    private int b;
    private String c;
    private boolean d;

    public acfi() {
        this.b = 0;
        this.c = "";
        this.d = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acfi[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acfi[0];
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
        return (this.b & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, this.d) : computeSerializedSize;
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
                this.d = codedInputByteBufferNano.readBool();
                readTag = this.b | 2;
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
            codedOutputByteBufferNano.writeBool(2, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
