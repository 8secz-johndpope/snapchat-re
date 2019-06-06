package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aare */
public final class aare extends abhw {
    public Long a;
    public Long b;
    public abbd c;
    public Long d;
    public Long e;

    private aare a() {
        aare aare = (aare) super.clone();
        Long l = this.a;
        if (l != null) {
            aare.a = l;
        }
        l = this.b;
        if (l != null) {
            aare.b = l;
        }
        abbd abbd = this.c;
        if (abbd != null) {
            aare.c = abbd;
        }
        l = this.d;
        if (l != null) {
            aare.d = l;
        }
        l = this.e;
        if (l != null) {
            aare.e = l;
        }
        return aare;
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
        abbd abbd = this.c;
        if (abbd != null) {
            hashMap.put("source_type", abbd.toString());
        }
        l = this.d;
        if (l != null) {
            hashMap.put("current_status_count", l);
        }
        l = this.e;
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
        return asDictionary().equals(((aare) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_STATUS_OPEN";
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
        abbd abbd = this.c;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
