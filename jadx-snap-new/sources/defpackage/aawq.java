package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawq */
public final class aawq extends abhw {
    private aaxp a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Long e;
    private String f;
    private String g;
    private String h;

    private aawq a() {
        aawq aawq = (aawq) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawq.a = aaxp;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aawq.b = bool;
        }
        bool = this.c;
        if (bool != null) {
            aawq.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aawq.d = bool;
        }
        Long l = this.e;
        if (l != null) {
            aawq.e = l;
        }
        String str = this.f;
        if (str != null) {
            aawq.f = str;
        }
        str = this.g;
        if (str != null) {
            aawq.g = str;
        }
        str = this.h;
        if (str != null) {
            aawq.h = str;
        }
        return aawq;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(Long l) {
        this.e = l;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("edit_birthday_year", bool);
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("edit_birthday_month", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("edit_birthday_day", bool);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("attempt_count", l);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("preferred_verification_method", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("channel_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.c = bool;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(Boolean bool) {
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aawq) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_INITIAL_INFO_SUCCESS";
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
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
