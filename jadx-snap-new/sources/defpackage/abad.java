package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abad */
public final class abad extends abhw {
    public abab a;
    public abab b;

    private abad a() {
        abad abad = (abad) super.clone();
        abab abab = this.a;
        if (abab != null) {
            abad.a = abab;
        }
        abab = this.b;
        if (abab != null) {
            abad.b = abab;
        }
        return abad;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abab abab = this.a;
        if (abab != null) {
            hashMap.put("previous_sensitivity", abab.toString());
        }
        abab = this.b;
        if (abab != null) {
            hashMap.put("new_sensitivity", abab.toString());
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
        return asDictionary().equals(((abad) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_TO_REPORT_ADJUST_SENSITIVITY";
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
        abab abab = this.a;
        int i = 0;
        hashCode = (hashCode + (abab != null ? abab.hashCode() : 0)) * 31;
        abab = this.b;
        if (abab != null) {
            i = abab.hashCode();
        }
        return hashCode + i;
    }
}
