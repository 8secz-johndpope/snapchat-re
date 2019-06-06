package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaga */
public abstract class aaga extends abhw {
    public String A;
    public String B;
    public String C;
    public Long D;
    public String E;
    private aagl F;
    private aafo G;
    private aafo H;
    private String I;
    private abal J;
    private Boolean K;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public abbd l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.g;
        if (str != null) {
            hashMap.put("commerce_session_id", str);
        }
        str = this.h;
        if (str != null) {
            hashMap.put("page_id", str);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("display_id", str);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("store_id", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("product_id", str);
        }
        str = this.a;
        if (str != null) {
            hashMap.put("cart_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("json_metadata", str);
        }
        abbd abbd = this.l;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.m;
        if (str != null) {
            hashMap.put("discover_edition_id", str);
        }
        str = this.n;
        if (str != null) {
            hashMap.put("source_id", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("external_session_id", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("discover_edition_session_id", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("commerce_product_type", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("commerce_origin_type", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("context_snap_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("context_snap_type", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("context_attachment_type", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("context_media_type", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("context_filter_geolens_id", str);
        }
        str = this.v;
        if (str != null) {
            hashMap.put("context_session_id", str);
        }
        str = this.w;
        if (str != null) {
            hashMap.put("discover_publisher_id", str);
        }
        str = this.x;
        if (str != null) {
            hashMap.put("discover_snap_id", str);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("scannable_id", str);
        }
        str = this.z;
        if (str != null) {
            hashMap.put("scannable_data", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("scan_session_id", str);
        }
        str = this.A;
        if (str != null) {
            hashMap.put("lens_c_t_a_lens_id", str);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        str = this.C;
        if (str != null) {
            hashMap.put("lens_camera_source_type", str);
        }
        Long l = this.D;
        if (l != null) {
            hashMap.put("lens_position", l);
        }
        str = this.E;
        if (str != null) {
            hashMap.put("lens_camera_type", str);
        }
        aagl aagl = this.F;
        if (aagl != null) {
            hashMap.put("product_item_type", aagl.toString());
        }
        aafo aafo = this.G;
        if (aafo != null) {
            hashMap.put("primary_avatar_type", aafo.toString());
        }
        aafo = this.H;
        if (aafo != null) {
            hashMap.put("secondary_avatar_type", aafo.toString());
        }
        str = this.I;
        if (str != null) {
            hashMap.put("comic_id", str);
        }
        abal abal = this.J;
        if (abal != null) {
            hashMap.put("attachment_type", abal.toString());
        }
        Boolean bool = this.K;
        if (bool != null) {
            hashMap.put("has_input_search_terms", bool);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    /* renamed from: b */
    public aaga clone() {
        aaga aaga = (aaga) super.clone();
        String str = this.g;
        if (str != null) {
            aaga.g = str;
        }
        str = this.h;
        if (str != null) {
            aaga.h = str;
        }
        str = this.i;
        if (str != null) {
            aaga.i = str;
        }
        str = this.j;
        if (str != null) {
            aaga.j = str;
        }
        str = this.k;
        if (str != null) {
            aaga.k = str;
        }
        str = this.a;
        if (str != null) {
            aaga.a = str;
        }
        str = this.b;
        if (str != null) {
            aaga.b = str;
        }
        abbd abbd = this.l;
        if (abbd != null) {
            aaga.l = abbd;
        }
        str = this.m;
        if (str != null) {
            aaga.m = str;
        }
        str = this.n;
        if (str != null) {
            aaga.n = str;
        }
        str = this.o;
        if (str != null) {
            aaga.o = str;
        }
        str = this.p;
        if (str != null) {
            aaga.p = str;
        }
        str = this.q;
        if (str != null) {
            aaga.q = str;
        }
        str = this.r;
        if (str != null) {
            aaga.r = str;
        }
        str = this.s;
        if (str != null) {
            aaga.s = str;
        }
        str = this.c;
        if (str != null) {
            aaga.c = str;
        }
        str = this.t;
        if (str != null) {
            aaga.t = str;
        }
        str = this.d;
        if (str != null) {
            aaga.d = str;
        }
        str = this.u;
        if (str != null) {
            aaga.u = str;
        }
        str = this.e;
        if (str != null) {
            aaga.e = str;
        }
        str = this.v;
        if (str != null) {
            aaga.v = str;
        }
        str = this.w;
        if (str != null) {
            aaga.w = str;
        }
        str = this.x;
        if (str != null) {
            aaga.x = str;
        }
        str = this.y;
        if (str != null) {
            aaga.y = str;
        }
        str = this.z;
        if (str != null) {
            aaga.z = str;
        }
        str = this.f;
        if (str != null) {
            aaga.f = str;
        }
        str = this.A;
        if (str != null) {
            aaga.A = str;
        }
        str = this.B;
        if (str != null) {
            aaga.B = str;
        }
        str = this.C;
        if (str != null) {
            aaga.C = str;
        }
        Long l = this.D;
        if (l != null) {
            aaga.D = l;
        }
        str = this.E;
        if (str != null) {
            aaga.E = str;
        }
        aagl aagl = this.F;
        if (aagl != null) {
            aaga.F = aagl;
        }
        aafo aafo = this.G;
        if (aafo != null) {
            aaga.G = aafo;
        }
        aafo = this.H;
        if (aafo != null) {
            aaga.H = aafo;
        }
        str = this.I;
        if (str != null) {
            aaga.I = str;
        }
        abal abal = this.J;
        if (abal != null) {
            aaga.J = abal;
        }
        Boolean bool = this.K;
        if (bool != null) {
            aaga.K = bool;
        }
        return aaga;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaga) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.g;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.a;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abbd abbd = this.l;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.v;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.A;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.C;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.D;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.E;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aagl aagl = this.F;
        hashCode = (hashCode + (aagl != null ? aagl.hashCode() : 0)) * 31;
        aafo aafo = this.G;
        hashCode = (hashCode + (aafo != null ? aafo.hashCode() : 0)) * 31;
        aafo = this.H;
        hashCode = (hashCode + (aafo != null ? aafo.hashCode() : 0)) * 31;
        str = this.I;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abal abal = this.J;
        hashCode = (hashCode + (abal != null ? abal.hashCode() : 0)) * 31;
        Boolean bool = this.K;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
