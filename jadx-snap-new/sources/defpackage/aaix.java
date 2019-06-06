package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaix */
public final class aaix extends aajk {
    private Boolean A;
    private Long B;
    private Long C;
    private Long D;
    private Long E;
    private Long F;
    private aaow G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private Double K;
    private Long L;
    private aahb a;
    private Boolean b;
    private String c;
    private String d;
    private Long e;
    private Long f;
    private aasc g;
    private Double h;
    private Double i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private Double o;
    private Double p;
    private Double q;
    private Boolean r;
    private aajv s;
    private Boolean t;
    private Boolean u;
    private Boolean v;
    private Boolean w;
    private Boolean x;
    private Double y;
    private Boolean z;

    private aaix b() {
        aaix aaix = (aaix) super.clone();
        aahb aahb = this.a;
        if (aahb != null) {
            aaix.a = aahb;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aaix.b = bool;
        }
        String str = this.c;
        if (str != null) {
            aaix.c = str;
        }
        str = this.d;
        if (str != null) {
            aaix.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aaix.e = l;
        }
        l = this.f;
        if (l != null) {
            aaix.f = l;
        }
        aasc aasc = this.g;
        if (aasc != null) {
            aaix.g = aasc;
        }
        Double d = this.h;
        if (d != null) {
            aaix.h = d;
        }
        d = this.i;
        if (d != null) {
            aaix.i = d;
        }
        str = this.j;
        if (str != null) {
            aaix.j = str;
        }
        str = this.k;
        if (str != null) {
            aaix.k = str;
        }
        str = this.l;
        if (str != null) {
            aaix.l = str;
        }
        str = this.m;
        if (str != null) {
            aaix.m = str;
        }
        str = this.n;
        if (str != null) {
            aaix.n = str;
        }
        d = this.o;
        if (d != null) {
            aaix.o = d;
        }
        d = this.p;
        if (d != null) {
            aaix.p = d;
        }
        d = this.q;
        if (d != null) {
            aaix.q = d;
        }
        bool = this.r;
        if (bool != null) {
            aaix.r = bool;
        }
        aajv aajv = this.s;
        if (aajv != null) {
            aaix.s = aajv;
        }
        bool = this.t;
        if (bool != null) {
            aaix.t = bool;
        }
        bool = this.u;
        if (bool != null) {
            aaix.u = bool;
        }
        bool = this.v;
        if (bool != null) {
            aaix.v = bool;
        }
        bool = this.w;
        if (bool != null) {
            aaix.w = bool;
        }
        bool = this.x;
        if (bool != null) {
            aaix.x = bool;
        }
        d = this.y;
        if (d != null) {
            aaix.y = d;
        }
        bool = this.z;
        if (bool != null) {
            aaix.z = bool;
        }
        bool = this.A;
        if (bool != null) {
            aaix.A = bool;
        }
        l = this.B;
        if (l != null) {
            aaix.B = l;
        }
        l = this.C;
        if (l != null) {
            aaix.C = l;
        }
        l = this.D;
        if (l != null) {
            aaix.D = l;
        }
        l = this.E;
        if (l != null) {
            aaix.E = l;
        }
        l = this.F;
        if (l != null) {
            aaix.F = l;
        }
        aaow aaow = this.G;
        if (aaow != null) {
            aaix.G = aaow;
        }
        bool = this.H;
        if (bool != null) {
            aaix.H = bool;
        }
        bool = this.I;
        if (bool != null) {
            aaix.I = bool;
        }
        bool = this.J;
        if (bool != null) {
            aaix.J = bool;
        }
        d = this.K;
        if (d != null) {
            aaix.K = d;
        }
        l = this.L;
        if (l != null) {
            aaix.L = l;
        }
        return aaix;
    }

    public final /* synthetic */ aajk a() {
        return b();
    }

    public final void a(aahb aahb) {
        this.a = aahb;
    }

    public final void a(aajv aajv) {
        this.s = aajv;
    }

    public final void a(aasc aasc) {
        this.g = aasc;
    }

    public final void a(Boolean bool) {
        this.v = bool;
    }

    public final void a(Double d) {
        this.h = d;
    }

    public final void a(Long l) {
        this.e = l;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aahb aahb = this.a;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("full_view", bool);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("adsnap_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("ad_id", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("ad_index_count", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("ad_index_pos", l);
        }
        aasc aasc = this.g;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        Double d = this.h;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        d = this.i;
        if (d != null) {
            hashMap.put("media_display_time_sec", d);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("ad_unit_id", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("ad_request_client_id", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("adsnap_line_item_id", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("user_ad_id", str);
        }
        d = this.o;
        if (d != null) {
            hashMap.put("roll_max_degree", d);
        }
        d = this.p;
        if (d != null) {
            hashMap.put("roll_min_degree", d);
        }
        d = this.q;
        if (d != null) {
            hashMap.put("pinch_to_zoom", d);
        }
        bool = this.r;
        if (bool != null) {
            hashMap.put("is_archived", bool);
        }
        aajv aajv = this.s;
        if (aajv != null) {
            hashMap.put("card_exit_event", aajv.toString());
        }
        bool = this.t;
        if (bool != null) {
            hashMap.put("webview_loaded_on_entry", bool);
        }
        bool = this.u;
        if (bool != null) {
            hashMap.put("webview_loaded_on_exit", bool);
        }
        bool = this.v;
        if (bool != null) {
            hashMap.put("deep_link_from_card", bool);
        }
        bool = this.w;
        if (bool != null) {
            hashMap.put("deep_link_fallback_to_app_store", bool);
        }
        bool = this.x;
        if (bool != null) {
            hashMap.put("deep_link_fallback_to_webview", bool);
        }
        d = this.y;
        if (d != null) {
            hashMap.put("card_visible_time", d);
        }
        bool = this.z;
        if (bool != null) {
            hashMap.put("card_app_installed", bool);
        }
        bool = this.A;
        if (bool != null) {
            hashMap.put("is_camera_ad", bool);
        }
        l = this.B;
        if (l != null) {
            hashMap.put("interaction_index_pos", l);
        }
        l = this.C;
        if (l != null) {
            hashMap.put("interaction_index_count", l);
        }
        l = this.D;
        if (l != null) {
            hashMap.put("interaction_view_count", l);
        }
        l = this.E;
        if (l != null) {
            hashMap.put("interaction_distinct_view_count", l);
        }
        l = this.F;
        if (l != null) {
            hashMap.put("interaction_max_view_pos", l);
        }
        aaow aaow = this.G;
        if (aaow != null) {
            hashMap.put("interaction_type", aaow.toString());
        }
        bool = this.H;
        if (bool != null) {
            hashMap.put("is_full_view_ad", bool);
        }
        bool = this.I;
        if (bool != null) {
            hashMap.put("media_loaded_on_entry", bool);
        }
        bool = this.J;
        if (bool != null) {
            hashMap.put("media_loaded_on_exit", bool);
        }
        d = this.K;
        if (d != null) {
            hashMap.put("loading_screen_time_sec", d);
        }
        l = this.L;
        if (l != null) {
            hashMap.put("edition_entry_snap_index", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.w = bool;
    }

    public final void b(Double d) {
        this.y = d;
    }

    public final void b(Long l) {
        this.f = l;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(Boolean bool) {
        this.x = bool;
    }

    public final void c(Double d) {
        this.K = d;
    }

    public final void c(Long l) {
        this.B = l;
    }

    public final void c(String str) {
        this.k = str;
    }

    public final void d(Boolean bool) {
        this.I = bool;
    }

    public final void d(Long l) {
        this.C = l;
    }

    public final void d(String str) {
        this.l = str;
    }

    public final void e(Boolean bool) {
        this.J = bool;
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
        return asDictionary().equals(((aaix) obj).asDictionary());
    }

    public final String getEventName() {
        return "DISCOVER_AD_VIEW";
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
        aahb aahb = this.a;
        int i = 0;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aasc aasc = this.g;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.o;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.p;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.q;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aajv aajv = this.s;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        bool = this.t;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.v;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.w;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.x;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.y;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.z;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.A;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.B;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.C;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.D;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.E;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.F;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaow aaow = this.G;
        hashCode = (hashCode + (aaow != null ? aaow.hashCode() : 0)) * 31;
        bool = this.H;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.I;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.J;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.K;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.L;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
