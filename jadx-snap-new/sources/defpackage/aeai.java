package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: aeai */
public final class aeai extends ExtendableMessageNano<aeai> {
    public String a;
    public String b;
    public boolean c = false;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;

    public aeai() {
        String str = "";
        this.a = str;
        this.b = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
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
        boolean z = this.c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        if (!this.d.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        if (!this.e.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        if (!this.f.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        if (!this.g.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.g);
        }
        if (!this.h.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.h);
        }
        if (!this.i.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        if (!this.j.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.j);
        }
        return !this.k.equals(str) ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(11, this.k) : computeSerializedSize;
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
                case 24:
                    this.c = codedInputByteBufferNano.readBool();
                    break;
                case 34:
                    this.d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.g = codedInputByteBufferNano.readString();
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
                case 90:
                    this.k = codedInputByteBufferNano.readString();
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
        boolean z = this.c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        if (!this.d.equals(str)) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals(str)) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        if (!this.f.equals(str)) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        if (!this.g.equals(str)) {
            codedOutputByteBufferNano.writeString(7, this.g);
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
        if (!this.k.equals(str)) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
