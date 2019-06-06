package defpackage;

import java.util.Set;

/* renamed from: ikg */
public final class ikg implements aiqc<Set<gfp>> {
    private final ajwy<ije> a;
    private final ajwy<ijf> b;

    public static Set<gfp> a(ije ije, ijf ijf) {
        akcr.b(ije, "geofilterContentType");
        akcr.b(ijf, "geofilterOverlayContentType");
        return (Set) aiqf.a(ajzt.a((Object[]) new gfz[]{ije, ijf}), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ikg.a((ije) this.a.get(), (ijf) this.b.get());
    }
}
