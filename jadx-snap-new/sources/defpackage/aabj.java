package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabj */
public final class aabj extends abhw {
    public String a;
    public aabc b;
    public Long c;
    public String d;
    public String e;
    private String f;
    private Long g;

    private aabj a() {
        aabj aabj = (aabj) super.clone();
        String str = this.f;
        if (str != null) {
            aabj.f = str;
        }
        str = this.a;
        if (str != null) {
            aabj.a = str;
        }
        aabc aabc = this.b;
        if (aabc != null) {
            aabj.b = aabc;
        }
        Long l = this.g;
        if (l != null) {
            aabj.g = l;
        }
        l = this.c;
        if (l != null) {
            aabj.c = l;
        }
        str = this.d;
        if (str != null) {
            aabj.d = str;
        }
        str = this.e;
        if (str != null) {
            aabj.e = str;
        }
        return aabj;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.f;
        if (str != null) {
            hashMap.put("battery_state", str);
        }
        str = this.a;
        if (str != null) {
            hashMap.put("network_state", str);
        }
        aabc aabc = this.b;
        if (aabc != null) {
            hashMap.put("app_state", aabc.toString());
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("time_allowed_to_prefetch", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("schedule_delay_latency_ms", l);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("media_type", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("prefetch_id", str);
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
        return asDictionary().equals(((aabj) obj).asDictionary());
    }

    public final String getEventName() {
        return "BACKGROUND_PREFETCH_PROCESSED";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.a;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabc aabc = this.b;
        hashCode = (hashCode + (aabc != null ? aabc.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
