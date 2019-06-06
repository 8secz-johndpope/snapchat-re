package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawb */
public final class aawb extends abhw {
    private aaxp a;
    private Long b;
    private Long c;
    private Boolean d;
    private String e;

    private aawb a() {
        aawb aawb = (aawb) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawb.a = aaxp;
        }
        Long l = this.b;
        if (l != null) {
            aawb.b = l;
        }
        l = this.c;
        if (l != null) {
            aawb.c = l;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aawb.d = bool;
        }
        String str = this.e;
        if (str != null) {
            aawb.e = str;
        }
        return aawb;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(Boolean bool) {
        this.d = bool;
    }

    public final void a(Long l) {
        this.c = l;
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
        Long l = this.b;
        if (l != null) {
            hashMap.put("attempt_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("image_count", l);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("with_reset_password", bool);
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
        return asDictionary().equals(((aawb) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_CAPTCHA_SUCCESS";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
