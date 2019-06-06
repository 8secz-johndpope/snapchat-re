package defpackage;

import defpackage.bmc.a;
import defpackage.bqg.d;

/* renamed from: bpl */
public final class bpl implements bpr {
    long a;
    private final bzb b;
    private final bzc c;
    private final String d;
    private String e;
    private bnu f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private blg k;
    private int l;

    public bpl() {
        this(null);
    }

    public bpl(String str) {
        this.b = new bzb(new byte[128]);
        this.c = new bzc(this.b.a);
        this.g = 0;
        this.d = str;
    }

    private boolean a(bzc bzc, byte[] bArr) {
        int min = Math.min(bzc.b(), 128 - this.h);
        bzc.a(bArr, this.h, min);
        this.h += min;
        return this.h == 128;
    }

    private boolean b(bzc bzc) {
        while (true) {
            boolean z = false;
            if (bzc.b() <= 0) {
                return false;
            }
            if (this.i) {
                int d = bzc.d();
                if (d == 119) {
                    this.i = false;
                    return true;
                } else if (d != 11) {
                    this.i = z;
                }
            } else if (bzc.d() != 11) {
                this.i = z;
            }
            z = true;
            this.i = z;
        }
    }

    private void c() {
        this.b.a(0);
        a a = bmc.a(this.b);
        if (!(this.k != null && a.c == this.k.s && a.b == this.k.t && a.a == this.k.f)) {
            this.k = blg.a(this.e, a.a, null, -1, -1, a.c, a.b, null, null, 0, this.d);
            this.f.a(this.k);
        }
        this.l = a.d;
        this.j = (((long) a.e) * 1000000) / ((long) this.k.t);
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    public final void a(long j, boolean z) {
        this.a = j;
    }

    public final void a(bnm bnm, d dVar) {
        dVar.a();
        this.e = dVar.c();
        this.f = bnm.a(dVar.b(), 1);
    }

    public final void a(bzc bzc) {
        while (bzc.b() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        i = Math.min(bzc.b(), this.l - this.h);
                        this.f.a(bzc, i);
                        this.h += i;
                        i = this.h;
                        int i2 = this.l;
                        if (i == i2) {
                            this.f.a(this.a, 1, i2, 0, null);
                            this.a += this.j;
                            this.g = 0;
                        }
                    }
                } else if (a(bzc, this.c.a)) {
                    c();
                    this.c.c(0);
                    this.f.a(this.c, 128);
                    this.g = 2;
                }
            } else if (b(bzc)) {
                this.g = 1;
                this.c.a[0] = (byte) 11;
                this.c.a[1] = (byte) 119;
                this.h = 2;
            }
        }
    }

    public final void b() {
    }
}
