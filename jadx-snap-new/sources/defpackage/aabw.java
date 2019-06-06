package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aabw */
public final class aabw extends abhw {
    private String A;
    private String B;
    private aabu C;
    private aabv a;
    private Long b;
    private Boolean c;
    private Boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Long p;
    private Long q;
    private Double r;
    private Double s;
    private Double t;
    private String u;
    private aabt v;
    private Double w;
    private String x;
    private String y;
    private Long z;

    private aabw a() {
        aabw aabw = (aabw) super.clone();
        aabv aabv = this.a;
        if (aabv != null) {
            aabw.a = aabv;
        }
        Long l = this.b;
        if (l != null) {
            aabw.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aabw.c = bool;
        }
        bool = this.d;
        if (bool != null) {
            aabw.d = bool;
        }
        String str = this.e;
        if (str != null) {
            aabw.e = str;
        }
        str = this.f;
        if (str != null) {
            aabw.f = str;
        }
        str = this.g;
        if (str != null) {
            aabw.g = str;
        }
        str = this.h;
        if (str != null) {
            aabw.h = str;
        }
        str = this.i;
        if (str != null) {
            aabw.i = str;
        }
        str = this.j;
        if (str != null) {
            aabw.j = str;
        }
        str = this.k;
        if (str != null) {
            aabw.k = str;
        }
        str = this.l;
        if (str != null) {
            aabw.l = str;
        }
        bool = this.m;
        if (bool != null) {
            aabw.m = bool;
        }
        bool = this.n;
        if (bool != null) {
            aabw.n = bool;
        }
        bool = this.o;
        if (bool != null) {
            aabw.o = bool;
        }
        l = this.p;
        if (l != null) {
            aabw.p = l;
        }
        l = this.q;
        if (l != null) {
            aabw.q = l;
        }
        Double d = this.r;
        if (d != null) {
            aabw.r = d;
        }
        d = this.s;
        if (d != null) {
            aabw.s = d;
        }
        d = this.t;
        if (d != null) {
            aabw.t = d;
        }
        str = this.u;
        if (str != null) {
            aabw.u = str;
        }
        aabt aabt = this.v;
        if (aabt != null) {
            aabw.v = aabt;
        }
        d = this.w;
        if (d != null) {
            aabw.w = d;
        }
        str = this.x;
        if (str != null) {
            aabw.x = str;
        }
        str = this.y;
        if (str != null) {
            aabw.y = str;
        }
        l = this.z;
        if (l != null) {
            aabw.z = l;
        }
        str = this.A;
        if (str != null) {
            aabw.A = str;
        }
        str = this.B;
        if (str != null) {
            aabw.B = str;
        }
        aabu aabu = this.C;
        if (aabu != null) {
            aabw.C = aabu;
        }
        return aabw;
    }

    public final void a(aabt aabt) {
        this.v = aabt;
    }

    public final void a(aabv aabv) {
        this.a = aabv;
    }

    public final void a(Boolean bool) {
        this.c = bool;
    }

    public final void a(Double d) {
        this.r = d;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.e = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aabv aabv = this.a;
        if (aabv != null) {
            hashMap.put("current_camera_api", aabv.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("camera_index", l);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("is_front_facing", bool);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("can_disable_shutter_sound", bool);
        }
        String str = this.e;
        if (str != null) {
            hashMap.put("supported_flash_modes", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("supported_focus_modes", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("supported_preview_fps_ranges", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("supported_recording_resolutions", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("supported_jpeg_picture_resolutions", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("supported_gpu_picture_resolutions", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("supported_preview_resolutions", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("supported_light_modes", str);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("is_zoom_supported", bool);
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("is_video_stabilization_supported", bool);
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("is_optical_stabilization_supported", bool);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("max_exposure_compensation", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("max_localized_focus_areas_count", l);
        }
        Double d = this.r;
        if (d != null) {
            hashMap.put("horizontal_view_angle", d);
        }
        d = this.s;
        if (d != null) {
            hashMap.put("vertical_view_angle", d);
        }
        d = this.t;
        if (d != null) {
            hashMap.put("max_zoom_level", d);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("camera2_sensor_rect", str);
        }
        aabt aabt = this.v;
        if (aabt != null) {
            hashMap.put("camera2_level", aabt.toString());
        }
        d = this.w;
        if (d != null) {
            hashMap.put("camera2_cv_per_step", d);
        }
        str = this.x;
        if (str != null) {
            hashMap.put("camera2_compensation_step_range", str);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("camera2_available_noise_reduction_modes", str);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("max_ae_metering_regions", l);
        }
        str = this.A;
        if (str != null) {
            hashMap.put("exposure_time_range", str);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("camera2_available_capacities", str);
        }
        aabu aabu = this.C;
        if (aabu != null) {
            hashMap.put("camera2_zsl_support", aabu.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.d = bool;
    }

    public final void b(Double d) {
        this.s = d;
    }

    public final void b(Long l) {
        this.p = l;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void c(Boolean bool) {
        this.m = bool;
    }

    public final void c(Double d) {
        this.t = d;
    }

    public final void c(Long l) {
        this.q = l;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final void d(Boolean bool) {
        this.n = bool;
    }

    public final void d(Double d) {
        this.w = d;
    }

    public final void d(Long l) {
        this.z = l;
    }

    public final void d(String str) {
        this.h = str;
    }

    public final void e(Boolean bool) {
        this.o = bool;
    }

    public final void e(String str) {
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aabw) obj).asDictionary());
    }

    public final void f(String str) {
        this.j = str;
    }

    public final void g(String str) {
        this.k = str;
    }

    public final String getEventName() {
        return "CAMERA_CAPACITY";
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

    public final void h(String str) {
        this.l = str;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aabv aabv = this.a;
        int i = 0;
        hashCode = (hashCode + (aabv != null ? aabv.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.r;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.s;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.t;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabt aabt = this.v;
        hashCode = (hashCode + (aabt != null ? aabt.hashCode() : 0)) * 31;
        d = this.w;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.A;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabu aabu = this.C;
        if (aabu != null) {
            i = aabu.hashCode();
        }
        return hashCode + i;
    }

    public final void i(String str) {
        this.u = str;
    }

    public final void j(String str) {
        this.x = str;
    }

    public final void k(String str) {
        this.y = str;
    }

    public final void l(String str) {
        this.A = str;
    }

    public final void m(String str) {
        this.B = str;
    }
}
