package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: accj */
public final class accj extends ExtendableMessageNano<accj> {
    public accl[] a;
    public acci[] b;
    public acck[] c;
    private int d;
    private int e;
    private int f;

    public accj() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.a = accl.a();
        this.b = acci.a();
        this.c = acck.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.f;
    }

    public final int computeSerializedSize() {
        int i;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.e);
        }
        if ((this.d & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, this.f);
        }
        accl[] acclArr = this.a;
        int i2 = 0;
        if (acclArr != null && acclArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                accl[] acclArr2 = this.a;
                if (computeSerializedSize >= acclArr2.length) {
                    break;
                }
                messageNano = acclArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        acci[] acciArr = this.b;
        if (acciArr != null && acciArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                acci[] acciArr2 = this.b;
                if (computeSerializedSize >= acciArr2.length) {
                    break;
                }
                messageNano = acciArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        acck[] acckArr = this.c;
        if (acckArr != null && acckArr.length > 0) {
            while (true) {
                acckArr = this.c;
                if (i2 >= acckArr.length) {
                    break;
                }
                MessageNano messageNano2 = acckArr[i2];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, messageNano2);
                }
                i2++;
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
            if (readTag == 8) {
                this.e = codedInputByteBufferNano.readInt32();
                readTag = this.d | 1;
            } else if (readTag == 16) {
                this.f = codedInputByteBufferNano.readInt32();
                readTag = this.d | 2;
            } else if (readTag == 26) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                accl[] acclArr = this.a;
                length = acclArr == null ? 0 : acclArr.length;
                accl[] acclArr2 = new accl[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acclArr2, 0, length);
                }
                while (length < acclArr2.length - 1) {
                    acclArr2[length] = new accl();
                    codedInputByteBufferNano.readMessage(acclArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acclArr2[length] = new accl();
                codedInputByteBufferNano.readMessage(acclArr2[length]);
                this.a = acclArr2;
            } else if (readTag == 34) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                acci[] acciArr = this.b;
                length = acciArr == null ? 0 : acciArr.length;
                acci[] acciArr2 = new acci[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, acciArr2, 0, length);
                }
                while (length < acciArr2.length - 1) {
                    acciArr2[length] = new acci();
                    codedInputByteBufferNano.readMessage(acciArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acciArr2[length] = new acci();
                codedInputByteBufferNano.readMessage(acciArr2[length]);
                this.b = acciArr2;
            } else if (readTag == 42) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                acck[] acckArr = this.c;
                length = acckArr == null ? 0 : acckArr.length;
                acck[] acckArr2 = new acck[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.c, 0, acckArr2, 0, length);
                }
                while (length < acckArr2.length - 1) {
                    acckArr2[length] = new acck();
                    codedInputByteBufferNano.readMessage(acckArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acckArr2[length] = new acck();
                codedInputByteBufferNano.readMessage(acckArr2[length]);
                this.c = acckArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.d = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        MessageNano messageNano;
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.e);
        }
        if ((this.d & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.f);
        }
        accl[] acclArr = this.a;
        int i2 = 0;
        if (acclArr != null && acclArr.length > 0) {
            i = 0;
            while (true) {
                accl[] acclArr2 = this.a;
                if (i >= acclArr2.length) {
                    break;
                }
                messageNano = acclArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(3, messageNano);
                }
                i++;
            }
        }
        acci[] acciArr = this.b;
        if (acciArr != null && acciArr.length > 0) {
            i = 0;
            while (true) {
                acci[] acciArr2 = this.b;
                if (i >= acciArr2.length) {
                    break;
                }
                messageNano = acciArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i++;
            }
        }
        acck[] acckArr = this.c;
        if (acckArr != null && acckArr.length > 0) {
            while (true) {
                acckArr = this.c;
                if (i2 >= acckArr.length) {
                    break;
                }
                MessageNano messageNano2 = acckArr[i2];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(5, messageNano2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
