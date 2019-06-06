package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: fzy */
public final class fzy implements aiqc<Set<ifj>> {
    private final ajwy<gkw> a;
    private final ajwy<gkn> b;
    private final ajwy<gkq> c;
    private final ajwy<gks> d;
    private final ajwy<geu> e;
    private final ajwy<ggr> f;
    private final ajwy<gda> g;

    public static Set<ifj> a(gkw gkw, gkn gkn, gkq gkq, gks gks, geu geu, ggr ggr, gda gda) {
        return (Set) aiqf.a(ImmutableSet.of(gkw, gkn, gkq, gks, geu, ggr, gda), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fzy.a((gkw) this.a.get(), (gkn) this.b.get(), (gkq) this.c.get(), (gks) this.d.get(), (geu) this.e.get(), (ggr) this.f.get(), (gda) this.g.get());
    }
}
