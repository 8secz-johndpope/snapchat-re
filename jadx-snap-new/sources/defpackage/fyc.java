package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: fyc */
public final class fyc implements aiqc<Set<gfs>> {
    static {
        fyc fyc = new fyc();
    }

    public static Set<gfs> a() {
        return (Set) aiqf.a(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fyc.a();
    }
}
