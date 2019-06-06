package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: dkc */
public final class dkc implements aiqc<Map<String, dif>> {
    private final ajwy<List<zyq>> a;
    private final ajwy<dij> b;
    private final ajwy<ajdw> c;
    private final ajwy<abss> d;
    private final ajwy<dii> e;
    private final ajwy<dje> f;
    private final ajwy<ilv> g;
    private final ajwy<Map<String, dku>> h;
    private final ajwy<Map<String, dio>> i;
    private final ajwy<Map<String, dle>> j;
    private final ajwy<Map<String, din>> k;
    private final ajwy<dll> l;
    private final ajwy<ifa> m;
    private final ajwy<hwl> n;
    private final ajwy<diz> o;

    public static Map<String, dif> a(List<zyq> list, dij dij, ajdw ajdw, abss abss, dii dii, dje dje, ilv ilv, Map<String, dku> map, Map<String, dio> map2, Map<String, dle> map3, Map<String, din> map4, dll dll, ifa ifa, aipn<hwl> aipn, diz diz) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zyq zyq = (zyq) it.next();
            String str = zyq.a;
            Iterator it2 = it;
            dif dif = r3;
            dif dif2 = new dif(zyq, dij, ajdw, abss, dii, dje, ilv, (dku) map.get(str), (dio) map2.get(str), (dle) map3.get(str), (din) map4.get(str), dll, ifa, diz, aipn);
            hashMap.put(str, dif);
            it = it2;
        }
        return (Map) aiqf.a(hashMap, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dkc.a((List) this.a.get(), (dij) this.b.get(), (ajdw) this.c.get(), (abss) this.d.get(), (dii) this.e.get(), (dje) this.f.get(), (ilv) this.g.get(), (Map) this.h.get(), (Map) this.i.get(), (Map) this.j.get(), (Map) this.k.get(), (dll) this.l.get(), (ifa) this.m.get(), aiqb.b(this.n), (diz) this.o.get());
    }
}
