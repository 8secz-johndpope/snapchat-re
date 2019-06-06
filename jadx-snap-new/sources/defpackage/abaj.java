package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abaj */
public final class abaj extends abhw {
    private String a;
    private Long b;
    private Boolean c;

    private abaj a() {
        abaj abaj = (abaj) super.clone();
        String str = this.a;
        if (str != null) {
            abaj.a = str;
        }
        Long l = this.b;
        if (l != null) {
            abaj.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            abaj.c = bool;
        }
        return abaj;
    }

    public final void a(Boolean bool) {
        this.c = bool;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("scope", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("fetch_latency_ms", l);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("cache_hit", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abaj) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_ACCESS_TOKEN_FETCH";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.01d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
