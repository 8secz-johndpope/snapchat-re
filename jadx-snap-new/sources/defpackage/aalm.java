package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalm */
public final class aalm extends abhw {
    public aaln a;
    public Boolean b;

    private aalm a() {
        aalm aalm = (aalm) super.clone();
        aaln aaln = this.a;
        if (aaln != null) {
            aalm.a = aaln;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aalm.b = bool;
        }
        return aalm;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaln aaln = this.a;
        if (aaln != null) {
            hashMap.put("event_type", aaln.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_success", bool);
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
        return asDictionary().equals(((aalm) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_SEK_DISK_OPS";
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
        aaln aaln = this.a;
        int i = 0;
        hashCode = (hashCode + (aaln != null ? aaln.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
