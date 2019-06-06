package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aeal */
public final class aeal extends ExtendableMessageNano<aeal> {
    private static volatile aeal[] m;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f = false;
    public String g;
    public boolean h;
    public String i;
    public String[] j;
    public String k;
    public String l;

    public aeal() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.g = str;
        this.h = false;
        this.i = str;
        this.j = WireFormatNano.EMPTY_STRING_ARRAY;
        this.k = str;
        this.l = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static aeal[] a() {
        if (m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (m == null) {
                    m = new aeal[0];
                }
            }
        }
        return m;
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
        boolean z = this.f;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(6, z);
        }
        if (!this.g.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.g);
        }
        z = this.h;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        if (!this.i.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        String[] strArr = this.j;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.j;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 1);
        }
        if (!this.k.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.k);
        }
        return !this.l.equals(str) ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(12, this.l) : computeSerializedSize;
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
                case 34:
                    this.d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.e = codedInputByteBufferNano.readString();
                    break;
                case 48:
                    this.f = codedInputByteBufferNano.readBool();
                    break;
                case 58:
                    this.g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.h = codedInputByteBufferNano.readBool();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    String[] strArr = this.j;
                    int length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.j, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.j = strArr2;
                    break;
                case 90:
                    this.k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.l = codedInputByteBufferNano.readString();
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
        if (!this.d.equals(str)) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals(str)) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.writeBool(6, z);
        }
        if (!this.g.equals(str)) {
            codedOutputByteBufferNano.writeString(7, this.g);
        }
        z = this.h;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        if (!this.i.equals(str)) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        String[] strArr = this.j;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.j;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(10, str2);
                }
                i++;
            }
        }
        if (!this.k.equals(str)) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        if (!this.l.equals(str)) {
            codedOutputByteBufferNano.writeString(12, this.l);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
