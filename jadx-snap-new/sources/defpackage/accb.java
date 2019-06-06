package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: accb */
public final class accb extends ExtendableMessageNano<accb> {
    public acbz[] a;
    public acbt b;
    private int c;
    private String d;
    private boolean e;

    public accb() {
        this.c = 0;
        this.a = acbz.a();
        this.d = "";
        this.b = null;
        this.e = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final String a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acbz[] acbzArr = this.a;
        if (acbzArr != null && acbzArr.length > 0) {
            int i = 0;
            while (true) {
                acbz[] acbzArr2 = this.a;
                if (i >= acbzArr2.length) {
                    break;
                }
                MessageNano messageNano = acbzArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.d);
        }
        acbt acbt = this.b;
        if (acbt != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, acbt);
        }
        return (this.c & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (readTag == 18) {
                    this.d = codedInputByteBufferNano.readString();
                    readTag = this.c | 1;
                } else if (readTag == 26) {
                    if (this.b == null) {
                        this.b = new acbt();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                } else if (readTag == 32) {
                    this.e = codedInputByteBufferNano.readBool();
                    readTag = this.c | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.c = readTag;
            } else {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                acbz[] acbzArr = this.a;
                int length = acbzArr == null ? 0 : acbzArr.length;
                acbz[] acbzArr2 = new acbz[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acbzArr2, 0, length);
                }
                while (length < acbzArr2.length - 1) {
                    acbzArr2[length] = new acbz();
                    codedInputByteBufferNano.readMessage(acbzArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acbzArr2[length] = new acbz();
                codedInputByteBufferNano.readMessage(acbzArr2[length]);
                this.a = acbzArr2;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acbz[] acbzArr = this.a;
        if (acbzArr != null && acbzArr.length > 0) {
            int i = 0;
            while (true) {
                acbz[] acbzArr2 = this.a;
                if (i >= acbzArr2.length) {
                    break;
                }
                MessageNano messageNano = acbzArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(2, this.d);
        }
        acbt acbt = this.b;
        if (acbt != null) {
            codedOutputByteBufferNano.writeMessage(3, acbt);
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
