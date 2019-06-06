package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aawl */
public final class aawl extends abhw {
    private aavg a;
    private String b;

    private aawl a() {
        aawl aawl = (aawl) super.clone();
        aavg aavg = this.a;
        if (aavg != null) {
            aawl.a = aavg;
        }
        String str = this.b;
        if (str != null) {
            aawl.b = str;
        }
        return aawl;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aavg aavg = this.a;
        if (aavg != null) {
            hashMap.put("error_message", aavg.toString());
        }
        String str = this.b;
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
        return asDictionary().equals(((aawl) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_EMAIL_FAIL";
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
        aavg aavg = this.a;
        int i = 0;
        hashCode = (hashCode + (aavg != null ? aavg.hashCode() : 0)) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
