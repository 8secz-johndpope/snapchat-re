package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aank */
public final class aank extends abhw {
    private String a;
    private String b;
    private String c;
    private String d;
    private aasc e;
    private abbd f;
    private aajv g;
    private Double h;
    private String i;
    private Boolean j;
    private Double k;
    private Double l;
    private Double m;
    private Double n;
    private String o;
    private Boolean p;
    private Boolean q;
    private Long r;
    private String s;
    private String t;
    private aapc u;

    private aank b() {
        aank aank = (aank) super.clone();
        String str = this.a;
        if (str != null) {
            aank.a = str;
        }
        str = this.b;
        if (str != null) {
            aank.b = str;
        }
        str = this.c;
        if (str != null) {
            aank.c = str;
        }
        str = this.d;
        if (str != null) {
            aank.d = str;
        }
        aasc aasc = this.e;
        if (aasc != null) {
            aank.e = aasc;
        }
        abbd abbd = this.f;
        if (abbd != null) {
            aank.f = abbd;
        }
        aajv aajv = this.g;
        if (aajv != null) {
            aank.g = aajv;
        }
        Double d = this.h;
        if (d != null) {
            aank.h = d;
        }
        str = this.i;
        if (str != null) {
            aank.i = str;
        }
        Boolean bool = this.j;
        if (bool != null) {
            aank.j = bool;
        }
        d = this.k;
        if (d != null) {
            aank.k = d;
        }
        d = this.l;
        if (d != null) {
            aank.l = d;
        }
        d = this.m;
        if (d != null) {
            aank.m = d;
        }
        d = this.n;
        if (d != null) {
            aank.n = d;
        }
        str = this.o;
        if (str != null) {
            aank.o = str;
        }
        bool = this.p;
        if (bool != null) {
            aank.p = bool;
        }
        bool = this.q;
        if (bool != null) {
            aank.q = bool;
        }
        Long l = this.r;
        if (l != null) {
            aank.r = l;
        }
        str = this.s;
        if (str != null) {
            aank.s = str;
        }
        str = this.t;
        if (str != null) {
            aank.t = str;
        }
        aapc aapc = this.u;
        if (aapc != null) {
            aank.u = aapc;
        }
        return aank;
    }

    public final aasc a() {
        return this.e;
    }

    public final void a(aapc aapc) {
        this.u = aapc;
    }

    public final void a(aasc aasc) {
        this.e = aasc;
    }

    public final void a(abbd abbd) {
        this.f = abbd;
    }

    public final void a(Double d) {
        this.h = d;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_geofilter_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("filter_geolens_id", str);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("lens_session_id", str);
        }
        aasc aasc = this.e;
        if (aasc != null) {
            hashMap.put("attachment_type", aasc.toString());
        }
        abbd abbd = this.f;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        aajv aajv = this.g;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        Double d = this.h;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        str = this.i;
        if (str != null) {
            hashMap.put("video_partner_id", str);
        }
        Boolean bool = this.j;
        if (bool != null) {
            hashMap.put("playback_audio", bool);
        }
        d = this.k;
        if (d != null) {
            hashMap.put("playback_volume", d);
        }
        d = this.l;
        if (d != null) {
            hashMap.put("aspect_ratio", d);
        }
        d = this.m;
        if (d != null) {
            hashMap.put("landscape_time_sec", d);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("duration_sec", d);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("attachment_url", str);
        }
        bool = this.p;
        if (bool != null) {
            hashMap.put("page_is_loaded_on_entry", bool);
        }
        bool = this.q;
        if (bool != null) {
            hashMap.put("page_is_loaded_on_exit", bool);
        }
        Long l = this.r;
        if (l != null) {
            hashMap.put("page_load_error_count", l);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("ios_app_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("android_app_url", str);
        }
        aapc aapc = this.u;
        if (aapc != null) {
            hashMap.put("deep_link_action", aapc.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aank) obj).asDictionary());
    }

    public final String getEventName() {
        return "GEOFILTER_ATTACHMENT_VIEW";
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
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aasc aasc = this.e;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        abbd abbd = this.f;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        aajv aajv = this.g;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.k;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.l;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.m;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aapc aapc = this.u;
        if (aapc != null) {
            i = aapc.hashCode();
        }
        return hashCode + i;
    }
}
