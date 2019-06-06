package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dke */
public final class dke implements aiqc<Map<String, dku>> {
    private final ajwy<List<zyq>> a;
    private final ajwy<Map<String, dio>> b;
    private final ajwy<ilv> c;

    public static Map<String, dku> a(List<zyq> list, Map<String, dio> map, ilv ilv) {
        HashMap hashMap = new HashMap();
        for (zyq zyq : list) {
            hashMap.put(zyq.a, new dkv(zyq.a, (dio) map.get(zyq.a), ilv));
        }
        return (Map) aiqf.a(hashMap, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dke.a((List) this.a.get(), (Map) this.b.get(), (ilv) this.c.get());
    }
}
