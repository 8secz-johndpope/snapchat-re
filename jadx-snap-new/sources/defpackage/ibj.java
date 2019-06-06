package defpackage;

import defpackage.ainf.a;

/* renamed from: ibj */
public final class ibj implements hyx {
    private final ajwy<hyk> a;
    private final hzx b;
    private final zfw c = zgb.a(hyn.a.callsite("FideliusSnapKeyServiceImpl"));

    ibj(ibb ibb, ajwy<hyk> ajwy) {
        this.b = ibb.c;
        this.a = ajwy;
    }

    private /* synthetic */ void a(String str, String str2, Long l, a aVar) {
        ((hyk) this.a.get()).a(this.b.a(str, str2, l));
    }

    private /* synthetic */ void b(String str) {
        str = ics.a(str);
        if (this.b.f(str) != null) {
            ((hyk) this.a.get()).b(this.b.g(str));
        }
    }

    public final String a(long j) {
        ici f = this.b.f(String.valueOf(j));
        return f == null ? null : f.a;
    }

    public final void a(String str) {
        this.c.f().a(new -$$Lambda$ibj$nAPgEyYdUJppsKxx6CwDr-GAqgg(this, str));
    }

    public final void a(String str, String str2, Long l) {
        this.b.b.runInTransactionCompat("Fidelius:store", new -$$Lambda$ibj$tOo4dZTuALaP0vA5o5OFtRSKltE(this, str, str2, l)).e();
    }
}
