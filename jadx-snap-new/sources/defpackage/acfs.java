package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acfs */
public final class acfs extends ExtendableMessageNano<acfs> {
    private acew[] a;

    public acfs() {
        this.a = acew.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acew[] acewArr = this.a;
        if (acewArr != null && acewArr.length > 0) {
            int i = 0;
            while (true) {
                acew[] acewArr2 = this.a;
                if (i >= acewArr2.length) {
                    break;
                }
                MessageNano messageNano = acewArr2[i];
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
                acew[] acewArr = this.a;
                int length = acewArr == null ? 0 : acewArr.length;
                acew[] acewArr2 = new acew[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acewArr2, 0, length);
                }
                while (length < acewArr2.length - 1) {
                    acewArr2[length] = new acew();
                    codedInputByteBufferNano.readMessage(acewArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acewArr2[length] = new acew();
                codedInputByteBufferNano.readMessage(acewArr2[length]);
                this.a = acewArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acew[] acewArr = this.a;
        if (acewArr != null && acewArr.length > 0) {
            int i = 0;
            while (true) {
                acew[] acewArr2 = this.a;
                if (i >= acewArr2.length) {
                    break;
                }
                MessageNano messageNano = acewArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
