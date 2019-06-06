package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaip */
public final class aaip extends aaiq {
    private String a;
    private String b;
    private aapp c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Long h;
    private String i;
    private String j;
    private Boolean k;
    private Boolean l;
    private aadc m;
    private aaqd n;
    private aatd o;
    private Double p;
    private String q;
    private String r;

    private aaip E() {
        aaip aaip = (aaip) super.clone();
        String str = this.a;
        if (str != null) {
            aaip.a = str;
        }
        str = this.b;
        if (str != null) {
            aaip.b = str;
        }
        aapp aapp = this.c;
        if (aapp != null) {
            aaip.c = aapp;
        }
        str = this.d;
        if (str != null) {
            aaip.d = str;
        }
        str = this.e;
        if (str != null) {
            aaip.e = str;
        }
        str = this.f;
        if (str != null) {
            aaip.f = str;
        }
        str = this.g;
        if (str != null) {
            aaip.g = str;
        }
        Long l = this.h;
        if (l != null) {
            aaip.h = l;
        }
        str = this.i;
        if (str != null) {
            aaip.i = str;
        }
        str = this.j;
        if (str != null) {
            aaip.j = str;
        }
        Boolean bool = this.k;
        if (bool != null) {
            aaip.k = bool;
        }
        bool = this.l;
        if (bool != null) {
            aaip.l = bool;
        }
        aadc aadc = this.m;
        if (aadc != null) {
            aaip.m = aadc;
        }
        aaqd aaqd = this.n;
        if (aaqd != null) {
            aaip.n = aaqd;
        }
        aatd aatd = this.o;
        if (aatd != null) {
            aaip.o = aatd;
        }
        Double d = this.p;
        if (d != null) {
            aaip.p = d;
        }
        str = this.q;
        if (str != null) {
            aaip.q = str;
        }
        str = this.r;
        if (str != null) {
            aaip.r = str;
        }
        return aaip;
    }

    public final /* synthetic */ aaiq a() {
        return E();
    }

    public final void a(aapp aapp) {
        this.c = aapp;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        aapp aapp = this.c;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("media_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("entry_id", str);
        }
        Long l = this.h;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        Boolean bool = this.k;
        if (bool != null) {
            hashMap.put("with_zooming", bool);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("zsl_capture", bool);
        }
        aadc aadc = this.m;
        if (aadc != null) {
            hashMap.put("capture_source", aadc.toString());
        }
        aaqd aaqd = this.n;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.o;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.p;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("camera_api", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("camera_sdk", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaip) obj).asDictionary());
    }

    public final void f(String str) {
        this.i = str;
    }

    public final String getEventName() {
        return "DIRECT_SNAP_SAVE";
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
        aapp aapp = this.c;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aadc aadc = this.m;
        hashCode = (hashCode + (aadc != null ? aadc.hashCode() : 0)) * 31;
        aaqd aaqd = this.n;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.o;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.p;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
