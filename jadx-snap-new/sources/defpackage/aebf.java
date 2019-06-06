package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: aebf */
public final class aebf extends ExtendableMessageNano<aebf> {
    public aebg a;
    public aebh b;

    public aebf() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aebg aebg = this.a;
        if (aebg != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aebg);
        }
        aebh aebh = this.b;
        return aebh != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, aebh) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            MessageNano messageNano;
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new aebg();
                }
                messageNano = this.a;
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new aebh();
                }
                messageNano = this.b;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        aebg aebg = this.a;
        if (aebg != null) {
            codedOutputByteBufferNano.writeMessage(1, aebg);
        }
        aebh aebh = this.b;
        if (aebh != null) {
            codedOutputByteBufferNano.writeMessage(2, aebh);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
