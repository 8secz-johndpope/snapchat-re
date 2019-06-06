package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaaa */
public final class aaaa extends abhw {
    private Boolean a;
    private aamh b;
    private String c;
    private String d;

    private aaaa a() {
        aaaa aaaa = (aaaa) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaaa.a = bool;
        }
        aamh aamh = this.b;
        if (aamh != null) {
            aaaa.b = aamh;
        }
        String str = this.c;
        if (str != null) {
            aaaa.c = str;
        }
        str = this.d;
        if (str != null) {
            aaaa.d = str;
        }
        return aaaa;
    }

    public final void a(aamh aamh) {
        this.b = aamh;
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
        aamh aamh = this.b;
        if (aamh != null) {
            hashMap.put("context", aamh.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("reset_password_session_id", str);
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
        return asDictionary().equals(((aaaa) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_APPLICATION_LOGIN_RESET_PASSWORD_SUCCESS";
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
        aamh aamh = this.b;
        hashCode = (hashCode + (aamh != null ? aamh.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
