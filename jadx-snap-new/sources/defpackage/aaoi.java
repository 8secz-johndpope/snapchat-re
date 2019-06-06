package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaoi */
public final class aaoi extends abhw {
    private Boolean a;
    private aaoj b;
    private Double c;
    private Boolean d;
    private Long e;
    private aaom f;
    private String g;
    private String h;
    private Boolean i;
    private Long j;
    private Long k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Long q;
    private Double r;

    private aaoi j() {
        aaoi aaoi = (aaoi) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaoi.a = bool;
        }
        aaoj aaoj = this.b;
        if (aaoj != null) {
            aaoi.b = aaoj;
        }
        Double d = this.c;
        if (d != null) {
            aaoi.c = d;
        }
        bool = this.d;
        if (bool != null) {
            aaoi.d = bool;
        }
        Long l = this.e;
        if (l != null) {
            aaoi.e = l;
        }
        aaom aaom = this.f;
        if (aaom != null) {
            aaoi.f = aaom;
        }
        String str = this.g;
        if (str != null) {
            aaoi.g = str;
        }
        str = this.h;
        if (str != null) {
            aaoi.h = str;
        }
        bool = this.i;
        if (bool != null) {
            aaoi.i = bool;
        }
        l = this.j;
        if (l != null) {
            aaoi.j = l;
        }
        l = this.k;
        if (l != null) {
            aaoi.k = l;
        }
        bool = this.l;
        if (bool != null) {
            aaoi.l = bool;
        }
        bool = this.m;
        if (bool != null) {
            aaoi.m = bool;
        }
        bool = this.n;
        if (bool != null) {
            aaoi.n = bool;
        }
        bool = this.o;
        if (bool != null) {
            aaoi.o = bool;
        }
        bool = this.p;
        if (bool != null) {
            aaoi.p = bool;
        }
        l = this.q;
        if (l != null) {
            aaoi.q = l;
        }
        d = this.r;
        if (d != null) {
            aaoi.r = d;
        }
        return aaoi;
    }

    public final void a() {
        this.c = null;
    }

    public final void a(aaoj aaoj) {
        this.b = aaoj;
    }

    public final void a(aaom aaom) {
        this.f = aaom;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(Long l) {
        this.j = l;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_successful", bool);
        }
        aaoj aaoj = this.b;
        if (aaoj != null) {
            hashMap.put("source", aaoj.toString());
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        bool = this.d;
        if (bool != null) {
            hashMap.put("with_display_name", bool);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("failed_count", l);
        }
        aaom aaom = this.f;
        if (aaom != null) {
            hashMap.put("create_type", aaom.toString());
        }
        String str = this.g;
        if (str != null) {
            hashMap.put("publication_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("has_seen_select_viewers", bool);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("poster_count", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("viewer_count", l);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("with_map", bool);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("with_geocode_display", bool);
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("with_geo_privacy", bool);
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("with_autosave", bool);
        }
        bool = this.p;
        if (bool != null) {
            hashMap.put("read_geo_privacy", bool);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("geo_toggle_count", l);
        }
        d = this.r;
        if (d != null) {
            hashMap.put("reverse_geocode_ms", d);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b() {
        this.e = null;
    }

    public final void b(Boolean bool) {
        this.d = bool;
    }

    public final void b(Long l) {
        this.k = l;
    }

    public final void c() {
        this.h = null;
    }

    public final void c(Boolean bool) {
        this.o = bool;
    }

    public final void d() {
        this.i = null;
    }

    public final void e() {
        this.l = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaoi) obj).asDictionary());
    }

    public final void f() {
        this.m = null;
    }

    public final void g() {
        this.n = null;
    }

    public final String getEventName() {
        return "GROUP_STORY_CREATE";
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

    public final void h() {
        this.p = null;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aaoj aaoj = this.b;
        hashCode = (hashCode + (aaoj != null ? aaoj.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.d;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaom aaom = this.f;
        hashCode = (hashCode + (aaom != null ? aaom.hashCode() : 0)) * 31;
        String str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.r;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public final void i() {
        this.r = null;
    }
}
