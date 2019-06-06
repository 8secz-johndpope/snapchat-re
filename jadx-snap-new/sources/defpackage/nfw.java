package defpackage;

/* renamed from: nfw */
public final class nfw {
    private final ncn a;
    private final nct b;
    private final nbo c;
    private final zfw d;
    private final nfs e;
    private final nfv f;
    private final ajei g;

    public nfw(ncn ncn, nct nct, nbo nbo, ide ide, nfs nfs, ajei ajei) {
        this.a = ncn;
        this.b = nct;
        this.c = nbo;
        this.d = zgb.a(ide.callsite("LocationActivityMixin"));
        this.g = ajei;
        this.e = nfs;
        this.f = new nfv(ncn, nbo);
    }

    public final void a() {
        nct nct = this.b;
        this.a.n();
        nct.c(false);
        this.c.a(false);
        this.b.c();
        this.a.s();
    }

    public final void a(boolean z) {
        if (z) {
            this.a.v();
        }
    }

    public final void a(boolean z, boolean z2) {
        this.a.t();
        if (z) {
            ajei ajei = this.g;
            ajdw j = this.d.j();
            ncn ncn = this.a;
            ncn.getClass();
            ajei.a(j.a(new -$$Lambda$V3b0SpLqq6gBrb24QedFLBIJDF4(ncn)));
            this.b.e();
            nct nct = this.b;
            this.a.n();
            nct.c(true);
            this.c.a(true);
            this.b.b(z2);
        }
    }

    public final void b() {
        this.e.a(this.f);
    }

    public final void b(boolean z) {
        if (!z) {
            this.b.b(false);
        }
        b();
    }

    public final void c() {
        ajdw b = this.d.b();
        nct nct = this.b;
        nct.getClass();
        this.g.a(b.a(new -$$Lambda$zINOy72Jy5hSOD7FP2Q2_KpSuhk(nct)));
    }
}
