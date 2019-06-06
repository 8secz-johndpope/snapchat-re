package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aajk */
public abstract class aajk extends abhw {
    private String a;
    private String b;
    private String c;
    private Long d;
    private Long e;
    private String f;
    private String g;
    private String h;
    private Double i;
    private Double j;
    private aajv k;
    private abbd l;
    private Double m;
    private aauh n;
    private Long o;
    private Long p;
    private Double q;
    private Double r;
    private String s;
    private abgl t;
    private Long u;
    private Boolean v;
    private Boolean w;

    /* renamed from: a */
    public aajk clone() {
        aajk aajk = (aajk) super.clone();
        String str = this.a;
        if (str != null) {
            aajk.a = str;
        }
        str = this.b;
        if (str != null) {
            aajk.b = str;
        }
        str = this.c;
        if (str != null) {
            aajk.c = str;
        }
        Long l = this.d;
        if (l != null) {
            aajk.d = l;
        }
        l = this.e;
        if (l != null) {
            aajk.e = l;
        }
        str = this.f;
        if (str != null) {
            aajk.f = str;
        }
        str = this.g;
        if (str != null) {
            aajk.g = str;
        }
        str = this.h;
        if (str != null) {
            aajk.h = str;
        }
        Double d = this.i;
        if (d != null) {
            aajk.i = d;
        }
        d = this.j;
        if (d != null) {
            aajk.j = d;
        }
        aajv aajv = this.k;
        if (aajv != null) {
            aajk.k = aajv;
        }
        abbd abbd = this.l;
        if (abbd != null) {
            aajk.l = abbd;
        }
        d = this.m;
        if (d != null) {
            aajk.m = d;
        }
        aauh aauh = this.n;
        if (aauh != null) {
            aajk.n = aauh;
        }
        l = this.o;
        if (l != null) {
            aajk.o = l;
        }
        l = this.p;
        if (l != null) {
            aajk.p = l;
        }
        d = this.q;
        if (d != null) {
            aajk.q = d;
        }
        d = this.r;
        if (d != null) {
            aajk.r = d;
        }
        str = this.s;
        if (str != null) {
            aajk.s = str;
        }
        abgl abgl = this.t;
        if (abgl != null) {
            aajk.t = abgl;
        }
        l = this.u;
        if (l != null) {
            aajk.u = l;
        }
        Boolean bool = this.v;
        if (bool != null) {
            aajk.v = bool;
        }
        bool = this.w;
        if (bool != null) {
            aajk.w = bool;
        }
        return aajk;
    }

    public final void a(aauh aauh) {
        this.n = aauh;
    }

    public final void a(abbd abbd) {
        this.l = abbd;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("edition_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("publisher_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("tracking_id", str);
        }
        Long l = this.d;
        if (l != null) {
            hashMap.put("snap_index_count", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("snap_index_pos", l);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("dsnap_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("scan_action_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        Double d = this.i;
        if (d != null) {
            hashMap.put("time_viewed", d);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("video_view_time_sec", d);
        }
        aajv aajv = this.k;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        abbd abbd = this.l;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        d = this.m;
        if (d != null) {
            hashMap.put("playback_volume", d);
        }
        aauh aauh = this.n;
        if (aauh != null) {
            hashMap.put("playback_audio", aauh.toString());
        }
        l = this.o;
        if (l != null) {
            hashMap.put("tap_position_x", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("tap_position_y", l);
        }
        d = this.q;
        if (d != null) {
            hashMap.put("tap_position_x_relative", d);
        }
        d = this.r;
        if (d != null) {
            hashMap.put("tap_position_y_relative", d);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("collection_id", str);
        }
        abgl abgl = this.t;
        if (abgl != null) {
            hashMap.put("collection_type", abgl.toString());
        }
        l = this.u;
        if (l != null) {
            hashMap.put("collection_pos", l);
        }
        Boolean bool = this.v;
        if (bool != null) {
            hashMap.put("is_swipeable", bool);
        }
        bool = this.w;
        if (bool != null) {
            hashMap.put("has_bottom_snap_loaded", bool);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(aajv aajv) {
        this.k = aajv;
    }

    public final void d(Double d) {
        this.i = d;
    }

    public final void e(Double d) {
        this.j = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aajk) obj).asDictionary());
    }

    public final void f(Boolean bool) {
        this.v = bool;
    }

    public final void f(Double d) {
        this.q = d;
    }

    public final void g(Boolean bool) {
        this.w = bool;
    }

    public final void g(Double d) {
        this.r = d;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final void h(String str) {
        this.a = str;
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
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aajv aajv = this.k;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        abbd abbd = this.l;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        d = this.m;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aauh aauh = this.n;
        hashCode = (hashCode + (aauh != null ? aauh.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.q;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.r;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abgl abgl = this.t;
        hashCode = (hashCode + (abgl != null ? abgl.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.v;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.w;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final void i(String str) {
        this.b = str;
    }

    public final void j(String str) {
        this.f = str;
    }

    public final void k(Long l) {
        this.d = l;
    }

    public final void l(Long l) {
        this.e = l;
    }

    public final void m(Long l) {
        this.o = l;
    }

    public final void n(Long l) {
        this.p = l;
    }
}
