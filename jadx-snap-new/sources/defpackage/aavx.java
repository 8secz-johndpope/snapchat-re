package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavx */
public final class aavx extends aavw {
    private String a;

    private aavx c() {
        aavx aavx = (aavx) super.clone();
        String str = this.a;
        if (str != null) {
            aavx.a = str;
        }
        return aavx;
    }

    public final /* synthetic */ aaxl a() {
        return c();
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
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
        return asDictionary().equals(((aavx) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_RESPONSE_VERIFY_PHONE";
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
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
