package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acfz */
public final class acfz extends ExtendableMessageNano<acfz> {
    private static volatile acfz[] a;
    private int b = 0;
    private long c = 0;
    private String d;
    private String e;
    private long f;
    private String g;

    public acfz() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = 0;
        this.g = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acfz[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acfz[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.d);
        }
        if ((this.b & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.e);
        }
        if ((this.b & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, this.f);
        }
        return (this.b & 16) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(5, this.g) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.c = codedInputByteBufferNano.readInt64();
                readTag = this.b | 1;
            } else if (readTag == 18) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.b | 2;
            } else if (readTag == 26) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.b | 4;
            } else if (readTag == 32) {
                this.f = codedInputByteBufferNano.readInt64();
                readTag = this.b | 8;
            } else if (readTag == 42) {
                this.g = codedInputByteBufferNano.readString();
                readTag = this.b | 16;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(1, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.e);
        }
        if ((this.b & 8) != 0) {
            codedOutputByteBufferNano.writeInt64(4, this.f);
        }
        if ((this.b & 16) != 0) {
            codedOutputByteBufferNano.writeString(5, this.g);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
