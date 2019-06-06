package defpackage;

/* renamed from: aksv */
final class aksv extends aktm {
    private akso c;

    aksv(akso akso) {
        super(akra.e, 31556952000L);
        this.c = akso;
    }

    public final int a(long j) {
        return this.c.a(j);
    }

    public final long a(long j, int i) {
        return i == 0 ? j : b(j, aktl.a(a(j), i));
    }

    public final long a(long j, long j2) {
        return a(j, aktl.a(j2));
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, i, -292275054, 292278993);
        return this.c.d(j, i);
    }

    public final boolean b(long j) {
        return this.c.c(a(j));
    }

    public final long c(long j, int i) {
        aktl.a((akqz) this, i, -292275055, 292278994);
        return this.c.d(j, i);
    }

    public final long c(long j, long j2) {
        return j < j2 ? -this.c.a(j2, j) : this.c.a(j, j2);
    }

    public final long d(long j) {
        return this.c.b(a(j));
    }

    public final long e(long j) {
        return j - d(j);
    }

    public final akrf e() {
        return null;
    }

    public final akrf f() {
        return this.c.c;
    }

    public final int g() {
        return -292275054;
    }

    public final int h() {
        return 292278993;
    }
}
