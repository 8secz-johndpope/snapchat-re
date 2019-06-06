package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaqu */
public final class aaqu extends abhw {
    public Long a;
    public abbd b;
    public zyr c;

    private aaqu a() {
        aaqu aaqu = (aaqu) super.clone();
        Long l = this.a;
        if (l != null) {
            aaqu.a = l;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aaqu.b = abbd;
        }
        zyr zyr = this.c;
        if (zyr != null) {
            aaqu.c = zyr;
        }
        return aaqu;
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
        return asDictionary().equals(((aaqu) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_ONBOARDING_OPEN";
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
        if (zyr != null) {
            i = zyr.hashCode();
        }
        return hashCode + i;
    }
}
