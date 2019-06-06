package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: accq */
public final class accq extends ExtendableMessageNano<accq> {
    private static volatile accq[] d;
    public accn a;
    public accr[] b;
    public long c;
    private int e;

    public accq() {
        this.e = 0;
        this.a = null;
        this.b = accr.a();
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static accq[] a() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (d == null) {
                    d = new accq[0];
                }
            }
        }
        return d;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        accn accn = this.a;
        if (accn != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, accn);
        }
        accr[] accrArr = this.b;
        if (accrArr != null && accrArr.length > 0) {
            int i = 0;
            while (true) {
                accr[] accrArr2 = this.b;
                if (i >= accrArr2.length) {
                    break;
                }
                MessageNano messageNano = accrArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                i++;
            }
        }
        return (this.e & 1) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(3, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new accn();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                accr[] accrArr = this.b;
                int length = accrArr == null ? 0 : accrArr.length;
                accr[] accrArr2 = new accr[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, accrArr2, 0, length);
                }
                while (length < accrArr2.length - 1) {
                    accrArr2[length] = new accr();
                    codedInputByteBufferNano.readMessage(accrArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                accrArr2[length] = new accr();
                codedInputByteBufferNano.readMessage(accrArr2[length]);
                this.b = accrArr2;
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readInt64();
                this.e |= 1;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        accn accn = this.a;
        if (accn != null) {
            codedOutputByteBufferNano.writeMessage(1, accn);
        }
        accr[] accrArr = this.b;
        if (accrArr != null && accrArr.length > 0) {
            int i = 0;
            while (true) {
                accr[] accrArr2 = this.b;
                if (i >= accrArr2.length) {
                    break;
                }
                MessageNano messageNano = accrArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        if ((this.e & 1) != 0) {
            codedOutputByteBufferNano.writeInt64(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
