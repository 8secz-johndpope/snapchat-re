package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawz */
public final class aawz extends abhw {
    private aaxp a;
    private String b;

    private aawz a() {
        aawz aawz = (aawz) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawz.a = aaxp;
        }
        String str = this.b;
        if (str != null) {
            aawz.b = str;
        }
        return aawz;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        String str = this.b;
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
        return asDictionary().equals(((aawz) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_PHONE_VERIFICATION_CODE_PAGEVIEW";
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
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
