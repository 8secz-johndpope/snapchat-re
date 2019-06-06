package defpackage;

/* renamed from: aktj */
public class aktj extends akth {
    final akrf b;

    public aktj(akrf akrf, akrg akrg) {
        super(akrg);
        if (akrf == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (akrf.b()) {
            this.b = akrf;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    public long a(long j, int i) {
        return this.b.a(j, i);
    }

    public long a(long j, long j2) {
        return this.b.a(j, j2);
    }

    public long c(long j, long j2) {
        return this.b.c(j, j2);
    }

    public final boolean c() {
        return this.b.c();
    }

    public long d() {
        return this.b.d();
    }
}
