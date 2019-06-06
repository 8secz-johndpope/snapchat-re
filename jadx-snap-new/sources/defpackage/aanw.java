package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanw */
public class aanw extends aapq {
    private String a;
    private String b;
    private String c;
    private aapp d;
    private Long e;
    private Long f;
    private String g;
    private Long h;
    private Boolean i;
    private aasc j;
    private Double k;
    private Double l;
    private String m;
    private String n;

    /* renamed from: a */
    public aanw clone() {
        aanw aanw = (aanw) super.clone();
        String str = this.a;
        if (str != null) {
            aanw.a = str;
        }
        str = this.b;
        if (str != null) {
            aanw.b = str;
        }
        str = this.c;
        if (str != null) {
            aanw.c = str;
        }
        aapp aapp = this.d;
        if (aapp != null) {
            aanw.d = aapp;
        }
        Long l = this.e;
        if (l != null) {
            aanw.e = l;
        }
        l = this.f;
        if (l != null) {
            aanw.f = l;
        }
        str = this.g;
        if (str != null) {
            aanw.g = str;
        }
        l = this.h;
        if (l != null) {
            aanw.h = l;
        }
        Boolean bool = this.i;
        if (bool != null) {
            aanw.i = bool;
        }
        aasc aasc = this.j;
        if (aasc != null) {
            aanw.j = aasc;
        }
        Double d = this.k;
        if (d != null) {
            aanw.k = d;
        }
        d = this.l;
        if (d != null) {
            aanw.l = d;
        }
        str = this.m;
        if (str != null) {
            aanw.m = str;
        }
        str = this.n;
        if (str != null) {
            aanw.n = str;
        }
        return aanw;
    }

    public final void a(aapp aapp) {
        this.d = aapp;
    }

    public final void a(aasc aasc) {
        this.j = aasc;
    }

    public final void a(Boolean bool) {
        this.i = bool;
    }

    public final void a(Double d) {
        this.k = d;
    }

    public final void a(Long l) {
        this.e = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_geolens_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("enc_geo_data", str);
        }
        aapp aapp = this.d;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("lens_option_swipe_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("camera", l);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("ad_serve_request_id", str);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        Boolean bool = this.i;
        if (bool != null) {
            hashMap.put("with_attachment_open", bool);
        }
        aasc aasc = this.j;
        if (aasc != null) {
            hashMap.put("attachment_type", aasc.toString());
        }
        Double d = this.k;
        if (d != null) {
            hashMap.put("apply_delay_sec", d);
        }
        d = this.l;
        if (d != null) {
            hashMap.put("avg_fps", d);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("topsnap_ad_id", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("topsnap_request_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Double d) {
        this.l = d;
    }

    public final void b(Long l) {
        this.f = l;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(Long l) {
        this.h = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanw) obj).asDictionary());
    }

    public String getEventName() {
        return "GEOFILTER_GEOLENS_SWIPE";
    }

    public aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
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
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.j;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Double d = this.k;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.l;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
