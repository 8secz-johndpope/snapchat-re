package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanp */
public final class aanp extends aait {
    private String A;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private aapp f;
    private String g;
    private Long h;
    private Long i;
    private String j;
    private Long k;
    private Long l;
    private String m;
    private Double n;
    private Double o;
    private Boolean p;
    private Long q;
    private String r;
    private Boolean s;
    private String t;
    private Boolean u;
    private Long v;
    private aamb w;
    private String x;
    private String y;
    private String z;

    private aanp d() {
        aanp aanp = (aanp) super.clone();
        String str = this.a;
        if (str != null) {
            aanp.a = str;
        }
        str = this.b;
        if (str != null) {
            aanp.b = str;
        }
        str = this.c;
        if (str != null) {
            aanp.c = str;
        }
        str = this.d;
        if (str != null) {
            aanp.d = str;
        }
        str = this.e;
        if (str != null) {
            aanp.e = str;
        }
        aapp aapp = this.f;
        if (aapp != null) {
            aanp.f = aapp;
        }
        str = this.g;
        if (str != null) {
            aanp.g = str;
        }
        Long l = this.h;
        if (l != null) {
            aanp.h = l;
        }
        l = this.i;
        if (l != null) {
            aanp.i = l;
        }
        str = this.j;
        if (str != null) {
            aanp.j = str;
        }
        l = this.k;
        if (l != null) {
            aanp.k = l;
        }
        l = this.l;
        if (l != null) {
            aanp.l = l;
        }
        str = this.m;
        if (str != null) {
            aanp.m = str;
        }
        Double d = this.n;
        if (d != null) {
            aanp.n = d;
        }
        d = this.o;
        if (d != null) {
            aanp.o = d;
        }
        Boolean bool = this.p;
        if (bool != null) {
            aanp.p = bool;
        }
        l = this.q;
        if (l != null) {
            aanp.q = l;
        }
        str = this.r;
        if (str != null) {
            aanp.r = str;
        }
        bool = this.s;
        if (bool != null) {
            aanp.s = bool;
        }
        str = this.t;
        if (str != null) {
            aanp.t = str;
        }
        bool = this.u;
        if (bool != null) {
            aanp.u = bool;
        }
        l = this.v;
        if (l != null) {
            aanp.v = l;
        }
        aamb aamb = this.w;
        if (aamb != null) {
            aanp.w = aamb;
        }
        str = this.x;
        if (str != null) {
            aanp.x = str;
        }
        str = this.y;
        if (str != null) {
            aanp.y = str;
        }
        str = this.z;
        if (str != null) {
            aanp.z = str;
        }
        str = this.A;
        if (str != null) {
            aanp.A = str;
        }
        return aanp;
    }

    public final void Q(Long l) {
        this.k = l;
    }

    public final void R(Long l) {
        this.l = l;
    }

    public final void S(Long l) {
        this.q = l;
    }

    public final /* synthetic */ aait a() {
        return d();
    }

    public final void a(aapp aapp) {
        this.f = aapp;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("enc_geo_data", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("filter_geofilter_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("filter_geofilter_id_list", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("filter_geolens_id", str);
        }
        aapp aapp = this.f;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.g;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        Long l = this.h;
        if (l != null) {
            hashMap.put("filter_index_pos", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("filter_index_count", l);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("sticker_geo_bitmoji_count", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("sticker_geo_bitmoji_from_recents_count", l);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("sticker_geo_bitmoji_list", str);
        }
        Double d = this.n;
        if (d != null) {
            hashMap.put("cached_time_sec", d);
        }
        d = this.o;
        if (d != null) {
            hashMap.put("cached_date", d);
        }
        Boolean bool = this.p;
        if (bool != null) {
            hashMap.put("is_cached", bool);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("venue_tap_index", l);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("filter_venue_id", str);
        }
        bool = this.s;
        if (bool != null) {
            hashMap.put("with_geofilter_transition", bool);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("dynamic_context_source_list", str);
        }
        bool = this.u;
        if (bool != null) {
            hashMap.put("with_geolocation", bool);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        aamb aamb = this.w;
        if (aamb != null) {
            hashMap.put("filter_source", aamb.toString());
        }
        str = this.x;
        if (str != null) {
            hashMap.put("widget_value_list", str);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("topsnap_ad_id", str);
        }
        str = this.z;
        if (str != null) {
            hashMap.put("topsnap_request_id", str);
        }
        str = this.A;
        if (str != null) {
            hashMap.put("snappable_funnel_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanp) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_DIRECT_SNAP_SEND";
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aapp aapp = this.f;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.o;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.p;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.s;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aamb aamb = this.w;
        hashCode = (hashCode + (aamb != null ? aamb.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.A;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final void s(Boolean bool) {
        this.s = bool;
    }

    public final void w(String str) {
        this.x = str;
    }

    public final void y(String str) {
        this.m = str;
    }

    public final void z(String str) {
        this.r = str;
    }
}
