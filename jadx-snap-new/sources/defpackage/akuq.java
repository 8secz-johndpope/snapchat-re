package defpackage;

/* renamed from: akuq */
public final class akuq extends akrc {
    private final String c;
    private final int d;
    private final int e;

    public akuq(String str, String str2, int i, int i2) {
        super(str);
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    public final String a(long j) {
        return this.c;
    }

    public final int b(long j) {
        return this.d;
    }

    public final int c(long j) {
        return this.e;
    }

    public final boolean d() {
        return true;
    }

    public final int e(long j) {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akuq) {
            akuq akuq = (akuq) obj;
            return this.b.equals(akuq.b) && this.e == akuq.e && this.d == akuq.d;
        }
    }

    public final long h(long j) {
        return j;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.e * 37)) + (this.d * 31);
    }

    public final long i(long j) {
        return j;
    }
}
