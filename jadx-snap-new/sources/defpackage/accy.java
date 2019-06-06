package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: accy */
public final class accy extends ExtendableMessageNano<accy> {
    public accr a = null;
    public accq b;
    private int c = 0;
    private String d;
    private String e;

    public accy() {
        String str = "";
        this.d = str;
        this.e = str;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static accy a(byte[] bArr) {
        return (accy) MessageNano.mergeFrom(new accy(), bArr);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accr accr = this.a;
        if (accr != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, accr);
        }
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.d);
        }
        if ((this.c & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.e);
        }
        accq accq = this.b;
        return accq != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, accq) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            MessageNano messageNano;
            if (readTag != 10) {
                if (readTag == 18) {
                    this.d = codedInputByteBufferNano.readString();
                    readTag = this.c | 1;
                } else if (readTag == 26) {
                    this.e = codedInputByteBufferNano.readString();
                    readTag = this.c | 2;
                } else if (readTag == 34) {
                    if (this.b == null) {
                        this.b = new accq();
                    }
                    messageNano = this.b;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.c = readTag;
            } else {
                if (this.a == null) {
                    this.a = new accr();
                }
                messageNano = this.a;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accr accr = this.a;
        if (accr != null) {
            codedOutputByteBufferNano.writeMessage(1, accr);
        }
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(2, this.d);
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.e);
        }
        accq accq = this.b;
        if (accq != null) {
            codedOutputByteBufferNano.writeMessage(4, accq);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
