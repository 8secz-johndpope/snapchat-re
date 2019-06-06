package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxq */
public final class aaxq extends abhw {
    private aaxr a;
    private Boolean b;
    private String c;
    private String d;

    private aaxq a() {
        aaxq aaxq = (aaxq) super.clone();
        aaxr aaxr = this.a;
        if (aaxr != null) {
            aaxq.a = aaxr;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aaxq.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aaxq.c = str;
        }
        str = this.d;
        if (str != null) {
            aaxq.d = str;
        }
        return aaxq;
    }

    public final void a(aaxr aaxr) {
        this.a = aaxr;
    }

    public final void a(Boolean bool) {
        this.b = bool;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxr aaxr = this.a;
        if (aaxr != null) {
            hashMap.put("action", aaxr.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("has_logged_in_before", bool);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaxq) obj).asDictionary());
    }

    public final String getEventName() {
        return "REMOVE_ONE_TAP_LOGIN_USER_DIALOG";
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
        aaxr aaxr = this.a;
        int i = 0;
        hashCode = (hashCode + (aaxr != null ? aaxr.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
