package defpackage;

import com.brightcove.player.event.EventType;
import com.looksery.sdk.ProfilingSessionReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aaoc */
public final class aaoc extends abhw {
    private String A;
    private String B;
    private Double C;
    private String D;
    private String E;
    private String F;
    public Long a;
    public Long b;
    public Boolean c;
    public abaw d;
    public Double e;
    public Boolean f;
    public aasc g;
    public Boolean h;
    public String i;
    public String j;
    public aapp k;
    public Long l;
    public Long m;
    public String n;
    public Long o;
    public Long p;
    public String q;
    private Long r;
    private Boolean s;
    private String t;
    private aame u;
    private aamf v;
    private aalw w;
    private String x;
    private String y;
    private String z;

    private aaoc a() {
        aaoc aaoc = (aaoc) super.clone();
        Long l = this.a;
        if (l != null) {
            aaoc.a = l;
        }
        l = this.r;
        if (l != null) {
            aaoc.r = l;
        }
        l = this.b;
        if (l != null) {
            aaoc.b = l;
        }
        Boolean bool = this.s;
        if (bool != null) {
            aaoc.s = bool;
        }
        String str = this.t;
        if (str != null) {
            aaoc.t = str;
        }
        aame aame = this.u;
        if (aame != null) {
            aaoc.u = aame;
        }
        bool = this.c;
        if (bool != null) {
            aaoc.c = bool;
        }
        abaw abaw = this.d;
        if (abaw != null) {
            aaoc.d = abaw;
        }
        Double d = this.e;
        if (d != null) {
            aaoc.e = d;
        }
        bool = this.f;
        if (bool != null) {
            aaoc.f = bool;
        }
        aasc aasc = this.g;
        if (aasc != null) {
            aaoc.g = aasc;
        }
        bool = this.h;
        if (bool != null) {
            aaoc.h = bool;
        }
        aamf aamf = this.v;
        if (aamf != null) {
            aaoc.v = aamf;
        }
        aalw aalw = this.w;
        if (aalw != null) {
            aaoc.w = aalw;
        }
        str = this.x;
        if (str != null) {
            aaoc.x = str;
        }
        str = this.y;
        if (str != null) {
            aaoc.y = str;
        }
        str = this.i;
        if (str != null) {
            aaoc.i = str;
        }
        str = this.j;
        if (str != null) {
            aaoc.j = str;
        }
        aapp aapp = this.k;
        if (aapp != null) {
            aaoc.k = aapp;
        }
        str = this.z;
        if (str != null) {
            aaoc.z = str;
        }
        str = this.A;
        if (str != null) {
            aaoc.A = str;
        }
        str = this.B;
        if (str != null) {
            aaoc.B = str;
        }
        d = this.C;
        if (d != null) {
            aaoc.C = d;
        }
        str = this.D;
        if (str != null) {
            aaoc.D = str;
        }
        l = this.l;
        if (l != null) {
            aaoc.l = l;
        }
        l = this.m;
        if (l != null) {
            aaoc.m = l;
        }
        str = this.n;
        if (str != null) {
            aaoc.n = str;
        }
        l = this.o;
        if (l != null) {
            aaoc.o = l;
        }
        l = this.p;
        if (l != null) {
            aaoc.p = l;
        }
        str = this.q;
        if (str != null) {
            aaoc.q = str;
        }
        str = this.E;
        if (str != null) {
            aaoc.E = str;
        }
        str = this.F;
        if (str != null) {
            aaoc.F = str;
        }
        return aaoc;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("multi_snap_count", l);
        }
        l = this.r;
        if (l != null) {
            hashMap.put(EventType.CAPTION, l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("camera", l);
        }
        Boolean bool = this.s;
        if (bool != null) {
            hashMap.put("drawing", bool);
        }
        String str = this.t;
        if (str != null) {
            hashMap.put(ProfilingSessionReceiver.EXTRA_STRING_FIELD_FILTER, str);
        }
        aame aame = this.u;
        if (aame != null) {
            hashMap.put("filter_type", aame.toString());
        }
        bool = this.c;
        if (bool != null) {
            hashMap.put("flash", bool);
        }
        abaw abaw = this.d;
        if (abaw != null) {
            hashMap.put("source", abaw.toString());
        }
        Double d = this.e;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("snap_time_is_loop", bool);
        }
        aasc aasc = this.g;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        bool = this.h;
        if (bool != null) {
            hashMap.put("hands_free", bool);
        }
        aamf aamf = this.v;
        if (aamf != null) {
            hashMap.put("filter_visual", aamf.toString());
        }
        aalw aalw = this.w;
        if (aalw != null) {
            hashMap.put("filter_info", aalw.toString());
        }
        str = this.x;
        if (str != null) {
            hashMap.put("filter_geofence", str);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("filter_sponsor", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("filter_geolens_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        aapp aapp = this.k;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.z;
        if (str != null) {
            hashMap.put("laguna_user_agent", str);
        }
        str = this.A;
        if (str != null) {
            hashMap.put("laguna_device_id", str);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("specs_content_id", str);
        }
        d = this.C;
        if (d != null) {
            hashMap.put("snap_create_ts", d);
        }
        str = this.D;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("face_front_camera_count", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("face_back_camera_count", l);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("lens_bundle_url", str);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("lens_index_pos", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("lens_index_count", l);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("lens_info", str);
        }
        str = this.E;
        if (str != null) {
            hashMap.put("topsnap_ad_id", str);
        }
        str = this.F;
        if (str != null) {
            hashMap.put("topsnap_request_id", str);
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
        return asDictionary().equals(((aaoc) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOLENS_DIRECT_SNAP_CREATE";
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
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.s;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aame aame = this.u;
        hashCode = (hashCode + (aame != null ? aame.hashCode() : 0)) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abaw abaw = this.d;
        hashCode = (hashCode + (abaw != null ? abaw.hashCode() : 0)) * 31;
        Double d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.g;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aamf aamf = this.v;
        hashCode = (hashCode + (aamf != null ? aamf.hashCode() : 0)) * 31;
        aalw aalw = this.w;
        hashCode = (hashCode + (aalw != null ? aalw.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aapp aapp = this.k;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.A;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.C;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.D;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.E;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.F;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
