package defpackage;

/* renamed from: akts */
public final class akts extends akti {
    private int a;
    private akrf d;
    private akrf e;

    public akts(akqz akqz, akrf akrf, akra akra) {
        super(akqz, akra);
        this.e = akrf;
        this.d = akqz.d();
        this.a = 100;
    }

    public akts(aktk aktk) {
        this(aktk, aktk.b);
    }

    public akts(aktk aktk, akra akra) {
        this(aktk, aktk.c.d(), akra);
    }

    public akts(aktk aktk, akrf akrf, akra akra) {
        super(aktk.c, akra);
        this.a = 100;
        this.d = akrf;
        this.e = aktk.d;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        if (a >= 0) {
            return a % this.a;
        }
        int i = this.a;
        return (i - 1) + ((a + 1) % i);
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, i, 0, this.a - 1);
        int a = this.c.a(j);
        return this.c.b(j, ((a >= 0 ? a / this.a : ((a + 1) / this.a) - 1) * this.a) + i);
    }

    public final long d(long j) {
        return this.c.d(j);
    }

    public final akrf d() {
        return this.d;
    }

    public final long e(long j) {
        return this.c.e(j);
    }

    public final akrf e() {
        return this.e;
    }

    public final int g() {
        return 0;
    }

    public final int h() {
        return this.a - 1;
    }
}
