package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aasu */
public final class aasu implements Cloneable {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public String f;

    public aasu(aasu aasu) {
        this.a = aasu.a;
        this.b = aasu.b;
        this.c = aasu.c;
        this.d = aasu.d;
        this.e = aasu.e;
        this.f = aasu.f;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("network_mobile_high_time_sec", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("network_mobile_low_time_sec", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("network_mobile_wakeup_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("network_wifi_active_time_sec", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("network_wifi_wakeup_count", l);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("network_wakeup_attribution_map", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aasu clone() {
        aasu aasu = (aasu) super.clone();
        Long l = this.a;
        if (l != null) {
            aasu.a = l;
        }
        l = this.b;
        if (l != null) {
            aasu.b = l;
        }
        l = this.c;
        if (l != null) {
            aasu.c = l;
        }
        l = this.d;
        if (l != null) {
            aasu.d = l;
        }
        l = this.e;
        if (l != null) {
            aasu.e = l;
        }
        String str = this.f;
        if (str != null) {
            aasu.f = str;
        }
        return aasu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aasu) obj).a());
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        Long l2 = this.b;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.c;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.d;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.e;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
