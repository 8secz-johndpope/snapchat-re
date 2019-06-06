package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalf */
public final class aalf extends abhw {
    public aalg a;
    public String b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private String f;

    private aalf a() {
        aalf aalf = (aalf) super.clone();
        aalg aalg = this.a;
        if (aalg != null) {
            aalf.a = aalg;
        }
        String str = this.b;
        if (str != null) {
            aalf.b = str;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aalf.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aalf.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aalf.e = bool;
        }
        str = this.f;
        if (str != null) {
            aalf.f = str;
        }
        return aalf;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aalg aalg = this.a;
        if (aalg != null) {
            hashMap.put("event_type", aalg.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("action", str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("with_user_session", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("with_identity", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_database_manager", bool);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("fidelius_manager_status", str);
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
        return asDictionary().equals(((aalf) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_NOT_READY";
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
        aalg aalg = this.a;
        int i = 0;
        hashCode = (hashCode + (aalg != null ? aalg.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
