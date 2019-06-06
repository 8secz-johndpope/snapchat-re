package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aast */
public final class aast implements Cloneable {
    private Long a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private String h;

    public aast(aast aast) {
        this.a = aast.a;
        this.b = aast.b;
        this.c = aast.c;
        this.d = aast.d;
        this.e = aast.e;
        this.f = aast.f;
        this.g = aast.g;
        this.h = aast.h;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("network_activity_time_ms", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("network_wifi_activity_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("network_wwan_activity_time_ms", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("network_radio_overhead_time_ms", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("network_wifi_radio_overhead_time_ms", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("network_wwan_radio_overhead_time_ms", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("network_activity_count", l);
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("network_activity_attribution_map", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aast clone() {
        aast aast = (aast) super.clone();
        Long l = this.a;
        if (l != null) {
            aast.a = l;
        }
        l = this.b;
        if (l != null) {
            aast.b = l;
        }
        l = this.c;
        if (l != null) {
            aast.c = l;
        }
        l = this.d;
        if (l != null) {
            aast.d = l;
        }
        l = this.e;
        if (l != null) {
            aast.e = l;
        }
        l = this.f;
        if (l != null) {
            aast.f = l;
        }
        l = this.g;
        if (l != null) {
            aast.g = l;
        }
        String str = this.h;
        if (str != null) {
            aast.h = str;
        }
        return aast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aast) obj).a());
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
        l2 = this.f;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.g;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
