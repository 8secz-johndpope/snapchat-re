package defpackage;

import android.util.Log;

/* renamed from: blk */
final class blk {
    public final bsi a;
    public final Object b;
    public final bsn[] c;
    public long d;
    public boolean e;
    public boolean f;
    public bll g;
    public blk h;
    public bss i;
    public bww j;
    private boolean[] k;
    private final blt[] l;
    private final bwv m;
    private final bsj n;
    private bww o;

    public blk(blt[] bltArr, long j, bwv bwv, bwy bwy, bsj bsj, Object obj, bll bll) {
        this.l = bltArr;
        this.d = j - bll.b;
        this.m = bwv;
        this.n = bsj;
        this.b = byo.a(obj);
        this.g = bll;
        this.c = new bsn[bltArr.length];
        this.k = new boolean[bltArr.length];
        bsi a = bsj.a(bll.a, bwy);
        if (bll.c != Long.MIN_VALUE) {
            a = new brx(a, bll.c);
        }
        this.a = a;
    }

    private void a(bww bww) {
        this.o = bww;
        bww = this.o;
        if (bww != null) {
            blk.b(bww);
        }
    }

    private void a(bsn[] bsnArr) {
        int i = 0;
        while (true) {
            blt[] bltArr = this.l;
            if (i < bltArr.length) {
                if (bltArr[i].a() == 5) {
                    bsnArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private static void b(bww bww) {
        for (int i = 0; i < bww.a; i++) {
            boolean a = bww.a(i);
            bwt bwt = bww.c.b[i];
            if (a && bwt != null) {
                bwt.c();
            }
        }
    }

    private void b(bsn[] bsnArr) {
        int i = 0;
        while (true) {
            blt[] bltArr = this.l;
            if (i < bltArr.length) {
                if (bltArr[i].a() == 5 && this.j.a(i)) {
                    bsnArr[i] = new bsd();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long a(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= this.j.a) {
                break;
            }
            boolean[] zArr2 = this.k;
            if (z || !this.j.a(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        a(this.c);
        a(this.j);
        bwu bwu = this.j.c;
        j = this.a.a(bwu.a(), this.k, this.c, zArr, j);
        b(this.c);
        this.f = false;
        int i2 = 0;
        while (true) {
            bsn[] bsnArr = this.c;
            if (i2 >= bsnArr.length) {
                return j;
            }
            if (bsnArr[i2] != null) {
                byo.b(this.j.a(i2));
                if (this.l[i2].a() != 5) {
                    this.f = true;
                }
            } else {
                byo.b(bwu.b[i2] == null);
            }
            i2++;
        }
    }

    public final long a(boolean z) {
        if (!this.e) {
            return this.g.b;
        }
        long d = this.a.d();
        if (d == Long.MIN_VALUE && z) {
            d = this.g.e;
        }
        return d;
    }

    public final void a(long j) {
        if (this.e) {
            this.a.a(j - this.d);
        }
    }

    public final boolean a() {
        return this.e && (!this.f || this.a.d() == Long.MIN_VALUE);
    }

    public final boolean a(float f) {
        bww a = this.m.a(this.l, this.i);
        int i = 0;
        if (a.a(this.o)) {
            return false;
        }
        this.j = a;
        bwt[] a2 = this.j.c.a();
        int length = a2.length;
        while (i < length) {
            bwt bwt = a2[i];
            if (bwt != null) {
                bwt.a(f);
            }
            i++;
        }
        return true;
    }

    public final long b() {
        return !this.e ? 0 : this.a.e();
    }

    public final void b(long j) {
        this.a.c(j - this.d);
    }

    public final long c(long j) {
        return a(j, false, new boolean[this.l.length]);
    }

    public final void c() {
        a(null);
        try {
            if (this.g.c != Long.MIN_VALUE) {
                this.n.a(((brx) this.a).a);
            } else {
                this.n.a(this.a);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }
}
