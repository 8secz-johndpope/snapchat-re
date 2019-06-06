package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aatn */
public final class aatn extends abhw {
    private aatm a;
    private aahb b;
    private abfi c;
    private aauk d;
    private aasc e;
    private aaum f;
    private aajv g;
    private Boolean h;
    private Boolean i;
    private Long j;
    private Long k;
    private Long l;
    private Long m;
    private Long n;
    private Long o;
    private Long p;
    private aajr q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private Boolean w;
    private String x;
    private String y;

    private aatn b() {
        aatn aatn = (aatn) super.clone();
        aatm aatm = this.a;
        if (aatm != null) {
            aatn.a = aatm;
        }
        aahb aahb = this.b;
        if (aahb != null) {
            aatn.b = aahb;
        }
        abfi abfi = this.c;
        if (abfi != null) {
            aatn.c = abfi;
        }
        aauk aauk = this.d;
        if (aauk != null) {
            aatn.d = aauk;
        }
        aasc aasc = this.e;
        if (aasc != null) {
            aatn.e = aasc;
        }
        aaum aaum = this.f;
        if (aaum != null) {
            aatn.f = aaum;
        }
        aajv aajv = this.g;
        if (aajv != null) {
            aatn.g = aajv;
        }
        Boolean bool = this.h;
        if (bool != null) {
            aatn.h = bool;
        }
        bool = this.i;
        if (bool != null) {
            aatn.i = bool;
        }
        Long l = this.j;
        if (l != null) {
            aatn.j = l;
        }
        l = this.k;
        if (l != null) {
            aatn.k = l;
        }
        l = this.l;
        if (l != null) {
            aatn.l = l;
        }
        l = this.m;
        if (l != null) {
            aatn.m = l;
        }
        l = this.n;
        if (l != null) {
            aatn.n = l;
        }
        l = this.o;
        if (l != null) {
            aatn.o = l;
        }
        l = this.p;
        if (l != null) {
            aatn.p = l;
        }
        aajr aajr = this.q;
        if (aajr != null) {
            aatn.q = aajr;
        }
        String str = this.r;
        if (str != null) {
            aatn.r = str;
        }
        str = this.s;
        if (str != null) {
            aatn.s = str;
        }
        str = this.t;
        if (str != null) {
            aatn.t = str;
        }
        str = this.u;
        if (str != null) {
            aatn.u = str;
        }
        str = this.v;
        if (str != null) {
            aatn.v = str;
        }
        bool = this.w;
        if (bool != null) {
            aatn.w = bool;
        }
        str = this.x;
        if (str != null) {
            aatn.x = str;
        }
        str = this.y;
        if (str != null) {
            aatn.y = str;
        }
        return aatn;
    }

    public final void a() {
        this.x = null;
    }

    public final void a(aahb aahb) {
        this.b = aahb;
    }

    public final void a(aajr aajr) {
        this.q = aajr;
    }

    public final void a(aajv aajv) {
        this.g = aajv;
    }

    public final void a(aasc aasc) {
        this.e = aasc;
    }

    public final void a(aatm aatm) {
        this.a = aatm;
    }

    public final void a(aauk aauk) {
        this.d = aauk;
    }

    public final void a(aaum aaum) {
        this.f = aaum;
    }

    public final void a(Boolean bool) {
        this.h = bool;
    }

    public final void a(Long l) {
        this.j = l;
    }

    public final void a(String str) {
        this.r = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aatm aatm = this.a;
        if (aatm != null) {
            hashMap.put("opera_version", aatm.toString());
        }
        aahb aahb = this.b;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        abfi abfi = this.c;
        if (abfi != null) {
            hashMap.put("content_type", abfi.toString());
        }
        aauk aauk = this.d;
        if (aauk != null) {
            hashMap.put("playback_item_type", aauk.toString());
        }
        aasc aasc = this.e;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        aaum aaum = this.f;
        if (aaum != null) {
            hashMap.put("playback_mode", aaum.toString());
        }
        aajv aajv = this.g;
        if (aajv != null) {
            hashMap.put("exit_event", aajv.toString());
        }
        Boolean bool = this.h;
        if (bool != null) {
            hashMap.put("stalled_on_start", bool);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("stalled_on_exit", bool);
        }
        Long l = this.j;
        if (l != null) {
            hashMap.put("stall_duration_on_start_ms", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("mid_playback_stall_count", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("mid_playback_stall_duration_total_ms", l);
        }
        l = this.m;
        if (l != null) {
            hashMap.put("media_duration_ms", l);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("view_time_ms", l);
        }
        l = this.o;
        if (l != null) {
            hashMap.put("snap_view_index", l);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("dropped_frame_count", l);
        }
        aajr aajr = this.q;
        if (aajr != null) {
            hashMap.put("entry_event", aajr.toString());
        }
        String str = this.r;
        if (str != null) {
            hashMap.put("media_id", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("opera_session_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("media_group_id", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("media_playback_session_id", str);
        }
        str = this.v;
        if (str != null) {
            hashMap.put("stall_info", str);
        }
        bool = this.w;
        if (bool != null) {
            hashMap.put("longform_video", bool);
        }
        str = this.x;
        if (str != null) {
            hashMap.put("media_encoding_variant", str);
        }
        str = this.y;
        if (str != null) {
            hashMap.put("media_encoding", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.i = bool;
    }

    public final void b(Long l) {
        this.k = l;
    }

    public final void b(String str) {
        this.s = str;
    }

    public final void c(Boolean bool) {
        this.w = bool;
    }

    public final void c(Long l) {
        this.l = l;
    }

    public final void c(String str) {
        this.t = str;
    }

    public final void d(Long l) {
        this.m = l;
    }

    public final void d(String str) {
        this.u = str;
    }

    public final void e(Long l) {
        this.n = l;
    }

    public final void e(String str) {
        this.v = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aatn) obj).asDictionary());
    }

    public final void f(Long l) {
        this.o = l;
    }

    public final void g(Long l) {
        this.p = l;
    }

    public final String getEventName() {
        return "OPERA_SNAP_PLAYBACK";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        aatm aatm = this.a;
        int i = 0;
        hashCode = (hashCode + (aatm != null ? aatm.hashCode() : 0)) * 31;
        aahb aahb = this.b;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        abfi abfi = this.c;
        hashCode = (hashCode + (abfi != null ? abfi.hashCode() : 0)) * 31;
        aauk aauk = this.d;
        hashCode = (hashCode + (aauk != null ? aauk.hashCode() : 0)) * 31;
        aasc aasc = this.e;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        aaum aaum = this.f;
        hashCode = (hashCode + (aaum != null ? aaum.hashCode() : 0)) * 31;
        aajv aajv = this.g;
        hashCode = (hashCode + (aajv != null ? aajv.hashCode() : 0)) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aajr aajr = this.q;
        hashCode = (hashCode + (aajr != null ? aajr.hashCode() : 0)) * 31;
        String str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.v;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.w;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.x;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.y;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
