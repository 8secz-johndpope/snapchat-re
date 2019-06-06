package defpackage;

/* renamed from: aksp */
final class aksp extends aktq {
    private final akso c;

    aksp(akso akso, akrf akrf) {
        super(akra.h, akrf);
        this.c = akso;
    }

    public final int a(long j) {
        akso akso = this.c;
        int a = akso.a(j);
        return akso.a(j, a, akso.a(j, a));
    }

    public final boolean b(long j) {
        return this.c.g(j);
    }

    public final int c(long j) {
        return this.c.f(j);
    }

    public final int d(long j, int i) {
        return this.c.c(j, i);
    }

    public final akrf e() {
        return this.c.f;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 31;
    }
}
