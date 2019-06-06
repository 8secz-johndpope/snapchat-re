package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaks */
public final class aaks extends abhw {
    public Boolean a;
    public Long b;
    public Long c;
    public Long d;

    private aaks a() {
        aaks aaks = (aaks) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaks.a = bool;
        }
        Long l = this.b;
        if (l != null) {
            aaks.b = l;
        }
        l = this.c;
        if (l != null) {
            aaks.c = l;
        }
        l = this.d;
        if (l != null) {
            aaks.d = l;
        }
        return aaks;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_new_identity", bool);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("writable_database_time_ms", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("user_identity_time_ms", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("filter_sek_time_ms", l);
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
        return asDictionary().equals(((aaks) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_ENCRYPTED_FDU_LOAD_LATENCY";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
