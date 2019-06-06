package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: albb */
public final class albb extends ExtendableMessageNano<albb> {
    private int a = 0;
    private int b = 0;
    private String c;
    private byte[] d;
    private String e;
    private long f;

    public albb() {
        String str = "";
        this.c = str;
        this.d = WireFormatNano.EMPTY_BYTES;
        this.e = str;
        this.f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final albb a(int i) {
        this.b = i;
        this.a |= 1;
        return this;
    }

    public final albb a(long j) {
        this.f = j;
        this.a |= 16;
        return this;
    }

    public final albb a(String str) {
        if (str != null) {
            this.c = str;
            this.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final albb b(String str) {
        if (str != null) {
            this.e = str;
            this.a |= 8;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.d);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.e);
        }
        return (this.a & 16) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(5, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int i = 8;
            if (readTag != 8) {
                if (readTag == 18) {
                    this.c = codedInputByteBufferNano.readString();
                    readTag = this.a | 2;
                } else if (readTag == 26) {
                    this.d = codedInputByteBufferNano.readBytes();
                    readTag = this.a | 4;
                } else if (readTag == 34) {
                    this.e = codedInputByteBufferNano.readString();
                } else if (readTag == 40) {
                    this.f = codedInputByteBufferNano.readInt64();
                    readTag = this.a | 16;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.a = readTag;
            } else {
                readTag = codedInputByteBufferNano.readInt32();
                i = 1;
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3) {
                    this.b = readTag;
                }
            }
            readTag = this.a | i;
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeBytes(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeString(4, this.e);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeInt64(5, this.f);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
