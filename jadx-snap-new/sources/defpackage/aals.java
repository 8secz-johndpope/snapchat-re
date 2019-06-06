package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aals */
public final class aals extends abhw {
    public Boolean a;
    public Long b;

    private aals a() {
        aals aals = (aals) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aals.a = bool;
        }
        Long l = this.b;
        if (l != null) {
            aals.b = l;
        }
        return aals;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_purge_oldest_entry", bool);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("other_identity_count", l);
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
        return asDictionary().equals(((aals) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_USER_IDENTITY_CREATED";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
