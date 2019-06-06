package defpackage;

import com.google.protobuf.nano.BoolValue;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: accc */
public final class accc extends ExtendableMessageNano<accc> {
    public BoolValue a;
    public BoolValue b;
    private int c;
    private int d;

    public accc() {
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final accc a(int i) {
        this.d = i;
        this.c |= 1;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.d);
        }
        BoolValue boolValue = this.a;
        if (boolValue != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, boolValue);
        }
        boolValue = this.b;
        return boolValue != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, boolValue) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                MessageNano messageNano;
                if (readTag == 18) {
                    if (this.a == null) {
                        this.a = new BoolValue();
                    }
                    messageNano = this.a;
                } else if (readTag == 26) {
                    if (this.b == null) {
                        this.b = new BoolValue();
                    }
                    messageNano = this.b;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                codedInputByteBufferNano.readMessage(messageNano);
            } else {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.d = readTag;
                    this.c |= 1;
                }
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.d);
        }
        BoolValue boolValue = this.a;
        if (boolValue != null) {
            codedOutputByteBufferNano.writeMessage(2, boolValue);
        }
        boolValue = this.b;
        if (boolValue != null) {
            codedOutputByteBufferNano.writeMessage(3, boolValue);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
