package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: ruu */
public final class ruu implements aiqc<Set<zii>> {
    private final ajwy<rwf> a;
    private final ajwy<rwc> b;

    public static Set<zii> a(rwf rwf, rwc rwc) {
        return (Set) aiqf.a(ImmutableSet.of(rwf, rwc), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ruu.a((rwf) this.a.get(), (rwc) this.b.get());
    }
}
