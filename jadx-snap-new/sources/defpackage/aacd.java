package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aacd */
public final class aacd extends abhw {
    private String a;
    private Boolean b;
    private aaqd c;
    private aatd d;
    private Double e;
    private aamg f;
    private abaw g;
    private String h;
    private Double i;
    private Long j;
    private Long k;
    private Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private Long q;
    private Long r;
    private Double s;

    private aacd c() {
        aacd aacd = (aacd) super.clone();
        String str = this.a;
        if (str != null) {
            aacd.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aacd.b = bool;
        }
        aaqd aaqd = this.c;
        if (aaqd != null) {
            aacd.c = aaqd;
        }
        aatd aatd = this.d;
        if (aatd != null) {
            aacd.d = aatd;
        }
        Double d = this.e;
        if (d != null) {
            aacd.e = d;
        }
        aamg aamg = this.f;
        if (aamg != null) {
            aacd.f = aamg;
        }
        abaw abaw = this.g;
        if (abaw != null) {
            aacd.g = abaw;
        }
        str = this.h;
        if (str != null) {
            aacd.h = str;
        }
        d = this.i;
        if (d != null) {
            aacd.i = d;
        }
        Long l = this.j;
        if (l != null) {
            aacd.j = l;
        }
        l = this.k;
        if (l != null) {
            aacd.k = l;
        }
        l = this.l;
        if (l != null) {
            aacd.l = l;
        }
        l = this.m;
        if (l != null) {
            aacd.m = l;
        }
        l = this.n;
        if (l != null) {
            aacd.n = l;
        }
        l = this.o;
        if (l != null) {
            aacd.o = l;
        }
        l = this.p;
        if (l != null) {
            aacd.p = l;
        }
        l = this.q;
        if (l != null) {
            aacd.q = l;
        }
        l = this.r;
        if (l != null) {
            aacd.r = l;
        }
        d = this.s;
        if (d != null) {
            aacd.s = d;
        }
        return aacd;
    }

    public final void a() {
        this.d = null;
    }

    public final void a(aamg aamg) {
        this.f = aamg;
    }

    public final void a(aaqd aaqd) {
        this.c = aaqd;
    }

    public final void a(abaw abaw) {
        this.g = abaw;
    }

    public final void a(Double d) {
        this.i = d;
    }

    public final void a(Long l) {
        this.j = l;
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
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_zooming", bool);
        }
        aaqd aaqd = this.c;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.d;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        aamg aamg = this.f;
        if (aamg != null) {
            hashMap.put("flash_trigger_source", aamg.toString());
        }
        abaw abaw = this.g;
        if (abaw != null) {
            hashMap.put("snap_source", abaw.toString());
        }
        str = this.h;
        if (str != null) {
            hashMap.put("user_clicks", str);
        }
        d = this.i;
        if (d != null) {
            hashMap.put("zooming_factor", d);
        }
        Long l = this.j;
        if (l != null) {
            hashMap.put("number_of_low_light_button_clicks", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("number_of_flash_button_clicks", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("number_of_double_tap_flips", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("number_of_flip_button_clicks", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("number_of_camera_mode_dropdown_clicks", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("number_of_timer_button_clicks", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("number_of_grid_button_clicks", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("number_of_portrait_button_clicks", l);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("number_of_batch_button_clicks", l);
        }
        d = this.s;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b() {
        this.e = null;
    }

    public final void b(Long l) {
        this.k = l;
    }

    public final void c(Long l) {
        this.l = l;
    }

    public final void d(Long l) {
        this.m = l;
    }

    public final void e(Long l) {
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aacd) obj).asDictionary());
    }

    public final void f(Long l) {
        this.o = l;
    }

    public final void g(Long l) {
        this.p = l;
    }

    public final String getEventName() {
        return "CAMERA_LIVE_PREVIEW";
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

    public final void h(Long l) {
        this.q = l;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aaqd aaqd = this.c;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.d;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aamg aamg = this.f;
        hashCode = (hashCode + (aamg != null ? aamg.hashCode() : 0)) * 31;
        abaw abaw = this.g;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.j;
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
        d = this.s;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public final void i(Long l) {
        this.r = l;
    }
}
