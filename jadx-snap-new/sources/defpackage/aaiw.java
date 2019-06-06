package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaiw */
public final class aaiw extends abhw {
    private String a;
    private String b;
    private Long c;
    private Long d;
    private String e;
    private String f;
    private Long g;
    private Long h;
    private zzc i;
    private String j;
    private abbd k;
    private String l;
    private String m;
    private Long n;
    private Double o;
    private String p;
    private String q;
    private String r;
    private String s;

    private aaiw a() {
        aaiw aaiw = (aaiw) super.clone();
        String str = this.a;
        if (str != null) {
            aaiw.a = str;
        }
        str = this.b;
        if (str != null) {
            aaiw.b = str;
        }
        Long l = this.c;
        if (l != null) {
            aaiw.c = l;
        }
        l = this.d;
        if (l != null) {
            aaiw.d = l;
        }
        str = this.e;
        if (str != null) {
            aaiw.e = str;
        }
        str = this.f;
        if (str != null) {
            aaiw.f = str;
        }
        l = this.g;
        if (l != null) {
            aaiw.g = l;
        }
        l = this.h;
        if (l != null) {
            aaiw.h = l;
        }
        zzc zzc = this.i;
        if (zzc != null) {
            aaiw.i = zzc;
        }
        str = this.j;
        if (str != null) {
            aaiw.j = str;
        }
        abbd abbd = this.k;
        if (abbd != null) {
            aaiw.k = abbd;
        }
        str = this.l;
        if (str != null) {
            aaiw.l = str;
        }
        str = this.m;
        if (str != null) {
            aaiw.m = str;
        }
        l = this.n;
        if (l != null) {
            aaiw.n = l;
        }
        Double d = this.o;
        if (d != null) {
            aaiw.o = d;
        }
        str = this.p;
        if (str != null) {
            aaiw.p = str;
        }
        str = this.q;
        if (str != null) {
            aaiw.q = str;
        }
        str = this.r;
        if (str != null) {
            aaiw.r = str;
        }
        str = this.s;
        if (str != null) {
            aaiw.s = str;
        }
        return aaiw;
    }

    public final void a(abbd abbd) {
        this.k = abbd;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void a(zzc zzc) {
        this.i = zzc;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("edition_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("publisher_id", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("snap_index_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("snap_index_pos", l);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("adsnap_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("ad_id", str);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("ad_index_count", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("ad_index_pos", l);
        }
        zzc zzc = this.i;
        if (zzc != null) {
            hashMap.put("additional_info", zzc.toString());
        }
        str = this.j;
        if (str != null) {
            hashMap.put("error_info", str);
        }
        abbd abbd = this.k;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.l;
        if (str != null) {
            hashMap.put("ad_unit_id", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("ad_request_client_id", str);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("ad_skip_count", l);
        }
        Double d = this.o;
        if (d != null) {
            hashMap.put("ad_resolve_time_sec", d);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("adsnap_line_item_id", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("scan_action_id", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.d = l;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(Long l) {
        this.g = l;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(Long l) {
        this.h = l;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(String str) {
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaiw) obj).asDictionary());
    }

    public final void f(String str) {
        this.p = str;
    }

    public final void g(String str) {
        this.q = str;
    }

    public final String getEventName() {
        return "DISCOVER_AD_SKIP";
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
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        zzc zzc = this.i;
        hashCode = (hashCode + (zzc != null ? zzc.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.k;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.o;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
