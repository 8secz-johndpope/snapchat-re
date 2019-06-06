package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: fyd */
public final class fyd implements aiqc<ghp> {
    private final ajwy<Map<Class<? extends fts>, ajdx<fts>>> a;
    private final ajwy<Set<gfs>> b;
    private final ajwy<git> c;

    public static ghp a(Map<Class<? extends fts>, ajdx<fts>> map, Set<gfs> set, git git) {
        return (ghp) aiqf.a(new ghp(map, new geb(set), git), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fyd.a((Map) this.a.get(), (Set) this.b.get(), (git) this.c.get());
    }
}
