package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxd */
public final class aaxd extends abhw {
    private aaxp a;
    private aaua b;
    private Boolean c;
    private Double d;
    private Boolean e;
    private Boolean f;
    private Long g;
    private String h;

    private aaxd a() {
        aaxd aaxd = (aaxd) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aaxd.a = aaxp;
        }
        aaua aaua = this.b;
        if (aaua != null) {
            aaxd.b = aaua;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aaxd.c = bool;
        }
        Double d = this.d;
        if (d != null) {
            aaxd.d = d;
        }
        bool = this.e;
        if (bool != null) {
            aaxd.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aaxd.f = bool;
        }
        Long l = this.g;
        if (l != null) {
            aaxd.g = l;
        }
        String str = this.h;
        if (str != null) {
            aaxd.h = str;
        }
        return aaxd;
    }

    public final void a(aaua aaua) {
        this.b = aaua;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(Boolean bool) {
        this.c = bool;
    }

    public final void a(String str) {
        this.h = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        aaua aaua = this.b;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("has_logged_in_before", bool);
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("last_pageview_ts", d);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("has_first_name", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("has_last_name", bool);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("display_name_quality", l);
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.e = bool;
    }

    public final void c(Boolean bool) {
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaxd) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_SIGNUP_BIRTHDAY_PAGEVIEW";
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
        aaxp aaxp = this.a;
        int i = 0;
        hashCode = (hashCode + (aaxp != null ? aaxp.hashCode() : 0)) * 31;
        aaua aaua = this.b;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
