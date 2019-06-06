package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: adzw */
public final class adzw extends ExtendableMessageNano<adzw> {
    public adzo[] a = adzo.a();
    public adzo[] b = adzo.a();
    public long c = 0;
    public String d;
    public String e;
    public adzo[] f;
    public long g;

    public adzw() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = adzo.a();
        this.g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static adzw a(byte[] bArr) {
        return (adzw) MessageNano.mergeFrom(new adzw(), bArr);
    }

    public final int computeSerializedSize() {
        int i;
        adzo[] adzoArr;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        adzo[] adzoArr2 = this.a;
        int i2 = 0;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.a;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        adzoArr2 = this.b;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.b;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        long j = this.c;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j);
        }
        String str = "";
        if (!this.d.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        if (!this.e.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        adzoArr2 = this.f;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            while (true) {
                adzoArr2 = this.f;
                if (i2 >= adzoArr2.length) {
                    break;
                }
                MessageNano messageNano2 = adzoArr2[i2];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, messageNano2);
                }
                i2++;
            }
        }
        long j2 = this.g;
        return j2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(7, j2) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            adzo[] adzoArr;
            int length;
            adzo[] adzoArr2;
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                adzoArr = this.a;
                length = adzoArr == null ? 0 : adzoArr.length;
                adzoArr2 = new adzo[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, adzoArr2, 0, length);
                }
                while (length < adzoArr2.length - 1) {
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                adzoArr2[length] = new adzo();
                codedInputByteBufferNano.readMessage(adzoArr2[length]);
                this.a = adzoArr2;
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                adzoArr = this.b;
                length = adzoArr == null ? 0 : adzoArr.length;
                adzoArr2 = new adzo[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, adzoArr2, 0, length);
                }
                while (length < adzoArr2.length - 1) {
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                adzoArr2[length] = new adzo();
                codedInputByteBufferNano.readMessage(adzoArr2[length]);
                this.b = adzoArr2;
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readInt64();
            } else if (readTag == 34) {
                this.d = codedInputByteBufferNano.readString();
            } else if (readTag == 42) {
                this.e = codedInputByteBufferNano.readString();
            } else if (readTag == 50) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                adzoArr = this.f;
                length = adzoArr == null ? 0 : adzoArr.length;
                adzoArr2 = new adzo[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.f, 0, adzoArr2, 0, length);
                }
                while (length < adzoArr2.length - 1) {
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                adzoArr2[length] = new adzo();
                codedInputByteBufferNano.readMessage(adzoArr2[length]);
                this.f = adzoArr2;
            } else if (readTag == 56) {
                this.g = codedInputByteBufferNano.readInt64();
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        adzo[] adzoArr;
        MessageNano messageNano;
        adzo[] adzoArr2 = this.a;
        int i2 = 0;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.a;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        adzoArr2 = this.b;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.b;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        long j = this.c;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(3, j);
        }
        String str = "";
        if (!this.d.equals(str)) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals(str)) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        adzoArr2 = this.f;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            while (true) {
                adzoArr2 = this.f;
                if (i2 >= adzoArr2.length) {
                    break;
                }
                MessageNano messageNano2 = adzoArr2[i2];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(6, messageNano2);
                }
                i2++;
            }
        }
        long j2 = this.g;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
