package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aalx */
public final class aalx extends abhw {
    private String a;
    private Boolean b;
    private Double c;
    private Long d;
    private Long e;
    private Long f;
    private aapp g;
    private aagx h;
    private Double i;
    private Double j;
    private Long k;
    private Long l;

    private aalx a() {
        aalx aalx = (aalx) super.clone();
        String str = this.a;
        if (str != null) {
            aalx.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aalx.b = bool;
        }
        Double d = this.c;
        if (d != null) {
            aalx.c = d;
        }
        Long l = this.d;
        if (l != null) {
            aalx.d = l;
        }
        l = this.e;
        if (l != null) {
            aalx.e = l;
        }
        l = this.f;
        if (l != null) {
            aalx.f = l;
        }
        aapp aapp = this.g;
        if (aapp != null) {
            aalx.g = aapp;
        }
        aagx aagx = this.h;
        if (aagx != null) {
            aalx.h = aagx;
        }
        d = this.i;
        if (d != null) {
            aalx.i = d;
        }
        d = this.j;
        if (d != null) {
            aalx.j = d;
        }
        l = this.k;
        if (l != null) {
            aalx.k = l;
        }
        l = this.l;
        if (l != null) {
            aalx.l = l;
        }
        return aalx;
    }

    public final void a(Double d) {
        this.c = d;
    }

    public final void a(Long l) {
        this.f = l;
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
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("automatic_download", bool);
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("download_time_sec", d);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("download_index_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("download_index_pos", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("size_byte", l);
        }
        aapp aapp = this.g;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        aagx aagx = this.h;
        if (aagx != null) {
            hashMap.put("connection_class", aagx.toString());
        }
        d = this.i;
        if (d != null) {
            hashMap.put("bandwidth_mean", d);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("bandwidth_median", d);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("bandwidth_sample_size", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.l = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aalx) obj).asDictionary());
    }

    public final String getEventName() {
        return "FILTER_LENS_DOWNLOAD";
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
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aapp aapp = this.g;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        aagx aagx = this.h;
        hashCode = (hashCode + (aagx != null ? aagx.hashCode() : 0)) * 31;
        d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
