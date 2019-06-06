package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfw */
public abstract class abfw extends abhw {
    private Long A;
    private String B;
    private Boolean C;
    private Long D;
    private Long E;
    private aarb F;
    private aari G;
    private Double H;
    private Double I;
    private Double J;
    private String K;
    private String L;
    private String a;
    private Double b;
    private Boolean c;
    private Long d;
    private Long e;
    private Long f;
    private abfx g;
    private String h;
    private String i;
    private aajv j;
    private aajr k;
    private Long l;
    private abbd m;
    private String n;
    private String o;
    private Long p;
    private aahb q;
    private String r;
    private Double s;
    private Long t;
    private Long u;
    private abfy v;
    private Long w;
    private Long x;
    private Long y;
    private String z;

    /* renamed from: a */
    public abfw clone() {
        abfw abfw = (abfw) super.clone();
        String str = this.a;
        if (str != null) {
            abfw.a = str;
        }
        Double d = this.b;
        if (d != null) {
            abfw.b = d;
        }
        Boolean bool = this.c;
        if (bool != null) {
            abfw.c = bool;
        }
        Long l = this.d;
        if (l != null) {
            abfw.d = l;
        }
        l = this.e;
        if (l != null) {
            abfw.e = l;
        }
        l = this.f;
        if (l != null) {
            abfw.f = l;
        }
        abfx abfx = this.g;
        if (abfx != null) {
            abfw.g = abfx;
        }
        str = this.h;
        if (str != null) {
            abfw.h = str;
        }
        str = this.i;
        if (str != null) {
            abfw.i = str;
        }
        aajv aajv = this.j;
        if (aajv != null) {
            abfw.j = aajv;
        }
        aajr aajr = this.k;
        if (aajr != null) {
            abfw.k = aajr;
        }
        l = this.l;
        if (l != null) {
            abfw.l = l;
        }
        abbd abbd = this.m;
        if (abbd != null) {
            abfw.m = abbd;
        }
        str = this.n;
        if (str != null) {
            abfw.n = str;
        }
        str = this.o;
        if (str != null) {
            abfw.o = str;
        }
        l = this.p;
        if (l != null) {
            abfw.p = l;
        }
        aahb aahb = this.q;
        if (aahb != null) {
            abfw.q = aahb;
        }
        str = this.r;
        if (str != null) {
            abfw.r = str;
        }
        d = this.s;
        if (d != null) {
            abfw.s = d;
        }
        l = this.t;
        if (l != null) {
            abfw.t = l;
        }
        l = this.u;
        if (l != null) {
            abfw.u = l;
        }
        abfy abfy = this.v;
        if (abfy != null) {
            abfw.v = abfy;
        }
        l = this.w;
        if (l != null) {
            abfw.w = l;
        }
        l = this.x;
        if (l != null) {
            abfw.x = l;
        }
        l = this.y;
        if (l != null) {
            abfw.y = l;
        }
        str = this.z;
        if (str != null) {
            abfw.z = str;
        }
        l = this.A;
        if (l != null) {
            abfw.A = l;
        }
        str = this.B;
        if (str != null) {
            abfw.B = str;
        }
        bool = this.C;
        if (bool != null) {
            abfw.C = bool;
        }
        l = this.D;
        if (l != null) {
            abfw.D = l;
        }
        l = this.E;
        if (l != null) {
            abfw.E = l;
        }
        aarb aarb = this.F;
        if (aarb != null) {
            abfw.F = aarb;
        }
        aari aari = this.G;
        if (aari != null) {
            abfw.G = aari;
        }
        d = this.H;
        if (d != null) {
            abfw.H = d;
        }
        d = this.I;
        if (d != null) {
            abfw.I = d;
        }
        d = this.J;
        if (d != null) {
            abfw.J = d;
        }
        str = this.K;
        if (str != null) {
            abfw.K = str;
        }
        str = this.L;
        if (str != null) {
            abfw.L = str;
        }
        return abfw;
    }

    public final void a(aahb aahb) {
        this.q = aahb;
    }

    public final void a(aajr aajr) {
        this.k = aajr;
    }

    public final void a(aajv aajv) {
        this.j = aajv;
    }

    public final void a(abfx abfx) {
        this.g = abfx;
    }

    public final void a(abfy abfy) {
        this.v = abfy;
    }

    public final void a(Double d) {
        this.b = d;
    }

    public final void a(Long l) {
        this.d = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("poster_id", str);
        }
        Double d = this.b;
        if (d != null) {
            hashMap.put("time_viewed", d);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("full_view", bool);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("num_snaps_viewed", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("num_snaps_unique_viewed", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("snap_index_count", l);
        }
        abfx abfx = this.g;
        if (abfx != null) {
            hashMap.put("story_type", abfx.toString());
        }
        str = this.h;
        if (str != null) {
            hashMap.put("geo_fence", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("sponsor", str);
        }
        aajv aajv = this.j;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        aajr aajr = this.k;
        if (aajr != null) {
            hashMap.put("entry_event", aajr.toString());
        }
        l = this.l;
        if (l != null) {
            hashMap.put("view_location_pos", l);
        }
        abbd abbd = this.m;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.n;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("view_location", l);
        }
        aahb aahb = this.q;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        str = this.r;
        if (str != null) {
            hashMap.put("cell_id", str);
        }
        d = this.s;
        if (d != null) {
            hashMap.put("snap_time", d);
        }
        l = this.t;
        if (l != null) {
            hashMap.put("auto_advance_index", l);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("snap_count", l);
        }
        abfy abfy = this.v;
        if (abfy != null) {
            hashMap.put("story_type_specific", abfy.toString());
        }
        l = this.w;
        if (l != null) {
            hashMap.put("story_session_id", l);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("explorer_snap_count", l);
        }
        l = this.y;
        if (l != null) {
            hashMap.put("explorer_swipe_count", l);
        }
        str = this.z;
        if (str != null) {
            hashMap.put("hydra_result_id", str);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("playlist_index", l);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("group_story_id", str);
        }
        bool = this.C;
        if (bool != null) {
            hashMap.put("is_postable", bool);
        }
        l = this.D;
        if (l != null) {
            hashMap.put("friend_link_hop", l);
        }
        l = this.E;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        aarb aarb = this.F;
        if (aarb != null) {
            hashMap.put("map_source_type", aarb.toString());
        }
        aari aari = this.G;
        if (aari != null) {
            hashMap.put("map_story_type", aari.toString());
        }
        d = this.H;
        if (d != null) {
            hashMap.put("map_zoom_level", d);
        }
        d = this.I;
        if (d != null) {
            hashMap.put("distance_from_user_meter", d);
        }
        d = this.J;
        if (d != null) {
            hashMap.put("distance_from_friend_min_meter", d);
        }
        str = this.K;
        if (str != null) {
            hashMap.put("ghost_poster_id", str);
        }
        str = this.L;
        if (str != null) {
            hashMap.put("ghost_cell_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void c(Long l) {
        this.u = l;
    }

    public final void c(String str) {
        this.a = str;
    }

    public final void d(Long l) {
        this.w = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfw) obj).asDictionary());
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
        Double d = this.b;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abfx abfx = this.g;
        hashCode = (hashCode + (abfx != null ? abfx.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aajv aajv = this.j;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        aajr aajr = this.k;
        hashCode = (hashCode + (aajr != null ? aajr.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abbd abbd = this.m;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahb aahb = this.q;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.s;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.t;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abfy abfy = this.v;
        hashCode = (hashCode + (abfy != null ? abfy.hashCode() : 0)) * 31;
        l = this.w;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.y;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.C;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.D;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.E;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aarb aarb = this.F;
        hashCode = (hashCode + (aarb != null ? aarb.hashCode() : 0)) * 31;
        aari aari = this.G;
        hashCode = (hashCode + (aari != null ? aari.hashCode() : 0)) * 31;
        d = this.H;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.I;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.J;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.K;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.L;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
