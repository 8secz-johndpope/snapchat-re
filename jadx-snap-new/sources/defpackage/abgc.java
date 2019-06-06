package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgc */
public final class abgc extends abhw {
    public Long a;
    public Double b;
    public String c;
    public String d;
    public Boolean e;
    public Long f;
    public Boolean g;
    private Long h;
    private Long i;
    private Double j;
    private Long k;
    private Boolean l;

    private abgc a() {
        abgc abgc = (abgc) super.clone();
        Long l = this.a;
        if (l != null) {
            abgc.a = l;
        }
        Double d = this.b;
        if (d != null) {
            abgc.b = d;
        }
        l = this.h;
        if (l != null) {
            abgc.h = l;
        }
        String str = this.c;
        if (str != null) {
            abgc.c = str;
        }
        str = this.d;
        if (str != null) {
            abgc.d = str;
        }
        Boolean bool = this.e;
        if (bool != null) {
            abgc.e = bool;
        }
        l = this.i;
        if (l != null) {
            abgc.i = l;
        }
        d = this.j;
        if (d != null) {
            abgc.j = d;
        }
        l = this.k;
        if (l != null) {
            abgc.k = l;
        }
        bool = this.l;
        if (bool != null) {
            abgc.l = bool;
        }
        l = this.f;
        if (l != null) {
            abgc.f = l;
        }
        bool = this.g;
        if (bool != null) {
            abgc.g = bool;
        }
        return abgc;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("latency", l);
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("fps_mean", d);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("frame_dropped", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("start_page", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("destination_page", str);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("is_first_swipe", bool);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("swipe_fps", d);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("time_since_app_start_complete", l);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("is_bad_swipe", bool);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("large_frame_drops", l);
        }
        bool = this.g;
        if (bool != null) {
            hashMap.put("is_vertical_scroll", bool);
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
        return asDictionary().equals(((abgc) obj).asDictionary());
    }

    public final String getEventName() {
        return "SWIPE_LATENCY";
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
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.g;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
