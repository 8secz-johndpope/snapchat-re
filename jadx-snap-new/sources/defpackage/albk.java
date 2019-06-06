package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: albk */
public final class albk extends ExtendableMessageNano<albk> {
    private static volatile albk[] a;
    private int b;
    private int c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;
    private double h;

    public albk() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = 0.0d;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static albk[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new albk[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, this.e);
        }
        if ((this.b & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, this.f);
        }
        if ((this.b & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, this.g);
        }
        if ((this.b & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(5, this.h);
        }
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, this.c);
        }
        return (this.b & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(7, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                this.e = codedInputByteBufferNano.readBool();
                readTag = this.b | 4;
            } else if (readTag == 24) {
                this.f = codedInputByteBufferNano.readBool();
                readTag = this.b | 8;
            } else if (readTag == 32) {
                this.g = codedInputByteBufferNano.readBool();
                readTag = this.b | 16;
            } else if (readTag == 41) {
                this.h = codedInputByteBufferNano.readDouble();
                readTag = this.b | 32;
            } else if (readTag == 48) {
                this.c = codedInputByteBufferNano.readInt32();
                readTag = this.b | 1;
            } else if (readTag == 56) {
                this.d = codedInputByteBufferNano.readUInt64();
                readTag = this.b | 2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeBool(2, this.e);
        }
        if ((this.b & 8) != 0) {
            codedOutputByteBufferNano.writeBool(3, this.f);
        }
        if ((this.b & 16) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.g);
        }
        if ((this.b & 32) != 0) {
            codedOutputByteBufferNano.writeDouble(5, this.h);
        }
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(6, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeUInt64(7, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
