package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acco */
public final class acco extends ExtendableMessageNano<acco> {
    public accn[] a;

    public acco() {
        this.a = accn.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accn[] accnArr = this.a;
        if (accnArr != null && accnArr.length > 0) {
            int i = 0;
            while (true) {
                accn[] accnArr2 = this.a;
                if (i >= accnArr2.length) {
                    break;
                }
                MessageNano messageNano = accnArr2[i];
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
                accn[] accnArr = this.a;
                int length = accnArr == null ? 0 : accnArr.length;
                accn[] accnArr2 = new accn[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, accnArr2, 0, length);
                }
                while (length < accnArr2.length - 1) {
                    accnArr2[length] = new accn();
                    codedInputByteBufferNano.readMessage(accnArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                accnArr2[length] = new accn();
                codedInputByteBufferNano.readMessage(accnArr2[length]);
                this.a = accnArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accn[] accnArr = this.a;
        if (accnArr != null && accnArr.length > 0) {
            int i = 0;
            while (true) {
                accn[] accnArr2 = this.a;
                if (i >= accnArr2.length) {
                    break;
                }
                MessageNano messageNano = accnArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
