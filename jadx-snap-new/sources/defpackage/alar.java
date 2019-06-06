package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.Int32Value;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alar */
public final class alar extends ExtendableMessageNano<alar> {
    private int a = 0;
    private byte[] b = WireFormatNano.EMPTY_BYTES;
    private Int32Value c = null;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;

    public alar() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static alar a(byte[] bArr) {
        return (alar) MessageNano.mergeFrom(new alar(), bArr);
    }

    public final String a() {
        return this.h;
    }

    public final String b() {
        return this.i;
    }

    public final String c() {
        return this.j;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.b);
        }
        Int32Value int32Value = this.c;
        if (int32Value != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, int32Value);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.e);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.f);
        }
        if ((this.a & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.g);
        }
        if ((this.a & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.h);
        }
        if ((this.a & 64) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.i);
        }
        if ((this.a & 128) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.j);
        }
        return (this.a & 256) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.k) : computeSerializedSize;
    }

    public final String d() {
        return this.k;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.b = codedInputByteBufferNano.readBytes();
                    readTag = this.a | 1;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new Int32Value();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                    continue;
                case 26:
                    this.d = codedInputByteBufferNano.readString();
                    readTag = this.a | 2;
                    break;
                case 34:
                    this.e = codedInputByteBufferNano.readString();
                    readTag = this.a | 4;
                    break;
                case 42:
                    this.f = codedInputByteBufferNano.readString();
                    readTag = this.a | 8;
                    break;
                case 50:
                    this.g = codedInputByteBufferNano.readString();
                    readTag = this.a | 16;
                    break;
                case 58:
                    this.h = codedInputByteBufferNano.readString();
                    readTag = this.a | 32;
                    break;
                case 66:
                    this.i = codedInputByteBufferNano.readString();
                    readTag = this.a | 64;
                    break;
                case 74:
                    this.j = codedInputByteBufferNano.readString();
                    readTag = this.a | 128;
                    break;
                case 82:
                    this.k = codedInputByteBufferNano.readString();
                    readTag = this.a | 256;
                    break;
                default:
                    if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    continue;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.b);
        }
        Int32Value int32Value = this.c;
        if (int32Value != null) {
            codedOutputByteBufferNano.writeMessage(2, int32Value);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeString(4, this.e);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeString(5, this.f);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeString(6, this.g);
        }
        if ((this.a & 32) != 0) {
            codedOutputByteBufferNano.writeString(7, this.h);
        }
        if ((this.a & 64) != 0) {
            codedOutputByteBufferNano.writeString(8, this.i);
        }
        if ((this.a & 128) != 0) {
            codedOutputByteBufferNano.writeString(9, this.j);
        }
        if ((this.a & 256) != 0) {
            codedOutputByteBufferNano.writeString(10, this.k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
