package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aail */
public final class aail extends aaim {
    private aaqd a;
    private aatd b;
    private Double c;
    private String d;
    private aapp e;
    private String f;
    private String g;
    private String h;
    private aamc i;
    private String j;
    private aauo k;
    private aamp l;
    private String m;
    private Boolean n;
    private Boolean o;
    private aadc p;
    private aamg q;
    private String r;
    private String s;
    private aajs t;
    private String u;
    private String v;
    private String w;
    private String x;
    private aahp y;

    private aail aM() {
        aail aail = (aail) super.clone();
        aaqd aaqd = this.a;
        if (aaqd != null) {
            aail.a = aaqd;
        }
        aatd aatd = this.b;
        if (aatd != null) {
            aail.b = aatd;
        }
        Double d = this.c;
        if (d != null) {
            aail.c = d;
        }
        String str = this.d;
        if (str != null) {
            aail.d = str;
        }
        aapp aapp = this.e;
        if (aapp != null) {
            aail.e = aapp;
        }
        str = this.f;
        if (str != null) {
            aail.f = str;
        }
        str = this.g;
        if (str != null) {
            aail.g = str;
        }
        str = this.h;
        if (str != null) {
            aail.h = str;
        }
        aamc aamc = this.i;
        if (aamc != null) {
            aail.i = aamc;
        }
        str = this.j;
        if (str != null) {
            aail.j = str;
        }
        aauo aauo = this.k;
        if (aauo != null) {
            aail.k = aauo;
        }
        aamp aamp = this.l;
        if (aamp != null) {
            aail.l = aamp;
        }
        str = this.m;
        if (str != null) {
            aail.m = str;
        }
        Boolean bool = this.n;
        if (bool != null) {
            aail.n = bool;
        }
        bool = this.o;
        if (bool != null) {
            aail.o = bool;
        }
        aadc aadc = this.p;
        if (aadc != null) {
            aail.p = aadc;
        }
        aamg aamg = this.q;
        if (aamg != null) {
            aail.q = aamg;
        }
        str = this.r;
        if (str != null) {
            aail.r = str;
        }
        str = this.s;
        if (str != null) {
            aail.s = str;
        }
        aajs aajs = this.t;
        if (aajs != null) {
            aail.t = aajs;
        }
        str = this.u;
        if (str != null) {
            aail.u = str;
        }
        str = this.v;
        if (str != null) {
            aail.v = str;
        }
        str = this.w;
        if (str != null) {
            aail.w = str;
        }
        str = this.x;
        if (str != null) {
            aail.x = str;
        }
        aahp aahp = this.y;
        if (aahp != null) {
            aail.a(aahp.clone());
        }
        return aail;
    }

    public final String a() {
        return this.g;
    }

    public final void a(aahp aahp) {
        if (aahp == null) {
            this.y = null;
        } else {
            this.y = new aahp(aahp);
        }
    }

    public final void a(aapp aapp) {
        this.e = aapp;
    }

    public final void a(aaqd aaqd) {
        this.a = aaqd;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaqd aaqd = this.a;
        if (aaqd != null) {
            hashMap.put("low_light_status", aaqd.toString());
        }
        aatd aatd = this.b;
        if (aatd != null) {
            hashMap.put("night_mode_state", aatd.toString());
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("light_sensor_value", d);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        aapp aapp = this.e;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        aamc aamc = this.i;
        if (aamc != null) {
            hashMap.put("filter_streak", aamc.toString());
        }
        str = this.j;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        aauo aauo = this.k;
        if (aauo != null) {
            hashMap.put("player_version", aauo.toString());
        }
        aamp aamp = this.l;
        if (aamp != null) {
            hashMap.put("gallery_context_menu_source", aamp.toString());
        }
        str = this.m;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        Boolean bool = this.n;
        if (bool != null) {
            hashMap.put("with_zooming", bool);
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("zsl_capture", bool);
        }
        aadc aadc = this.p;
        if (aadc != null) {
            hashMap.put("capture_source", aadc.toString());
        }
        aamg aamg = this.q;
        if (aamg != null) {
            hashMap.put("flash_trigger_source", aamg.toString());
        }
        str = this.r;
        if (str != null) {
            hashMap.put("camera_sdk", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("camera_flip_action_pre_capture", str);
        }
        aajs aajs = this.t;
        if (aajs != null) {
            hashMap.put("entry_type", aajs.toString());
        }
        str = this.u;
        if (str != null) {
            hashMap.put("entry_id", str);
        }
        str = this.v;
        if (str != null) {
            hashMap.put("external_id", str);
        }
        str = this.w;
        if (str != null) {
            hashMap.put("gallery_collection_category", str);
        }
        str = this.x;
        if (str != null) {
            hashMap.put("gallery_collection_id", str);
        }
        aahp aahp = this.y;
        if (aahp != null) {
            hashMap.putAll(aahp.f());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaim b() {
        return aM();
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final void d(String str) {
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aail) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_PREVIEW";
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
        aaqd aaqd = this.a;
        int i = 0;
        hashCode = (hashCode + (aaqd != null ? aaqd.hashCode() : 0)) * 31;
        aatd aatd = this.b;
        hashCode = (hashCode + (aatd != null ? aatd.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aapp aapp = this.e;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamc aamc = this.i;
        hashCode = (hashCode + (aamc != null ? aamc.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aauo aauo = this.k;
        hashCode = (hashCode + (aauo != null ? aauo.hashCode() : 0)) * 31;
        aamp aamp = this.l;
        hashCode = (hashCode + (aamp != null ? aamp.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aadc aadc = this.p;
        hashCode = (hashCode + (aadc != null ? aadc.hashCode() : 0)) * 31;
        aamg aamg = this.q;
        hashCode = (hashCode + (aamg != null ? aamg.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aajs aajs = this.t;
        hashCode = (hashCode + (aajs != null ? aajs.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.v;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aahp aahp = this.y;
        if (aahp != null) {
            i = aahp.hashCode();
        }
        return hashCode + i;
    }
}
