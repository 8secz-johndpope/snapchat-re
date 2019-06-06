package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaav */
public final class aaav extends abhw {
    public Long a;
    public Long b;
    public aahz c;
    private Double d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private String h;
    private aabh i;

    private aaav a() {
        aaav aaav = (aaav) super.clone();
        Double d = this.d;
        if (d != null) {
            aaav.d = d;
        }
        Long l = this.a;
        if (l != null) {
            aaav.a = l;
        }
        l = this.b;
        if (l != null) {
            aaav.b = l;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aaav.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aaav.f = bool;
        }
        bool = this.g;
        if (bool != null) {
            aaav.g = bool;
        }
        aahz aahz = this.c;
        if (aahz != null) {
            aaav.c = aahz;
        }
        String str = this.h;
        if (str != null) {
            aaav.h = str;
        }
        aabh aabh = this.i;
        if (aabh != null) {
            aaav.i = aabh;
        }
        return aaav;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.d;
        if (d != null) {
            hashMap.put("session_start_ts", d);
        }
        Long l = this.a;
        if (l != null) {
            hashMap.put("session_time_sec", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("session_active_time_sec", l);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("with_gallery", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_gallery_invite", bool);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("with_private_gallery", bool);
        }
        aahz aahz = this.c;
        if (aahz != null) {
            hashMap.put("deep_link_source", aahz.toString());
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        aabh aabh = this.i;
        if (aabh != null) {
            hashMap.put("application_state", aabh.toString());
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
        return asDictionary().equals(((aaav) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_SESSION_END";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Double d = this.d;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.a;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aahz aahz = this.c;
        hashCode = (hashCode + (aahz != null ? aahz.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabh aabh = this.i;
        if (aabh != null) {
            i = aabh.hashCode();
        }
        return hashCode + i;
    }
}
