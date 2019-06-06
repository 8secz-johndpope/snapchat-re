package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanr */
public final class aanr extends aait {
    private String a;
    private String b;
    private String c;
    private String d;
    private aapp e;
    private String f;
    private Long g;
    private Long h;
    private String i;
    private Long j;
    private Long k;
    private String l;
    private Double m;
    private Double n;
    private Boolean o;
    private aauo p;
    private String q;
    private aarr r;
    private aamy s;

    private aanr d() {
        aanr aanr = (aanr) super.clone();
        String str = this.a;
        if (str != null) {
            aanr.a = str;
        }
        str = this.b;
        if (str != null) {
            aanr.b = str;
        }
        str = this.c;
        if (str != null) {
            aanr.c = str;
        }
        str = this.d;
        if (str != null) {
            aanr.d = str;
        }
        aapp aapp = this.e;
        if (aapp != null) {
            aanr.e = aapp;
        }
        str = this.f;
        if (str != null) {
            aanr.f = str;
        }
        Long l = this.g;
        if (l != null) {
            aanr.g = l;
        }
        l = this.h;
        if (l != null) {
            aanr.h = l;
        }
        str = this.i;
        if (str != null) {
            aanr.i = str;
        }
        l = this.j;
        if (l != null) {
            aanr.j = l;
        }
        l = this.k;
        if (l != null) {
            aanr.k = l;
        }
        str = this.l;
        if (str != null) {
            aanr.l = str;
        }
        Double d = this.m;
        if (d != null) {
            aanr.m = d;
        }
        d = this.n;
        if (d != null) {
            aanr.n = d;
        }
        Boolean bool = this.o;
        if (bool != null) {
            aanr.o = bool;
        }
        aauo aauo = this.p;
        if (aauo != null) {
            aanr.p = aauo;
        }
        str = this.q;
        if (str != null) {
            aanr.q = str;
        }
        aarr aarr = this.r;
        if (aarr != null) {
            aanr.r = aarr;
        }
        aamy aamy = this.s;
        if (aamy != null) {
            aanr.s = aamy;
        }
        return aanr;
    }

    public final void Q(Long l) {
        this.j = l;
    }

    public final void R(Long l) {
        this.k = l;
    }

    public final /* synthetic */ aait a() {
        return d();
    }

    public final void a(aapp aapp) {
        this.e = aapp;
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
            hashMap.put("filter_geolens_id", str);
        }
        aapp aapp = this.e;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.f;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("filter_index_pos", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("filter_index_count", l);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("sticker_geo_bitmoji_count", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("sticker_geo_bitmoji_from_recents_count", l);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("sticker_geo_bitmoji_list", str);
        }
        Double d = this.m;
        if (d != null) {
            hashMap.put("cached_time_sec", d);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("cached_date", d);
        }
        Boolean bool = this.o;
        if (bool != null) {
            hashMap.put("is_cached", bool);
        }
        aauo aauo = this.p;
        if (aauo != null) {
            hashMap.put("player_version", aauo.toString());
        }
        str = this.q;
        if (str != null) {
            hashMap.put("specs_content_id", str);
        }
        aarr aarr = this.r;
        if (aarr != null) {
            hashMap.put("media_format", aarr.toString());
        }
        aamy aamy = this.s;
        if (aamy != null) {
            hashMap.put("gallery_media_type", aamy.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(String str) {
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanr) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_GALLERY_SNAP_SEND";
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
        aapp aapp = this.e;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.m;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aauo aauo = this.p;
        hashCode = (hashCode + (aauo != null ? aauo.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aarr aarr = this.r;
        hashCode = (hashCode + (aarr != null ? aarr.hashCode() : 0)) * 31;
        aamy aamy = this.s;
        if (aamy != null) {
            i = aamy.hashCode();
        }
        return hashCode + i;
    }

    public final void o(String str) {
        this.q = str;
    }
}
