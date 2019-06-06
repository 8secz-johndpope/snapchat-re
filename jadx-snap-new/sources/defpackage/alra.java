package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alra */
public final class alra extends ExtendableMessageNano<alra> {
    public alqx[] a;
    public alrb[] b;

    public alra() {
        this.a = alqx.a();
        this.b = alrb.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        alqx[] alqxArr = this.a;
        int i = 0;
        if (alqxArr != null && alqxArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                alqx[] alqxArr2 = this.a;
                if (computeSerializedSize >= alqxArr2.length) {
                    break;
                }
                MessageNano messageNano = alqxArr2[computeSerializedSize];
                if (messageNano != null) {
                    i2 += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        alrb[] alrbArr = this.b;
        if (alrbArr != null && alrbArr.length > 0) {
            while (true) {
                alrbArr = this.b;
                if (i >= alrbArr.length) {
                    break;
                }
                MessageNano messageNano2 = alrbArr[i];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano2);
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
            int length;
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                alqx[] alqxArr = this.a;
                length = alqxArr == null ? 0 : alqxArr.length;
                alqx[] alqxArr2 = new alqx[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, alqxArr2, 0, length);
                }
                while (length < alqxArr2.length - 1) {
                    alqxArr2[length] = new alqx();
                    codedInputByteBufferNano.readMessage(alqxArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                alqxArr2[length] = new alqx();
                codedInputByteBufferNano.readMessage(alqxArr2[length]);
                this.a = alqxArr2;
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                alrb[] alrbArr = this.b;
                length = alrbArr == null ? 0 : alrbArr.length;
                alrb[] alrbArr2 = new alrb[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, alrbArr2, 0, length);
                }
                while (length < alrbArr2.length - 1) {
                    alrbArr2[length] = new alrb();
                    codedInputByteBufferNano.readMessage(alrbArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                alrbArr2[length] = new alrb();
                codedInputByteBufferNano.readMessage(alrbArr2[length]);
                this.b = alrbArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        alqx[] alqxArr = this.a;
        int i = 0;
        if (alqxArr != null && alqxArr.length > 0) {
            int i2 = 0;
            while (true) {
                alqx[] alqxArr2 = this.a;
                if (i2 >= alqxArr2.length) {
                    break;
                }
                MessageNano messageNano = alqxArr2[i2];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i2++;
            }
        }
        alrb[] alrbArr = this.b;
        if (alrbArr != null && alrbArr.length > 0) {
            while (true) {
                alrbArr = this.b;
                if (i >= alrbArr.length) {
                    break;
                }
                MessageNano messageNano2 = alrbArr[i];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
