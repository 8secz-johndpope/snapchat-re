package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acfe */
public final class acfe extends ExtendableMessageNano<acfe> {
    private int a;
    private acex[] b;
    private long c;
    private acgg d;
    private boolean e;

    public acfe() {
        this.a = 0;
        this.b = acex.a();
        this.c = 0;
        this.d = null;
        this.e = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acex[] acexArr = this.b;
        if (acexArr != null && acexArr.length > 0) {
            int i = 0;
            while (true) {
                acex[] acexArr2 = this.b;
                if (i >= acexArr2.length) {
                    break;
                }
                MessageNano messageNano = acexArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, this.c);
        }
        acgg acgg = this.d;
        if (acgg != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, acgg);
        }
        return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (readTag == 16) {
                    this.c = codedInputByteBufferNano.readUInt64();
                    readTag = this.a | 1;
                } else if (readTag == 26) {
                    if (this.d == null) {
                        this.d = new acgg();
                    }
                    codedInputByteBufferNano.readMessage(this.d);
                } else if (readTag == 32) {
                    this.e = codedInputByteBufferNano.readBool();
                    readTag = this.a | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.a = readTag;
            } else {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                acex[] acexArr = this.b;
                int length = acexArr == null ? 0 : acexArr.length;
                acex[] acexArr2 = new acex[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, acexArr2, 0, length);
                }
                while (length < acexArr2.length - 1) {
                    acexArr2[length] = new acex();
                    codedInputByteBufferNano.readMessage(acexArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acexArr2[length] = new acex();
                codedInputByteBufferNano.readMessage(acexArr2[length]);
                this.b = acexArr2;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acex[] acexArr = this.b;
        if (acexArr != null && acexArr.length > 0) {
            int i = 0;
            while (true) {
                acex[] acexArr2 = this.b;
                if (i >= acexArr2.length) {
                    break;
                }
                MessageNano messageNano = acexArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeUInt64(2, this.c);
        }
        acgg acgg = this.d;
        if (acgg != null) {
            codedOutputByteBufferNano.writeMessage(3, acgg);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
