package defpackage;

/* renamed from: dyz */
public final class dyz {
    boolean a = false;
    private long b;
    private long c;

    public final long a(long j) {
        this.c = System.nanoTime();
        this.b = j;
        long j2 = this.c + (j - this.b);
        this.c = j2;
        return j2;
    }
}
