package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aard */
public final class aard extends abhw {
    public Long a;
    public Long b;
    public Long c;
    public Long d;

    private aard a() {
        aard aard = (aard) super.clone();
        Long l = this.a;
        if (l != null) {
            aard.a = l;
        }
        l = this.b;
        if (l != null) {
            aard.b = l;
        }
        l = this.c;
        if (l != null) {
            aard.c = l;
        }
        l = this.d;
        if (l != null) {
            aard.d = l;
        }
        return aard;
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
        l = this.c;
        if (l != null) {
            hashMap.put("status_type_enum", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("view_count", l);
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
        return asDictionary().equals(((aard) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_STATUS_DELETE";
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
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
