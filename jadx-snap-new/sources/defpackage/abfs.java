package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abfs */
public abstract class abfs extends abax {
    private Boolean A;
    private Double B;
    private abfy C;
    private Long D;
    private Long E;
    private Boolean F;
    private String G;
    private Long H;
    private Long I;
    private Double J;
    private Double K;
    private String L;
    private Boolean M;
    private Long N;
    private Long O;
    private Long P;
    private Long Q;
    private aarb R;
    private aari S;
    private Double T;
    private Double U;
    private Double V;
    private String W;
    private String X;
    private Double Y;
    private String Z;
    private Boolean a;
    private Boolean aa;
    private Long ab;
    private Long ac;
    private Long ad;
    private Boolean ae;
    private Boolean af;
    private String ag;
    private abfx b;
    private String c;
    private abbd d;
    private String e;
    private String f;
    private Long g;
    private Long h;
    private aasf i;
    private abhx j;
    private String k;
    private String l;
    private Long m;
    private Long n;
    private aajv o;
    private Boolean p;
    private String q;
    private Long r;
    private Double s;
    private Double t;
    private Double u;
    private Double v;
    private aauh w;
    private String x;
    private String y;
    private Long z;

    public final void a(aauh aauh) {
        this.w = aauh;
    }

    public final void a(abbd abbd) {
        this.d = abbd;
    }

    public final void a(abfx abfx) {
        this.b = abfx;
    }

    public final void a(abfy abfy) {
        this.C = abfy;
    }

    public final void a(Long l) {
        this.r = l;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_animated", bool);
        }
        abfx abfx = this.b;
        if (abfx != null) {
            hashMap.put("story_type", abfx.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("geo_fence", str);
        }
        abbd abbd = this.d;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.e;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("deep_link_id", str);
        }
        Long l = this.g;
        if (l != null) {
            hashMap.put("multi_snap_count", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("multi_snap_index", l);
        }
        aasf aasf = this.i;
        if (aasf != null) {
            hashMap.put("deleted_segments", aasf.toString());
        }
        abhx abhx = this.j;
        if (abhx != null) {
            hashMap.put("video_mode", abhx.toString());
        }
        str = this.k;
        if (str != null) {
            hashMap.put("poster_id", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("story_snap_id", str);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("snap_index_count", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("snap_index_pos", l);
        }
        aajv aajv = this.o;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        bool = this.p;
        if (bool != null) {
            hashMap.put("swipe_up", bool);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("submission_id", str);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("camera", l);
        }
        Double d = this.s;
        if (d != null) {
            hashMap.put("roll_max_degree", d);
        }
        d = this.t;
        if (d != null) {
            hashMap.put("roll_min_degree", d);
        }
        d = this.u;
        if (d != null) {
            hashMap.put("pinch_to_zoom", d);
        }
        d = this.v;
        if (d != null) {
            hashMap.put("playback_volume", d);
        }
        aauh aauh = this.w;
        if (aauh != null) {
            hashMap.put("playback_audio", aauh.toString());
        }
        str = this.x;
        if (str != null) {
            hashMap.put("story_parent_snap_id", str);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("story_root_snap_id", str);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("level", l);
        }
        bool = this.A;
        if (bool != null) {
            hashMap.put("is_explorable", bool);
        }
        d = this.B;
        if (d != null) {
            hashMap.put("is_explorable_ts", d);
        }
        abfy abfy = this.C;
        if (abfy != null) {
            hashMap.put("story_type_specific", abfy.toString());
        }
        l = this.D;
        if (l != null) {
            hashMap.put("auto_advance_index", l);
        }
        l = this.E;
        if (l != null) {
            hashMap.put("story_session_id", l);
        }
        bool = this.F;
        if (bool != null) {
            hashMap.put("using_playlist", bool);
        }
        str = this.G;
        if (str != null) {
            hashMap.put("hydra_result_id", str);
        }
        l = this.H;
        if (l != null) {
            hashMap.put("tap_position_x", l);
        }
        l = this.I;
        if (l != null) {
            hashMap.put("tap_position_y", l);
        }
        d = this.J;
        if (d != null) {
            hashMap.put("tap_position_x_relative", d);
        }
        d = this.K;
        if (d != null) {
            hashMap.put("tap_position_y_relative", d);
        }
        str = this.L;
        if (str != null) {
            hashMap.put("group_story_id", str);
        }
        bool = this.M;
        if (bool != null) {
            hashMap.put("is_postable", bool);
        }
        l = this.N;
        if (l != null) {
            hashMap.put("friend_link_hop", l);
        }
        l = this.O;
        if (l != null) {
            hashMap.put("group_story_poster_count", l);
        }
        l = this.P;
        if (l != null) {
            hashMap.put("group_story_viewer_count", l);
        }
        l = this.Q;
        if (l != null) {
            hashMap.put("map_session_id", l);
        }
        aarb aarb = this.R;
        if (aarb != null) {
            hashMap.put("map_source_type", aarb.toString());
        }
        aari aari = this.S;
        if (aari != null) {
            hashMap.put("map_story_type", aari.toString());
        }
        d = this.T;
        if (d != null) {
            hashMap.put("map_zoom_level", d);
        }
        d = this.U;
        if (d != null) {
            hashMap.put("distance_from_user_meter", d);
        }
        d = this.V;
        if (d != null) {
            hashMap.put("distance_from_friend_min_meter", d);
        }
        str = this.W;
        if (str != null) {
            hashMap.put("available_context_types", str);
        }
        str = this.X;
        if (str != null) {
            hashMap.put("context_session_id", str);
        }
        d = this.Y;
        if (d != null) {
            hashMap.put("context_c_t_a_visible_latency", d);
        }
        str = this.Z;
        if (str != null) {
            hashMap.put("context_actions", str);
        }
        bool = this.aa;
        if (bool != null) {
            hashMap.put("viewer_was_mentioned", bool);
        }
        l = this.ab;
        if (l != null) {
            hashMap.put("bidirectional_friend_mention_count", l);
        }
        l = this.ac;
        if (l != null) {
            hashMap.put("unidirectional_friend_mention_count", l);
        }
        l = this.ad;
        if (l != null) {
            hashMap.put("non_friend_mention_count", l);
        }
        bool = this.ae;
        if (bool != null) {
            hashMap.put("is_swipeable", bool);
        }
        bool = this.af;
        if (bool != null) {
            hashMap.put("has_bottom_snap_loaded", bool);
        }
        str = this.ag;
        if (str != null) {
            hashMap.put("ghost_poster_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(aajv aajv) {
        this.o = aajv;
    }

    /* renamed from: c */
    public abfs clone() {
        abfs abfs = (abfs) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abfs.a = bool;
        }
        abfx abfx = this.b;
        if (abfx != null) {
            abfs.b = abfx;
        }
        String str = this.c;
        if (str != null) {
            abfs.c = str;
        }
        abbd abbd = this.d;
        if (abbd != null) {
            abfs.d = abbd;
        }
        str = this.e;
        if (str != null) {
            abfs.e = str;
        }
        str = this.f;
        if (str != null) {
            abfs.f = str;
        }
        Long l = this.g;
        if (l != null) {
            abfs.g = l;
        }
        l = this.h;
        if (l != null) {
            abfs.h = l;
        }
        aasf aasf = this.i;
        if (aasf != null) {
            abfs.i = aasf;
        }
        abhx abhx = this.j;
        if (abhx != null) {
            abfs.j = abhx;
        }
        str = this.k;
        if (str != null) {
            abfs.k = str;
        }
        str = this.l;
        if (str != null) {
            abfs.l = str;
        }
        l = this.m;
        if (l != null) {
            abfs.m = l;
        }
        l = this.n;
        if (l != null) {
            abfs.n = l;
        }
        aajv aajv = this.o;
        if (aajv != null) {
            abfs.o = aajv;
        }
        bool = this.p;
        if (bool != null) {
            abfs.p = bool;
        }
        str = this.q;
        if (str != null) {
            abfs.q = str;
        }
        l = this.r;
        if (l != null) {
            abfs.r = l;
        }
        Double d = this.s;
        if (d != null) {
            abfs.s = d;
        }
        d = this.t;
        if (d != null) {
            abfs.t = d;
        }
        d = this.u;
        if (d != null) {
            abfs.u = d;
        }
        d = this.v;
        if (d != null) {
            abfs.v = d;
        }
        aauh aauh = this.w;
        if (aauh != null) {
            abfs.w = aauh;
        }
        str = this.x;
        if (str != null) {
            abfs.x = str;
        }
        str = this.y;
        if (str != null) {
            abfs.y = str;
        }
        l = this.z;
        if (l != null) {
            abfs.z = l;
        }
        bool = this.A;
        if (bool != null) {
            abfs.A = bool;
        }
        d = this.B;
        if (d != null) {
            abfs.B = d;
        }
        abfy abfy = this.C;
        if (abfy != null) {
            abfs.C = abfy;
        }
        l = this.D;
        if (l != null) {
            abfs.D = l;
        }
        l = this.E;
        if (l != null) {
            abfs.E = l;
        }
        bool = this.F;
        if (bool != null) {
            abfs.F = bool;
        }
        str = this.G;
        if (str != null) {
            abfs.i(str);
        }
        l = this.H;
        if (l != null) {
            abfs.H = l;
        }
        l = this.I;
        if (l != null) {
            abfs.I = l;
        }
        d = this.J;
        if (d != null) {
            abfs.J = d;
        }
        d = this.K;
        if (d != null) {
            abfs.K = d;
        }
        str = this.L;
        if (str != null) {
            abfs.L = str;
        }
        bool = this.M;
        if (bool != null) {
            abfs.M = bool;
        }
        l = this.N;
        if (l != null) {
            abfs.N = l;
        }
        l = this.O;
        if (l != null) {
            abfs.O = l;
        }
        l = this.P;
        if (l != null) {
            abfs.P = l;
        }
        l = this.Q;
        if (l != null) {
            abfs.Q = l;
        }
        aarb aarb = this.R;
        if (aarb != null) {
            abfs.R = aarb;
        }
        aari aari = this.S;
        if (aari != null) {
            abfs.S = aari;
        }
        d = this.T;
        if (d != null) {
            abfs.T = d;
        }
        d = this.U;
        if (d != null) {
            abfs.U = d;
        }
        d = this.V;
        if (d != null) {
            abfs.V = d;
        }
        str = this.W;
        if (str != null) {
            abfs.W = str;
        }
        str = this.X;
        if (str != null) {
            abfs.X = str;
        }
        d = this.Y;
        if (d != null) {
            abfs.Y = d;
        }
        str = this.Z;
        if (str != null) {
            abfs.Z = str;
        }
        bool = this.aa;
        if (bool != null) {
            abfs.aa = bool;
        }
        l = this.ab;
        if (l != null) {
            abfs.ab = l;
        }
        l = this.ac;
        if (l != null) {
            abfs.ac = l;
        }
        l = this.ad;
        if (l != null) {
            abfs.ad = l;
        }
        bool = this.ae;
        if (bool != null) {
            abfs.ae = bool;
        }
        bool = this.af;
        if (bool != null) {
            abfs.af = bool;
        }
        str = this.ag;
        if (str != null) {
            abfs.ag = str;
        }
        return abfs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfs) obj).asDictionary());
    }

    public final void f(Double d) {
        this.J = d;
    }

    public final void g(Boolean bool) {
        this.ae = bool;
    }

    public final void g(Double d) {
        this.K = d;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final void h(Boolean bool) {
        this.af = bool;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abfx abfx = this.b;
        hashCode = (hashCode + (abfx != null ? abfx.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.d;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aasf aasf = this.i;
        hashCode = (hashCode + (aasf != null ? aasf.hashCode() : 0)) * 31;
        abhx abhx = this.j;
        hashCode = (hashCode + (abhx != null ? abhx.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aajv aajv = this.o;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.s;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.t;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.u;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.v;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aauh aauh = this.w;
        hashCode = (hashCode + (aauh != null ? aauh.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.A;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.B;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        abfy abfy = this.C;
        hashCode = (hashCode + (abfy != null ? abfy.hashCode() : 0)) * 31;
        l = this.D;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.E;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.F;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.G;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.H;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.I;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.J;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.K;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.L;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.M;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.N;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.O;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.P;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.Q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aarb aarb = this.R;
        hashCode = (hashCode + (aarb != null ? aarb.hashCode() : 0)) * 31;
        aari aari = this.S;
        hashCode = (hashCode + (aari != null ? aari.hashCode() : 0)) * 31;
        d = this.T;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.U;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.V;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.W;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.X;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.Y;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.Z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.aa;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.ab;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.ac;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.ad;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        bool = this.ae;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.af;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.ag;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public void i(String str) {
        this.G = str;
    }

    public final void m(Long l) {
        this.m = l;
    }

    public final void n(Long l) {
        this.n = l;
    }

    public final void n(String str) {
        this.k = str;
    }

    public final void o(Long l) {
        this.E = l;
    }

    public final void o(String str) {
        this.l = str;
    }

    public final void p(Long l) {
        this.H = l;
    }

    public final void p(String str) {
        this.W = str;
    }

    public final void q(Long l) {
        this.I = l;
    }
}
