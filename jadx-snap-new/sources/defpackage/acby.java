package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acby */
public final class acby extends ExtendableMessageNano<acby> {
    private static volatile acby[] c;
    public acby[] a;
    public accf b;
    private int d;
    private int e;
    private int f;
    private int g;

    public acby() {
        this.d = 0;
        this.e = 0;
        this.a = acby.f();
        this.f = 0;
        this.g = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    private static acby[] f() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new acby[0];
                }
            }
        }
        return c;
    }

    public final int a() {
        return this.e;
    }

    public final boolean b() {
        return (this.d & 1) != 0;
    }

    public final int c() {
        return this.f;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.e);
        }
        acby[] acbyArr = this.a;
        if (acbyArr != null && acbyArr.length > 0) {
            int i = 0;
            while (true) {
                acby[] acbyArr2 = this.a;
                if (i >= acbyArr2.length) {
                    break;
                }
                MessageNano messageNano = acbyArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                i++;
            }
        }
        if ((this.d & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.f);
        }
        if ((this.d & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, this.g);
        }
        accf accf = this.b;
        return accf != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(5, accf) : computeSerializedSize;
    }

    public final int d() {
        return this.g;
    }

    public final boolean e() {
        return (this.d & 4) != 0;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.e = readTag;
                    readTag = this.d | 1;
                }
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                acby[] acbyArr = this.a;
                int length = acbyArr == null ? 0 : acbyArr.length;
                acby[] acbyArr2 = new acby[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, acbyArr2, 0, length);
                }
                while (length < acbyArr2.length - 1) {
                    acbyArr2[length] = new acby();
                    codedInputByteBufferNano.readMessage(acbyArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acbyArr2[length] = new acby();
                codedInputByteBufferNano.readMessage(acbyArr2[length]);
                this.a = acbyArr2;
            } else if (readTag == 24) {
                readTag = codedInputByteBufferNano.readInt32();
                switch (readTag) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        this.f = readTag;
                        readTag = this.d | 2;
                        break;
                    default:
                        continue;
                }
            } else if (readTag == 32) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3 || readTag == 4) {
                    this.g = readTag;
                    readTag = this.d | 4;
                }
            } else if (readTag == 42) {
                if (this.b == null) {
                    this.b = new accf();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.d = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.e);
        }
        acby[] acbyArr = this.a;
        if (acbyArr != null && acbyArr.length > 0) {
            int i = 0;
            while (true) {
                acby[] acbyArr2 = this.a;
                if (i >= acbyArr2.length) {
                    break;
                }
                MessageNano messageNano = acbyArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        if ((this.d & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.f);
        }
        if ((this.d & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(4, this.g);
        }
        accf accf = this.b;
        if (accf != null) {
            codedOutputByteBufferNano.writeMessage(5, accf);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
