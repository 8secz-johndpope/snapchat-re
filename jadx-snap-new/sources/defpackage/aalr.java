package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalr */
public final class aalr extends abhw {
    public Boolean a;
    public String b;
    public String c;

    private aalr a() {
        aalr aalr = (aalr) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aalr.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aalr.b = str;
        }
        str = this.c;
        if (str != null) {
            aalr.c = str;
        }
        return aalr;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_matched", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("source", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("failure_reason", str);
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
        return asDictionary().equals(((aalr) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_UNWRAPPED_KEYS_CHECK";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
