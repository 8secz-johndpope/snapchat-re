package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acfa */
public final class acfa extends ExtendableMessageNano<acfa> {
    private int a;
    private byte[] b;
    private long c;
    private acgg d;

    public acfa() {
        this.a = 0;
        this.b = WireFormatNano.EMPTY_BYTES;
        this.c = 0;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, this.c);
        }
        acgg acgg = this.d;
        return acgg != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, acgg) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readBytes();
                readTag = this.a | 1;
            } else if (readTag == 16) {
                this.c = codedInputByteBufferNano.readUInt64();
                readTag = this.a | 2;
            } else if (readTag == 26) {
                if (this.d == null) {
                    this.d = new acgg();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeUInt64(2, this.c);
        }
        acgg acgg = this.d;
        if (acgg != null) {
            codedOutputByteBufferNano.writeMessage(3, acgg);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
