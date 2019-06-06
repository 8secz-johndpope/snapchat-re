package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.MapFactories.MapFactory;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.util.Map;

/* renamed from: alrt */
public final class alrt extends ExtendableMessageNano<alrt> {
    public alrr a;
    public akzp b;
    public alrv c;
    public alrz d;
    public alsd e;
    public Map<Long, byte[]> f;
    private int g;
    private byte[] h;
    private boolean i;

    public alrt() {
        this.g = 0;
        this.h = WireFormatNano.EMPTY_BYTES;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.i = false;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alrt a(byte[] bArr) {
        if (bArr != null) {
            this.h = bArr;
            this.g |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.g & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.h);
        }
        alrr alrr = this.a;
        if (alrr != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, alrr);
        }
        akzp akzp = this.b;
        if (akzp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, akzp);
        }
        alrv alrv = this.c;
        if (alrv != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, alrv);
        }
        alrz alrz = this.d;
        if (alrz != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, alrz);
        }
        alsd alsd = this.e;
        if (alsd != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, alsd);
        }
        if ((this.g & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, this.i);
        }
        Map map = this.f;
        return map != null ? computeSerializedSize + InternalNano.computeMapFieldSize(map, 8, 3, 12) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        MapFactory mapFactory = MapFactories.getMapFactory();
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                MessageNano messageNano;
                if (readTag == 18) {
                    if (this.a == null) {
                        this.a = new alrr();
                    }
                    messageNano = this.a;
                } else if (readTag == 26) {
                    if (this.b == null) {
                        this.b = new akzp();
                    }
                    messageNano = this.b;
                } else if (readTag == 34) {
                    if (this.c == null) {
                        this.c = new alrv();
                    }
                    messageNano = this.c;
                } else if (readTag == 42) {
                    if (this.d == null) {
                        this.d = new alrz();
                    }
                    messageNano = this.d;
                } else if (readTag == 50) {
                    if (this.e == null) {
                        this.e = new alsd();
                    }
                    messageNano = this.e;
                } else if (readTag == 56) {
                    this.i = codedInputByteBufferNano.readBool();
                    readTag = this.g | 2;
                } else if (readTag == 66) {
                    this.f = InternalNano.mergeMapEntry(codedInputByteBufferNano, this.f, mapFactory, 3, 12, null, 8, 18);
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                codedInputByteBufferNano.readMessage(messageNano);
            } else {
                this.h = codedInputByteBufferNano.readBytes();
                readTag = this.g | 1;
            }
            this.g = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.g & 1) != 0) {
            codedOutputByteBufferNano.writeBytes(1, this.h);
        }
        alrr alrr = this.a;
        if (alrr != null) {
            codedOutputByteBufferNano.writeMessage(2, alrr);
        }
        akzp akzp = this.b;
        if (akzp != null) {
            codedOutputByteBufferNano.writeMessage(3, akzp);
        }
        alrv alrv = this.c;
        if (alrv != null) {
            codedOutputByteBufferNano.writeMessage(4, alrv);
        }
        alrz alrz = this.d;
        if (alrz != null) {
            codedOutputByteBufferNano.writeMessage(5, alrz);
        }
        alsd alsd = this.e;
        if (alsd != null) {
            codedOutputByteBufferNano.writeMessage(6, alsd);
        }
        if ((this.g & 2) != 0) {
            codedOutputByteBufferNano.writeBool(7, this.i);
        }
        Map map = this.f;
        if (map != null) {
            InternalNano.serializeMapField(codedOutputByteBufferNano, map, 8, 3, 12);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
