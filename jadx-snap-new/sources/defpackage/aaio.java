package defpackage;

import com.brightcove.player.event.EventType;
import com.looksery.sdk.ProfilingSessionReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aaio */
public final class aaio extends abhw {
    private String A;
    private String B;
    private String C;
    private aamk D;
    private aahj E;
    private String F;
    private String G;
    private Long a;
    private Long b;
    private Boolean c;
    private String d;
    private aame e;
    private Boolean f;
    private abbd g;
    private String h;
    private Double i;
    private Boolean j;
    private aasc k;
    private Boolean l;
    private Boolean m;
    private Double n;
    private String o;
    private aamf p;
    private aalw q;
    private String r;
    private String s;
    private String t;
    private String u;
    private Double v;
    private Double w;
    private Long x;
    private String y;
    private String z;

    private aaio a() {
        aaio aaio = (aaio) super.clone();
        Long l = this.a;
        if (l != null) {
            aaio.a = l;
        }
        l = this.b;
        if (l != null) {
            aaio.b = l;
        }
        Boolean bool = this.c;
        if (bool != null) {
            aaio.c = bool;
        }
        String str = this.d;
        if (str != null) {
            aaio.d = str;
        }
        aame aame = this.e;
        if (aame != null) {
            aaio.e = aame;
        }
        bool = this.f;
        if (bool != null) {
            aaio.f = bool;
        }
        abbd abbd = this.g;
        if (abbd != null) {
            aaio.g = abbd;
        }
        str = this.h;
        if (str != null) {
            aaio.h = str;
        }
        Double d = this.i;
        if (d != null) {
            aaio.i = d;
        }
        bool = this.j;
        if (bool != null) {
            aaio.j = bool;
        }
        aasc aasc = this.k;
        if (aasc != null) {
            aaio.k = aasc;
        }
        bool = this.l;
        if (bool != null) {
            aaio.l = bool;
        }
        bool = this.m;
        if (bool != null) {
            aaio.m = bool;
        }
        d = this.n;
        if (d != null) {
            aaio.n = d;
        }
        str = this.o;
        if (str != null) {
            aaio.o = str;
        }
        aamf aamf = this.p;
        if (aamf != null) {
            aaio.p = aamf;
        }
        aalw aalw = this.q;
        if (aalw != null) {
            aaio.q = aalw;
        }
        str = this.r;
        if (str != null) {
            aaio.r = str;
        }
        str = this.s;
        if (str != null) {
            aaio.s = str;
        }
        str = this.t;
        if (str != null) {
            aaio.t = str;
        }
        str = this.u;
        if (str != null) {
            aaio.u = str;
        }
        d = this.v;
        if (d != null) {
            aaio.v = d;
        }
        d = this.w;
        if (d != null) {
            aaio.w = d;
        }
        l = this.x;
        if (l != null) {
            aaio.x = l;
        }
        str = this.y;
        if (str != null) {
            aaio.y = str;
        }
        str = this.z;
        if (str != null) {
            aaio.z = str;
        }
        str = this.A;
        if (str != null) {
            aaio.A = str;
        }
        str = this.B;
        if (str != null) {
            aaio.B = str;
        }
        str = this.C;
        if (str != null) {
            aaio.C = str;
        }
        aamk aamk = this.D;
        if (aamk != null) {
            aaio.D = aamk;
        }
        aahj aahj = this.E;
        if (aahj != null) {
            aaio.E = aahj;
        }
        str = this.F;
        if (str != null) {
            aaio.F = str;
        }
        str = this.G;
        if (str != null) {
            aaio.G = str;
        }
        return aaio;
    }

    public final void a(aasc aasc) {
        this.k = aasc;
    }

    public final void a(abbd abbd) {
        this.g = abbd;
    }

    public final void a(Boolean bool) {
        this.j = bool;
    }

    public final void a(Double d) {
        this.i = d;
    }

    public final void a(Long l) {
        this.x = l;
    }

    public final void a(String str) {
        this.o = str;
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
        str = this.h;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        Double d = this.i;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        bool = this.j;
        if (bool != null) {
            hashMap.put("snap_time_is_loop", bool);
        }
        aasc aasc = this.k;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("full_view", bool);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("initial_view", bool);
        }
        d = this.n;
        if (d != null) {
            hashMap.put("view_time_sec", d);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("snap_id", str);
        }
        aamf aamf = this.p;
        if (aamf != null) {
            hashMap.put("filter_visual", aamf.toString());
        }
        aalw aalw = this.q;
        if (aalw != null) {
            hashMap.put("filter_info", aalw.toString());
        }
        str = this.r;
        if (str != null) {
            hashMap.put("filter_geofence", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("filter_sponsor", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        d = this.v;
        if (d != null) {
            hashMap.put("ack_time_sec", d);
        }
        d = this.w;
        if (d != null) {
            hashMap.put("replay_amount", d);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("cell_view_position", l);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        str = this.z;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        str = this.A;
        if (str != null) {
            hashMap.put("ranking_model_id", str);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("ranking_id", str);
        }
        str = this.C;
        if (str != null) {
            hashMap.put("server_ranking_id", str);
        }
        aamk aamk = this.D;
        if (aamk != null) {
            hashMap.put("friendship_status", aamk.toString());
        }
        aahj aahj = this.E;
        if (aahj != null) {
            hashMap.put("correspondent_type", aahj.toString());
        }
        str = this.F;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        str = this.G;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Double d) {
        this.n = d;
    }

    public final void b(String str) {
        this.y = str;
    }

    public final void c(String str) {
        this.z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaio) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_REPLAY_VIEW";
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
        str = this.h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aasc aasc = this.k;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.n;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamf aamf = this.p;
        hashCode = (hashCode + (aamf != null ? aamf.hashCode() : 0)) * 31;
        aalw aalw = this.q;
        hashCode = (hashCode + (aalw != null ? aalw.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        d = this.v;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.w;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.y;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.z;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.A;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.C;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aamk aamk = this.D;
        hashCode = (hashCode + (aamk != null ? aamk.hashCode() : 0)) * 31;
        aahj aahj = this.E;
        hashCode = (hashCode + (aahj != null ? aahj.hashCode() : 0)) * 31;
        str = this.F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.G;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
