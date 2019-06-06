package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aarl */
public final class aarl extends abhw {
    public Long a;
    public abbd b;
    public aapt c;
    public aapt d;
    public Boolean e;
    public Long f;
    public Long g;
    public aapu h;
    public Long i;

    private aarl a() {
        aarl aarl = (aarl) super.clone();
        Long l = this.a;
        if (l != null) {
            aarl.a = l;
        }
        abbd abbd = this.b;
        if (abbd != null) {
            aarl.b = abbd;
        }
        aapt aapt = this.c;
        if (aapt != null) {
            aarl.c = aapt;
        }
        aapt = this.d;
        if (aapt != null) {
            aarl.d = aapt;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aarl.e = bool;
        }
        l = this.f;
        if (l != null) {
            aarl.f = l;
        }
        l = this.g;
        if (l != null) {
            aarl.g = l;
        }
        aapu aapu = this.h;
        if (aapu != null) {
            aarl.h = aapu;
        }
        l = this.i;
        if (l != null) {
            aarl.i = l;
        }
        return aarl;
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
        aapt aapt = this.c;
        if (aapt != null) {
            hashMap.put("location_sharing_setting", aapt.toString());
        }
        aapt = this.d;
        if (aapt != null) {
            hashMap.put("previous_location_sharing_setting", aapt.toString());
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("has_user_onboarded", bool);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("custom_friend_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("blacklist_friend_count", l);
        }
        aapu aapu = this.h;
        if (aapu != null) {
            hashMap.put("location_sharing_setting_update_type", aapu.toString());
        }
        l = this.i;
        if (l != null) {
            hashMap.put("duration_of_ghost_mode_seconds", l);
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
        return asDictionary().equals(((aarl) obj).asDictionary());
    }

    public final String getEventName() {
        return "MAP_USER_LOCATION_SHARING_SETTING";
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
        aapt aapt = this.c;
        hashCode = (hashCode + (aapt != null ? aapt.hashCode() : 0)) * 31;
        aapt = this.d;
        hashCode = (hashCode + (aapt != null ? aapt.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aapu aapu = this.h;
        hashCode = (hashCode + (aapu != null ? aapu.hashCode() : 0)) * 31;
        l = this.i;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
