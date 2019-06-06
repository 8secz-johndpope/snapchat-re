package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: gaw */
public final class gaw implements aiqc<Set<gqg>> {
    private final ajwy<gpk> a;
    private final ajwy<gpo> b;

    public static Set<gqg> a(gpk gpk, gpo gpo) {
        akcr.b(gpk, "rxUncaughtExceptionHandlerFactory");
        akcr.b(gpo, "threadShutdownExceptionHandlerFactory");
        Object of = ImmutableSet.of(gpk, gpo);
        akcr.a(of, "ImmutableSet.of(rxUncaug…nExceptionHandlerFactory)");
        return (Set) aiqf.a((Set) of, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gaw.a((gpk) this.a.get(), (gpo) this.b.get());
    }
}
