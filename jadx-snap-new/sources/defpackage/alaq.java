package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alaq */
public final class alaq extends ExtendableMessageNano<alaq> {
    public albd a;
    public akzw b;
    public alaj c;
    public albb d;
    private int e;
    private byte[] f;
    private byte[] g;
    private boolean h;
    private boolean i;

    public alaq() {
        this.e = 0;
        this.f = WireFormatNano.EMPTY_BYTES;
        this.g = WireFormatNano.EMPTY_BYTES;
        this.h = false;
        this.i = false;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alaq a(boolean z) {
        this.i = z;
        this.e |= 8;
        return this;
    }

    public final alaq a(byte[] bArr) {
        if (bArr != null) {
            this.f = bArr;
            this.e |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final alaq b(byte[] bArr) {
        if (bArr != null) {
            this.g = bArr;
            this.e |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.e & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f);
        }
        if ((this.e & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.g);
        }
        if ((this.e & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, this.h);
        }
        if ((this.e & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, this.i);
        }
        albd albd = this.a;
        if (albd != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, albd);
        }
        akzw akzw = this.b;
        if (akzw != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, akzw);
        }
        alaj alaj = this.c;
        if (alaj != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, alaj);
        }
        albb albb = this.d;
        return albb != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(9, albb) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f = codedInputByteBufferNano.readBytes();
                readTag = this.e | 1;
            } else if (readTag == 26) {
                this.g = codedInputByteBufferNano.readBytes();
                readTag = this.e | 2;
            } else if (readTag == 32) {
                this.h = codedInputByteBufferNano.readBool();
                readTag = this.e | 4;
            } else if (readTag != 40) {
                MessageNano messageNano;
                if (readTag == 50) {
                    if (this.a == null) {
                        this.a = new albd();
                    }
                    messageNano = this.a;
                } else if (readTag == 58) {
                    if (this.b == null) {
                        this.b = new akzw();
                    }
                    messageNano = this.b;
                } else if (readTag == 66) {
                    if (this.c == null) {
                        this.c = new alaj();
                    }
                    messageNano = this.c;
                } else if (readTag == 74) {
                    if (this.d == null) {
                        this.d = new albb();
                    }
                    messageNano = this.d;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                codedInputByteBufferNano.readMessage(messageNano);
            } else {
                this.i = codedInputByteBufferNano.readBool();
                readTag = this.e | 8;
            }
            this.e = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.e & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.f);
        }
        if ((this.e & 2) != 0) {
            codedOutputByteBufferNano.writeBytes(3, this.g);
        }
        if ((this.e & 4) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.h);
        }
        if ((this.e & 8) != 0) {
            codedOutputByteBufferNano.writeBool(5, this.i);
        }
        albd albd = this.a;
        if (albd != null) {
            codedOutputByteBufferNano.writeMessage(6, albd);
        }
        akzw akzw = this.b;
        if (akzw != null) {
            codedOutputByteBufferNano.writeMessage(7, akzw);
        }
        alaj alaj = this.c;
        if (alaj != null) {
            codedOutputByteBufferNano.writeMessage(8, alaj);
        }
        albb albb = this.d;
        if (albb != null) {
            codedOutputByteBufferNano.writeMessage(9, albb);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
