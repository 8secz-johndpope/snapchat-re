package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavt */
public final class aavt extends aavw {
    private String a;

    private aavt c() {
        aavt aavt = (aavt) super.clone();
        String str = this.a;
        if (str != null) {
            aavt.a = str;
        }
        return aavt;
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
        return asDictionary().equals(((aavt) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_RESPONSE_SET_PHONE";
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
