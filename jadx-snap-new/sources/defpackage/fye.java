package defpackage;

import java.util.Set;

/* renamed from: fye */
public final class fye implements aiqc<Set<ygh>> {
    private final ajwy<ghb> a;

    public static Set<ygh> a(ghb ghb) {
        Object values = ghb.a.values();
        akcr.a(values, "fileGroups.values");
        return (Set) aiqf.a(ajyu.m((Iterable) values), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fye.a((ghb) this.a.get());
    }
}
