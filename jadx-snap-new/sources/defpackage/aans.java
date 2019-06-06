package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aans */
public final class aans extends aamd {
    private String a;
    private String b;
    private String c;
    private aasc d;
    private String e;
    private Long f;
    private Boolean g;
    private aaur h;
    private Double i;
    private Double j;
    private Boolean k;
    private String l;
    private String m;
    private Long n;
    private String o;
    private aant p;
    private Boolean q;
    private String r;
    private Boolean s;
    private aamb t;
    private String u;
    private Boolean v;
    private aasc w;

    private aans c() {
        aans aans = (aans) super.clone();
        String str = this.a;
        if (str != null) {
            aans.a = str;
        }
        str = this.b;
        if (str != null) {
            aans.b = str;
        }
        str = this.c;
        if (str != null) {
            aans.c = str;
        }
        aasc aasc = this.d;
        if (aasc != null) {
            aans.d = aasc;
        }
        str = this.e;
        if (str != null) {
            aans.e = str;
        }
        Long l = this.f;
        if (l != null) {
            aans.f = l;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aans.g = bool;
        }
        aaur aaur = this.h;
        if (aaur != null) {
            aans.h = aaur;
        }
        Double d = this.i;
        if (d != null) {
            aans.i = d;
        }
        d = this.j;
        if (d != null) {
            aans.j = d;
        }
        bool = this.k;
        if (bool != null) {
            aans.k = bool;
        }
        str = this.l;
        if (str != null) {
            aans.l = str;
        }
        str = this.m;
        if (str != null) {
            aans.m = str;
        }
        l = this.n;
        if (l != null) {
            aans.n = l;
        }
        str = this.o;
        if (str != null) {
            aans.o = str;
        }
        aant aant = this.p;
        if (aant != null) {
            aans.p = aant;
        }
        bool = this.q;
        if (bool != null) {
            aans.q = bool;
        }
        str = this.r;
        if (str != null) {
            aans.r = str;
        }
        bool = this.s;
        if (bool != null) {
            aans.s = bool;
        }
        aamb aamb = this.t;
        if (aamb != null) {
            aans.t = aamb;
        }
        str = this.u;
        if (str != null) {
            aans.u = str;
        }
        bool = this.v;
        if (bool != null) {
            aans.v = bool;
        }
        aasc = this.w;
        if (aasc != null) {
            aans.w = aasc;
        }
        return aans;
    }

    public final /* synthetic */ aamd a() {
        return c();
    }

    public final void a(aasc aasc) {
        this.d = aasc;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_geofilter_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        aasc aasc = this.d;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        str = this.e;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("update_attempt_count", l);
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("is_geofilter_from_precache", bool);
        }
        aaur aaur = this.h;
        if (aaur != null) {
            hashMap.put("precache_status", aaur.toString());
        }
        Double d = this.i;
        if (d != null) {
            hashMap.put("cached_time_sec", d);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("cached_date", d);
        }
        bool = this.k;
        if (bool != null) {
            hashMap.put("is_cached", bool);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("enc_geo_data", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("venue_filter_array", str);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("venue_tap_index", l);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("filter_venue_id", str);
        }
        aant aant = this.p;
        if (aant != null) {
            hashMap.put("geofilter_geofilter_type", aant.toString());
        }
        bool = this.q;
        if (bool != null) {
            hashMap.put("with_geofilter_transition", bool);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("dynamic_context_source_list", str);
        }
        bool = this.s;
        if (bool != null) {
            hashMap.put("with_geolocation", bool);
        }
        aamb aamb = this.t;
        if (aamb != null) {
            hashMap.put("filter_source", aamb.toString());
        }
        str = this.u;
        if (str != null) {
            hashMap.put("widget_value_list", str);
        }
        bool = this.v;
        if (bool != null) {
            hashMap.put("with_attachment_open", bool);
        }
        aasc = this.w;
        if (aasc != null) {
            hashMap.put("attachment_type", aasc.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abgb b() {
        return c();
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aans) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_GEOFILTER_SWIPE";
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
        aasc aasc = this.d;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aaur aaur = this.h;
        hashCode = (hashCode + (aaur != null ? aaur.hashCode() : 0)) * 31;
        Double d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aant aant = this.p;
        hashCode = (hashCode + (aant != null ? aant.hashCode() : 0)) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.s;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aamb aamb = this.t;
        hashCode = (hashCode + (aamb != null ? aamb.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.v;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc = this.w;
        if (aasc != null) {
            i = aasc.hashCode();
        }
        return hashCode + i;
    }
}
