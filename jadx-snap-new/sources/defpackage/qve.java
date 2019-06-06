package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: qve */
public final class qve {
    private final Map<Long, qvc> a = new LinkedHashMap();

    public final qvc a(long j) {
        Map map = this.a;
        Long valueOf = Long.valueOf(j);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new qvc();
            map.put(valueOf, obj);
        }
        return (qvc) obj;
    }

    public final void a() {
        this.a.clear();
    }
}
