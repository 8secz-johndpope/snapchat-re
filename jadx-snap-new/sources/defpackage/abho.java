package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abho */
public final class abho extends abhw {
    private aaua a;

    private abho a() {
        abho abho = (abho) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            abho.a = aaua;
        }
        return abho;
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
        return asDictionary().equals(((abho) obj).asDictionary());
    }

    public final String getEventName() {
        return "USER_IDENTITY_BITMOJI_REGISTRATION_VIEW";
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
