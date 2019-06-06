package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acgg */
public final class acgg extends ExtendableMessageNano<acgg> {
    private int a;
    private Object b;

    public acgg() {
        this.a = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano) this.b);
        }
        if (this.a == 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano) this.b);
        }
        return this.a == 99 ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(99, (MessageNano) this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int i;
            Object acez;
            if (readTag == 10) {
                i = 1;
                if (this.a != 1) {
                    acez = new acez();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = i;
            } else if (readTag == 18) {
                i = 2;
                if (this.a != 2) {
                    acez = new acei();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = i;
            } else if (readTag == 794) {
                i = 99;
                if (this.a != 99) {
                    acez = new acgn();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = i;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = acez;
            codedInputByteBufferNano.readMessage((MessageNano) this.b);
            this.a = i;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano) this.b);
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano) this.b);
        }
        if (this.a == 99) {
            codedOutputByteBufferNano.writeMessage(99, (MessageNano) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
