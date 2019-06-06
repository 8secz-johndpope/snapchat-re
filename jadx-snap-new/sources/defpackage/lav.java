package defpackage;

import java.util.Map;

/* renamed from: lav */
public final class lav implements aiqc<miw> {
    private final ajwy<miw> a;
    private final ajwy<Map<mje, kxq>> b;

    public static miw a(miw miw, Map<mje, kxq> map) {
        return (miw) aiqf.a(kyd.a(miw, (Map) map), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lav.a((miw) this.a.get(), (Map) this.b.get());
    }
}
