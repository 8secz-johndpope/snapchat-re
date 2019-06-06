package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawr */
public final class aawr extends abhw {
    private aaxp a;
    private Boolean b;
    private String c;

    private aawr a() {
        aawr aawr = (aawr) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawr.a = aaxp;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aawr.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aawr.c = str;
        }
        return aawr;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("has_logged_in_before", bool);
        }
        String str = this.c;
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
        return asDictionary().equals(((aawr) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_LOGIN_PAGEVIEW";
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
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
