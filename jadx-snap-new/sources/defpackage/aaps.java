package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaps */
public final class aaps implements Cloneable {
    public String a;
    public Long b;

    public aaps(aaps aaps) {
        this.a = aaps.a;
        this.b = aaps.b;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("location_level_request", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("location_update_time_ms", l);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aaps clone() {
        aaps aaps = (aaps) super.clone();
        String str = this.a;
        if (str != null) {
            aaps.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aaps.b = l;
        }
        return aaps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaps) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
