package defpackage;

/* renamed from: bky */
final class bky implements byy {
    private final bzi a;
    private final a b;
    private bls c;
    private byy d;

    /* renamed from: bky$a */
    public interface a {
        void a(blp blp);
    }

    public bky(a aVar, byq byq) {
        this.b = aVar;
        this.a = new bzi(byq);
    }

    private void f() {
        this.a.a(this.d.d());
        blp e = this.d.e();
        if (!e.equals(this.a.d)) {
            this.a.a(e);
            this.b.a(e);
        }
    }

    private boolean g() {
        bls bls = this.c;
        return (bls == null || bls.r() || (!this.c.q() && this.c.g())) ? false : true;
    }

    public final blp a(blp blp) {
        byy byy = this.d;
        if (byy != null) {
            blp = byy.a(blp);
        }
        this.a.a(blp);
        this.b.a(blp);
        return blp;
    }

    public final void a() {
        bzi bzi = this.a;
        if (!bzi.b) {
            bzi.c = bzi.a.a();
            bzi.b = true;
        }
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public final void a(bls bls) {
        byy c = bls.c();
        if (c != null) {
            byy byy = this.d;
            if (c == byy) {
                return;
            }
            if (byy == null) {
                this.d = c;
                this.c = bls;
                this.d.a(this.a.d);
                f();
                return;
            }
            throw bla.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public final void b() {
        bzi bzi = this.a;
        if (bzi.b) {
            bzi.a(bzi.d());
            bzi.b = false;
        }
    }

    public final void b(bls bls) {
        if (bls == this.c) {
            this.d = null;
            this.c = null;
        }
    }

    public final long c() {
        if (!g()) {
            return this.a.d();
        }
        f();
        return this.d.d();
    }

    public final long d() {
        return g() ? this.d.d() : this.a.d();
    }

    public final blp e() {
        byy byy = this.d;
        return byy != null ? byy.e() : this.a.d;
    }
}
