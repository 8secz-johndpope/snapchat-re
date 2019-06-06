package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhq */
public final class abhq extends abhw {
    public aauc a;

    private abhq a() {
        abhq abhq = (abhq) super.clone();
        aauc aauc = this.a;
        if (aauc != null) {
            abhq.a = aauc;
        }
        return abhq;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aauc aauc = this.a;
        if (aauc != null) {
            hashMap.put("grandfathering_result", aauc.toString());
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
        return asDictionary().equals(((abhq) obj).asDictionary());
    }

    public final String getEventName() {
        return "USER_LOCATION_PERMISSION_GRANDFATHERING";
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
        aauc aauc = this.a;
        return hashCode + (aauc != null ? aauc.hashCode() : 0);
    }
}
