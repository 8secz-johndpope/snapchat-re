package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalj */
public final class aalj extends abhw {
    public String a;
    public String b;
    private Boolean c;

    private aalj a() {
        aalj aalj = (aalj) super.clone();
        String str = this.a;
        if (str != null) {
            aalj.a = str;
        }
        str = this.b;
        if (str != null) {
            aalj.b = str;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aalj.c = bool;
        }
        return aalj;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("operation_result", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("source", str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("with_nil_iwek", bool);
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
        return asDictionary().equals(((aalj) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_POST_SERVER_INIT";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
