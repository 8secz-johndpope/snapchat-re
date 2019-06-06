package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakl */
public final class aakl extends abhw {
    public Boolean a;
    public String b;
    public String c;
    public String d;
    private Boolean e;

    private aakl a() {
        aakl aakl = (aakl) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aakl.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aakl.b = str;
        }
        str = this.c;
        if (str != null) {
            aakl.c = str;
        }
        str = this.d;
        if (str != null) {
            aakl.d = str;
        }
        bool = this.e;
        if (bool != null) {
            aakl.e = bool;
        }
        return aakl;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_success", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("source", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("action", str);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_identity_loaded", bool);
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
        return asDictionary().equals(((aakl) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_APP_OPEN";
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
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
