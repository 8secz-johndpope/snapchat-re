package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alaj */
public final class alaj extends ExtendableMessageNano<alaj> {
    private int a = 0;
    private byte[] b = WireFormatNano.EMPTY_BYTES;
    private int c = 0;
    private String d;
    private long e;
    private String f;
    private boolean g;
    private String h;

    public alaj() {
        String str = "";
        this.d = str;
        this.e = 0;
        this.f = str;
        this.g = false;
        this.h = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alaj a() {
        this.c = 2;
        this.a = 2 | this.a;
        return this;
    }

    public final alaj a(long j) {
        this.e = j;
        this.a |= 8;
        return this;
    }

    public final alaj a(String str) {
        if (str != null) {
            this.d = str;
            this.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final alaj a(boolean z) {
        this.g = z;
        this.a |= 32;
        return this;
    }

    public final alaj a(byte[] bArr) {
        if (bArr != null) {
            this.b = bArr;
            this.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final alaj b(String str) {
        if (str != null) {
            this.f = str;
            this.a |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    public final alaj c(String str) {
        if (str != null) {
            this.h = str;
            this.a |= 64;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, this.e);
        }
        if ((this.a & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.f);
        }
        if ((this.a & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(6, this.g);
        }
        return (this.a & 64) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(7, this.h) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int i = 1;
            if (readTag != 10) {
                int i2 = 16;
                if (readTag != 16) {
                    if (readTag != 26) {
                        i = 32;
                        if (readTag == 32) {
                            this.e = codedInputByteBufferNano.readInt64();
                            readTag = this.a | 8;
                        } else if (readTag == 42) {
                            this.f = codedInputByteBufferNano.readString();
                        } else if (readTag == 48) {
                            this.g = codedInputByteBufferNano.readBool();
                        } else if (readTag == 58) {
                            this.h = codedInputByteBufferNano.readString();
                            readTag = this.a | 64;
                        } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                            return this;
                        }
                    } else {
                        this.d = codedInputByteBufferNano.readString();
                        readTag = this.a | 4;
                    }
                    this.a = readTag;
                } else {
                    readTag = codedInputByteBufferNano.readInt32();
                    i2 = 2;
                    if (readTag == 0 || readTag == 1 || readTag == 2) {
                        this.c = readTag;
                    }
                }
                readTag = this.a | i2;
                this.a = readTag;
            } else {
                this.b = codedInputByteBufferNano.readBytes();
            }
            readTag = this.a | i;
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeInt64(4, this.e);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeString(5, this.f);
        }
        if ((this.a & 32) != 0) {
            codedOutputByteBufferNano.writeBool(6, this.g);
        }
        if ((this.a & 64) != 0) {
            codedOutputByteBufferNano.writeString(7, this.h);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
