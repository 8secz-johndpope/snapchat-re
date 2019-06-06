package defpackage;

/* renamed from: aksq */
final class aksq extends aktq {
    private final akso c;

    aksq(akso akso, akrf akrf) {
        super(akra.f, akrf);
        this.c = akso;
    }

    public final int a(long j) {
        akso akso = this.c;
        return akso.b(j, akso.a(j));
    }

    public final boolean b(long j) {
        return this.c.g(j);
    }

    public final int c(long j) {
        return this.c.c(this.c.a(j)) ? 366 : 365;
    }

    public final int d(long j, int i) {
        return (i > 365 || i <= 0) ? c(j) : 365;
    }

    public final akrf e() {
        return this.c.g;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 366;
    }
}
