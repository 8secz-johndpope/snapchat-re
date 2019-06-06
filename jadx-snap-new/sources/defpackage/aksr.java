package defpackage;

/* renamed from: aksr */
abstract class aksr extends akso {
    private static final int[] p = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] q = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] r = new long[12];
    private static final long[] s = new long[12];

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += ((long) p[i]) * 86400000;
            int i2 = i + 1;
            r[i2] = j;
            j2 += ((long) q[i]) * 86400000;
            s[i2] = j2;
            i = i2;
        }
    }

    aksr(akqx akqx, int i) {
        super(akqx, null, i);
    }

    /* Access modifiers changed, original: final */
    public final int a(long j, int i) {
        int b = (int) ((j - b(i)) >> 10);
        return c(i) ? b < 15356250 ? b < 7678125 ? b < 2615625 ? 1 : b < 5062500 ? 2 : 3 : b < 10209375 ? 4 : b < 12825000 ? 5 : 6 : b < 23118750 ? b < 17971875 ? 7 : b < 20587500 ? 8 : 9 : b < 25734375 ? 10 : b < 28265625 ? 11 : 12 : b < 15271875 ? b < 7593750 ? b < 2615625 ? 1 : b < 4978125 ? 2 : 3 : b < 10125000 ? 4 : b < 12740625 ? 5 : 6 : b < 23034375 ? b < 17887500 ? 7 : b < 20503125 ? 8 : 9 : b < 25650000 ? 10 : b < 28181250 ? 11 : 12;
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, long j2) {
        int a = a(j);
        int a2 = a(j2);
        j -= b(a);
        j2 -= b(a2);
        if (j2 >= 5097600000L) {
            if (c(a2)) {
                if (!c(a)) {
                    j2 -= 86400000;
                }
            } else if (j >= 5097600000L && c(a)) {
                j -= 86400000;
            }
        }
        a -= a2;
        if (j < j2) {
            a--;
        }
        return (long) a;
    }

    /* Access modifiers changed, original: final */
    public final int b(int i, int i2) {
        return c(i) ? q[i2 - 1] : p[i2 - 1];
    }

    /* Access modifiers changed, original: final */
    public final int c(long j, int i) {
        return (i > 28 || i <= 0) ? f(j) : 28;
    }

    /* Access modifiers changed, original: final */
    public final long c(int i, int i2) {
        return c(i) ? s[i2 - 1] : r[i2 - 1];
    }

    /* Access modifiers changed, original: final */
    public final long d(long j, int i) {
        int a = a(j);
        int b = b(j, a);
        int e = akso.e(j);
        if (b > 59) {
            if (c(a)) {
                if (!c(i)) {
                    b--;
                }
            } else if (c(i)) {
                b++;
            }
        }
        return a(i, 1, b) + ((long) e);
    }

    /* Access modifiers changed, original: final */
    public final boolean g(long j) {
        return this.j.a(j) == 29 && this.l.b(j);
    }
}
