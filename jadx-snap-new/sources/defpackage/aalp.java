package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalp */
public final class aalp extends abhw {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public String f;
    public String g;
    public aalc h;
    public Long i;

    private aalp a() {
        aalp aalp = (aalp) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aalp.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            aalp.b = bool;
        }
        bool = this.c;
        if (bool != null) {
            aalp.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aalp.d = bool;
        }
        bool = this.e;
        if (bool != null) {
            aalp.e = bool;
        }
        String str = this.f;
        if (str != null) {
            aalp.f = str;
        }
        str = this.g;
        if (str != null) {
            aalp.g = str;
        }
        aalc aalc = this.h;
        if (aalc != null) {
            aalp.h = aalc;
        }
        Long l = this.i;
        if (l != null) {
            aalp.i = l;
        }
        return aalp;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_success", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("with_data_ready", bool);
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("with_backup_betas", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("with_retried", bool);
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("with_cleartext_key", bool);
        }
        String str = this.f;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        aalc aalc = this.h;
        if (aalc != null) {
            hashMap.put("source", aalc.toString());
        }
        Long l = this.i;
        if (l != null) {
            hashMap.put("operation_time_ms", l);
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
        return asDictionary().equals(((aalp) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_SNAP_INVERSE_PHI";
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
        bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aalc aalc = this.h;
        hashCode = (hashCode + (aalc != null ? aalc.hashCode() : 0)) * 31;
        Long l = this.i;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
