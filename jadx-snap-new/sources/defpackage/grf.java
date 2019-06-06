package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: grf */
public final class grf implements aiqc<Set<gqw>> {
    private final ajwy<gsw> a;
    private final ajwy<gsu> b;

    public static Set<gqw> a(ajwy<gsw> ajwy, ajwy<gsu> ajwy2) {
        return (Set) aiqf.a(Sets.newHashSet((gqw) ajwy.get(), (gqw) ajwy2.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return grf.a(this.a, this.b);
    }
}
