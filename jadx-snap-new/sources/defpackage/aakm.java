package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aakm */
public final class aakm extends abhw {
    public aakn a;
    public String b;
    public String c;
    public String d;
    public Long e;
    public Long f;
    public Long g;

    private aakm a() {
        aakm aakm = (aakm) super.clone();
        aakn aakn = this.a;
        if (aakn != null) {
            aakm.a = aakn;
        }
        String str = this.b;
        if (str != null) {
            aakm.b = str;
        }
        str = this.c;
        if (str != null) {
            aakm.c = str;
        }
        str = this.d;
        if (str != null) {
            aakm.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aakm.e = l;
        }
        l = this.f;
        if (l != null) {
            aakm.f = l;
        }
        l = this.g;
        if (l != null) {
            aakm.g = l;
        }
        return aakm;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aakn aakn = this.a;
        if (aakn != null) {
            hashMap.put("event_type", aakn.toString());
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("operation_result", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("success_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("failure_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("average_operation_time_ms", l);
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
        return asDictionary().equals(((aakm) obj).asDictionary());
    }

    public final String getEventName() {
        return "FIDELIUS_BATCHED_OPS";
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
        aakn aakn = this.a;
        int i = 0;
        hashCode = (hashCode + (aakn != null ? aakn.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
