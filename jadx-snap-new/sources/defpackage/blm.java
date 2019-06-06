package defpackage;

import android.util.Pair;
import defpackage.bly.a;
import defpackage.bly.b;

/* renamed from: blm */
final class blm {
    final a a = new a();
    final b b = new b();
    bly c;
    int d;
    boolean e;
    blk f;
    blk g;
    blk h;
    int i;
    Object j;
    private long k;
    private long l;

    private long a(int i) {
        int a;
        Object obj = this.c.a(i, this.a, true).a;
        int i2 = this.a.b;
        Object obj2 = this.j;
        if (obj2 != null) {
            a = this.c.a(obj2);
            if (a != -1 && this.c.a(a, this.a, false).b == i2) {
                return this.l;
            }
        }
        for (blk a2 = a(); a2 != null; a2 = a2.h) {
            if (a2.b.equals(obj)) {
                return a2.g.a.d;
            }
        }
        for (blk a3 = a(); a3 != null; a3 = a3.h) {
            a = this.c.a(a3.b);
            if (a != -1 && this.c.a(a, this.a, false).b == i2) {
                return a3.g.a.d;
            }
        }
        long j = this.k;
        this.k = 1 + j;
        return j;
    }

    private bll a(bll bll, bsj.a aVar) {
        long j;
        long j2;
        long j3 = bll.b;
        long j4 = bll.c;
        a(aVar);
        boolean a = a(aVar, true);
        this.c.a(aVar.a, this.a, false);
        if (aVar.a()) {
            j = -9223372036854775807L;
        } else if (j4 == Long.MIN_VALUE) {
            j = this.a.c;
        } else {
            j2 = j4;
            return new bll(aVar, j3, j4, bll.d, j2, true, a);
        }
        j2 = j;
        return new bll(aVar, j3, j4, bll.d, j2, true, a);
    }

    private bsj.a a(int i, long j, long j2) {
        this.c.a(i, this.a, false);
        int a = this.a.a(j);
        if (a == -1) {
            return new bsj.a(i, j2);
        }
        return new bsj.a(i, a, this.a.b(a), j2);
    }

    private boolean a(bsj.a aVar) {
        this.c.a(aVar.a, this.a, false);
        return true;
    }

    private boolean a(bsj.a aVar, boolean z) {
        return !this.c.a(this.c.a(aVar.a, this.a, false).b, this.b).a && this.c.b(aVar.a, this.a, this.b, this.d, this.e) && z;
    }

    private bll b(int i, long j, long j2) {
        bsj.a aVar = new bsj.a(i, j2);
        this.c.a(aVar.a, this.a, false);
        int b = this.a.b(j);
        long a = b == -1 ? Long.MIN_VALUE : this.a.a(b);
        a(aVar);
        return new bll(aVar, j, a, -9223372036854775807L, a == Long.MIN_VALUE ? this.a.c : a, true, a(aVar, true));
    }

    public final blk a() {
        return b() ? this.f : this.h;
    }

    /* Access modifiers changed, original: final */
    public final bll a(blk blk, long j) {
        blk blk2 = blk;
        bll bll = blk2.g;
        if (bll.f) {
            int a = this.c.a(bll.a.a, this.a, this.b, this.d, this.e);
            if (a == -1) {
                return null;
            }
            long longValue;
            int i;
            int i2 = this.c.a(a, this.a, true).b;
            Object obj = this.a.a;
            long j2 = bll.a.d;
            long j3 = 0;
            if (this.c.a(i2, this.b).b == a) {
                j2 = (blk2.d + bll.e) - j;
                Pair a2 = this.c.a(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j2));
                if (a2 == null) {
                    return null;
                }
                long j4;
                a = ((Integer) a2.first).intValue();
                longValue = ((Long) a2.second).longValue();
                if (blk2.h == null || !blk2.h.b.equals(obj)) {
                    j4 = this.k;
                    this.k = 1 + j4;
                } else {
                    j4 = blk2.h.g.a.d;
                }
                j3 = longValue;
                longValue = j4;
                i = a;
            } else {
                i = a;
                longValue = j2;
            }
            return a(a(i, j3, longValue), j3);
        }
        bsj.a aVar = bll.a;
        this.c.a(aVar.a, this.a, false);
        if (aVar.a() || bll.c == Long.MIN_VALUE || this.a.a(bll.c) != -1) {
            return null;
        }
        return b(aVar.a, bll.c, aVar.d);
    }

    public final bll a(bll bll, int i) {
        return a(bll, bll.a.a(i));
    }

    /* Access modifiers changed, original: final */
    public final bll a(bsj.a aVar, long j) {
        this.c.a(aVar.a, this.a, false);
        if (aVar.a()) {
            return null;
        }
        return b(aVar.a, j, aVar.d);
    }

    public final bsj.a a(int i, long j) {
        return a(i, j, a(i));
    }

    public final void a(long j) {
        blk blk = this.h;
        if (blk != null) {
            blk.a(j);
        }
    }

    public final void a(boolean z) {
        blk a = a();
        if (a != null) {
            this.j = z ? a.b : null;
            this.l = a.g.a.d;
            a.c();
            a(a);
        } else if (!z) {
            this.j = null;
        }
        this.f = null;
        this.h = null;
        this.g = null;
        this.i = 0;
    }

    public final boolean a(blk blk) {
        boolean z = false;
        byo.b(blk != null);
        this.h = blk;
        while (blk.h != null) {
            blk = blk.h;
            if (blk == this.g) {
                this.g = this.f;
                z = true;
            }
            blk.c();
            this.i--;
        }
        this.h.h = null;
        return z;
    }

    public final boolean a(bsi bsi) {
        blk blk = this.h;
        return blk != null && blk.a == bsi;
    }

    public final boolean b() {
        return this.f != null;
    }

    public final blk c() {
        blk blk = this.f;
        if (blk != null) {
            if (blk == this.g) {
                this.g = blk.h;
            }
            this.f.c();
            this.i--;
            if (this.i == 0) {
                this.h = null;
                this.j = this.f.b;
                this.l = this.f.g.a.d;
            }
            this.f = this.f.h;
        } else {
            blk = this.h;
            this.f = blk;
            this.g = blk;
        }
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        blk a = a();
        if (a == null) {
            return true;
        }
        boolean a2;
        while (true) {
            int a3 = this.c.a(a.g.a.a, this.a, this.b, this.d, this.e);
            while (a.h != null && !a.g.f) {
                a = a.h;
            }
            if (a3 == -1 || a.h == null || a.h.g.a.a != a3) {
                a2 = a(a);
                a.g = a(a.g, a.g.a);
            } else {
                a = a.h;
            }
        }
        a2 = a(a);
        a.g = a(a.g, a.g.a);
        return (a2 && b()) ? false : true;
    }
}
