package defpackage;

import defpackage.mvc.c;
import java.util.Set;

/* renamed from: mvp */
public final class mvp implements aiqc<mwe> {
    private final ajwy<mvv> a;
    private final ajwy<Set<mwe>> b;
    private final ajwy<ide> c;
    private final ajwy<zgb> d;
    private final ajwy<Boolean> e;

    public static mwe a(mvv mvv, Set<mwe> set, ide ide, zgb zgb, boolean z) {
        return (mwe) aiqf.a(c.a(mvv, (Set) set, ide, zgb, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mvp.a((mvv) this.a.get(), (Set) this.b.get(), (ide) this.c.get(), (zgb) this.d.get(), ((Boolean) this.e.get()).booleanValue());
    }
}
