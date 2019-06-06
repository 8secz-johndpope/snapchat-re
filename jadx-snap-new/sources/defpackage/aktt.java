package defpackage;

/* renamed from: aktt */
public final class aktt extends aktj {
    private final int c = 100;

    public aktt(akrf akrf, akrg akrg, int i) {
        super(akrf, akrg);
    }

    public final long a(long j, int i) {
        return this.b.a(j, ((long) i) * ((long) this.c));
    }

    public final long a(long j, long j2) {
        return this.b.a(j, aktl.a(j2, this.c));
    }

    public final int b(long j, long j2) {
        return this.b.b(j, j2) / this.c;
    }

    public final long c(long j, long j2) {
        return this.b.c(j, j2) / ((long) this.c);
    }

    public final long d() {
        return this.b.d() * ((long) this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aktt) {
            aktt aktt = (aktt) obj;
            return this.b.equals(aktt.b) && this.a == aktt.a && this.c == aktt.c;
        }
    }

    public final int hashCode() {
        long j = (long) this.c;
        return (((int) (j ^ (j >>> 32))) + this.a.hashCode()) + this.b.hashCode();
    }
}
