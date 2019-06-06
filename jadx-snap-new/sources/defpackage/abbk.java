package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abbk */
public final class abbk extends abbi {
    public final /* bridge */ /* synthetic */ abbi a() {
        return (abbk) super.clone();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abea b() {
        return (abbk) super.clone();
    }

    public final /* synthetic */ abeb c() {
        return (abbk) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbk) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_CONNECTION_START";
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
