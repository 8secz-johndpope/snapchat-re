package defpackage;

/* renamed from: blw */
public final class blw {
    public static final blw a = new blw(0, 0);
    public static final blw b = a;
    public final long c;
    public final long d;

    static {
        blw blw = new blw(Long.MAX_VALUE, Long.MAX_VALUE);
        blw = new blw(Long.MAX_VALUE, 0);
        blw = new blw(0, Long.MAX_VALUE);
    }

    public blw(long j, long j2) {
        boolean z = true;
        byo.a(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        byo.a(z);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            blw blw = (blw) obj;
            return this.c == blw.c && this.d == blw.d;
        }
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}
