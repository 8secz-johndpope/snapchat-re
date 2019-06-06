package defpackage;

/* renamed from: aktw */
public final class aktw extends akti {
    public aktw(akqz akqz, akra akra) {
        super(akqz, akra);
        if (akqz.g() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    public final int a(long j) {
        int a = this.c.a(j);
        return a == 0 ? h() : a;
    }

    public final long a(long j, int i) {
        return this.c.a(j, i);
    }

    public final long a(long j, long j2) {
        return this.c.a(j, j2);
    }

    public final int b(long j, long j2) {
        return this.c.b(j, j2);
    }

    public final long b(long j, int i) {
        int h = h();
        aktl.a((akqz) this, i, 1, h);
        if (i == h) {
            i = 0;
        }
        return this.c.b(j, i);
    }

    public final boolean b(long j) {
        return this.c.b(j);
    }

    public final int c(long j) {
        return this.c.c(j) + 1;
    }

    public final long c(long j, long j2) {
        return this.c.c(j, j2);
    }

    public final long d(long j) {
        return this.c.d(j);
    }

    public final long e(long j) {
        return this.c.e(j);
    }

    public final akrf f() {
        return this.c.f();
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return this.c.h() + 1;
    }
}
