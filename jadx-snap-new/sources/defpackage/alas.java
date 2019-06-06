package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.Int32Value;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alas */
public final class alas extends ExtendableMessageNano<alas> {
    private static volatile alas[] d;
    public Int32Value a;
    public alak b;
    public alam c;
    private int e = 0;
    private int f = 0;
    private String g;
    private String h;
    private int i;
    private boolean j;
    private int k;
    private byte[] l;

    public alas() {
        String str = "";
        this.g = str;
        this.h = str;
        this.a = null;
        this.i = 0;
        this.j = false;
        this.k = 0;
        this.b = null;
        this.c = null;
        this.l = WireFormatNano.EMPTY_BYTES;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static alas[] a() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (d == null) {
                    d = new alas[0];
                }
            }
        }
        return d;
    }

    public final alas a(int i) {
        this.f = i;
        this.e |= 1;
        return this;
    }

    public final alas a(String str) {
        if (str != null) {
            this.g = str;
            this.e |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final alas a(boolean z) {
        this.j = z;
        this.e |= 16;
        return this;
    }

    public final alas b(int i) {
        this.i = i;
        this.e |= 8;
        return this;
    }

    public final alas b(String str) {
        if (str != null) {
            this.h = str;
            this.e |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final alas c(int i) {
        this.k = i;
        this.e |= 32;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.e & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.f);
        }
        if ((this.e & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.g);
        }
        if ((this.e & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.h);
        }
        Int32Value int32Value = this.a;
        if (int32Value != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, int32Value);
        }
        if ((this.e & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, this.i);
        }
        if ((this.e & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, this.j);
        }
        if ((this.e & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, this.k);
        }
        alak alak = this.b;
        if (alak != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(9, alak);
        }
        alam alam = this.c;
        if (alam != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, alam);
        }
        return (this.e & 64) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.l) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:25:0x0069, code skipped:
            r3.readMessage(r0);
     */
    public final /* synthetic */ com.google.protobuf.nano.MessageNano mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r3) {
        /*
        r2 = this;
    L_0x0000:
        r0 = r3.readTag();
        r1 = 1;
        switch(r0) {
            case 0: goto L_0x0095;
            case 8: goto L_0x0086;
            case 18: goto L_0x0078;
            case 34: goto L_0x006d;
            case 42: goto L_0x005c;
            case 48: goto L_0x0051;
            case 56: goto L_0x0046;
            case 64: goto L_0x0036;
            case 74: goto L_0x0028;
            case 82: goto L_0x001a;
            case 90: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = r2.storeUnknownField(r3, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r2;
    L_0x000f:
        r0 = r3.readBytes();
        r2.l = r0;
        r0 = r2.e;
        r0 = r0 | 64;
        goto L_0x0082;
    L_0x001a:
        r0 = r2.c;
        if (r0 != 0) goto L_0x0025;
    L_0x001e:
        r0 = new alam;
        r0.<init>();
        r2.c = r0;
    L_0x0025:
        r0 = r2.c;
        goto L_0x0069;
    L_0x0028:
        r0 = r2.b;
        if (r0 != 0) goto L_0x0033;
    L_0x002c:
        r0 = new alak;
        r0.<init>();
        r2.b = r0;
    L_0x0033:
        r0 = r2.b;
        goto L_0x0069;
    L_0x0036:
        r0 = r3.readInt32();
        if (r0 == 0) goto L_0x003f;
    L_0x003c:
        if (r0 == r1) goto L_0x003f;
    L_0x003e:
        goto L_0x0000;
    L_0x003f:
        r2.k = r0;
        r0 = r2.e;
        r0 = r0 | 32;
        goto L_0x0082;
    L_0x0046:
        r0 = r3.readBool();
        r2.j = r0;
        r0 = r2.e;
        r0 = r0 | 16;
        goto L_0x0082;
    L_0x0051:
        r0 = r3.readInt32();
        r2.i = r0;
        r0 = r2.e;
        r0 = r0 | 8;
        goto L_0x0082;
    L_0x005c:
        r0 = r2.a;
        if (r0 != 0) goto L_0x0067;
    L_0x0060:
        r0 = new com.google.protobuf.nano.Int32Value;
        r0.<init>();
        r2.a = r0;
    L_0x0067:
        r0 = r2.a;
    L_0x0069:
        r3.readMessage(r0);
        goto L_0x0000;
    L_0x006d:
        r0 = r3.readString();
        r2.h = r0;
        r0 = r2.e;
        r0 = r0 | 4;
        goto L_0x0082;
    L_0x0078:
        r0 = r3.readString();
        r2.g = r0;
        r0 = r2.e;
        r0 = r0 | 2;
    L_0x0082:
        r2.e = r0;
        goto L_0x0000;
    L_0x0086:
        r0 = r3.readInt32();
        switch(r0) {
            case 0: goto L_0x008f;
            case 1: goto L_0x008f;
            case 2: goto L_0x008f;
            case 3: goto L_0x008f;
            case 4: goto L_0x008f;
            case 5: goto L_0x008f;
            case 6: goto L_0x008f;
            case 7: goto L_0x008f;
            case 8: goto L_0x008f;
            case 9: goto L_0x008f;
            case 10: goto L_0x008f;
            case 11: goto L_0x008f;
            case 12: goto L_0x008f;
            case 13: goto L_0x008f;
            case 14: goto L_0x008f;
            case 15: goto L_0x008f;
            case 16: goto L_0x008f;
            case 17: goto L_0x008f;
            case 18: goto L_0x008f;
            case 19: goto L_0x008f;
            case 20: goto L_0x008f;
            default: goto L_0x008d;
        };
    L_0x008d:
        goto L_0x0000;
    L_0x008f:
        r2.f = r0;
        r0 = r2.e;
        r0 = r0 | r1;
        goto L_0x0082;
    L_0x0095:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alas.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.MessageNano");
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.e & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.f);
        }
        if ((this.e & 2) != 0) {
            codedOutputByteBufferNano.writeString(2, this.g);
        }
        if ((this.e & 4) != 0) {
            codedOutputByteBufferNano.writeString(4, this.h);
        }
        Int32Value int32Value = this.a;
        if (int32Value != null) {
            codedOutputByteBufferNano.writeMessage(5, int32Value);
        }
        if ((this.e & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(6, this.i);
        }
        if ((this.e & 16) != 0) {
            codedOutputByteBufferNano.writeBool(7, this.j);
        }
        if ((this.e & 32) != 0) {
            codedOutputByteBufferNano.writeInt32(8, this.k);
        }
        alak alak = this.b;
        if (alak != null) {
            codedOutputByteBufferNano.writeMessage(9, alak);
        }
        alam alam = this.c;
        if (alam != null) {
            codedOutputByteBufferNano.writeMessage(10, alam);
        }
        if ((this.e & 64) != 0) {
            codedOutputByteBufferNano.writeBytes(11, this.l);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
