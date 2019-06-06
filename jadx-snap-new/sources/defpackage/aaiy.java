package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaiy */
public final class aaiy extends abhw {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Boolean f;
    private aavf g;
    private abgm h;
    private String i;
    private abgl j;
    private Long k;
    private Long l;
    private aahb m;
    private Boolean n;
    private Double o;
    private Long p;
    private Long q;
    private aajv r;
    private Long s;
    private abbd t;
    private Long u;
    private abhz v;
    private String w;
    private Long x;
    private String y;

    private aaiy a() {
        aaiy aaiy = (aaiy) super.clone();
        String str = this.a;
        if (str != null) {
            aaiy.a = str;
        }
        str = this.b;
        if (str != null) {
            aaiy.b = str;
        }
        str = this.c;
        if (str != null) {
            aaiy.c = str;
        }
        str = this.d;
        if (str != null) {
            aaiy.d = str;
        }
        str = this.e;
        if (str != null) {
            aaiy.e = str;
        }
        Boolean bool = this.f;
        if (bool != null) {
            aaiy.f = bool;
        }
        aavf aavf = this.g;
        if (aavf != null) {
            aaiy.g = aavf;
        }
        abgm abgm = this.h;
        if (abgm != null) {
            aaiy.h = abgm;
        }
        str = this.i;
        if (str != null) {
            aaiy.i = str;
        }
        abgl abgl = this.j;
        if (abgl != null) {
            aaiy.j = abgl;
        }
        Long l = this.k;
        if (l != null) {
            aaiy.k = l;
        }
        l = this.l;
        if (l != null) {
            aaiy.l = l;
        }
        aahb aahb = this.m;
        if (aahb != null) {
            aaiy.m = aahb;
        }
        bool = this.n;
        if (bool != null) {
            aaiy.n = bool;
        }
        Double d = this.o;
        if (d != null) {
            aaiy.o = d;
        }
        l = this.p;
        if (l != null) {
            aaiy.p = l;
        }
        l = this.q;
        if (l != null) {
            aaiy.q = l;
        }
        aajv aajv = this.r;
        if (aajv != null) {
            aaiy.r = aajv;
        }
        l = this.s;
        if (l != null) {
            aaiy.s = l;
        }
        abbd abbd = this.t;
        if (abbd != null) {
            aaiy.t = abbd;
        }
        l = this.u;
        if (l != null) {
            aaiy.u = l;
        }
        abhz abhz = this.v;
        if (abhz != null) {
            aaiy.v = abhz;
        }
        str = this.w;
        if (str != null) {
            aaiy.w = str;
        }
        l = this.x;
        if (l != null) {
            aaiy.x = l;
        }
        str = this.y;
        if (str != null) {
            aaiy.y = str;
        }
        return aaiy;
    }

    public final void a(aahb aahb) {
        this.m = aahb;
    }

    public final void a(aajv aajv) {
        this.r = aajv;
    }

    public final void a(Double d) {
        this.o = d;
    }

    public final void a(Long l) {
        this.p = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("edition_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("edition_version", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("publisher_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("scan_action_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        Boolean bool = this.f;
        if (bool != null) {
            hashMap.put("with_subscription", bool);
        }
        aavf aavf = this.g;
        if (aavf != null) {
            hashMap.put("read_state", aavf.toString());
        }
        abgm abgm = this.h;
        if (abgm != null) {
            hashMap.put("tile_size", abgm.toString());
        }
        str = this.i;
        if (str != null) {
            hashMap.put("collection_id", str);
        }
        abgl abgl = this.j;
        if (abgl != null) {
            hashMap.put("collection_type", abgl.toString());
        }
        Long l = this.k;
        if (l != null) {
            hashMap.put("collection_pos", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("view_location", l);
        }
        aahb aahb = this.m;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("full_view", bool);
        }
        Double d = this.o;
        if (d != null) {
            hashMap.put("time_viewed", d);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("num_snaps_viewed", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("num_longform_viewed", l);
        }
        aajv aajv = this.r;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        l = this.s;
        if (l != null) {
            hashMap.put("snap_index_count", l);
        }
        abbd abbd = this.t;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        l = this.u;
        if (l != null) {
            hashMap.put("view_location_pos", l);
        }
        abhz abhz = this.v;
        if (abhz != null) {
            hashMap.put("view_location_sorting", abhz.toString());
        }
        str = this.w;
        if (str != null) {
            hashMap.put("sort_order_id", str);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("auto_advance_index", l);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("tracking_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.s = l;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaiy) obj).asDictionary());
    }

    public final String getEventName() {
        return "DISCOVER_EDITION_VIEW";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS_CRITICAL;
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
        Boolean bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aavf aavf = this.g;
        hashCode = (hashCode + (aavf != null ? aavf.hashCode() : 0)) * 31;
        abgm abgm = this.h;
        hashCode = (hashCode + (abgm != null ? abgm.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgl abgl = this.j;
        hashCode = (hashCode + (abgl != null ? abgl.hashCode() : 0)) * 31;
        Long l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahb aahb = this.m;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.o;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aajv aajv = this.r;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abbd abbd = this.t;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abhz abhz = this.v;
        hashCode = (hashCode + (abhz != null ? abhz.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.y;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
