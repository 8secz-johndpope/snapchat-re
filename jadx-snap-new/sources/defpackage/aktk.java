package defpackage;

/* renamed from: aktk */
public final class aktk extends akti {
    final int a;
    final akrf d;
    private akrf e;
    private final int f;
    private final int g;

    public aktk(akqz akqz, akra akra) {
        this(akqz, akqz.e(), akra);
    }

    private aktk(akqz akqz, akrf akrf, akra akra) {
        super(akqz, akra);
        akrf d = akqz.d();
        if (d == null) {
            this.d = null;
        } else {
            this.d = new aktt(d, akra.a(), 100);
        }
        this.e = akrf;
        this.a = 100;
        int g = akqz.g();
        g = g >= 0 ? g / 100 : ((g + 1) / 100) - 1;
        int h = akqz.h();
        h = h >= 0 ? h / 100 : ((h + 1) / 100) - 1;
        this.f = g;
        this.g = h;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        return a >= 0 ? a / 100 : ((a + 1) / 100) - 1;
    }

    public final long a(long j, int i) {
        return this.c.a(j, i * 100);
    }

    public final long a(long j, long j2) {
        return this.c.a(j, j2 * 100);
    }

    public final int b(long j, long j2) {
        return this.c.b(j, j2) / 100;
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, i, this.f, this.g);
        int a = this.c.a(j);
        return this.c.b(j, (i * 100) + (a >= 0 ? a % 100 : ((a + 1) % 100) + 99));
    }

    public final long c(long j, long j2) {
        return this.c.c(j, j2) / 100;
    }

    public final long d(long j) {
        akqz akqz = this.c;
        return akqz.d(akqz.b(j, a(j) * 100));
    }

    public final akrf d() {
        return this.d;
    }

    public final long e(long j) {
        return b(j, a(this.c.e(j)));
    }

    public final akrf e() {
        akrf akrf = this.e;
        return akrf != null ? akrf : super.e();
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.g;
    }
}
