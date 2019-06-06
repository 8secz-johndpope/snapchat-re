package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aais */
public final class aais extends aait {
    private String a;
    private String b;
    private aapp c;
    private String d;
    private aamc e;
    private String f;
    private aaua g;
    private Long h;
    private Boolean i;
    private Boolean j;
    private aadc k;
    private aaqd l;
    private aatd m;
    private Double n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private aamk u;
    private aahj v;
    private String w;
    private String x;
    private Boolean y;
    private aahp z;

    private aais d() {
        aais aais = (aais) super.clone();
        String str = this.a;
        if (str != null) {
            aais.a = str;
        }
        str = this.b;
        if (str != null) {
            aais.b = str;
        }
        aapp aapp = this.c;
        if (aapp != null) {
            aais.c = aapp;
        }
        str = this.d;
        if (str != null) {
            aais.d = str;
        }
        aamc aamc = this.e;
        if (aamc != null) {
            aais.e = aamc;
        }
        str = this.f;
        if (str != null) {
            aais.f = str;
        }
        aaua aaua = this.g;
        if (aaua != null) {
            aais.g = aaua;
        }
        Long l = this.h;
        if (l != null) {
            aais.h = l;
        }
        Boolean bool = this.i;
        if (bool != null) {
            aais.i = bool;
        }
        bool = this.j;
        if (bool != null) {
            aais.j = bool;
        }
        aadc aadc = this.k;
        if (aadc != null) {
            aais.k = aadc;
        }
        aaqd aaqd = this.l;
        if (aaqd != null) {
            aais.l = aaqd;
        }
        aatd aatd = this.m;
        if (aatd != null) {
            aais.m = aatd;
        }
        Double d = this.n;
        if (d != null) {
            aais.n = d;
        }
        str = this.o;
        if (str != null) {
            aais.o = str;
        }
        str = this.p;
        if (str != null) {
            aais.p = str;
        }
        str = this.q;
        if (str != null) {
            aais.q = str;
        }
        str = this.r;
        if (str != null) {
            aais.r = str;
        }
        str = this.s;
        if (str != null) {
            aais.s = str;
        }
        str = this.t;
        if (str != null) {
            aais.t = str;
        }
        aamk aamk = this.u;
        if (aamk != null) {
            aais.u = aamk;
        }
        aahj aahj = this.v;
        if (aahj != null) {
            aais.v = aahj;
        }
        str = this.w;
        if (str != null) {
            aais.w = str;
        }
        str = this.x;
        if (str != null) {
            aais.x = str;
        }
        bool = this.y;
        if (bool != null) {
            aais.y = bool;
        }
        aahp aahp = this.z;
        if (aahp != null) {
            aais.a(aahp.clone());
        }
        return aais;
    }

    public final /* synthetic */ aait a() {
        return d();
    }

    public final void a(aahp aahp) {
        if (aahp == null) {
            this.z = null;
        } else {
            this.z = new aahp(aahp);
        }
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
        aamc aamc = this.e;
        if (aamc != null) {
            hashMap.put("filter_streak", aamc.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("filter_venue_id", str);
        }
        aaua aaua = this.g;
        if (aaua != null) {
            hashMap.put("send_source", aaua.toString());
        }
        Long l = this.h;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        Boolean bool = this.i;
        if (bool != null) {
            hashMap.put("with_zooming", bool);
        }
        bool = this.j;
        if (bool != null) {
            hashMap.put("zsl_capture", bool);
        }
        aadc aadc = this.k;
        if (aadc != null) {
            hashMap.put("capture_source", aadc.toString());
        }
        aaqd aaqd = this.l;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.m;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.n;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("camera_api", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("camera_sdk", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        aamk aamk = this.u;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        aahj aahj = this.v;
        if (aahj != null) {
            hashMap.put("correspondent_type", aahj.toString());
        }
        str = this.w;
        if (str != null) {
            hashMap.put("snappable_funnel_id", str);
        }
        str = this.x;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        bool = this.y;
        if (bool != null) {
            hashMap.put("is_from_send_to", bool);
        }
        aahp aahp = this.z;
        if (aahp != null) {
            hashMap.putAll(aahp.f());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.q = str;
    }

    public final void e(String str) {
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aais) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_SEND";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
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
        aamc aamc = this.e;
        hashCode = (hashCode + (aamc != null ? aamc.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaua aaua = this.g;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        Long l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aadc aadc = this.k;
        hashCode = (hashCode + (aadc != null ? aadc.hashCode() : 0)) * 31;
        aaqd aaqd = this.l;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.m;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamk aamk = this.u;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.v;
        hashCode = (hashCode + (aahj != null ? aahj.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aahp aahp = this.z;
        if (aahp != null) {
            i = aahp.hashCode();
        }
        return hashCode + i;
    }
}
