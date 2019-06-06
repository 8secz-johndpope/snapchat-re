package defpackage;

import defpackage.miq.d.a;

/* renamed from: lbw */
public final class lbw implements mok<moc> {
    private final mok<moc> a;

    /* renamed from: lbw$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ lbw a;
        private /* synthetic */ moc b;

        a(lbw lbw, moc moc) {
            this.a = lbw;
            this.b = moc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            miq miq = (miq) obj;
            akcr.b(miq, "it");
            return lbw.a(miq, this.b);
        }
    }

    public lbw(mok<? super moc> mok) {
        akcr.b(mok, "resourceUriResolver");
        this.a = mok;
    }

    static miq a(miq miq, moc moc) {
        return (!(miq instanceof a) || moc.b()) ? miq : mir.a((a) miq);
    }

    public final ajdj<miq> a(moc moc) {
        akcr.b(moc, "request");
        Object f = this.a.a(moc).f(new a(this, moc));
        akcr.a(f, "resourceUriResolver.reso…tAuthority(it, request) }");
        return f;
    }

    public final miq b(moc moc) {
        akcr.b(moc, "request");
        return lbw.a(this.a.b(moc), moc);
    }

    public final boolean c(moc moc) {
        akcr.b(moc, "request");
        return this.a.c(moc);
    }

    public final ajdp<moh> d(moc moc) {
        akcr.b(moc, "request");
        return this.a.d(moc);
    }
}
