package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aceu */
public final class aceu extends ExtendableMessageNano<aceu> {
    private int a;
    private int b;
    private int c;
    private int d;
    private acge[] e;
    private long f;

    public aceu() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = acge.a();
        this.f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, this.b);
        }
        acge[] acgeArr = this.e;
        if (acgeArr != null && acgeArr.length > 0) {
            int i = 0;
            while (true) {
                acge[] acgeArr2 = this.e;
                if (i >= acgeArr2.length) {
                    break;
                }
                MessageNano messageNano = acgeArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                i++;
            }
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(5, this.f);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(6, this.c);
        }
        return (this.a & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(7, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                this.b = codedInputByteBufferNano.readUInt32();
                readTag = this.a | 1;
            } else if (readTag == 34) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                acge[] acgeArr = this.e;
                int length = acgeArr == null ? 0 : acgeArr.length;
                acge[] acgeArr2 = new acge[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.e, 0, acgeArr2, 0, length);
                }
                while (length < acgeArr2.length - 1) {
                    acgeArr2[length] = new acge();
                    codedInputByteBufferNano.readMessage(acgeArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acgeArr2[length] = new acge();
                codedInputByteBufferNano.readMessage(acgeArr2[length]);
                this.e = acgeArr2;
            } else if (readTag == 40) {
                this.f = codedInputByteBufferNano.readInt64();
                readTag = this.a | 8;
            } else if (readTag == 48) {
                this.c = codedInputByteBufferNano.readUInt32();
                readTag = this.a | 2;
            } else if (readTag == 56) {
                this.d = codedInputByteBufferNano.readUInt32();
                readTag = this.a | 4;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeUInt32(2, this.b);
        }
        acge[] acgeArr = this.e;
        if (acgeArr != null && acgeArr.length > 0) {
            int i = 0;
            while (true) {
                acge[] acgeArr2 = this.e;
                if (i >= acgeArr2.length) {
                    break;
                }
                MessageNano messageNano = acgeArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i++;
            }
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeInt64(5, this.f);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeUInt32(6, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeUInt32(7, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
