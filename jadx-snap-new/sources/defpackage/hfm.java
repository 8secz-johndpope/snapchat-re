package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: hfm */
public final class hfm implements aiqc<Set<hmi<hio>>> {
    private final ajwy<hmc> a;
    private final ajwy<hma> b;
    private final ajwy<hmb> c;

    public static Set<hmi<hio>> a(hmc hmc, hma hma, hmb hmb) {
        akcr.b(hmc, "friendStorySnapPrefetchRequestProvider");
        akcr.b(hma, "discoverStorySnapPrefetchRequestProvider");
        akcr.b(hmb, "dynamicStorySnapPrefetchRequestProvider");
        Object of = ImmutableSet.of(hmc, hma, hmb);
        akcr.a(of, "ImmutableSet.of(\n       …rdData>\n                )");
        return (Set) aiqf.a((Set) of, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hfm.a((hmc) this.a.get(), (hma) this.b.get(), (hmb) this.c.get());
    }
}
