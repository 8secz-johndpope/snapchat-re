package defpackage;

/* renamed from: akta */
final class akta extends akti {
    private final akso a;

    akta(akqz akqz, akso akso) {
        super(akqz, akra.b);
        this.a = akso;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        return a <= 0 ? 1 - a : a;
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
        aktl.a((akqz) this, i, 1, this.c.h());
        if (this.a.a(j) <= 0) {
            i = 1 - i;
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
        return this.a.h;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return this.c.h();
    }
}
