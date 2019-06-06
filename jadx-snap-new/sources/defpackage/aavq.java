package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavq */
public final class aavq extends aavw {
    private Boolean a;
    private String b;

    private aavq c() {
        aavq aavq = (aavq) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aavq.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aavq.b = str;
        }
        return aavq;
    }

    public final /* synthetic */ aaxl a() {
        return c();
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("skip_captcha", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aavw b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aavq) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_RESPONSE_CHANGE_EMAIL";
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
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
