package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: heh */
public final class heh implements aiqc<Set<gfp>> {
    private final ajwy<gxp> a;
    private final ajwy<gxr> b;
    private final ajwy<gxn> c;
    private final ajwy<gxk> d;

    public static Set<gfp> a(gxp gxp, gxr gxr, gxn gxn, gxk gxk) {
        akcr.b(gxp, "discoverStorySnapContentType");
        akcr.b(gxr, "discoverStoryStreamingSnapType");
        akcr.b(gxn, "discoverPublisherSnapContentType");
        akcr.b(gxk, "discoverFeedPublisherSnapMediaContentType");
        Object of = ImmutableSet.of(gxp, gxr, gxn, gxk);
        akcr.a(of, "ImmutableSet.of(\n       …sherSnapMediaContentType)");
        return (Set) aiqf.a((Set) of, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return heh.a((gxp) this.a.get(), (gxr) this.b.get(), (gxn) this.c.get(), (gxk) this.d.get());
    }
}
