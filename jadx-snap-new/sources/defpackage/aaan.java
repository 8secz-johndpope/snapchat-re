package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaan */
public final class aaan extends abhw {
    public Long a;
    public Long b;
    public Long c;
    public Double d;
    private Long e;

    private aaan a() {
        aaan aaan = (aaan) super.clone();
        Long l = this.e;
        if (l != null) {
            aaan.e = l;
        }
        l = this.a;
        if (l != null) {
            aaan.a = l;
        }
        l = this.b;
        if (l != null) {
            aaan.b = l;
        }
        l = this.c;
        if (l != null) {
            aaan.c = l;
        }
        Double d = this.d;
        if (d != null) {
            aaan.d = d;
        }
        return aaan;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.e;
        if (l != null) {
            hashMap.put("rejected_event_count", l);
        }
        l = this.a;
        if (l != null) {
            hashMap.put("overflowed_event_count", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("overflowed_critical_event_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("overflowed_p0_event_count", l);
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("first_failure_ts", d);
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
        return asDictionary().equals(((aaan) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_DATA_LOSS";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.e;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.a;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.d;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
