package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.Timestamp;

/* renamed from: acdb */
public final class acdb extends ExtendableMessageNano<acdb> {
    private static volatile acdb[] n;
    public String a;
    public Timestamp b;
    public String c;
    public String d;
    public acdj e;
    public String f;
    public String g;
    public String h;
    public acde i;
    public acdh j;
    public acdc k;
    public String l;
    public String m;
    private int o = 0;
    private Timestamp p;
    private acdi q;
    private acdk r;

    public acdb() {
        String str = "";
        this.a = str;
        this.b = null;
        this.p = null;
        this.c = str;
        this.d = str;
        this.e = null;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = null;
        this.j = null;
        this.q = null;
        this.r = null;
        this.k = null;
        this.l = str;
        this.m = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acdb[] a() {
        if (n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (n == null) {
                    n = new acdb[0];
                }
            }
        }
        return n;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.o & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        Timestamp timestamp = this.b;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, timestamp);
        }
        timestamp = this.p;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, timestamp);
        }
        if ((this.o & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.c);
        }
        if ((this.o & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.d);
        }
        acdj acdj = this.e;
        if (acdj != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, acdj);
        }
        if ((this.o & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f);
        }
        if ((this.o & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.g);
        }
        if ((this.o & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.h);
        }
        acde acde = this.i;
        if (acde != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, acde);
        }
        acdh acdh = this.j;
        if (acdh != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, acdh);
        }
        acdi acdi = this.q;
        if (acdi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(12, acdi);
        }
        acdk acdk = this.r;
        if (acdk != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(13, acdk);
        }
        acdc acdc = this.k;
        if (acdc != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(14, acdc);
        }
        if ((this.o & 64) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.l);
        }
        return (this.o & 128) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(16, this.m) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:44:0x00ce, code skipped:
            r2.readMessage(r0);
     */
    /* JADX WARNING: Missing block: B:46:0x00dd, code skipped:
            r1.o = r0;
     */
    public final /* synthetic */ com.google.protobuf.nano.MessageNano mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r2) {
        /*
        r1 = this;
    L_0x0000:
        r0 = r2.readTag();
        switch(r0) {
            case 0: goto L_0x00e1;
            case 10: goto L_0x00d3;
            case 18: goto L_0x00c1;
            case 26: goto L_0x00b3;
            case 34: goto L_0x00a8;
            case 42: goto L_0x009d;
            case 50: goto L_0x008f;
            case 58: goto L_0x0084;
            case 66: goto L_0x0079;
            case 74: goto L_0x006e;
            case 82: goto L_0x0060;
            case 90: goto L_0x0052;
            case 98: goto L_0x0044;
            case 106: goto L_0x0035;
            case 114: goto L_0x0026;
            case 122: goto L_0x001a;
            case 130: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = r1.storeUnknownField(r2, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r1;
    L_0x000e:
        r0 = r2.readString();
        r1.m = r0;
        r0 = r1.o;
        r0 = r0 | 128;
        goto L_0x00dd;
    L_0x001a:
        r0 = r2.readString();
        r1.l = r0;
        r0 = r1.o;
        r0 = r0 | 64;
        goto L_0x00dd;
    L_0x0026:
        r0 = r1.k;
        if (r0 != 0) goto L_0x0031;
    L_0x002a:
        r0 = new acdc;
        r0.<init>();
        r1.k = r0;
    L_0x0031:
        r0 = r1.k;
        goto L_0x00ce;
    L_0x0035:
        r0 = r1.r;
        if (r0 != 0) goto L_0x0040;
    L_0x0039:
        r0 = new acdk;
        r0.<init>();
        r1.r = r0;
    L_0x0040:
        r0 = r1.r;
        goto L_0x00ce;
    L_0x0044:
        r0 = r1.q;
        if (r0 != 0) goto L_0x004f;
    L_0x0048:
        r0 = new acdi;
        r0.<init>();
        r1.q = r0;
    L_0x004f:
        r0 = r1.q;
        goto L_0x00ce;
    L_0x0052:
        r0 = r1.j;
        if (r0 != 0) goto L_0x005d;
    L_0x0056:
        r0 = new acdh;
        r0.<init>();
        r1.j = r0;
    L_0x005d:
        r0 = r1.j;
        goto L_0x00ce;
    L_0x0060:
        r0 = r1.i;
        if (r0 != 0) goto L_0x006b;
    L_0x0064:
        r0 = new acde;
        r0.<init>();
        r1.i = r0;
    L_0x006b:
        r0 = r1.i;
        goto L_0x00ce;
    L_0x006e:
        r0 = r2.readString();
        r1.h = r0;
        r0 = r1.o;
        r0 = r0 | 32;
        goto L_0x00dd;
    L_0x0079:
        r0 = r2.readString();
        r1.g = r0;
        r0 = r1.o;
        r0 = r0 | 16;
        goto L_0x00dd;
    L_0x0084:
        r0 = r2.readString();
        r1.f = r0;
        r0 = r1.o;
        r0 = r0 | 8;
        goto L_0x00dd;
    L_0x008f:
        r0 = r1.e;
        if (r0 != 0) goto L_0x009a;
    L_0x0093:
        r0 = new acdj;
        r0.<init>();
        r1.e = r0;
    L_0x009a:
        r0 = r1.e;
        goto L_0x00ce;
    L_0x009d:
        r0 = r2.readString();
        r1.d = r0;
        r0 = r1.o;
        r0 = r0 | 4;
        goto L_0x00dd;
    L_0x00a8:
        r0 = r2.readString();
        r1.c = r0;
        r0 = r1.o;
        r0 = r0 | 2;
        goto L_0x00dd;
    L_0x00b3:
        r0 = r1.p;
        if (r0 != 0) goto L_0x00be;
    L_0x00b7:
        r0 = new com.google.protobuf.nano.Timestamp;
        r0.<init>();
        r1.p = r0;
    L_0x00be:
        r0 = r1.p;
        goto L_0x00ce;
    L_0x00c1:
        r0 = r1.b;
        if (r0 != 0) goto L_0x00cc;
    L_0x00c5:
        r0 = new com.google.protobuf.nano.Timestamp;
        r0.<init>();
        r1.b = r0;
    L_0x00cc:
        r0 = r1.b;
    L_0x00ce:
        r2.readMessage(r0);
        goto L_0x0000;
    L_0x00d3:
        r0 = r2.readString();
        r1.a = r0;
        r0 = r1.o;
        r0 = r0 | 1;
    L_0x00dd:
        r1.o = r0;
        goto L_0x0000;
    L_0x00e1:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acdb.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.MessageNano");
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.o & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        Timestamp timestamp = this.b;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(2, timestamp);
        }
        timestamp = this.p;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(3, timestamp);
        }
        if ((this.o & 2) != 0) {
            codedOutputByteBufferNano.writeString(4, this.c);
        }
        if ((this.o & 4) != 0) {
            codedOutputByteBufferNano.writeString(5, this.d);
        }
        acdj acdj = this.e;
        if (acdj != null) {
            codedOutputByteBufferNano.writeMessage(6, acdj);
        }
        if ((this.o & 8) != 0) {
            codedOutputByteBufferNano.writeString(7, this.f);
        }
        if ((this.o & 16) != 0) {
            codedOutputByteBufferNano.writeString(8, this.g);
        }
        if ((this.o & 32) != 0) {
            codedOutputByteBufferNano.writeString(9, this.h);
        }
        acde acde = this.i;
        if (acde != null) {
            codedOutputByteBufferNano.writeMessage(10, acde);
        }
        acdh acdh = this.j;
        if (acdh != null) {
            codedOutputByteBufferNano.writeMessage(11, acdh);
        }
        acdi acdi = this.q;
        if (acdi != null) {
            codedOutputByteBufferNano.writeMessage(12, acdi);
        }
        acdk acdk = this.r;
        if (acdk != null) {
            codedOutputByteBufferNano.writeMessage(13, acdk);
        }
        acdc acdc = this.k;
        if (acdc != null) {
            codedOutputByteBufferNano.writeMessage(14, acdc);
        }
        if ((this.o & 64) != 0) {
            codedOutputByteBufferNano.writeString(15, this.l);
        }
        if ((this.o & 128) != 0) {
            codedOutputByteBufferNano.writeString(16, this.m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
