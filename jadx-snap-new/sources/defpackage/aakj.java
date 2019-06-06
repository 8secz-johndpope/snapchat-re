package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakj */
public final class aakj extends abhw {
    public aakk a;
    public Boolean b;
    public Boolean c;
    private String d;
    private String e;
    private Long f;

    private aakj a() {
        aakj aakj = (aakj) super.clone();
        aakk aakk = this.a;
        if (aakk != null) {
            aakj.a = aakk;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aakj.b = bool;
        }
        bool = this.c;
        if (bool != null) {
            aakj.c = bool;
        }
        String str = this.d;
        if (str != null) {
            aakj.d = str;
        }
        str = this.e;
        if (str != null) {
            aakj.e = str;
        }
        Long l = this.f;
        if (l != null) {
            aakj.f = l;
        }
        return aakj;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aakk aakk = this.a;
        if (aakk != null) {
            hashMap.put("event_type", aakk.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_background", bool);
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("with_retry_in_clear", bool);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("source", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        Long l = this.f;
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
        return asDictionary().equals(((aakj) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_ACK_RETRY";
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
        aakk aakk = this.a;
        int i = 0;
        hashCode = (hashCode + (aakk != null ? aakk.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
