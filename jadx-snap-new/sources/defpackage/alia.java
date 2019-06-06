package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alia */
public final class alia extends ExtendableMessageNano<alia> {
    private int a;
    private double b;
    private double c;
    private double d;
    private boolean e;
    private String f;

    public alia() {
        this.a = 0;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 0.0d;
        this.e = false;
        this.f = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final double a() {
        return this.b;
    }

    public final alia a(double d) {
        this.b = d;
        this.a |= 1;
        return this;
    }

    public final double b() {
        return this.c;
    }

    public final alia b(double d) {
        this.c = d;
        this.a |= 2;
        return this;
    }

    public final double c() {
        return this.d;
    }

    public final alia c(double d) {
        this.d = d;
        this.a |= 4;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.d);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, this.e);
        }
        return (this.a & 16) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(5, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 9) {
                this.b = codedInputByteBufferNano.readDouble();
                readTag = this.a | 1;
            } else if (readTag == 17) {
                this.c = codedInputByteBufferNano.readDouble();
                readTag = this.a | 2;
            } else if (readTag == 25) {
                this.d = codedInputByteBufferNano.readDouble();
                readTag = this.a | 4;
            } else if (readTag == 32) {
                this.e = codedInputByteBufferNano.readBool();
                readTag = this.a | 8;
            } else if (readTag == 42) {
                this.f = codedInputByteBufferNano.readString();
                readTag = this.a | 16;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeDouble(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeDouble(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeDouble(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.e);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeString(5, this.f);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
