package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: akgw */
public final class akgw {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    private String m;

    /* renamed from: akgw$a */
    public static final class a {
        boolean a;
        int b = -1;
        int c = -1;
        int d = -1;
        boolean e;

        public final akgw a() {
            return new akgw(this);
        }
    }

    static {
        a aVar = new a();
        aVar.a = true;
        aVar.a();
        aVar = new a();
        aVar.e = true;
        long toSeconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar.c = toSeconds > 2147483647L ? Integer.MAX_VALUE : (int) toSeconds;
        aVar.a();
    }

    akgw(a aVar) {
        this.a = aVar.a;
        this.b = false;
        this.c = aVar.b;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = aVar.c;
        this.i = aVar.d;
        this.j = aVar.e;
        this.k = false;
        this.l = false;
    }

    private akgw(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    public static defpackage.akgw a(defpackage.akhl r22) {
        /*
        r0 = r22;
        r1 = r0.a;
        r1 = r1.length;
        r1 = r1 / 2;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = -1;
        r12 = -1;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = -1;
        r17 = -1;
        r18 = 0;
        r19 = 0;
        r20 = 0;
    L_0x001b:
        if (r6 >= r1) goto L_0x0137;
    L_0x001d:
        r2 = r0.a(r6);
        r4 = r0.b(r6);
        r3 = "Cache-Control";
        r3 = r2.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x0032;
    L_0x002d:
        if (r8 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x003a;
    L_0x0030:
        r8 = r4;
        goto L_0x003b;
    L_0x0032:
        r3 = "Pragma";
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 == 0) goto L_0x0130;
    L_0x003a:
        r7 = 0;
    L_0x003b:
        r2 = 0;
    L_0x003c:
        r3 = r4.length();
        if (r2 >= r3) goto L_0x0130;
    L_0x0042:
        r3 = "=,;";
        r3 = defpackage.akis.a(r4, r2, r3);
        r2 = r4.substring(r2, r3);
        r2 = r2.trim();
        r5 = r4.length();
        if (r3 == r5) goto L_0x009a;
    L_0x0056:
        r5 = r4.charAt(r3);
        r0 = 44;
        if (r5 == r0) goto L_0x009a;
    L_0x005e:
        r0 = r4.charAt(r3);
        r5 = 59;
        if (r0 != r5) goto L_0x0067;
    L_0x0066:
        goto L_0x009a;
    L_0x0067:
        r3 = r3 + 1;
        r0 = defpackage.akis.a(r4, r3);
        r3 = r4.length();
        if (r0 >= r3) goto L_0x008a;
    L_0x0073:
        r3 = r4.charAt(r0);
        r5 = 34;
        if (r3 != r5) goto L_0x008a;
    L_0x007b:
        r0 = r0 + 1;
        r3 = "\"";
        r3 = defpackage.akis.a(r4, r0, r3);
        r0 = r4.substring(r0, r3);
        r5 = 1;
        r3 = r3 + r5;
        goto L_0x009e;
    L_0x008a:
        r5 = 1;
        r3 = ",;";
        r3 = defpackage.akis.a(r4, r0, r3);
        r0 = r4.substring(r0, r3);
        r0 = r0.trim();
        goto L_0x009e;
    L_0x009a:
        r5 = 1;
        r3 = r3 + 1;
        r0 = 0;
    L_0x009e:
        r5 = "no-cache";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00ab;
    L_0x00a6:
        r9 = 1;
    L_0x00a7:
        r0 = r22;
        r2 = r3;
        goto L_0x003c;
    L_0x00ab:
        r5 = "no-store";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00b5;
    L_0x00b3:
        r10 = 1;
        goto L_0x00a7;
    L_0x00b5:
        r5 = "max-age";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00c3;
    L_0x00bd:
        r5 = -1;
        r11 = defpackage.akis.b(r0, r5);
        goto L_0x00a7;
    L_0x00c3:
        r5 = "s-maxage";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00d1;
    L_0x00cb:
        r5 = -1;
        r12 = defpackage.akis.b(r0, r5);
        goto L_0x00a7;
    L_0x00d1:
        r5 = "private";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00db;
    L_0x00d9:
        r13 = 1;
        goto L_0x00a7;
    L_0x00db:
        r5 = "public";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00e5;
    L_0x00e3:
        r14 = 1;
        goto L_0x00a7;
    L_0x00e5:
        r5 = "must-revalidate";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00ef;
    L_0x00ed:
        r15 = 1;
        goto L_0x00a7;
    L_0x00ef:
        r5 = "max-stale";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00ff;
    L_0x00f7:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r16 = defpackage.akis.b(r0, r2);
        goto L_0x00a7;
    L_0x00ff:
        r5 = "min-fresh";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x010d;
    L_0x0107:
        r5 = -1;
        r17 = defpackage.akis.b(r0, r5);
        goto L_0x00a7;
    L_0x010d:
        r5 = -1;
        r0 = "only-if-cached";
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0119;
    L_0x0116:
        r18 = 1;
        goto L_0x00a7;
    L_0x0119:
        r0 = "no-transform";
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0124;
    L_0x0121:
        r19 = 1;
        goto L_0x00a7;
    L_0x0124:
        r0 = "immutable";
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x00a7;
    L_0x012c:
        r20 = 1;
        goto L_0x00a7;
    L_0x0130:
        r5 = -1;
        r6 = r6 + 1;
        r0 = r22;
        goto L_0x001b;
    L_0x0137:
        if (r7 != 0) goto L_0x013c;
    L_0x0139:
        r21 = 0;
        goto L_0x013e;
    L_0x013c:
        r21 = r8;
    L_0x013e:
        r0 = new akgw;
        r8 = r0;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgw.a(akhl):akgw");
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a) {
            stringBuilder.append("no-cache, ");
        }
        if (this.b) {
            stringBuilder.append("no-store, ");
        }
        int i = this.c;
        String str2 = ppy.d;
        if (i != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.c);
            stringBuilder.append(str2);
        }
        if (this.d != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.d);
            stringBuilder.append(str2);
        }
        if (this.e) {
            stringBuilder.append("private, ");
        }
        if (this.f) {
            stringBuilder.append("public, ");
        }
        if (this.g) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.h != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.h);
            stringBuilder.append(str2);
        }
        if (this.i != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.i);
            stringBuilder.append(str2);
        }
        if (this.j) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.k) {
            stringBuilder.append("no-transform, ");
        }
        if (this.l) {
            stringBuilder.append("immutable, ");
        }
        if (stringBuilder.length() == 0) {
            str = "";
        } else {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            str = stringBuilder.toString();
        }
        this.m = str;
        return str;
    }
}
