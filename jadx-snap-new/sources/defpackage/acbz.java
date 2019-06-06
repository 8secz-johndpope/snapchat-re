package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acbz */
public final class acbz extends ExtendableMessageNano<acbz> {
    private static volatile acbz[] c;
    public accf a;
    public acby b;
    private int d = 0;
    private String e;
    private long f;
    private byte[] g;
    private int h;
    private int i;
    private String j;
    private int k;
    private boolean l;

    public acbz() {
        String str = "";
        this.e = str;
        this.a = null;
        this.b = null;
        this.f = 0;
        this.g = WireFormatNano.EMPTY_BYTES;
        this.h = 0;
        this.i = 0;
        this.j = str;
        this.k = 0;
        this.l = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acbz[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new acbz[0];
                }
            }
        }
        return c;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.f;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.e);
        }
        accf accf = this.a;
        if (accf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, accf);
        }
        acby acby = this.b;
        if (acby != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, acby);
        }
        if ((this.d & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, this.f);
        }
        if ((this.d & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.g);
        }
        if ((this.d & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, this.h);
        }
        if ((this.d & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, this.i);
        }
        if ((this.d & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.j);
        }
        if ((this.d & 64) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, this.k);
        }
        return (this.d & 128) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(10, this.l) : computeSerializedSize;
    }

    public final byte[] d() {
        return this.g;
    }

    public final int e() {
        return this.h;
    }

    public final String f() {
        return this.j;
    }

    public final int g() {
        return this.k;
    }

    public final boolean h() {
        return this.l;
    }

    /* JADX WARNING: Missing block: B:28:0x0083, code skipped:
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
            case 0: goto L_0x0095;
            case 10: goto L_0x0088;
            case 18: goto L_0x0076;
            case 26: goto L_0x0068;
            case 32: goto L_0x005e;
            case 42: goto L_0x0054;
            case 48: goto L_0x0049;
            case 56: goto L_0x0032;
            case 66: goto L_0x0027;
            case 72: goto L_0x001c;
            case 80: goto L_0x0011;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = r4.storeUnknownField(r5, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0010:
        return r4;
    L_0x0011:
        r0 = r5.readBool();
        r4.l = r0;
        r0 = r4.d;
        r0 = r0 | 128;
        goto L_0x0091;
    L_0x001c:
        r0 = r5.readInt32();
        r4.k = r0;
        r0 = r4.d;
        r0 = r0 | 64;
        goto L_0x0091;
    L_0x0027:
        r0 = r5.readString();
        r4.j = r0;
        r0 = r4.d;
        r0 = r0 | 32;
        goto L_0x0091;
    L_0x0032:
        r0 = r5.readInt32();
        if (r0 == 0) goto L_0x0042;
    L_0x0038:
        if (r0 == r3) goto L_0x0042;
    L_0x003a:
        if (r0 == r2) goto L_0x0042;
    L_0x003c:
        r2 = 3;
        if (r0 == r2) goto L_0x0042;
    L_0x003f:
        if (r0 == r1) goto L_0x0042;
    L_0x0041:
        goto L_0x0000;
    L_0x0042:
        r4.i = r0;
        r0 = r4.d;
        r0 = r0 | 16;
        goto L_0x0091;
    L_0x0049:
        r0 = r5.readInt32();
        r4.h = r0;
        r0 = r4.d;
        r0 = r0 | 8;
        goto L_0x0091;
    L_0x0054:
        r0 = r5.readBytes();
        r4.g = r0;
        r0 = r4.d;
        r0 = r0 | r1;
        goto L_0x0091;
    L_0x005e:
        r0 = r5.readInt64();
        r4.f = r0;
        r0 = r4.d;
        r0 = r0 | r2;
        goto L_0x0091;
    L_0x0068:
        r0 = r4.b;
        if (r0 != 0) goto L_0x0073;
    L_0x006c:
        r0 = new acby;
        r0.<init>();
        r4.b = r0;
    L_0x0073:
        r0 = r4.b;
        goto L_0x0083;
    L_0x0076:
        r0 = r4.a;
        if (r0 != 0) goto L_0x0081;
    L_0x007a:
        r0 = new accf;
        r0.<init>();
        r4.a = r0;
    L_0x0081:
        r0 = r4.a;
    L_0x0083:
        r5.readMessage(r0);
        goto L_0x0000;
    L_0x0088:
        r0 = r5.readString();
        r4.e = r0;
        r0 = r4.d;
        r0 = r0 | r3;
    L_0x0091:
        r4.d = r0;
        goto L_0x0000;
    L_0x0095:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbz.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.MessageNano");
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.e);
        }
        accf accf = this.a;
        if (accf != null) {
            codedOutputByteBufferNano.writeMessage(2, accf);
        }
        acby acby = this.b;
        if (acby != null) {
            codedOutputByteBufferNano.writeMessage(3, acby);
        }
        if ((this.d & 2) != 0) {
            codedOutputByteBufferNano.writeInt64(4, this.f);
        }
        if ((this.d & 4) != 0) {
            codedOutputByteBufferNano.writeBytes(5, this.g);
        }
        if ((this.d & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(6, this.h);
        }
        if ((this.d & 16) != 0) {
            codedOutputByteBufferNano.writeInt32(7, this.i);
        }
        if ((this.d & 32) != 0) {
            codedOutputByteBufferNano.writeString(8, this.j);
        }
        if ((this.d & 64) != 0) {
            codedOutputByteBufferNano.writeInt32(9, this.k);
        }
        if ((this.d & 128) != 0) {
            codedOutputByteBufferNano.writeBool(10, this.l);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
