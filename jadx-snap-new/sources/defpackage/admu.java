package defpackage;

import com.google.common.base.Preconditions;
import defpackage.adma.b;

/* renamed from: admu */
public class admu {
    protected final adjj a;
    protected final adie b;
    protected final adjc c;
    protected final adjc d;
    protected final adnx e;
    protected final adhz f;
    protected final adhg g;
    protected final Long h;
    protected final adkr i;
    protected adjq j;
    protected final idd k;
    private adnj l;

    public admu(adjj adjj, adie adie, adjc adjc, adjc adjc2, adnx adnx, adnj adnj, adhz adhz, adhg adhg, Long l, idd idd, adkr adkr) {
        this.a = (adjj) Preconditions.checkNotNull(adjj);
        this.b = (adie) Preconditions.checkNotNull(adie);
        this.g = (adhg) Preconditions.checkNotNull(adhg);
        this.c = adjc;
        this.d = adjc2;
        this.e = adnx;
        this.l = (adnj) Preconditions.checkNotNull(adnj);
        this.f = (adhz) Preconditions.checkNotNull(adhz);
        this.h = l;
        this.k = idd;
        this.i = adkr;
    }

    public void a() {
    }

    public final void a(b bVar) {
        getClass().getSimpleName();
        adni.b("concatenate (%s)", d());
        Preconditions.checkNotNull(this.j);
        this.j.a(bVar);
        this.a.f();
    }

    public void b() {
        adjq adjq = this.j;
        if (adjq != null) {
            adjq.b();
            this.j = null;
        }
    }

    public adha c() {
        throw new UnsupportedOperationException();
    }

    public String d() {
        return getClass().getName();
    }

    public final void e() {
        adjq adjq = this.j;
        if (adjq != null) {
            adjq.a();
        }
    }

    public final String f() {
        adjq adjq = this.j;
        return adjq == null ? "empty stage processor" : adjq.c();
    }
}
