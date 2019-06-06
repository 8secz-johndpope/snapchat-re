package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqg */
public final class aaqg extends abhw {
    public Long a;
    public zyr b;
    public Double c;
    public Long d;
    public Long e;

    private aaqg a() {
        aaqg aaqg = (aaqg) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqg.a = l;
        }
        zyr zyr = this.b;
        if (zyr != null) {
            aaqg.b = zyr;
        }
        Double d = this.c;
        if (d != null) {
            aaqg.c = d;
        }
        l = this.d;
        if (l != null) {
            aaqg.d = l;
        }
        l = this.e;
        if (l != null) {
            aaqg.e = l;
        }
        return aaqg;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        zyr zyr = this.b;
        if (zyr != null) {
            hashMap.put("action", zyr.toString());
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("distance_in_meters", d);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("map_friend_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("viewport_friend_count", l);
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
        return asDictionary().equals(((aaqg) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_COMPASS_ACTION";
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
        zyr zyr = this.b;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
