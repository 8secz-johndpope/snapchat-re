package defpackage;

import com.brightcove.player.event.EventType;
import com.looksery.sdk.ProfilingSessionReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aain */
public final class aain extends abhw {
    private Long a;
    private Long b;
    private Boolean c;
    private String d;
    private aame e;
    private Boolean f;
    private abbd g;
    private Double h;
    private Boolean i;
    private aasc j;
    private String k;
    private aamf l;
    private aalw m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;

    private aain a() {
        aain aain = (aain) super.clone();
        Long l = this.a;
        if (l != null) {
            aain.a = l;
        }
        l = this.b;
        if (l != null) {
            aain.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aain.c = bool;
        }
        String str = this.d;
        if (str != null) {
            aain.d = str;
        }
        aame aame = this.e;
        if (aame != null) {
            aain.e = aame;
        }
        bool = this.f;
        if (bool != null) {
            aain.f = bool;
        }
        abbd abbd = this.g;
        if (abbd != null) {
            aain.g = abbd;
        }
        Double d = this.h;
        if (d != null) {
            aain.h = d;
        }
        bool = this.i;
        if (bool != null) {
            aain.i = bool;
        }
        aasc aasc = this.j;
        if (aasc != null) {
            aain.j = aasc;
        }
        str = this.k;
        if (str != null) {
            aain.k = str;
        }
        aamf aamf = this.l;
        if (aamf != null) {
            aain.l = aamf;
        }
        aalw aalw = this.m;
        if (aalw != null) {
            aain.m = aalw;
        }
        str = this.n;
        if (str != null) {
            aain.n = str;
        }
        str = this.o;
        if (str != null) {
            aain.o = str;
        }
        str = this.p;
        if (str != null) {
            aain.p = str;
        }
        str = this.q;
        if (str != null) {
            aain.q = str;
        }
        str = this.r;
        if (str != null) {
            aain.r = str;
        }
        str = this.s;
        if (str != null) {
            aain.s = str;
        }
        str = this.t;
        if (str != null) {
            aain.t = str;
        }
        str = this.u;
        if (str != null) {
            aain.u = str;
        }
        return aain;
    }

    public final void a(aasc aasc) {
        this.j = aasc;
    }

    public final void a(Boolean bool) {
        this.i = bool;
    }

    public final void a(Double d) {
        this.h = d;
    }

    public final void a(String str) {
        this.k = str;
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
        Double d = this.h;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("snap_time_is_loop", bool);
        }
        aasc aasc = this.j;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        str = this.k;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        aamf aamf = this.l;
        if (aamf != null) {
            hashMap.put("filter_visual", aamf.toString());
        }
        aalw aalw = this.m;
        if (aalw != null) {
            hashMap.put("filter_info", aalw.toString());
        }
        str = this.n;
        if (str != null) {
            hashMap.put("filter_geofence", str);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("filter_sponsor", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aain) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_RECEIVE";
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
        Double d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.j;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamf aamf = this.l;
        hashCode = (hashCode + (aamf != null ? aamf.hashCode() : 0)) * 31;
        aalw aalw = this.m;
        hashCode = (hashCode + (aalw != null ? aalw.hashCode() : 0)) * 31;
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
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
