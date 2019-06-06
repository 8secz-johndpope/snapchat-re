package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acge */
public final class acge extends ExtendableMessageNano<acge> {
    private static volatile acge[] a;
    private acfk[] b;

    public acge() {
        this.b = acfk.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acge[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acge[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acfk[] acfkArr = this.b;
        if (acfkArr != null && acfkArr.length > 0) {
            int i = 0;
            while (true) {
                acfk[] acfkArr2 = this.b;
                if (i >= acfkArr2.length) {
                    break;
                }
                MessageNano messageNano = acfkArr2[i];
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
                acfk[] acfkArr = this.b;
                int length = acfkArr == null ? 0 : acfkArr.length;
                acfk[] acfkArr2 = new acfk[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, acfkArr2, 0, length);
                }
                while (length < acfkArr2.length - 1) {
                    acfkArr2[length] = new acfk();
                    codedInputByteBufferNano.readMessage(acfkArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acfkArr2[length] = new acfk();
                codedInputByteBufferNano.readMessage(acfkArr2[length]);
                this.b = acfkArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acfk[] acfkArr = this.b;
        if (acfkArr != null && acfkArr.length > 0) {
            int i = 0;
            while (true) {
                acfk[] acfkArr2 = this.b;
                if (i >= acfkArr2.length) {
                    break;
                }
                MessageNano messageNano = acfkArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
