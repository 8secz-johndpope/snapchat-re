package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acet */
public final class acet extends ExtendableMessageNano<acet> {
    private acer[] a;

    public acet() {
        this.a = acer.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acer[] acerArr = this.a;
        if (acerArr != null && acerArr.length > 0) {
            int i = 0;
            while (true) {
                acer[] acerArr2 = this.a;
                if (i >= acerArr2.length) {
                    break;
                }
                MessageNano messageNano = acerArr2[i];
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
                acer[] acerArr = this.a;
                int length = acerArr == null ? 0 : acerArr.length;
                acer[] acerArr2 = new acer[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acerArr2, 0, length);
                }
                while (length < acerArr2.length - 1) {
                    acerArr2[length] = new acer();
                    codedInputByteBufferNano.readMessage(acerArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acerArr2[length] = new acer();
                codedInputByteBufferNano.readMessage(acerArr2[length]);
                this.a = acerArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acer[] acerArr = this.a;
        if (acerArr != null && acerArr.length > 0) {
            int i = 0;
            while (true) {
                acer[] acerArr2 = this.a;
                if (i >= acerArr2.length) {
                    break;
                }
                MessageNano messageNano = acerArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
