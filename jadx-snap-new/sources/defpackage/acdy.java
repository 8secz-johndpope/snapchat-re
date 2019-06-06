package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acdy */
public final class acdy extends ExtendableMessageNano<acdy> {
    public acdz a;
    private int b;
    private int c;
    private String d;

    public acdy() {
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acdy a() {
        this.c = 2;
        this.b |= 1;
        return this;
    }

    public final acdy a(String str) {
        if (str != null) {
            this.d = str;
            this.b |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.d);
        }
        acdz acdz = this.a;
        return acdz != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, acdz) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.c = readTag;
                    readTag = this.b | 1;
                }
            } else if (readTag == 18) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.b | 2;
            } else if (readTag == 26) {
                if (this.a == null) {
                    this.a = new acdz();
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
            codedOutputByteBufferNano.writeInt32(1, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.d);
        }
        acdz acdz = this.a;
        if (acdz != null) {
            codedOutputByteBufferNano.writeMessage(3, acdz);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
