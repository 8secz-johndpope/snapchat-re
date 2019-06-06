package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaak */
public final class aaak extends abhw {
    private String a;
    private String b;
    private String c;
    private Boolean d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;

    private aaak a() {
        aaak aaak = (aaak) super.clone();
        String str = this.a;
        if (str != null) {
            aaak.a = str;
        }
        str = this.b;
        if (str != null) {
            aaak.b = str;
        }
        str = this.c;
        if (str != null) {
            aaak.c = str;
        }
        Boolean bool = this.d;
        if (bool != null) {
            aaak.d = bool;
        }
        Long l = this.e;
        if (l != null) {
            aaak.e = l;
        }
        l = this.f;
        if (l != null) {
            aaak.f = l;
        }
        l = this.g;
        if (l != null) {
            aaak.g = l;
        }
        l = this.h;
        if (l != null) {
            aaak.h = l;
        }
        return aaak;
    }

    public final void a(Boolean bool) {
        this.d = bool;
    }

    public final void a(Long l) {
        this.e = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("attribution", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("feature", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("callsite", str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            hashMap.put("with_foreground", bool);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("num_of_cores", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("total_cpu_time_ms", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("session_bucket", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("session_time_sec", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.f = l;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(Long l) {
        this.g = l;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(Long l) {
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaak) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_CPU_ATTRIBUTION";
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
