package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: algs */
public final class algs extends ExtendableMessageNano<algs> {
    private static volatile algs[] b;
    public algz[] a;
    private int c = 0;
    private String d;
    private String e;
    private int f;

    public algs() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = 0;
        this.a = algz.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static algs[] a() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new algs[0];
                }
            }
        }
        return b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.d);
        }
        if ((this.c & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.e);
        }
        if ((this.c & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.f);
        }
        algz[] algzArr = this.a;
        if (algzArr != null && algzArr.length > 0) {
            int i = 0;
            while (true) {
                algz[] algzArr2 = this.a;
                if (i >= algzArr2.length) {
                    break;
                }
                MessageNano messageNano = algzArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final int d() {
        return this.f;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.c | 1;
            } else if (readTag == 18) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.c | 2;
            } else if (readTag == 24) {
                this.f = codedInputByteBufferNano.readInt32();
                readTag = this.c | 4;
            } else if (readTag == 34) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                algz[] algzArr = this.a;
                int length = algzArr == null ? 0 : algzArr.length;
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
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.e);
        }
        if ((this.c & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.f);
        }
        algz[] algzArr = this.a;
        if (algzArr != null && algzArr.length > 0) {
            int i = 0;
            while (true) {
                algz[] algzArr2 = this.a;
                if (i >= algzArr2.length) {
                    break;
                }
                MessageNano messageNano = algzArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
