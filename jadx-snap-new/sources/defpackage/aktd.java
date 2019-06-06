package defpackage;

/* renamed from: aktd */
final class aktd extends akti {
    static final akqz a = new aktd();

    private aktd() {
        super(aktb.p.m, akra.b);
    }

    public final int a(long j) {
        int a = this.c.a(j);
        return a < 0 ? -a : a;
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
        aktl.a((akqz) this, i, 0, this.c.h());
        if (this.c.a(j) < 0) {
            i = -i;
        }
        return super.b(j, i);
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

    public final akrf e() {
        return aktb.p.h;
    }

    public final int g() {
        return 0;
    }

    public final int h() {
        return this.c.h();
    }
}
