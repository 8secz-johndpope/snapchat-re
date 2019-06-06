package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: adsg */
public final class adsg extends ExtendableMessageNano<adsg> {
    public a[] a;

    /* renamed from: adsg$a */
    public static final class a extends ExtendableMessageNano<a> {
        private static volatile a[] h;
        public int a;
        public String b;
        public long c;
        public int d;
        public long e;
        public int f;
        public long g;

        public a() {
            this.a = 0;
            this.b = "";
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.unknownFieldData = null;
            this.cachedSize = -1;
        }

        public static a[] a() {
            if (h == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (h == null) {
                        h = new a[0];
                    }
                }
            }
            return h;
        }

        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if ((this.a & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.b);
            }
            if ((this.a & 2) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, this.c);
            }
            if ((this.a & 4) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.d);
            }
            if ((this.a & 8) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, this.e);
            }
            if ((this.a & 16) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, this.f);
            }
            return (this.a & 32) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(6, this.g) : computeSerializedSize;
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
                } else if (readTag == 16) {
                    this.c = codedInputByteBufferNano.readInt64();
                    readTag = this.a | 2;
                } else if (readTag == 24) {
                    readTag = codedInputByteBufferNano.readInt32();
                    switch (readTag) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.d = readTag;
                            readTag = this.a | 4;
                            break;
                        default:
                            continue;
                    }
                } else if (readTag == 32) {
                    this.e = codedInputByteBufferNano.readInt64();
                    readTag = this.a | 8;
                } else if (readTag == 40) {
                    readTag = codedInputByteBufferNano.readInt32();
                    switch (readTag) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f = readTag;
                            readTag = this.a | 16;
                            break;
                        default:
                            continue;
                    }
                } else if (readTag == 48) {
                    this.g = codedInputByteBufferNano.readInt64();
                    readTag = this.a | 32;
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
            if ((this.a & 2) != 0) {
                codedOutputByteBufferNano.writeInt64(2, this.c);
            }
            if ((this.a & 4) != 0) {
                codedOutputByteBufferNano.writeInt32(3, this.d);
            }
            if ((this.a & 8) != 0) {
                codedOutputByteBufferNano.writeInt64(4, this.e);
            }
            if ((this.a & 16) != 0) {
                codedOutputByteBufferNano.writeInt32(5, this.f);
            }
            if ((this.a & 32) != 0) {
                codedOutputByteBufferNano.writeInt64(6, this.g);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public adsg() {
        this.a = a.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.a;
                if (i >= aVarArr2.length) {
                    break;
                }
                MessageNano messageNano = aVarArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                a[] aVarArr = this.a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                a[] aVarArr2 = new a[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, aVarArr2, 0, length);
                }
                while (length < aVarArr2.length - 1) {
                    aVarArr2[length] = new a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aVarArr2[length] = new a();
                codedInputByteBufferNano.readMessage(aVarArr2[length]);
                this.a = aVarArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        a[] aVarArr = this.a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.a;
                if (i >= aVarArr2.length) {
                    break;
                }
                MessageNano messageNano = aVarArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
