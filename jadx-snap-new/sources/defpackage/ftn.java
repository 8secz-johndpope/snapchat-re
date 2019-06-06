package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Map;

/* renamed from: ftn */
public final class ftn implements aiqc<ftl> {
    private final ajwy<Map<String, ? extends aipn<ftk>>> a;
    private final ajwy<ajdx<iha>> b;
    private final ajwy<zgb> c;

    public static ftl a(Map<String, ? extends aipn<ftk>> map, ajdx<iha> ajdx, zgb zgb) {
        return (ftl) aiqf.a(new ftl(ImmutableList.copyOf(map.values()), ajdx), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ftn.a((Map) this.a.get(), (ajdx) this.b.get(), (zgb) this.c.get());
    }
}
