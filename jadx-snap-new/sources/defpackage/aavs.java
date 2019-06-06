package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavs */
public final class aavs extends aavw {
    private aavh a;
    private String b;
    private String c;

    private aavs c() {
        aavs aavs = (aavs) super.clone();
        aavh aavh = this.a;
        if (aavh != null) {
            aavs.a = aavh;
        }
        String str = this.b;
        if (str != null) {
            aavs.b = str;
        }
        str = this.c;
        if (str != null) {
            aavs.c = str;
        }
        return aavs;
    }

    public final /* synthetic */ aaxl a() {
        return c();
    }

    public final void a(aavh aavh) {
        this.a = aavh;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aavh aavh = this.a;
        if (aavh != null) {
            hashMap.put("error_source", aavh.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("preferred_verification_method", str);
        }
        str = this.c;
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
        return asDictionary().equals(((aavs) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_RESPONSE_REGISTER";
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
        aavh aavh = this.a;
        int i = 0;
        hashCode = (hashCode + (aavh != null ? aavh.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
