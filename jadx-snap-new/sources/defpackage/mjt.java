package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.mjo.c;
import java.util.Set;

/* renamed from: mjt */
public final class mjt implements aiqc<Supplier<mmf>> {
    private final ajwy<Context> a;
    private final ajwy<mot> b;
    private final ajwy<zfw> c;
    private final ajwy<Supplier<iha>> d;
    private final ajwy<miw> e;
    private final ajwy<mka> f;
    private final ajwy<mpf> g;
    private final ajwy<Boolean> h;
    private final ajwy<Boolean> i;
    private final ajwy<mng> j;
    private final ajwy<mns> k;
    private final ajwy<lnr> l;
    private final ajwy<Set<? extends akbl<? super mmt, ? extends mph>>> m;
    private final ajwy<mio> n;
    private final ajwy<mmh> o;
    private final ajwy<Supplier<kpc>> p;
    private final ajwy<Boolean> q;
    private final ajwy<Boolean> r;

    public static Supplier<mmf> a(Context context, mot mot, zfw zfw, Supplier<iha> supplier, miw miw, mka mka, mpf mpf, boolean z, boolean z2, mng mng, mns mns, lnr lnr, Set<? extends akbl<? super mmt, ? extends mph>> set, mio mio, mmh mmh, Supplier<kpc> supplier2, boolean z3, boolean z4) {
        return (Supplier) aiqf.a(c.a(context, mot, zfw, supplier, miw, mka, mpf, z, z2, mng, mns, lnr, set, mio, mmh, supplier2, z3, z4), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mjt.a((Context) this.a.get(), (mot) this.b.get(), (zfw) this.c.get(), (Supplier) this.d.get(), (miw) this.e.get(), (mka) this.f.get(), (mpf) this.g.get(), ((Boolean) this.h.get()).booleanValue(), ((Boolean) this.i.get()).booleanValue(), (mng) this.j.get(), (mns) this.k.get(), (lnr) this.l.get(), (Set) this.m.get(), (mio) this.n.get(), (mmh) this.o.get(), (Supplier) this.p.get(), ((Boolean) this.q.get()).booleanValue(), ((Boolean) this.r.get()).booleanValue());
    }
}
