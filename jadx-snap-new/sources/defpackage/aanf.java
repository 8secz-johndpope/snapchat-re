package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanf */
public final class aanf extends aait {
    private Long A;
    private String B;
    private String a;
    private String b;
    private aapp c;
    private String d;
    private String e;
    private aauo f;
    private aanb g;
    private String h;
    private aamy i;
    private aatq j;
    private Boolean k;
    private aajs l;
    private Boolean m;
    private Boolean n;
    private String o;
    private Long p;
    private Long q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private aarr w;
    private Long x;
    private Long y;
    private Long z;

    private aanf d() {
        aanf aanf = (aanf) super.clone();
        String str = this.a;
        if (str != null) {
            aanf.a = str;
        }
        str = this.b;
        if (str != null) {
            aanf.b = str;
        }
        aapp aapp = this.c;
        if (aapp != null) {
            aanf.c = aapp;
        }
        str = this.d;
        if (str != null) {
            aanf.d = str;
        }
        str = this.e;
        if (str != null) {
            aanf.e = str;
        }
        aauo aauo = this.f;
        if (aauo != null) {
            aanf.f = aauo;
        }
        aanb aanb = this.g;
        if (aanb != null) {
            aanf.g = aanb;
        }
        str = this.h;
        if (str != null) {
            aanf.h = str;
        }
        aamy aamy = this.i;
        if (aamy != null) {
            aanf.i = aamy;
        }
        aatq aatq = this.j;
        if (aatq != null) {
            aanf.j = aatq;
        }
        Boolean bool = this.k;
        if (bool != null) {
            aanf.k = bool;
        }
        aajs aajs = this.l;
        if (aajs != null) {
            aanf.l = aajs;
        }
        bool = this.m;
        if (bool != null) {
            aanf.m = bool;
        }
        bool = this.n;
        if (bool != null) {
            aanf.n = bool;
        }
        str = this.o;
        if (str != null) {
            aanf.o = str;
        }
        Long l = this.p;
        if (l != null) {
            aanf.p = l;
        }
        l = this.q;
        if (l != null) {
            aanf.q = l;
        }
        str = this.r;
        if (str != null) {
            aanf.r = str;
        }
        str = this.s;
        if (str != null) {
            aanf.s = str;
        }
        str = this.t;
        if (str != null) {
            aanf.t = str;
        }
        str = this.u;
        if (str != null) {
            aanf.u = str;
        }
        str = this.v;
        if (str != null) {
            aanf.v = str;
        }
        aarr aarr = this.w;
        if (aarr != null) {
            aanf.w = aarr;
        }
        l = this.x;
        if (l != null) {
            aanf.x = l;
        }
        l = this.y;
        if (l != null) {
            aanf.y = l;
        }
        l = this.z;
        if (l != null) {
            aanf.z = l;
        }
        l = this.A;
        if (l != null) {
            aanf.A = l;
        }
        str = this.B;
        if (str != null) {
            aanf.B = str;
        }
        return aanf;
    }

    public final /* synthetic */ aait a() {
        return d();
    }

    public final void a(aapp aapp) {
        this.c = aapp;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        aapp aapp = this.c;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.e;
        if (str != null) {
            hashMap.put("story_session_id", str);
        }
        aauo aauo = this.f;
        if (aauo != null) {
            hashMap.put("player_version", aauo.toString());
        }
        aanb aanb = this.g;
        if (aanb != null) {
            hashMap.put("send_source", aanb.toString());
        }
        str = this.h;
        if (str != null) {
            hashMap.put("destinations", str);
        }
        aamy aamy = this.i;
        if (aamy != null) {
            hashMap.put("gallery_media_type", aamy.toString());
        }
        aatq aatq = this.j;
        if (aatq != null) {
            hashMap.put("orientation", aatq.toString());
        }
        Boolean bool = this.k;
        if (bool != null) {
            hashMap.put("smart_shared", bool);
        }
        aajs aajs = this.l;
        if (aajs != null) {
            hashMap.put("entry_type", aajs.toString());
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("meo", bool);
        }
        bool = this.n;
        if (bool != null) {
            hashMap.put("has_creative", bool);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("failure_reason", str);
        }
        Long l = this.p;
        if (l != null) {
            hashMap.put("retry_count", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("latency_ms", l);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("entry_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("external_id", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("gallery_collection_category", str);
        }
        str = this.v;
        if (str != null) {
            hashMap.put("specs_content_id", str);
        }
        aarr aarr = this.w;
        if (aarr != null) {
            hashMap.put("media_format", aarr.toString());
        }
        l = this.x;
        if (l != null) {
            hashMap.put("group_story_post_count", l);
        }
        l = this.y;
        if (l != null) {
            hashMap.put("official_story_post_count", l);
        }
        l = this.z;
        if (l != null) {
            hashMap.put("shared_story_post_count", l);
        }
        l = this.A;
        if (l != null) {
            hashMap.put("business_story_post_count", l);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("gallery_collection_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanf) obj).asDictionary());
    }

    public final String getEventName() {
        return "GALLERY_SNAP_SEND";
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
        aapp aapp = this.c;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aauo aauo = this.f;
        hashCode = (hashCode + (aauo != null ? aauo.hashCode() : 0)) * 31;
        aanb aanb = this.g;
        hashCode = (hashCode + (aanb != null ? aanb.hashCode() : 0)) * 31;
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamy aamy = this.i;
        hashCode = (hashCode + (aamy != null ? aamy.hashCode() : 0)) * 31;
        aatq aatq = this.j;
        hashCode = (hashCode + (aatq != null ? aatq.hashCode() : 0)) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aajs aajs = this.l;
        hashCode = (hashCode + (aajs != null ? aajs.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.v;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aarr aarr = this.w;
        hashCode = (hashCode + (aarr != null ? aarr.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.y;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.z;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.B;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final void o(String str) {
        this.v = str;
    }

    public final void s(Boolean bool) {
        this.k = bool;
    }
}
