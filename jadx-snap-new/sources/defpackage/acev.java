package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.Timestamp;
import com.google.protobuf.nano.UInt64Value;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acev */
public final class acev extends ExtendableMessageNano<acev> {
    private static volatile acev[] e;
    public Timestamp a;
    public Timestamp b;
    public long[] c;
    public long[] d;
    private int f;
    private aceh g;
    private String h;
    private String[] i;
    private Timestamp j;
    private int k;
    private int l;
    private UInt64Value m;

    public acev() {
        this.f = 0;
        this.g = null;
        this.h = "";
        this.i = WireFormatNano.EMPTY_STRING_ARRAY;
        this.a = null;
        this.b = null;
        this.c = WireFormatNano.EMPTY_LONG_ARRAY;
        this.d = WireFormatNano.EMPTY_LONG_ARRAY;
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acev[] a() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (e == null) {
                    e = new acev[0];
                }
            }
        }
        return e;
    }

    public final int computeSerializedSize() {
        int i;
        int i2;
        int computeSerializedSize = super.computeSerializedSize();
        aceh aceh = this.g;
        if (aceh != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aceh);
        }
        if ((this.f & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.h);
        }
        String[] strArr = this.i;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i4 = 0;
            i2 = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
                    i4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i4) + (i2 * 1);
        }
        Timestamp timestamp = this.a;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, timestamp);
        }
        timestamp = this.b;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, timestamp);
        }
        long[] jArr = this.c;
        if (jArr != null && jArr.length > 0) {
            long[] jArr2;
            i = 0;
            i2 = 0;
            while (true) {
                jArr2 = this.c;
                if (i >= jArr2.length) {
                    break;
                }
                i2 += CodedOutputByteBufferNano.computeUInt64SizeNoTag(jArr2[i]);
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (jArr2.length * 1);
        }
        jArr = this.d;
        if (jArr != null && jArr.length > 0) {
            long[] jArr3;
            i = 0;
            while (true) {
                jArr3 = this.d;
                if (i3 >= jArr3.length) {
                    break;
                }
                i += CodedOutputByteBufferNano.computeUInt64SizeNoTag(jArr3[i3]);
                i3++;
            }
            computeSerializedSize = (computeSerializedSize + i) + (jArr3.length * 1);
        }
        timestamp = this.j;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, timestamp);
        }
        if ((this.f & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(9, this.k);
        }
        if ((this.f & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(10, this.l);
        }
        UInt64Value uInt64Value = this.m;
        return uInt64Value != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(11, uInt64Value) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:56:0x00ee, code skipped:
            r7.popLimit(r0);
     */
    /* JADX WARNING: Missing block: B:88:0x017d, code skipped:
            r6.f = r0;
     */
    /* JADX WARNING: Missing block: B:93:0x018e, code skipped:
            r7.readMessage(r0);
     */
    public final /* synthetic */ com.google.protobuf.nano.MessageNano mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.readTag();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x0193;
            case 10: goto L_0x0181;
            case 18: goto L_0x0173;
            case 26: goto L_0x0141;
            case 34: goto L_0x0133;
            case 42: goto L_0x0125;
            case 48: goto L_0x00f3;
            case 50: goto L_0x00b3;
            case 56: goto L_0x0081;
            case 58: goto L_0x0045;
            case 66: goto L_0x0036;
            case 72: goto L_0x002a;
            case 80: goto L_0x001e;
            case 90: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = r6.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = r6.m;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.protobuf.nano.UInt64Value;
        r0.<init>();
        r6.m = r0;
    L_0x001a:
        r0 = r6.m;
        goto L_0x018e;
    L_0x001e:
        r0 = r7.readUInt32();
        r6.l = r0;
        r0 = r6.f;
        r0 = r0 | 4;
        goto L_0x017d;
    L_0x002a:
        r0 = r7.readUInt32();
        r6.k = r0;
        r0 = r6.f;
        r0 = r0 | 2;
        goto L_0x017d;
    L_0x0036:
        r0 = r6.j;
        if (r0 != 0) goto L_0x0041;
    L_0x003a:
        r0 = new com.google.protobuf.nano.Timestamp;
        r0.<init>();
        r6.j = r0;
    L_0x0041:
        r0 = r6.j;
        goto L_0x018e;
    L_0x0045:
        r0 = r7.readRawVarint32();
        r0 = r7.pushLimit(r0);
        r2 = r7.getPosition();
        r3 = 0;
    L_0x0052:
        r4 = r7.getBytesUntilLimit();
        if (r4 <= 0) goto L_0x005e;
    L_0x0058:
        r7.readUInt64();
        r3 = r3 + 1;
        goto L_0x0052;
    L_0x005e:
        r7.rewindToPosition(r2);
        r2 = r6.d;
        if (r2 != 0) goto L_0x0067;
    L_0x0065:
        r2 = 0;
        goto L_0x0068;
    L_0x0067:
        r2 = r2.length;
    L_0x0068:
        r3 = r3 + r2;
        r3 = new long[r3];
        if (r2 == 0) goto L_0x0072;
    L_0x006d:
        r4 = r6.d;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0072:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x007e;
    L_0x0075:
        r4 = r7.readUInt64();
        r3[r2] = r4;
        r2 = r2 + 1;
        goto L_0x0072;
    L_0x007e:
        r6.d = r3;
        goto L_0x00ee;
    L_0x0081:
        r0 = 56;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r7, r0);
        r2 = r6.d;
        if (r2 != 0) goto L_0x008d;
    L_0x008b:
        r2 = 0;
        goto L_0x008e;
    L_0x008d:
        r2 = r2.length;
    L_0x008e:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x0098;
    L_0x0093:
        r3 = r6.d;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0098:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00a9;
    L_0x009d:
        r3 = r7.readUInt64();
        r0[r2] = r3;
        r7.readTag();
        r2 = r2 + 1;
        goto L_0x0098;
    L_0x00a9:
        r3 = r7.readUInt64();
        r0[r2] = r3;
        r6.d = r0;
        goto L_0x0000;
    L_0x00b3:
        r0 = r7.readRawVarint32();
        r0 = r7.pushLimit(r0);
        r2 = r7.getPosition();
        r3 = 0;
    L_0x00c0:
        r4 = r7.getBytesUntilLimit();
        if (r4 <= 0) goto L_0x00cc;
    L_0x00c6:
        r7.readUInt64();
        r3 = r3 + 1;
        goto L_0x00c0;
    L_0x00cc:
        r7.rewindToPosition(r2);
        r2 = r6.c;
        if (r2 != 0) goto L_0x00d5;
    L_0x00d3:
        r2 = 0;
        goto L_0x00d6;
    L_0x00d5:
        r2 = r2.length;
    L_0x00d6:
        r3 = r3 + r2;
        r3 = new long[r3];
        if (r2 == 0) goto L_0x00e0;
    L_0x00db:
        r4 = r6.c;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00e0:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x00ec;
    L_0x00e3:
        r4 = r7.readUInt64();
        r3[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00e0;
    L_0x00ec:
        r6.c = r3;
    L_0x00ee:
        r7.popLimit(r0);
        goto L_0x0000;
    L_0x00f3:
        r0 = 48;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r7, r0);
        r2 = r6.c;
        if (r2 != 0) goto L_0x00ff;
    L_0x00fd:
        r2 = 0;
        goto L_0x0100;
    L_0x00ff:
        r2 = r2.length;
    L_0x0100:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x010a;
    L_0x0105:
        r3 = r6.c;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x010a:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x011b;
    L_0x010f:
        r3 = r7.readUInt64();
        r0[r2] = r3;
        r7.readTag();
        r2 = r2 + 1;
        goto L_0x010a;
    L_0x011b:
        r3 = r7.readUInt64();
        r0[r2] = r3;
        r6.c = r0;
        goto L_0x0000;
    L_0x0125:
        r0 = r6.b;
        if (r0 != 0) goto L_0x0130;
    L_0x0129:
        r0 = new com.google.protobuf.nano.Timestamp;
        r0.<init>();
        r6.b = r0;
    L_0x0130:
        r0 = r6.b;
        goto L_0x018e;
    L_0x0133:
        r0 = r6.a;
        if (r0 != 0) goto L_0x013e;
    L_0x0137:
        r0 = new com.google.protobuf.nano.Timestamp;
        r0.<init>();
        r6.a = r0;
    L_0x013e:
        r0 = r6.a;
        goto L_0x018e;
    L_0x0141:
        r0 = 26;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r7, r0);
        r2 = r6.i;
        if (r2 != 0) goto L_0x014d;
    L_0x014b:
        r2 = 0;
        goto L_0x014e;
    L_0x014d:
        r2 = r2.length;
    L_0x014e:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x0158;
    L_0x0153:
        r3 = r6.i;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0158:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0169;
    L_0x015d:
        r1 = r7.readString();
        r0[r2] = r1;
        r7.readTag();
        r2 = r2 + 1;
        goto L_0x0158;
    L_0x0169:
        r1 = r7.readString();
        r0[r2] = r1;
        r6.i = r0;
        goto L_0x0000;
    L_0x0173:
        r0 = r7.readString();
        r6.h = r0;
        r0 = r6.f;
        r0 = r0 | 1;
    L_0x017d:
        r6.f = r0;
        goto L_0x0000;
    L_0x0181:
        r0 = r6.g;
        if (r0 != 0) goto L_0x018c;
    L_0x0185:
        r0 = new aceh;
        r0.<init>();
        r6.g = r0;
    L_0x018c:
        r0 = r6.g;
    L_0x018e:
        r7.readMessage(r0);
        goto L_0x0000;
    L_0x0193:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acev.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.MessageNano");
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        aceh aceh = this.g;
        if (aceh != null) {
            codedOutputByteBufferNano.writeMessage(1, aceh);
        }
        if ((this.f & 1) != 0) {
            codedOutputByteBufferNano.writeString(2, this.h);
        }
        String[] strArr = this.i;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        Timestamp timestamp = this.a;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(4, timestamp);
        }
        timestamp = this.b;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(5, timestamp);
        }
        long[] jArr = this.c;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            while (true) {
                long[] jArr2 = this.c;
                if (i >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt64(6, jArr2[i]);
                i++;
            }
        }
        jArr = this.d;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                jArr = this.d;
                if (i2 >= jArr.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt64(7, jArr[i2]);
                i2++;
            }
        }
        timestamp = this.j;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(8, timestamp);
        }
        if ((this.f & 2) != 0) {
            codedOutputByteBufferNano.writeUInt32(9, this.k);
        }
        if ((this.f & 4) != 0) {
            codedOutputByteBufferNano.writeUInt32(10, this.l);
        }
        UInt64Value uInt64Value = this.m;
        if (uInt64Value != null) {
            codedOutputByteBufferNano.writeMessage(11, uInt64Value);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
