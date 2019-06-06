package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acen */
public final class acen extends ExtendableMessageNano<acen> {
    private acep[] a;

    public acen() {
        this.a = acep.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acep[] acepArr = this.a;
        if (acepArr != null && acepArr.length > 0) {
            int i = 0;
            while (true) {
                acep[] acepArr2 = this.a;
                if (i >= acepArr2.length) {
                    break;
                }
                MessageNano messageNano = acepArr2[i];
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
                acep[] acepArr = this.a;
                int length = acepArr == null ? 0 : acepArr.length;
                acep[] acepArr2 = new acep[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acepArr2, 0, length);
                }
                while (length < acepArr2.length - 1) {
                    acepArr2[length] = new acep();
                    codedInputByteBufferNano.readMessage(acepArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acepArr2[length] = new acep();
                codedInputByteBufferNano.readMessage(acepArr2[length]);
                this.a = acepArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acep[] acepArr = this.a;
        if (acepArr != null && acepArr.length > 0) {
            int i = 0;
            while (true) {
                acep[] acepArr2 = this.a;
                if (i >= acepArr2.length) {
                    break;
                }
                MessageNano messageNano = acepArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
