package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aebt */
public final class aebt extends ExtendableMessageNano<aebt> {
    public String[] a;
    public String[] b;
    public String[] c;
    public String[] d;
    public long[] e;
    public String[] f;
    public String[] g;

    public aebt() {
        this.a = WireFormatNano.EMPTY_STRING_ARRAY;
        this.b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.d = WireFormatNano.EMPTY_STRING_ARRAY;
        this.e = WireFormatNano.EMPTY_LONG_ARRAY;
        this.f = WireFormatNano.EMPTY_STRING_ARRAY;
        this.g = WireFormatNano.EMPTY_STRING_ARRAY;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i;
        int i2;
        int i3;
        String[] strArr;
        String str;
        int computeSerializedSize = super.computeSerializedSize();
        String[] strArr2 = this.a;
        int i4 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 1);
        }
        strArr2 = this.b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 1);
        }
        strArr2 = this.c;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.c;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 1);
        }
        strArr2 = this.d;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.d;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 1);
        }
        long[] jArr = this.e;
        if (jArr != null && jArr.length > 0) {
            long[] jArr2;
            i = 0;
            i2 = 0;
            while (true) {
                jArr2 = this.e;
                if (i >= jArr2.length) {
                    break;
                }
                i2 += CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i]);
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (jArr2.length * 1);
        }
        strArr2 = this.f;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.f;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 1);
        }
        strArr2 = this.g;
        if (strArr2 == null || strArr2.length <= 0) {
            return computeSerializedSize;
        }
        i = 0;
        i2 = 0;
        while (true) {
            String[] strArr3 = this.g;
            if (i4 >= strArr3.length) {
                return (computeSerializedSize + i) + (i2 * 1);
            }
            String str2 = strArr3[i4];
            if (str2 != null) {
                i2++;
                i += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
            }
            i4++;
        }
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            String[] strArr;
            int length;
            String[] strArr2;
            long[] jArr;
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                strArr = this.a;
                length = strArr == null ? 0 : strArr.length;
                strArr2 = new String[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.a = strArr2;
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                strArr = this.b;
                length = strArr == null ? 0 : strArr.length;
                strArr2 = new String[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.b = strArr2;
            } else if (readTag == 26) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                strArr = this.c;
                length = strArr == null ? 0 : strArr.length;
                strArr2 = new String[(readTag + length)];
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
            } else if (readTag == 34) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                strArr = this.d;
                length = strArr == null ? 0 : strArr.length;
                strArr2 = new String[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.d, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.d = strArr2;
            } else if (readTag == 40) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 40);
                jArr = this.e;
                length = jArr == null ? 0 : jArr.length;
                long[] jArr2 = new long[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.e, 0, jArr2, 0, length);
                }
                while (length < jArr2.length - 1) {
                    jArr2[length] = codedInputByteBufferNano.readInt64();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                jArr2[length] = codedInputByteBufferNano.readInt64();
                this.e = jArr2;
            } else if (readTag == 42) {
                readTag = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                length = codedInputByteBufferNano.getPosition();
                int i = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt64();
                    i++;
                }
                codedInputByteBufferNano.rewindToPosition(length);
                jArr = this.e;
                length = jArr == null ? 0 : jArr.length;
                long[] jArr3 = new long[(i + length)];
                if (length != 0) {
                    System.arraycopy(this.e, 0, jArr3, 0, length);
                }
                while (length < jArr3.length) {
                    jArr3[length] = codedInputByteBufferNano.readInt64();
                    length++;
                }
                this.e = jArr3;
                codedInputByteBufferNano.popLimit(readTag);
            } else if (readTag == 50) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                strArr = this.f;
                length = strArr == null ? 0 : strArr.length;
                strArr2 = new String[(readTag + length)];
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
            } else if (readTag == 58) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                strArr = this.g;
                length = strArr == null ? 0 : strArr.length;
                strArr2 = new String[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.g, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.g = strArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        String[] strArr;
        String str;
        String[] strArr2 = this.a;
        int i2 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(1, str);
                }
                i++;
            }
        }
        strArr2 = this.b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        strArr2 = this.c;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.c;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        strArr2 = this.d;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.d;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(4, str);
                }
                i++;
            }
        }
        long[] jArr = this.e;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            while (true) {
                long[] jArr2 = this.e;
                if (i >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(5, jArr2[i]);
                i++;
            }
        }
        strArr2 = this.f;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.f;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(6, str);
                }
                i++;
            }
        }
        strArr2 = this.g;
        if (strArr2 != null && strArr2.length > 0) {
            while (true) {
                strArr2 = this.g;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(7, str2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
