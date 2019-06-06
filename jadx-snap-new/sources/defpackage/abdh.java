package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdh */
public final class abdh extends abde {
    public final /* bridge */ /* synthetic */ abde a() {
        return (abdh) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return (abdh) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abdh) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_PAIRING_NAME_CHANGE";
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
