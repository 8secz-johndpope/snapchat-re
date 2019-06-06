package defpackage;

/* renamed from: bzi */
public final class bzi implements byy {
    public final byq a;
    public boolean b;
    public long c;
    public blp d = blp.a;
    private long e;

    public bzi(byq byq) {
        this.a = byq;
    }

    public final blp a(blp blp) {
        if (this.b) {
            a(d());
        }
        this.d = blp;
        return blp;
    }

    public final void a(long j) {
        this.e = j;
        if (this.b) {
            this.c = this.a.a();
        }
    }

    public final long d() {
        long j = this.e;
        if (!this.b) {
            return j;
        }
        long a = this.a.a() - this.c;
        return j + (this.d.b == 1.0f ? bkw.b(a) : a * ((long) this.d.e));
    }

    public final blp e() {
        return this.d;
    }
}
