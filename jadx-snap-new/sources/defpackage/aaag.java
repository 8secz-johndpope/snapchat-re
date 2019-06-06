package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaag */
public final class aaag extends abhw {
    private String a;
    private String b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private String j;
    private Long k;
    private Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private Long q;
    private Long r;
    private Long s;
    private Long t;

    private aaag a() {
        aaag aaag = (aaag) super.clone();
        String str = this.a;
        if (str != null) {
            aaag.a = str;
        }
        str = this.b;
        if (str != null) {
            aaag.b = str;
        }
        Long l = this.c;
        if (l != null) {
            aaag.c = l;
        }
        l = this.d;
        if (l != null) {
            aaag.d = l;
        }
        l = this.e;
        if (l != null) {
            aaag.e = l;
        }
        l = this.f;
        if (l != null) {
            aaag.f = l;
        }
        l = this.g;
        if (l != null) {
            aaag.g = l;
        }
        l = this.h;
        if (l != null) {
            aaag.h = l;
        }
        l = this.i;
        if (l != null) {
            aaag.i = l;
        }
        str = this.j;
        if (str != null) {
            aaag.j = str;
        }
        l = this.k;
        if (l != null) {
            aaag.k = l;
        }
        l = this.l;
        if (l != null) {
            aaag.l = l;
        }
        l = this.m;
        if (l != null) {
            aaag.m = l;
        }
        l = this.n;
        if (l != null) {
            aaag.n = l;
        }
        l = this.o;
        if (l != null) {
            aaag.o = l;
        }
        l = this.p;
        if (l != null) {
            aaag.p = l;
        }
        l = this.q;
        if (l != null) {
            aaag.q = l;
        }
        l = this.r;
        if (l != null) {
            aaag.r = l;
        }
        l = this.s;
        if (l != null) {
            aaag.s = l;
        }
        l = this.t;
        if (l != null) {
            aaag.t = l;
        }
        return aaag;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("attribution", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("prev_attribution", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("total_frame_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("total_dropped_frame_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("bad_frame_duration_ms", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("page_duration_bucket", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("page_duration_sec", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("event_duration_ms", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("bad_frame_threshold_ms", l);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("ui_event_name", str);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("event_visit_num", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("frame_bucket0", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("frame_bucket1", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("frame_bucket2", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("frame_bucket3", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("frame_bucket4", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("frame_bucket5", l);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("frame_bucket6", l);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("frame_bucket7", l);
        }
        l = this.t;
        if (l != null) {
            hashMap.put("frame_bucket8", l);
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
        return asDictionary().equals(((aaag) obj).asDictionary());
    }

    public final String getEventName() {
        return "APP_BAD_FRAME";
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
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.t;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
