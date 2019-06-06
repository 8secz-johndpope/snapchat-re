package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acfo */
public final class acfo extends ExtendableMessageNano<acfo> {
    private acev[] a;

    public acfo() {
        this.a = acev.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acev[] acevArr = this.a;
        if (acevArr != null && acevArr.length > 0) {
            int i = 0;
            while (true) {
                acev[] acevArr2 = this.a;
                if (i >= acevArr2.length) {
                    break;
                }
                MessageNano messageNano = acevArr2[i];
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
                acev[] acevArr = this.a;
                int length = acevArr == null ? 0 : acevArr.length;
                acev[] acevArr2 = new acev[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acevArr2, 0, length);
                }
                while (length < acevArr2.length - 1) {
                    acevArr2[length] = new acev();
                    codedInputByteBufferNano.readMessage(acevArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acevArr2[length] = new acev();
                codedInputByteBufferNano.readMessage(acevArr2[length]);
                this.a = acevArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acev[] acevArr = this.a;
        if (acevArr != null && acevArr.length > 0) {
            int i = 0;
            while (true) {
                acev[] acevArr2 = this.a;
                if (i >= acevArr2.length) {
                    break;
                }
                MessageNano messageNano = acevArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
