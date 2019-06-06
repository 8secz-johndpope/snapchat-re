package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aarm */
public final class aarm extends abhw {
    public Long a;
    public aarb b;
    public zyr c;
    public Long d;
    public Long e;
    public Long f;
    public Double g;
    public String h;
    private Long i;
    private Long j;
    private String k;

    private aarm a() {
        aarm aarm = (aarm) super.clone();
        Long l = this.a;
        if (l != null) {
            aarm.a = l;
        }
        aarb aarb = this.b;
        if (aarb != null) {
            aarm.b = aarb;
        }
        zyr zyr = this.c;
        if (zyr != null) {
            aarm.c = zyr;
        }
        l = this.d;
        if (l != null) {
            aarm.d = l;
        }
        l = this.e;
        if (l != null) {
            aarm.e = l;
        }
        l = this.f;
        if (l != null) {
            aarm.f = l;
        }
        Double d = this.g;
        if (d != null) {
            aarm.g = d;
        }
        l = this.i;
        if (l != null) {
            aarm.i = l;
        }
        l = this.j;
        if (l != null) {
            aarm.j = l;
        }
        String str = this.h;
        if (str != null) {
            aarm.h = str;
        }
        str = this.k;
        if (str != null) {
            aarm.k = str;
        }
        return aarm;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        aarb aarb = this.b;
        if (aarb != null) {
            hashMap.put("source", aarb.toString());
        }
        zyr zyr = this.c;
        if (zyr != null) {
            hashMap.put("action", zyr.toString());
        }
        l = this.d;
        if (l != null) {
            hashMap.put("target_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("map_friend_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("viewport_friend_count", l);
        }
        Double d = this.g;
        if (d != null) {
            hashMap.put("distance_from_user_meter", d);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("target_unviewed_status_count", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("target_viewed_status_count", l);
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("target_user_ids", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("ghost_target_user_ids", str);
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
        return asDictionary().equals(((aarm) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_USER_VIEW";
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
        aarb aarb = this.b;
        hashCode = (hashCode + (aarb != null ? aarb.hashCode() : 0)) * 31;
        zyr zyr = this.c;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.g;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
