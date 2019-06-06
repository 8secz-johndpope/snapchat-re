package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalh */
public final class aalh extends abhw {
    public aali a;
    public Long b;
    private Long c;

    private aalh a() {
        aalh aalh = (aalh) super.clone();
        aali aali = this.a;
        if (aali != null) {
            aalh.a = aali;
        }
        Long l = this.b;
        if (l != null) {
            aalh.b = l;
        }
        l = this.c;
        if (l != null) {
            aalh.c = l;
        }
        return aalh;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aali aali = this.a;
        if (aali != null) {
            hashMap.put("event_type", aali.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("operation_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("rewrap_count", l);
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
        return asDictionary().equals(((aalh) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_OPS_LATENCY";
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
        aali aali = this.a;
        int i = 0;
        hashCode = (hashCode + (aali != null ? aali.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
