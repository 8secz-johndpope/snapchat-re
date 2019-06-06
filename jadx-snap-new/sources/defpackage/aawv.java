package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawv */
public final class aawv extends abhw {
    private aaxp a;
    private Long b;
    private Boolean c;
    private String d;

    private aawv a() {
        aawv aawv = (aawv) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawv.a = aaxp;
        }
        Long l = this.b;
        if (l != null) {
            aawv.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aawv.c = bool;
        }
        String str = this.d;
        if (str != null) {
            aawv.d = str;
        }
        return aawv;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(String str) {
        this.d = str;
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
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("has_resent_code", bool);
        }
        String str = this.d;
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
        return asDictionary().equals(((aawv) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_PHONE_FAIL";
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
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
