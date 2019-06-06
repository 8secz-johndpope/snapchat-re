package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alqu */
public final class alqu extends ExtendableMessageNano<alqu> {
    private static volatile alqu[] h;
    public int a = 0;
    public String b;
    public String[] c;
    public String d;
    public long e;
    public long f;
    public long g;

    public alqu() {
        String str = "";
        this.b = str;
        this.c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.d = str;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static alqu[] a() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (h == null) {
                    h = new alqu[0];
                }
            }
        }
        return h;
    }

    public final String b() {
        return this.b;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.b);
        }
        String[] strArr = this.c;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 1);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, this.e);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(5, this.f);
        }
        return (this.a & 16) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(6, this.g) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                readTag = this.a | 1;
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.c;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.c = strArr2;
            } else if (readTag == 26) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.a | 2;
            } else if (readTag == 32) {
                this.e = codedInputByteBufferNano.readInt64();
                readTag = this.a | 4;
            } else if (readTag == 40) {
                this.f = codedInputByteBufferNano.readInt64();
                readTag = this.a | 8;
            } else if (readTag == 48) {
                this.g = codedInputByteBufferNano.readInt64();
                readTag = this.a | 16;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.b);
        }
        String[] strArr = this.c;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeInt64(4, this.e);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeInt64(5, this.f);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeInt64(6, this.g);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
