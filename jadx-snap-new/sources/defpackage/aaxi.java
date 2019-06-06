package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxi */
public final class aaxi extends abhw {
    private aaxp a;
    private Boolean b;
    private String c;
    private abek d;
    private String e;

    private aaxi a() {
        aaxi aaxi = (aaxi) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aaxi.a = aaxp;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aaxi.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aaxi.c = str;
        }
        abek abek = this.d;
        if (abek != null) {
            aaxi.d = abek;
        }
        str = this.e;
        if (str != null) {
            aaxi.e = str;
        }
        return aaxi;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(abek abek) {
        this.d = abek;
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
            hashMap.put("channel_id", str);
        }
        abek abek = this.d;
        if (abek != null) {
            hashMap.put("additional_info", abek.toString());
        }
        str = this.e;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaxi) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_SPLASH_SCREEN_PAGEVIEW";
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
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abek abek = this.d;
        hashCode = (hashCode + (abek != null ? abek.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
