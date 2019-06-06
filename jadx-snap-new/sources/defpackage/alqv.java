package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alqv */
public final class alqv extends ExtendableMessageNano<alqv> {
    public alqu[] a;

    public alqv() {
        this.a = alqu.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static alqv a(byte[] bArr) {
        return (alqv) MessageNano.mergeFrom(new alqv(), bArr);
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        alqu[] alquArr = this.a;
        if (alquArr != null && alquArr.length > 0) {
            int i = 0;
            while (true) {
                alqu[] alquArr2 = this.a;
                if (i >= alquArr2.length) {
                    break;
                }
                MessageNano messageNano = alquArr2[i];
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
                alqu[] alquArr = this.a;
                int length = alquArr == null ? 0 : alquArr.length;
                alqu[] alquArr2 = new alqu[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, alquArr2, 0, length);
                }
                while (length < alquArr2.length - 1) {
                    alquArr2[length] = new alqu();
                    codedInputByteBufferNano.readMessage(alquArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                alquArr2[length] = new alqu();
                codedInputByteBufferNano.readMessage(alquArr2[length]);
                this.a = alquArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        alqu[] alquArr = this.a;
        if (alquArr != null && alquArr.length > 0) {
            int i = 0;
            while (true) {
                alqu[] alquArr2 = this.a;
                if (i >= alquArr2.length) {
                    break;
                }
                MessageNano messageNano = alquArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
