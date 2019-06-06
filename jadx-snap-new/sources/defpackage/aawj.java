package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawj */
public final class aawj extends aaxl {
    private String a;

    private aawj b() {
        aawj aawj = (aawj) super.clone();
        String str = this.a;
        if (str != null) {
            aawj.a = str;
        }
        return aawj;
    }

    public final /* synthetic */ aaxl a() {
        return b();
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aawj) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_CREATE_ACCOUNT";
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
