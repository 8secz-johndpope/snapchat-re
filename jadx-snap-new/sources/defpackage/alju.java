package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alju */
public final class alju extends ExtendableMessageNano<alju> {
    private static volatile alju[] d;
    public int a;
    public String b;
    public int c;

    public alju() {
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static alju[] a() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (d == null) {
                    d = new alju[0];
                }
            }
        }
        return d;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.b);
        }
        return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, this.c) : computeSerializedSize;
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
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.c = readTag;
                    readTag = this.a | 2;
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
            codedOutputByteBufferNano.writeInt32(2, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
