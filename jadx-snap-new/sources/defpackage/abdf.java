package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abdf */
public final class abdf extends abde {
    private abdg a;

    private abdf b() {
        abdf abdf = (abdf) super.clone();
        abdg abdg = this.a;
        if (abdg != null) {
            abdf.a = abdg;
        }
        return abdf;
    }

    public final /* synthetic */ abde a() {
        return b();
    }

    public final void a(abdg abdg) {
        this.a = abdg;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abdg abdg = this.a;
        if (abdg != null) {
            hashMap.put("failure_reason", abdg.toString());
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
        return asDictionary().equals(((abdf) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_PAIRING_FAILURE";
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
        abdg abdg = this.a;
        return hashCode + (abdg != null ? abdg.hashCode() : 0);
    }
}
