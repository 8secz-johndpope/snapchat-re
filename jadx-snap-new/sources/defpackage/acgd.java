package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acgd */
public final class acgd extends ExtendableMessageNano<acgd> {
    private int a;
    private acfj[] b;
    private acfz[] c;
    private acfk[] d;
    private long e;

    public acgd() {
        this.a = 0;
        this.b = acfj.a();
        this.c = acfz.a();
        this.d = acfk.a();
        this.e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        acfj[] acfjArr = this.b;
        int i2 = 0;
        if (acfjArr != null && acfjArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                acfj[] acfjArr2 = this.b;
                if (computeSerializedSize >= acfjArr2.length) {
                    break;
                }
                messageNano = acfjArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        acfz[] acfzArr = this.c;
        if (acfzArr != null && acfzArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                acfz[] acfzArr2 = this.c;
                if (computeSerializedSize >= acfzArr2.length) {
                    break;
                }
                messageNano = acfzArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        acfk[] acfkArr = this.d;
        if (acfkArr != null && acfkArr.length > 0) {
            while (true) {
                acfkArr = this.d;
                if (i2 >= acfkArr.length) {
                    break;
                }
                MessageNano messageNano2 = acfkArr[i2];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, messageNano2);
                }
                i2++;
            }
        }
        return (this.a & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int length;
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                acfj[] acfjArr = this.b;
                length = acfjArr == null ? 0 : acfjArr.length;
                acfj[] acfjArr2 = new acfj[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, acfjArr2, 0, length);
                }
                while (length < acfjArr2.length - 1) {
                    acfjArr2[length] = new acfj();
                    codedInputByteBufferNano.readMessage(acfjArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acfjArr2[length] = new acfj();
                codedInputByteBufferNano.readMessage(acfjArr2[length]);
                this.b = acfjArr2;
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                acfz[] acfzArr = this.c;
                length = acfzArr == null ? 0 : acfzArr.length;
                acfz[] acfzArr2 = new acfz[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, acfzArr2, 0, length);
                }
                while (length < acfzArr2.length - 1) {
                    acfzArr2[length] = new acfz();
                    codedInputByteBufferNano.readMessage(acfzArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acfzArr2[length] = new acfz();
                codedInputByteBufferNano.readMessage(acfzArr2[length]);
                this.c = acfzArr2;
            } else if (readTag == 26) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                acfk[] acfkArr = this.d;
                length = acfkArr == null ? 0 : acfkArr.length;
                acfk[] acfkArr2 = new acfk[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.d, 0, acfkArr2, 0, length);
                }
                while (length < acfkArr2.length - 1) {
                    acfkArr2[length] = new acfk();
                    codedInputByteBufferNano.readMessage(acfkArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acfkArr2[length] = new acfk();
                codedInputByteBufferNano.readMessage(acfkArr2[length]);
                this.d = acfkArr2;
            } else if (readTag == 32) {
                this.e = codedInputByteBufferNano.readUInt64();
                this.a |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        MessageNano messageNano;
        acfj[] acfjArr = this.b;
        int i2 = 0;
        if (acfjArr != null && acfjArr.length > 0) {
            i = 0;
            while (true) {
                acfj[] acfjArr2 = this.b;
                if (i >= acfjArr2.length) {
                    break;
                }
                messageNano = acfjArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        acfz[] acfzArr = this.c;
        if (acfzArr != null && acfzArr.length > 0) {
            i = 0;
            while (true) {
                acfz[] acfzArr2 = this.c;
                if (i >= acfzArr2.length) {
                    break;
                }
                messageNano = acfzArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        acfk[] acfkArr = this.d;
        if (acfkArr != null && acfkArr.length > 0) {
            while (true) {
                acfkArr = this.d;
                if (i2 >= acfkArr.length) {
                    break;
                }
                MessageNano messageNano2 = acfkArr[i2];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(3, messageNano2);
                }
                i2++;
            }
        }
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeUInt64(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
