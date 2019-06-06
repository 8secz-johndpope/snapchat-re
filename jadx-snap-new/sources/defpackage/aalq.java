package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalq */
public final class aalq extends abhw {
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    private String j;
    private Long k;

    private aalq a() {
        aalq aalq = (aalq) super.clone();
        String str = this.a;
        if (str != null) {
            aalq.a = str;
        }
        str = this.b;
        if (str != null) {
            aalq.b = str;
        }
        str = this.j;
        if (str != null) {
            aalq.j = str;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aalq.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aalq.d = bool;
        }
        Long l = this.k;
        if (l != null) {
            aalq.k = l;
        }
        l = this.e;
        if (l != null) {
            aalq.e = l;
        }
        l = this.f;
        if (l != null) {
            aalq.f = l;
        }
        l = this.g;
        if (l != null) {
            aalq.g = l;
        }
        l = this.h;
        if (l != null) {
            aalq.h = l;
        }
        l = this.i;
        if (l != null) {
            aalq.i = l;
        }
        return aalq;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("operation_result", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("fidelius_manager_status", str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("with_data_ready", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("with_rewrap", bool);
        }
        Long l = this.k;
        if (l != null) {
            hashMap.put("recipient_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("wrapped_device_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("operation_time_ms", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("average_operation_time_ms", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("total_key_count", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("secret_generated_count", l);
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
        return asDictionary().equals(((aalq) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_SNAP_PHI";
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
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
