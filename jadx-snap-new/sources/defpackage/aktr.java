package defpackage;

/* renamed from: aktr */
public final class aktr extends akth {
    private final long b;

    public aktr(akrg akrg, long j) {
        super(akrg);
        this.b = j;
    }

    public final long a(long j, int i) {
        return aktl.a(j, ((long) i) * this.b);
    }

    public final long a(long j, long j2) {
        long j3 = this.b;
        if (j3 != 1) {
            if (j2 == 1) {
                j2 = j3;
            } else if (j2 == 0 || j3 == 0) {
                j2 = 0;
            } else {
                long j4 = j2 * j3;
                if (j4 / j3 != j2 || ((j2 == Long.MIN_VALUE && j3 == -1) || (j3 == Long.MIN_VALUE && j2 == -1))) {
                    StringBuilder stringBuilder = new StringBuilder("Multiplication overflows a long: ");
                    stringBuilder.append(j2);
                    stringBuilder.append(" * ");
                    stringBuilder.append(j3);
                    throw new ArithmeticException(stringBuilder.toString());
                }
                j2 = j4;
            }
        }
        return aktl.a(j, j2);
    }

    public final long c(long j, long j2) {
        return aktl.b(j, j2) / this.b;
    }

    public final boolean c() {
        return true;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aktr) {
            aktr aktr = (aktr) obj;
            return this.a == aktr.a && this.b == aktr.b;
        }
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + this.a.hashCode();
    }
}
