package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: grm */
public final class grm implements aiqc<Set<gqx>> {
    private final ajwy<abss> a;
    private final ajwy<gsr> b;
    private final ajwy<gsv> c;
    private final ajwy<gst> d;

    public static Set<gqx> a(abss abss, gsr gsr, gsv gsv, gst gst) {
        Object[] objArr = abss.b() ? new gqx[]{gsr, gsv, gst} : abss.f() ? new gqx[]{gsv, gst} : new gqx[]{gst};
        return (Set) aiqf.a(Sets.newHashSet(objArr), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return grm.a((abss) this.a.get(), (gsr) this.b.get(), (gsv) this.c.get(), (gst) this.d.get());
    }
}
