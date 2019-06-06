package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acea */
public final class acea extends ExtendableMessageNano<acea> {
    public acdy a;
    private int b = 0;
    private String c;
    private String d;
    private String e;

    public acea() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acea a(String str) {
        if (str != null) {
            this.c = str;
            this.b |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final acea b(String str) {
        if (str != null) {
            this.d = str;
            this.b |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final acea c(String str) {
        if (str != null) {
            this.e = str;
            this.b |= 4;
            return this;
        }
        throw new NullPointerException();
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
        acdy acdy = this.a;
        return acdy != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, acdy) : computeSerializedSize;
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
            } else if (readTag == 34) {
                if (this.a == null) {
                    this.a = new acdy();
                }
                codedInputByteBufferNano.readMessage(this.a);
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
        acdy acdy = this.a;
        if (acdy != null) {
            codedOutputByteBufferNano.writeMessage(4, acdy);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
