package defpackage;

import android.opengl.GLES20;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acup.a;
import defpackage.acup.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

/* renamed from: ackq */
public final class ackq implements a {
    private static final acug j = new acug(0.96f, 0.38f, 0.78f);
    private final acyc A;
    private final acum B;
    private HashSet<String> C = new HashSet();
    private boolean D = false;
    private b E;
    private acvc F;
    private float G = 1.0f;
    private long H;
    private boolean I = true;
    private ackw J = null;
    public final adai a;
    public final List<acuu> b = new ArrayList(30);
    public final HashSet<acuu> c = new HashSet(30);
    int d;
    int e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    private final adbv k;
    private final acxj l;
    private final aclo m;
    private final addk n;
    private final acqi o;
    private final ackh p = new ackh();
    private final acwd q;
    private final acvj r = new acvj();
    private final acvu s;
    private final acyb t;
    private final acuc u;
    private final List<ackn> v = new ArrayList();
    private final ackr w;
    private final List<acvp> x = new ArrayList();
    private final aclg y;
    private final boolean z;

    static {
        acug acug = new acug(0.478f, 0.792f, 0.945f);
    }

    public ackq(adbv adbv, acyc acyc, acxj acxj, aclo aclo, ackr ackr, acum acum, acyj acyj, boolean z, aclg aclg, addk addk, acqi acqi, ajei ajei, zfw zfw) {
        this.A = acyc;
        this.B = acum;
        this.z = z;
        this.k = adbv;
        this.l = acxj;
        this.m = aclo;
        this.n = addk;
        this.o = acqi;
        this.t = new acyb();
        this.w = ackr;
        this.s = this.m.t;
        this.q = new acwd(acum);
        this.u = new acuc(acyj, z, this.t);
        this.a = new adai(aclg, this.u, acyj, this.p);
        this.y = aclg;
        ajei.a(addk.c().u(new -$$Lambda$ackq$BQjMX9AX5Nf0up_sKpPhhuE3stg(this, addk)).p(-$$Lambda$ackq$S-PlhBurHzVuUztVehrht2rZdXA.INSTANCE).a((ajdw) zfw.l()).a(new -$$Lambda$ackq$agn6WV5dGW0wjDY0Pat6zBr1gs4(this), -$$Lambda$ackq$p7s1-M0of2mOZMWdg8_krBscaME.INSTANCE));
    }

    private void a(acmj acmj, b bVar, Float f) {
        int i;
        acwd acwd = this.q;
        acxj acxj = this.l;
        acwf f2 = this.m.h.f();
        float floatValue = f.floatValue();
        float f3 = this.k.b.density;
        ackh ackh = this.p;
        String a = this.y.s.a();
        acwd.e = floatValue;
        adcf a2 = f2.a(2);
        int b = a2.b() << 1;
        if (acwd.f == null) {
            acwd.f = new acvc(acmj.n());
        }
        float[] a3 = acwd.c.a(acmj, f3, a2.b(), a2, acwd.d);
        acwd.a.clear();
        Object obj = null;
        acuw acuw = obj;
        int i2 = 0;
        while (i2 < b) {
            acxj acxj2;
            acwf acwf;
            adcf adcf;
            acub acub = (acvr) a2.a(i2 / 2);
            acub.c = (int) a3[i2];
            acub.d = (int) a3[i2 + 1];
            if (acxj.a((acur) acub) && (acub.q == null || acxj.a(acub.q))) {
                acxj2 = acxj;
                if (!acub.a((float) acub.c, (float) acub.d, floatValue, acwd.f)) {
                    acub acub2;
                    if (acuw == null && acub.p.a.equals(f2.b)) {
                        if (acub.a == null) {
                            acwf = f2;
                            acub.a = new acuh(1.0f, 2.0f, 100.0f, acwd.b);
                            acub2 = acub;
                            acub.a.a(ackh.b);
                        } else {
                            acwf = f2;
                            acub2 = acub;
                        }
                        if (acub2.a.c != 2.0f && acub2.a.a()) {
                            acub2.a.a(ackh.b, 2.0f, 100.0f, acwd.b);
                            acub2.a.a(ackh.b);
                        }
                        acuw = acub2;
                    } else {
                        acwf = f2;
                        acub2 = acub;
                        if (acub2.a == null || acub2.a.c == 1.0f || !acub2.a.a()) {
                            adcf = a2;
                        } else {
                            adcf = a2;
                            acub2.a.a(ackh.b, 1.0f, 100.0f, acwd.b);
                            acub2.a.a(ackh.b);
                        }
                        ackh.a(acub2);
                        acub2.w = false;
                        if (acub2.p.a.equals(a)) {
                            obj = acub2;
                        } else {
                            acwd.a.add(acub2);
                        }
                        i2 += 2;
                        a2 = adcf;
                        acxj = acxj2;
                        f2 = acwf;
                    }
                }
                acwf = f2;
            } else {
                acxj2 = acxj;
                acwf = f2;
            }
            adcf = a2;
            i2 += 2;
            a2 = adcf;
            acxj = acxj2;
            f2 = acwf;
        }
        if (obj != null) {
            acwd.a.add(obj);
        }
        if (acuw != null) {
            ackh.a(acuw);
            i = 1;
            acuw.w = true;
            acwd.a.add(acuw);
        } else {
            i = 1;
        }
        List<acur> list = acwd.a;
        if (!list.isEmpty()) {
            this.u.b(i);
            for (acur acur : list) {
                if (this.l.a(acur)) {
                    acur.c(f.floatValue());
                    acur.c(bVar);
                    this.a.g.a.a(this.H, acur, this.G, acur.k, acur.l, null);
                } else {
                    this.h = false;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e5 A:{LOOP_END, LOOP:2: B:170:0x03df->B:172:0x03e5} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0288 A:{SYNTHETIC, EDGE_INSN: B:176:0x0288->B:115:0x0288 ?: BREAK  , EDGE_INSN: B:176:0x0288->B:115:0x0288 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e5 A:{LOOP_END, LOOP:2: B:170:0x03df->B:172:0x03e5} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0288 A:{SYNTHETIC, EDGE_INSN: B:176:0x0288->B:115:0x0288 ?: BREAK  , EDGE_INSN: B:176:0x0288->B:115:0x0288 ?: BREAK  , EDGE_INSN: B:176:0x0288->B:115:0x0288 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e5 A:{LOOP_END, LOOP:2: B:170:0x03df->B:172:0x03e5} */
    private void a(defpackage.acwk r27, defpackage.acup.b r28, float r29, java.util.HashMap<java.lang.String, defpackage.acvh> r30) {
        /*
        r26 = this;
        r0 = r26;
        r1 = r27;
        r10 = r28;
        r2 = r29;
        r3 = r1.a;
        r3 = r3.b;
        r4 = r3.isEmpty();
        if (r4 == 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r11 = r0.G;
        r4 = r27.b();
        r5 = 12;
        if (r4 == 0) goto L_0x0020;
    L_0x001d:
        r4 = 12;
        goto L_0x0022;
    L_0x0020:
        r4 = 9;
    L_0x0022:
        r7 = r3.size();
        r4 = java.lang.Math.min(r4, r7);
        r7 = r0.s;
        r8 = r0.l;
        r9 = r1.b;
        if (r9 != 0) goto L_0x003e;
    L_0x0032:
        r9 = r7.q;
        if (r9 == 0) goto L_0x003b;
    L_0x0036:
        r9 = r7.q;
        r8.a(r9);
    L_0x003b:
        r7 = r7.q;
        goto L_0x0076;
    L_0x003e:
        r12 = r7.t;
        r13 = r9.a;
        r12 = r12.get(r13);
        r12 = (defpackage.acvt) r12;
        if (r12 != 0) goto L_0x005d;
    L_0x004a:
        r12 = new acvt;
        r13 = r7.i;
        r14 = r7.d;
        r12.<init>(r13, r14);
        r12.a(r9);
        r13 = r7.t;
        r9 = r9.a;
        r13.put(r9, r12);
    L_0x005d:
        r9 = r12.g;
        if (r9 == 0) goto L_0x006c;
    L_0x0061:
        r9 = r12.g;
        r9 = r9.a();
        if (r9 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x006c;
    L_0x006a:
        r7 = r12;
        goto L_0x0076;
    L_0x006c:
        r9 = r12.m();
        if (r9 == 0) goto L_0x003b;
    L_0x0072:
        r8.a(r12);
        goto L_0x003b;
    L_0x0076:
        r8 = r0.s;
        r9 = r0.l;
        r12 = r1.c;
        if (r12 != 0) goto L_0x008a;
    L_0x007e:
        r12 = r8.r;
        if (r12 == 0) goto L_0x0087;
    L_0x0082:
        r12 = r8.r;
        r9.a(r12);
    L_0x0087:
        r8 = r8.r;
        goto L_0x00c2;
    L_0x008a:
        r13 = r8.s;
        r14 = r12.a;
        r13 = r13.get(r14);
        r13 = (defpackage.acwj) r13;
        if (r13 != 0) goto L_0x00a9;
    L_0x0096:
        r13 = new acwj;
        r14 = r8.i;
        r15 = r8.d;
        r13.<init>(r14, r15);
        r13.a(r12);
        r14 = r8.s;
        r12 = r12.a;
        r14.put(r12, r13);
    L_0x00a9:
        r12 = r13.g;
        if (r12 == 0) goto L_0x00b8;
    L_0x00ad:
        r12 = r13.g;
        r12 = r12.a();
        if (r12 != 0) goto L_0x00b6;
    L_0x00b5:
        goto L_0x00b8;
    L_0x00b6:
        r8 = r13;
        goto L_0x00c2;
    L_0x00b8:
        r12 = r13.m();
        if (r12 == 0) goto L_0x0087;
    L_0x00be:
        r9.a(r13);
        goto L_0x0087;
    L_0x00c2:
        r9 = r1.l;
        r7.c = r9;
        r9 = r1.m;
        r7.d = r9;
        r9 = r1.l;
        r8.c = r9;
        r9 = r1.m;
        r8.d = r9;
        r9 = r1.j;
        r7.e = r9;
        r9 = r1.a;
        r9 = r9.b;
        r9 = r9.size();
        r12 = r27.b();
        if (r12 == 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00e7;
    L_0x00e5:
        r5 = 9;
    L_0x00e7:
        r5 = java.lang.Math.min(r9, r5);
        r7.p = r5;
        r5 = r27.b();
        r7.q = r5;
        r7.c(r2);
        r7.c(r10);
        r5 = r1.j;
        r8.e = r5;
        r8.c(r2);
        r8.c(r10);
        r5 = 1;
        if (r4 <= r5) goto L_0x0108;
    L_0x0106:
        r12 = 1;
        goto L_0x0109;
    L_0x0108:
        r12 = 0;
    L_0x0109:
        r4 = r4 + -1;
        r13 = 0;
    L_0x010c:
        r14 = 0;
        if (r4 < 0) goto L_0x0288;
    L_0x010f:
        r15 = r3.get(r4);
        r15 = (defpackage.acvr) r15;
        if (r15 == 0) goto L_0x027e;
    L_0x0117:
        r6 = r15.d;
        r5 = -9999; // 0xffffffffffffd8f1 float:NaN double:NaN;
        if (r6 == r5) goto L_0x027a;
    L_0x011d:
        r6 = r15.c;
        if (r6 == r5) goto L_0x027a;
    L_0x0121:
        r5 = r15.q;
        if (r5 == 0) goto L_0x0138;
    L_0x0125:
        r5 = r15.q;
        r5 = r5.g;
        if (r5 == 0) goto L_0x0148;
    L_0x012b:
        r5 = r15.q;
        r5 = r5.g;
        r5 = r5.a;
        r5 = r5.a();
        if (r5 != 0) goto L_0x0138;
    L_0x0137:
        goto L_0x0148;
    L_0x0138:
        r5 = r15.g;
        if (r5 == 0) goto L_0x0148;
    L_0x013c:
        r5 = r15.g;
        r5 = r5.a;
        r5 = r5.a();
        if (r5 == 0) goto L_0x0148;
    L_0x0146:
        r5 = 1;
        goto L_0x0149;
    L_0x0148:
        r5 = 0;
    L_0x0149:
        if (r5 == 0) goto L_0x026d;
    L_0x014b:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 != 0) goto L_0x01ac;
    L_0x014f:
        r6 = r1.a;
        r6 = r6.j;
        r0.G = r6;
        if (r12 == 0) goto L_0x017d;
    L_0x0157:
        r6 = r1.a;
        r6 = r6.d;
        r13 = r1.a;
        r13 = r13.d;
        r13 = r13.d;
        r14 = r7.b(r10);
        r9 = r7.j;
        r9 = r9 / r5;
        r14 = r14 - r9;
        r9 = java.lang.Math.min(r13, r14);
        r6.d = r9;
        r6 = r0.u;
        r9 = r0.G;
        r6 = r6.a(r7, r9);
        if (r6 != 0) goto L_0x01ab;
    L_0x0179:
        r6 = 0;
        r0.g = r6;
        goto L_0x01ab;
    L_0x017d:
        r6 = 0;
        r9 = r3.get(r6);
        r9 = (defpackage.acvr) r9;
        r6 = r9.G;
        if (r6 == 0) goto L_0x01ab;
    L_0x0188:
        r6 = r6.f;
        if (r6 == 0) goto L_0x01ab;
    L_0x018c:
        r6 = r0.a;
        r6 = r6.c;
        r6 = r6.e();
        r6 = (defpackage.adaj.a) r6;
        r9 = r0.G;
        r13 = r0.u;
        r6.b = r14;
        r6.d = r1;
        r6.c = r10;
        r6.e = r2;
        r6.f = r9;
        r6.g = r13;
        r6 = r6.a;
        r6.a();
    L_0x01ab:
        r13 = 1;
    L_0x01ac:
        r6 = r0.m;
        r9 = r6.D;
        if (r9 == 0) goto L_0x01b9;
    L_0x01b2:
        r6 = r6.D;
        r6 = r6.a(r15, r1);
        goto L_0x01bd;
    L_0x01b9:
        r6 = r1.a;
        r6 = r6.j;
    L_0x01bd:
        r0.G = r6;
        r6 = r15.p;
        r6 = r6.a;
        r9 = r30;
        r6 = r9.get(r6);
        r6 = (defpackage.acvh) r6;
        if (r6 == 0) goto L_0x01e1;
    L_0x01cd:
        r14 = r0.a;
        r14 = r14.e;
        r14 = r14.a;
        r5 = r6.i;
        r14.m = r5;
        r5 = r14.g;
        r5.a();
        r5 = r0.u;
        r5.a();
    L_0x01e1:
        if (r6 == 0) goto L_0x022c;
    L_0x01e3:
        r5 = r6.g;
        if (r5 == 0) goto L_0x022c;
    L_0x01e7:
        r5 = r0.a;
        r5 = r5.g;
        r5 = r5.a;
        r24 = r13;
        r13 = r0.H;
        r2 = r0.G;
        r9 = r6.a;
        r25 = r11;
        r11 = 1;
        if (r9 != r11) goto L_0x01ff;
    L_0x01fa:
        r9 = r6.i;
        r9 = r9.a;
        goto L_0x020a;
    L_0x01ff:
        r9 = r6.i;
        r9 = r9.a;
        r11 = r15.i;
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11 = r11 / r16;
        r9 = r9 + r11;
    L_0x020a:
        r21 = r9;
        r9 = r6.a;
        r11 = 1;
        if (r9 != r11) goto L_0x0216;
    L_0x0211:
        r6 = r6.i;
        r6 = r6.b;
        goto L_0x021d;
    L_0x0216:
        r6 = r6.i;
        r6 = r6.b;
        r9 = r15.j;
        r6 = r6 + r9;
    L_0x021d:
        r22 = r6;
        r6 = r1.a;
        r16 = r5;
        r17 = r13;
        r19 = r15;
        r20 = r2;
        r23 = r6;
        goto L_0x024e;
    L_0x022c:
        r25 = r11;
        r24 = r13;
        r2 = r0.a;
        r2 = r2.g;
        r2 = r2.a;
        r5 = r0.H;
        r9 = r0.G;
        r11 = r15.k;
        r13 = r15.l;
        r14 = r1.a;
        r16 = r2;
        r17 = r5;
        r19 = r15;
        r20 = r9;
        r21 = r11;
        r22 = r13;
        r23 = r14;
    L_0x024e:
        r16.a(r17, r19, r20, r21, r22, r23);
        r2 = r0.d;
        r5 = 1;
        r2 = r2 + r5;
        r0.d = r2;
        r2 = r15.r;
        r6 = r2 instanceof defpackage.acvm.f;
        if (r6 == 0) goto L_0x026a;
    L_0x025d:
        r2 = (defpackage.acvm.f) r2;
        r2 = r2.c();
        if (r2 == 0) goto L_0x026a;
    L_0x0265:
        r2 = r0.e;
        r2 = r2 + r5;
        r0.e = r2;
    L_0x026a:
        r13 = r24;
        goto L_0x0280;
    L_0x026d:
        r25 = r11;
        r2 = 0;
        r5 = 1;
        r0.g = r2;
        r6 = r15.x;
        if (r6 == 0) goto L_0x0280;
    L_0x0277:
        r0.i = r2;
        goto L_0x0280;
    L_0x027a:
        r25 = r11;
        r5 = 1;
        goto L_0x0280;
    L_0x027e:
        r25 = r11;
    L_0x0280:
        r4 = r4 + -1;
        r2 = r29;
        r11 = r25;
        goto L_0x010c;
    L_0x0288:
        r25 = r11;
        r2 = r1.a;
        r2 = r2.j;
        r0.G = r2;
        if (r12 == 0) goto L_0x02a9;
    L_0x0292:
        r2 = r8.s;
        if (r2 == 0) goto L_0x0298;
    L_0x0296:
        r2 = 1;
        goto L_0x0299;
    L_0x0298:
        r2 = 0;
    L_0x0299:
        if (r2 == 0) goto L_0x02a9;
    L_0x029b:
        r2 = r0.u;
        r4 = r0.G;
        r2 = r2.a(r8, r4);
        if (r2 != 0) goto L_0x02a9;
    L_0x02a5:
        r6 = 0;
        r0.g = r6;
        goto L_0x02aa;
    L_0x02a9:
        r6 = 0;
    L_0x02aa:
        r2 = r1.a;
        r2 = r2.e;
        if (r2 == 0) goto L_0x03c9;
    L_0x02b0:
        r11 = new ackw;
        r2 = r1.a;
        r11.<init>(r2);
        r2 = r0.m;
        r4 = r1.a;
        r8 = r2.D;
        if (r8 == 0) goto L_0x02cb;
    L_0x02bf:
        r2 = r2.g;
        r2 = r2.getResources();
        r2 = r8.a(r4, r2);
        r4 = r2;
        goto L_0x02cc;
    L_0x02cb:
        r4 = r14;
    L_0x02cc:
        r2 = r0.m;
        r8 = r1.a;
        r9 = r2.D;
        if (r9 == 0) goto L_0x02e2;
    L_0x02d4:
        r9 = r2.D;
        r2 = r2.g;
        r2 = r2.getResources();
        r2 = r9.b(r8, r2);
        r8 = r2;
        goto L_0x02e3;
    L_0x02e2:
        r8 = r14;
    L_0x02e3:
        r2 = r0.m;
        r9 = r1.a;
        r12 = r2.D;
        if (r12 == 0) goto L_0x02f8;
    L_0x02eb:
        r12 = r2.D;
        r2 = r2.g;
        r2 = r2.getResources();
        r2 = r12.c(r9, r2);
        r14 = r2;
    L_0x02f8:
        r2 = r1.a;
        r2 = r2.h;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r2 == 0) goto L_0x0325;
    L_0x0300:
        r12 = r0.p;
        r12 = r12.b;
        r12 = r2.e(r12);
        if (r12 == 0) goto L_0x0325;
    L_0x030a:
        r12 = r2.c;
        r13 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1));
        if (r12 != 0) goto L_0x031c;
    L_0x0312:
        r9 = r0.p;
        r12 = r9.b;
        r2 = r2.c(r12);
        r9 = r2;
        goto L_0x0325;
    L_0x031c:
        r12 = r0.p;
        r12 = r12.b;
        r2 = r2.c(r12);
        r9 = r9 - r2;
    L_0x0325:
        r2 = -998653952; // 0xffffffffc479c000 float:-999.0 double:NaN;
        r12 = r3.size();
        r13 = 9;
        r12 = java.lang.Math.min(r12, r13);
        r2 = 0;
        r13 = -998653952; // 0xffffffffc479c000 float:-999.0 double:NaN;
    L_0x0336:
        if (r6 >= r12) goto L_0x035c;
    L_0x0338:
        r15 = r3.get(r6);
        r15 = (defpackage.acvr) r15;
        r5 = r15.n;
        r16 = r3;
        r3 = r15.j;
        r5 = r5 + r3;
        r13 = java.lang.Math.max(r13, r5);
        r3 = r1.a;
        r3 = r3.k;
        if (r6 >= r3) goto L_0x0356;
    L_0x034f:
        r3 = r15.q;
        r3 = r3 instanceof defpackage.acwa;
        if (r3 == 0) goto L_0x0356;
    L_0x0355:
        r2 = 1;
    L_0x0356:
        r6 = r6 + 1;
        r3 = r16;
        r5 = 1;
        goto L_0x0336;
    L_0x035c:
        if (r2 != 0) goto L_0x037a;
    L_0x035e:
        r2 = r0.a;
        r2 = r2.b;
        r2 = r2.e();
        r2 = (defpackage.adag.a) r2;
        r6 = r7.a(r10);
        r3 = r4;
        r4 = r8;
        r5 = r14;
        r7 = r13;
        r8 = r9;
        r9 = r28;
        r2 = r2.a(r3, r4, r5, r6, r7, r8, r9);
        r2.a();
    L_0x037a:
        r2 = r1.a;
        r2 = r2.h;
        r2 = r2.i;
        r3 = new -$$Lambda$ackq$PxZdRqKG8--0I5KbZLZ37LliPw4;
        r3.<init>(r0, r1, r10);
        r2.add(r3);
        r2 = r1.a;
        r2 = r2.h;
        r3 = java.lang.System.currentTimeMillis();
        r2 = r2.d(r3);
        if (r2 == 0) goto L_0x03c7;
    L_0x0396:
        r2 = r0.J;
        if (r2 == 0) goto L_0x03c7;
    L_0x039a:
        r2 = r11.equals(r2);
        if (r2 != 0) goto L_0x03c7;
    L_0x03a0:
        r2 = r0.m;
        r2 = r2.w;
        r2 = r2.a;
        r3 = defpackage.acqk.a;
        r2.a(r3);
        r2 = r0.m;
        r2 = r2.w;
        r2 = r2.a;
        r3 = new acql;
        r4 = r1.a;
        r4 = r4.b;
        r5 = r0.y;
        r5 = r5.f;
        r5 = r5.h;
        r5 = r5.d();
        r3.<init>(r4, r10, r5);
        r2.a(r3);
    L_0x03c7:
        r0.J = r11;
    L_0x03c9:
        r1 = r1.a;
        r1 = r1.h;
        if (r1 == 0) goto L_0x03f4;
    L_0x03cf:
        r2 = r0.p;
        r2 = r2.b;
        r2 = r1.d(r2);
        if (r2 == 0) goto L_0x03f4;
    L_0x03d9:
        r2 = r1.i;
        r2 = r2.iterator();
    L_0x03df:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x03ef;
    L_0x03e5:
        r3 = r2.next();
        r3 = (defpackage.acuh.a) r3;
        r3.onAnimationEnd(r1);
        goto L_0x03df;
    L_0x03ef:
        r1 = r1.i;
        r1.clear();
    L_0x03f4:
        r1 = r25;
        r0.G = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ackq.a(acwk, acup$b, float, java.util.HashMap):void");
    }

    private void a(acxy acxy, boolean z, Float f, b bVar, int i, boolean z2) {
        acub acub = acxy;
        b bVar2 = bVar;
        acxn acxn = acub.g;
        if (acxn == null) {
            this.f = false;
            return;
        }
        acxn acxn2;
        if (!acub.m) {
            acub.m = true;
            acub.b.a(this.p.b + 20);
            acub.a.a(this.p.b + 20);
            this.p.a(acub);
        }
        acub.j = this.p.a(acub.i, MapboxConstants.MINIMUM_ZOOM);
        GLES20.glUniform1f(this.u.l, acub.j);
        float a = acxy.a(acub.h.a, f.floatValue());
        float f2 = bVar2.c * a;
        float f3 = ((((float) acub.c) / bVar2.a) * 2.0f) - 1.0f;
        float f4 = 1.0f - ((((float) acub.d) / bVar2.b) * 2.0f);
        adah adah = this.a.f;
        if (acub.k == null) {
            acxn2 = null;
        } else {
            acwz acwz = (acwz) adah.c.getIfPresent(acub.k.a);
            if (acwz == null) {
                acwz = new acwz();
                adah.c.put(acub.k.a, acwz);
            }
            acxn2 = adah.b.a(acub, adah.d, acwz);
        }
        if (acxn2 != null || acub.k == null) {
            float f5;
            Object obj;
            float f6;
            float f7;
            acxn acxn3;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13 = 3.25f * a;
            float f14 = acxn2 == null ? MapboxConstants.MINIMUM_ZOOM : (((float) acxn2.d) / bVar2.a) * f13;
            float f15 = acxn2 == null ? MapboxConstants.MINIMUM_ZOOM : (((float) acxn2.c) / bVar2.b) * f13;
            float f16 = a / 2.0f;
            if (z2) {
                int i2 = i;
                int i3 = 0;
                f5 = 1.0f;
                obj = null;
                while (i3 < i2) {
                    int i4;
                    ackn ackn = (ackn) this.v.get(i3);
                    if (ackn instanceof acwk) {
                        acuv acuv = ((acwk) ackn).a.d;
                        f6 = a;
                        f7 = f15;
                        i4 = i3;
                        acxn3 = acxn;
                        f8 = f2;
                        f9 = f4;
                        double sqrt = Math.sqrt(Math.pow((double) (f3 - acuv.c()), 2.0d) + Math.pow((double) (f4 - acuv.d()), 2.0d));
                        double max = (double) (Math.max(acuv.b(), acuv.a()) / 2.0f);
                        Double.isNaN(max);
                        sqrt -= max;
                        max = (double) f16;
                        Double.isNaN(max);
                        f10 = (float) (sqrt / max);
                        if (((double) f10) < 0.99d) {
                            f5 = Math.min(f5, f10);
                            obj = 1;
                        } else {
                            f11 = f5;
                        }
                        if (acub.k != null && obj == null && f3 < acuv.c()) {
                            f10 = (f3 + f14) - ((this.a.f.e / bVar2.a) * f13);
                            f4 = (f9 + (f8 / 2.0f)) + (f7 / 2.0f);
                            Object obj2 = (acuv.a >= f10 + f14 || f10 >= acuv.c || acuv.d >= f4 || f4 - f7 >= acuv.b) ? null : 1;
                            if (obj2 != null) {
                                obj = 1;
                            }
                        }
                    } else {
                        acxn3 = acxn;
                        f6 = a;
                        f7 = f15;
                        f8 = f2;
                        i4 = i3;
                        f9 = f4;
                        f11 = f5;
                    }
                    i3 = i4 + 1;
                    i2 = i;
                    a = f6;
                    f15 = f7;
                    f4 = f9;
                    acxn = acxn3;
                    f2 = f8;
                }
                acxn3 = acxn;
                f6 = a;
                f7 = f15;
                f8 = f2;
                f9 = f4;
                f11 = f5;
                f10 = MapboxConstants.MINIMUM_ZOOM;
            } else {
                acxn3 = acxn;
                f6 = a;
                f7 = f15;
                f8 = f2;
                f9 = f4;
                f10 = MapboxConstants.MINIMUM_ZOOM;
                f11 = 1.0f;
                obj = null;
            }
            a = Math.max(f10, f11);
            f10 = Math.min(a, acub.e);
            f15 = f6 * f10;
            f2 = f8 * f10;
            f13 *= f10;
            f14 *= f10;
            f10 *= f7;
            acub.l = f15;
            double d = (double) a;
            if (d >= 0.99d) {
                f12 = f10;
                f5 = f14;
            } else if (z && a > 0.1f) {
                if (a >= 0.4f || !z2 || acub.v <= MapboxConstants.MINIMUM_ZOOM) {
                    f12 = f10;
                    f5 = f14;
                } else {
                    if (acub.w == null) {
                        f12 = f10;
                        f5 = f14;
                        acub.w = new acuh(1.0f, MapboxConstants.MINIMUM_ZOOM, 100.0f, acun.a);
                        acub.w.h = true;
                    } else {
                        f12 = f10;
                        f5 = f14;
                    }
                    if (acub.w.c > MapboxConstants.MINIMUM_ZOOM) {
                        acub.w.a(this.p.b, MapboxConstants.MINIMUM_ZOOM, 100.0f, acun.a);
                        acub.w.h = true;
                    }
                }
                acub.v = this.p.a(acub.w, acub.v);
            } else {
                return;
            }
            if (a > 0.6f && z2) {
                if (acub.v <= MapboxConstants.MINIMUM_ZOOM) {
                    if (acub.w == null) {
                        f14 = 1.0f;
                        acub.w = new acuh(MapboxConstants.MINIMUM_ZOOM, 1.0f, 100.0f, acun.a);
                        acub.w.h = true;
                    } else {
                        f14 = 1.0f;
                    }
                    if (acub.w.c < f14) {
                        acub.w.a(this.p.b, 1.0f, 100.0f, acun.a);
                        acub.w.h = true;
                    }
                }
                acub.v = this.p.a(acub.w, acub.v);
            }
            if (acxn2 != null) {
                ackh ackh;
                acuh acuh;
                long j;
                float f17;
                if (obj != null || d < 0.99d) {
                    ackh = this.p;
                    if (acub.u >= MapboxConstants.MINIMUM_ZOOM) {
                        if (acub.t == null) {
                            acub.t = new acuh(1.0f, MapboxConstants.MINIMUM_ZOOM, 100.0f, acun.a);
                            acub.t.h = true;
                        }
                        if (acub.t.c != MapboxConstants.MINIMUM_ZOOM) {
                            acuh = acub.t;
                            j = ackh.b;
                            f17 = MapboxConstants.MINIMUM_ZOOM;
                        }
                        acub.u = ackh.a(acub.t, acub.u);
                    }
                } else {
                    ackh = this.p;
                    if (acub.u < 1.0f) {
                        if (acub.t == null) {
                            acub.t = new acuh(MapboxConstants.MINIMUM_ZOOM, 1.0f, 100.0f, acun.a);
                            acub.t.h = true;
                        }
                        if (acub.t.c < 1.0f) {
                            acuh = acub.t;
                            j = ackh.b;
                            f17 = 1.0f;
                        }
                        acub.u = ackh.a(acub.t, acub.u);
                    }
                }
                acuh.a(j, f17, 300.0f, acun.a);
                acub.t.h = true;
                acub.u = ackh.a(acub.t, acub.u);
            }
            acub.r = acub.f * acub.v;
            if (acub.r != MapboxConstants.MINIMUM_ZOOM) {
                this.u.b(1);
                this.u.a((float) MapboxConstants.MINIMUM_ZOOM);
                this.u.a(-1);
                acub.x = f3;
                acub.y = f9 + (f2 / 2.0f);
                adaj.a aVar = (adaj.a) this.a.c.e();
                a = this.G;
                acuc acuc = this.u;
                aVar.d = null;
                aVar.b = acub;
                aVar.c = bVar2;
                aVar.f = a;
                aVar.g = acuc;
                if (!aVar.a.a()) {
                    this.f = false;
                }
                if (!(acub.k == null || acxn2 == null)) {
                    adah.a aVar2 = this.a.f.a;
                    float f18 = ((acub.x + (f15 / 2.0f)) + acub.n) - ((aVar2.a.e / bVar2.a) * f13);
                    f13 = acub.y;
                    acub.p = f18;
                    acub.q = f13;
                    acub.n = f5;
                    acub.o = f12;
                    aVar2.b = acub;
                    aVar2.c = acxn2;
                    aVar2.d = 1.0f;
                    aVar2.a.a();
                }
                acuc c = this.u.c(acub.r);
                GLES20.glUniform1f(c.n, (float) (1.0d / acub.h.a.e));
                c.a(f15, f2).b(acub.x, acub.y).c(acxn3.a.a).b(0);
                acuc.b();
                this.b.add(acub);
                this.c.add(acub);
            }
        }
    }

    private void a(acxz acxz, b bVar, float f, int i) {
        acxz acxz2 = acxz;
        float f2 = f;
        aljy aljy = acxz2.e.a;
        if ((aljy.a != 7 || (this.D && !this.C.contains(aljy.b))) && acxz2.d != MapboxConstants.MINIMUM_ZOOM && acxz2.f != null) {
            boolean z = true;
            if (!acxz2.g) {
                acxz2.g = true;
                acxz2.c.a(this.p.b + 20);
                acxz2.b.a(this.p.b + 20);
                this.p.a(acxz2);
            }
            if (acxz2.e.a.a == 7) {
                z = false;
            }
            if (z) {
                double d = acxz2.e.a.e;
                double d2 = (double) f2;
                Double.isNaN(d2);
                float f3 = (float) (d * d2);
                float a = acxz.a(bVar);
                float b = acxz.b(bVar);
                f3 /= 2.0f;
                int i2 = i;
                for (int i3 = 0; i3 < i2; i3++) {
                    ackn ackn = (ackn) this.v.get(i3);
                    if (ackn instanceof acwk) {
                        acuv acuv = ((acwk) ackn).a.d;
                        double sqrt = Math.sqrt(Math.pow((double) (a - acuv.c()), 2.0d) + Math.pow((double) (b - acuv.d()), 2.0d));
                        double max = (double) (Math.max(acuv.b(), acuv.a()) / 2.0f);
                        Double.isNaN(max);
                        sqrt -= max;
                        max = (double) f3;
                        Double.isNaN(max);
                        if (((double) ((float) (sqrt / max))) < 0.99d) {
                            return;
                        }
                    }
                }
            }
            adae.a aVar = this.a.h.a;
            aVar.b = acxz2;
            aVar.c = bVar;
            aVar.d = f2;
            aVar.a.a();
            this.c.add(acxz2);
        }
    }

    public final Object a(cgi cgi, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        if (!this.k.e()) {
            return null;
        }
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        Object a;
        adal[] adalArr = this.a.a;
        for (int i = 0; i < 7; i++) {
            a = adalArr[i].a(cgi, f3, f4, bVar);
            if (a != null) {
                break;
            }
        }
        a = null;
        if (a != null) {
            return a;
        }
        float f5;
        Object obj;
        float sqrt;
        acwd acwd = this.q;
        Object obj2 = null;
        float f6 = Float.MAX_VALUE;
        for (int size = acwd.a.size() - 1; size >= 0; size--) {
            acvr acvr = (acvr) acwd.a.get(size);
            if (acvr.A) {
                acvr.c(acwd.e);
                f5 = acvr.t * acwd.f.e;
                if (Math.abs(((float) acvr.c) - f3) < (acvr.s * acwd.f.e) * 0.8f && Math.abs(((float) acvr.d) - f4) < f5 * 0.8f) {
                    obj = obj2;
                    sqrt = (float) Math.sqrt(Math.pow((double) (((float) acvr.c) - f3), 2.0d) + Math.pow((double) (((float) acvr.d) - f4), 2.0d));
                    if (sqrt < f6) {
                        f6 = sqrt;
                        obj2 = acvr;
                    }
                    obj2 = obj;
                }
            }
            obj = obj2;
            obj2 = obj;
        }
        obj = obj2;
        if (obj != null) {
            return obj;
        }
        Object obj3;
        List list = this.v;
        ListIterator listIterator = list.listIterator(list.size());
        ArrayList arrayList = new ArrayList();
        float f7 = 2.0f;
        f6 = 1.0f;
        sqrt = ((f3 / this.E.a) * 2.0f) - 1.0f;
        float f8 = 1.0f - ((f4 / this.E.b) * 2.0f);
        while (listIterator.hasPrevious()) {
            ackn ackn = (ackn) listIterator.previous();
            if (arrayList.isEmpty() && (ackn instanceof acxy)) {
                obj3 = (acxy) ackn;
                if (obj3.m) {
                    f5 = ((f3 / (this.F.b - this.F.a)) * f7) - f6;
                    float f9 = f6 - ((f4 / (this.F.d - this.F.c)) * f7);
                    if (obj3.k != null && obj3.u > MapboxConstants.MINIMUM_ZOOM && Math.abs(f5 - obj3.p) < obj3.n && Math.abs(f9 - obj3.q) < obj3.o && this.b.contains(obj3)) {
                        break;
                    }
                    f6 = obj3.l / f7;
                    if (Math.pow((double) (f5 - obj3.x), 2.0d) + Math.pow((double) (f9 - obj3.y), 2.0d) < ((double) (f6 * f6)) && this.b.contains(obj3)) {
                        break;
                    }
                }
                continue;
            } else if (ackn instanceof acwk) {
                acwk acwk = (acwk) ackn;
                if (!acwk.a.c()) {
                    acuv acuv = acwk.a.d;
                    obj2 = (acuv.a >= acuv.c || acuv.d >= acuv.b || sqrt < acuv.a || sqrt >= acuv.c || f8 < acuv.d || f8 >= acuv.b) ? null : 1;
                    if (obj2 != null) {
                        arrayList.add(acwk);
                    }
                }
            }
            f7 = 2.0f;
            f6 = 1.0f;
        }
        obj3 = obj;
        return obj3 != null ? obj3 : arrayList.isEmpty() ? null : new acvu.b(arrayList);
    }

    public final void a() {
        adal[] adalArr = this.a.a;
        for (int i = 0; i < 7; i++) {
            adalArr[i].b();
        }
        acuc acuc = this.u;
        if (acuc.c != null) {
            acuc.c.a();
            acuc.c = null;
        }
        if (acuc.d != null) {
            acuc.d.a.a();
            acuc.d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x046e  */
    /* JADX WARNING: Missing block: B:164:0x04b5, code skipped:
            if (defpackage.acko.a(r5, r9) <= 0) goto L_0x048e;
     */
    public final void a(defpackage.acmj r29, defpackage.acup.b r30) {
        /*
        r28 = this;
        r8 = r28;
        r0 = r30;
        r7 = 1;
        r8.f = r7;
        r8.h = r7;
        r8.g = r7;
        r8.i = r7;
        r1 = r8.v;
        r1.clear();
        r1 = r8.b;
        r1.clear();
        r1 = r8.x;
        r1.clear();
        r1 = r8.a;
        r1 = r1.a;
        r15 = 0;
        r2 = 0;
    L_0x0022:
        r3 = 7;
        if (r2 >= r3) goto L_0x002d;
    L_0x0025:
        r3 = r1[r2];
        r3.c();
        r2 = r2 + 1;
        goto L_0x0022;
    L_0x002d:
        r1 = r8.w;
        r1 = r1.a;
        if (r1 != 0) goto L_0x003a;
    L_0x0033:
        r1 = r8.w;
        r1 = r1.b;
        if (r1 != 0) goto L_0x003a;
    L_0x0039:
        return;
    L_0x003a:
        r1 = r8.k;
        r1 = r1.k();
        if (r1 != 0) goto L_0x0043;
    L_0x0042:
        return;
    L_0x0043:
        r2 = r8.k;
        r2 = r2.j();
        if (r2 != 0) goto L_0x004c;
    L_0x004b:
        return;
    L_0x004c:
        r2 = r8.F;
        if (r2 != 0) goto L_0x005b;
    L_0x0050:
        r2 = new acvc;
        r3 = r29.n();
        r2.<init>(r3);
        r8.F = r2;
    L_0x005b:
        r2 = r8.A;
        r14 = r2.a;
        if (r14 != 0) goto L_0x0062;
    L_0x0061:
        return;
    L_0x0062:
        r2 = r8.p;
        r2.a();
        r2 = r14.floatValue();
        r2 = (double) r2;
        r4 = 4576918229304087675; // 0x3f847ae147ae147b float:89128.96 double:0.01;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x04e6;
    L_0x0075:
        r2 = r14.floatValue();
        r21 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1));
        if (r2 <= 0) goto L_0x0081;
    L_0x007f:
        goto L_0x04e6;
    L_0x0081:
        r2 = r8.m;
        r2 = r2.m;
        r13 = r2.d;
        r2 = 2929; // 0xb71 float:4.104E-42 double:1.447E-320;
        android.opengl.GLES20.glDisable(r2);
        r2 = 2884; // 0xb44 float:4.041E-42 double:1.425E-320;
        android.opengl.GLES20.glDisable(r2);
        r2 = 3042; // 0xbe2 float:4.263E-42 double:1.503E-320;
        android.opengl.GLES20.glEnable(r2);
        r2 = r8.u;
        r1 = r1.getContext();
        r3 = r2.c;
        if (r3 != 0) goto L_0x0133;
    L_0x00a0:
        r3 = android.opengl.GLES20.glCreateProgram();
        if (r3 <= 0) goto L_0x0133;
    L_0x00a6:
        r4 = new acww;
        r4.<init>();
        r5 = "precision highp int;\nprecision highp float;\nattribute vec2 a_pos;\nvarying vec2 v_texCoord;\nuniform vec2 u_scale;\nuniform vec2 u_translate;\nuniform vec2 u_anchor_point;\nuniform vec2 u_rotate;\n\nvoid main() {\n    vec2 normalized_anchor = u_anchor_point * 2.0 - 1.0;\n    gl_Position = vec4(a_pos - normalized_anchor, 0.0, 1.0);\n    // u_rotate[0] = sin(theta), u_rotate[1] = cos(theta)\n    float x = gl_Position.x * u_rotate[1] - gl_Position.y * u_rotate[0];\n    float y = gl_Position.x * u_rotate[0] + gl_Position.y * u_rotate[1];\n    gl_Position.xy = vec2(x, y) * u_scale + u_translate;\n    v_texCoord = (a_pos + 1.0) / 2.0;\n}\n\n";
        r6 = "#ifdef GL_OES_standard_derivatives\n#   extension GL_OES_standard_derivatives : enable\n#endif\n\nprecision mediump int;\nprecision mediump float;\n\nvarying vec2 v_texCoord;\nuniform sampler2D u_icon;\n\nuniform float u_alpha;\n\nuniform int u_paint_only;\nuniform float u_loading_spinner_alpha;\nuniform float u_loading_radians;\nuniform float u_border_scale;\nuniform vec4 u_blend_color;\n\nconst float u_outer_circle_radius = 0.9;\nconst float u_border_width = 0.11;\n\n// this can be set to 0 to draw just the backing texture\nconst int u_should_draw_thumbnail = 1;\n\nconst float u_border = 0.03;\n\nconst vec4 dropShadowColor = vec4(0.0, 0.0, 0.0, 1.0);\nconst vec4 white = vec4(1.0, 1.0, 1.0, 1.0);\nconst vec4 black = vec4(0.0, 0.0, 0.0, 1.0);\nconst vec4 clear = vec4(0.0, 0.0, 0.0, 0.0);\nconst vec4 purple = vec4(0.933, 0.5, 0.933, 1.0);\nconst vec4 innerCircleGray = vec4(0.88, 0.88, 0.88, 0.95);\n\nfloat f_delta(float x) {\n#ifdef GL_OES_standard_derivatives\n    return fwidth(x);\n#else\n    return 0.0;\n#endif\n}\n\nfloat inv_smoothstep(float a, float b, float d) {\n    return 1.0 - smoothstep(a, b, d);\n}\n\nfloat unit_circle_drop_shadow_alpha(float dist) {\n    return clamp((exp(-dist * dist / 0.32) - 0.044) * 3.0, 0.0, 1.0);\n}\n\nfloat dist_circle(vec2 p, vec2 center) {\n    return sqrt(pow((center.x - p.x), 2.0) + pow((center.y - p.y), 2.0));\n}\n\nvec4 mix_colors(vec4 src, vec4 dest) {\n    return clamp(src + dest * (1.0 - src.a), 0.0, 1.0);\n}\nvec2 to_vertex_coord(vec2 tex_coord) {\n    return tex_coord * 2.0 - 1.0;\n}\nvec2 to_tex_coord(vec2 vertex_coord) {\n    return (vertex_coord + 1.0) / 2.0;\n}\n\nvec4 color_for_circle(float scaled_border_width) {\n    vec2 coord = v_texCoord * 2.0 - 1.0;\n    vec2 flippedYCoord = vec2(v_texCoord.x, 1.0-v_texCoord.y);\n\n    float dist = distance(coord, vec2(0.0, 0.0));\n    float delta = f_delta(dist);\n    float inner_circle = u_outer_circle_radius - scaled_border_width;\n\n    float thumbAlpha = inv_smoothstep(inner_circle - delta, inner_circle, dist);\n    // account for circle size to get as much of the texture in the circle as possible\n    vec2 samplingCoord = to_tex_coord(to_vertex_coord(flippedYCoord) / inner_circle);\n    vec4 thumbColor = texture2D(u_icon, samplingCoord) * thumbAlpha * float(u_should_draw_thumbnail);\n\n    float backingAlpha = inv_smoothstep(u_outer_circle_radius - delta, u_outer_circle_radius, dist);\n\n    vec2 radarCoord = vec2(cos(2.0 * 3.14159 - u_loading_radians), sin(2.0 * 3.14159 - u_loading_radians));\n    float dotPrd = radarCoord.x * coord.x + radarCoord.y * coord.y;\n    float det = coord.x * radarCoord.y - coord.y * radarCoord.x;\n    float angle = atan(det, dotPrd);\n    float angleAlpha = (angle + 3.14159) / 2.0 / 3.14159;\n    float loadingAlpha = clamp((backingAlpha * angleAlpha * u_loading_spinner_alpha) - thumbAlpha, 0.0, 1.0);\n    vec4 loadingColor = purple * loadingAlpha;\n\n    vec4 outerRingColor = white * clamp(backingAlpha - thumbAlpha, 0.0, 1.0);\n    vec4 innerBackingColor = innerCircleGray * backingAlpha;\n    vec4 backingColor = mix_colors(loadingColor, mix_colors(outerRingColor, innerBackingColor));\n\n    float dropShadowAlpha = clamp(unit_circle_drop_shadow_alpha(dist) - thumbAlpha, 0.0, 1.0);\n\n    vec4 iconColor = mix_colors(thumbColor, backingColor);\n    return mix_colors(iconColor, dropShadowColor * dropShadowAlpha);\n}\n\nvoid main() {\n    if (u_paint_only == 1) {\n        vec4 color = texture2D(u_icon, vec2(v_texCoord.x, -v_texCoord.y));\n        if (color.a == 0.0) {\n           gl_FragColor = clear;\n        } else {\n           gl_FragColor = vec4(color.rgb * u_alpha * u_blend_color.rgb, color.a * u_alpha * u_blend_color.a);\n        }\n    } else {\n        float border_width = u_border_scale * u_border_width;\n        vec4 prealpha = color_for_circle(border_width);\n        gl_FragColor = vec4(prealpha.rgb*u_alpha, u_alpha*prealpha.a);\n    }\n}\n";
        r4.a(r3, r5, r6);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "a_pos";
        r3 = r4.a(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.e = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = new acui;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r5 = r2.a;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.d = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_scale";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.f = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_translate";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.g = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_paint_only";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.k = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_icon";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.h = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_alpha";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.i = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_anchor_point";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.j = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_loading_spinner_alpha";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.l = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_loading_radians";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.m = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_border_scale";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.n = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_rotate";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.o = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = "u_blend_color";
        r3 = r4.b(r3);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.p = r3;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.c = r4;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r3 = r2.b;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        if (r3 == 0) goto L_0x0133;
    L_0x0121:
        r2 = r2.b;	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        r2.a(r1);	 Catch:{ IOException -> 0x0129, IOException | IllegalAccessException -> 0x0127 }
        goto L_0x0133;
    L_0x0127:
        r0 = move-exception;
        goto L_0x012a;
    L_0x0129:
        r0 = move-exception;
    L_0x012a:
        r4.a();
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0133:
        r1 = r14.floatValue();
        r12 = defpackage.adam.a(r1);
        r1 = r8.r;
        r2 = r8.m;
        r4 = r2.E;
        r5 = r8.B;
        r2 = r8.a;
        r6 = r2.e;
        r2 = r29;
        r3 = r30;
        r6 = r1.a(r2, r3, r4, r5, r6);
        r9 = r8.s;
        r10 = r8.w;
        r1 = r8.l;
        r2 = r8.m;
        r2 = r2.h;
        r2 = r2.f();
        r3 = r8.k;
        r3 = r3.b;
        r3 = r3.density;
        r4 = r8.p;
        r5 = r8.y;
        r5 = r5.s;
        r17 = r5.a();
        r5 = r8.m;
        r11 = r6.isEmpty();
        r22 = 0;
        if (r11 == 0) goto L_0x017a;
    L_0x0177:
        r20 = r22;
        goto L_0x017c;
    L_0x017a:
        r20 = r6;
    L_0x017c:
        r11 = r29;
        r23 = r12;
        r12 = r1;
        r1 = r13;
        r13 = r2;
        r2 = r14;
        r14 = r23;
        r7 = 0;
        r15 = r3;
        r16 = r4;
        r18 = r30;
        r19 = r5;
        r3 = r9.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r4 = r8.k;
        r4 = r4.b;
        r4 = r4.density;
        r5 = r8.t;
        r9 = r8.w;
        r18 = r2.floatValue();
        r15 = r8.l;
        r14 = r8.p;
        r10 = r8.m;
        r10 = r10.z;
        r11 = r8.m;
        r13 = r11.J;
        r11 = r5.c;
        r11.a();
        r9 = r9.b;
        if (r9 != 0) goto L_0x01bb;
    L_0x01b5:
        r4 = java.util.Collections.emptyList();
        goto L_0x026c;
    L_0x01bb:
        r9 = r5.f;
        if (r9 != 0) goto L_0x01ca;
    L_0x01bf:
        r9 = new acvc;
        r11 = r29.n();
        r9.<init>(r11);
        r5.f = r9;
    L_0x01ca:
        r5.g = r4;
        r4 = r5.i;
        r21 = r21 - r4;
        r4 = r18 * r21;
        if (r10 == 0) goto L_0x0242;
    L_0x01d4:
        r9 = r10.b;
        if (r9 == 0) goto L_0x0242;
    L_0x01d8:
        r10.b = r7;
        r12 = r10.a;
        r11 = r5.e;
        r9 = r5.e;
        r10 = r5.a;
        if (r9 != r10) goto L_0x01e7;
    L_0x01e4:
        r9 = r5.b;
        goto L_0x01e9;
    L_0x01e7:
        r9 = r5.a;
    L_0x01e9:
        r10 = r9;
        r9 = r10.a;
        r9.clear();
        if (r12 == 0) goto L_0x0218;
    L_0x01f1:
        r9 = r12.isEmpty();
        if (r9 != 0) goto L_0x0218;
    L_0x01f7:
        r9 = r5;
        r19 = r10;
        r10 = r18;
        r20 = r11;
        r11 = r19;
        r21 = r12;
        r12 = r20;
        r25 = r13;
        r13 = r21;
        r26 = r14;
        r14 = r29;
        r27 = r15;
        r15 = r26;
        r16 = r27;
        r17 = r4;
        r9.a(r10, r11, r12, r13, r14, r15, r16, r17);
        goto L_0x0224;
    L_0x0218:
        r19 = r10;
        r20 = r11;
        r21 = r12;
        r25 = r13;
        r26 = r14;
        r27 = r15;
    L_0x0224:
        if (r21 == 0) goto L_0x0228;
    L_0x0226:
        r15 = 1;
        goto L_0x0229;
    L_0x0228:
        r15 = 0;
    L_0x0229:
        r9 = r5;
        r10 = r18;
        r11 = r19;
        r12 = r20;
        r13 = r29;
        r14 = r26;
        r16 = r27;
        r17 = r25;
        r18 = r4;
        r9.a(r10, r11, r12, r13, r14, r15, r16, r17, r18);
        r9 = r19;
        r5.e = r9;
        goto L_0x0256;
    L_0x0242:
        r25 = r13;
        r26 = r14;
        r27 = r15;
        r10 = r5.e;
        r9 = r5;
        r11 = r29;
        r12 = r26;
        r13 = r27;
        r14 = r25;
        r9.a(r10, r11, r12, r13, r14);
    L_0x0256:
        r4 = r5.c;
        r9 = r5.e;
        r9 = r9.a;
        r9 = r9.values();
        r4.a(r9);
        r4 = r5.c;
        r9 = r5.d;
        r4.a(r9);
        r4 = r5.c;
    L_0x026c:
        r4 = r4.iterator();
        r3 = r3.iterator();
        r5 = r22;
        r9 = r5;
        r10 = r9;
    L_0x0278:
        r11 = r4.hasNext();
        if (r11 != 0) goto L_0x0288;
    L_0x027e:
        r11 = r3.hasNext();
        if (r11 != 0) goto L_0x0288;
    L_0x0284:
        if (r5 != 0) goto L_0x0288;
    L_0x0286:
        if (r9 == 0) goto L_0x02aa;
    L_0x0288:
        if (r5 != 0) goto L_0x0296;
    L_0x028a:
        r11 = r4.hasNext();
        if (r11 == 0) goto L_0x0296;
    L_0x0290:
        r5 = r4.next();
        r5 = (defpackage.acuu) r5;
    L_0x0296:
        if (r9 != 0) goto L_0x02a4;
    L_0x0298:
        r11 = r3.hasNext();
        if (r11 == 0) goto L_0x02a4;
    L_0x029e:
        r9 = r3.next();
        r9 = (defpackage.acwk) r9;
    L_0x02a4:
        if (r5 != 0) goto L_0x047e;
    L_0x02a6:
        if (r9 == 0) goto L_0x02aa;
    L_0x02a8:
        goto L_0x047e;
    L_0x02aa:
        if (r10 == 0) goto L_0x02b1;
    L_0x02ac:
        r1 = r8.v;
        r1.add(r10);
    L_0x02b1:
        r1 = r8.m;
        r1 = r1.c;
        r3 = r8.p;
        r4 = r1.b;
        r5 = r1.d;
        if (r4 == r5) goto L_0x02c1;
    L_0x02bd:
        r11 = r3.b;
        r1.e = r11;
    L_0x02c1:
        r1.d = r4;
        r1 = r8.m;
        if (r10 == 0) goto L_0x02c9;
    L_0x02c7:
        r3 = 1;
        goto L_0x02ca;
    L_0x02c9:
        r3 = 0;
    L_0x02ca:
        r1 = r1.h;
        r4 = r1.j;
        r1.j = r3;
        if (r4 == r3) goto L_0x02db;
    L_0x02d2:
        r4 = r1.i;
        if (r4 == 0) goto L_0x02db;
    L_0x02d6:
        r1 = r1.i;
        r1.a(r3);
    L_0x02db:
        r1 = r8.o;
        r9 = r1.a;
        r1 = r8.D;
        r10 = 0;
        if (r1 == 0) goto L_0x0348;
    L_0x02e4:
        if (r9 == 0) goto L_0x0348;
    L_0x02e6:
        r1 = r9.e;
        r1 = r1.a;
        r1 = r1.i;
        r1 = r1.b;
        r3 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r1 = r1 - r3;
        r3 = r8.a;
        r3 = r3.d;
        r3 = r3.e();
        r3 = (defpackage.adad.b) r3;
        r3 = r3.a;
        r3 = r3.a;
        r4 = r9.a(r0);
        r5 = r9.b(r0);
        r11 = r8.p;
        r12 = r9.a;
        r3.a = r4;
        r3.b = r5;
        r1 = defpackage.adcd.a.a(r1, r0);
        r3.c = r1;
        if (r12 == 0) goto L_0x0322;
    L_0x0317:
        r1 = r11.a(r12, r10);
        r4 = r3.c;
        r4 = (float) r4;
        r1 = r1 * r4;
        r1 = (int) r1;
        r3.c = r1;
    L_0x0322:
        r3.d = r0;
        r3.e = r11;
        r1 = r8.a;
        r1 = r1.d;
        r1 = r1.e();
        r1 = (defpackage.adad.b) r1;
        r4 = j;
        r1.d = r3;
        r1.e = r4;
        r4 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r1.f = r4;
        r4 = r3.d;
        r1.c = r4;
        r3 = r3.e;
        r1.b = r3;
        r1 = r1.a;
        r1.a();
    L_0x0348:
        r1 = r8.u;
        r1 = r1.a();
        if (r1 != 0) goto L_0x0359;
    L_0x0350:
        r8.f = r7;
        r8.h = r7;
        r8.g = r7;
        r8.i = r7;
        return;
    L_0x0359:
        r8.d = r7;
        r8.e = r7;
        r1 = r8.v;
        r11 = r1.size();
        r12 = 0;
        r15 = 1;
    L_0x0365:
        if (r12 >= r11) goto L_0x040e;
    L_0x0367:
        r1 = r8.v;
        r1 = r1.get(r12);
        r1 = (defpackage.ackn) r1;
        r3 = r1 instanceof defpackage.acxy;
        if (r3 == 0) goto L_0x03d8;
    L_0x0373:
        r13 = r1;
        r13 = (defpackage.acxy) r13;
        if (r15 == 0) goto L_0x0398;
    L_0x0378:
        r1 = r8.p;
        r3 = r1.b;
        r3 = (double) r3;
        r14 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r3);
        r3 = r3 / r14;
        r14 = java.lang.Math.floor(r3);
        r3 = r3 - r14;
        r1 = (float) r3;
        r3 = 1086918619; // 0x40c90fdb float:6.2831855 double:5.370091495E-315;
        r1 = r1 * r3;
        r3 = r8.u;
        r3 = r3.m;
        android.opengl.GLES20.glUniform1f(r3, r1);
        r15 = 0;
    L_0x0398:
        r1 = r8.w;
        r3 = r1.c;
        r1 = r8.m;
        r4 = r13.h;
        r4 = r4.a;
        r4 = r4.b;
        r5 = r1.Q;
        if (r5 == 0) goto L_0x03b2;
    L_0x03a8:
        r1 = r1.Q;
        r1 = r1.contains(r4);
        if (r1 == 0) goto L_0x03b2;
    L_0x03b0:
        r1 = 1;
        goto L_0x03b3;
    L_0x03b2:
        r1 = 0;
    L_0x03b3:
        r14 = 1;
        r16 = r1 ^ 1;
        r1 = r28;
        r5 = r2;
        r2 = r13;
        r4 = r5;
        r17 = r5;
        r5 = r30;
        r14 = r6;
        r6 = r12;
        r18 = r15;
        r15 = 1;
        r24 = 0;
        r7 = r16;
        r1.a(r2, r3, r4, r5, r6, r7);
        r1 = r13.j;
        r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r1 <= 0) goto L_0x03d3;
    L_0x03d1:
        r0.g = r15;
    L_0x03d3:
        r2 = r18;
    L_0x03d5:
        r6 = r23;
        goto L_0x0403;
    L_0x03d8:
        r17 = r2;
        r14 = r6;
        r2 = r15;
        r15 = 1;
        r24 = 0;
        r3 = r1 instanceof defpackage.acxz;
        if (r3 == 0) goto L_0x03ed;
    L_0x03e3:
        r1 = (defpackage.acxz) r1;
        r3 = r17.floatValue();
        r8.a(r1, r0, r3, r12);
        goto L_0x03d5;
    L_0x03ed:
        r3 = r8.d;
        r4 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r3 >= r4) goto L_0x03d5;
    L_0x03f3:
        r3 = r1 instanceof defpackage.acwk;
        if (r3 == 0) goto L_0x03d5;
    L_0x03f7:
        r3 = r8.u;
        r3.b(r15);
        r1 = (defpackage.acwk) r1;
        r6 = r23;
        r8.a(r1, r0, r6, r14);
    L_0x0403:
        r12 = r12 + 1;
        r15 = r2;
        r23 = r6;
        r6 = r14;
        r2 = r17;
        r7 = 0;
        goto L_0x0365;
    L_0x040e:
        r7 = r2;
        r15 = 1;
        r2 = r29;
        r8.a(r2, r0, r7);
        if (r9 == 0) goto L_0x045a;
    L_0x0417:
        r1 = r8.o;
        r1 = r1.b;
        r1 = r1.b();
        r10 = r1;
        r10 = (java.lang.String) r10;
        if (r10 == 0) goto L_0x045a;
    L_0x0424:
        r13 = r9.a(r0);
        r1 = r9.b(r0);
        r2 = 1075838976; // 0x40200000 float:2.5 double:5.315350785E-315;
        r3 = r7.floatValue();
        r4 = r0.c;
        r3 = r9.a(r3, r4);
        r3 = r3 * r2;
        r14 = r1 + r3;
        r1 = r8.u;
        r1.b(r15);
        r1 = r8.a;
        r1 = r1.b;
        r1 = r1.e();
        r9 = r1;
        r9 = (defpackage.adag.a) r9;
        r11 = 0;
        r12 = 0;
        r1 = 0;
        r2 = 1;
        r15 = r1;
        r16 = r30;
        r1 = r9.a(r10, r11, r12, r13, r14, r15, r16);
        r1.a();
        goto L_0x045b;
    L_0x045a:
        r2 = 1;
    L_0x045b:
        r1 = r8.u;
        r3 = r1.d;
        if (r3 == 0) goto L_0x0466;
    L_0x0461:
        r1 = r1.e;
        android.opengl.GLES20.glDisableVertexAttribArray(r1);
    L_0x0466:
        r1 = r8.p;
        r1 = r1.b();
        if (r1 == 0) goto L_0x0470;
    L_0x046e:
        r0.g = r2;
    L_0x0470:
        r1 = r8.p;
        r1 = r1.b;
        r8.H = r1;
        r8.E = r0;
        r0 = r8.a;
        r0.a();
        return;
    L_0x047e:
        r7 = r2;
        r14 = r6;
        r6 = r23;
        r11 = 1;
        r24 = 0;
        r2 = r29;
        r12 = "drawingOrder";
        defpackage.akcr.b(r1, r12);
        if (r9 != 0) goto L_0x0490;
    L_0x048e:
        r12 = 1;
        goto L_0x04b8;
    L_0x0490:
        if (r5 != 0) goto L_0x0494;
    L_0x0492:
        r12 = 0;
        goto L_0x04b8;
    L_0x0494:
        r12 = defpackage.adav.a;
        r13 = r1.ordinal();
        r12 = r12[r13];
        if (r12 == r11) goto L_0x04ab;
    L_0x049e:
        r13 = 2;
        if (r12 == r13) goto L_0x048e;
    L_0x04a1:
        r13 = 3;
        if (r12 != r13) goto L_0x04a5;
    L_0x04a4:
        goto L_0x0492;
    L_0x04a5:
        r0 = new ajxk;
        r0.<init>();
        throw r0;
    L_0x04ab:
        r12 = r5;
        r12 = (defpackage.ackn) r12;
        r13 = r9;
        r13 = (defpackage.ackn) r13;
        r12 = defpackage.acko.a(r12, r13);
        if (r12 > 0) goto L_0x0492;
    L_0x04b7:
        goto L_0x048e;
    L_0x04b8:
        if (r12 == 0) goto L_0x04ce;
    L_0x04ba:
        if (r5 == 0) goto L_0x04ce;
    L_0x04bc:
        r12 = r5.j();
        if (r12 == 0) goto L_0x04c7;
    L_0x04c2:
        r12 = r8.v;
        r12.add(r5);
    L_0x04c7:
        r23 = r6;
        r2 = r7;
        r6 = r14;
        r5 = r22;
        goto L_0x04e3;
    L_0x04ce:
        if (r9 == 0) goto L_0x04d8;
    L_0x04d0:
        r12 = r9.a;
        r12 = r12.e;
        if (r12 == 0) goto L_0x04d8;
    L_0x04d6:
        r10 = r9;
        goto L_0x04dd;
    L_0x04d8:
        r12 = r8.v;
        r12.add(r9);
    L_0x04dd:
        r23 = r6;
        r2 = r7;
        r6 = r14;
        r9 = r22;
    L_0x04e3:
        r7 = 0;
        goto L_0x0278;
    L_0x04e6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ackq.a(acmj, acup$b):void");
    }

    public final void a(boolean z) {
        this.I = z;
    }

    public final String b() {
        return "MapContentRenderer";
    }

    public final boolean c() {
        return this.I;
    }

    public final void d() {
        this.t.i = 0.5f;
    }

    public final List<acvr> e() {
        return this.a.g.b;
    }
}
