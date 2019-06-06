package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanc */
public final class aanc extends abhw {
    private Double a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private Long k;
    private Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private Long q;
    private Long r;
    private Long s;
    private aamz t;
    private Long u;
    private Long v;
    private Long w;

    private aanc a() {
        aanc aanc = (aanc) super.clone();
        Double d = this.a;
        if (d != null) {
            aanc.a = d;
        }
        Long l = this.b;
        if (l != null) {
            aanc.b = l;
        }
        l = this.c;
        if (l != null) {
            aanc.c = l;
        }
        l = this.d;
        if (l != null) {
            aanc.d = l;
        }
        l = this.e;
        if (l != null) {
            aanc.e = l;
        }
        l = this.f;
        if (l != null) {
            aanc.f = l;
        }
        l = this.g;
        if (l != null) {
            aanc.g = l;
        }
        l = this.h;
        if (l != null) {
            aanc.h = l;
        }
        l = this.i;
        if (l != null) {
            aanc.i = l;
        }
        l = this.j;
        if (l != null) {
            aanc.j = l;
        }
        l = this.k;
        if (l != null) {
            aanc.k = l;
        }
        l = this.l;
        if (l != null) {
            aanc.l = l;
        }
        l = this.m;
        if (l != null) {
            aanc.m = l;
        }
        l = this.n;
        if (l != null) {
            aanc.n = l;
        }
        l = this.o;
        if (l != null) {
            aanc.o = l;
        }
        l = this.p;
        if (l != null) {
            aanc.p = l;
        }
        l = this.q;
        if (l != null) {
            aanc.q = l;
        }
        l = this.r;
        if (l != null) {
            aanc.r = l;
        }
        l = this.s;
        if (l != null) {
            aanc.s = l;
        }
        aamz aamz = this.t;
        if (aamz != null) {
            aanc.t = aamz;
        }
        l = this.u;
        if (l != null) {
            aanc.u = l;
        }
        l = this.v;
        if (l != null) {
            aanc.v = l;
        }
        l = this.w;
        if (l != null) {
            aanc.w = l;
        }
        return aanc;
    }

    public final void a(Double d) {
        this.a = d;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("snap_send_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("snap_create_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("snap_lock_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("snap_unlock_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("snap_delete_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("snap_post_count", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("story_post_count", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("story_create_count", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("story_lock_count", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("story_unlock_count", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("story_delete_count", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("story_send_count", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("gallery_search_count", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("flashback_count", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("nearby_count", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("memories_all_tab_load_latency_ms", l);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("stories_tab_load_latency_ms", l);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("camera_roll_tab_load_latency_ms", l);
        }
        aamz aamz = this.t;
        if (aamz != null) {
            hashMap.put("open_source", aamz.toString());
        }
        l = this.u;
        if (l != null) {
            hashMap.put("recently_taken_displayed_content_count", l);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("recently_taken_snap_send_count", l);
        }
        l = this.w;
        if (l != null) {
            hashMap.put("recently_taken_camera_roll_load_latency_ms", l);
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
        return asDictionary().equals(((aanc) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_SESSION_END";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
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
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
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
        aamz aamz = this.t;
        hashCode = (hashCode + (aamz != null ? aamz.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.w;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
