package defpackage;

import java.util.ArrayList;

/* renamed from: bl */
public final class bl extends br {
    private ArrayList<bu> X = new ArrayList(4);
    public int a = 0;
    public boolean b = true;

    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    public final void a(int r8) {
        /*
        r7 = this;
        r8 = r7.A;
        if (r8 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r8 = r7.A;
        r8 = (defpackage.bp) r8;
        r0 = 2;
        r8 = r8.j(r0);
        if (r8 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r8 = r7.a;
        r1 = 3;
        r2 = 1;
        if (r8 == 0) goto L_0x0027;
    L_0x0017:
        if (r8 == r2) goto L_0x0024;
    L_0x0019:
        if (r8 == r0) goto L_0x0021;
    L_0x001b:
        if (r8 == r1) goto L_0x001e;
    L_0x001d:
        return;
    L_0x001e:
        r8 = r7.v;
        goto L_0x0029;
    L_0x0021:
        r8 = r7.t;
        goto L_0x0029;
    L_0x0024:
        r8 = r7.u;
        goto L_0x0029;
    L_0x0027:
        r8 = r7.s;
    L_0x0029:
        r8 = r8.a;
        r3 = 5;
        r8.e = r3;
        r3 = r7.a;
        r4 = 0;
        r5 = 0;
        if (r3 == 0) goto L_0x0041;
    L_0x0034:
        if (r3 != r2) goto L_0x0037;
    L_0x0036:
        goto L_0x0041;
    L_0x0037:
        r3 = r7.s;
        r3 = r3.a;
        r3.a(r5, r4);
        r3 = r7.u;
        goto L_0x004a;
    L_0x0041:
        r3 = r7.t;
        r3 = r3.a;
        r3.a(r5, r4);
        r3 = r7.v;
    L_0x004a:
        r3 = r3.a;
        r3.a(r5, r4);
        r3 = r7.X;
        r3.clear();
        r3 = 0;
    L_0x0055:
        r4 = r7.W;
        if (r3 >= r4) goto L_0x008d;
    L_0x0059:
        r4 = r7.V;
        r4 = r4[r3];
        r6 = r7.b;
        if (r6 != 0) goto L_0x0067;
    L_0x0061:
        r6 = r4.a();
        if (r6 == 0) goto L_0x008a;
    L_0x0067:
        r6 = r7.a;
        if (r6 == 0) goto L_0x007c;
    L_0x006b:
        if (r6 == r2) goto L_0x0079;
    L_0x006d:
        if (r6 == r0) goto L_0x0076;
    L_0x006f:
        if (r6 == r1) goto L_0x0073;
    L_0x0071:
        r4 = r5;
        goto L_0x0080;
    L_0x0073:
        r4 = r4.v;
        goto L_0x007e;
    L_0x0076:
        r4 = r4.t;
        goto L_0x007e;
    L_0x0079:
        r4 = r4.u;
        goto L_0x007e;
    L_0x007c:
        r4 = r4.s;
    L_0x007e:
        r4 = r4.a;
    L_0x0080:
        if (r4 == 0) goto L_0x008a;
    L_0x0082:
        r6 = r7.X;
        r6.add(r4);
        r4.a(r8);
    L_0x008a:
        r3 = r3 + 1;
        goto L_0x0055;
    L_0x008d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(int):void");
    }

    /* JADX WARNING: Missing block: B:47:0x00c6, code skipped:
            if (r1 != null) goto L_0x00da;
     */
    /* JADX WARNING: Missing block: B:49:0x00d8, code skipped:
            if (r1 != null) goto L_0x00da;
     */
    public final void a(defpackage.bi r13) {
        /*
        r12 = this;
        r0 = r12.x;
        r1 = r12.s;
        r2 = 0;
        r0[r2] = r1;
        r0 = r12.x;
        r1 = r12.t;
        r3 = 2;
        r0[r3] = r1;
        r0 = r12.x;
        r1 = r12.u;
        r4 = 1;
        r0[r4] = r1;
        r0 = r12.x;
        r1 = r12.v;
        r5 = 3;
        r0[r5] = r1;
        r0 = 0;
    L_0x001d:
        r1 = r12.x;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0033;
    L_0x0022:
        r1 = r12.x;
        r1 = r1[r0];
        r6 = r12.x;
        r6 = r6[r0];
        r6 = r13.a(r6);
        r1.h = r6;
        r0 = r0 + 1;
        goto L_0x001d;
    L_0x0033:
        r0 = r12.a;
        if (r0 < 0) goto L_0x0158;
    L_0x0037:
        r1 = 4;
        if (r0 >= r1) goto L_0x0158;
    L_0x003a:
        r0 = r12.x;
        r1 = r12.a;
        r0 = r0[r1];
        r1 = 0;
    L_0x0041:
        r6 = r12.W;
        if (r1 >= r6) goto L_0x0071;
    L_0x0045:
        r6 = r12.V;
        r6 = r6[r1];
        r7 = r12.b;
        if (r7 != 0) goto L_0x0053;
    L_0x004d:
        r7 = r6.a();
        if (r7 == 0) goto L_0x006e;
    L_0x0053:
        r7 = r12.a;
        if (r7 == 0) goto L_0x0059;
    L_0x0057:
        if (r7 != r4) goto L_0x0061;
    L_0x0059:
        r7 = r6.y();
        if (r7 != r5) goto L_0x0061;
    L_0x005f:
        r1 = 1;
        goto L_0x0072;
    L_0x0061:
        r7 = r12.a;
        if (r7 == r3) goto L_0x0067;
    L_0x0065:
        if (r7 != r5) goto L_0x006e;
    L_0x0067:
        r6 = r6.z();
        if (r6 != r5) goto L_0x006e;
    L_0x006d:
        goto L_0x005f;
    L_0x006e:
        r1 = r1 + 1;
        goto L_0x0041;
    L_0x0071:
        r1 = 0;
    L_0x0072:
        r6 = r12.a;
        if (r6 == 0) goto L_0x0082;
    L_0x0076:
        if (r6 != r4) goto L_0x0079;
    L_0x0078:
        goto L_0x0082;
    L_0x0079:
        r6 = r12.A;
        r6 = r6.z();
        if (r6 != r3) goto L_0x008b;
    L_0x0081:
        goto L_0x008a;
    L_0x0082:
        r6 = r12.A;
        r6 = r6.y();
        if (r6 != r3) goto L_0x008b;
    L_0x008a:
        r1 = 0;
    L_0x008b:
        r6 = 0;
    L_0x008c:
        r7 = r12.W;
        if (r6 >= r7) goto L_0x00eb;
    L_0x0090:
        r7 = r12.V;
        r7 = r7[r6];
        r8 = r12.b;
        if (r8 != 0) goto L_0x009e;
    L_0x0098:
        r8 = r7.a();
        if (r8 == 0) goto L_0x00e8;
    L_0x009e:
        r8 = r7.x;
        r9 = r12.a;
        r8 = r8[r9];
        r8 = r13.a(r8);
        r7 = r7.x;
        r9 = r12.a;
        r7 = r7[r9];
        r7.h = r8;
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r9 == 0) goto L_0x00c9;
    L_0x00b4:
        if (r9 != r3) goto L_0x00b7;
    L_0x00b6:
        goto L_0x00c9;
    L_0x00b7:
        r9 = r0.h;
        r10 = r13.b();
        r11 = r13.c();
        r11.c = r2;
        r10.a(r9, r8, r11, r2);
        if (r1 == 0) goto L_0x00e5;
    L_0x00c8:
        goto L_0x00da;
    L_0x00c9:
        r9 = r0.h;
        r10 = r13.b();
        r11 = r13.c();
        r11.c = r2;
        r10.b(r9, r8, r11, r2);
        if (r1 == 0) goto L_0x00e5;
    L_0x00da:
        r8 = r10.d;
        r8 = r8.b(r11);
        r8 = r8 * r7;
        r7 = (int) r8;
        r13.a(r10, r7, r4);
    L_0x00e5:
        r13.a(r10);
    L_0x00e8:
        r6 = r6 + 1;
        goto L_0x008c;
    L_0x00eb:
        r0 = r12.a;
        r6 = 5;
        r7 = 6;
        if (r0 != 0) goto L_0x010c;
    L_0x00f1:
        r0 = r12.u;
        r0 = r0.h;
        r3 = r12.s;
        r3 = r3.h;
        r13.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0158;
    L_0x00fe:
        r0 = r12.s;
        r0 = r0.h;
        r1 = r12.A;
        r1 = r1.u;
    L_0x0106:
        r1 = r1.h;
        r13.c(r0, r1, r2, r6);
        return;
    L_0x010c:
        if (r0 != r4) goto L_0x0124;
    L_0x010e:
        r0 = r12.s;
        r0 = r0.h;
        r3 = r12.u;
        r3 = r3.h;
        r13.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0158;
    L_0x011b:
        r0 = r12.s;
        r0 = r0.h;
        r1 = r12.A;
        r1 = r1.s;
        goto L_0x0106;
    L_0x0124:
        if (r0 != r3) goto L_0x013c;
    L_0x0126:
        r0 = r12.v;
        r0 = r0.h;
        r3 = r12.t;
        r3 = r3.h;
        r13.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0158;
    L_0x0133:
        r0 = r12.t;
        r0 = r0.h;
        r1 = r12.A;
        r1 = r1.v;
        goto L_0x0106;
    L_0x013c:
        if (r0 != r5) goto L_0x0158;
    L_0x013e:
        r0 = r12.t;
        r0 = r0.h;
        r3 = r12.v;
        r3 = r3.h;
        r13.c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x0158;
    L_0x014b:
        r0 = r12.t;
        r0 = r0.h;
        r1 = r12.A;
        r1 = r1.t;
        r1 = r1.h;
        r13.c(r0, r1, r2, r6);
    L_0x0158:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(bi):void");
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        super.b();
        this.X.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    public final void c() {
        /*
        r10 = this;
        r0 = r10.a;
        r1 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        r5 = 0;
        if (r0 == 0) goto L_0x001e;
    L_0x000b:
        if (r0 == r4) goto L_0x0018;
    L_0x000d:
        if (r0 == r3) goto L_0x0015;
    L_0x000f:
        if (r0 == r2) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r0 = r10.v;
        goto L_0x001a;
    L_0x0015:
        r0 = r10.t;
        goto L_0x0020;
    L_0x0018:
        r0 = r10.u;
    L_0x001a:
        r0 = r0.a;
        r1 = 0;
        goto L_0x0022;
    L_0x001e:
        r0 = r10.s;
    L_0x0020:
        r0 = r0.a;
    L_0x0022:
        r5 = r10.X;
        r5 = r5.size();
        r6 = 0;
        r7 = 0;
    L_0x002a:
        if (r7 >= r5) goto L_0x0054;
    L_0x002c:
        r8 = r10.X;
        r8 = r8.get(r7);
        r8 = (defpackage.bu) r8;
        r9 = r8.f;
        if (r9 == r4) goto L_0x0039;
    L_0x0038:
        return;
    L_0x0039:
        r9 = r10.a;
        if (r9 == 0) goto L_0x0047;
    L_0x003d:
        if (r9 != r3) goto L_0x0040;
    L_0x003f:
        goto L_0x0047;
    L_0x0040:
        r9 = r8.d;
        r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1));
        if (r9 <= 0) goto L_0x0051;
    L_0x0046:
        goto L_0x004d;
    L_0x0047:
        r9 = r8.d;
        r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1));
        if (r9 >= 0) goto L_0x0051;
    L_0x004d:
        r1 = r8.d;
        r6 = r8.c;
    L_0x0051:
        r7 = r7 + 1;
        goto L_0x002a;
    L_0x0054:
        r0.c = r6;
        r0.d = r1;
        r0.d();
        r0 = r10.a;
        if (r0 == 0) goto L_0x0074;
    L_0x005f:
        if (r0 == r4) goto L_0x0071;
    L_0x0061:
        if (r0 == r3) goto L_0x006e;
    L_0x0063:
        if (r0 == r2) goto L_0x0066;
    L_0x0065:
        return;
    L_0x0066:
        r0 = r10.t;
    L_0x0068:
        r0 = r0.a;
        r0.a(r6, r1);
        return;
    L_0x006e:
        r0 = r10.v;
        goto L_0x0068;
    L_0x0071:
        r0 = r10.s;
        goto L_0x0068;
    L_0x0074:
        r0 = r10.u;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.c():void");
    }
}
