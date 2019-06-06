package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acch */
public final class acch extends ExtendableMessageNano<acch> {
    public accg a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public acch() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int a() {
        return this.c;
    }

    public final acch a(int i) {
        this.c = i;
        this.b |= 1;
        return this;
    }

    public final int b() {
        return this.d;
    }

    public final acch b(int i) {
        this.d = i;
        this.b |= 2;
        return this;
    }

    public final int c() {
        return this.e;
    }

    public final acch c(int i) {
        this.f = i;
        this.b |= 8;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, this.d);
        }
        if ((this.b & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.e);
        }
        if ((this.b & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, this.f);
        }
        accg accg = this.a;
        return accg != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(5, accg) : computeSerializedSize;
    }

    public final acch d() {
        this.e = 30;
        this.b |= 4;
        return this;
    }

    public final int e() {
        return this.f;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.c = codedInputByteBufferNano.readInt32();
                readTag = this.b | 1;
            } else if (readTag == 16) {
                this.d = codedInputByteBufferNano.readInt32();
                readTag = this.b | 2;
            } else if (readTag == 24) {
                this.e = codedInputByteBufferNano.readInt32();
                readTag = this.b | 4;
            } else if (readTag == 32) {
                this.f = codedInputByteBufferNano.readInt32();
                readTag = this.b | 8;
            } else if (readTag == 42) {
                if (this.a == null) {
                    this.a = new accg();
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
            codedOutputByteBufferNano.writeInt32(2, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.e);
        }
        if ((this.b & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.f);
        }
        accg accg = this.a;
        if (accg != null) {
            codedOutputByteBufferNano.writeMessage(5, accg);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
