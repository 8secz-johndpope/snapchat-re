package defpackage;

import com.brightcove.player.media.CuePointFields;
import com.snap.core.db.record.UploadedMediaModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abft */
public final class abft extends abhw {
    private String a;
    private aahb b;
    private Long c;
    private aasc d;
    private Long e;
    private Double f;
    private Long g;
    private aagx h;
    private Double i;
    private Double j;
    private Long k;
    private Long l;
    private aajl m;
    private Long n;
    private String o;
    private Long p;
    private Long q;
    private String r;
    private String s;
    private String t;
    private abfx u;
    private abfy v;
    private String w;
    private Long x;
    private Boolean y;
    private String z;

    private abft f() {
        abft abft = (abft) super.clone();
        String str = this.a;
        if (str != null) {
            abft.a = str;
        }
        aahb aahb = this.b;
        if (aahb != null) {
            abft.b = aahb;
        }
        Long l = this.c;
        if (l != null) {
            abft.c = l;
        }
        aasc aasc = this.d;
        if (aasc != null) {
            abft.d = aasc;
        }
        l = this.e;
        if (l != null) {
            abft.e = l;
        }
        Double d = this.f;
        if (d != null) {
            abft.f = d;
        }
        l = this.g;
        if (l != null) {
            abft.g = l;
        }
        aagx aagx = this.h;
        if (aagx != null) {
            abft.h = aagx;
        }
        d = this.i;
        if (d != null) {
            abft.i = d;
        }
        d = this.j;
        if (d != null) {
            abft.j = d;
        }
        l = this.k;
        if (l != null) {
            abft.k = l;
        }
        l = this.l;
        if (l != null) {
            abft.l = l;
        }
        aajl aajl = this.m;
        if (aajl != null) {
            abft.m = aajl;
        }
        l = this.n;
        if (l != null) {
            abft.n = l;
        }
        str = this.o;
        if (str != null) {
            abft.o = str;
        }
        l = this.p;
        if (l != null) {
            abft.p = l;
        }
        l = this.q;
        if (l != null) {
            abft.q = l;
        }
        str = this.r;
        if (str != null) {
            abft.r = str;
        }
        str = this.s;
        if (str != null) {
            abft.setSessionId(str);
        }
        str = this.t;
        if (str != null) {
            abft.t = str;
        }
        abfx abfx = this.u;
        if (abfx != null) {
            abft.u = abfx;
        }
        abfy abfy = this.v;
        if (abfy != null) {
            abft.v = abfy;
        }
        str = this.w;
        if (str != null) {
            abft.w = str;
        }
        l = this.x;
        if (l != null) {
            abft.x = l;
        }
        Boolean bool = this.y;
        if (bool != null) {
            abft.y = bool;
        }
        str = this.z;
        if (str != null) {
            abft.z = str;
        }
        return abft;
    }

    public final void a() {
        this.h = null;
    }

    public final void a(aahb aahb) {
        this.b = aahb;
    }

    public final void a(aajl aajl) {
        this.m = aajl;
    }

    public final void a(aasc aasc) {
        this.d = aasc;
    }

    public final void a(abfx abfx) {
        this.u = abfx;
    }

    public final void a(abfy abfy) {
        this.v = abfy;
    }

    public final void a(Boolean bool) {
        this.y = bool;
    }

    public final void a(Double d) {
        this.f = d;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("story_snap_id", str);
        }
        aahb aahb = this.b;
        if (aahb != null) {
            hashMap.put("view_source", aahb.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("auto_advance_index", l);
        }
        aasc aasc = this.d;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        l = this.e;
        if (l != null) {
            hashMap.put("media_bytes_size", l);
        }
        Double d = this.f;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("start_num_bytes_downloaded", l);
        }
        aagx aagx = this.h;
        if (aagx != null) {
            hashMap.put("connection_class", aagx.toString());
        }
        d = this.i;
        if (d != null) {
            hashMap.put("bandwidth_mean", d);
        }
        d = this.j;
        if (d != null) {
            hashMap.put("bandwidth_median", d);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("bandwidth_sample_size", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        aajl aajl = this.m;
        if (aajl != null) {
            hashMap.put("item_load_state", aajl.toString());
        }
        l = this.n;
        if (l != null) {
            hashMap.put(CuePointFields.TIME, l);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("type", str);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("snap_index_pos", l);
        }
        l = this.q;
        if (l != null) {
            hashMap.put("snap_index_count", l);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("previous_action", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put(UploadedMediaModel.SESSION_ID, str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("geofence", str);
        }
        abfx abfx = this.u;
        if (abfx != null) {
            hashMap.put("story_type", abfx.toString());
        }
        abfy abfy = this.v;
        if (abfy != null) {
            hashMap.put("story_type_specific", abfy.toString());
        }
        str = this.w;
        if (str != null) {
            hashMap.put("poster_id", str);
        }
        l = this.x;
        if (l != null) {
            hashMap.put("story_session_id", l);
        }
        Boolean bool = this.y;
        if (bool != null) {
            hashMap.put("with_streaming_enabled", bool);
        }
        str = this.z;
        if (str != null) {
            hashMap.put("ghost_poster_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b() {
        this.i = null;
    }

    public final void b(Long l) {
        this.e = l;
    }

    public final void b(String str) {
        this.o = str;
    }

    public final void c() {
        this.j = null;
    }

    public final void c(Long l) {
        this.n = l;
    }

    public final void c(String str) {
        this.r = str;
    }

    public final void d() {
        this.k = null;
    }

    public final void d(Long l) {
        this.p = l;
    }

    public final void e() {
        this.l = null;
    }

    public final void e(Long l) {
        this.q = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abft) obj).asDictionary());
    }

    public final void f(Long l) {
        this.x = l;
    }

    public final String getEventName() {
        return "STORY_SNAP_WAIT_TIME";
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

    public final String getSessionId() {
        return this.s;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aahb aahb = this.b;
        hashCode = (hashCode + (aahb != null ? aahb.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aasc aasc = this.d;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aagx aagx = this.h;
        hashCode = (hashCode + (aagx != null ? aagx.hashCode() : 0)) * 31;
        d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.j;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aajl aajl = this.m;
        hashCode = (hashCode + (aajl != null ? aajl.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abfx abfx = this.u;
        hashCode = (hashCode + (abfx != null ? abfx.hashCode() : 0)) * 31;
        abfy abfy = this.v;
        hashCode = (hashCode + (abfy != null ? abfy.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.x;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.y;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.z;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final void setSessionId(String str) {
        this.s = str;
    }
}
