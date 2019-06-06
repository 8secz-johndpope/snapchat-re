package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabn */
public final class aabn implements Cloneable {
    public Double a;
    public Long b;
    public Long c;

    public aabn(aabn aabn) {
        this.a = aabn.a;
        this.b = aabn.b;
        this.c = aabn.c;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("batt_level_curr", d);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("dischg_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("chg_time_ms", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aabn clone() {
        aabn aabn = (aabn) super.clone();
        Double d = this.a;
        if (d != null) {
            aabn.a = d;
        }
        Long l = this.b;
        if (l != null) {
            aabn.b = l;
        }
        l = this.c;
        if (l != null) {
            aabn.c = l;
        }
        return aabn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aabn) obj).a());
    }

    public final int hashCode() {
        Double d = this.a;
        int i = 0;
        int hashCode = ((d != null ? d.hashCode() : 0) + 381486) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
