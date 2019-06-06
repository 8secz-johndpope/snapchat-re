package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaws */
public final class aaws extends abhw {
    private Boolean a;
    private String b;
    private String c;

    private aaws a() {
        aaws aaws = (aaws) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaws.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aaws.b = str;
        }
        str = this.c;
        if (str != null) {
            aaws.c = str;
        }
        return aaws;
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
        String str = this.b;
        if (str != null) {
            hashMap.put("login_flow_session_id", str);
        }
        str = this.c;
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
        return asDictionary().equals(((aaws) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_ONE_TAP_LOGIN_PAGE_VIEW";
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
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
