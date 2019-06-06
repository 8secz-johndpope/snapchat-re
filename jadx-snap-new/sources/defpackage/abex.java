package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abex */
public class abex extends abfs {
    private Long A;
    private Long B;
    private aaow C;
    private Boolean D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String a;
    private String b;
    private Long c;
    private Long d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private abfn k;
    private zyv l;
    private aajv m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Double s;
    private Boolean t;
    private Boolean u;
    private zyy v;
    private String w;
    private Long x;
    private Long y;
    private Long z;

    public final void a(aajv aajv) {
        this.m = aajv;
    }

    public void a(zyy zyy) {
        this.v = zyy;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("adsnap_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("ad_id", str);
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("ad_index_count", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("ad_index_pos", l);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("ad_unit_id", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("ad_request_client_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("adsnap_placement_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("adsnap_line_item_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("user_ad_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("hydra_result_id", str);
        }
        abfn abfn = this.k;
        if (abfn != null) {
            hashMap.put("ad_play_mode", abfn.toString());
        }
        zyv zyv = this.l;
        if (zyv != null) {
            hashMap.put("ad_high_engagement_trigger", zyv.toString());
        }
        aajv aajv = this.m;
        if (aajv != null) {
            hashMap.put("card_exit_event", aajv.toString());
        }
        Boolean bool = this.n;
        if (bool != null) {
            hashMap.put("webview_loaded_on_entry", bool);
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("webview_loaded_on_exit", bool);
        }
        bool = this.p;
        if (bool != null) {
            hashMap.put("deep_link_from_card", bool);
        }
        bool = this.q;
        if (bool != null) {
            hashMap.put("deep_link_fallback_to_app_store", bool);
        }
        bool = this.r;
        if (bool != null) {
            hashMap.put("deep_link_fallback_to_webview", bool);
        }
        Double d = this.s;
        if (d != null) {
            hashMap.put("card_visible_time", d);
        }
        bool = this.t;
        if (bool != null) {
            hashMap.put("card_app_installed", bool);
        }
        bool = this.u;
        if (bool != null) {
            hashMap.put("is_camera_ad", bool);
        }
        zyy zyy = this.v;
        if (zyy != null) {
            hashMap.put("ad_product_source_type", zyy.toString());
        }
        str = this.w;
        if (str != null) {
            hashMap.put("tab_type", str);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("interaction_index_pos", l);
        }
        l = this.y;
        if (l != null) {
            hashMap.put("interaction_index_count", l);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("interaction_view_count", l);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("interaction_distinct_view_count", l);
        }
        l = this.B;
        if (l != null) {
            hashMap.put("interaction_max_view_pos", l);
        }
        aaow aaow = this.C;
        if (aaow != null) {
            hashMap.put("interaction_type", aaow.toString());
        }
        bool = this.D;
        if (bool != null) {
            hashMap.put("is_full_view_ad", bool);
        }
        str = this.E;
        if (str != null) {
            hashMap.put("cognac_app_id", str);
        }
        str = this.F;
        if (str != null) {
            hashMap.put("cognac_build_id", str);
        }
        str = this.G;
        if (str != null) {
            hashMap.put("cognac_slot_id", str);
        }
        str = this.H;
        if (str != null) {
            hashMap.put("cognac_external_request_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    /* renamed from: b */
    public abex clone() {
        abex abex = (abex) super.clone();
        String str = this.a;
        if (str != null) {
            abex.a = str;
        }
        str = this.b;
        if (str != null) {
            abex.b = str;
        }
        Long l = this.c;
        if (l != null) {
            abex.c = l;
        }
        l = this.d;
        if (l != null) {
            abex.d = l;
        }
        str = this.e;
        if (str != null) {
            abex.e = str;
        }
        str = this.f;
        if (str != null) {
            abex.f = str;
        }
        str = this.g;
        if (str != null) {
            abex.g = str;
        }
        str = this.h;
        if (str != null) {
            abex.h = str;
        }
        str = this.i;
        if (str != null) {
            abex.i = str;
        }
        str = this.j;
        if (str != null) {
            abex.j = str;
        }
        abfn abfn = this.k;
        if (abfn != null) {
            abex.k = abfn;
        }
        zyv zyv = this.l;
        if (zyv != null) {
            abex.l = zyv;
        }
        aajv aajv = this.m;
        if (aajv != null) {
            abex.m = aajv;
        }
        Boolean bool = this.n;
        if (bool != null) {
            abex.n = bool;
        }
        bool = this.o;
        if (bool != null) {
            abex.o = bool;
        }
        bool = this.p;
        if (bool != null) {
            abex.p = bool;
        }
        bool = this.q;
        if (bool != null) {
            abex.q = bool;
        }
        bool = this.r;
        if (bool != null) {
            abex.r = bool;
        }
        Double d = this.s;
        if (d != null) {
            abex.s = d;
        }
        bool = this.t;
        if (bool != null) {
            abex.t = bool;
        }
        bool = this.u;
        if (bool != null) {
            abex.u = bool;
        }
        zyy zyy = this.v;
        if (zyy != null) {
            abex.a(zyy);
        }
        str = this.w;
        if (str != null) {
            abex.c(str);
        }
        l = this.x;
        if (l != null) {
            abex.i(l);
        }
        l = this.y;
        if (l != null) {
            abex.j(l);
        }
        l = this.z;
        if (l != null) {
            abex.z = l;
        }
        l = this.A;
        if (l != null) {
            abex.A = l;
        }
        l = this.B;
        if (l != null) {
            abex.B = l;
        }
        aaow aaow = this.C;
        if (aaow != null) {
            abex.C = aaow;
        }
        bool = this.D;
        if (bool != null) {
            abex.D = bool;
        }
        str = this.E;
        if (str != null) {
            abex.E = str;
        }
        str = this.F;
        if (str != null) {
            abex.F = str;
        }
        str = this.G;
        if (str != null) {
            abex.G = str;
        }
        str = this.H;
        if (str != null) {
            abex.H = str;
        }
        return abex;
    }

    public void c(String str) {
        this.w = str;
    }

    public final void d(Boolean bool) {
        this.p = bool;
    }

    public final void d(String str) {
        this.a = str;
    }

    public final void e(Boolean bool) {
        this.q = bool;
    }

    public final void e(Double d) {
        this.s = d;
    }

    public final void e(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abex) obj).asDictionary());
    }

    public final void f(Boolean bool) {
        this.r = bool;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final void g(String str) {
        this.g = str;
    }

    public String getEventName() {
        return "STORY_AD_VIEW";
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

    public final void h(String str) {
        this.h = str;
    }

    public int hashCode() {
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
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abfn abfn = this.k;
        hashCode = (hashCode + (abfn != null ? abfn.hashCode() : 0)) * 31;
        zyv zyv = this.l;
        hashCode = (hashCode + (zyv != null ? zyv.hashCode() : 0)) * 31;
        aajv aajv = this.m;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        Boolean bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Double d = this.s;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.t;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        zyy zyy = this.v;
        hashCode = (hashCode + (zyy != null ? zyy.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.y;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.B;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aaow aaow = this.C;
        hashCode = (hashCode + (aaow != null ? aaow.hashCode() : 0)) * 31;
        bool = this.D;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.E;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.G;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.H;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public void i(Long l) {
        this.x = l;
    }

    public final void i(String str) {
        this.j = str;
    }

    public void j(Long l) {
        this.y = l;
    }

    public final void j(String str) {
        this.E = str;
    }

    public final void k(Long l) {
        this.c = l;
    }

    public final void k(String str) {
        this.F = str;
    }

    public final void l(Long l) {
        this.d = l;
    }

    public final void l(String str) {
        this.G = str;
    }

    public final void m(String str) {
        this.H = str;
    }
}
