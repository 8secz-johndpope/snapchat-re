package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: bi */
public final class bi {
    private static int f = 1000;
    public a a;
    public bf[] b;
    public boolean c;
    public int d;
    public final bg e;
    private int g = 0;
    private HashMap<String, bk> h = null;
    private int i = 32;
    private int j;
    private boolean[] k;
    private int l;
    private int m;
    private bk[] n;
    private int o;
    private bf[] p;
    private final a q;

    /* renamed from: bi$a */
    interface a {
        bk a(boolean[] zArr);

        void a();

        void a(a aVar);

        bk b();

        void c(bk bkVar);
    }

    public bi() {
        int i = this.i;
        this.j = i;
        this.b = null;
        this.c = false;
        this.k = new boolean[i];
        this.l = 1;
        this.d = 0;
        this.m = i;
        this.n = new bk[f];
        this.o = 0;
        this.p = new bf[i];
        this.b = new bf[i];
        f();
        this.e = new bg();
        this.a = new bh(this.e);
        this.q = new bf(this.e);
    }

    private final int b(a aVar) {
        for (int i = 0; i < this.l; i++) {
            this.k[i] = false;
        }
        Object obj = null;
        int i2 = 0;
        while (obj == null) {
            i2++;
            if (i2 >= this.l * 2) {
                return i2;
            }
            if (aVar.b() != null) {
                this.k[aVar.b().a] = true;
            }
            bk a = aVar.a(this.k);
            if (a != null) {
                if (this.k[a.a]) {
                    return i2;
                }
                this.k[a.a] = true;
            }
            if (a != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.d; i4++) {
                    bf bfVar = this.b[i4];
                    if (!(bfVar.a.f == 1 || bfVar.e || !bfVar.a(a))) {
                        float b = bfVar.d.b(a);
                        if (b < MapboxConstants.MINIMUM_ZOOM) {
                            float f2 = (-bfVar.b) / b;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    bf bfVar2 = this.b[i3];
                    bfVar2.a.b = -1;
                    bfVar2.b(a);
                    bfVar2.a.b = i3;
                    bfVar2.a.c(bfVar2);
                }
            }
            obj = 1;
        }
        return i2;
    }

    public static int b(Object obj) {
        bk bkVar = ((bn) obj).h;
        return bkVar != null ? (int) (bkVar.d + 0.5f) : 0;
    }

    private bk b(int i) {
        bk bkVar = (bk) this.e.b.a();
        if (bkVar == null) {
            bkVar = new bk(i);
        } else {
            bkVar.a();
        }
        bkVar.f = i;
        i = this.o;
        int i2 = f;
        if (i >= i2) {
            f = i2 << 1;
            this.n = (bk[]) Arrays.copyOf(this.n, f);
        }
        bk[] bkVarArr = this.n;
        i2 = this.o;
        this.o = i2 + 1;
        bkVarArr[i2] = bkVar;
        return bkVar;
    }

    private final void b(bf bfVar) {
        if (this.d > 0) {
            bfVar.d.a(bfVar, this.b);
            if (bfVar.d.a == 0) {
                bfVar.e = true;
            }
        }
    }

    private final void c(bf bfVar) {
        if (this.b[this.d] != null) {
            this.e.a.a(this.b[this.d]);
        }
        this.b[this.d] = bfVar;
        bk bkVar = bfVar.a;
        int i = this.d;
        bkVar.b = i;
        this.d = i + 1;
        bfVar.a.c(bfVar);
    }

    private void e() {
        this.i <<= 1;
        this.b = (bf[]) Arrays.copyOf(this.b, this.i);
        bg bgVar = this.e;
        bgVar.c = (bk[]) Arrays.copyOf(bgVar.c, this.i);
        int i = this.i;
        this.k = new boolean[i];
        this.j = i;
        this.m = i;
    }

    private void f() {
        int i = 0;
        while (true) {
            bf[] bfVarArr = this.b;
            if (i < bfVarArr.length) {
                Object obj = bfVarArr[i];
                if (obj != null) {
                    this.e.a.a(obj);
                }
                this.b[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    public final bk a(int i) {
        if (this.l + 1 >= this.j) {
            e();
        }
        bk b = b(4);
        this.g++;
        this.l++;
        b.a = this.g;
        b.c = i;
        this.e.c[this.g] = b;
        this.a.c(b);
        return b;
    }

    public final bk a(Object obj) {
        bk bkVar = null;
        if (obj == null) {
            return null;
        }
        if (this.l + 1 >= this.j) {
            e();
        }
        if (obj instanceof bn) {
            bn bnVar = (bn) obj;
            bkVar = bnVar.h;
            if (bkVar == null) {
                bnVar.a();
                bkVar = bnVar.h;
            }
            if (bkVar.a == -1 || bkVar.a > this.g || this.e.c[bkVar.a] == null) {
                if (bkVar.a != -1) {
                    bkVar.a();
                }
                this.g++;
                this.l++;
                bkVar.a = this.g;
                bkVar.f = 1;
                this.e.c[this.g] = bkVar;
            }
        }
        return bkVar;
    }

    public final void a() {
        int i;
        for (bk bkVar : this.e.c) {
            if (bkVar != null) {
                bkVar.a();
            }
        }
        this.e.b.a(this.n, this.o);
        this.o = 0;
        Arrays.fill(this.e.c, null);
        this.g = 0;
        this.a.a();
        this.l = 1;
        for (i = 0; i < this.d; i++) {
            this.b[i].c = false;
        }
        f();
        this.d = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x00df A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x00df A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    public final void a(defpackage.bf r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        if (r1 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r2 = r0.d;
        r3 = 1;
        r2 = r2 + r3;
        r4 = r0.m;
        if (r2 >= r4) goto L_0x0016;
    L_0x000f:
        r2 = r0.l;
        r2 = r2 + r3;
        r4 = r0.j;
        if (r2 < r4) goto L_0x0019;
    L_0x0016:
        r17.e();
    L_0x0019:
        r2 = r1.e;
        if (r2 != 0) goto L_0x0171;
    L_0x001d:
        r17.b(r18);
        r2 = r1.a;
        r5 = 0;
        if (r2 != 0) goto L_0x0033;
    L_0x0025:
        r2 = r1.b;
        r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r2 != 0) goto L_0x0033;
    L_0x002b:
        r2 = r1.d;
        r2 = r2.a;
        if (r2 != 0) goto L_0x0033;
    L_0x0031:
        r2 = 1;
        goto L_0x0034;
    L_0x0033:
        r2 = 0;
    L_0x0034:
        if (r2 == 0) goto L_0x0037;
    L_0x0036:
        return;
    L_0x0037:
        r2 = r1.b;
        r6 = -1;
        r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r2 >= 0) goto L_0x005c;
    L_0x003e:
        r2 = r1.b;
        r2 = -r2;
        r1.b = r2;
        r2 = r1.d;
        r7 = r2.g;
        r8 = 0;
    L_0x0048:
        if (r7 == r6) goto L_0x005c;
    L_0x004a:
        r9 = r2.a;
        if (r8 >= r9) goto L_0x005c;
    L_0x004e:
        r9 = r2.f;
        r10 = r9[r7];
        r10 = -r10;
        r9[r7] = r10;
        r9 = r2.e;
        r7 = r9[r7];
        r8 = r8 + 1;
        goto L_0x0048;
    L_0x005c:
        r2 = r1.d;
        r7 = r2.g;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
    L_0x0067:
        if (r7 == r6) goto L_0x00e7;
    L_0x0069:
        r4 = r2.a;
        if (r9 >= r4) goto L_0x00e7;
    L_0x006d:
        r4 = r2.f;
        r4 = r4[r7];
        r8 = r2.c;
        r8 = r8.c;
        r6 = r2.d;
        r6 = r6[r7];
        r6 = r8[r6];
        r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x008b;
    L_0x007f:
        r8 = -1165815185; // 0xffffffffba83126f float:-0.001 double:NaN;
        r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r8 <= 0) goto L_0x009c;
    L_0x0086:
        r4 = r2.f;
        r4[r7] = r5;
        goto L_0x0096;
    L_0x008b:
        r8 = 981668463; // 0x3a83126f float:0.001 double:4.85008663E-315;
        r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r8 >= 0) goto L_0x009c;
    L_0x0092:
        r4 = r2.f;
        r4[r7] = r5;
    L_0x0096:
        r4 = r2.b;
        r6.b(r4);
        r4 = 0;
    L_0x009c:
        r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r8 == 0) goto L_0x00df;
    L_0x00a0:
        r8 = r6.f;
        if (r8 != r3) goto L_0x00bf;
    L_0x00a4:
        if (r11 != 0) goto L_0x00ae;
    L_0x00a6:
        r8 = defpackage.be.a(r6);
        r12 = r4;
        r11 = r6;
        r13 = r8;
        goto L_0x00df;
    L_0x00ae:
        r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r8 <= 0) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00a6;
    L_0x00b3:
        if (r13 != 0) goto L_0x00df;
    L_0x00b5:
        r8 = defpackage.be.a(r6);
        if (r8 == 0) goto L_0x00df;
    L_0x00bb:
        r12 = r4;
        r11 = r6;
        r13 = 1;
        goto L_0x00df;
    L_0x00bf:
        if (r11 != 0) goto L_0x00df;
    L_0x00c1:
        r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x00df;
    L_0x00c5:
        if (r10 != 0) goto L_0x00cf;
    L_0x00c7:
        r8 = defpackage.be.a(r6);
        r14 = r4;
        r10 = r6;
        r15 = r8;
        goto L_0x00df;
    L_0x00cf:
        r8 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r8 <= 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00c7;
    L_0x00d4:
        if (r15 != 0) goto L_0x00df;
    L_0x00d6:
        r8 = defpackage.be.a(r6);
        if (r8 == 0) goto L_0x00df;
    L_0x00dc:
        r14 = r4;
        r10 = r6;
        r15 = 1;
    L_0x00df:
        r4 = r2.e;
        r7 = r4[r7];
        r9 = r9 + 1;
        r6 = -1;
        goto L_0x0067;
    L_0x00e7:
        if (r11 == 0) goto L_0x00ea;
    L_0x00e9:
        r10 = r11;
    L_0x00ea:
        if (r10 != 0) goto L_0x00ee;
    L_0x00ec:
        r2 = 1;
        goto L_0x00f2;
    L_0x00ee:
        r1.b(r10);
        r2 = 0;
    L_0x00f2:
        r4 = r1.d;
        r4 = r4.a;
        if (r4 != 0) goto L_0x00fa;
    L_0x00f8:
        r1.e = r3;
    L_0x00fa:
        if (r2 == 0) goto L_0x0155;
    L_0x00fc:
        r2 = r0.l;
        r2 = r2 + r3;
        r4 = r0.j;
        if (r2 < r4) goto L_0x0106;
    L_0x0103:
        r17.e();
    L_0x0106:
        r2 = 3;
        r2 = r0.b(r2);
        r4 = r0.g;
        r4 = r4 + r3;
        r0.g = r4;
        r4 = r0.l;
        r4 = r4 + r3;
        r0.l = r4;
        r4 = r0.g;
        r2.a = r4;
        r4 = r0.e;
        r4 = r4.c;
        r6 = r0.g;
        r4[r6] = r2;
        r1.a = r2;
        r17.c(r18);
        r4 = r0.q;
        r4.a(r1);
        r4 = r0.q;
        r0.b(r4);
        r4 = r2.b;
        r6 = -1;
        if (r4 != r6) goto L_0x0153;
    L_0x0135:
        r4 = r1.a;
        if (r4 != r2) goto L_0x0145;
    L_0x0139:
        r4 = r1.d;
        r6 = 0;
        r2 = r4.a(r6, r2);
        if (r2 == 0) goto L_0x0145;
    L_0x0142:
        r1.b(r2);
    L_0x0145:
        r2 = r1.e;
        if (r2 != 0) goto L_0x014e;
    L_0x0149:
        r2 = r1.a;
        r2.c(r1);
    L_0x014e:
        r2 = r0.d;
        r2 = r2 - r3;
        r0.d = r2;
    L_0x0153:
        r4 = 1;
        goto L_0x0156;
    L_0x0155:
        r4 = 0;
    L_0x0156:
        r2 = r1.a;
        if (r2 == 0) goto L_0x0169;
    L_0x015a:
        r2 = r1.a;
        r2 = r2.f;
        if (r2 == r3) goto L_0x0166;
    L_0x0160:
        r2 = r1.b;
        r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r2 < 0) goto L_0x0169;
    L_0x0166:
        r16 = 1;
        goto L_0x016b;
    L_0x0169:
        r16 = 0;
    L_0x016b:
        if (r16 != 0) goto L_0x016e;
    L_0x016d:
        return;
    L_0x016e:
        r16 = r4;
        goto L_0x0173;
    L_0x0171:
        r16 = 0;
    L_0x0173:
        if (r16 != 0) goto L_0x0178;
    L_0x0175:
        r17.c(r18);
    L_0x0178:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.a(bf):void");
    }

    public final void a(bf bfVar, int i, int i2) {
        bfVar.d.a(a(i2), (float) i);
    }

    public final void a(a aVar) {
        Object obj;
        b((bf) aVar);
        int i = 0;
        while (i < this.d) {
            if (this.b[i].a.f != 1 && this.b[i].b < MapboxConstants.MINIMUM_ZOOM) {
                obj = 1;
                break;
            }
            i++;
        }
        obj = null;
        if (obj != null) {
            obj = null;
            while (obj == null) {
                int i2 = -1;
                int i3 = -1;
                float f = Float.MAX_VALUE;
                int i4 = 0;
                for (int i5 = 0; i5 < this.d; i5++) {
                    bf bfVar = this.b[i5];
                    if (!(bfVar.a.f == 1 || bfVar.e || bfVar.b >= MapboxConstants.MINIMUM_ZOOM)) {
                        int i6 = i4;
                        float f2 = f;
                        int i7 = i3;
                        i3 = i2;
                        for (i2 = 1; i2 < this.l; i2++) {
                            bk bkVar = this.e.c[i2];
                            float b = bfVar.d.b(bkVar);
                            if (b > MapboxConstants.MINIMUM_ZOOM) {
                                int i8 = i6;
                                float f3 = f2;
                                i4 = i7;
                                i7 = i3;
                                i3 = 0;
                                while (i3 < 7) {
                                    float f4 = bkVar.e[i3] / b;
                                    if ((f4 < f3 && i3 == i8) || i3 > i8) {
                                        f3 = f4;
                                        i7 = i5;
                                        i4 = i2;
                                        i8 = i3;
                                    }
                                    i3++;
                                }
                                i3 = i7;
                                i7 = i4;
                                f2 = f3;
                                i6 = i8;
                            }
                        }
                        i2 = i3;
                        i3 = i7;
                        f = f2;
                        i4 = i6;
                    }
                }
                if (i2 != -1) {
                    bf bfVar2 = this.b[i2];
                    bfVar2.a.b = -1;
                    bfVar2.b(this.e.c[i3]);
                    bfVar2.a.b = i2;
                    bfVar2.a.c(bfVar2);
                } else {
                    obj = 1;
                }
            }
        }
        b(aVar);
        d();
    }

    public final void a(bk bkVar, int i) {
        int i2 = bkVar.b;
        bf bfVar;
        if (bkVar.b != -1) {
            bfVar = this.b[i2];
            if (bfVar.e) {
                bfVar.b = (float) i;
                return;
            } else if (bfVar.d.a == 0) {
                bfVar.e = true;
                bfVar.b = (float) i;
                return;
            } else {
                be beVar;
                float f;
                bfVar = b();
                if (i < 0) {
                    bfVar.b = (float) (i * -1);
                    beVar = bfVar.d;
                    f = 1.0f;
                } else {
                    bfVar.b = (float) i;
                    beVar = bfVar.d;
                    f = -1.0f;
                }
                beVar.a(bkVar, f);
                a(bfVar);
                return;
            }
        }
        bfVar = b();
        bfVar.a = bkVar;
        float f2 = (float) i;
        bkVar.d = f2;
        bfVar.b = f2;
        bfVar.e = true;
        a(bfVar);
    }

    public final void a(bk bkVar, bk bkVar2, int i, float f, bk bkVar3, bk bkVar4, int i2, int i3) {
        bf b = b();
        if (bkVar2 == bkVar3) {
            b.d.a(bkVar, 1.0f);
            b.d.a(bkVar4, 1.0f);
            b.d.a(bkVar2, -2.0f);
        } else {
            float f2;
            if (f == 0.5f) {
                b.d.a(bkVar, 1.0f);
                b.d.a(bkVar2, -1.0f);
                b.d.a(bkVar3, -1.0f);
                b.d.a(bkVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    f2 = (float) ((-i) + i2);
                }
            } else if (f <= MapboxConstants.MINIMUM_ZOOM) {
                b.d.a(bkVar, -1.0f);
                b.d.a(bkVar2, 1.0f);
                f2 = (float) i;
            } else if (f >= 1.0f) {
                b.d.a(bkVar3, -1.0f);
                b.d.a(bkVar4, 1.0f);
                f2 = (float) i2;
            } else {
                float f3 = 1.0f - f;
                b.d.a(bkVar, 1.0f * f3);
                b.d.a(bkVar2, f3 * -1.0f);
                b.d.a(bkVar3, -1.0f * f);
                b.d.a(bkVar4, f);
                if (i > 0 || i2 > 0) {
                    f2 = (((float) (-i)) * f3) + (((float) i2) * f);
                }
            }
            b.b = f2;
        }
        if (i3 != 6) {
            b.a(this, i3);
        }
        a(b);
    }

    public final void a(bk bkVar, bk bkVar2, int i, int i2) {
        bf b = b();
        bk c = c();
        c.c = 0;
        b.a(bkVar, bkVar2, c, i);
        if (i2 != 6) {
            a(b, (int) (b.d.b(c) * -1.0f), i2);
        }
        a(b);
    }

    public final void a(bk bkVar, bk bkVar2, bk bkVar3, bk bkVar4, float f) {
        bf b = b();
        b.a(bkVar, bkVar2, bkVar3, bkVar4, f);
        a(b);
    }

    public final bf b() {
        bf bfVar = (bf) this.e.a.a();
        if (bfVar == null) {
            return new bf(this.e);
        }
        bfVar.a = null;
        bfVar.d.a();
        bfVar.b = MapboxConstants.MINIMUM_ZOOM;
        bfVar.e = false;
        return bfVar;
    }

    public final void b(bk bkVar, bk bkVar2, int i, int i2) {
        bf b = b();
        bk c = c();
        c.c = 0;
        b.b(bkVar, bkVar2, c, i);
        if (i2 != 6) {
            a(b, (int) (b.d.b(c) * -1.0f), i2);
        }
        a(b);
    }

    public final bf c(bk bkVar, bk bkVar2, int i, int i2) {
        bf b = b();
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            b.b = (float) i;
        }
        if (obj == null) {
            b.d.a(bkVar, -1.0f);
            b.d.a(bkVar2, 1.0f);
        } else {
            b.d.a(bkVar, 1.0f);
            b.d.a(bkVar2, -1.0f);
        }
        if (i2 != 6) {
            b.a(this, i2);
        }
        a(b);
        return b;
    }

    public final bk c() {
        if (this.l + 1 >= this.j) {
            e();
        }
        bk b = b(3);
        this.g++;
        this.l++;
        b.a = this.g;
        this.e.c[this.g] = b;
        return b;
    }

    public final void d() {
        for (int i = 0; i < this.d; i++) {
            bf bfVar = this.b[i];
            bfVar.a.d = bfVar.b;
        }
    }
}
