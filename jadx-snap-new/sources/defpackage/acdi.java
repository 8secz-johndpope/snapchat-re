package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acdi */
public final class acdi extends ExtendableMessageNano<acdi> {
    private acdx[] a;
    private acdx[] b;

    public acdi() {
        this.a = acdx.a();
        this.b = acdx.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acdx[] acdxArr = this.a;
        int i = 0;
        if (acdxArr != null && acdxArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                acdx[] acdxArr2 = this.a;
                if (computeSerializedSize >= acdxArr2.length) {
                    break;
                }
                MessageNano messageNano = acdxArr2[computeSerializedSize];
                if (messageNano != null) {
                    i2 += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        acdxArr = this.b;
        if (acdxArr != null && acdxArr.length > 0) {
            while (true) {
                acdxArr = this.b;
                if (i >= acdxArr.length) {
                    break;
                }
                MessageNano messageNano2 = acdxArr[i];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano2);
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
            acdx[] acdxArr;
            int length;
            acdx[] acdxArr2;
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                acdxArr = this.a;
                length = acdxArr == null ? 0 : acdxArr.length;
                acdxArr2 = new acdx[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acdxArr2, 0, length);
                }
                while (length < acdxArr2.length - 1) {
                    acdxArr2[length] = new acdx();
                    codedInputByteBufferNano.readMessage(acdxArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acdxArr2[length] = new acdx();
                codedInputByteBufferNano.readMessage(acdxArr2[length]);
                this.a = acdxArr2;
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                acdxArr = this.b;
                length = acdxArr == null ? 0 : acdxArr.length;
                acdxArr2 = new acdx[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, acdxArr2, 0, length);
                }
                while (length < acdxArr2.length - 1) {
                    acdxArr2[length] = new acdx();
                    codedInputByteBufferNano.readMessage(acdxArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acdxArr2[length] = new acdx();
                codedInputByteBufferNano.readMessage(acdxArr2[length]);
                this.b = acdxArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acdx[] acdxArr = this.a;
        int i = 0;
        if (acdxArr != null && acdxArr.length > 0) {
            int i2 = 0;
            while (true) {
                acdx[] acdxArr2 = this.a;
                if (i2 >= acdxArr2.length) {
                    break;
                }
                MessageNano messageNano = acdxArr2[i2];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i2++;
            }
        }
        acdxArr = this.b;
        if (acdxArr != null && acdxArr.length > 0) {
            while (true) {
                acdxArr = this.b;
                if (i >= acdxArr.length) {
                    break;
                }
                MessageNano messageNano2 = acdxArr[i];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
