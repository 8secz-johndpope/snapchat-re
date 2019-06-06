package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: accl */
public final class accl extends ExtendableMessageNano<accl> {
    private static volatile accl[] a;
    private int b = 0;
    private String c;
    private String d;
    private String e;
    private int f;

    public accl() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static accl[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new accl[0];
                }
            }
        }
        return a;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return (this.b & 1) != 0;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.d);
        }
        if ((this.b & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.e);
        }
        return (this.b & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, this.f) : computeSerializedSize;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return (this.b & 2) != 0;
    }

    public final String f() {
        return this.e;
    }

    public final boolean g() {
        return (this.b & 4) != 0;
    }

    public final int h() {
        return this.f;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.b | 1;
            } else if (readTag == 18) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.b | 2;
            } else if (readTag == 26) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.b | 4;
            } else if (readTag == 32) {
                this.f = codedInputByteBufferNano.readInt32();
                readTag = this.b | 8;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.e);
        }
        if ((this.b & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.f);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
