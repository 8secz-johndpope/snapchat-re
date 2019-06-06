package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acfc */
public final class acfc extends ExtendableMessageNano<acfc> {
    private int a;
    private acex b;
    private long c;
    private acgg d;
    private boolean e;

    public acfc() {
        this.a = 0;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acex acex = this.b;
        if (acex != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, acex);
        }
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, this.c);
        }
        acgg acgg = this.d;
        if (acgg != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, acgg);
        }
        return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            MessageNano messageNano;
            if (readTag != 10) {
                if (readTag == 16) {
                    this.c = codedInputByteBufferNano.readUInt64();
                    readTag = this.a | 1;
                } else if (readTag == 26) {
                    if (this.d == null) {
                        this.d = new acgg();
                    }
                    messageNano = this.d;
                } else if (readTag == 32) {
                    this.e = codedInputByteBufferNano.readBool();
                    readTag = this.a | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.a = readTag;
            } else {
                if (this.b == null) {
                    this.b = new acex();
                }
                messageNano = this.b;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acex acex = this.b;
        if (acex != null) {
            codedOutputByteBufferNano.writeMessage(1, acex);
        }
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeUInt64(2, this.c);
        }
        acgg acgg = this.d;
        if (acgg != null) {
            codedOutputByteBufferNano.writeMessage(3, acgg);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
