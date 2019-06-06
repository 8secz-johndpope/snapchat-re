package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aapq */
public abstract class aapq extends abgb {
    private Double a;
    private Double b;
    private Long c;
    private Long d;
    private String e;
    private String f;
    private aapr g;
    private String h;
    private String i;
    private Long j;
    private Long k;
    private Double l;
    private Double m;

    public final void a(aapr aapr) {
        this.g = aapr;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Double d = this.a;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        d = this.b;
        if (d != null) {
            hashMap.put("time_since_last_flip_sec", d);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("face_front_camera_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("face_back_camera_count", l);
        }
        String str = this.e;
        if (str != null) {
            hashMap.put("lens_bundle_url", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("trigger_action", str);
        }
        aapr aapr = this.g;
        if (aapr != null) {
            hashMap.put("lens_type", aapr.toString());
        }
        str = this.h;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("lens_category_id", str);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("first_face_render_timestamp", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("first_trigger_timestamp", l);
        }
        d = this.l;
        if (d != null) {
            hashMap.put("lens_frame_processing_time_ms_avg", d);
        }
        d = this.m;
        if (d != null) {
            hashMap.put("lens_frame_processing_time_ms_std", d);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: c */
    public aapq clone() {
        aapq aapq = (aapq) super.clone();
        Double d = this.a;
        if (d != null) {
            aapq.a = d;
        }
        d = this.b;
        if (d != null) {
            aapq.b = d;
        }
        Long l = this.c;
        if (l != null) {
            aapq.c = l;
        }
        l = this.d;
        if (l != null) {
            aapq.d = l;
        }
        String str = this.e;
        if (str != null) {
            aapq.e = str;
        }
        str = this.f;
        if (str != null) {
            aapq.f = str;
        }
        aapr aapr = this.g;
        if (aapr != null) {
            aapq.g = aapr;
        }
        str = this.h;
        if (str != null) {
            aapq.h = str;
        }
        str = this.i;
        if (str != null) {
            aapq.i = str;
        }
        l = this.j;
        if (l != null) {
            aapq.j = l;
        }
        l = this.k;
        if (l != null) {
            aapq.k = l;
        }
        d = this.l;
        if (d != null) {
            aapq.l = d;
        }
        d = this.m;
        if (d != null) {
            aapq.m = d;
        }
        return aapq;
    }

    public final void c(Double d) {
        this.a = d;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(Double d) {
        this.b = d;
    }

    public final void d(Long l) {
        this.c = l;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(Double d) {
        this.l = d;
    }

    public final void e(Long l) {
        this.d = l;
    }

    public final void e(String str) {
        this.h = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aapq) obj).asDictionary());
    }

    public final void f(Double d) {
        this.m = d;
    }

    public final void f(Long l) {
        this.j = l;
    }

    public final void g(Long l) {
        this.k = l;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aapr aapr = this.g;
        hashCode = (hashCode + (aapr != null ? aapr.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.l;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.m;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
