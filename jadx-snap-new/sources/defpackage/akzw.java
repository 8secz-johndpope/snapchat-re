package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: akzw */
public final class akzw extends ExtendableMessageNano<akzw> {
    private int a = 0;
    private String b;
    private long c;
    private String d;
    private int e;
    private int f;

    public akzw() {
        String str = "";
        this.b = str;
        this.c = 0;
        this.d = str;
        this.e = 0;
        this.f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final akzw a() {
        this.e = 1;
        this.a |= 8;
        return this;
    }

    public final akzw a(int i) {
        this.f = i;
        this.a |= 16;
        return this;
    }

    public final akzw a(long j) {
        this.c = j;
        this.a |= 2;
        return this;
    }

    public final akzw a(String str) {
        if (str != null) {
            this.b = str;
            this.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final akzw b(String str) {
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
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, this.e);
        }
        return (this.a & 16) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(5, this.f) : computeSerializedSize;
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
            } else if (readTag == 16) {
                this.c = codedInputByteBufferNano.readInt64();
                readTag = this.a | 2;
            } else if (readTag == 26) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.a | 4;
            } else if (readTag == 32) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.e = readTag;
                    readTag = this.a | 8;
                }
            } else if (readTag == 40) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3 || readTag == 4 || readTag == 5) {
                    this.f = readTag;
                    readTag = this.a | 16;
                }
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
            codedOutputByteBufferNano.writeInt64(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.e);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeInt32(5, this.f);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
