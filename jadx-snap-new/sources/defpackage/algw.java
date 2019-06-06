package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: algw */
public final class algw extends ExtendableMessageNano<algw> {
    private static volatile algw[] c;
    public algz[] a;
    public algv b;
    private int d = 0;
    private String e;
    private String f;
    private int g;
    private String h;

    public algw() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = 0;
        this.a = algz.a();
        this.b = null;
        this.h = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static algw[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new algw[0];
                }
            }
        }
        return c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.e);
        }
        if ((this.d & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f);
        }
        if ((this.d & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, this.g);
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
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, messageNano);
                }
                i++;
            }
        }
        algv algv = this.b;
        if (algv != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, algv);
        }
        return (this.d & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(7, this.h) : computeSerializedSize;
    }

    public final int d() {
        return this.g;
    }

    public final String e() {
        return this.h;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.d | 1;
            } else if (readTag == 18) {
                this.f = codedInputByteBufferNano.readString();
                readTag = this.d | 2;
            } else if (readTag == 32) {
                this.g = codedInputByteBufferNano.readInt32();
                readTag = this.d | 4;
            } else if (readTag == 42) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
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
            } else if (readTag == 50) {
                if (this.b == null) {
                    this.b = new algv();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 58) {
                this.h = codedInputByteBufferNano.readString();
                readTag = this.d | 8;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.d = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.e);
        }
        if ((this.d & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.f);
        }
        if ((this.d & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.g);
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
                    codedOutputByteBufferNano.writeMessage(5, messageNano);
                }
                i++;
            }
        }
        algv algv = this.b;
        if (algv != null) {
            codedOutputByteBufferNano.writeMessage(6, algv);
        }
        if ((this.d & 8) != 0) {
            codedOutputByteBufferNano.writeString(7, this.h);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
