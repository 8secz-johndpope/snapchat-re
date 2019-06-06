package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abca */
public final class abca extends abcj {
    public abcb a;

    private abca b() {
        abca abca = (abca) super.clone();
        abcb abcb = this.a;
        if (abcb != null) {
            abca.a = abcb;
        }
        return abca;
    }

    public final /* synthetic */ abcj a() {
        return b();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abcb abcb = this.a;
        if (abcb != null) {
            hashMap.put("failure_reason", abcb.toString());
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
        return asDictionary().equals(((abca) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_FIRMWARE_UPDATE_FAILURE";
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
        abcb abcb = this.a;
        return hashCode + (abcb != null ? abcb.hashCode() : 0);
    }
}
