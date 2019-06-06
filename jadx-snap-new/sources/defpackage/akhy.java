package defpackage;

/* renamed from: akhy */
public enum akhy {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    private akhy(String str) {
        this.javaName = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    public static defpackage.akhy a(java.lang.String r6) {
        /*
        r0 = r6.hashCode();
        r1 = 79201641; // 0x4b88569 float:4.338071E-36 double:3.913081E-316;
        r2 = 4;
        r3 = 3;
        r4 = 2;
        r5 = 1;
        if (r0 == r1) goto L_0x003e;
    L_0x000d:
        r1 = 79923350; // 0x4c38896 float:4.5969714E-36 double:3.94873815E-316;
        if (r0 == r1) goto L_0x0034;
    L_0x0012:
        switch(r0) {
            case -503070503: goto L_0x002a;
            case -503070502: goto L_0x0020;
            case -503070501: goto L_0x0016;
            default: goto L_0x0015;
        };
    L_0x0015:
        goto L_0x0048;
    L_0x0016:
        r0 = "TLSv1.3";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0048;
    L_0x001e:
        r0 = 0;
        goto L_0x0049;
    L_0x0020:
        r0 = "TLSv1.2";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0048;
    L_0x0028:
        r0 = 1;
        goto L_0x0049;
    L_0x002a:
        r0 = "TLSv1.1";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0048;
    L_0x0032:
        r0 = 2;
        goto L_0x0049;
    L_0x0034:
        r0 = "TLSv1";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0048;
    L_0x003c:
        r0 = 3;
        goto L_0x0049;
    L_0x003e:
        r0 = "SSLv3";
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0048;
    L_0x0046:
        r0 = 4;
        goto L_0x0049;
    L_0x0048:
        r0 = -1;
    L_0x0049:
        if (r0 == 0) goto L_0x006f;
    L_0x004b:
        if (r0 == r5) goto L_0x006c;
    L_0x004d:
        if (r0 == r4) goto L_0x0069;
    L_0x004f:
        if (r0 == r3) goto L_0x0066;
    L_0x0051:
        if (r0 != r2) goto L_0x0056;
    L_0x0053:
        r6 = SSL_3_0;
        return r6;
    L_0x0056:
        r0 = new java.lang.IllegalArgumentException;
        r6 = java.lang.String.valueOf(r6);
        r1 = "Unexpected TLS version: ";
        r6 = r1.concat(r6);
        r0.<init>(r6);
        throw r0;
    L_0x0066:
        r6 = TLS_1_0;
        return r6;
    L_0x0069:
        r6 = TLS_1_1;
        return r6;
    L_0x006c:
        r6 = TLS_1_2;
        return r6;
    L_0x006f:
        r6 = TLS_1_3;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhy.a(java.lang.String):akhy");
    }
}
