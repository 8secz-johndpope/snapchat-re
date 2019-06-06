package defpackage;

import com.snap.blizzard.v1.request.BlizzardRequestInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dko */
public final class dko implements aiqc<Map<String, dle>> {
    private final ajwy<List<zyq>> a;
    private final ajwy<BlizzardRequestInterface> b;
    private final ajwy<dje> c;
    private final ajwy<dii> d;
    private final ajwy<zfw> e;
    private final ajwy<ajdw> f;
    private final ajwy<zyo> g;

    public static Map<String, dle> a(List<zyq> list, aipn<BlizzardRequestInterface> aipn, aipn<dje> aipn2, aipn<dii> aipn3, aipn<zfw> aipn4, aipn<ajdw> aipn5, zyo zyo) {
        HashMap hashMap = new HashMap();
        for (zyq zyq : list) {
            hashMap.put(zyq.a, new dld(zyq.a, aipn, (String) zyq.b.get(zyo), aipn2, aipn3, aipn4, aipn5));
        }
        return (Map) aiqf.a(hashMap, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dko.a((List) this.a.get(), aiqb.b(this.b), aiqb.b(this.c), aiqb.b(this.d), aiqb.b(this.e), aiqb.b(this.f), (zyo) this.g.get());
    }
}
