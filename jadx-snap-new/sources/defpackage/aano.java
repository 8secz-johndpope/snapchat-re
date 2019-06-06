package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aano */
public final class aano extends aaiq {
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
    private Long m;
    private aamb n;

    private aano F() {
        aano aano = (aano) super.clone();
        String str = this.a;
        if (str != null) {
            aano.a = str;
        }
        str = this.b;
        if (str != null) {
            aano.b = str;
        }
        str = this.c;
        if (str != null) {
            aano.c = str;
        }
        str = this.d;
        if (str != null) {
            aano.d = str;
        }
        aapp aapp = this.e;
        if (aapp != null) {
            aano.e = aapp;
        }
        str = this.f;
        if (str != null) {
            aano.f = str;
        }
        Long l = this.g;
        if (l != null) {
            aano.g = l;
        }
        l = this.h;
        if (l != null) {
            aano.h = l;
        }
        str = this.i;
        if (str != null) {
            aano.i = str;
        }
        l = this.j;
        if (l != null) {
            aano.j = l;
        }
        l = this.k;
        if (l != null) {
            aano.k = l;
        }
        str = this.l;
        if (str != null) {
            aano.l = str;
        }
        l = this.m;
        if (l != null) {
            aano.m = l;
        }
        aamb aamb = this.n;
        if (aamb != null) {
            aano.n = aamb;
        }
        return aano;
    }

    public final void A(Long l) {
        this.k = l;
    }

    public final String E() {
        return this.c;
    }

    public final /* synthetic */ aaiq a() {
        return F();
    }

    public final void a(aapp aapp) {
        this.e = aapp;
    }

    public final void a(String str) {
        this.c = str;
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
        l = this.m;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        aamb aamb = this.n;
        if (aamb != null) {
            hashMap.put("filter_source", aamb.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final void d(String str) {
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aano) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_DIRECT_SNAP_SAVE";
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
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aamb aamb = this.n;
        if (aamb != null) {
            i = aamb.hashCode();
        }
        return hashCode + i;
    }

    public final void z(Long l) {
        this.j = l;
    }
}
