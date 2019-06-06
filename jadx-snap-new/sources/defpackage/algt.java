package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: algt */
public final class algt extends ExtendableMessageNano<algt> {
    private static volatile algt[] b;
    public algz[] a;
    private int c = 0;
    private String d;
    private String e;
    private String f;
    private int g;
    private String[] h;

    public algt() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = 0;
        this.a = algz.a();
        this.h = WireFormatNano.EMPTY_STRING_ARRAY;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static algt[] a() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new algt[0];
                }
            }
        }
        return b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.d);
        }
        if ((this.c & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f);
        }
        if ((this.c & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.g);
        }
        algz[] algzArr = this.a;
        int i2 = 0;
        if (algzArr != null && algzArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                algz[] algzArr2 = this.a;
                if (computeSerializedSize >= algzArr2.length) {
                    break;
                }
                MessageNano messageNano = algzArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        String[] strArr = this.h;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.h;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i) + (i3 * 1);
        }
        return (this.c & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(6, this.e) : computeSerializedSize;
    }

    public final int d() {
        return this.g;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int length;
            if (readTag == 10) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.c | 1;
            } else if (readTag == 18) {
                this.f = codedInputByteBufferNano.readString();
                readTag = this.c | 4;
            } else if (readTag == 24) {
                this.g = codedInputByteBufferNano.readInt32();
                readTag = this.c | 8;
            } else if (readTag == 34) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                algz[] algzArr = this.a;
                length = algzArr == null ? 0 : algzArr.length;
                algz[] algzArr2 = new algz[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, algzArr2, 0, length);
                }
                while (length < algzArr2.length - 1) {
                    algzArr2[length] = new algz();
                    codedInputByteBufferNano.readMessage(algzArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                algzArr2[length] = new algz();
                codedInputByteBufferNano.readMessage(algzArr2[length]);
                this.a = algzArr2;
            } else if (readTag == 42) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                String[] strArr = this.h;
                length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.h, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.h = strArr2;
            } else if (readTag == 50) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.c | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.c = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.d);
        }
        if ((this.c & 4) != 0) {
            codedOutputByteBufferNano.writeString(2, this.f);
        }
        if ((this.c & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.g);
        }
        algz[] algzArr = this.a;
        int i = 0;
        if (algzArr != null && algzArr.length > 0) {
            int i2 = 0;
            while (true) {
                algz[] algzArr2 = this.a;
                if (i2 >= algzArr2.length) {
                    break;
                }
                MessageNano messageNano = algzArr2[i2];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i2++;
            }
        }
        String[] strArr = this.h;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.h;
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(5, str);
                }
                i++;
            }
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeString(6, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
