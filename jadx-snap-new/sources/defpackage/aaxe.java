package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxe */
public final class aaxe extends abhw {
    private aaxp a;
    private aaua b;
    private Boolean c;
    private Double d;
    private Boolean e;
    private String f;

    private aaxe a() {
        aaxe aaxe = (aaxe) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aaxe.a = aaxp;
        }
        aaua aaua = this.b;
        if (aaua != null) {
            aaxe.b = aaua;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aaxe.c = bool;
        }
        Double d = this.d;
        if (d != null) {
            aaxe.d = d;
        }
        bool = this.e;
        if (bool != null) {
            aaxe.e = bool;
        }
        String str = this.f;
        if (str != null) {
            aaxe.f = str;
        }
        return aaxe;
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
        this.f = str;
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
            hashMap.put("retry", bool);
        }
        String str = this.f;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaxe) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_SIGNUP_EMAIL_PAGEVIEW";
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
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
