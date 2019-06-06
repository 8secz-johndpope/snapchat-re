package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alft */
public final class alft extends ExtendableMessageNano<alft> {
    public algb a;
    public alfw b;
    public alfv c;
    private int d;
    private alfu e;
    private String f;
    private int g;

    public alft() {
        this.d = 0;
        this.a = null;
        this.e = null;
        this.f = "";
        this.g = 0;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alft a(int i) {
        this.g = i;
        this.d |= 2;
        return this;
    }

    public final alft a(String str) {
        if (str != null) {
            this.f = str;
            this.d |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        algb algb = this.a;
        if (algb != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, algb);
        }
        alfu alfu = this.e;
        if (alfu != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, alfu);
        }
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f);
        }
        if ((this.d & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, this.g);
        }
        alfw alfw = this.b;
        if (alfw != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, alfw);
        }
        alfv alfv = this.c;
        return alfv != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, alfv) : computeSerializedSize;
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
                    this.a = new algb();
                }
                messageNano = this.a;
            } else if (readTag != 18) {
                if (readTag == 26) {
                    this.f = codedInputByteBufferNano.readString();
                    readTag = this.d | 1;
                } else if (readTag == 32) {
                    readTag = codedInputByteBufferNano.readInt32();
                    if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3 || readTag == 4 || readTag == 5) {
                        this.g = readTag;
                        readTag = this.d | 2;
                    }
                } else if (readTag == 42) {
                    if (this.b == null) {
                        this.b = new alfw();
                    }
                    messageNano = this.b;
                } else if (readTag == 50) {
                    if (this.c == null) {
                        this.c = new alfv();
                    }
                    messageNano = this.c;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.d = readTag;
            } else {
                if (this.e == null) {
                    this.e = new alfu();
                }
                messageNano = this.e;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        algb algb = this.a;
        if (algb != null) {
            codedOutputByteBufferNano.writeMessage(1, algb);
        }
        alfu alfu = this.e;
        if (alfu != null) {
            codedOutputByteBufferNano.writeMessage(2, alfu);
        }
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeString(3, this.f);
        }
        if ((this.d & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.g);
        }
        alfw alfw = this.b;
        if (alfw != null) {
            codedOutputByteBufferNano.writeMessage(5, alfw);
        }
        alfv alfv = this.c;
        if (alfv != null) {
            codedOutputByteBufferNano.writeMessage(6, alfv);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
