package defpackage;

import android.text.TextUtils;
import defpackage.acvm.b;
import defpackage.acvm.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: acqq */
public final class acqq {
    public final HashMap<String, acvm> a = new HashMap();
    public final aclo b;
    public String c = null;
    public String d;
    public float e = -1.0f;
    public alhq f;
    private final aclg g;
    private final adbv h;
    private final nbo i;
    private final aclw j;
    private final adap k;
    private final adbr l;
    private final acyc m;
    private final niw n;
    private final acqt o;
    private aarb p;
    private final List<acvm> q = new ArrayList();
    private final acqx r;

    /* renamed from: acqq$a */
    class a implements defpackage.acmj.a {
        private final String a;
        private final boolean b;
        private final aarb c;

        public a(String str, boolean z, aarb aarb) {
            this.a = str;
            this.b = z;
            this.c = aarb;
        }

        public final void a() {
            if (this.a.equals(acqq.this.c)) {
                acqq acqq = acqq.this;
                acqq.c = null;
                acqq.e = -1.0f;
                acqq.b.f();
            }
        }

        public final void b() {
            if (this.a.equals(acqq.this.c)) {
                if (this.b) {
                    acqq.this.c(this.a, this.c);
                }
                acqq acqq = acqq.this;
                acqq.c = null;
                acqq.e = -1.0f;
            }
        }
    }

    public acqq(aclg aclg, nbo nbo, aclw aclw, niw niw, acqt acqt) {
        this.r = new acqx(aclg.g(), new ihl());
        this.g = aclg;
        this.h = aclg.a;
        this.k = aclg.j;
        this.l = aclg.k;
        this.b = aclg.f;
        this.i = nbo;
        this.m = aclg.l;
        this.j = aclw;
        this.n = niw;
        this.o = acqt;
        this.g.j.b = new acqu(this, this.g.a);
    }

    private void a(acvm acvm) {
        if (acvm.a.equals(this.d)) {
            this.d = null;
        }
        acvm d = this.b.h.d();
        if (d != null && TextUtils.equals(d.a, acvm.a)) {
            this.b.d(acvm);
        }
    }

    public final acmi a(acmj acmj, String str) {
        cgi e = acmj.e();
        if (e == null) {
            return null;
        }
        if (acmj.i() < 14.0d) {
            b(str, aarb.MAP);
            return new acmi(e, acmj.i());
        }
        a(str, aarb.MAP);
        return null;
    }

    public final acvm a(String str, String str2, alhq alhq, boolean z) {
        acvm acvm;
        acqw acqw;
        synchronized (this) {
            acvm = (acvm) this.a.get(str2);
        }
        String str3 = null;
        acqs a = z ? this.o.a(str, this.n.b(), alhq) : null;
        if (a == null) {
            String str4;
            String str5;
            if (alhq.g != null) {
                str3 = alhq.g.b;
                str4 = alhq.g.c;
                str5 = alhq.g.d;
            } else {
                str4 = null;
                str5 = str4;
            }
            acqw = new acqw(str3, str4, str5, acwp.a(alhq));
        } else {
            acqw = a.c;
        }
        if (acvm != null) {
            float f = alhq.b;
            float f2 = alhq.c;
            long j = alhq.d;
            acvm.c = (double) f;
            acvm.d = (double) f2;
            acvm.e = j;
            acvm.k = acqw;
            acvm.b.q = acqt.a(a, this.l);
            return acvm;
        }
        b bVar = new b();
        bVar.b = (double) alhq.b;
        bVar.a = (double) alhq.c;
        bVar.e = alhq.d;
        bVar.d = new adcq(str, this.k);
        bVar.c = str2;
        bVar.h = new acqy(str, this.k);
        bVar.i = acqt.a(a, this.l);
        bVar.j = acqw;
        acvm c = bVar.c();
        this.b.a(c);
        synchronized (this) {
            this.a.put(str2, c);
        }
        return c;
    }

    public final void a() {
        this.d = null;
    }

    public final void a(acvm acvm, alhq alhq, String str, String str2) {
        acqr acqr;
        d dVar = acvm.h;
        if (dVar instanceof acqr) {
            acqr = (acqr) dVar;
        } else {
            acqr = new acqr(this.r, this.g.s.a(), this.g.g());
            acvm.h = acqr;
        }
        alhq alhq2 = this.f;
        acqr.a(alhq, alhq2 == null ? null : alhq2.e);
        acqr.a(str, str2);
    }

    public final void a(String str, aarb aarb) {
        a(str, -1.0f, aarb, true);
    }

    public final void a(String str, String str2, String str3, alhq alhq) {
        a(a(str, str, alhq, true), alhq, str2, str3);
        if (str.equals(this.d) && b(this.d, null)) {
            this.d = null;
        }
    }

    public final boolean a(String str) {
        boolean z = false;
        if (this.i.a(str) == null) {
            return false;
        }
        synchronized (this) {
            if (this.a.get(str) != null) {
                z = true;
            }
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x00e7 in {2, 10, 13, 16, 19, 23, 24, 28, 34, 36, 38, 39, 43} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final boolean a(java.lang.String r16, float r17, defpackage.aarb r18, boolean r19) {
        /*
        r15 = this;
        r1 = r15;
        r0 = r16;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = 0;
        if (r0 != 0) goto L_0x000d;
        return r5;
        monitor-enter(r15);
        r6 = r1.a;	 Catch:{ all -> 0x00e4 }
        r6 = r6.get(r0);	 Catch:{ all -> 0x00e4 }
        r6 = (defpackage.acvm) r6;	 Catch:{ all -> 0x00e4 }
        monitor-exit(r15);	 Catch:{ all -> 0x00e4 }
        r7 = r1.h;
        r7 = r7.j();
        if (r6 == 0) goto L_0x00e3;
        if (r7 != 0) goto L_0x0023;
        goto L_0x00e3;
        r8 = r1.c;
        r8 = r0.equals(r8);
        r9 = 1;
        if (r8 == 0) goto L_0x002d;
        return r9;
        r8 = r1.i;
        r8 = r8.b(r0);
        if (r8 != 0) goto L_0x0036;
        return r5;
        r5 = r8.c;
        r10 = (double) r5;
        r5 = r8.d;
        r12 = (double) r5;
        r5 = defpackage.cgo.a(r10, r12);
        r8 = r7.b();
        r10 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r11 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r11 == 0) goto L_0x004d;
        r1.e = r2;
        goto L_0x005b;
        r2 = r1.c;
        if (r2 == 0) goto L_0x0057;
        r2 = r1.e;
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 != 0) goto L_0x005b;
        r11 = r8.d;
        r2 = (float) r11;
        goto L_0x004a;
        r1.c = r0;
        r2 = r1.m;
        r11 = r1.e;
        r2 = r2.a(r11);
        r7 = r7.c();
        r11 = 0;
        r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r11 <= 0) goto L_0x00ab;
        if (r2 == 0) goto L_0x00ab;
        r2 = r2.floatValue();
        r7 = r7 * r2;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r7 * r2;
        r7 = r7 / r2;
        r11 = (double) r7;
        r2 = r1.h;
        r13 = r5.getLatitude();
        r13 = r2.a(r13);
        java.lang.Double.isNaN(r11);
        r11 = r11 * r13;
        r13 = r8.d;
        r2 = r1.e;
        r9 = (double) r2;
        java.lang.Double.isNaN(r9);
        r13 = r13 - r9;
        r9 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r9 = java.lang.Math.pow(r9, r13);
        r11 = r11 * r9;
        r9 = r5.getLatitude();
        r13 = 4682371902990188544; // 0x40fb207000000000 float:0.0 double:111111.0;
        r11 = r11 / r13;
        r9 = r9 + r11;
        r11 = r5.getLongitude();
        r5 = defpackage.cgo.a(r9, r11);
        r2 = r1.g;
        r2 = r2.d;
        r6 = r6.b;
        r2.a(r6);
        r2 = r8.a;
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x00d5;
        r2 = r1.e;
        r9 = (double) r2;
        r11 = r8.d;
        r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r2 != 0) goto L_0x00d5;
        if (r4 == 0) goto L_0x00cc;
        r0 = r1.c;
        r15.c(r0, r3);
        r0 = 0;
        r1.c = r0;
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r1.e = r0;
        r2 = 1;
        return r2;
        r2 = 1;
        r6 = r1.h;
        r7 = r1.e;
        r8 = new acqq$a;
        r8.<init>(r0, r4, r3);
        defpackage.adbu.a(r6, r5, r7, r8);
        return r2;
        return r5;
        r0 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x00e4 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqq.a(java.lang.String, float, aarb, boolean):boolean");
    }

    public final acvm b() {
        return this.b.h.d();
    }

    public final void b(String str) {
        this.p = null;
        this.d = str;
        if (b(str, null)) {
            this.d = null;
        } else {
            this.g.a.a(new acqv(this, str));
        }
    }

    public final boolean b(String str, aarb aarb) {
        return a(str, 14.0f, aarb, true);
    }

    public final acvm c() {
        acvm b = b();
        if (b != null) {
            return b;
        }
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            b = (acvm) this.a.get(str);
        }
        return b;
    }

    public final void c(String str, aarb aarb) {
        acvm acvm;
        synchronized (this) {
            acvm = (acvm) this.a.get(str);
        }
        if (acvm != null) {
            this.j.a(acvm.a, aarb);
            this.b.c(acvm);
        }
    }

    public final void d() {
        acvm b = b();
        if (this.c == null && b != null) {
            a(b);
        }
    }

    public final void e() {
        acvm b = b();
        if (b != null) {
            a(b);
        }
        if (this.c != null) {
            this.c = null;
            this.e = -1.0f;
        }
    }
}
