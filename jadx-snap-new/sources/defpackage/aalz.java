package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalz */
public class aalz extends aapq {
    private String a;
    private aaon b;
    private Long c;
    private aapp d;
    private Long e;
    private Long f;
    private Boolean g;
    private aasc h;
    private Double i;
    private Double j;

    /* renamed from: a */
    public aalz clone() {
        aalz aalz = (aalz) super.clone();
        String str = this.a;
        if (str != null) {
            aalz.a = str;
        }
        aaon aaon = this.b;
        if (aaon != null) {
            aalz.b = aaon;
        }
        Long l = this.c;
        if (l != null) {
            aalz.c = l;
        }
        aapp aapp = this.d;
        if (aapp != null) {
            aalz.d = aapp;
        }
        l = this.e;
        if (l != null) {
            aalz.e = l;
        }
        l = this.f;
        if (l != null) {
            aalz.f = l;
        }
        Boolean bool = this.g;
        if (bool != null) {
            aalz.g = bool;
        }
        aasc aasc = this.h;
        if (aasc != null) {
            aalz.h = aasc;
        }
        Double d = this.i;
        if (d != null) {
            aalz.i = d;
        }
        d = this.j;
        if (d != null) {
            aalz.j = d;
        }
        return aalz;
    }

    public final void a(aapp aapp) {
        this.d = aapp;
    }

    public final void a(aasc aasc) {
        this.h = aasc;
    }

    public final void a(Boolean bool) {
        this.g = bool;
    }

    public final void a(Double d) {
        this.i = d;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        aaon aaon = this.b;
        if (aaon != null) {
            hashMap.put("iap_status", aaon.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("lens_option_swipe_count", l);
        }
        aapp aapp = this.d;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        l = this.e;
        if (l != null) {
            hashMap.put("camera", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        Boolean bool = this.g;
        if (bool != null) {
            hashMap.put("with_attachment_open", bool);
        }
        aasc aasc = this.h;
        if (aasc != null) {
            hashMap.put("attachment_type", aasc.toString());
        }
        Double d = this.i;
        if (d != null) {
            hashMap.put("apply_delay_sec", d);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("avg_fps", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Double d) {
        this.j = d;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void c(Long l) {
        this.f = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aalz) obj).asDictionary());
    }

    public String getEventName() {
        return "FILTER_LENS_SWIPE";
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
        aaon aaon = this.b;
        hashCode = (hashCode + (aaon != null ? aaon.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aapp aapp = this.d;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.h;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Double d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.j;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
