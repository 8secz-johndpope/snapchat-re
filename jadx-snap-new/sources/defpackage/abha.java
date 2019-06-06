package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abha */
public final class abha extends abgy {
    public final /* synthetic */ abgz a() {
        return (abha) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* bridge */ /* synthetic */ abgy b() {
        return (abha) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abha) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_PROFILE_CHARM_ATTAIN";
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
        return super.hashCode();
    }
}
