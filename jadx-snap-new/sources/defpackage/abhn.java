package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhn */
public final class abhn extends abhw {
    private aaua a;

    private abhn a() {
        abhn abhn = (abhn) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            abhn.a = aaua;
        }
        return abhn;
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
        return asDictionary().equals(((abhn) obj).asDictionary());
    }

    public final String getEventName() {
        return "USER_IDENTITY_BITMOJI_REGISTRATION_SUCCESS";
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
        return hashCode + (aaua != null ? aaua.hashCode() : 0);
    }
}
