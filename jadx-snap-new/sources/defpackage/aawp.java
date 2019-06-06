package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawp */
public final class aawp extends abhw {
    private aaxp a;
    private aavi b;
    private Long c;
    private String d;

    private aawp b() {
        aawp aawp = (aawp) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawp.a = aaxp;
        }
        aavi aavi = this.b;
        if (aavi != null) {
            aawp.b = aavi;
        }
        Long l = this.c;
        if (l != null) {
            aawp.c = l;
        }
        String str = this.d;
        if (str != null) {
            aawp.d = str;
        }
        return aawp;
    }

    public final void a() {
        this.b = null;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(Long l) {
        this.c = l;
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
        aavi aavi = this.b;
        if (aavi != null) {
            hashMap.put("registration_error", aavi.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("attempt_count", l);
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
        return asDictionary().equals(((aawp) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_INITIAL_INFO_FAIL";
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
        aavi aavi = this.b;
        hashCode = (hashCode + (aavi != null ? aavi.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
