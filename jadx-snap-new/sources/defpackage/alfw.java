package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alfw */
public final class alfw extends ExtendableMessageNano<alfw> {
    private int a = 0;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;

    public alfw() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alfw a(long j) {
        this.g = j;
        this.a |= 32;
        return this;
    }

    public final alfw a(String str) {
        if (str != null) {
            this.b = str;
            this.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final alfw b(String str) {
        if (str != null) {
            this.c = str;
            this.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final alfw c(String str) {
        if (str != null) {
            this.d = str;
            this.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.e);
        }
        if ((this.a & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.f);
        }
        return (this.a & 32) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(7, this.g) : computeSerializedSize;
    }

    public final alfw d(String str) {
        if (str != null) {
            this.e = str;
            this.a |= 8;
            return this;
        }
        throw new NullPointerException();
    }

    public final alfw e(String str) {
        if (str != null) {
            this.f = str;
            this.a |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                readTag = this.a | 1;
            } else if (readTag == 18) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.a | 2;
            } else if (readTag == 26) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.a | 4;
            } else if (readTag == 34) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.a | 8;
            } else if (readTag == 42) {
                this.f = codedInputByteBufferNano.readString();
                readTag = this.a | 16;
            } else if (readTag == 56) {
                this.g = codedInputByteBufferNano.readUInt64();
                readTag = this.a | 32;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeString(4, this.e);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeString(5, this.f);
        }
        if ((this.a & 32) != 0) {
            codedOutputByteBufferNano.writeUInt64(7, this.g);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
