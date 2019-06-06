package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaad */
public final class aaad extends abhw {
    private Boolean a;
    private abgs b;
    private String c;
    private String d;

    private aaad a() {
        aaad aaad = (aaad) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaad.a = bool;
        }
        abgs abgs = this.b;
        if (abgs != null) {
            aaad.b = abgs;
        }
        String str = this.c;
        if (str != null) {
            aaad.c = str;
        }
        str = this.d;
        if (str != null) {
            aaad.d = str;
        }
        return aaad;
    }

    public final void a(abgs abgs) {
        this.b = abgs;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("has_logged_in_before", bool);
        }
        abgs abgs = this.b;
        if (abgs != null) {
            hashMap.put("context", abgs.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("login_flow_session_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaad) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_APPLICATION_LOGIN_TWO_FACTOR_SUCCESS";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abgs abgs = this.b;
        hashCode = (hashCode + (abgs != null ? abgs.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
