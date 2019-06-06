package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aeaj */
public final class aeaj extends ExtendableMessageNano<aeaj> {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e = false;
    public String f;
    public String g;
    public String h;
    public aeak[] i;

    public aeaj() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = aeak.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = "";
        if (!this.a.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        if (!this.b.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        if (!this.c.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        if (!this.d.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        boolean z = this.e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        if (!this.f.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        if (!this.g.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.g);
        }
        if (!this.h.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.h);
        }
        aeak[] aeakArr = this.i;
        if (aeakArr != null && aeakArr.length > 0) {
            int i = 0;
            while (true) {
                aeak[] aeakArr2 = this.i;
                if (i >= aeakArr2.length) {
                    break;
                }
                MessageNano messageNano = aeakArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(9, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readString();
            } else if (readTag == 34) {
                this.d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readBool();
            } else if (readTag == 50) {
                this.f = codedInputByteBufferNano.readString();
            } else if (readTag == 58) {
                this.g = codedInputByteBufferNano.readString();
            } else if (readTag == 66) {
                this.h = codedInputByteBufferNano.readString();
            } else if (readTag == 74) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                aeak[] aeakArr = this.i;
                int length = aeakArr == null ? 0 : aeakArr.length;
                aeak[] aeakArr2 = new aeak[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.i, 0, aeakArr2, 0, length);
                }
                while (length < aeakArr2.length - 1) {
                    aeakArr2[length] = new aeak();
                    codedInputByteBufferNano.readMessage(aeakArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aeakArr2[length] = new aeak();
                codedInputByteBufferNano.readMessage(aeakArr2[length]);
                this.i = aeakArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        String str = "";
        if (!this.a.equals(str)) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals(str)) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (!this.c.equals(str)) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if (!this.d.equals(str)) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        boolean z = this.e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        if (!this.f.equals(str)) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        if (!this.g.equals(str)) {
            codedOutputByteBufferNano.writeString(7, this.g);
        }
        if (!this.h.equals(str)) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        aeak[] aeakArr = this.i;
        if (aeakArr != null && aeakArr.length > 0) {
            int i = 0;
            while (true) {
                aeak[] aeakArr2 = this.i;
                if (i >= aeakArr2.length) {
                    break;
                }
                MessageNano messageNano = aeakArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(9, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
