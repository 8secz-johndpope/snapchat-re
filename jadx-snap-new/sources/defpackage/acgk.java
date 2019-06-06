package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acgk */
public final class acgk extends ExtendableMessageNano<acgk> {
    private acgi[] a;
    private acel b;

    public acgk() {
        this.a = acgi.a();
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acgi[] acgiArr = this.a;
        if (acgiArr != null && acgiArr.length > 0) {
            int i = 0;
            while (true) {
                acgi[] acgiArr2 = this.a;
                if (i >= acgiArr2.length) {
                    break;
                }
                MessageNano messageNano = acgiArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        acel acel = this.b;
        return acel != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, acel) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                acgi[] acgiArr = this.a;
                int length = acgiArr == null ? 0 : acgiArr.length;
                acgi[] acgiArr2 = new acgi[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acgiArr2, 0, length);
                }
                while (length < acgiArr2.length - 1) {
                    acgiArr2[length] = new acgi();
                    codedInputByteBufferNano.readMessage(acgiArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acgiArr2[length] = new acgi();
                codedInputByteBufferNano.readMessage(acgiArr2[length]);
                this.a = acgiArr2;
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new acel();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acgi[] acgiArr = this.a;
        if (acgiArr != null && acgiArr.length > 0) {
            int i = 0;
            while (true) {
                acgi[] acgiArr2 = this.a;
                if (i >= acgiArr2.length) {
                    break;
                }
                MessageNano messageNano = acgiArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        acel acel = this.b;
        if (acel != null) {
            codedOutputByteBufferNano.writeMessage(2, acel);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
