package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.bi.a;

/* renamed from: bf */
public class bf implements a {
    bk a = null;
    public float b = MapboxConstants.MINIMUM_ZOOM;
    boolean c = false;
    public final be d;
    public boolean e = false;

    public bf(bg bgVar) {
        this.d = new be(this, bgVar);
    }

    public final bf a(bi biVar, int i) {
        this.d.a(biVar.a(i), 1.0f);
        this.d.a(biVar.a(i), -1.0f);
        return this;
    }

    public final bf a(bk bkVar, bk bkVar2, bk bkVar3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.b = (float) i;
        }
        if (obj == null) {
            this.d.a(bkVar, -1.0f);
            this.d.a(bkVar2, 1.0f);
            this.d.a(bkVar3, 1.0f);
        } else {
            this.d.a(bkVar, 1.0f);
            this.d.a(bkVar2, -1.0f);
            this.d.a(bkVar3, -1.0f);
        }
        return this;
    }

    public final bf a(bk bkVar, bk bkVar2, bk bkVar3, bk bkVar4, float f) {
        this.d.a(bkVar, -1.0f);
        this.d.a(bkVar2, 1.0f);
        this.d.a(bkVar3, f);
        this.d.a(bkVar4, -f);
        return this;
    }

    public final bk a(boolean[] zArr) {
        return this.d.a(zArr, null);
    }

    public final void a() {
        this.d.a();
        this.a = null;
        this.b = MapboxConstants.MINIMUM_ZOOM;
    }

    public final void a(a aVar) {
        if (aVar instanceof bf) {
            bf bfVar = (bf) aVar;
            this.a = null;
            this.d.a();
            for (int i = 0; i < bfVar.d.a; i++) {
                this.d.a(bfVar.d.a(i), bfVar.d.b(i), true);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(bk bkVar) {
        be beVar = this.d;
        if (beVar.g != -1) {
            int i = beVar.g;
            int i2 = 0;
            while (i != -1 && i2 < beVar.a) {
                if (beVar.d[i] == bkVar.a) {
                    return true;
                }
                i = beVar.e[i];
                i2++;
            }
        }
        return false;
    }

    public final bf b(bk bkVar, bk bkVar2, bk bkVar3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.b = (float) i;
        }
        if (obj == null) {
            this.d.a(bkVar, -1.0f);
            this.d.a(bkVar2, 1.0f);
            this.d.a(bkVar3, -1.0f);
        } else {
            this.d.a(bkVar, 1.0f);
            this.d.a(bkVar2, -1.0f);
            this.d.a(bkVar3, 1.0f);
        }
        return this;
    }

    public final bf b(bk bkVar, bk bkVar2, bk bkVar3, bk bkVar4, float f) {
        this.d.a(bkVar3, 0.5f);
        this.d.a(bkVar4, 0.5f);
        this.d.a(bkVar, -0.5f);
        this.d.a(bkVar2, -0.5f);
        this.b = -f;
        return this;
    }

    public final bk b() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final void b(bk bkVar) {
        bk bkVar2 = this.a;
        if (bkVar2 != null) {
            this.d.a(bkVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.a(bkVar, true);
        this.a = bkVar;
        if (f != 1.0f) {
            this.b /= f;
            be beVar = this.d;
            int i = beVar.g;
            int i2 = 0;
            while (i != -1 && i2 < beVar.a) {
                float[] fArr = beVar.f;
                fArr[i] = fArr[i] / f;
                i = beVar.e[i];
                i2++;
            }
        }
    }

    public void c(bk bkVar) {
        float f = 1.0f;
        if (bkVar.c != 1) {
            if (bkVar.c == 2) {
                f = 1000.0f;
            } else if (bkVar.c == 3) {
                f = 1000000.0f;
            } else if (bkVar.c == 4) {
                f = 1.0E9f;
            } else if (bkVar.c == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(bkVar, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    public java.lang.String toString() {
        /*
        r9 = this;
        r0 = r9.a;
        r1 = "";
        if (r0 != 0) goto L_0x0014;
    L_0x0006:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = "0";
        r0.append(r1);
        goto L_0x0021;
    L_0x0014:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = r9.a;
        r0.append(r1);
    L_0x0021:
        r0 = r0.toString();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = " = ";
        r1.append(r0);
        r0 = r1.toString();
        r1 = r9.b;
        r2 = 0;
        r3 = 1;
        r4 = 0;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x0052;
    L_0x003f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = r9.b;
        r1.append(r0);
        r0 = r1.toString();
        r1 = 1;
        goto L_0x0053;
    L_0x0052:
        r1 = 0;
    L_0x0053:
        r5 = r9.d;
        r5 = r5.a;
    L_0x0057:
        if (r2 >= r5) goto L_0x00cf;
    L_0x0059:
        r6 = r9.d;
        r6 = r6.a(r2);
        if (r6 == 0) goto L_0x00cc;
    L_0x0061:
        r7 = r9.d;
        r7 = r7.b(r2);
        r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r8 == 0) goto L_0x00cc;
    L_0x006b:
        r6 = r6.toString();
        if (r1 != 0) goto L_0x0080;
    L_0x0071:
        r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x00a8;
    L_0x0075:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = "- ";
        goto L_0x00a0;
    L_0x0080:
        r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0096;
    L_0x0084:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = " + ";
        r1.append(r0);
        r0 = r1.toString();
        goto L_0x00a8;
    L_0x0096:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = " - ";
    L_0x00a0:
        r1.append(r0);
        r0 = r1.toString();
        r7 = -r7;
    L_0x00a8:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r1 != 0) goto L_0x00b4;
    L_0x00ae:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        goto L_0x00c1;
    L_0x00b4:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r1.append(r7);
        r0 = " ";
    L_0x00c1:
        r1.append(r0);
        r1.append(r6);
        r0 = r1.toString();
        r1 = 1;
    L_0x00cc:
        r2 = r2 + 1;
        goto L_0x0057;
    L_0x00cf:
        if (r1 != 0) goto L_0x00e2;
    L_0x00d1:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = "0.0";
        r1.append(r0);
        r0 = r1.toString();
    L_0x00e2:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf.toString():java.lang.String");
    }
}
