package defpackage;

import java.util.Date;

/* renamed from: akie */
public final class akie {
    public final akht a;
    public final akhv b;

    /* renamed from: akie$a */
    public static class a {
        final long a;
        final akht b;
        final akhv c;
        Date d;
        String e;
        Date f;
        String g;
        Date h;
        long i;
        long j;
        String k;
        int l = -1;

        public a(long j, akht akht, akhv akhv) {
            this.a = j;
            this.b = akht;
            this.c = akhv;
            if (akhv != null) {
                this.i = akhv.k;
                this.j = akhv.l;
                akhl akhl = akhv.f;
                int length = akhl.a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = akhl.a(i);
                    String b = akhl.b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.d = akir.a(b);
                        this.e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.h = akir.a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f = akir.a(b);
                        this.g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.l = akis.b(b, -1);
                    }
                }
            }
        }
    }

    akie(akht akht, akhv akhv) {
        this.a = akht;
        this.b = akhv;
    }

    /* JADX WARNING: Missing block: B:28:0x004e, code skipped:
            if (r3.f().e == false) goto L_0x0050;
     */
    /* JADX WARNING: Missing block: B:29:0x0050, code skipped:
            return false;
     */
    public static boolean a(defpackage.akhv r3, defpackage.akht r4) {
        /*
        r0 = r3.c;
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r2 = 0;
        if (r0 == r1) goto L_0x0051;
    L_0x0007:
        r1 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x000b:
        r1 = 414; // 0x19e float:5.8E-43 double:2.045E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x000f:
        r1 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x0013:
        r1 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x0017:
        r1 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x001b:
        r1 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        if (r0 == r1) goto L_0x002f;
    L_0x001f:
        r1 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x0023:
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x0027:
        r1 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        if (r0 == r1) goto L_0x0051;
    L_0x002b:
        switch(r0) {
            case 300: goto L_0x0051;
            case 301: goto L_0x0051;
            case 302: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0050;
    L_0x002f:
        r0 = "Expires";
        r0 = r3.b(r0);
        if (r0 != 0) goto L_0x0051;
    L_0x0037:
        r0 = r3.f();
        r0 = r0.c;
        r1 = -1;
        if (r0 != r1) goto L_0x0051;
    L_0x0040:
        r0 = r3.f();
        r0 = r0.f;
        if (r0 != 0) goto L_0x0051;
    L_0x0048:
        r0 = r3.f();
        r0 = r0.e;
        if (r0 != 0) goto L_0x0051;
    L_0x0050:
        return r2;
    L_0x0051:
        r3 = r3.f();
        r3 = r3.b;
        if (r3 != 0) goto L_0x0063;
    L_0x0059:
        r3 = r4.e();
        r3 = r3.b;
        if (r3 != 0) goto L_0x0063;
    L_0x0061:
        r3 = 1;
        return r3;
    L_0x0063:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akie.a(akhv, akht):boolean");
    }
}
