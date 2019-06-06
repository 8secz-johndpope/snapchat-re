package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aann */
public final class aann extends aaim {
    private String a;
    private String b;
    private String c;
    private aapp d;
    private String e;
    private Long f;
    private Long g;
    private String h;
    private String i;
    private Boolean j;
    private String k;
    private String l;
    private Double m;
    private Double n;
    private Long o;
    private String p;

    private aann a() {
        aann aann = (aann) super.clone();
        String str = this.a;
        if (str != null) {
            aann.a = str;
        }
        str = this.b;
        if (str != null) {
            aann.b = str;
        }
        str = this.c;
        if (str != null) {
            aann.c = str;
        }
        aapp aapp = this.d;
        if (aapp != null) {
            aann.d = aapp;
        }
        str = this.e;
        if (str != null) {
            aann.e = str;
        }
        Long l = this.f;
        if (l != null) {
            aann.f = l;
        }
        l = this.g;
        if (l != null) {
            aann.g = l;
        }
        str = this.h;
        if (str != null) {
            aann.h = str;
        }
        str = this.i;
        if (str != null) {
            aann.i = str;
        }
        Boolean bool = this.j;
        if (bool != null) {
            aann.j = bool;
        }
        str = this.k;
        if (str != null) {
            aann.k = str;
        }
        str = this.l;
        if (str != null) {
            aann.l = str;
        }
        Double d = this.m;
        if (d != null) {
            aann.m = d;
        }
        d = this.n;
        if (d != null) {
            aann.n = d;
        }
        l = this.o;
        if (l != null) {
            aann.o = l;
        }
        str = this.p;
        if (str != null) {
            aann.p = str;
        }
        return aann;
    }

    public final void E(String str) {
        this.h = str;
    }

    public final void F(String str) {
        this.i = str;
    }

    public final void G(String str) {
        this.p = str;
    }

    public final void R(Long l) {
        this.f = l;
    }

    public final void S(Long l) {
        this.g = l;
    }

    public final void a(aapp aapp) {
        this.d = aapp;
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
            hashMap.put("filter_geolens_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        aapp aapp = this.d;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.e;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put("sticker_geo_bitmoji_count", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("sticker_geo_bitmoji_from_recents_count", l);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("sticker_geo_bitmoji_list", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        Boolean bool = this.j;
        if (bool != null) {
            hashMap.put("is_geofilter_from_precache", bool);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("precache_key_list", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("precache_hash_list", str);
        }
        Double d = this.m;
        if (d != null) {
            hashMap.put("geofilter_render_time_sec", d);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("filter_venue_y_offset", d);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("venue_tap_index", l);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("filter_venue_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaim b() {
        return a();
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(Double d) {
        this.n = d;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aann) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_DIRECT_SNAP_PREVIEW";
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
        aapp aapp = this.d;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.m;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.p;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
