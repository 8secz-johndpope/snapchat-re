package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: djz */
public final class djz implements aiqc<Map<String, din>> {
    private final ajwy<List<zyq>> a;
    private final ajwy<Map<String, dio>> b;
    private final ajwy<Map<String, dle>> c;
    private final ajwy<abss> d;
    private final ajwy<ilv> e;
    private final ajwy<dje> f;

    public static Map<String, din> a(List<zyq> list, Map<String, dio> map, Map<String, dle> map2, abss abss, ilv ilv, dje dje) {
        HashMap hashMap = new HashMap();
        for (zyq zyq : list) {
            abss abss2 = abss;
            ilv ilv2 = ilv;
            dje dje2 = dje;
            hashMap.put(zyq.a, new din((dio) map.get(zyq.a), abss2, (dle) map2.get(zyq.a), ilv2, zyq.a, dje2, zyq.d.longValue()));
        }
        return (Map) aiqf.a(hashMap, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return djz.a((List) this.a.get(), (Map) this.b.get(), (Map) this.c.get(), (abss) this.d.get(), (ilv) this.e.get(), (dje) this.f.get());
    }
}
