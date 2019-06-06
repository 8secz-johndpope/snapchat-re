package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abcm */
public final class abcm extends abcj {
    public final /* bridge */ /* synthetic */ abcj a() {
        return (abcm) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return (abcm) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abcm) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_FIRMWARE_UPDATE_SUCCESS";
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
