package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacp */
public final class aacp extends abhw {
    public Long a;
    public Long b;
    private Boolean c;
    private abaf d;

    private aacp a() {
        aacp aacp = (aacp) super.clone();
        Long l = this.a;
        if (l != null) {
            aacp.a = l;
        }
        l = this.b;
        if (l != null) {
            aacp.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aacp.c = bool;
        }
        abaf abaf = this.d;
        if (abaf != null) {
            aacp.a(abaf.clone());
        }
        return aacp;
    }

    public final void a(abaf abaf) {
        if (abaf == null) {
            this.d = null;
        } else {
            this.d = new abaf(abaf);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("latency_millis", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("content_duration_millis", l);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("zsl_capture", bool);
        }
        abaf abaf = this.d;
        if (abaf != null) {
            hashMap.putAll(abaf.a());
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
        return asDictionary().equals(((aacp) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_SNAP_CREATE_DELAY";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abaf abaf = this.d;
        if (abaf != null) {
            i = abaf.hashCode();
        }
        return hashCode + i;
    }
}
