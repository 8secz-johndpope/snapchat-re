package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acdg */
public final class acdg extends ExtendableMessageNano<acdg> {
    public acdb[] a;

    public acdg() {
        this.a = acdb.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acdb[] acdbArr = this.a;
        if (acdbArr != null && acdbArr.length > 0) {
            int i = 0;
            while (true) {
                acdb[] acdbArr2 = this.a;
                if (i >= acdbArr2.length) {
                    break;
                }
                MessageNano messageNano = acdbArr2[i];
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
                acdb[] acdbArr = this.a;
                int length = acdbArr == null ? 0 : acdbArr.length;
                acdb[] acdbArr2 = new acdb[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acdbArr2, 0, length);
                }
                while (length < acdbArr2.length - 1) {
                    acdbArr2[length] = new acdb();
                    codedInputByteBufferNano.readMessage(acdbArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acdbArr2[length] = new acdb();
                codedInputByteBufferNano.readMessage(acdbArr2[length]);
                this.a = acdbArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acdb[] acdbArr = this.a;
        if (acdbArr != null && acdbArr.length > 0) {
            int i = 0;
            while (true) {
                acdb[] acdbArr2 = this.a;
                if (i >= acdbArr2.length) {
                    break;
                }
                MessageNano messageNano = acdbArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
