package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alsa */
public final class alsa extends ExtendableMessageNano<alsa> {
    public alrx a;
    private int b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private String f;
    private alae g;
    private alrw[] h;

    public alsa() {
        this.b = 0;
        this.a = null;
        this.c = false;
        this.d = WireFormatNano.EMPTY_BYTES;
        this.e = WireFormatNano.EMPTY_BYTES;
        this.f = "";
        this.g = null;
        this.h = alrw.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alsa a(String str) {
        if (str != null) {
            this.f = str;
            this.b |= 8;
            return this;
        }
        throw new NullPointerException();
    }

    public final alsa a(byte[] bArr) {
        if (bArr != null) {
            this.d = bArr;
            this.b |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        alrx alrx = this.a;
        if (alrx != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, alrx);
        }
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(16, this.d);
        }
        if ((this.b & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(17, this.e);
        }
        if ((this.b & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(18, this.f);
        }
        alae alae = this.g;
        if (alae != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(19, alae);
        }
        alrw[] alrwArr = this.h;
        if (alrwArr != null && alrwArr.length > 0) {
            int i = 0;
            while (true) {
                alrw[] alrwArr2 = this.h;
                if (i >= alrwArr2.length) {
                    break;
                }
                MessageNano messageNano = alrwArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(20, messageNano);
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
            MessageNano messageNano;
            if (readTag != 10) {
                if (readTag == 16) {
                    this.c = codedInputByteBufferNano.readBool();
                    readTag = this.b | 1;
                } else if (readTag == 130) {
                    this.d = codedInputByteBufferNano.readBytes();
                    readTag = this.b | 2;
                } else if (readTag == 138) {
                    this.e = codedInputByteBufferNano.readBytes();
                    readTag = this.b | 4;
                } else if (readTag == 146) {
                    this.f = codedInputByteBufferNano.readString();
                    readTag = this.b | 8;
                } else if (readTag == 154) {
                    if (this.g == null) {
                        this.g = new alae();
                    }
                    messageNano = this.g;
                } else if (readTag == 162) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 162);
                    alrw[] alrwArr = this.h;
                    int length = alrwArr == null ? 0 : alrwArr.length;
                    alrw[] alrwArr2 = new alrw[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, alrwArr2, 0, length);
                    }
                    while (length < alrwArr2.length - 1) {
                        alrwArr2[length] = new alrw();
                        codedInputByteBufferNano.readMessage(alrwArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    alrwArr2[length] = new alrw();
                    codedInputByteBufferNano.readMessage(alrwArr2[length]);
                    this.h = alrwArr2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.b = readTag;
            } else {
                if (this.a == null) {
                    this.a = new alrx();
                }
                messageNano = this.a;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        alrx alrx = this.a;
        if (alrx != null) {
            codedOutputByteBufferNano.writeMessage(1, alrx);
        }
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeBool(2, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeBytes(16, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeBytes(17, this.e);
        }
        if ((this.b & 8) != 0) {
            codedOutputByteBufferNano.writeString(18, this.f);
        }
        alae alae = this.g;
        if (alae != null) {
            codedOutputByteBufferNano.writeMessage(19, alae);
        }
        alrw[] alrwArr = this.h;
        if (alrwArr != null && alrwArr.length > 0) {
            int i = 0;
            while (true) {
                alrw[] alrwArr2 = this.h;
                if (i >= alrwArr2.length) {
                    break;
                }
                MessageNano messageNano = alrwArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(20, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
