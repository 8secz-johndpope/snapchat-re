package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: alqx */
public final class alqx extends ExtendableMessageNano<alqx> {
    private static volatile alqx[] e;
    public aler a = null;
    public aler b;
    private int c = 0;
    private Object d;
    private int f = 0;
    private String g;
    private String h;
    private long i;
    private long j;
    private boolean k;
    private int l;
    private int m;

    public alqx() {
        String str = "";
        this.g = str;
        this.h = str;
        this.i = 0;
        this.j = 0;
        this.b = null;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.c = 0;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static alqx[] a() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (e == null) {
                    e = new alqx[0];
                }
            }
        }
        return e;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aler aler = this.a;
        if (aler != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aler);
        }
        if ((this.f & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.g);
        }
        if ((this.f & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.h);
        }
        if ((this.f & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, this.i);
        }
        if ((this.f & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(5, this.j);
        }
        aler = this.b;
        if (aler != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, aler);
        }
        if (this.c == 7) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, (MessageNano) this.d);
        }
        if ((this.f & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, this.k);
        }
        if ((this.f & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, this.l);
        }
        return (this.f & 64) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(10, this.m) : computeSerializedSize;
    }

    public final long d() {
        return this.i;
    }

    public final long e() {
        return this.j;
    }

    public final int f() {
        return this.m;
    }

    /* JADX WARNING: Missing block: B:33:0x0091, code skipped:
            r4.f = r0;
     */
    /* JADX WARNING: Missing block: B:38:0x00a2, code skipped:
            r5.readMessage(r0);
     */
    public final /* synthetic */ com.google.protobuf.nano.MessageNano mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r5) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r5.readTag();
        r1 = 4;
        r2 = 2;
        r3 = 1;
        switch(r0) {
            case 0: goto L_0x00a7;
            case 10: goto L_0x0095;
            case 18: goto L_0x0088;
            case 26: goto L_0x007e;
            case 32: goto L_0x0074;
            case 40: goto L_0x0069;
            case 50: goto L_0x005b;
            case 58: goto L_0x0045;
            case 64: goto L_0x003a;
            case 72: goto L_0x0023;
            case 80: goto L_0x0011;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = r4.storeUnknownField(r5, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0010:
        return r4;
    L_0x0011:
        r0 = r5.readInt32();
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        if (r0 == r3) goto L_0x001c;
    L_0x0019:
        if (r0 == r2) goto L_0x001c;
    L_0x001b:
        goto L_0x0000;
    L_0x001c:
        r4.m = r0;
        r0 = r4.f;
        r0 = r0 | 64;
        goto L_0x0091;
    L_0x0023:
        r0 = r5.readInt32();
        if (r0 == 0) goto L_0x0033;
    L_0x0029:
        if (r0 == r3) goto L_0x0033;
    L_0x002b:
        if (r0 == r2) goto L_0x0033;
    L_0x002d:
        r2 = 3;
        if (r0 == r2) goto L_0x0033;
    L_0x0030:
        if (r0 == r1) goto L_0x0033;
    L_0x0032:
        goto L_0x0000;
    L_0x0033:
        r4.l = r0;
        r0 = r4.f;
        r0 = r0 | 32;
        goto L_0x0091;
    L_0x003a:
        r0 = r5.readBool();
        r4.k = r0;
        r0 = r4.f;
        r0 = r0 | 16;
        goto L_0x0091;
    L_0x0045:
        r0 = r4.c;
        r1 = 7;
        if (r0 == r1) goto L_0x0051;
    L_0x004a:
        r0 = new alqw;
        r0.<init>();
        r4.d = r0;
    L_0x0051:
        r0 = r4.d;
        r0 = (com.google.protobuf.nano.MessageNano) r0;
        r5.readMessage(r0);
        r4.c = r1;
        goto L_0x0000;
    L_0x005b:
        r0 = r4.b;
        if (r0 != 0) goto L_0x0066;
    L_0x005f:
        r0 = new aler;
        r0.<init>();
        r4.b = r0;
    L_0x0066:
        r0 = r4.b;
        goto L_0x00a2;
    L_0x0069:
        r0 = r5.readInt64();
        r4.j = r0;
        r0 = r4.f;
        r0 = r0 | 8;
        goto L_0x0091;
    L_0x0074:
        r2 = r5.readInt64();
        r4.i = r2;
        r0 = r4.f;
        r0 = r0 | r1;
        goto L_0x0091;
    L_0x007e:
        r0 = r5.readString();
        r4.h = r0;
        r0 = r4.f;
        r0 = r0 | r2;
        goto L_0x0091;
    L_0x0088:
        r0 = r5.readString();
        r4.g = r0;
        r0 = r4.f;
        r0 = r0 | r3;
    L_0x0091:
        r4.f = r0;
        goto L_0x0000;
    L_0x0095:
        r0 = r4.a;
        if (r0 != 0) goto L_0x00a0;
    L_0x0099:
        r0 = new aler;
        r0.<init>();
        r4.a = r0;
    L_0x00a0:
        r0 = r4.a;
    L_0x00a2:
        r5.readMessage(r0);
        goto L_0x0000;
    L_0x00a7:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqx.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.MessageNano");
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        aler aler = this.a;
        if (aler != null) {
            codedOutputByteBufferNano.writeMessage(1, aler);
        }
        if ((this.f & 1) != 0) {
            codedOutputByteBufferNano.writeString(2, this.g);
        }
        if ((this.f & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.h);
        }
        if ((this.f & 4) != 0) {
            codedOutputByteBufferNano.writeInt64(4, this.i);
        }
        if ((this.f & 8) != 0) {
            codedOutputByteBufferNano.writeInt64(5, this.j);
        }
        aler = this.b;
        if (aler != null) {
            codedOutputByteBufferNano.writeMessage(6, aler);
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.writeMessage(7, (MessageNano) this.d);
        }
        if ((this.f & 16) != 0) {
            codedOutputByteBufferNano.writeBool(8, this.k);
        }
        if ((this.f & 32) != 0) {
            codedOutputByteBufferNano.writeInt32(9, this.l);
        }
        if ((this.f & 64) != 0) {
            codedOutputByteBufferNano.writeInt32(10, this.m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
