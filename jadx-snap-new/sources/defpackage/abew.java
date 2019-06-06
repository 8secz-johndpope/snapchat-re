package defpackage;

import com.brightcove.player.event.EventType;
import com.looksery.sdk.ProfilingSessionReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abew */
public final class abew extends abhw {
    private aamf A;
    private aalw B;
    private String C;
    private String D;
    private String E;
    private String F;
    private Long G;
    private Double H;
    private String I;
    private String J;
    private String K;
    private String L;
    private String M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private Long a;
    private Long b;
    private Boolean c;
    private String d;
    private aame e;
    private Boolean f;
    private abbd g;
    private Long h;
    private aahb i;
    private Double j;
    private aasc k;
    private abfx l;
    private String m;
    private String n;
    private String o;
    private Double p;
    private Boolean q;
    private String r;
    private String s;
    private String t;
    private Long u;
    private Long v;
    private Long w;
    private Long x;
    private zzc y;
    private String z;

    private abew a() {
        abew abew = (abew) super.clone();
        Long l = this.a;
        if (l != null) {
            abew.a = l;
        }
        l = this.b;
        if (l != null) {
            abew.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            abew.c = bool;
        }
        String str = this.d;
        if (str != null) {
            abew.d = str;
        }
        aame aame = this.e;
        if (aame != null) {
            abew.e = aame;
        }
        bool = this.f;
        if (bool != null) {
            abew.f = bool;
        }
        abbd abbd = this.g;
        if (abbd != null) {
            abew.g = abbd;
        }
        l = this.h;
        if (l != null) {
            abew.h = l;
        }
        aahb aahb = this.i;
        if (aahb != null) {
            abew.i = aahb;
        }
        Double d = this.j;
        if (d != null) {
            abew.j = d;
        }
        aasc aasc = this.k;
        if (aasc != null) {
            abew.k = aasc;
        }
        abfx abfx = this.l;
        if (abfx != null) {
            abew.l = abfx;
        }
        str = this.m;
        if (str != null) {
            abew.m = str;
        }
        str = this.n;
        if (str != null) {
            abew.n = str;
        }
        str = this.o;
        if (str != null) {
            abew.o = str;
        }
        d = this.p;
        if (d != null) {
            abew.p = d;
        }
        bool = this.q;
        if (bool != null) {
            abew.q = bool;
        }
        str = this.r;
        if (str != null) {
            abew.r = str;
        }
        str = this.s;
        if (str != null) {
            abew.s = str;
        }
        str = this.t;
        if (str != null) {
            abew.t = str;
        }
        l = this.u;
        if (l != null) {
            abew.u = l;
        }
        l = this.v;
        if (l != null) {
            abew.v = l;
        }
        l = this.w;
        if (l != null) {
            abew.w = l;
        }
        l = this.x;
        if (l != null) {
            abew.x = l;
        }
        zzc zzc = this.y;
        if (zzc != null) {
            abew.y = zzc;
        }
        str = this.z;
        if (str != null) {
            abew.z = str;
        }
        aamf aamf = this.A;
        if (aamf != null) {
            abew.A = aamf;
        }
        aalw aalw = this.B;
        if (aalw != null) {
            abew.B = aalw;
        }
        str = this.C;
        if (str != null) {
            abew.C = str;
        }
        str = this.D;
        if (str != null) {
            abew.D = str;
        }
        str = this.E;
        if (str != null) {
            abew.E = str;
        }
        str = this.F;
        if (str != null) {
            abew.F = str;
        }
        l = this.G;
        if (l != null) {
            abew.G = l;
        }
        d = this.H;
        if (d != null) {
            abew.H = d;
        }
        str = this.I;
        if (str != null) {
            abew.I = str;
        }
        str = this.J;
        if (str != null) {
            abew.J = str;
        }
        str = this.K;
        if (str != null) {
            abew.K = str;
        }
        str = this.L;
        if (str != null) {
            abew.L = str;
        }
        str = this.M;
        if (str != null) {
            abew.M = str;
        }
        str = this.N;
        if (str != null) {
            abew.N = str;
        }
        str = this.O;
        if (str != null) {
            abew.O = str;
        }
        str = this.P;
        if (str != null) {
            abew.P = str;
        }
        str = this.Q;
        if (str != null) {
            abew.Q = str;
        }
        return abew;
    }

    public final void a(aahb aahb) {
        this.i = aahb;
    }

    public final void a(aasc aasc) {
        this.k = aasc;
    }

    public final void a(abbd abbd) {
        this.g = abbd;
    }

    public final void a(abfx abfx) {
        this.l = abfx;
    }

    public final void a(Long l) {
        this.u = l;
    }

    public final void a(String str) {
        this.o = str;
    }

    public final void a(zzc zzc) {
        this.y = zzc;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put(EventType.CAPTION, l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("camera", l);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("drawing", bool);
        }
        String str = this.d;
        if (str != null) {
            hashMap.put(ProfilingSessionReceiver.EXTRA_STRING_FIELD_FILTER, str);
        }
        aame aame = this.e;
        if (aame != null) {
            hashMap.put("filter_type", aame.toString());
        }
        bool = this.f;
        if (bool != null) {
            hashMap.put("flash", bool);
        }
        abbd abbd = this.g;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        l = this.h;
        if (l != null) {
            hashMap.put("view_location", l);
        }
        aahb aahb = this.i;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        Double d = this.j;
        if (d != null) {
            hashMap.put("snap_time", d);
        }
        aasc aasc = this.k;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        abfx abfx = this.l;
        if (abfx != null) {
            hashMap.put("story_type", abfx.toString());
        }
        str = this.m;
        if (str != null) {
            hashMap.put("geo_fence", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("sponsor", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("poster_id", str);
        }
        d = this.p;
        if (d != null) {
            hashMap.put("time_viewed", d);
        }
        bool = this.q;
        if (bool != null) {
            hashMap.put("full_view", bool);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("story_snap_id", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("adsnap_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("ad_id", str);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("snap_index_count", l);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("snap_index_pos", l);
        }
        l = this.w;
        if (l != null) {
            hashMap.put("ad_index_count", l);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("ad_index_pos", l);
        }
        zzc zzc = this.y;
        if (zzc != null) {
            hashMap.put("additional_info", zzc.toString());
        }
        str = this.z;
        if (str != null) {
            hashMap.put("skip_info", str);
        }
        aamf aamf = this.A;
        if (aamf != null) {
            hashMap.put("filter_visual", aamf.toString());
        }
        aalw aalw = this.B;
        if (aalw != null) {
            hashMap.put("filter_info", aalw.toString());
        }
        str = this.C;
        if (str != null) {
            hashMap.put("filter_geofence", str);
        }
        str = this.D;
        if (str != null) {
            hashMap.put("filter_sponsor", str);
        }
        str = this.E;
        if (str != null) {
            hashMap.put("ad_unit_id", str);
        }
        str = this.F;
        if (str != null) {
            hashMap.put("ad_request_client_id", str);
        }
        l = this.G;
        if (l != null) {
            hashMap.put("ad_skip_count", l);
        }
        d = this.H;
        if (d != null) {
            hashMap.put("ad_resolve_time_sec", d);
        }
        str = this.I;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        str = this.J;
        if (str != null) {
            hashMap.put("adsnap_line_item_id", str);
        }
        str = this.K;
        if (str != null) {
            hashMap.put("user_ad_id", str);
        }
        str = this.L;
        if (str != null) {
            hashMap.put("hydra_result_id", str);
        }
        str = this.M;
        if (str != null) {
            hashMap.put("cognac_app_id", str);
        }
        str = this.N;
        if (str != null) {
            hashMap.put("cognac_build_id", str);
        }
        str = this.O;
        if (str != null) {
            hashMap.put("cognac_slot_id", str);
        }
        str = this.P;
        if (str != null) {
            hashMap.put("cognac_external_request_id", str);
        }
        str = this.Q;
        if (str != null) {
            hashMap.put("ghost_poster_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.v = l;
    }

    public final void b(String str) {
        this.r = str;
    }

    public final void c(Long l) {
        this.w = l;
    }

    public final void c(String str) {
        this.s = str;
    }

    public final void d(Long l) {
        this.x = l;
    }

    public final void d(String str) {
        this.t = str;
    }

    public final void e(String str) {
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abew) obj).asDictionary());
    }

    public final void f(String str) {
        this.I = str;
    }

    public final void g(String str) {
        this.J = str;
    }

    public final String getEventName() {
        return "STORY_AD_SKIP";
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

    public final void h(String str) {
        this.M = str;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aame aame = this.e;
        hashCode = (hashCode + (aame != null ? aame.hashCode() : 0)) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abbd abbd = this.g;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aahb aahb = this.i;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        Double d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aasc aasc = this.k;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        abfx abfx = this.l;
        hashCode = (hashCode + (abfx != null ? abfx.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.p;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.w;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        zzc zzc = this.y;
        hashCode = (hashCode + (zzc != null ? zzc.hashCode() : 0)) * 31;
        str = this.z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamf aamf = this.A;
        hashCode = (hashCode + (aamf != null ? aamf.hashCode() : 0)) * 31;
        aalw aalw = this.B;
        hashCode = (hashCode + (aalw != null ? aalw.hashCode() : 0)) * 31;
        str = this.C;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.D;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.E;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.G;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.H;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.I;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.J;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.K;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.L;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.M;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.N;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.O;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.P;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.Q;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final void i(String str) {
        this.N = str;
    }

    public final void j(String str) {
        this.O = str;
    }

    public final void k(String str) {
        this.P = str;
    }
}
