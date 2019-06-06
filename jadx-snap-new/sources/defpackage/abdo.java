package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdo */
public final class abdo extends abde {
    public final /* bridge */ /* synthetic */ abde a() {
        return (abdo) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return (abdo) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abdo) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_PAIRING_TROUBLESHOOT_DIALOG_HELP_CLICK";
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
