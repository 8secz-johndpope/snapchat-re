package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhp */
public final class abhp extends abhw {
    private aaua a;
    private aabs b;
    private String c;

    private abhp a() {
        abhp abhp = (abhp) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            abhp.a = aaua;
        }
        aabs aabs = this.b;
        if (aabs != null) {
            abhp.b = aabs;
        }
        String str = this.c;
        if (str != null) {
            abhp.c = str;
        }
        return abhp;
    }

    public final void a(aabs aabs) {
        this.b = aabs;
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        aabs aabs = this.b;
        if (aabs != null) {
            hashMap.put("status", aabs.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("profile_session_id", str);
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
        return asDictionary().equals(((abhp) obj).asDictionary());
    }

    public final String getEventName() {
        return "USER_IDENTITY_BITMOJI_UNLINK";
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
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        aabs aabs = this.b;
        hashCode = (hashCode + (aabs != null ? aabs.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
