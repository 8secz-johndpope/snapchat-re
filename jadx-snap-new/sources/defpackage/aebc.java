package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: aebc */
public final class aebc extends ExtendableMessageNano<aebc> {
    public aebm a;

    public aebc() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aebm aebm = this.a;
        return aebm != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, aebm) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new aebm();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        aebm aebm = this.a;
        if (aebm != null) {
            codedOutputByteBufferNano.writeMessage(1, aebm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
