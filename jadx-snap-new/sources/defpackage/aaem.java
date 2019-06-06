package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaem */
public final class aaem extends aaei {
    public final /* bridge */ /* synthetic */ aaei a() {
        return (aaem) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaex b() {
        return (aaem) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaem) obj).asDictionary());
    }

    public final String getEventName() {
        return "COGNAC_AD_VIEW";
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
