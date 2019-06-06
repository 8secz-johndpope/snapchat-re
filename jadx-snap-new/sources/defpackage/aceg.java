package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aceg */
public final class aceg extends ExtendableMessageNano<aceg> {
    private acef[] a;

    public aceg() {
        this.a = acef.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acef[] acefArr = this.a;
        if (acefArr != null && acefArr.length > 0) {
            int i = 0;
            while (true) {
                acef[] acefArr2 = this.a;
                if (i >= acefArr2.length) {
                    break;
                }
                MessageNano messageNano = acefArr2[i];
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
                acef[] acefArr = this.a;
                int length = acefArr == null ? 0 : acefArr.length;
                acef[] acefArr2 = new acef[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acefArr2, 0, length);
                }
                while (length < acefArr2.length - 1) {
                    acefArr2[length] = new acef();
                    codedInputByteBufferNano.readMessage(acefArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acefArr2[length] = new acef();
                codedInputByteBufferNano.readMessage(acefArr2[length]);
                this.a = acefArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acef[] acefArr = this.a;
        if (acefArr != null && acefArr.length > 0) {
            int i = 0;
            while (true) {
                acef[] acefArr2 = this.a;
                if (i >= acefArr2.length) {
                    break;
                }
                MessageNano messageNano = acefArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
