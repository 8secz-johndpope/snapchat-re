package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acdq */
public final class acdq extends ExtendableMessageNano<acdq> {
    public int a = 0;
    public Object b;
    public int c = 0;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    public acdq() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acdq a(byte[] bArr) {
        return (acdq) MessageNano.mergeFrom(new acdq(), bArr);
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final acdl c() {
        return this.a == 6 ? (acdl) this.b : null;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.d);
        }
        if ((this.c & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.e);
        }
        if ((this.c & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f);
        }
        if (this.a == 4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano) this.b);
        }
        if (this.a == 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, (MessageNano) this.b);
        }
        if (this.a == 6) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, (MessageNano) this.b);
        }
        if ((this.c & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.g);
        }
        return (this.c & 16) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(8, this.h) : computeSerializedSize;
    }

    public final String d() {
        return this.h;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.c | 1;
            } else if (readTag == 18) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.c | 2;
            } else if (readTag == 26) {
                this.f = codedInputByteBufferNano.readString();
                readTag = this.c | 4;
            } else if (readTag != 34) {
                int i;
                Object acdp;
                if (readTag == 42) {
                    i = 5;
                    if (this.a != 5) {
                        acdp = new acdp();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano) this.b);
                    this.a = i;
                } else if (readTag == 50) {
                    i = 6;
                    if (this.a != 6) {
                        acdp = new acdl();
                    }
                    codedInputByteBufferNano.readMessage((MessageNano) this.b);
                    this.a = i;
                } else if (readTag == 58) {
                    this.g = codedInputByteBufferNano.readString();
                    readTag = this.c | 8;
                } else if (readTag == 66) {
                    this.h = codedInputByteBufferNano.readString();
                    readTag = this.c | 16;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.b = acdp;
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = i;
            } else {
                if (this.a != 4) {
                    this.b = new acdm();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = 4;
            }
            this.c = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.d);
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.e);
        }
        if ((this.c & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.f);
        }
        if (this.a == 4) {
            codedOutputByteBufferNano.writeMessage(4, (MessageNano) this.b);
        }
        if (this.a == 5) {
            codedOutputByteBufferNano.writeMessage(5, (MessageNano) this.b);
        }
        if (this.a == 6) {
            codedOutputByteBufferNano.writeMessage(6, (MessageNano) this.b);
        }
        if ((this.c & 8) != 0) {
            codedOutputByteBufferNano.writeString(7, this.g);
        }
        if ((this.c & 16) != 0) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
