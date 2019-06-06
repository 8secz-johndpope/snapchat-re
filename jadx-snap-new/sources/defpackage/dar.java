package defpackage;

/* renamed from: dar */
public final class dar<R extends das<R>, S extends dat<R>> {
    private final S a;
    private final R b;
    private R c;
    private R d;
    private boolean e;

    public dar(S s) {
        this(s, s.b(), s.b(), s.b());
        boolean z = this.e && s.a(this.d);
        this.e = z;
    }

    private dar(S s, R r, R r2, R r3) {
        this.e = true;
        this.a = s;
        this.c = r;
        this.d = r2;
        this.b = r3;
    }

    private R c() {
        this.e &= this.a.a(this.c);
        if (!this.e) {
            return null;
        }
        this.c.a(this.d, this.b);
        return this.b;
    }

    public final R a() {
        das das = this.c;
        return das == null ? this.d : das;
    }

    public final R b() {
        if (c() == null) {
            return null;
        }
        das das = this.d;
        this.d = this.c;
        this.c = das;
        return this.b;
    }
}
