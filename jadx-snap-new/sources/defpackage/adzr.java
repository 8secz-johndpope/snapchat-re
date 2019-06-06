package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: adzr */
public final class adzr extends ExtendableMessageNano<adzr> {
    private static volatile adzr[] h;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String[] f;
    public int g;

    public adzr() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = WireFormatNano.EMPTY_STRING_ARRAY;
        this.g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static adzr[] a() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (h == null) {
                    h = new adzr[0];
                }
            }
        }
        return h;
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
        if (!this.d.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        if (!this.e.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f;
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
        i = this.g;
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
            } else if (readTag == 50) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                String[] strArr = this.f;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.f, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f = strArr2;
            } else if (readTag == 56) {
                this.g = codedInputByteBufferNano.readInt32();
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
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
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            while (true) {
                String[] strArr2 = this.f;
                if (i >= strArr2.length) {
                    break;
                }
                str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(6, str);
                }
                i++;
            }
        }
        i = this.g;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(7, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
