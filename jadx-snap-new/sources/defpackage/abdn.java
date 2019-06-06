package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdn */
public final class abdn extends abde {
    private Boolean a;

    private abdn b() {
        abdn abdn = (abdn) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abdn.a = bool;
        }
        return abdn;
    }

    public final /* synthetic */ abde a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("hevc_mode", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abeb c() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abdn) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_PAIRING_SUCCESS";
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
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }
}
