package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaia */
public final class aaia extends abhw {
    private String a;
    private aabo b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private String h;
    private String i;

    private aaia a() {
        aaia aaia = (aaia) super.clone();
        String str = this.a;
        if (str != null) {
            aaia.a = str;
        }
        aabo aabo = this.b;
        if (aabo != null) {
            aaia.b = aabo;
        }
        Long l = this.c;
        if (l != null) {
            aaia.c = l;
        }
        l = this.d;
        if (l != null) {
            aaia.d = l;
        }
        l = this.e;
        if (l != null) {
            aaia.e = l;
        }
        l = this.f;
        if (l != null) {
            aaia.f = l;
        }
        l = this.g;
        if (l != null) {
            aaia.g = l;
        }
        str = this.h;
        if (str != null) {
            aaia.h = str;
        }
        str = this.i;
        if (str != null) {
            aaia.i = str;
        }
        return aaia;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("benchmark_name", str);
        }
        aabo aabo = this.b;
        if (aabo != null) {
            hashMap.put("benchmark_type", aabo.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("duration_ms", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("execution_budget_ms", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("iteration", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("benchmark_scheduled_ts", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("benchmark_started_ts", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("benchmark_session_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("benchmark_results", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaia) obj).asDictionary());
    }

    public final String getEventName() {
        return "DEVICE_BENCHMARK";
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
        aabo aabo = this.b;
        hashCode = (hashCode + (aabo != null ? aabo.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
