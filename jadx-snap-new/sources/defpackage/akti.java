package defpackage;

/* renamed from: akti */
public abstract class akti extends aktg {
    protected final akqz c;

    protected akti(akqz akqz, akra akra) {
        super(akra);
        if (akqz == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (akqz.c()) {
            this.c = akqz;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    public int a(long j) {
        return this.c.a(j);
    }

    public long b(long j, int i) {
        return this.c.b(j, i);
    }

    public long d(long j) {
        return this.c.d(j);
    }

    public akrf d() {
        return this.c.d();
    }

    public akrf e() {
        return this.c.e();
    }

    public int g() {
        return this.c.g();
    }

    public int h() {
        return this.c.h();
    }
}
