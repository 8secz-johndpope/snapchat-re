package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacz */
public final class aacz extends abhw {
    private Boolean a;
    private String b;
    private Boolean c;
    private aasa d;
    private Boolean e;
    private Boolean f;
    private aaqd g;
    private aatd h;
    private Double i;
    private aabv j;
    private Long k;
    private Long l;
    private Long m;
    private Double n;
    private Double o;
    private Long p;
    private Long q;
    private String r;
    private Long s;
    private aaxu t;

    private aacz a() {
        aacz aacz = (aacz) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aacz.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aacz.b = str;
        }
        bool = this.c;
        if (bool != null) {
            aacz.c = bool;
        }
        aasa aasa = this.d;
        if (aasa != null) {
            aacz.d = aasa;
        }
        bool = this.e;
        if (bool != null) {
            aacz.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aacz.f = bool;
        }
        aaqd aaqd = this.g;
        if (aaqd != null) {
            aacz.g = aaqd;
        }
        aatd aatd = this.h;
        if (aatd != null) {
            aacz.h = aatd;
        }
        Double d = this.i;
        if (d != null) {
            aacz.i = d;
        }
        aabv aabv = this.j;
        if (aabv != null) {
            aacz.j = aabv;
        }
        Long l = this.k;
        if (l != null) {
            aacz.k = l;
        }
        l = this.l;
        if (l != null) {
            aacz.l = l;
        }
        l = this.m;
        if (l != null) {
            aacz.m = l;
        }
        d = this.n;
        if (d != null) {
            aacz.n = d;
        }
        d = this.o;
        if (d != null) {
            aacz.o = d;
        }
        l = this.p;
        if (l != null) {
            aacz.p = l;
        }
        l = this.q;
        if (l != null) {
            aacz.q = l;
        }
        str = this.r;
        if (str != null) {
            aacz.r = str;
        }
        l = this.s;
        if (l != null) {
            aacz.s = l;
        }
        aaxu aaxu = this.t;
        if (aaxu != null) {
            aacz.a(aaxu.clone());
        }
        return aacz;
    }

    public final void a(aabv aabv) {
        this.j = aabv;
    }

    public final void a(aaqd aaqd) {
        this.g = aaqd;
    }

    public final void a(aasa aasa) {
        this.d = aasa;
    }

    public final void a(aatd aatd) {
        this.h = aatd;
    }

    public final void a(aaxu aaxu) {
        if (aaxu == null) {
            this.t = null;
        } else {
            this.t = new aaxu(aaxu);
        }
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(Double d) {
        this.i = d;
    }

    public final void a(Long l) {
        this.k = l;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_front_facing", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("lens_id", str);
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("is_snappable", bool);
        }
        aasa aasa = this.d;
        if (aasa != null) {
            hashMap.put("recorder_type", aasa.toString());
        }
        bool = this.e;
        if (bool != null) {
            hashMap.put("is_multiple_frame_buffer_enabled", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("is_surface_recording_supported", bool);
        }
        aaqd aaqd = this.g;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.h;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.i;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        aabv aabv = this.j;
        if (aabv != null) {
            hashMap.put("current_camera_api", aabv.toString());
        }
        Long l = this.k;
        if (l != null) {
            hashMap.put("frame_count", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("slightly_sticky_frame_count", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("sticky_frame_count", l);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("avg_fps", d);
        }
        d = this.o;
        if (d != null) {
            hashMap.put("std_fps", d);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("max_frame_timestamp_gap_ms", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("max_frame_total_delay_ms", l);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("fps_detail", str);
        }
        l = this.s;
        if (l != null) {
            hashMap.put("record_duration_ms", l);
        }
        aaxu aaxu = this.t;
        if (aaxu != null) {
            hashMap.putAll(aaxu.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.c = bool;
    }

    public final void b(Double d) {
        this.n = d;
    }

    public final void b(Long l) {
        this.l = l;
    }

    public final void b(String str) {
        this.r = str;
    }

    public final void c(Boolean bool) {
        this.e = bool;
    }

    public final void c(Double d) {
        this.o = d;
    }

    public final void c(Long l) {
        this.m = l;
    }

    public final void d(Boolean bool) {
        this.f = bool;
    }

    public final void d(Long l) {
        this.p = l;
    }

    public final void e(Long l) {
        this.q = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacz) obj).asDictionary());
    }

    public final void f(Long l) {
        this.s = l;
    }

    public final String getEventName() {
        return "CAMERA_VIDEO_RECORD_FPS";
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
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasa aasa = this.d;
        hashCode = (hashCode + (aasa != null ? aasa.hashCode() : 0)) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aaqd aaqd = this.g;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.h;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aabv aabv = this.j;
        hashCode = (hashCode + (aabv != null ? aabv.hashCode() : 0)) * 31;
        Long l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.o;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaxu aaxu = this.t;
        if (aaxu != null) {
            i = aaxu.hashCode();
        }
        return hashCode + i;
    }
}
