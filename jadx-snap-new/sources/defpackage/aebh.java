package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aebh */
public final class aebh extends ExtendableMessageNano<aebh> {
    public aeal[] a;

    public aebh() {
        this.a = aeal.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aeal[] aealArr = this.a;
        if (aealArr != null && aealArr.length > 0) {
            int i = 0;
            while (true) {
                aeal[] aealArr2 = this.a;
                if (i >= aealArr2.length) {
                    break;
                }
                MessageNano messageNano = aealArr2[i];
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
                aeal[] aealArr = this.a;
                int length = aealArr == null ? 0 : aealArr.length;
                aeal[] aealArr2 = new aeal[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, aealArr2, 0, length);
                }
                while (length < aealArr2.length - 1) {
                    aealArr2[length] = new aeal();
                    codedInputByteBufferNano.readMessage(aealArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aealArr2[length] = new aeal();
                codedInputByteBufferNano.readMessage(aealArr2[length]);
                this.a = aealArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        aeal[] aealArr = this.a;
        if (aealArr != null && aealArr.length > 0) {
            int i = 0;
            while (true) {
                aeal[] aealArr2 = this.a;
                if (i >= aealArr2.length) {
                    break;
                }
                MessageNano messageNano = aealArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
