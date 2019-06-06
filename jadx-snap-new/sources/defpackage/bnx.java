package defpackage;

import com.brightcove.player.media.SourceFields.Containers;
import defpackage.bns.b;

/* renamed from: bnx */
public final class bnx implements bnk {
    private static final int a = bzo.f(Containers.FLV);
    private final bzc b = new bzc(4);
    private final bzc c = new bzc(9);
    private final bzc d = new bzc(11);
    private final bzc e = new bzc();
    private final bny f = new bny();
    private bnm g;
    private int h = 1;
    private long i = -9223372036854775807L;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private bnw o;
    private boa p;

    /* renamed from: bnx$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bnx()};
        }
    }

    static {
        1 1 = new 1();
    }

    private void a() {
        if (!this.n) {
            this.g.a(new b(-9223372036854775807L));
            this.n = true;
        }
        if (this.i == -9223372036854775807L) {
            this.i = this.f.a == -9223372036854775807L ? -this.m : 0;
        }
    }

    private bzc b(bnl bnl) {
        if (this.l > this.e.c()) {
            bzc bzc = this.e;
            bzc.a(new byte[Math.max(bzc.c() << 1, this.l)], 0);
        } else {
            this.e.c(0);
        }
        this.e.b(this.l);
        bnl.b(this.e.a, 0, this.l);
        return this.e;
    }

    public final int a(bnl bnl, bnr bnr) {
        while (true) {
            int i = this.h;
            int i2 = 0;
            boolean z = true;
            if (i == 1) {
                if (bnl.a(this.c.a, 0, 9, true)) {
                    this.c.c(0);
                    this.c.d(4);
                    i = this.c.d();
                    Object obj = (i & 4) != 0 ? 1 : null;
                    if ((i & 1) != 0) {
                        i2 = 1;
                    }
                    if (obj != null && this.o == null) {
                        this.o = new bnw(this.g.a(8, 1));
                    }
                    if (i2 != 0 && this.p == null) {
                        this.p = new boa(this.g.a(9, 2));
                    }
                    this.g.a();
                    this.j = (this.c.j() - 9) + 4;
                    this.h = 2;
                    i2 = 1;
                }
                if (i2 == 0) {
                    return -1;
                }
            } else if (i == 2) {
                bnl.b(this.j);
                this.j = 0;
                this.h = 3;
            } else if (i == 3) {
                if (bnl.a(this.d.a, 0, 11, true)) {
                    this.d.c(0);
                    this.k = this.d.d();
                    this.l = this.d.g();
                    this.m = (long) this.d.g();
                    this.m = (((long) (this.d.d() << 24)) | this.m) * 1000;
                    this.d.d(3);
                    this.h = 4;
                    i2 = 1;
                }
                if (i2 == 0) {
                    return -1;
                }
            } else if (i == 4) {
                if (this.k == 8 && this.o != null) {
                    a();
                    this.o.b(b(bnl), this.i + this.m);
                } else if (this.k == 9 && this.p != null) {
                    a();
                    this.p.b(b(bnl), this.i + this.m);
                } else if (this.k != 18 || this.n) {
                    bnl.b(this.l);
                    z = false;
                } else {
                    this.f.b(b(bnl), this.m);
                    long j = this.f.a;
                    if (j != -9223372036854775807L) {
                        this.g.a(new b(j));
                        this.n = true;
                    }
                }
                this.j = 4;
                this.h = 2;
                if (z) {
                    return 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void a(long j, long j2) {
        this.h = 1;
        this.i = -9223372036854775807L;
        this.j = 0;
    }

    public final void a(bnm bnm) {
        this.g = bnm;
    }

    public final boolean a(bnl bnl) {
        bnl.c(this.b.a, 0, 3);
        this.b.c(0);
        if (this.b.g() != a) {
            return false;
        }
        bnl.c(this.b.a, 0, 2);
        this.b.c(0);
        if ((this.b.e() & 250) != 0) {
            return false;
        }
        bnl.c(this.b.a, 0, 4);
        this.b.c(0);
        int j = this.b.j();
        bnl.a();
        bnl.c(j);
        bnl.c(this.b.a, 0, 4);
        this.b.c(0);
        return this.b.j() == 0;
    }
}
