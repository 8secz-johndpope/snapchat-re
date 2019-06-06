package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aead */
public final class aead extends ExtendableMessageNano<aead> {
    public String a;
    public String b;
    public String c;
    public int d = 0;
    public String e;
    public int f;
    public boolean g;
    public String h;
    public String[] i;
    public String[] j;
    public String k;
    public adzi l;
    public String m;
    public String n;
    public long o;
    public aeae p;
    public String q;
    public boolean r;

    public aead() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.e = str;
        this.f = 0;
        this.g = false;
        this.h = str;
        this.i = WireFormatNano.EMPTY_STRING_ARRAY;
        this.j = WireFormatNano.EMPTY_STRING_ARRAY;
        this.k = str;
        this.l = null;
        this.m = str;
        this.n = str;
        this.o = 0;
        this.p = null;
        this.q = str;
        this.r = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i;
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
        int i2 = this.d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        if (!this.e.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        i2 = this.f;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i2);
        }
        boolean z = this.g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z);
        }
        if (!this.h.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.h);
        }
        String[] strArr = this.i;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            i2 = 0;
            i = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    i4++;
                    i += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i) + (i4 * 1);
        }
        strArr = this.j;
        if (strArr != null && strArr.length > 0) {
            i2 = 0;
            i = 0;
            while (true) {
                String[] strArr3 = this.j;
                if (i3 >= strArr3.length) {
                    break;
                }
                String str3 = strArr3[i3];
                if (str3 != null) {
                    i++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i3++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i * 1);
        }
        if (!this.k.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.k);
        }
        adzi adzi = this.l;
        if (adzi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(12, adzi);
        }
        if (!this.m.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.m);
        }
        if (!this.n.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(14, this.n);
        }
        long j = this.o;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(15, j);
        }
        aeae aeae = this.p;
        if (aeae != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(16, aeae);
        }
        if (!this.q.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(17, this.q);
        }
        z = this.r;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(18, z) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            MessageNano messageNano;
            int readTag = codedInputByteBufferNano.readTag();
            String[] strArr;
            int length;
            String[] strArr2;
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.a = codedInputByteBufferNano.readString();
                    continue;
                case 18:
                    this.b = codedInputByteBufferNano.readString();
                    continue;
                case 26:
                    this.c = codedInputByteBufferNano.readString();
                    continue;
                case 32:
                    this.d = codedInputByteBufferNano.readInt32();
                    continue;
                case 42:
                    this.e = codedInputByteBufferNano.readString();
                    continue;
                case 48:
                    this.f = codedInputByteBufferNano.readInt32();
                    continue;
                case 56:
                    this.g = codedInputByteBufferNano.readBool();
                    continue;
                case 66:
                    this.h = codedInputByteBufferNano.readString();
                    continue;
                case 74:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                    strArr = this.i;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.i = strArr2;
                    continue;
                case 82:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    strArr = this.j;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
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
                    continue;
                case 90:
                    this.k = codedInputByteBufferNano.readString();
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new adzi();
                    }
                    messageNano = this.l;
                    break;
                case 106:
                    this.m = codedInputByteBufferNano.readString();
                    continue;
                case 114:
                    this.n = codedInputByteBufferNano.readString();
                    continue;
                case 120:
                    this.o = codedInputByteBufferNano.readInt64();
                    continue;
                case 130:
                    if (this.p == null) {
                        this.p = new aeae();
                    }
                    messageNano = this.p;
                    break;
                case 138:
                    this.q = codedInputByteBufferNano.readString();
                    continue;
                case 144:
                    this.r = codedInputByteBufferNano.readBool();
                    continue;
                default:
                    if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    continue;
            }
            codedInputByteBufferNano.readMessage(messageNano);
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
        i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        boolean z = this.g;
        if (z) {
            codedOutputByteBufferNano.writeBool(7, z);
        }
        if (!this.h.equals(str)) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        String[] strArr = this.i;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(9, str2);
                }
                i++;
            }
        }
        strArr = this.j;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.j;
                if (i2 >= strArr.length) {
                    break;
                }
                String str3 = strArr[i2];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(10, str3);
                }
                i2++;
            }
        }
        if (!this.k.equals(str)) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        adzi adzi = this.l;
        if (adzi != null) {
            codedOutputByteBufferNano.writeMessage(12, adzi);
        }
        if (!this.m.equals(str)) {
            codedOutputByteBufferNano.writeString(13, this.m);
        }
        if (!this.n.equals(str)) {
            codedOutputByteBufferNano.writeString(14, this.n);
        }
        long j = this.o;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(15, j);
        }
        aeae aeae = this.p;
        if (aeae != null) {
            codedOutputByteBufferNano.writeMessage(16, aeae);
        }
        if (!this.q.equals(str)) {
            codedOutputByteBufferNano.writeString(17, this.q);
        }
        z = this.r;
        if (z) {
            codedOutputByteBufferNano.writeBool(18, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
