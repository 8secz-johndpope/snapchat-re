package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acem */
public final class acem extends ExtendableMessageNano<acem> {
    private int a;
    private int b;
    private acew c;
    private aceo[] d;

    public acem() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = aceo.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, this.b);
        }
        acew acew = this.c;
        if (acew != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, acew);
        }
        aceo[] aceoArr = this.d;
        if (aceoArr != null && aceoArr.length > 0) {
            int i = 0;
            while (true) {
                aceo[] aceoArr2 = this.d;
                if (i >= aceoArr2.length) {
                    break;
                }
                MessageNano messageNano = aceoArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
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
            if (readTag == 8) {
                this.b = codedInputByteBufferNano.readUInt32();
                this.a |= 1;
            } else if (readTag == 18) {
                if (this.c == null) {
                    this.c = new acew();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 26) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                aceo[] aceoArr = this.d;
                int length = aceoArr == null ? 0 : aceoArr.length;
                aceo[] aceoArr2 = new aceo[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.d, 0, aceoArr2, 0, length);
                }
                while (length < aceoArr2.length - 1) {
                    aceoArr2[length] = new aceo();
                    codedInputByteBufferNano.readMessage(aceoArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aceoArr2[length] = new aceo();
                codedInputByteBufferNano.readMessage(aceoArr2[length]);
                this.d = aceoArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeUInt32(1, this.b);
        }
        acew acew = this.c;
        if (acew != null) {
            codedOutputByteBufferNano.writeMessage(2, acew);
        }
        aceo[] aceoArr = this.d;
        if (aceoArr != null && aceoArr.length > 0) {
            int i = 0;
            while (true) {
                aceo[] aceoArr2 = this.d;
                if (i >= aceoArr2.length) {
                    break;
                }
                MessageNano messageNano = aceoArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(3, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
