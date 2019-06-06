package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawc */
public final class aawc extends abhw {
    private aaxp a;
    private String b;
    private String c;

    private aawc a() {
        aawc aawc = (aawc) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aawc.a = aaxp;
        }
        String str = this.b;
        if (str != null) {
            aawc.b = str;
        }
        str = this.c;
        if (str != null) {
            aawc.c = str;
        }
        return aawc;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("channel_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aawc) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_COMPLETE";
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
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
