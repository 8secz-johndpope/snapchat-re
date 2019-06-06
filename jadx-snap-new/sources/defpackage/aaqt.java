package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqt */
public final class aaqt extends abhw {
    public Long a;
    public abbd b;
    public zyr c;
    public Long d;
    public Boolean e;
    private Long f;
    private Long g;

    private aaqt a() {
        aaqt aaqt = (aaqt) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqt.a = l;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aaqt.b = abbd;
        }
        zyr zyr = this.c;
        if (zyr != null) {
            aaqt.c = zyr;
        }
        l = this.d;
        if (l != null) {
            aaqt.d = l;
        }
        l = this.f;
        if (l != null) {
            aaqt.f = l;
        }
        l = this.g;
        if (l != null) {
            aaqt.g = l;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aaqt.e = bool;
        }
        return aaqt;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        abbd abbd = this.b;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        zyr zyr = this.c;
        if (zyr != null) {
            hashMap.put("action", zyr.toString());
        }
        l = this.d;
        if (l != null) {
            hashMap.put("viewport_friend_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("viewport_unviewed_status_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("viewport_viewed_status_count", l);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("has_seen_tooltip", bool);
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
        return asDictionary().equals(((aaqt) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_MAP_OPEN";
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
        abbd abbd = this.b;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        zyr zyr = this.c;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
