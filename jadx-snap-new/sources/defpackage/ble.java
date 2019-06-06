package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import defpackage.bky.a;
import defpackage.bsj.b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ble */
final class ble implements Callback, a, blr.a, bsi.a, b, bwv.a {
    private boolean A = false;
    private int B;
    private d C;
    private long D;
    private int E;
    final byw a;
    final HandlerThread b;
    private final bls[] c;
    private final blt[] d;
    private final bwv e;
    private final bww f;
    private final blj g;
    private final Handler h;
    private final blb i;
    private final bly.b j;
    private final bly.a k;
    private final long l;
    private final boolean m;
    private final bky n;
    private final c o;
    private final ArrayList<b> p;
    private final byq q;
    private final blm r;
    private blw s;
    private blo t;
    private bsj u;
    private bls[] v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    /* renamed from: ble$c */
    static final class c {
        int a;
        boolean b;
        int c;
        private blo d;

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final void a(int i) {
            this.a += i;
        }

        public final boolean a(blo blo) {
            return blo != this.d || this.a > 0 || this.b;
        }

        public final void b(int i) {
            boolean z = true;
            if (!this.b || this.c == 4) {
                this.b = true;
                this.c = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            byo.a(z);
        }

        public final void b(blo blo) {
            this.d = blo;
            this.a = 0;
            this.b = false;
        }
    }

    /* renamed from: ble$a */
    static final class a {
        public final bsj a;
        public final bly b;
        public final Object c;

        public a(bsj bsj, bly bly, Object obj) {
            this.a = bsj;
            this.b = bly;
            this.c = obj;
        }
    }

    /* renamed from: ble$b */
    static final class b implements Comparable<b> {
        public final blr a;
        public int b;
        public long c;
        public Object d;

        public b(blr blr) {
            this.a = blr;
        }

        public final void a(int i, long j, Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            if ((this.d == null ? 1 : null) != (bVar.d == null ? 1 : null)) {
                return this.d != null ? -1 : 1;
            } else {
                if (this.d == null) {
                    return 0;
                }
                int i = this.b - bVar.b;
                if (i != 0) {
                    return i;
                }
                long j = this.c;
                long j2 = bVar.c;
                return j < j2 ? -1 : j == j2 ? 0 : 1;
            }
        }
    }

    /* renamed from: ble$d */
    static final class d {
        public final bly a;
        public final int b;
        public final long c;

        public d(bly bly, int i, long j) {
            this.a = bly;
            this.b = i;
            this.c = j;
        }
    }

    public ble(bls[] blsArr, bwv bwv, bww bww, blj blj, boolean z, int i, Handler handler, blb blb, byq byq) {
        this.c = blsArr;
        this.e = bwv;
        this.f = bww;
        this.g = blj;
        this.x = z;
        this.z = i;
        this.h = handler;
        this.i = blb;
        this.q = byq;
        this.r = new blm();
        this.l = 0;
        this.m = false;
        this.s = blw.b;
        this.t = new blo(bly.a, -9223372036854775807L, bss.a, bww);
        this.o = new c();
        this.d = new blt[blsArr.length];
        for (int i2 = 0; i2 < blsArr.length; i2++) {
            blsArr[i2].a(i2);
            this.d[i2] = blsArr[i2].b();
        }
        this.n = new bky(this, byq);
        this.p = new ArrayList();
        this.v = new bls[0];
        this.j = new bly.b();
        this.k = new bly.a();
        bwv.a = this;
        this.b = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.b.start();
        this.a = byq.a(this.b.getLooper(), this);
    }

    private int a(int i, bly bly, bly bly2) {
        int c = bly.c();
        int i2 = i;
        i = -1;
        for (int i3 = 0; i3 < c && i == -1; i3++) {
            i2 = bly.a(i2, this.k, this.j, this.z, this.A);
            if (i2 == -1) {
                break;
            }
            i = bly2.a(bly.a(i2, this.k, true).a);
        }
        return i;
    }

    private long a(bsj.a aVar, long j) {
        return a(aVar, j, this.r.f != this.r.g);
    }

    private long a(bsj.a aVar, long j, boolean z) {
        d();
        this.y = false;
        a(2);
        blk blk = this.r.f;
        blk blk2 = blk;
        while (blk2 != null) {
            if (a(aVar, j, blk2)) {
                this.r.a(blk2);
                break;
            }
            blk2 = this.r.c();
        }
        if (blk != blk2 || z) {
            for (bls b : this.v) {
                b(b);
            }
            this.v = new bls[0];
            blk = null;
        }
        if (blk2 != null) {
            a(blk);
            if (blk2.f) {
                long b2 = blk2.a.b(j);
                blk2.a.a(b2, false);
                j = b2;
            }
            a(j);
            k();
        } else {
            this.r.a(true);
            a(j);
        }
        this.a.a(2);
        return j;
    }

    private Pair<Integer, Long> a(d dVar, boolean z) {
        bly bly = this.t.a;
        bly bly2 = dVar.a;
        if (bly.a()) {
            return null;
        }
        if (bly2.a()) {
            bly2 = bly;
        }
        try {
            dVar = bly2.a(this.j, this.k, dVar.b, dVar.c);
            if (bly == bly2) {
                return dVar;
            }
            int a = bly.a(bly2.a(((Integer) dVar.first).intValue(), this.k, true).a);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), dVar.second);
            }
            if (z) {
                int a2 = a(((Integer) dVar.first).intValue(), bly2, bly);
                if (a2 != -1) {
                    return a(bly, bly.a(a2, this.k, false).b);
                }
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new bli(bly, dVar.b, dVar.c);
        }
    }

    private Pair<Integer, Long> a(bly bly, int i) {
        return bly.a(this.j, this.k, i, -9223372036854775807L);
    }

    private void a(int i) {
        if (this.t.f != i) {
            this.t = this.t.a(i);
        }
    }

    private void a(int i, boolean z, int i2) {
        blk blk = this.r.f;
        bls bls = this.c[i];
        this.v[i2] = bls;
        if (bls.i_() == 0) {
            blu blu = blk.j.b[i];
            blg[] a = ble.a(blk.j.c.b[i]);
            Object obj = (this.x && this.t.f == 3) ? 1 : null;
            boolean z2 = (z || obj == null) ? false : true;
            bls.a(blu, a, blk.c[i], this.D, z2, blk.d);
            this.n.a(bls);
            if (obj != null) {
                bls.j_();
            }
        }
    }

    private void a(long j) {
        if (this.r.b()) {
            j += this.r.f.d;
        }
        this.D = j;
        this.n.a(this.D);
        for (bls a : this.v) {
            a.a(this.D);
        }
    }

    private void a(long j, long j2) {
        this.a.b();
        this.a.a(j + j2);
    }

    private void a(blk blk) {
        blk blk2 = this.r.f;
        if (blk2 != null && blk != blk2) {
            boolean[] zArr = new boolean[this.c.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                bls[] blsArr = this.c;
                if (i < blsArr.length) {
                    bls bls = blsArr[i];
                    zArr[i] = bls.i_() != 0;
                    if (blk2.j.a(i)) {
                        i2++;
                    }
                    if (zArr[i] && (!blk2.j.a(i) || (bls.i() && bls.f() == blk.c[i]))) {
                        b(bls);
                    }
                    i++;
                } else {
                    this.t = this.t.a(blk2.i, blk2.j);
                    a(zArr, i2);
                    return;
                }
            }
        }
    }

    private static void a(bls bls) {
        if (bls.i_() == 2) {
            bls.k();
        }
    }

    private void a(bww bww) {
        this.g.a(this.c, bww.c);
    }

    private void a(boolean z, boolean z2) {
        a(true, z, z);
        this.o.a(this.B + z2);
        this.B = 0;
        this.g.b();
        a(1);
    }

    private void a(boolean z, boolean z2, boolean z3) {
        this.a.b();
        this.y = false;
        this.n.b();
        this.D = 0;
        for (bls b : this.v) {
            try {
                b(b);
            } catch (bla | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.v = new bls[0];
        this.r.a(z2 ^ 1);
        b(false);
        if (z2) {
            this.C = null;
        }
        if (z3) {
            this.r.c = bly.a;
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a.a(false);
            }
            this.p.clear();
            this.E = 0;
        }
        bly bly = z3 ? bly.a : this.t.a;
        Object obj = z3 ? null : this.t.b;
        bsj.a aVar = z2 ? new bsj.a(g()) : this.t.c;
        long j = -9223372036854775807L;
        long j2 = z2 ? -9223372036854775807L : this.t.j;
        if (!z2) {
            j = this.t.e;
        }
        this.t = new blo(bly, obj, aVar, j2, j, this.t.f, false, z3 ? bss.a : this.t.h, z3 ? this.f : this.t.i);
        if (z) {
            bsj bsj = this.u;
            if (bsj != null) {
                bsj.a(this);
                this.u = null;
            }
        }
    }

    private void a(boolean[] zArr, int i) {
        this.v = new bls[i];
        blk blk = this.r.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.length; i3++) {
            if (blk.j.a(i3)) {
                int i4 = i2 + 1;
                a(i3, zArr[i3], i2);
                i2 = i4;
            }
        }
    }

    private boolean a(b bVar) {
        if (bVar.d == null) {
            Pair a = a(new d(bVar.a.b, bVar.a.f, bkw.b(bVar.a.g)), false);
            if (a == null) {
                return false;
            }
            bVar.a(((Integer) a.first).intValue(), ((Long) a.second).longValue(), this.t.a.a(((Integer) a.first).intValue(), this.k, true).a);
        } else {
            int a2 = this.t.a.a(bVar.d);
            if (a2 == -1) {
                return false;
            }
            bVar.b = a2;
        }
        return true;
    }

    private boolean a(bsj.a aVar, long j, blk blk) {
        if (aVar.equals(blk.g.a) && blk.e) {
            this.t.a.a(blk.g.a.a, this.k, false);
            int b = this.k.b(j);
            if (b == -1 || this.k.a(b) == blk.g.c) {
                return true;
            }
        }
        return false;
    }

    private static blg[] a(bwt bwt) {
        int e = bwt != null ? bwt.e() : 0;
        blg[] blgArr = new blg[e];
        for (int i = 0; i < e; i++) {
            blgArr[i] = bwt.a(i);
        }
        return blgArr;
    }

    private void b() {
        if (this.o.a(this.t)) {
            this.h.obtainMessage(0, this.o.a, this.o.b ? this.o.c : -1, this.t).sendToTarget();
            this.o.b(this.t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Missing block: B:23:0x005b, code skipped:
            if (r6.E < r6.p.size()) goto L_0x005d;
     */
    /* JADX WARNING: Missing block: B:24:0x005d, code skipped:
            r1 = (defpackage.ble.b) r6.p.get(r6.E);
     */
    /* JADX WARNING: Missing block: B:25:0x0068, code skipped:
            r1 = null;
     */
    /* JADX WARNING: Missing block: B:26:0x0069, code skipped:
            if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:28:0x006d, code skipped:
            if (r1.d == null) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:30:0x0071, code skipped:
            if (r1.b < r0) goto L_0x007d;
     */
    /* JADX WARNING: Missing block: B:32:0x0075, code skipped:
            if (r1.b != r0) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:34:0x007b, code skipped:
            if (r1.c > r7) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:35:0x007d, code skipped:
            r6.E++;
     */
    /* JADX WARNING: Missing block: B:36:0x008b, code skipped:
            if (r6.E >= r6.p.size()) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:37:0x008e, code skipped:
            if (r1 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:39:0x0092, code skipped:
            if (r1.d == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:41:0x0096, code skipped:
            if (r1.b != r0) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:43:0x009c, code skipped:
            if (r1.c <= r7) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:45:0x00a2, code skipped:
            if (r1.c > r9) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:46:0x00a4, code skipped:
            c(r1.a);
     */
    /* JADX WARNING: Missing block: B:47:0x00ad, code skipped:
            if (r1.a.h == false) goto L_0x00b7;
     */
    /* JADX WARNING: Missing block: B:48:0x00af, code skipped:
            r6.p.remove(r6.E);
     */
    /* JADX WARNING: Missing block: B:49:0x00b7, code skipped:
            r6.E++;
     */
    /* JADX WARNING: Missing block: B:51:0x00c5, code skipped:
            if (r6.E >= r6.p.size()) goto L_0x00d2;
     */
    /* JADX WARNING: Missing block: B:52:0x00c7, code skipped:
            r1 = (defpackage.ble.b) r6.p.get(r6.E);
     */
    /* JADX WARNING: Missing block: B:53:0x00d2, code skipped:
            r1 = null;
     */
    /* JADX WARNING: Missing block: B:64:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:65:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:66:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:67:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:68:?, code skipped:
            return;
     */
    private void b(long r7, long r9) {
        /*
        r6 = this;
        r0 = r6.p;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00d4;
    L_0x0008:
        r0 = r6.t;
        r0 = r0.c;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0014;
    L_0x0012:
        goto L_0x00d4;
    L_0x0014:
        r0 = r6.t;
        r0 = r0.d;
        r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r2 != 0) goto L_0x001f;
    L_0x001c:
        r0 = 1;
        r7 = r7 - r0;
    L_0x001f:
        r0 = r6.t;
        r0 = r0.c;
        r0 = r0.a;
        r1 = r6.E;
        r2 = 0;
        if (r1 <= 0) goto L_0x0035;
    L_0x002a:
        r3 = r6.p;
    L_0x002c:
        r1 = r1 + -1;
        r1 = r3.get(r1);
        r1 = (defpackage.ble.b) r1;
        goto L_0x0036;
    L_0x0035:
        r1 = r2;
    L_0x0036:
        if (r1 == 0) goto L_0x0053;
    L_0x0038:
        r3 = r1.b;
        if (r3 > r0) goto L_0x0046;
    L_0x003c:
        r3 = r1.b;
        if (r3 != r0) goto L_0x0053;
    L_0x0040:
        r3 = r1.c;
        r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r1 <= 0) goto L_0x0053;
    L_0x0046:
        r1 = r6.E;
        r1 = r1 + -1;
        r6.E = r1;
        r1 = r6.E;
        if (r1 <= 0) goto L_0x0035;
    L_0x0050:
        r3 = r6.p;
        goto L_0x002c;
    L_0x0053:
        r1 = r6.E;
        r3 = r6.p;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x0068;
    L_0x005d:
        r1 = r6.p;
        r3 = r6.E;
        r1 = r1.get(r3);
        r1 = (defpackage.ble.b) r1;
        goto L_0x0069;
    L_0x0068:
        r1 = r2;
    L_0x0069:
        if (r1 == 0) goto L_0x008e;
    L_0x006b:
        r3 = r1.d;
        if (r3 == 0) goto L_0x008e;
    L_0x006f:
        r3 = r1.b;
        if (r3 < r0) goto L_0x007d;
    L_0x0073:
        r3 = r1.b;
        if (r3 != r0) goto L_0x008e;
    L_0x0077:
        r3 = r1.c;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 > 0) goto L_0x008e;
    L_0x007d:
        r1 = r6.E;
        r1 = r1 + 1;
        r6.E = r1;
        r1 = r6.E;
        r3 = r6.p;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x0068;
    L_0x008d:
        goto L_0x005d;
    L_0x008e:
        if (r1 == 0) goto L_0x00d4;
    L_0x0090:
        r3 = r1.d;
        if (r3 == 0) goto L_0x00d4;
    L_0x0094:
        r3 = r1.b;
        if (r3 != r0) goto L_0x00d4;
    L_0x0098:
        r3 = r1.c;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 <= 0) goto L_0x00d4;
    L_0x009e:
        r3 = r1.c;
        r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r5 > 0) goto L_0x00d4;
    L_0x00a4:
        r3 = r1.a;
        r6.c(r3);
        r1 = r1.a;
        r1 = r1.h;
        if (r1 == 0) goto L_0x00b7;
    L_0x00af:
        r1 = r6.p;
        r3 = r6.E;
        r1.remove(r3);
        goto L_0x00bd;
    L_0x00b7:
        r1 = r6.E;
        r1 = r1 + 1;
        r6.E = r1;
    L_0x00bd:
        r1 = r6.E;
        r3 = r6.p;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x00d2;
    L_0x00c7:
        r1 = r6.p;
        r3 = r6.E;
        r1 = r1.get(r3);
        r1 = (defpackage.ble.b) r1;
        goto L_0x008e;
    L_0x00d2:
        r1 = r2;
        goto L_0x008e;
    L_0x00d4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ble.b(long, long):void");
    }

    static void b(blr blr) {
        try {
            blr.a.a(blr.c, blr.d);
        } finally {
            blr.a(true);
        }
    }

    private void b(bls bls) {
        this.n.b(bls);
        ble.a(bls);
        bls.l();
    }

    private void b(boolean z) {
        if (this.t.g != z) {
            this.t = this.t.a(z);
        }
    }

    private void c() {
        int i = 0;
        this.y = false;
        this.n.a();
        bls[] blsArr = this.v;
        int length = blsArr.length;
        while (i < length) {
            blsArr[i].j_();
            i++;
        }
    }

    private void c(blr blr) {
        if (blr.e.getLooper() == this.a.a()) {
            ble.b(blr);
            if (this.t.f == 3 || this.t.f == 2) {
                this.a.a(2);
                return;
            }
        }
        this.a.a(15, (Object) blr).sendToTarget();
    }

    private void c(boolean z) {
        bsj.a aVar = this.r.f.g.a;
        long a = a(aVar, this.t.j, true);
        if (a != this.t.j) {
            blo blo = this.t;
            this.t = blo.a(aVar, a, blo.e);
            if (z) {
                this.o.b(4);
            }
        }
    }

    private void d() {
        this.n.b();
        for (bls a : this.v) {
            ble.a(a);
        }
    }

    private void e() {
        if (this.r.b()) {
            blk blk = this.r.f;
            long c = blk.a.c();
            if (c != -9223372036854775807L) {
                a(c);
                if (c != this.t.j) {
                    blo blo = this.t;
                    this.t = blo.a(blo.c, c, this.t.e);
                    this.o.b(4);
                }
            } else {
                this.D = this.n.c();
                long j = this.D - blk.d;
                b(this.t.j, j);
                this.t.j = j;
            }
            this.t.k = this.v.length == 0 ? blk.g.e : blk.a(true);
        }
    }

    private void f() {
        a(true, true, true);
        this.g.c();
        a(1);
        this.b.quit();
        synchronized (this) {
            this.w = true;
            notifyAll();
        }
    }

    private int g() {
        bly bly = this.t.a;
        return bly.a() ? 0 : bly.a(bly.b(this.A), this.j).b;
    }

    private boolean h() {
        blk blk = this.r.f;
        long j = blk.g.e;
        return j == -9223372036854775807L || this.t.j < j || (blk.h != null && (blk.h.e || blk.h.g.a.a()));
    }

    private void i() {
        blk blk = this.r.h;
        blk blk2 = this.r.g;
        if (!(blk == null || blk.e || (blk2 != null && blk2.h != blk))) {
            bls[] blsArr = this.v;
            int length = blsArr.length;
            int i = 0;
            while (i < length) {
                if (blsArr[i].g()) {
                    i++;
                } else {
                    return;
                }
            }
            blk.a.l_();
        }
    }

    private void j() {
        a(4);
        a(false, true, false);
    }

    private void k() {
        blk blk = this.r.h;
        long b = blk.b();
        if (b == Long.MIN_VALUE) {
            b(false);
            return;
        }
        boolean a = this.g.a(b - (this.D - blk.d), this.n.e().b);
        b(a);
        if (a) {
            blk.b(this.D);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0026 in {5, 12, 13, 17, 19, 22} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized void a() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.w;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x0007;
        monitor-exit(r2);
        return;
        r0 = r2.a;	 Catch:{ all -> 0x0023 }
        r1 = 7;	 Catch:{ all -> 0x0023 }
        r0.a(r1);	 Catch:{ all -> 0x0023 }
        r0 = 0;	 Catch:{ all -> 0x0023 }
        r1 = r2.w;	 Catch:{ all -> 0x0023 }
        if (r1 != 0) goto L_0x0018;
        r2.wait();	 Catch:{ InterruptedException -> 0x0016 }
        goto L_0x000e;
        r0 = 1;
        goto L_0x000e;
        if (r0 == 0) goto L_0x0021;
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0023 }
        r0.interrupt();	 Catch:{ all -> 0x0023 }
        monitor-exit(r2);
        return;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ble.a():void");
    }

    public final void a(blp blp) {
        this.h.obtainMessage(1, blp).sendToTarget();
        float f = blp.b;
        for (blk a = this.r.a(); a != null; a = a.h) {
            if (a.j != null) {
                for (bwt bwt : a.j.c.a()) {
                    if (bwt != null) {
                        bwt.a(f);
                    }
                }
            }
        }
    }

    public final synchronized void a(blr blr) {
        if (this.w) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            blr.a(false);
            return;
        }
        this.a.a(14, (Object) blr).sendToTarget();
    }

    public final void a(bsi bsi) {
        this.a.a(9, (Object) bsi).sendToTarget();
    }

    public final void a(bsj bsj, bly bly, Object obj) {
        this.a.a(8, new a(bsj, bly, obj)).sendToTarget();
    }

    public final void a(bsj bsj, boolean z, boolean z2) {
        this.a.a(z, z2, bsj).sendToTarget();
    }

    public final void a(boolean z) {
        this.a.a(6, (int) z).sendToTarget();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:267:0x05f0=Splitter:B:267:0x05f0, B:511:0x09f2=Splitter:B:511:0x09f2} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:267:0x05f0=Splitter:B:267:0x05f0, B:511:0x09f2=Splitter:B:511:0x09f2, B:242:0x0594=Splitter:B:242:0x0594, B:278:0x0607=Splitter:B:278:0x0607} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:267:0x05f0=Splitter:B:267:0x05f0, B:511:0x09f2=Splitter:B:511:0x09f2, B:242:0x0594=Splitter:B:242:0x0594, B:278:0x0607=Splitter:B:278:0x0607} */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x072c A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x067f A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x070f A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x072c A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x08d5 A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x098e A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x098e A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x09a0 A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x09b9 A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0611 A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0611 A:{Catch:{ all -> 0x0615, bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }} */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0a6a A:{ExcHandler: IOException (r0_13 'e' java.lang.Throwable), Splitter:B:1:0x0009} */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x0a42 A:{ExcHandler: IOException (r0_9 'e' java.lang.Throwable), PHI: r34 , Splitter:B:91:0x023d} */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0a3e A:{ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r34 , Splitter:B:91:0x023d} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0501 A:{ExcHandler: bla (r0_4 'e' java.lang.Throwable), Splitter:B:7:0x0017} */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0a6a A:{ExcHandler: IOException (r0_13 'e' java.lang.Throwable), Splitter:B:1:0x0009} */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0a4f A:{ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:1:0x0009} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:91:0x023d, B:242:0x0594] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:91:0x023d, B:267:0x05f0] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:27:0x0078, code skipped:
            if (r8.d() == false) goto L_0x007a;
     */
    /* JADX WARNING: Missing block: B:28:0x007a, code skipped:
            c(true);
     */
    /* JADX WARNING: Missing block: B:76:0x017f, code skipped:
            r34 = r3;
     */
    /* JADX WARNING: Missing block: B:80:0x0196, code skipped:
            k();
     */
    /* JADX WARNING: Missing block: B:208:0x04ef, code skipped:
            if (r3.a(r2) != false) goto L_0x04f1;
     */
    /* JADX WARNING: Missing block: B:215:0x04fc, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:216:0x04fd, code skipped:
            r34 = r3;
     */
    /* JADX WARNING: Missing block: B:217:0x0501, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:218:0x0502, code skipped:
            r4 = r0;
            r5 = r3;
     */
    /* JADX WARNING: Missing block: B:282:0x0615, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:283:0x0616, code skipped:
            r2 = r0;
            r1.t = r1.t.a(r4, r12, r7);
     */
    /* JADX WARNING: Missing block: B:284:0x0627, code skipped:
            if (r9 != 0) goto L_0x0629;
     */
    /* JADX WARNING: Missing block: B:285:0x0629, code skipped:
            r1.o.b(2);
     */
    /* JADX WARNING: Missing block: B:479:0x097c, code skipped:
            if (r15 == null) goto L_0x097e;
     */
    /* JADX WARNING: Missing block: B:513:0x09f6, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:514:0x09f7, code skipped:
            r4 = r0;
            r5 = r34;
            r2 = false;
     */
    /* JADX WARNING: Missing block: B:532:0x0a3a, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:533:0x0a3e, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:534:0x0a3f, code skipped:
            r3 = r0;
            r2 = false;
     */
    /* JADX WARNING: Missing block: B:535:0x0a42, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:536:0x0a43, code skipped:
            r3 = r0;
            r5 = r34;
            r2 = false;
     */
    /* JADX WARNING: Missing block: B:537:0x0a48, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:538:0x0a49, code skipped:
            r4 = r0;
            r5 = r34;
     */
    /* JADX WARNING: Missing block: B:539:0x0a4c, code skipped:
            r2 = false;
     */
    /* JADX WARNING: Missing block: B:540:0x0a4d, code skipped:
            r3 = 2;
     */
    /* JADX WARNING: Missing block: B:541:0x0a4f, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:542:0x0a50, code skipped:
            r34 = r3;
            r2 = false;
     */
    /* JADX WARNING: Missing block: B:545:0x0a6a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:546:0x0a6b, code skipped:
            r5 = r3;
            r2 = false;
            r3 = r0;
     */
    /* JADX WARNING: Missing block: B:548:0x0a84, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:549:0x0a85, code skipped:
            r5 = r3;
            r2 = false;
            r3 = 2;
            r4 = r0;
     */
    /* JADX WARNING: Missing block: B:550:0x0a89, code skipped:
            android.util.Log.e(r5, "Playback error.", r4);
            a(r2, r2);
            r2 = r1.h.obtainMessage(r3, r4);
     */
    public final boolean handleMessage(android.os.Message r37) {
        /*
        r36 = this;
        r1 = r36;
        r2 = r37;
        r3 = "ExoPlayerImplInternal";
        r5 = 2;
        r6 = 0;
        r7 = 1;
        r8 = r2.what;	 Catch:{ bla -> 0x0a84, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = 0;
        r11 = 4;
        r14 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        switch(r8) {
            case 0: goto L_0x0a07;
            case 1: goto L_0x09ce;
            case 2: goto L_0x0630;
            case 3: goto L_0x0533;
            case 4: goto L_0x0526;
            case 5: goto L_0x051c;
            case 6: goto L_0x050d;
            case 7: goto L_0x0506;
            case 8: goto L_0x0214;
            case 9: goto L_0x019a;
            case 10: goto L_0x0183;
            case 11: goto L_0x008e;
            case 12: goto L_0x007f;
            case 13: goto L_0x0067;
            case 14: goto L_0x0027;
            case 15: goto L_0x0017;
            default: goto L_0x0015;
        };
    L_0x0015:
        r2 = 0;
        return r2;
    L_0x0017:
        r2 = r2.obj;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = (defpackage.blr) r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r2.e;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = new ble$1;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9.<init>(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8.post(r9);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x017f;
    L_0x0027:
        r2 = r2.obj;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = (defpackage.blr) r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r2.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r10 != 0) goto L_0x0036;
    L_0x0031:
        r1.c(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x017f;
    L_0x0036:
        r8 = r1.u;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r8 == 0) goto L_0x005b;
    L_0x003a:
        r8 = r1.B;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r8 <= 0) goto L_0x003f;
    L_0x003e:
        goto L_0x005b;
    L_0x003f:
        r8 = new ble$b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8.<init>(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r1.a(r8);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r9 == 0) goto L_0x0056;
    L_0x004a:
        r2 = r1.p;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2.add(r8);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r1.p;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        java.util.Collections.sort(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x017f;
    L_0x0056:
        r2.a(r6);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x017f;
    L_0x005b:
        r8 = r1.p;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = new ble$b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9.<init>(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8.add(r9);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x017f;
    L_0x0067:
        r2 = r2.arg1;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 == 0) goto L_0x006d;
    L_0x006b:
        r2 = 1;
        goto L_0x006e;
    L_0x006d:
        r2 = 0;
    L_0x006e:
        r1.A = r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8.e = r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r8.d();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 != 0) goto L_0x017f;
    L_0x007a:
        r1.c(r7);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x017f;
    L_0x007f:
        r2 = r2.arg1;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.z = r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8.d = r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r8.d();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 != 0) goto L_0x017f;
    L_0x008d:
        goto L_0x007a;
    L_0x008e:
        r2 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.b();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 == 0) goto L_0x017f;
    L_0x0096:
        r2 = r1.n;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.e();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r8.f;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r9.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = 1;
    L_0x00a7:
        if (r8 == 0) goto L_0x017f;
    L_0x00a9:
        r12 = r8.e;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r12 != 0) goto L_0x00af;
    L_0x00ad:
        goto L_0x017f;
    L_0x00af:
        r12 = r8.a(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r12 != 0) goto L_0x00bb;
    L_0x00b5:
        if (r8 != r9) goto L_0x00b8;
    L_0x00b7:
        r10 = 0;
    L_0x00b8:
        r8 = r8.h;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x00a7;
    L_0x00bb:
        if (r10 == 0) goto L_0x0150;
    L_0x00bd:
        r2 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.f;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r8.a(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r1.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r9.length;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = new boolean[r9];	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r12 = r10.j;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r12 = r2.a(r12, r8, r9);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r2.j;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.a(r8);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r8.f;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r8 == r11) goto L_0x0103;
    L_0x00df:
        r8 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r14 = r8.j;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r8 == 0) goto L_0x0103;
    L_0x00e7:
        r14 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r15 = r8.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r8.e;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r16 = r12;
        r18 = r6;
        r6 = r14.a(r15, r16, r18);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.t = r6;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r1.o;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6.b(r11);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.a(r12);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
    L_0x0103:
        r6 = r1.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r6.length;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = new boolean[r6];	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r7 = 0;
        r8 = 0;
    L_0x010a:
        r10 = r1.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = r10.length;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r7 >= r10) goto L_0x0140;
    L_0x010f:
        r10 = r1.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = r10[r7];	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r12 = r10.i_();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r12 == 0) goto L_0x011b;
    L_0x0119:
        r12 = 1;
        goto L_0x011c;
    L_0x011b:
        r12 = 0;
    L_0x011c:
        r6[r7] = r12;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r12 = r2.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r12 = r12[r7];	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r12 == 0) goto L_0x0126;
    L_0x0124:
        r8 = r8 + 1;
    L_0x0126:
        r13 = r6[r7];	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r13 == 0) goto L_0x013d;
    L_0x012a:
        r13 = r10.f();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r12 == r13) goto L_0x0134;
    L_0x0130:
        r1.b(r10);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x013d;
    L_0x0134:
        r12 = r9[r7];	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r12 == 0) goto L_0x013d;
    L_0x0138:
        r12 = r1.D;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10.a(r12);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
    L_0x013d:
        r7 = r7 + 1;
        goto L_0x010a;
    L_0x0140:
        r7 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r2.i;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.j;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r7.a(r9, r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.t = r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.a(r6, r8);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x016e;
    L_0x0150:
        r2 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2.a(r8);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r8.e;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 == 0) goto L_0x016e;
    L_0x0159:
        r2 = r8.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r2.b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r1.D;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r12 = r8.d;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r9 = r9 - r12;
        r6 = java.lang.Math.max(r6, r9);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8.c(r6);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r8.j;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.a(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
    L_0x016e:
        r2 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.f;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 == r11) goto L_0x017f;
    L_0x0174:
        r36.k();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r36.e();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r1.a;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2.a(r5);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
    L_0x017f:
        r34 = r3;
        goto L_0x0a3a;
    L_0x0183:
        r2 = r2.obj;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = (defpackage.bsi) r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r6.a(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 == 0) goto L_0x017f;
    L_0x018f:
        r2 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r1.D;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2.a(r6);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
    L_0x0196:
        r36.k();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x017f;
    L_0x019a:
        r2 = r2.obj;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = (defpackage.bsi) r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r6.a(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 == 0) goto L_0x017f;
    L_0x01a6:
        r2 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.h;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r1.n;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r6.e();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r6.b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r7 = 1;
        r2.e = r7;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r7 = r2.a;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r7 = r7.b();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2.i = r7;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2.a(r6);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r2.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r6.b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r22 = r2.c(r6);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r2.d;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r2.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = r8.b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = r10 - r22;
        r6 = r6 + r10;
        r2.d = r6;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r2.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r7 = new bll;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r8 = r6.a;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r10 = r6.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r12 = r6.d;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r14 = r6.e;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r5 = r6.f;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r6 = r6.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r20 = r7;
        r21 = r8;
        r24 = r10;
        r26 = r12;
        r28 = r14;
        r30 = r5;
        r31 = r6;
        r20.<init>(r21, r22, r24, r26, r28, r30, r31);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2.g = r7;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.j;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.a(r2);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.b();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        if (r2 != 0) goto L_0x0196;
    L_0x0203:
        r2 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.c();	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r2 = r2.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r5 = r2.b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.a(r5);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        r1.a(r9);	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x0a4f }
        goto L_0x0196;
    L_0x0214:
        r2 = r2.obj;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r2 = (defpackage.ble.a) r2;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r5 = r2.a;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r6 = r1.u;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        if (r5 != r6) goto L_0x017f;
    L_0x021e:
        r5 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r5 = r5.a;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r6 = r2.b;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r2 = r2.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r7 = r1.r;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r7.c = r6;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r7 = r1.t;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r8 = new blo;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r10 = r7.c;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r12 = r7.d;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r11 = r5;
        r4 = r7.e;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r14 = r7.f;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r15 = r7.g;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r9 = r7.h;	 Catch:{ bla -> 0x0501, IOException -> 0x0a6a, RuntimeException -> 0x04fc }
        r34 = r3;
        r3 = r7.i;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r20 = r8;
        r21 = r6;
        r22 = r2;
        r23 = r10;
        r24 = r12;
        r26 = r4;
        r28 = r14;
        r29 = r15;
        r30 = r9;
        r31 = r3;
        r20.<init>(r21, r22, r23, r24, r26, r28, r29, r30, r31);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        defpackage.blo.a(r7, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.t = r8;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.p;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.size();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 1;
        r2 = r2 - r3;
    L_0x0263:
        if (r2 < 0) goto L_0x0289;
    L_0x0265:
        r3 = r1.p;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r3.get(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = (defpackage.ble.b) r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.a(r3);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r3 != 0) goto L_0x0286;
    L_0x0273:
        r3 = r1.p;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r3.get(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = (defpackage.ble.b) r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r3.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = 0;
        r3.a(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.p;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3.remove(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x0286:
        r2 = r2 + -1;
        goto L_0x0263;
    L_0x0289:
        r2 = r1.p;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        java.util.Collections.sort(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.B;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 <= 0) goto L_0x032f;
    L_0x0292:
        r2 = r1.o;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.B;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2.a(r3);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = 0;
        r1.B = r2;	 Catch:{ bla -> 0x0329, IOException -> 0x0323, RuntimeException -> 0x0320 }
        r2 = r1.C;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x02db;
    L_0x02a0:
        r2 = r1.C;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 1;
        r2 = r1.a(r2, r3);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 0;
        r1.C = r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 != 0) goto L_0x02b1;
    L_0x02ac:
        r36.j();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x02b1:
        r3 = r2.first;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = (java.lang.Integer) r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r3.intValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.second;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = (java.lang.Long) r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r2.longValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r2.a(r3, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r5.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x02d2;
    L_0x02cf:
        r6 = 0;
        goto L_0x02d3;
    L_0x02d2:
        r6 = r8;
    L_0x02d3:
        r2 = r4.a(r5, r6, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x02d7:
        r1.t = r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x02db:
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r7 != 0) goto L_0x0a3a;
    L_0x02e8:
        r2 = r6.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x02ef;
    L_0x02ee:
        goto L_0x02ac;
    L_0x02ef:
        r2 = r1.A;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r6.b(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.a(r6, r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r2.first;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = (java.lang.Integer) r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r3.intValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.second;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = (java.lang.Long) r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r2.longValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r2.a(r3, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r5.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x031a;
    L_0x0317:
        r6 = 0;
        goto L_0x031b;
    L_0x031a:
        r6 = r8;
    L_0x031b:
        r2 = r4.a(r5, r6, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x02d7;
    L_0x0320:
        r0 = move-exception;
        goto L_0x0a53;
    L_0x0323:
        r0 = move-exception;
        r3 = r0;
        r5 = r34;
        goto L_0x0a6e;
    L_0x0329:
        r0 = move-exception;
        r4 = r0;
        r5 = r34;
        goto L_0x0a4d;
    L_0x032f:
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r3.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r11.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x0362;
    L_0x033f:
        r5 = r6.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 != 0) goto L_0x0a3a;
    L_0x0345:
        r5 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r21 = r5.a(r2, r3);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r21.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x0356;
    L_0x0353:
        r22 = 0;
        goto L_0x0358;
    L_0x0356:
        r22 = r3;
    L_0x0358:
        r20 = r2;
        r24 = r3;
        r2 = r20.a(r21, r22, r24);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x02d7;
    L_0x0362:
        r5 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 != 0) goto L_0x0374;
    L_0x036a:
        r7 = r1.k;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = 1;
        r7 = r11.a(r2, r7, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r7.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0376;
    L_0x0374:
        r7 = r5.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x0376:
        r7 = r6.a(r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = -1;
        if (r7 != r8) goto L_0x03f1;
    L_0x037d:
        r2 = r1.a(r2, r11, r6);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 != r8) goto L_0x0385;
    L_0x0383:
        goto L_0x02ac;
    L_0x0385:
        r3 = r1.k;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = 0;
        r2 = r6.a(r2, r3, r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.a(r6, r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r2.first;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = (java.lang.Integer) r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r3.intValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.second;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = (java.lang.Long) r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r11 = r2.longValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r2.a(r3, r11);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.k;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = 1;
        r6.a(r3, r2, r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x03db;
    L_0x03b0:
        r2 = r1.k;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x03d8;
    L_0x03bb:
        r4 = r5.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x03db;
    L_0x03bf:
        r5 = r5.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r5.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.equals(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x03d2;
    L_0x03c9:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.a(r6, r3);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x03d8;
    L_0x03d2:
        r4 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x03d8:
        r5.g = r4;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x03bb;
    L_0x03db:
        r2 = r8.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x03e4;
    L_0x03e1:
        r2 = 0;
        goto L_0x03e5;
    L_0x03e4:
        r2 = r11;
    L_0x03e5:
        r9 = r1.a(r8, r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r7.a(r8, r9, r11);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x02d7;
    L_0x03f1:
        if (r7 == r2) goto L_0x042a;
    L_0x03f3:
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = new blo;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r2.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r2.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r2.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r23 = r9.a(r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r2.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r11 = r2.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r13 = r2.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r2.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r15 = r2.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r32 = r3;
        r3 = r2.i;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r20 = r5;
        r21 = r6;
        r22 = r8;
        r24 = r9;
        r26 = r11;
        r28 = r13;
        r29 = r14;
        r30 = r15;
        r31 = r3;
        r20.<init>(r21, r22, r23, r24, r26, r28, r29, r30, r31);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        defpackage.blo.a(r2, r5);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.t = r5;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x042c;
    L_0x042a:
        r32 = r3;
    L_0x042c:
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r2.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r3 == 0) goto L_0x0460;
    L_0x0436:
        r3 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r32;
        r3 = r3.a(r7, r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r3.equals(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 != 0) goto L_0x0460;
    L_0x0444:
        r2 = r3.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x044d;
    L_0x044a:
        r6 = 0;
        goto L_0x044e;
    L_0x044d:
        r6 = r4;
    L_0x044e:
        r22 = r1.a(r3, r6);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r20 = r2;
        r21 = r3;
        r24 = r4;
        r2 = r20.a(r21, r22, r24);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x02d7;
    L_0x0460:
        r3 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.D;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r3.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r11 = r2;
        r9 = r6;
        r2 = 0;
    L_0x046d:
        if (r9 == 0) goto L_0x04f3;
    L_0x046f:
        if (r2 != 0) goto L_0x047a;
    L_0x0471:
        r2 = r9.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r3.a(r2, r11);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9.g = r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x04ce;
    L_0x047a:
        r6 = -1;
        if (r11 == r6) goto L_0x04eb;
    L_0x047d:
        r6 = r9.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r3.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r3.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r10 = 1;
        r7 = r7.a(r11, r8, r10);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r7.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.equals(r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 != 0) goto L_0x0491;
    L_0x0490:
        goto L_0x04eb;
    L_0x0491:
        r6 = r3.a(r2, r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 != 0) goto L_0x049e;
    L_0x0497:
        r2 = r3.a(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x04f3;
    L_0x049d:
        goto L_0x04f1;
    L_0x049e:
        r7 = r9.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r3.a(r7, r11);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9.g = r7;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r9.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r7.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r6.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r8 != 0) goto L_0x04c4;
    L_0x04b0:
        r12 = r7.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r6.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r8 != 0) goto L_0x04c4;
    L_0x04b8:
        r7 = r7.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r7.equals(r6);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 == 0) goto L_0x04c4;
    L_0x04c2:
        r6 = 1;
        goto L_0x04c5;
    L_0x04c4:
        r6 = 0;
    L_0x04c5:
        if (r6 != 0) goto L_0x04ce;
    L_0x04c7:
        r2 = r3.a(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x04f3;
    L_0x04cd:
        goto L_0x04f1;
    L_0x04ce:
        r2 = r9.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x04e3;
    L_0x04d4:
        r10 = r3.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r3.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r13 = r3.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r3.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r15 = r3.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r10.a(r11, r12, r13, r14, r15);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r11 = r2;
    L_0x04e3:
        r2 = r9.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r35 = r9;
        r9 = r2;
        r2 = r35;
        goto L_0x046d;
    L_0x04eb:
        r2 = r3.a(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x04f3;
    L_0x04f1:
        r2 = 0;
        goto L_0x04f4;
    L_0x04f3:
        r2 = 1;
    L_0x04f4:
        if (r2 != 0) goto L_0x0a3a;
    L_0x04f6:
        r2 = 0;
        r1.c(r2);	 Catch:{ bla -> 0x0329, IOException -> 0x0323, RuntimeException -> 0x0320 }
        goto L_0x0a3a;
    L_0x04fc:
        r0 = move-exception;
        r34 = r3;
        goto L_0x0a3f;
    L_0x0501:
        r0 = move-exception;
        r4 = r0;
        r5 = r3;
        goto L_0x0a4c;
    L_0x0506:
        r34 = r3;
        r36.f();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = 1;
        return r2;
    L_0x050d:
        r34 = r3;
        r2 = r2.arg1;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x0515;
    L_0x0513:
        r2 = 1;
        goto L_0x0516;
    L_0x0515:
        r2 = 0;
    L_0x0516:
        r3 = 1;
        r1.a(r2, r3);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x051c:
        r34 = r3;
        r2 = r2.obj;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = (defpackage.blw) r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.s = r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x0526:
        r34 = r3;
        r2 = r2.obj;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = (defpackage.blp) r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.n;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3.a(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x0533:
        r34 = r3;
        r2 = r2.obj;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = (defpackage.ble.d) r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.o;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = 1;
        r3.a(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.a(r2, r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r3 != 0) goto L_0x055b;
    L_0x0545:
        r3 = new bsj$a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r36.g();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3.<init>(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r3;
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r9 = 1;
        r12 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        goto L_0x0594;
    L_0x055b:
        r4 = r3.first;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = (java.lang.Integer) r4;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.intValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r3.second;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = (java.lang.Long) r5;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r5.longValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r5.a(r4, r14);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r4.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x057c;
    L_0x0577:
        r7 = r14;
        r9 = 1;
        r12 = 0;
        goto L_0x0594;
    L_0x057c:
        r3 = r3.second;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = (java.lang.Long) r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r3.longValue();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r2.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x0591;
    L_0x058f:
        r7 = 1;
        goto L_0x0592;
    L_0x0591:
        r7 = 0;
    L_0x0592:
        r9 = r7;
        r7 = r14;
    L_0x0594:
        r3 = r1.u;	 Catch:{ all -> 0x0615 }
        if (r3 == 0) goto L_0x0604;
    L_0x0598:
        r3 = r1.B;	 Catch:{ all -> 0x0615 }
        if (r3 <= 0) goto L_0x059d;
    L_0x059c:
        goto L_0x0604;
    L_0x059d:
        r5 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1));
        if (r2 != 0) goto L_0x05af;
    L_0x05a6:
        r1.a(r11);	 Catch:{ all -> 0x0615 }
        r2 = 0;
        r3 = 1;
        r1.a(r2, r3, r2);	 Catch:{ all -> 0x0615 }
        goto L_0x0606;
    L_0x05af:
        r2 = r1.t;	 Catch:{ all -> 0x0615 }
        r2 = r2.c;	 Catch:{ all -> 0x0615 }
        r2 = r4.equals(r2);	 Catch:{ all -> 0x0615 }
        if (r2 == 0) goto L_0x05f5;
    L_0x05b9:
        r2 = r1.r;	 Catch:{ all -> 0x0615 }
        r2 = r2.f;	 Catch:{ all -> 0x0615 }
        if (r2 == 0) goto L_0x05ce;
    L_0x05bf:
        r5 = 0;
        r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1));
        if (r3 == 0) goto L_0x05ce;
    L_0x05c5:
        r2 = r2.a;	 Catch:{ all -> 0x0615 }
        r3 = r1.s;	 Catch:{ all -> 0x0615 }
        r2 = r2.a(r12, r3);	 Catch:{ all -> 0x0615 }
        goto L_0x05cf;
    L_0x05ce:
        r2 = r12;
    L_0x05cf:
        r5 = defpackage.bkw.a(r2);	 Catch:{ all -> 0x0615 }
        r10 = r1.t;	 Catch:{ all -> 0x0615 }
        r10 = r10.j;	 Catch:{ all -> 0x0615 }
        r10 = defpackage.bkw.a(r10);	 Catch:{ all -> 0x0615 }
        r14 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1));
        if (r14 != 0) goto L_0x05f6;
    L_0x05df:
        r2 = r1.t;	 Catch:{ all -> 0x0615 }
        r5 = r2.j;	 Catch:{ all -> 0x0615 }
        r3 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r3.a(r4, r5, r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.t = r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r9 == 0) goto L_0x0a3a;
    L_0x05ed:
        r2 = r1.o;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 2;
    L_0x05f0:
        r2.b(r3);	 Catch:{ bla -> 0x09f6, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x05f5:
        r2 = r12;
    L_0x05f6:
        r2 = r1.a(r4, r2);	 Catch:{ all -> 0x0615 }
        r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x0600;
    L_0x05fe:
        r5 = 1;
        goto L_0x0601;
    L_0x0600:
        r5 = 0;
    L_0x0601:
        r9 = r9 | r5;
        r5 = r2;
        goto L_0x0607;
    L_0x0604:
        r1.C = r2;	 Catch:{ all -> 0x0615 }
    L_0x0606:
        r5 = r12;
    L_0x0607:
        r3 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r3.a(r4, r5, r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.t = r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r9 == 0) goto L_0x0a3a;
    L_0x0611:
        r2 = r1.o;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 2;
        goto L_0x05f0;
    L_0x0615:
        r0 = move-exception;
        r2 = r0;
        r3 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r20 = r3;
        r21 = r4;
        r22 = r12;
        r24 = r7;
        r3 = r20.a(r21, r22, r24);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.t = r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r9 == 0) goto L_0x062f;
    L_0x0629:
        r3 = r1.o;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = 2;
        r3.b(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x062f:
        throw r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x0630:
        r34 = r3;
        r2 = r1.q;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.u;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x085e;
    L_0x063c:
        r4 = r1.B;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 <= 0) goto L_0x0647;
    L_0x0640:
        r4 = r1.u;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x085e;
    L_0x0647:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r1.D;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4.a(r5);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x067c;
    L_0x0654:
        r5 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 != 0) goto L_0x067a;
    L_0x065c:
        r5 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x067a;
    L_0x0664:
        r5 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x067a;
    L_0x0673:
        r4 = r4.i;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 100;
        if (r4 >= r5) goto L_0x067a;
    L_0x0679:
        goto L_0x067c;
    L_0x067a:
        r4 = 0;
        goto L_0x067d;
    L_0x067c:
        r4 = 1;
    L_0x067d:
        if (r4 == 0) goto L_0x0709;
    L_0x067f:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r1.D;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r8 != 0) goto L_0x0692;
    L_0x0689:
        r5 = r7.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r7.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.a(r5, r6);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0698;
    L_0x0692:
        r7 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.a(r7, r5);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x0698:
        if (r4 != 0) goto L_0x06a0;
    L_0x069a:
        r4 = r1.u;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0709;
    L_0x06a0:
        r5 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r4.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r1.k;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = 1;
        r5 = r5.a(r6, r7, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r1.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r1.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r1.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r25 = r9.d();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r1.u;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r6.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r12 != 0) goto L_0x06c8;
    L_0x06c3:
        r12 = r4.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x06c5:
        r22 = r12;
        goto L_0x06d4;
    L_0x06c8:
        r12 = r6.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r12.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r6.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r14.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r14.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r12 + r14;
        goto L_0x06c5;
    L_0x06d4:
        r12 = new blk;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r20 = r12;
        r21 = r7;
        r24 = r8;
        r26 = r9;
        r27 = r5;
        r28 = r4;
        r20.<init>(r21, r22, r24, r25, r26, r27, r28);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r6.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x06f4;
    L_0x06e9:
        r5 = r6.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        defpackage.byo.b(r5);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r6.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5.h = r12;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x06f4:
        r5 = 0;
        r6.j = r5;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6.h = r12;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r6.i;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = 1;
        r5 = r5 + r7;
        r6.i = r5;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r12.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r4.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5.a(r1, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.b(r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x0709:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x0720;
    L_0x070f:
        r4 = r4.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x0716;
    L_0x0715:
        goto L_0x0720;
    L_0x0716:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 != 0) goto L_0x0724;
    L_0x071c:
        r36.k();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0724;
    L_0x0720:
        r4 = 0;
        r1.b(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x0724:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x085e;
    L_0x072c:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = 0;
    L_0x0735:
        r7 = r1.x;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r7 == 0) goto L_0x0783;
    L_0x0739:
        if (r4 == r5) goto L_0x0783;
    L_0x073b:
        r7 = r1.D;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r9.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r9 < 0) goto L_0x0783;
    L_0x0745:
        if (r6 == 0) goto L_0x074a;
    L_0x0747:
        r36.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x074a:
        r6 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 == 0) goto L_0x0752;
    L_0x0750:
        r6 = 0;
        goto L_0x0753;
    L_0x0752:
        r6 = 3;
    L_0x0753:
        r7 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r7.c();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.a(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r7.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r8.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r7.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r9.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r7.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r9.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r20 = r4;
        r21 = r8;
        r22 = r12;
        r24 = r14;
        r4 = r20.a(r21, r22, r24);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.t = r4;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.o;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4.b(r6);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r36.e();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r7;
        r6 = 1;
        goto L_0x0735;
    L_0x0783:
        r4 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x07ab;
    L_0x0789:
        r4 = 0;
    L_0x078a:
        r6 = r1.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 >= r6) goto L_0x085e;
    L_0x078f:
        r6 = r1.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6[r4];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r5.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r7[r4];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r7 == 0) goto L_0x07a8;
    L_0x0799:
        r8 = r6.f();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r8 != r7) goto L_0x07a8;
    L_0x079f:
        r7 = r6.g();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r7 == 0) goto L_0x07a8;
    L_0x07a5:
        r6.h();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x07a8:
        r4 = r4 + 1;
        goto L_0x078a;
    L_0x07ab:
        r4 = r5.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x085e;
    L_0x07af:
        r4 = r5.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 != 0) goto L_0x07b7;
    L_0x07b5:
        goto L_0x085e;
    L_0x07b7:
        r4 = 0;
    L_0x07b8:
        r6 = r1.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 >= r6) goto L_0x07d8;
    L_0x07bd:
        r6 = r1.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6[r4];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r5.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r7[r4];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r6.f();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r8 != r7) goto L_0x085e;
    L_0x07cb:
        if (r7 == 0) goto L_0x07d5;
    L_0x07cd:
        r6 = r6.g();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 != 0) goto L_0x07d5;
    L_0x07d3:
        goto L_0x085e;
    L_0x07d5:
        r4 = r4 + 1;
        goto L_0x07b8;
    L_0x07d8:
        r4 = r5.j;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 == 0) goto L_0x07e8;
    L_0x07e0:
        r6 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 == 0) goto L_0x07e8;
    L_0x07e6:
        r6 = 1;
        goto L_0x07e9;
    L_0x07e8:
        r6 = 0;
    L_0x07e9:
        defpackage.byo.b(r6);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5.g = r6;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r5.j;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r5.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r7.c();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r9 == 0) goto L_0x0807;
    L_0x0805:
        r7 = 1;
        goto L_0x0808;
    L_0x0807:
        r7 = 0;
    L_0x0808:
        r8 = 0;
    L_0x0809:
        r9 = r1.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r9.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r8 >= r9) goto L_0x085e;
    L_0x080e:
        r9 = r1.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = r9[r8];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r4.a(r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r12 == 0) goto L_0x085b;
    L_0x0818:
        if (r7 != 0) goto L_0x0858;
    L_0x081a:
        r12 = r9.i();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r12 != 0) goto L_0x085b;
    L_0x0820:
        r12 = r6.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r12.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r12[r8];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r13 = r6.a(r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r1.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r14[r8];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = r14.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r15 = 5;
        if (r14 != r15) goto L_0x0837;
    L_0x0835:
        r14 = 1;
        goto L_0x0838;
    L_0x0837:
        r14 = 0;
    L_0x0838:
        r15 = r4.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r15 = r15[r8];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r10 = r6.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r10 = r10[r8];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r13 == 0) goto L_0x0858;
    L_0x0842:
        r10 = r10.equals(r15);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r10 == 0) goto L_0x0858;
    L_0x0848:
        if (r14 != 0) goto L_0x0858;
    L_0x084a:
        r10 = defpackage.ble.a(r12);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r5.c;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r12[r8];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r13 = r5.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9.a(r10, r12, r13);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x085b;
    L_0x0858:
        r9.h();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x085b:
        r8 = r8 + 1;
        goto L_0x0809;
    L_0x085e:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 10;
        if (r4 != 0) goto L_0x0870;
    L_0x0868:
        r36.i();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.a(r2, r5);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x0870:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = "doSomeWork";
        defpackage.bzm.a(r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r36.e();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r7 = r7 * r9;
        r12 = r4.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r13 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r13 = r13.j;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r15 = 0;
        r12.a(r13, r15);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r1.v;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r13 = r12.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r14 = 0;
        r15 = 1;
        r18 = 1;
    L_0x0894:
        if (r14 >= r13) goto L_0x08e6;
    L_0x0896:
        r9 = r12[r14];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r1.D;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9.a(r5, r7);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r18 == 0) goto L_0x08a8;
    L_0x089f:
        r5 = r9.r();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x08a8;
    L_0x08a5:
        r18 = 1;
        goto L_0x08aa;
    L_0x08a8:
        r18 = 0;
    L_0x08aa:
        r5 = r9.q();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 != 0) goto L_0x08d2;
    L_0x08b0:
        r5 = r9.r();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 != 0) goto L_0x08d2;
    L_0x08b6:
        r5 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r5.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r6 == 0) goto L_0x08cc;
    L_0x08be:
        r5 = r5.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x08cc;
    L_0x08c4:
        r5 = r9.g();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 == 0) goto L_0x08cc;
    L_0x08ca:
        r5 = 1;
        goto L_0x08cd;
    L_0x08cc:
        r5 = 0;
    L_0x08cd:
        if (r5 == 0) goto L_0x08d0;
    L_0x08cf:
        goto L_0x08d2;
    L_0x08d0:
        r5 = 0;
        goto L_0x08d3;
    L_0x08d2:
        r5 = 1;
    L_0x08d3:
        if (r5 != 0) goto L_0x08d8;
    L_0x08d5:
        r9.j();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x08d8:
        if (r15 == 0) goto L_0x08de;
    L_0x08da:
        if (r5 == 0) goto L_0x08de;
    L_0x08dc:
        r15 = 1;
        goto L_0x08df;
    L_0x08de:
        r15 = 0;
    L_0x08df:
        r14 = r14 + 1;
        r5 = 10;
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        goto L_0x0894;
    L_0x08e6:
        if (r15 != 0) goto L_0x08eb;
    L_0x08e8:
        r36.i();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x08eb:
        r5 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.e;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r18 == 0) goto L_0x090f;
    L_0x08f1:
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x0902;
    L_0x08fa:
        r7 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = r7.j;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 > 0) goto L_0x090f;
    L_0x0902:
        r4 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x090f;
    L_0x0908:
        r1.a(r11);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x090b:
        r36.d();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0987;
    L_0x090f:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 2;
        if (r4 != r5) goto L_0x0969;
    L_0x0916:
        r4 = r1.v;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 != 0) goto L_0x0920;
    L_0x091b:
        r6 = r36.h();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x095b;
    L_0x0920:
        if (r15 == 0) goto L_0x095a;
    L_0x0922:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 != 0) goto L_0x092a;
    L_0x0928:
        r6 = 1;
        goto L_0x095b;
    L_0x092a:
        r4 = r1.r;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.h;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r4.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r5.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r5 != 0) goto L_0x0936;
    L_0x0934:
        r5 = 1;
        goto L_0x0937;
    L_0x0936:
        r5 = 0;
    L_0x0937:
        r5 = r4.a(r5);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7 = -9223372036854775808;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x0928;
    L_0x0941:
        r7 = r1.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r1.D;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r12 = r4.d;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r8 - r12;
        r5 = r5 - r8;
        r4 = r1.n;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.e();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.b;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r8 = r1.y;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r7.a(r5, r4, r8);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x095a;
    L_0x0959:
        goto L_0x0928;
    L_0x095a:
        r6 = 0;
    L_0x095b:
        if (r6 == 0) goto L_0x0969;
    L_0x095d:
        r4 = 3;
        r1.a(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.x;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x0987;
    L_0x0965:
        r36.c();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0987;
    L_0x0969:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 3;
        if (r4 != r5) goto L_0x0987;
    L_0x0970:
        r4 = r1.v;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 != 0) goto L_0x097c;
    L_0x0975:
        r4 = r36.h();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x097e;
    L_0x097b:
        goto L_0x0987;
    L_0x097c:
        if (r15 != 0) goto L_0x0987;
    L_0x097e:
        r4 = r1.x;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.y = r4;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = 2;
        r1.a(r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x090b;
    L_0x0987:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 2;
        if (r4 != r5) goto L_0x099c;
    L_0x098e:
        r4 = r1.v;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = r4.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = 0;
    L_0x0992:
        if (r6 >= r5) goto L_0x099c;
    L_0x0994:
        r7 = r4[r6];	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r7.j();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = r6 + 1;
        goto L_0x0992;
    L_0x099c:
        r4 = r1.x;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x09a7;
    L_0x09a0:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 3;
        if (r4 == r5) goto L_0x09ae;
    L_0x09a7:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 2;
        if (r4 != r5) goto L_0x09b4;
    L_0x09ae:
        r4 = 10;
        r1.a(r2, r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x09ca;
    L_0x09b4:
        r4 = r1.v;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.length;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x09c5;
    L_0x09b9:
        r4 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r4.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == r11) goto L_0x09c5;
    L_0x09bf:
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1.a(r2, r4);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x09ca;
    L_0x09c5:
        r2 = r1.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x09ca:
        defpackage.bzm.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x09ce:
        r34 = r3;
        r2 = r2.arg1;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x09d6;
    L_0x09d4:
        r2 = 1;
        goto L_0x09d7;
    L_0x09d6:
        r2 = 0;
    L_0x09d7:
        r3 = 0;
        r1.y = r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.x = r2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 != 0) goto L_0x09e5;
    L_0x09de:
        r36.d();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r36.e();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x09e5:
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 3;
        if (r2 != r3) goto L_0x09fd;
    L_0x09ec:
        r36.c();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 2;
    L_0x09f2:
        r2.a(r3);	 Catch:{ bla -> 0x09f6, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a3a;
    L_0x09f6:
        r0 = move-exception;
        r4 = r0;
        r5 = r34;
        r2 = 0;
        goto L_0x0a89;
    L_0x09fd:
        r2 = r1.t;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r2.f;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = 2;
        if (r2 != r3) goto L_0x0a3a;
    L_0x0a04:
        r2 = r1.a;	 Catch:{ bla -> 0x09f6, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x09f2;
    L_0x0a07:
        r34 = r3;
        r3 = r2.obj;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = (defpackage.bsj) r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r2.arg1;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r4 == 0) goto L_0x0a13;
    L_0x0a11:
        r4 = 1;
        goto L_0x0a14;
    L_0x0a13:
        r4 = 0;
    L_0x0a14:
        r2 = r2.arg2;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        if (r2 == 0) goto L_0x0a1a;
    L_0x0a18:
        r2 = 1;
        goto L_0x0a1b;
    L_0x0a1a:
        r2 = 0;
    L_0x0a1b:
        r5 = r1.B;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r6 = 1;
        r5 = r5 + r6;
        r1.B = r5;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.a(r6, r4, r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = r1.g;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2.a();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r1.u = r3;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r2 = 2;
        r1.a(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r4 = r1.i;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r5 = 1;
        r3.a(r4, r5, r1);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3 = r1.a;	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        r3.a(r2);	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
    L_0x0a3a:
        r36.b();	 Catch:{ bla -> 0x0a48, IOException -> 0x0a42, RuntimeException -> 0x0a3e }
        goto L_0x0a9d;
    L_0x0a3e:
        r0 = move-exception;
    L_0x0a3f:
        r3 = r0;
        r2 = 0;
        goto L_0x0a54;
    L_0x0a42:
        r0 = move-exception;
        r3 = r0;
        r5 = r34;
        r2 = 0;
        goto L_0x0a6e;
    L_0x0a48:
        r0 = move-exception;
        r4 = r0;
        r5 = r34;
    L_0x0a4c:
        r2 = 0;
    L_0x0a4d:
        r3 = 2;
        goto L_0x0a89;
    L_0x0a4f:
        r0 = move-exception;
        r34 = r3;
        r2 = 0;
    L_0x0a53:
        r3 = r0;
    L_0x0a54:
        r4 = "Internal runtime error.";
        r5 = r34;
        android.util.Log.e(r5, r4, r3);
        r1.a(r2, r2);
        r2 = r1.h;
        r3 = defpackage.bla.a(r3);
        r4 = 2;
        r2 = r2.obtainMessage(r4, r3);
        goto L_0x0a97;
    L_0x0a6a:
        r0 = move-exception;
        r5 = r3;
        r2 = 0;
        r3 = r0;
    L_0x0a6e:
        r4 = "Source error.";
        android.util.Log.e(r5, r4, r3);
        r1.a(r2, r2);
        r4 = r1.h;
        r5 = new bla;
        r6 = -1;
        r5.<init>(r2, r3, r6);
        r3 = 2;
        r2 = r4.obtainMessage(r3, r5);
        goto L_0x0a97;
    L_0x0a84:
        r0 = move-exception;
        r5 = r3;
        r2 = 0;
        r3 = 2;
        r4 = r0;
    L_0x0a89:
        r6 = "Playback error.";
        android.util.Log.e(r5, r6, r4);
        r1.a(r2, r2);
        r2 = r1.h;
        r2 = r2.obtainMessage(r3, r4);
    L_0x0a97:
        r2.sendToTarget();
        r36.b();
    L_0x0a9d:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ble.handleMessage(android.os.Message):boolean");
    }
}
