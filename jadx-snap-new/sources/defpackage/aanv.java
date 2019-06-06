package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanv */
public final class aanv extends aanw {
    public final /* bridge */ /* synthetic */ aanw a() {
        return (aanv) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abgb b() {
        return (aanv) super.clone();
    }

    public final /* synthetic */ aapq c() {
        return (aanv) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanv) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_GEOLENS_SPIN";
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
