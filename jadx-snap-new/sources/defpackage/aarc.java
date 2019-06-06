package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aarc */
public final class aarc extends abhw {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    private Double e;

    private aarc a() {
        aarc aarc = (aarc) super.clone();
        Long l = this.a;
        if (l != null) {
            aarc.a = l;
        }
        l = this.b;
        if (l != null) {
            aarc.b = l;
        }
        Double d = this.e;
        if (d != null) {
            aarc.e = d;
        }
        l = this.c;
        if (l != null) {
            aarc.c = l;
        }
        l = this.d;
        if (l != null) {
            aarc.d = l;
        }
        return aarc;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("status_session_id", l);
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("current_status_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("status_options_count", l);
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
        return asDictionary().equals(((aarc) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_STATUS_CLOSE";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
