package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: quu */
public final class quu {
    private final Map<Long, Map<String, qvq>> a = new LinkedHashMap();

    public final synchronized qvq a(long j, String str) {
        akcr.b(str, "username");
        Map map = (Map) this.a.get(Long.valueOf(j));
        if (map == null) {
            return null;
        }
        return (qvq) map.get(str);
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void a(long j) {
        this.a.remove(Long.valueOf(j));
    }

    public final synchronized void a(qvq qvq) {
        akcr.b(qvq, "seqNums");
        Map map = this.a;
        Long valueOf = Long.valueOf(qvq.a);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new LinkedHashMap();
            map.put(valueOf, obj);
        }
        ((Map) obj).put(qvq.b, qvq);
    }

    public final synchronized void b(long j, String str) {
        akcr.b(str, "username");
        Map map = (Map) this.a.get(Long.valueOf(j));
        if (map != null) {
            map.remove(str);
        }
    }
}
