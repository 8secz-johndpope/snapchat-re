package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgk */
public final class abgk extends abhr {
    public Double a;
    public Double b;

    private abgk a() {
        abgk abgk = (abgk) super.clone();
        Double d = this.a;
        if (d != null) {
            abgk.a = d;
        }
        d = this.b;
        if (d != null) {
            abgk.b = d;
        }
        return abgk;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("payload_creation_sec", d);
        }
        d = this.b;
        if (d != null) {
            hashMap.put("payload_creation_obfuscated_sec", d);
        }
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
        return asDictionary().equals(((abgk) obj).asDictionary());
    }

    public final String getEventName() {
        return "THIRD_PARTY_PAYLOAD_CREATE";
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
        int hashCode = super.hashCode() * 31;
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.b;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
