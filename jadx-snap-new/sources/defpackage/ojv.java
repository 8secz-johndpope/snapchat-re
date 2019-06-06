package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: ojv */
public final class ojv implements aiqc<Set<gfp>> {
    private final ajwy<pev> a;
    private final ajwy<pey> b;
    private final ajwy<pfh> c;
    private final ajwy<pfc> d;
    private final ajwy<pex> e;

    public static Set<gfp> a(pev pev, pey pey, pfh pfh, pfc pfc, pex pex) {
        akcr.b(pev, "memoriesMediaContentType");
        akcr.b(pey, "memoriesOverlayContentType");
        akcr.b(pfh, "memoriesThumbnailContentType");
        akcr.b(pfc, "memoriesSnapEditsContentType");
        akcr.b(pex, "memoriesMiniThumbnailContentType");
        Object of = ImmutableSet.of(pev, pey, pfh, pfc, pex);
        akcr.a(of, "ImmutableSet.of(memories…MiniThumbnailContentType)");
        return (Set) aiqf.a((Set) of, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ojv.a((pev) this.a.get(), (pey) this.b.get(), (pfh) this.c.get(), (pfc) this.d.get(), (pex) this.e.get());
    }
}
