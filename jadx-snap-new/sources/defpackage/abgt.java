package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abgt */
public final class abgt extends abhw {
    private String a;
    private String b;
    private zyr c;
    private aacw d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private Long k;
    private String l;
    private String m;
    private String n;
    private String o;

    private abgt a() {
        abgt abgt = (abgt) super.clone();
        String str = this.a;
        if (str != null) {
            abgt.a = str;
        }
        str = this.b;
        if (str != null) {
            abgt.b = str;
        }
        zyr zyr = this.c;
        if (zyr != null) {
            abgt.c = zyr;
        }
        aacw aacw = this.d;
        if (aacw != null) {
            abgt.d = aacw;
        }
        Long l = this.e;
        if (l != null) {
            abgt.e = l;
        }
        l = this.f;
        if (l != null) {
            abgt.f = l;
        }
        l = this.g;
        if (l != null) {
            abgt.g = l;
        }
        l = this.h;
        if (l != null) {
            abgt.h = l;
        }
        l = this.i;
        if (l != null) {
            abgt.i = l;
        }
        l = this.j;
        if (l != null) {
            abgt.j = l;
        }
        l = this.k;
        if (l != null) {
            abgt.k = l;
        }
        str = this.l;
        if (str != null) {
            abgt.l = str;
        }
        str = this.m;
        if (str != null) {
            abgt.m = str;
        }
        str = this.n;
        if (str != null) {
            abgt.n = str;
        }
        str = this.o;
        if (str != null) {
            abgt.o = str;
        }
        return abgt;
    }

    public final void a(aacw aacw) {
        this.d = aacw;
    }

    public final void a(Long l) {
        this.e = l;
    }

    public final void a(String str) {
        this.m = str;
    }

    public final void a(zyr zyr) {
        this.c = zyr;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("version", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("camera_type", str);
        }
        zyr zyr = this.c;
        if (zyr != null) {
            hashMap.put("action", zyr.toString());
        }
        aacw aacw = this.d;
        if (aacw != null) {
            hashMap.put("target", aacw.toString());
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("user_action_timestamp", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("first_response_timestamp", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("last_response_timestamp", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("screen_width", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("screen_height", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("x", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("y", l);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("swipe_positions", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("camera_frame_stats", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("ui_frame_stats", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("camera_state_transition", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.f = l;
    }

    public final void b(String str) {
        this.n = str;
    }

    public final void c(Long l) {
        this.g = l;
    }

    public final void c(String str) {
        this.o = str;
    }

    public final void d(Long l) {
        this.j = l;
    }

    public final void e(Long l) {
        this.k = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abgt) obj).asDictionary());
    }

    public final String getEventName() {
        return "UNIFIED_CAMERA_ACTION";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        zyr zyr = this.c;
        hashCode = (hashCode + (zyr != null ? zyr.hashCode() : 0)) * 31;
        aacw aacw = this.d;
        hashCode = (hashCode + (aacw != null ? aacw.hashCode() : 0)) * 31;
        Long l = this.e;
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
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
