package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acgl */
public final class acgl extends ExtendableMessageNano<acgl> {
    private acgj[] a;

    public acgl() {
        this.a = acgj.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acgj[] acgjArr = this.a;
        if (acgjArr != null && acgjArr.length > 0) {
            int i = 0;
            while (true) {
                acgj[] acgjArr2 = this.a;
                if (i >= acgjArr2.length) {
                    break;
                }
                MessageNano messageNano = acgjArr2[i];
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
                acgj[] acgjArr = this.a;
                int length = acgjArr == null ? 0 : acgjArr.length;
                acgj[] acgjArr2 = new acgj[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acgjArr2, 0, length);
                }
                while (length < acgjArr2.length - 1) {
                    acgjArr2[length] = new acgj();
                    codedInputByteBufferNano.readMessage(acgjArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acgjArr2[length] = new acgj();
                codedInputByteBufferNano.readMessage(acgjArr2[length]);
                this.a = acgjArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acgj[] acgjArr = this.a;
        if (acgjArr != null && acgjArr.length > 0) {
            int i = 0;
            while (true) {
                acgj[] acgjArr2 = this.a;
                if (i >= acgjArr2.length) {
                    break;
                }
                MessageNano messageNano = acgjArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
