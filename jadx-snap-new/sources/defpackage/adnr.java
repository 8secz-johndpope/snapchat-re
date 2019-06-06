package defpackage;

/* renamed from: adnr */
public final class adnr {
    public long a;
    public long b;
    private admz c;

    public adnr() {
        this(new admz());
    }

    private adnr(admz admz) {
        this.a = -1;
        this.b = 0;
        this.c = admz;
    }

    public final long a() {
        return a(System.nanoTime() / 1000);
    }

    public final long a(long j) {
        return this.b + b(j);
    }

    public final long b(long j) {
        return b() ? j - this.a : 0;
    }

    public final boolean b() {
        return this.a != -1;
    }
}
