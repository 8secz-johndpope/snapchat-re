package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acfw */
public final class acfw extends ExtendableMessageNano<acfw> {
    private acgp[] a;

    public acfw() {
        this.a = acgp.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acgp[] acgpArr = this.a;
        if (acgpArr != null && acgpArr.length > 0) {
            int i = 0;
            while (true) {
                acgp[] acgpArr2 = this.a;
                if (i >= acgpArr2.length) {
                    break;
                }
                MessageNano messageNano = acgpArr2[i];
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
                acgp[] acgpArr = this.a;
                int length = acgpArr == null ? 0 : acgpArr.length;
                acgp[] acgpArr2 = new acgp[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acgpArr2, 0, length);
                }
                while (length < acgpArr2.length - 1) {
                    acgpArr2[length] = new acgp();
                    codedInputByteBufferNano.readMessage(acgpArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acgpArr2[length] = new acgp();
                codedInputByteBufferNano.readMessage(acgpArr2[length]);
                this.a = acgpArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acgp[] acgpArr = this.a;
        if (acgpArr != null && acgpArr.length > 0) {
            int i = 0;
            while (true) {
                acgp[] acgpArr2 = this.a;
                if (i >= acgpArr2.length) {
                    break;
                }
                MessageNano messageNano = acgpArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
