package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacg */
public final class aacg extends aach {
    public final /* bridge */ /* synthetic */ aach a() {
        return (aacg) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
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
        return asDictionary().equals(((aacg) obj).asDictionary());
    }

    public final String getEventName() {
        return "CAMERA_OPEN_ATTEMPT";
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
        return super.hashCode();
    }
}
