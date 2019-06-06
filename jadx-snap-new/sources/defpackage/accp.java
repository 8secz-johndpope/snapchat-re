package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: accp */
public final class accp extends ExtendableMessageNano<accp> {
    public accq[] a;

    public accp() {
        this.a = accq.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accq[] accqArr = this.a;
        if (accqArr != null && accqArr.length > 0) {
            int i = 0;
            while (true) {
                accq[] accqArr2 = this.a;
                if (i >= accqArr2.length) {
                    break;
                }
                MessageNano messageNano = accqArr2[i];
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
                accq[] accqArr = this.a;
                int length = accqArr == null ? 0 : accqArr.length;
                accq[] accqArr2 = new accq[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, accqArr2, 0, length);
                }
                while (length < accqArr2.length - 1) {
                    accqArr2[length] = new accq();
                    codedInputByteBufferNano.readMessage(accqArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                accqArr2[length] = new accq();
                codedInputByteBufferNano.readMessage(accqArr2[length]);
                this.a = accqArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accq[] accqArr = this.a;
        if (accqArr != null && accqArr.length > 0) {
            int i = 0;
            while (true) {
                accq[] accqArr2 = this.a;
                if (i >= accqArr2.length) {
                    break;
                }
                MessageNano messageNano = accqArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
