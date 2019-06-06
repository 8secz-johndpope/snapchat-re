package defpackage;

/* renamed from: akst */
final class akst extends aktq {
    private final akso c;

    akst(akso akso, akrf akrf) {
        super(akra.k, akrf);
        this.c = akso;
    }

    public final int a(long j) {
        return this.c.c(j);
    }

    public final int c(long j) {
        return this.c.a(this.c.b(j));
    }

    public final int d(long j, int i) {
        return i > 52 ? c(j) : 52;
    }

    public final long d(long j) {
        return super.d(j + 259200000) - 259200000;
    }

    public final long e(long j) {
        return super.e(j + 259200000);
    }

    public final akrf e() {
        return this.c.e;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 53;
    }
}
