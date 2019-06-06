package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: adzq */
public final class adzq extends ExtendableMessageNano<adzq> {
    private static volatile adzq[] k;
    public String a;
    public String b;
    public String c;
    public int d = 0;
    public String e;
    public String f;
    public int g;
    public String h;
    public String i;
    public String j;

    public adzq() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.e = str;
        this.f = str;
        this.g = 0;
        this.h = str;
        this.i = str;
        this.j = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static adzq[] a() {
        if (k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (k == null) {
                    k = new adzq[0];
                }
            }
        }
        return k;
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
        int i = this.d;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        if (!this.e.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        if (!this.f.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        i = this.g;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i);
        }
        if (!this.h.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.h);
        }
        if (!this.i.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        return !this.j.equals(str) ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.j) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.d = codedInputByteBufferNano.readInt32();
                    break;
                case 42:
                    this.e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    this.g = codedInputByteBufferNano.readInt32();
                    break;
                case 66:
                    this.h = codedInputByteBufferNano.readString();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (storeUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
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
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        if (!this.e.equals(str)) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        if (!this.f.equals(str)) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        i = this.g;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(7, i);
        }
        if (!this.h.equals(str)) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        if (!this.i.equals(str)) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        if (!this.j.equals(str)) {
            codedOutputByteBufferNano.writeString(10, this.j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
