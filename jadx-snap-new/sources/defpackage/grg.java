package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: grg */
public final class grg implements aiqc<Set<gqy>> {
    private final ajwy<gsz> a;
    private final ajwy<gsx> b;

    public static Set<gqy> a(ajwy<gsz> ajwy, ajwy<gsx> ajwy2) {
        return (Set) aiqf.a(Sets.newHashSet((gqy) ajwy.get(), (gqy) ajwy2.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return grg.a(this.a, this.b);
    }
}
