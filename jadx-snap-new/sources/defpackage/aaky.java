package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaky */
public final class aaky extends abhw {
    public aakz a;
    public Boolean b;
    public String c;
    public String d;
    public Long e;
    public Boolean f;
    private String g;
    private String h;

    private aaky a() {
        aaky aaky = (aaky) super.clone();
        aakz aakz = this.a;
        if (aakz != null) {
            aaky.a = aakz;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aaky.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aaky.c = str;
        }
        str = this.d;
        if (str != null) {
            aaky.d = str;
        }
        str = this.g;
        if (str != null) {
            aaky.g = str;
        }
        Long l = this.e;
        if (l != null) {
            aaky.e = l;
        }
        str = this.h;
        if (str != null) {
            aaky.h = str;
        }
        bool = this.f;
        if (bool != null) {
            aaky.f = bool;
        }
        return aaky;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aakz aakz = this.a;
        if (aakz != null) {
            hashMap.put("init_type", aakz.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_success", bool);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("source", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("operation_time_ms", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("free_disk_space_mb", str);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_regenerated_identity", bool);
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
        return asDictionary().equals(((aaky) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_IDENTITY_INIT";
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
        aakz aakz = this.a;
        int i = 0;
        hashCode = (hashCode + (aakz != null ? aakz.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
