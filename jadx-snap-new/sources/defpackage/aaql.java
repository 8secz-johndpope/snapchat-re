package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaql */
public final class aaql extends abhw {
    public Long a;
    public abbd b;
    public String c;
    public Long d;
    public Long e;
    private aarb f;

    private aaql a() {
        aaql aaql = (aaql) super.clone();
        Long l = this.a;
        if (l != null) {
            aaql.a = l;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aaql.b = abbd;
        }
        aarb aarb = this.f;
        if (aarb != null) {
            aaql.f = aarb;
        }
        String str = this.c;
        if (str != null) {
            aaql.c = str;
        }
        l = this.d;
        if (l != null) {
            aaql.d = l;
        }
        l = this.e;
        if (l != null) {
            aaql.e = l;
        }
        return aaql;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        abbd abbd = this.b;
        if (abbd != null) {
            hashMap.put("source_type", abbd.toString());
        }
        aarb aarb = this.f;
        if (aarb != null) {
            hashMap.put("map_source_type", aarb.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("visible_status_id", str);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("status_available_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("status_unread_count", l);
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
        return asDictionary().equals(((aaql) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_EXPLORE_OPEN";
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
        aarb aarb = this.f;
        hashCode = (hashCode + (aarb != null ? aarb.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
