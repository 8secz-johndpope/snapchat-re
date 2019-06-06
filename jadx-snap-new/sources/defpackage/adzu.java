package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: adzu */
public final class adzu extends ExtendableMessageNano<adzu> {
    private static volatile adzu[] h;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;
    public int g;

    public adzu() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = 0;
        this.g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static adzu[] a() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (h == null) {
                    h = new adzu[0];
                }
            }
        }
        return h;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = "";
        if (!this.a.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        if (!this.b.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        if (!this.c.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        if (!this.d.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        if (!this.e.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        long j = this.f;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(6, j);
        }
        int i = this.g;
        return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(7, i) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readString();
            } else if (readTag == 34) {
                this.d = codedInputByteBufferNano.readString();
            } else if (readTag == 42) {
                this.e = codedInputByteBufferNano.readString();
            } else if (readTag == 48) {
                this.f = codedInputByteBufferNano.readInt64();
            } else if (readTag == 56) {
                this.g = codedInputByteBufferNano.readInt32();
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        String str = "";
        if (!this.a.equals(str)) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals(str)) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (!this.c.equals(str)) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if (!this.d.equals(str)) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals(str)) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        long j = this.f;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(6, j);
        }
        int i = this.g;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(7, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
