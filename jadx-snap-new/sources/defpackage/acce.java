package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acce */
public final class acce extends ExtendableMessageNano<acce> {
    public alqk a;
    public accd b;
    private int c;
    private a d;
    private acbw e;
    private int f;

    /* renamed from: acce$a */
    public static final class a extends ExtendableMessageNano<a> {
        private int a;
        private boolean b;
        private boolean c;

        public a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.unknownFieldData = null;
            this.cachedSize = -1;
        }

        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if ((this.a & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, this.b);
            }
            return (this.a & 2) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, this.c) : computeSerializedSize;
        }

        public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.b = codedInputByteBufferNano.readBool();
                    readTag = this.a | 1;
                } else if (readTag == 16) {
                    this.c = codedInputByteBufferNano.readBool();
                    readTag = this.a | 2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.a = readTag;
            }
        }

        public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            if ((this.a & 1) != 0) {
                codedOutputByteBufferNano.writeBool(1, this.b);
            }
            if ((this.a & 2) != 0) {
                codedOutputByteBufferNano.writeBool(2, this.c);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public acce() {
        this.c = 0;
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int a() {
        return this.f;
    }

    public final acce a(int i) {
        this.f = i;
        this.c |= 1;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        alqk alqk = this.a;
        if (alqk != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, alqk);
        }
        a aVar = this.d;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        acbw acbw = this.e;
        if (acbw != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, acbw);
        }
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, this.f);
        }
        accd accd = this.b;
        return accd != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(5, accd) : computeSerializedSize;
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
                    this.a = new alqk();
                }
                messageNano = this.a;
            } else if (readTag == 18) {
                if (this.d == null) {
                    this.d = new a();
                }
                messageNano = this.d;
            } else if (readTag == 26) {
                if (this.e == null) {
                    this.e = new acbw();
                }
                messageNano = this.e;
            } else if (readTag == 32) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 3 || readTag == 10 || readTag == 13 || readTag == 14) {
                    this.f = readTag;
                    this.c |= 1;
                }
            } else if (readTag == 42) {
                if (this.b == null) {
                    this.b = new accd();
                }
                messageNano = this.b;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        alqk alqk = this.a;
        if (alqk != null) {
            codedOutputByteBufferNano.writeMessage(1, alqk);
        }
        a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        acbw acbw = this.e;
        if (acbw != null) {
            codedOutputByteBufferNano.writeMessage(3, acbw);
        }
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.f);
        }
        accd accd = this.b;
        if (accd != null) {
            codedOutputByteBufferNano.writeMessage(5, accd);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
