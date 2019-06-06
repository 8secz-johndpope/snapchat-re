package defpackage;

/* renamed from: akss */
class akss extends aktm {
    private final akso c;
    private final int d = 12;
    private final int e = 2;

    akss(akso akso) {
        super(akra.g, 2629746000L);
        this.c = akso;
    }

    public final int a(long j) {
        akso akso = this.c;
        return akso.a(j, akso.a(j));
    }

    public final long a(long j, int i) {
        if (i == 0) {
            return j;
        }
        long e = (long) akso.e(j);
        int a = this.c.a(j);
        int a2 = this.c.a(j, a);
        int i2 = a2 - 1;
        int i3 = i2 + i;
        if (a2 <= 0 || i3 >= 0) {
            i = i3;
            i3 = a;
        } else {
            i3 = a + 1;
            i = (i - 12) + i2;
        }
        if (i >= 0) {
            i3 += i / 12;
            i = (i % 12) + 1;
        } else {
            i3 = (i3 + (i / 12)) - 1;
            i = Math.abs(i) % 12;
            if (i == 0) {
                i = 12;
            }
            i = (12 - i) + 1;
            if (i == 1) {
                i3++;
            }
        }
        int a3 = this.c.a(j, a, a2);
        int b = this.c.b(i3, i);
        if (a3 > b) {
            a3 = b;
        }
        return this.c.a(i3, i, a3) + e;
    }

    public final long a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        int i = (int) j4;
        if (((long) i) == j4) {
            return a(j3, i);
        }
        long j5;
        long e = (long) akso.e(j);
        int a = this.c.a(j3);
        int a2 = this.c.a(j3, a);
        long j6 = ((long) (a2 - 1)) + j4;
        if (j6 >= 0) {
            j5 = ((long) a) + (j6 / 12);
            j6 = (j6 % 12) + 1;
        } else {
            j5 = (((long) a) + (j6 / 12)) - 1;
            int abs = (int) (Math.abs(j6) % 12);
            if (abs == 0) {
                abs = 12;
            }
            j6 = (long) ((12 - abs) + 1);
            if (j6 == 1) {
                j5++;
            }
        }
        if (j5 < -292275054 || j5 > 292278993) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: ".concat(String.valueOf(j2)));
        }
        int i2 = (int) j5;
        int i3 = (int) j6;
        int a3 = this.c.a(j3, a, a2);
        int b = this.c.b(i2, i3);
        if (a3 > b) {
            a3 = b;
        }
        return this.c.a(i2, i3, a3) + e;
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, i, 1, 12);
        int a = this.c.a(j);
        akso akso = this.c;
        int a2 = akso.a(j, a, akso.a(j, a));
        int b = this.c.b(a, i);
        if (a2 > b) {
            a2 = b;
        }
        return this.c.a(a, i, a2) + ((long) akso.e(j));
    }

    public final boolean b(long j) {
        int a = this.c.a(j);
        return this.c.c(a) && this.c.a(j, a) == 2;
    }

    public final long c(long j, long j2) {
        if (j < j2) {
            return (long) (-b(j2, j));
        }
        int a = this.c.a(j);
        int a2 = this.c.a(j, a);
        int a3 = this.c.a(j2);
        int a4 = this.c.a(j2, a3);
        long j3 = ((((long) (a - a3)) * 12) + ((long) a2)) - ((long) a4);
        int a5 = this.c.a(j, a, a2);
        if (a5 == this.c.b(a, a2) && this.c.a(j2, a3, a4) > a5) {
            j2 = this.c.j.b(j2, a5);
        }
        if (j - this.c.a(a, a2) < j2 - this.c.a(a3, a4)) {
            j3--;
        }
        return j3;
    }

    public final long d(long j) {
        int a = this.c.a(j);
        return this.c.a(a, this.c.a(j, a));
    }

    public final long e(long j) {
        return j - d(j);
    }

    public final akrf e() {
        return this.c.g;
    }

    public final akrf f() {
        return this.c.c;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 12;
    }
}
