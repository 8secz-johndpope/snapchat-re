package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

/* renamed from: dal */
public class dal extends das<dal> {
    public long a;
    public long b;
    public long c;
    public final Map<String, Long> d;
    public final Map<String, dao> e;

    dal() {
        this(new HashMap(1), new HashMap());
    }

    private dal(Map<String, Long> map, Map<String, dao> map2) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = map;
        this.e = map2;
    }

    private dal a(dal dal) {
        this.a = dal.a;
        this.b = dal.b;
        this.c = dal.c;
        this.d.clear();
        this.d.putAll(dal.d);
        this.e.clear();
        this.e.putAll(das.a(dal.e, null));
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        dal dal = (dal) das;
        dal dal2 = (dal) das2;
        if (dal2 == null) {
            dal2 = new dal();
        }
        if (dal == null) {
            dal2.a(this);
        } else {
            Map hashMap = new HashMap(this.d);
            for (Entry entry : dal.d.entrySet()) {
                Long l = (Long) hashMap.get(entry.getKey());
                hashMap.put(entry.getKey(), Long.valueOf((l == null ? 0 : l.longValue()) - ((Long) entry.getValue()).longValue()));
            }
            dal2.a = this.a - dal.a;
            dal2.b = this.b - dal.b;
            dal2.c = this.c - dal.c;
            dal2.a(hashMap);
            dal2.b(das.a(this.e, dal.e, -$$Lambda$DAHKiV9YOpN9Uvh2JXwB79126-8.INSTANCE));
        }
        return dal2;
    }

    public final void a(Map<String, Long> map) {
        this.d.clear();
        this.d.putAll(map);
    }

    public final /* synthetic */ das b(das das, das das2) {
        dal dal = (dal) das;
        dal dal2 = (dal) das2;
        if (dal2 == null) {
            dal2 = new dal();
        }
        if (dal == null) {
            dal2.a(this);
        } else {
            Map hashMap = new HashMap(this.d);
            for (Entry entry : dal.d.entrySet()) {
                Long l = (Long) hashMap.get(entry.getKey());
                hashMap.put(entry.getKey(), Long.valueOf(((Long) entry.getValue()).longValue() + (l == null ? 0 : l.longValue())));
            }
            dal2.a = this.a + dal.a;
            dal2.b = this.b + dal.b;
            dal2.c = this.c + dal.c;
            dal2.a(hashMap);
            dal2.b(das.b(this.e, dal.e));
        }
        return dal2;
    }

    public final void b(Map<String, dao> map) {
        this.e.clear();
        this.e.putAll(das.a((Map) map, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dal dal = (dal) obj;
            return this.a == dal.a && this.b == dal.b && this.c == dal.c && Objects.equals(this.d, dal.d) && Objects.equals(this.e, dal.e);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraOpenMetrics{cameraOpenTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cameraVisibleTimeMs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", cameraLeakedTimeMs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", cameraOptimizedTimeMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cameraAttributionTimeMapMs=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
