package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alsc */
public final class alsc extends ExtendableMessageNano<alsc> {
    private alrp[] a;

    public alsc() {
        this.a = alrp.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static alsc a(byte[] bArr) {
        return (alsc) MessageNano.mergeFrom(new alsc(), bArr);
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        alrp[] alrpArr = this.a;
        if (alrpArr != null && alrpArr.length > 0) {
            int i = 0;
            while (true) {
                alrp[] alrpArr2 = this.a;
                if (i >= alrpArr2.length) {
                    break;
                }
                MessageNano messageNano = alrpArr2[i];
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
                alrp[] alrpArr = this.a;
                int length = alrpArr == null ? 0 : alrpArr.length;
                alrp[] alrpArr2 = new alrp[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, alrpArr2, 0, length);
                }
                while (length < alrpArr2.length - 1) {
                    alrpArr2[length] = new alrp();
                    codedInputByteBufferNano.readMessage(alrpArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                alrpArr2[length] = new alrp();
                codedInputByteBufferNano.readMessage(alrpArr2[length]);
                this.a = alrpArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        alrp[] alrpArr = this.a;
        if (alrpArr != null && alrpArr.length > 0) {
            int i = 0;
            while (true) {
                alrp[] alrpArr2 = this.a;
                if (i >= alrpArr2.length) {
                    break;
                }
                MessageNano messageNano = alrpArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
