package defpackage;

/* renamed from: aktm */
public abstract class aktm extends aktg {
    final long a;
    private final akrf c;

    /* renamed from: aktm$a */
    final class a extends akth {
        a(akrg akrg) {
            super(akrg);
        }

        public final long a(long j, int i) {
            return aktm.this.a(j, i);
        }

        public final long a(long j, long j2) {
            return aktm.this.a(j, j2);
        }

        public final int b(long j, long j2) {
            return aktm.this.b(j, j2);
        }

        public final long c(long j, long j2) {
            return aktm.this.c(j, j2);
        }

        public final boolean c() {
            return false;
        }

        public final long d() {
            return aktm.this.a;
        }
    }

    public aktm(akra akra, long j) {
        super(akra);
        this.a = j;
        this.c = new a(akra.a());
    }

    public abstract long a(long j, int i);

    public abstract long a(long j, long j2);

    public final int b(long j, long j2) {
        return aktl.a(c(j, j2));
    }

    public long c(long j, long j2) {
        if (j < j2) {
            return -c(j2, j);
        }
        long j3 = (j - j2) / this.a;
        if (a(j2, j3) < j) {
            do {
                j3++;
            } while (a(j2, j3) <= j);
            j3--;
        } else if (a(j2, j3) > j) {
            do {
                j3--;
            } while (a(j2, j3) > j);
        }
        return j3;
    }

    public final akrf d() {
        return this.c;
    }
}
