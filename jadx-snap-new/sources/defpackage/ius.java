package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: ius */
public final class ius implements aiqc<Set<itq>> {
    static {
        ius ius = new ius();
    }

    public static Set<itq> a() {
        return (Set) aiqf.a(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ius.a();
    }
}
