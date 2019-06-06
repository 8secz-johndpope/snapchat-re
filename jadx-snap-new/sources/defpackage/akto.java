package defpackage;

/* renamed from: akto */
public final class akto extends akti {
    private final int a;
    private final int d;
    private final int e;

    public akto(akqz akqz) {
        this(akqz, akqz == null ? null : akqz.a(), 99);
    }

    public akto(akqz akqz, akra akra) {
        this(akqz, akra, 1);
    }

    private akto(akqz akqz, akra akra, int i) {
        super(akqz, akra);
        if (i != 0) {
            this.a = i;
            if (Integer.MIN_VALUE < akqz.g() + i) {
                this.d = akqz.g() + i;
            } else {
                this.d = Integer.MIN_VALUE;
            }
            if (Integer.MAX_VALUE > akqz.h() + i) {
                this.e = akqz.h() + i;
                return;
            } else {
                this.e = Integer.MAX_VALUE;
                return;
            }
        }
        throw new IllegalArgumentException("The offset cannot be zero");
    }

    public final int a(long j) {
        return super.a(j) + this.a;
    }

    public final long a(long j, int i) {
        j = super.a(j, i);
        aktl.a((akqz) this, a(j), this.d, this.e);
        return j;
    }

    public final long a(long j, long j2) {
        j = super.a(j, j2);
        aktl.a((akqz) this, a(j), this.d, this.e);
        return j;
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, i, this.d, this.e);
        return super.b(j, i - this.a);
    }

    public final boolean b(long j) {
        return this.c.b(j);
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
        return this.d;
    }

    public final int h() {
        return this.e;
    }
}
