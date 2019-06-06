package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaly */
public final class aaly extends aalz {
    public final /* bridge */ /* synthetic */ aalz a() {
        return (aaly) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abgb b() {
        return (aaly) super.clone();
    }

    public final /* synthetic */ aapq c() {
        return (aaly) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaly) obj).asDictionary());
    }

    public final String getEventName() {
        return "FILTER_LENS_SPIN";
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
