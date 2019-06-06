package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxf */
public final class aaxf extends abhw {
    private aaxp a;
    private aaua b;
    private Boolean c;
    private Double d;
    private String e;

    private aaxf a() {
        aaxf aaxf = (aaxf) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aaxf.a = aaxp;
        }
        aaua aaua = this.b;
        if (aaua != null) {
            aaxf.b = aaua;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aaxf.c = bool;
        }
        Double d = this.d;
        if (d != null) {
            aaxf.d = d;
        }
        String str = this.e;
        if (str != null) {
            aaxf.e = str;
        }
        return aaxf;
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
        this.e = str;
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
        String str = this.e;
        if (str != null) {
            hashMap.put("long_client_id", str);
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
        return asDictionary().equals(((aaxf) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_SIGNUP_PAGEVIEW";
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
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
