package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: accn */
public final class accn extends ExtendableMessageNano<accn> {
    private static volatile accn[] c;
    public int a;
    public Object b;

    public accn() {
        this.a = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static accn[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new accn[0];
                }
            }
        }
        return c;
    }

    public final accn a(String str) {
        this.a = 2;
        this.b = str;
        return this;
    }

    public final String b() {
        return this.a == 1 ? (String) this.b : "";
    }

    public final boolean c() {
        return this.a == 2;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, (String) this.b);
        }
        return this.a == 2 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, (String) this.b) : computeSerializedSize;
    }

    public final String d() {
        return this.a == 2 ? (String) this.b : "";
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                readTag = 1;
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
                readTag = 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeString(1, (String) this.b);
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeString(2, (String) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
