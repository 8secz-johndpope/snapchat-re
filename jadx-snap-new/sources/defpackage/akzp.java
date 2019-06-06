package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: akzp */
public final class akzp extends ExtendableMessageNano<akzp> {
    public alby a;
    public akzw b;
    public albd c;
    public alaj d;
    public albb e;
    public alas[] f;
    public byte[][] g;
    private int h;
    private boolean i;
    private alba j;
    private albk[] k;
    private long l;
    private alal m;
    private byte[] n;

    public akzp() {
        this.h = 0;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = alas.a();
        this.i = false;
        this.j = null;
        this.k = albk.a();
        this.l = 0;
        this.g = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.m = null;
        this.n = WireFormatNano.EMPTY_BYTES;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final akzp a(boolean z) {
        this.i = z;
        this.h |= 1;
        return this;
    }

    public final int computeSerializedSize() {
        int i;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        alby alby = this.a;
        if (alby != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, alby);
        }
        akzw akzw = this.b;
        if (akzw != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, akzw);
        }
        albd albd = this.c;
        if (albd != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, albd);
        }
        alaj alaj = this.d;
        if (alaj != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, alaj);
        }
        albb albb = this.e;
        if (albb != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, albb);
        }
        alas[] alasArr = this.f;
        int i2 = 0;
        if (alasArr != null && alasArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                alas[] alasArr2 = this.f;
                if (computeSerializedSize >= alasArr2.length) {
                    break;
                }
                messageNano = alasArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(6, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if ((this.h & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, this.i);
        }
        alba alba = this.j;
        if (alba != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, alba);
        }
        albk[] albkArr = this.k;
        if (albkArr != null && albkArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                albk[] albkArr2 = this.k;
                if (computeSerializedSize >= albkArr2.length) {
                    break;
                }
                messageNano = albkArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(9, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if ((this.h & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(10, this.l);
        }
        byte[][] bArr = this.g;
        if (bArr != null && bArr.length > 0) {
            i = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.g;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i) + (i3 * 1);
        }
        alal alal = this.m;
        if (alal != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(12, alal);
        }
        return (this.h & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(13, this.n) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:38:0x00bd, code skipped:
            r4.h = r0;
     */
    /* JADX WARNING: Missing block: B:70:0x0144, code skipped:
            r5.readMessage(r0);
     */
    public final /* synthetic */ com.google.protobuf.nano.MessageNano mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r5) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r5.readTag();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x0149;
            case 10: goto L_0x0137;
            case 18: goto L_0x0129;
            case 26: goto L_0x011b;
            case 34: goto L_0x010d;
            case 42: goto L_0x00ff;
            case 50: goto L_0x00c1;
            case 56: goto L_0x00b3;
            case 66: goto L_0x00a4;
            case 74: goto L_0x0066;
            case 80: goto L_0x005b;
            case 90: goto L_0x002a;
            case 98: goto L_0x001b;
            case 106: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = r4.storeUnknownField(r5, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = r5.readBytes();
        r4.n = r0;
        r0 = r4.h;
        r0 = r0 | 4;
        goto L_0x00bd;
    L_0x001b:
        r0 = r4.m;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new alal;
        r0.<init>();
        r4.m = r0;
    L_0x0026:
        r0 = r4.m;
        goto L_0x0144;
    L_0x002a:
        r0 = 90;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r5, r0);
        r2 = r4.g;
        if (r2 != 0) goto L_0x0036;
    L_0x0034:
        r2 = 0;
        goto L_0x0037;
    L_0x0036:
        r2 = r2.length;
    L_0x0037:
        r0 = r0 + r2;
        r0 = new byte[r0][];
        if (r2 == 0) goto L_0x0041;
    L_0x003c:
        r3 = r4.g;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0041:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0052;
    L_0x0046:
        r1 = r5.readBytes();
        r0[r2] = r1;
        r5.readTag();
        r2 = r2 + 1;
        goto L_0x0041;
    L_0x0052:
        r1 = r5.readBytes();
        r0[r2] = r1;
        r4.g = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r5.readInt64();
        r4.l = r0;
        r0 = r4.h;
        r0 = r0 | 2;
        goto L_0x00bd;
    L_0x0066:
        r0 = 74;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r5, r0);
        r2 = r4.k;
        if (r2 != 0) goto L_0x0072;
    L_0x0070:
        r2 = 0;
        goto L_0x0073;
    L_0x0072:
        r2 = r2.length;
    L_0x0073:
        r0 = r0 + r2;
        r0 = new defpackage.albk[r0];
        if (r2 == 0) goto L_0x007d;
    L_0x0078:
        r3 = r4.k;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x007d:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0094;
    L_0x0082:
        r1 = new albk;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r5.readMessage(r1);
        r5.readTag();
        r2 = r2 + 1;
        goto L_0x007d;
    L_0x0094:
        r1 = new albk;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r5.readMessage(r1);
        r4.k = r0;
        goto L_0x0000;
    L_0x00a4:
        r0 = r4.j;
        if (r0 != 0) goto L_0x00af;
    L_0x00a8:
        r0 = new alba;
        r0.<init>();
        r4.j = r0;
    L_0x00af:
        r0 = r4.j;
        goto L_0x0144;
    L_0x00b3:
        r0 = r5.readBool();
        r4.i = r0;
        r0 = r4.h;
        r0 = r0 | 1;
    L_0x00bd:
        r4.h = r0;
        goto L_0x0000;
    L_0x00c1:
        r0 = 50;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r5, r0);
        r2 = r4.f;
        if (r2 != 0) goto L_0x00cd;
    L_0x00cb:
        r2 = 0;
        goto L_0x00ce;
    L_0x00cd:
        r2 = r2.length;
    L_0x00ce:
        r0 = r0 + r2;
        r0 = new defpackage.alas[r0];
        if (r2 == 0) goto L_0x00d8;
    L_0x00d3:
        r3 = r4.f;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00d8:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00ef;
    L_0x00dd:
        r1 = new alas;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r5.readMessage(r1);
        r5.readTag();
        r2 = r2 + 1;
        goto L_0x00d8;
    L_0x00ef:
        r1 = new alas;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r5.readMessage(r1);
        r4.f = r0;
        goto L_0x0000;
    L_0x00ff:
        r0 = r4.e;
        if (r0 != 0) goto L_0x010a;
    L_0x0103:
        r0 = new albb;
        r0.<init>();
        r4.e = r0;
    L_0x010a:
        r0 = r4.e;
        goto L_0x0144;
    L_0x010d:
        r0 = r4.d;
        if (r0 != 0) goto L_0x0118;
    L_0x0111:
        r0 = new alaj;
        r0.<init>();
        r4.d = r0;
    L_0x0118:
        r0 = r4.d;
        goto L_0x0144;
    L_0x011b:
        r0 = r4.c;
        if (r0 != 0) goto L_0x0126;
    L_0x011f:
        r0 = new albd;
        r0.<init>();
        r4.c = r0;
    L_0x0126:
        r0 = r4.c;
        goto L_0x0144;
    L_0x0129:
        r0 = r4.b;
        if (r0 != 0) goto L_0x0134;
    L_0x012d:
        r0 = new akzw;
        r0.<init>();
        r4.b = r0;
    L_0x0134:
        r0 = r4.b;
        goto L_0x0144;
    L_0x0137:
        r0 = r4.a;
        if (r0 != 0) goto L_0x0142;
    L_0x013b:
        r0 = new alby;
        r0.<init>();
        r4.a = r0;
    L_0x0142:
        r0 = r4.a;
    L_0x0144:
        r5.readMessage(r0);
        goto L_0x0000;
    L_0x0149:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akzp.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.MessageNano");
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        alby alby = this.a;
        if (alby != null) {
            codedOutputByteBufferNano.writeMessage(1, alby);
        }
        akzw akzw = this.b;
        if (akzw != null) {
            codedOutputByteBufferNano.writeMessage(2, akzw);
        }
        albd albd = this.c;
        if (albd != null) {
            codedOutputByteBufferNano.writeMessage(3, albd);
        }
        alaj alaj = this.d;
        if (alaj != null) {
            codedOutputByteBufferNano.writeMessage(4, alaj);
        }
        albb albb = this.e;
        if (albb != null) {
            codedOutputByteBufferNano.writeMessage(5, albb);
        }
        alas[] alasArr = this.f;
        int i2 = 0;
        if (alasArr != null && alasArr.length > 0) {
            i = 0;
            while (true) {
                alas[] alasArr2 = this.f;
                if (i >= alasArr2.length) {
                    break;
                }
                MessageNano messageNano = alasArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(6, messageNano);
                }
                i++;
            }
        }
        if ((this.h & 1) != 0) {
            codedOutputByteBufferNano.writeBool(7, this.i);
        }
        alba alba = this.j;
        if (alba != null) {
            codedOutputByteBufferNano.writeMessage(8, alba);
        }
        albk[] albkArr = this.k;
        if (albkArr != null && albkArr.length > 0) {
            i = 0;
            while (true) {
                albk[] albkArr2 = this.k;
                if (i >= albkArr2.length) {
                    break;
                }
                MessageNano messageNano2 = albkArr2[i];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(9, messageNano2);
                }
                i++;
            }
        }
        if ((this.h & 2) != 0) {
            codedOutputByteBufferNano.writeInt64(10, this.l);
        }
        byte[][] bArr = this.g;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                bArr = this.g;
                if (i2 >= bArr.length) {
                    break;
                }
                byte[] bArr2 = bArr[i2];
                if (bArr2 != null) {
                    codedOutputByteBufferNano.writeBytes(11, bArr2);
                }
                i2++;
            }
        }
        alal alal = this.m;
        if (alal != null) {
            codedOutputByteBufferNano.writeMessage(12, alal);
        }
        if ((this.h & 4) != 0) {
            codedOutputByteBufferNano.writeBytes(13, this.n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
