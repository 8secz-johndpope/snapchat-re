package defpackage;

/* renamed from: apv */
public final class apv {
    private static long b = 922337203685477580L;
    private static final float[] c = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    private static final float[] d = new float[]{1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    int a;

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x008b A:{SYNTHETIC, EDGE_INSN: B:109:0x008b->B:39:0x008b ?: BREAK  , EDGE_INSN: B:109:0x008b->B:39:0x008b ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a4  */
    public final float a(java.lang.String r23, int r24, int r25) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r25;
        r0.a = r2;
        r2 = r0.a;
        r4 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        if (r2 < r3) goto L_0x0011;
    L_0x0010:
        return r4;
    L_0x0011:
        r2 = r1.charAt(r2);
        r5 = 45;
        r6 = 43;
        r8 = 1;
        if (r2 == r6) goto L_0x0022;
    L_0x001c:
        if (r2 == r5) goto L_0x0020;
    L_0x001e:
        r2 = 0;
        goto L_0x0028;
    L_0x0020:
        r2 = 1;
        goto L_0x0023;
    L_0x0022:
        r2 = 0;
    L_0x0023:
        r9 = r0.a;
        r9 = r9 + r8;
        r0.a = r9;
    L_0x0028:
        r9 = r0.a;
        r10 = 0;
        r17 = r10;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
    L_0x0034:
        r7 = r0.a;
        r5 = 57;
        r6 = 48;
        if (r7 >= r3) goto L_0x008b;
    L_0x003c:
        r7 = r1.charAt(r7);
        if (r7 != r6) goto L_0x004a;
    L_0x0042:
        if (r12 != 0) goto L_0x0047;
    L_0x0044:
        r14 = r14 + 1;
        goto L_0x0081;
    L_0x0047:
        r13 = r13 + 1;
        goto L_0x0081;
    L_0x004a:
        r6 = 49;
        if (r7 < r6) goto L_0x0075;
    L_0x004e:
        if (r7 > r5) goto L_0x0075;
    L_0x0050:
        r12 = r12 + r13;
    L_0x0051:
        r5 = 10;
        if (r13 <= 0) goto L_0x0061;
    L_0x0055:
        r19 = b;
        r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1));
        if (r21 <= 0) goto L_0x005c;
    L_0x005b:
        return r4;
    L_0x005c:
        r17 = r17 * r5;
        r13 = r13 + -1;
        goto L_0x0051;
    L_0x0061:
        r19 = b;
        r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1));
        if (r21 <= 0) goto L_0x0068;
    L_0x0067:
        return r4;
    L_0x0068:
        r17 = r17 * r5;
        r7 = r7 + -48;
        r5 = (long) r7;
        r17 = r17 + r5;
        r12 = r12 + r8;
        r5 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1));
        if (r5 >= 0) goto L_0x0081;
    L_0x0074:
        return r4;
    L_0x0075:
        r6 = 46;
        if (r7 != r6) goto L_0x008b;
    L_0x0079:
        if (r15 != 0) goto L_0x008b;
    L_0x007b:
        r5 = r0.a;
        r5 = r5 - r9;
        r16 = r5;
        r15 = 1;
    L_0x0081:
        r5 = r0.a;
        r5 = r5 + r8;
        r0.a = r5;
        r5 = 45;
        r6 = 43;
        goto L_0x0034;
    L_0x008b:
        if (r15 == 0) goto L_0x0094;
    L_0x008d:
        r6 = r0.a;
        r7 = r16 + 1;
        if (r6 != r7) goto L_0x0094;
    L_0x0093:
        return r4;
    L_0x0094:
        if (r12 != 0) goto L_0x009a;
    L_0x0096:
        if (r14 != 0) goto L_0x0099;
    L_0x0098:
        return r4;
    L_0x0099:
        r12 = 1;
    L_0x009a:
        if (r15 == 0) goto L_0x00a0;
    L_0x009c:
        r16 = r16 - r14;
        r13 = r16 - r12;
    L_0x00a0:
        r6 = r0.a;
        if (r6 >= r3) goto L_0x010e;
    L_0x00a4:
        r6 = r1.charAt(r6);
        r7 = 69;
        if (r6 == r7) goto L_0x00b0;
    L_0x00ac:
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r6 != r7) goto L_0x010e;
    L_0x00b0:
        r6 = r0.a;
        r6 = r6 + r8;
        r0.a = r6;
        r6 = r0.a;
        if (r6 != r3) goto L_0x00ba;
    L_0x00b9:
        return r4;
    L_0x00ba:
        r6 = r1.charAt(r6);
        r7 = 43;
        if (r6 == r7) goto L_0x00d5;
    L_0x00c2:
        r7 = 45;
        if (r6 == r7) goto L_0x00d3;
    L_0x00c6:
        switch(r6) {
            case 48: goto L_0x00d1;
            case 49: goto L_0x00d1;
            case 50: goto L_0x00d1;
            case 51: goto L_0x00d1;
            case 52: goto L_0x00d1;
            case 53: goto L_0x00d1;
            case 54: goto L_0x00d1;
            case 55: goto L_0x00d1;
            case 56: goto L_0x00d1;
            case 57: goto L_0x00d1;
            default: goto L_0x00c9;
        };
    L_0x00c9:
        r6 = r0.a;
        r6 = r6 - r8;
        r0.a = r6;
        r6 = 1;
    L_0x00cf:
        r7 = 0;
        goto L_0x00dc;
    L_0x00d1:
        r6 = 0;
        goto L_0x00cf;
    L_0x00d3:
        r7 = 1;
        goto L_0x00d6;
    L_0x00d5:
        r7 = 0;
    L_0x00d6:
        r6 = r0.a;
        r6 = r6 + r8;
        r0.a = r6;
        r6 = 0;
    L_0x00dc:
        if (r6 != 0) goto L_0x010e;
    L_0x00de:
        r6 = r0.a;
        r9 = 0;
    L_0x00e1:
        r14 = r0.a;
        if (r14 >= r3) goto L_0x0104;
    L_0x00e5:
        r14 = r1.charAt(r14);
        r15 = 48;
        if (r14 < r15) goto L_0x0104;
    L_0x00ed:
        if (r14 > r5) goto L_0x0104;
    L_0x00ef:
        r10 = (long) r9;
        r19 = b;
        r16 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1));
        if (r16 <= 0) goto L_0x00f7;
    L_0x00f6:
        return r4;
    L_0x00f7:
        r9 = r9 * 10;
        r14 = r14 + -48;
        r9 = r9 + r14;
        r10 = r0.a;
        r10 = r10 + r8;
        r0.a = r10;
        r10 = 0;
        goto L_0x00e1;
    L_0x0104:
        r1 = r0.a;
        if (r1 != r6) goto L_0x0109;
    L_0x0108:
        return r4;
    L_0x0109:
        if (r7 == 0) goto L_0x010d;
    L_0x010b:
        r13 = r13 - r9;
        goto L_0x010e;
    L_0x010d:
        r13 = r13 + r9;
    L_0x010e:
        r12 = r12 + r13;
        r1 = 39;
        if (r12 > r1) goto L_0x0146;
    L_0x0113:
        r1 = -44;
        if (r12 >= r1) goto L_0x0118;
    L_0x0117:
        goto L_0x0146;
    L_0x0118:
        r10 = r17;
        r1 = (float) r10;
        r3 = 0;
        r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x0142;
    L_0x0121:
        if (r13 <= 0) goto L_0x0129;
    L_0x0123:
        r3 = c;
        r3 = r3[r13];
    L_0x0127:
        r1 = r1 * r3;
        goto L_0x0142;
    L_0x0129:
        if (r13 >= 0) goto L_0x0142;
    L_0x012b:
        r3 = -38;
        if (r13 >= r3) goto L_0x013c;
    L_0x012f:
        r3 = (double) r1;
        r5 = 4307583784117748259; // 0x3bc79ca10c924223 float:2.2534666E-31 double:1.0E-20;
        java.lang.Double.isNaN(r3);
        r3 = r3 * r5;
        r1 = (float) r3;
        r13 = r13 + 20;
    L_0x013c:
        r3 = d;
        r4 = -r13;
        r3 = r3[r4];
        goto L_0x0127;
    L_0x0142:
        if (r2 == 0) goto L_0x0145;
    L_0x0144:
        r1 = -r1;
    L_0x0145:
        return r1;
    L_0x0146:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apv.a(java.lang.String, int, int):float");
    }
}
