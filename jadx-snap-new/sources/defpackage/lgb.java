package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.gson.Gson;
import java.util.Set;

/* renamed from: lgb */
public final class lgb implements aiqc<mvc> {
    private final ajwy<Context> a;
    private final ajwy<Gson> b;
    private final ajwy<mxa> c;
    private final ajwy<mwp> d;
    private final ajwy<ldu> e;
    private final ajwy<lff> f;
    private final ajwy<kqf> g;
    private final ajwy<Set<? extends mwe>> h;
    private final ajwy<lgx> i;
    private final ajwy<lfp> j;
    private final ajwy<lhg> k;
    private final ajwy<mzn> l;
    private final ajwy<ide> m;
    private final ajwy<zgb> n;
    private final ajwy<miw> o;
    private final ajwy<Supplier<iha>> p;

    public static mvc a(Context context, Gson gson, mxa mxa, mwp mwp, ldu ldu, lff lff, kqf kqf, Set<? extends mwe> set, lgx lgx, lfp lfp, lhg lhg, mzn mzn, ide ide, zgb zgb, miw miw, Supplier<iha> supplier) {
        return (mvc) aiqf.a(lfv.a(context, gson, mxa, mwp, ldu, lff, kqf, set, lgx, lfp, lhg, mzn, ide, zgb, miw, supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lgb.a((Context) this.a.get(), (Gson) this.b.get(), (mxa) this.c.get(), (mwp) this.d.get(), (ldu) this.e.get(), (lff) this.f.get(), (kqf) this.g.get(), (Set) this.h.get(), (lgx) this.i.get(), (lfp) this.j.get(), (lhg) this.k.get(), (mzn) this.l.get(), (ide) this.m.get(), (zgb) this.n.get(), (miw) this.o.get(), (Supplier) this.p.get());
    }
}
