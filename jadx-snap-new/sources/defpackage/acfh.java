package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acfh */
public final class acfh extends ExtendableMessageNano<acfh> {
    private acfi[] a;

    public acfh() {
        this.a = acfi.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acfi[] acfiArr = this.a;
        if (acfiArr != null && acfiArr.length > 0) {
            int i = 0;
            while (true) {
                acfi[] acfiArr2 = this.a;
                if (i >= acfiArr2.length) {
                    break;
                }
                MessageNano messageNano = acfiArr2[i];
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
                acfi[] acfiArr = this.a;
                int length = acfiArr == null ? 0 : acfiArr.length;
                acfi[] acfiArr2 = new acfi[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acfiArr2, 0, length);
                }
                while (length < acfiArr2.length - 1) {
                    acfiArr2[length] = new acfi();
                    codedInputByteBufferNano.readMessage(acfiArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acfiArr2[length] = new acfi();
                codedInputByteBufferNano.readMessage(acfiArr2[length]);
                this.a = acfiArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acfi[] acfiArr = this.a;
        if (acfiArr != null && acfiArr.length > 0) {
            int i = 0;
            while (true) {
                acfi[] acfiArr2 = this.a;
                if (i >= acfiArr2.length) {
                    break;
                }
                MessageNano messageNano = acfiArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
