package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabl */
public final class aabl extends abhw {
    private Long a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private aasv f;
    private Boolean g;

    private aabl a() {
        aabl aabl = (aabl) super.clone();
        Long l = this.a;
        if (l != null) {
            aabl.a = l;
        }
        l = this.b;
        if (l != null) {
            aabl.b = l;
        }
        l = this.c;
        if (l != null) {
            aabl.c = l;
        }
        l = this.d;
        if (l != null) {
            aabl.d = l;
        }
        l = this.e;
        if (l != null) {
            aabl.e = l;
        }
        aasv aasv = this.f;
        if (aasv != null) {
            aabl.f = aasv;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aabl.g = bool;
        }
        return aabl;
    }

    public final void a(aasv aasv) {
        this.f = aasv;
    }

    public final void a(Boolean bool) {
        this.g = bool;
    }

    public final void a(Long l) {
        this.a = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("estimation_start_bits_per_second", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("estimation_end_bits_per_second", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("request_duration_ms", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("bytes_transmitted", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("content_length", l);
        }
        aasv aasv = this.f;
        if (aasv != null) {
            hashMap.put("reachability", aasv.toString());
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("is_download_sample", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final void c(Long l) {
        this.c = l;
    }

    public final void d(Long l) {
        this.d = l;
    }

    public final void e(Long l) {
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aabl) obj).asDictionary());
    }

    public final String getEventName() {
        return "BANDWIDTH_ACCURACY";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aasv aasv = this.f;
        hashCode = (hashCode + (aasv != null ? aasv.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
