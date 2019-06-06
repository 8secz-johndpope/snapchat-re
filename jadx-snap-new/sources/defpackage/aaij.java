package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaij */
public final class aaij extends abhw {
    private Long A;
    private Boolean B;
    private String C;
    private Boolean D;
    private aars E;
    private String a;
    private aaqd b;
    private aatd c;
    private Double d;
    private Boolean e;
    private Boolean f;
    private abgd g;
    private Double h;
    private Long i;
    private Double j;
    private Long k;
    private Long l;
    private aabv m;
    private abaw n;
    private Boolean o;
    private Long p;
    private Long q;
    private String r;
    private Double s;
    private Double t;
    private Double u;
    private Double v;
    private Double w;
    private Boolean x;
    private Boolean y;
    private Long z;

    private aaij a() {
        aaij aaij = (aaij) super.clone();
        String str = this.a;
        if (str != null) {
            aaij.a = str;
        }
        aaqd aaqd = this.b;
        if (aaqd != null) {
            aaij.b = aaqd;
        }
        aatd aatd = this.c;
        if (aatd != null) {
            aaij.c = aatd;
        }
        Double d = this.d;
        if (d != null) {
            aaij.d = d;
        }
        Boolean bool = this.e;
        if (bool != null) {
            aaij.e = bool;
        }
        bool = this.f;
        if (bool != null) {
            aaij.f = bool;
        }
        abgd abgd = this.g;
        if (abgd != null) {
            aaij.g = abgd;
        }
        d = this.h;
        if (d != null) {
            aaij.h = d;
        }
        Long l = this.i;
        if (l != null) {
            aaij.i = l;
        }
        d = this.j;
        if (d != null) {
            aaij.j = d;
        }
        l = this.k;
        if (l != null) {
            aaij.k = l;
        }
        l = this.l;
        if (l != null) {
            aaij.l = l;
        }
        aabv aabv = this.m;
        if (aabv != null) {
            aaij.m = aabv;
        }
        abaw abaw = this.n;
        if (abaw != null) {
            aaij.n = abaw;
        }
        bool = this.o;
        if (bool != null) {
            aaij.o = bool;
        }
        l = this.p;
        if (l != null) {
            aaij.p = l;
        }
        l = this.q;
        if (l != null) {
            aaij.q = l;
        }
        str = this.r;
        if (str != null) {
            aaij.r = str;
        }
        d = this.s;
        if (d != null) {
            aaij.s = d;
        }
        d = this.t;
        if (d != null) {
            aaij.t = d;
        }
        d = this.u;
        if (d != null) {
            aaij.u = d;
        }
        d = this.v;
        if (d != null) {
            aaij.v = d;
        }
        d = this.w;
        if (d != null) {
            aaij.w = d;
        }
        bool = this.x;
        if (bool != null) {
            aaij.x = bool;
        }
        bool = this.y;
        if (bool != null) {
            aaij.y = bool;
        }
        l = this.z;
        if (l != null) {
            aaij.z = l;
        }
        l = this.A;
        if (l != null) {
            aaij.A = l;
        }
        bool = this.B;
        if (bool != null) {
            aaij.B = bool;
        }
        str = this.C;
        if (str != null) {
            aaij.C = str;
        }
        bool = this.D;
        if (bool != null) {
            aaij.D = bool;
        }
        aars aars = this.E;
        if (aars != null) {
            aaij.a(aars.clone());
        }
        return aaij;
    }

    public final void a(aabv aabv) {
        this.m = aabv;
    }

    public final void a(aaqd aaqd) {
        this.b = aaqd;
    }

    public final void a(aars aars) {
        if (aars == null) {
            this.E = null;
        } else {
            this.E = new aars(aars);
        }
    }

    public final void a(abaw abaw) {
        this.n = abaw;
    }

    public final void a(abgd abgd) {
        this.g = abgd;
    }

    public final void a(Boolean bool) {
        this.e = bool;
    }

    public final void a(Long l) {
        this.i = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        aaqd aaqd = this.b;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.c;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        Boolean bool = this.e;
        if (bool != null) {
            hashMap.put("flash", bool);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("with_front_facing", bool);
        }
        abgd abgd = this.g;
        if (abgd != null) {
            hashMap.put("take_picture_method", abgd.toString());
        }
        d = this.h;
        if (d != null) {
            hashMap.put("shutter_speed", d);
        }
        Long l = this.i;
        if (l != null) {
            hashMap.put("i_s_o", l);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("aperture", d);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("shutter_delay_ms", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("capture_delay_ms", l);
        }
        aabv aabv = this.m;
        if (aabv != null) {
            hashMap.put("camera_api", aabv.toString());
        }
        abaw abaw = this.n;
        if (abaw != null) {
            hashMap.put("snap_source", abaw.toString());
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("hands_free", bool);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("recorder_init_delay_ms", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("preview_stay_duration_ms", l);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        d = this.s;
        if (d != null) {
            hashMap.put("brightness", d);
        }
        d = this.t;
        if (d != null) {
            hashMap.put("acceleration_motion", d);
        }
        d = this.u;
        if (d != null) {
            hashMap.put("frame_difference", d);
        }
        d = this.v;
        if (d != null) {
            hashMap.put("max_processing_delay_ms", d);
        }
        d = this.w;
        if (d != null) {
            hashMap.put("psnr", d);
        }
        bool = this.x;
        if (bool != null) {
            hashMap.put("with_adjusting_exposure", bool);
        }
        bool = this.y;
        if (bool != null) {
            hashMap.put("with_adjusting_focus", bool);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("face_front_camera_count", l);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("face_back_camera_count", l);
        }
        bool = this.B;
        if (bool != null) {
            hashMap.put("with_creative_tool", bool);
        }
        str = this.C;
        if (str != null) {
            hashMap.put("camera_sdk", str);
        }
        bool = this.D;
        if (bool != null) {
            hashMap.put("zsl_capture", bool);
        }
        aars aars = this.E;
        if (aars != null) {
            hashMap.putAll(aars.a());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.f = bool;
    }

    public final void b(Long l) {
        this.z = l;
    }

    public final void b(String str) {
        this.r = str;
    }

    public final void c(Boolean bool) {
        this.o = bool;
    }

    public final void c(Long l) {
        this.A = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaij) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_DISCARD";
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
        aaqd aaqd = this.b;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.c;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abgd abgd = this.g;
        hashCode = (hashCode + (abgd != null ? abgd.hashCode() : 0)) * 31;
        d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aabv aabv = this.m;
        hashCode = (hashCode + (aabv != null ? aabv.hashCode() : 0)) * 31;
        abaw abaw = this.n;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.s;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.t;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.u;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.v;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.w;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.x;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.B;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.C;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.D;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aars aars = this.E;
        if (aars != null) {
            i = aars.hashCode();
        }
        return hashCode + i;
    }
}
